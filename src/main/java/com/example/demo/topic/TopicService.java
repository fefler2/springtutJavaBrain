package com.example.demo.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
             new Topic("spring", "Spring Framework","Spring Framework Description"),
                new
    Topic("java","Core java","Core Java Description"),
                new
    Topic("JavaScript","JavaScript ","JavaScript Description"));


    public List<Topic> getAllTopics(){
        return topics;
    }

}
