package com.neusoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.entity.SCardInfo;
import com.neusoft.mapper.SCardInfoMapper;

@Service
public class SCardInfoServiceImpl implements SCardInfoService{
	@Autowired
	private SCardInfoMapper scardInfoMapper;
	
	
	@Override
	public List<SCardInfo> search1(String sname, String idCard) {
		// TODO Auto-generated method stub
		return scardInfoMapper.search1(sname, idCard);
	}

	@Override
	public List<SCardInfo> search2(String stype, String sname, String idCard) {
		// TODO Auto-generated method stub
		return scardInfoMapper.search2(stype, sname, idCard);
	}

	@Override
	public int delete(int sid) {
		// TODO Auto-generated method stub
		return scardInfoMapper.delete(sid);
	}

}
