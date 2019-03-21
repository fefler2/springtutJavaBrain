package com.example.demo.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class TopicService {

     Arrays.asList(
             new Topic("spring", "Spring Framework", "Spring Framework Description"),
                new Topic("java", "Core java", "Core Java Description"),
                new Topic("JavaScript", "JavaScript ", "JavaScript Description")


}
