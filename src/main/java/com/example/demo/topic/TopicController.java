package com.example.demo.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {


    // Singleton
    @Autowired // @Autowired oznacza ze to potrzebuje Dependency Injection
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    // {} - variable part
    @RequestMapping("topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }


    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics{id}")
    public void updateTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);


    }


}
