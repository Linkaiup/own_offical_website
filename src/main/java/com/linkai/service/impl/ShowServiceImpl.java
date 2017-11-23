package com.linkai.service.impl;

import com.linkai.service.ShowService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by K Lin
 * on 2017/11/23.
 * at 13:01
 * description : offical_website
 */
@Service
public class ShowServiceImpl implements ShowService{
    @Override
    public List<Map<String,String>> showOwner(){
        List<Map<String,String>> OwnMessage = new ArrayList<>();
        Map<String,String> MessageMap = new HashMap<>();
        MessageMap.put("owner","lin");
        MessageMap.put("introduce","i am");
        MessageMap.put("phone","");
        OwnMessage.add(MessageMap);
        return OwnMessage;
    }
}
