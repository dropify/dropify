package me;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mohamed Elkhidir
 */
@RequestMapping("/app")
@RestController()
public class DataController {
    
    @RequestMapping(path="/story",method = RequestMethod.GET)
    public String addNewStory(){
        return "success";
    }
}
