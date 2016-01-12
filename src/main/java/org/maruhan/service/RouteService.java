package org.maruhan.service;

import java.util.List;

import org.maruhan.domain.RouteVO;
import org.maruhan.persistence.RouteMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RouteService {

	@Autowired
	RouteMapperImpl mapper;
	
	public List<RouteVO> list() throws Exception{
		return mapper.list();
	}

	public void regist(RouteVO vo) throws Exception{
		mapper.create(vo);
	}
	
	public RouteVO view(Integer routeno) throws Exception{
		return mapper.read(routeno);
	}
	
	public void modify(RouteVO vo) throws Exception{
		mapper.update(vo);
	}
	
	public void remove(Integer routeno) throws Exception{
		mapper.delete(routeno);
	}
	
}
