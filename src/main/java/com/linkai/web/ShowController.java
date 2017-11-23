package com.linkai.web;

import com.linkai.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by K Lin
 * on 2017/11/22.
 * at 17:50
 * description : offical_website
 */
@RestController
@RequestMapping("/show")
public class ShowController {

    @Autowired
    private ShowService showService;


    @RequestMapping(value = "/owner",method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String,String>> getOwner(){
        return showService.showOwner();
    }

}
