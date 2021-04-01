package com.five.monkey.vi.vhr.web;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.five.monkey.vi.vhr.common.vo.user.UserVo;
import com.five.monkey.vi.vhr.service.user.UserService;

@SpringBootTest
@RunWith(SpringRunner.class)
class ViVhrWebApplicationTests {

	private static final Logger	logger	= LoggerFactory.getLogger(ViVhrWebApplicationTests.class);

	@Autowired
	@Qualifier("userServiceProxy")
	private UserService			userServiceProxy;

	@Test
	void contextLoads() {
		UserVo vo = userServiceProxy.findUserById(4L);
		logger.info("web模块findUserById测试结果:{}", JSON.toJSONString(vo));
	}

	@Test
	void list() {
		List<UserVo> userVoList = userServiceProxy.list(0, 10);
		for (UserVo vo : userVoList) {
			logger.info("web模块list测试结果:{}", JSON.toJSONString(vo));
		}
	}

}
