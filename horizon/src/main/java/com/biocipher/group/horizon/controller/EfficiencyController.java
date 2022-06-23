package com.biocipher.group.horizon.controller;
import com.biocipher.group.horizon.model.BaseResponse;
import com.biocipher.group.horizon.model.EfficiencyResponse;
import com.biocipher.group.horizon.model.sql.Efficiency;
import com.biocipher.group.horizon.service.EfficiencyService;
import com.biocipher.group.horizon.util.ApplicationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;;
import org.springframework.web.bind.annotation.*;


@RestController

@RequestMapping(value = "/secure",produces = MediaType.APPLICATION_JSON_VALUE)
public class EfficiencyController {

    final static Logger LOGGER = LoggerFactory.getLogger(EfficiencyController.class);

    @Autowired
    EfficiencyService efficiencySrvc;

    @RequestMapping(value = "/efficiency", method = RequestMethod.POST)
    public ResponseEntity<BaseResponse> saveEfficiency(@RequestBody Efficiency efficiencyReq){
        try {
         System.out.print("Request:::::::"+efficiencyReq.getCustomerId()+
                 " ..");
            return efficiencySrvc.saveEffi(efficiencyReq);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            throw new ApplicationException(e.getMessage());
        }
    }

    @RequestMapping(value="effGet/{id}", method = RequestMethod.GET)

    public ResponseEntity<EfficiencyResponse>  getEfficiencyData(@PathVariable("id") int id) {
        try {
            return efficiencySrvc.fetchEfficiencyByID(id);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            throw new ApplicationException(e.getMessage());
        }
    }


        @RequestMapping(value="/efficiencyGet", method = RequestMethod.GET)
                public ResponseEntity<EfficiencyResponse> getEfficiency(@RequestParam("id") int id) {
                try {
                        return efficiencySrvc.fetchEfficiency(id);
                }
                catch (Exception e){
                    LOGGER.error(e.getMessage());
                    throw new ApplicationException(e.getMessage());
        }

    }






}
