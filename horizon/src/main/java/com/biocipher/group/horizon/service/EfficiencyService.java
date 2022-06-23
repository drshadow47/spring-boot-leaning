package com.biocipher.group.horizon.service;

import com.biocipher.group.horizon.model.BaseResponse;
import com.biocipher.group.horizon.model.EfficiencyResponse;
import com.biocipher.group.horizon.model.sql.Efficiency;
import org.springframework.http.ResponseEntity;


public interface EfficiencyService {
public ResponseEntity<BaseResponse> saveEffi(Efficiency efficiency);

    public ResponseEntity<EfficiencyResponse> fetchEfficiencyByID(int id);
    public ResponseEntity<EfficiencyResponse> fetchEfficiency(int id);
}
