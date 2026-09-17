package com.Calebe.log_analizer.repository;

import com.Calebe.log_analizer.AlertEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertEventRepository extends JpaRepository<AlertEvent, Long>{

}