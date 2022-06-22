package com.biocipher.group.horizon.model;

import com.biocipher.group.horizon.dto.EfficiencyDto;
import com.biocipher.group.horizon.model.sql.Efficiency;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

import java.util.List;
public class EfficiencyResponse  extends BaseResponse{

private List<EfficiencyDto> dataLst;

    public List<EfficiencyDto> getDataLst() {
        return dataLst;
    }

    public void setDataLst(List<EfficiencyDto> dataLst) {
        this.dataLst = dataLst;
    }
}
