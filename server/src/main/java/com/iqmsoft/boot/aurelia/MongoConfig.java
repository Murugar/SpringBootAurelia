package com.iqmsoft.boot.aurelia;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@EnableMongoRepositories
@PropertySource("classpath:application.properties")
public class MongoConfig extends AbstractMongoConfiguration
{
    @Override
    protected String getDatabaseName() {
        return "sampleFilms";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient();
    }

    @Override
    protected String getMappingBasePackage() {
        return "com.iqmsoft.boot.aurelia";
    }

}