package com.biocipher.group.horizon.model;

import com.biocipher.group.horizon.dto.EfficiencyDto;
import com.biocipher.group.horizon.model.sql.Efficiency;
import lombok.Data;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

import java.util.List;
@Data
public class EfficiencyResponse  extends BaseResponse{
private  Efficiency efficiencyData;

}
