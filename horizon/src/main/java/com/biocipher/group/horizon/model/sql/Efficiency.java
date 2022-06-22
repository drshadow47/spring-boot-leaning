package com.biocipher.group.horizon.model.sql;

import lombok.*;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.*;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Efficiency_tbl")
public class Efficiency{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private long customerId;
    private String route; //smpp /WEB
    private int eff;
    private String effSts; //SUBMITED
    private boolean active;
    private String scope; //Universal
    private String state; //Submission
    private long fromDt;
    private long toDt;
    private String fromDsply;
    private String toDsply;
}
