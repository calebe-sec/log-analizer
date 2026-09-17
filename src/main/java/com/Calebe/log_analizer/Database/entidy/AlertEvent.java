package com.Calebe.log_analizer;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;

//getter is a easier way
@Getter
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@Entity
@Table(name="alert_event")
public class AlertEvent{

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name="log_event_id")
    private LogEvent logEvent;

    //protect constructor for database;
    //but lombok makes it easier
    //protected AlertEvent(){}

    public AlertEvent(LogEvent logEvent){
        this.logEventId = logEvent;
    }

}