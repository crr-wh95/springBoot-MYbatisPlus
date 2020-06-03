package com.crr.mapper;
import java.util.List;

import com.crr.pojo.User;
import org.apache.ibatis.annotations.Mapper;

//@Mapper标记该交接口是一个mybatis的mapper接口，可以被springBoot自动扫描到spring上下文中


@Mapper
public interface UserMapper {
    List<User> getAllUser();
}
