package com.neusoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neusoft.entity.SCardInfo;

public interface SCardInfoMapper {
	List<SCardInfo> search1(@Param("sname")String sname,@Param("idCard")String idCard);
	List<SCardInfo> search2(@Param("stype")String stype,@Param("sname")String sname,@Param("idCard")String idCard);
	
	int delete(int sid);
}
