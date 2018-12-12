package com.neusoft.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neusoft.entity.SCardInfo;

public interface SCardInfoService {
	List<SCardInfo> search1(String sname,String idCard);
	List<SCardInfo> search2(String stype,String sname,String idCard);
	
	int delete(int sid);
}
