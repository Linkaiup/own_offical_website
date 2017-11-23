package com.linkai.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by K Lin
 * on 2017/11/23.
 * at 12:54
 * description : offical_website
 */
public interface ShowService {
    /**
     * 展示主页者信息
     * @return List<Map<String,String>> 带有主页者的所有信息
     */
    List<Map<String,String>> showOwner();

    /**
     *
     */

}
