package com.iqmsoft.boot.aurelia.pictures;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "pictures")
public class Picture {

    @Id
    private String id;

    private String topic;

    private String userId;

    public String getId(){return id;}

    public String getTopic(){
        return topic;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
