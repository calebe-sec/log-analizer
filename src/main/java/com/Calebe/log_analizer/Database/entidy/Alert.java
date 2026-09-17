package com.Calebe.log_analizer;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;

//getter is a easier way
@Getter
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@Entity
@Table(name="alert")
public class Alert{

    //create the id to this class
    @Id
    @GeneratedValue
    private Long id;

    //get ID to Log Source;
    @ManyToOne
    @JoinColumn(name="rule_id")
    private DetectionRule ruleId;

    private LocalDateTime createdAt;
    
    private String status;
    private String description;

    //protect constructor for database;
    //but lombok makes it easier
    // protected Alert(){}

    public Alert(DetectionRule ruleId, String status, String description){
        this.ruleId = ruleId;
        this.status = status;
        this.description = description;
    }

}