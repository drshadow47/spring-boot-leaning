package com.biocipher.group.horizon.service.impl;

import com.biocipher.group.horizon.dto.EfficiencyDto;
import com.biocipher.group.horizon.model.BaseResponse;
import com.biocipher.group.horizon.model.EfficiencyResponse;
import com.biocipher.group.horizon.model.sql.Efficiency;
import com.biocipher.group.horizon.repository.EfficiencyRepo;
import com.biocipher.group.horizon.service.EfficiencyService;
import com.biocipher.group.horizon.util.ApplicationException;
import com.biocipher.group.horizon.util.Constants;
import com.biocipher.group.horizon.util.RedisCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EfficiencySrvcimpl implements EfficiencyService {



    public static final Logger LOGGER = LoggerFactory.getLogger(EfficiencySrvcimpl.class);
    public static final String HASH_KEY = "Efficiency";
    @Autowired
    EfficiencyRepo efficiencyRepo;


    @Override
    public ResponseEntity<BaseResponse> saveEffi(Efficiency efficiency) {
        RedisCache redisCache = new RedisCache();
        BaseResponse res = new BaseResponse();
        HttpStatus httpStatus = HttpStatus.OK;
        try {
            Efficiency svEfficiency = new Efficiency();
            svEfficiency.setCustomerId(efficiency.getCustomerId());
            svEfficiency.setRoute(efficiency.getRoute());
            svEfficiency.setEff(efficiency.getEff());
            svEfficiency.setEffSts(efficiency.getEffSts());
            svEfficiency.setActive(efficiency.isActive());
            svEfficiency.setScope(efficiency.getScope());
            svEfficiency.setState(efficiency.getState());
            svEfficiency.setFromDt(efficiency.getFromDt());
            svEfficiency.setToDt(efficiency.getToDt());
            svEfficiency.setFromDsply(efficiency.getFromDsply());
            svEfficiency.setToDsply(efficiency.getToDsply());
            res.setMessage(Constants.SUCCESS_MSG);
            res.setResponseCode(Constants.SUCESS_CD);
            efficiencyRepo.save(svEfficiency);
            redisCache.setCache(HASH_KEY,svEfficiency);
            return ResponseEntity.status(httpStatus).body(res);
        }
        catch(Exception e){
            LOGGER.error(e.getMessage());
            throw new ApplicationException(e.getMessage());
        }
    }

    @Override
    public ResponseEntity<EfficiencyResponse> fetchEfficiencyByID(int id) {

        try{
            EfficiencyResponse res=new EfficiencyResponse();
            HttpStatus httpStatus =HttpStatus.OK;
            Optional<Efficiency> optional =efficiencyRepo.findById(id);


            if(optional.isPresent()) {
                res.setEfficiencyData(optional.get());
                res.setMessage(Constants.SUCCESS_MSG);
                res.setResponseCode(Constants.SUCESS_CD);
            }
                return ResponseEntity.status(httpStatus).body(res);
        }
        catch(Exception e){
            LOGGER.error(e.getMessage());
            throw new ApplicationException(e.getMessage());
        }

    }

    @Override
    public ResponseEntity<EfficiencyResponse> fetchEfficiency(int id) {
        RedisCache redisCache = new RedisCache();
        EfficiencyResponse res=new EfficiencyResponse();
        HttpStatus httpStatus =HttpStatus.OK;
        Optional<Efficiency> optional =efficiencyRepo.findById(id);
        redisCache.setCache(HASH_KEY,optional);
        System.out.print("Redis Return :: " +redisCache.getCache(HASH_KEY));
        if(optional.isPresent()) {
            res.setEfficiencyData(optional.get());
            res.setMessage(Constants.SUCCESS_MSG);
            res.setResponseCode(Constants.SUCESS_CD);
        }
        return ResponseEntity.status(httpStatus).body(res);
    }


}
