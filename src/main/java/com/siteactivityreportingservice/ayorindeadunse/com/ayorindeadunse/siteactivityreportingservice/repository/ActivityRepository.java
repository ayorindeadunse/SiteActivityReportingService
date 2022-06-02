package com.siteactivityreportingservice.ayorindeadunse.com.ayorindeadunse.siteactivityreportingservice.repository;

import com.siteactivityreportingservice.ayorindeadunse.com.ayorindeadunse.siteactivityreportingservice.entity.ActivityLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<ActivityLog, Long> {
}
