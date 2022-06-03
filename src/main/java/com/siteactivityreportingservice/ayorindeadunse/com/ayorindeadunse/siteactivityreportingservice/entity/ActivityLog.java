package com.siteactivityreportingservice.ayorindeadunse.com.ayorindeadunse.siteactivityreportingservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString

public class ActivityLog {
   private int activityValue;
   private String activityKey;
   private Date dateLogged;
   private Date dateModified;
}
