package com.wulb.mapper;

import com.wulb.pojo.User;


public interface UserMapper {
	//通过id查询到user
	public User selectUserById(int uid);
	
	//增加user
	public int insertUser(User user);
	
	//删除user
	public int delUser(int uid);
	
	//通过user来修改user的姓名
	public int updateUser(User user);
}
