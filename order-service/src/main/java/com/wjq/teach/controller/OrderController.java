package com.wjq.teach.controller;

import com.wjq.teach.domain.Video;
import com.wjq.teach.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/order")
@RestController
public class OrderController {

    @Autowired
    private VideoService videoService;

    @GetMapping("findVideoById")
    public Video findVideoById(@RequestParam("id") int id) {
        return videoService.findById(id);
    }

}
