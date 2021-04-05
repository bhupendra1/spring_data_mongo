package com.bhupendra.karki.spring_data_mongo.service;


import com.bhupendra.karki.spring_data_mongo.model.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void addNewApplicationWTemplate(Application application) {
        mongoTemplate.insert(application);
    }

    @Override
    public Application findByIdTemplate(String id){
        return mongoTemplate.findById(id, Application.class);
    }

    @Override
    public void deleteWTemplate(Application application){
        mongoTemplate.remove(application);
    }

    @Override
    public void updateApplicationWTemplate(Application application){
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is(application.getName()));
        Update update = new Update();
        update.set("name", "Trainer");
        mongoTemplate.updateFirst(query, update, Application.class);
    }
}
