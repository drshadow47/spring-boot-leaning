package com.biocipher.group.horizon.repository;

import com.biocipher.group.horizon.dto.EfficiencyDto;
import com.biocipher.group.horizon.model.sql.Efficiency;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EfficiencyRepo extends JpaRepository<Efficiency,Integer> {


}
