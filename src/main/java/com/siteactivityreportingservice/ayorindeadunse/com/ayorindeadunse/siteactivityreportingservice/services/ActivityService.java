package com.siteactivityreportingservice.ayorindeadunse.com.ayorindeadunse.siteactivityreportingservice.services;

import com.siteactivityreportingservice.ayorindeadunse.com.ayorindeadunse.Requests.PostActivityLog;

import java.util.Date;

public interface ActivityService {
String postActivityEvent(PostActivityLog postLogActivity);
Long getActivityEventTotal(Date from, Date to);
}
