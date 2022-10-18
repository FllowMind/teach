package com.wjq.teach.mapper;

import com.wjq.teach.domain.Video;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface VideoMapper {

    @Select("select * from video where id = #{id};")
    Video findById(@Param("id")Integer id);

}
