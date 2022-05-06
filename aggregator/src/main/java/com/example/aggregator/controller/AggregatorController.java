package com.example.aggregator.controller;


import com.example.aggregator.model.Entry;
import com.example.aggregator.service.AggregatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AggregatorController {

    private static final Logger logger = LoggerFactory.getLogger(AggregatorController.class.getName());

    private AggregatorService service;

    public AggregatorController(AggregatorService service) {
        this.service = service;
    }

    @GetMapping("/getDefinitionFor/{Word}")
    public Entry getDefinitionFor(@PathVariable String word){

        return service.getDefinitionFor(word);

    }

    @GetMapping("/getWordsThatContainSuccessiveLettersAndStartsWith/{chars}")
    public List<Entry> getWordsThatContainSuccessiveLettersAndStartsWith(@PathVariable String chars){

        return service.getWordsThatContainSuccessiveLettersAndStartsWith(chars);

    }

    //Project code being entered Aggregator Step 3

    @GetMapping("/getAllPalindromes")
    public List<Entry> getAllPalindromes(){

        return service.getAllPalindromes();

    }

}
