package com.neusoft.mapper;

import java.util.List;

import com.neusoft.entity.User;
import org.apache.ibatis.annotations.Param;

public interface SearchUserMapper {
	
	//接口 与xml 关系
	//1.接口名与xml名相同
	//2.接口名与xml入参 类型一致
	//3.接口名与xml出参 类型一直（特殊 返回多个结果，集合中的泛型与返回值类型一致）
	//4.xml中的命名空间要指向  接口

	//查询全部
	public List<User> searchAllUser();
//	查询单个
	public User searchUserById(int id);
//	插入数据
	public void insertUser(User user);
//多个参数查询
	public void  selectUserIdAndUserName(@Param("id") int id, @Param("username") String username);

	void addUser1(User user);
}
