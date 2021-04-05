package com.bhupendra.karki.spring_data_mongo.repository;


import com.bhupendra.karki.spring_data_mongo.model.Release;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReleaseRepository extends MongoRepository<Release, String> {
}
