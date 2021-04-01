package com.five.monkey.vi.vhr.dubbo.consumer;

import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.five.monkey.vi.vhr.common.vo.user.UserVo;
import com.five.monkey.vi.vhr.dubbo.user.UserDubbo;

@SpringBootTest
@RunWith(SpringRunner.class)
class ViVhrDubboConsumerApplicationTests {

	private static final Logger	logger	= LoggerFactory.getLogger(ViVhrDubboConsumerApplicationTests.class);

	@DubboReference
	private UserDubbo			userDubbo;

	@Test
	void contextLoads() {
		UserVo vo = userDubbo.findUserById(4L);
		logger.info("dubbo消费服务findById测试结果:{}", JSON.toJSONString(vo));
	}

}
