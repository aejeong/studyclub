package kr.mycom.ojo.service;

import java.util.List;
import java.util.Map;

import org.apache.tomcat.jni.Mmap;
import org.springframework.stereotype.Service;

import kr.mycom.ojo.model.GroupVo;
import kr.mycom.ojo.model.Group_join;
import kr.mycom.ojo.model.MemberVo;
import kr.mycom.ojo.model.ReserveVo;
import kr.mycom.ojo.model.ReserveVo_rcode;
import kr.mycom.ojo.model.Room_infoVo;
import kr.mycom.ojo.model.SignupVo;

public interface MyPageService {

	public GroupVo read(Integer gcode) throws Exception;

	public List<GroupVo> listAll(int ucode) throws Exception;

	public List<ReserveVo> listR(int ucode) throws Exception;

	public List<Room_infoVo> listW(int ucode) throws Exception;

	public List<SignupVo> listS(int gcode) throws Exception;

	public List<Group_join> listJ(int ucode) throws Exception;
	
	public int groupSignCnt(int gcode) throws Exception;
	
	public List<ReserveVo_rcode> listf(int ucode) throws Exception;

	public void AccumulatedPoint(Map<String, Integer> map);


	public int selectReserve_past(Map<String, Integer> map);

	public MemberVo userInformation(int ucode);
	
	//adminster 인지
	public int administer(int ucode) throws Exception;
}
