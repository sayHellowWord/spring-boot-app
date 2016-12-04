package com.yd.web.mapper;

import com.yd.web.bean.LogStash;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by wubo on 2016/12/4.
 */
@Mapper
public interface LogStashMapper {


    @Select("SELECT " +
            " id as id,user_id as userId,vote_id as voteId,group_id as groupId ,create_time as createTime " +
            " FROM logstash WHERE id = #{id} ")
    LogStash findById(@Param("id") String id);

    @Insert("INSERT INTO logstash VALUES(#{id}, #{userId}, #{voteId}, #{groupId}, #{createTime})")
    int create(LogStash logStash);
}
