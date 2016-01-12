package org.maruhan.controller;

import java.util.List;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.maruhan.domain.RouteVO;
import org.maruhan.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(
		locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class RouteServiceTest extends DataSourceTest {

	@Autowired
	private RouteService service;
	
	@Inject
    private WebApplicationContext wac;
    private MockMvc mockMvc;
    
    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        logger.info("setup............");
    }
	
	@Test
	public void listTest() throws Exception{
		List<RouteVO> result = service.list();
		System.out.println(result);
	}
    
	@Test
	public void view() throws Exception{
		RouteVO vo = service.view(1);
		System.out.println(vo);
	}
	
	@Test
	public void delete() throws Exception{
		service.remove(8);
	}
	
	@Test
	public void modify() throws Exception{
		RouteVO vo = service.view(10);
		vo.setRoutename("스프링에서 수정한 루트");
		vo.setLat(37.666666);
		vo.setLng(127.777777);
		service.modify(vo);
	}
	
	
}
