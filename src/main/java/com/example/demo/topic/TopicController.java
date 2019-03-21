package com.example.demo.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {


    // Singleton
    //
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("spring", "Spring Framework", "Spring Framework Description"),
                new Topic("java", "Core java", "Core Java Description"),
                new Topic("JavaScript", "JavaScript ", "JavaScript Description")

        );
    }


}
