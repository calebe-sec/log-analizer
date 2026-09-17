package com.Calebe.log_analizer.repository;

import com.Calebe.log_analizer.LogEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogEventRepository extends JpaRepository<LogEvent, Long>{

}