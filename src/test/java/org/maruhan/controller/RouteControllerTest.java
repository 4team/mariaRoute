package org.maruhan.controller;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.maruhan.domain.RouteVO;
import org.maruhan.persistence.RouteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(
		locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class RouteControllerTest extends DataSourceTest {

	@Autowired
	RouteMapper mapper;
	
	@Inject
    private WebApplicationContext wac;
    private MockMvc mockMvc;
    
    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        logger.info("setup............");
    }

    @Test
	public void create() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/"));
		
		try{
			RouteVO vo = new RouteVO();
			vo.setRoutename("스프링에서 추가한 루트");
			vo.setLat(37.268452);
			vo.setLng(127.84234);
			mapper.create(vo);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
