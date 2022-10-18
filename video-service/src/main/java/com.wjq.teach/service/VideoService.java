package com.wjq.teach.service;

import com.wjq.teach.domain.Video;
import com.wjq.teach.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoService {

    @Autowired
    private VideoMapper videoMapper;


    public Video findById(Integer id) {
        return videoMapper.findById(id);
    }
}
