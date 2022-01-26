package com.saurabh.hazelcast.poc.domain;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class ActiveUserSessionsEntity {
    private int id;
    private Date createdTime;
    private String jwtToken;
    private String expiryTime;
    private int userId;
}
