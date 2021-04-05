package com.bhupendra.karki.spring_data_mongo.service;

import com.bhupendra.karki.spring_data_mongo.model.Application;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

public interface ApplicationService {
    void addNewApplicationWTemplate(Application application);
    Application findByIdTemplate(String id);
    void deleteWTemplate(Application application);
    void updateApplicationWTemplate(Application application);
}


