package com.wjq.teach.service;

import com.wjq.teach.domain.Video;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "video-service",path = "api/v1/video")
public interface VideoService {

    @GetMapping("findById")
    Video findById(@RequestParam("id") int id);
}
