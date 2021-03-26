package com.five.monkey.vi.vhr.dubbo.consumer.controller.user;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.five.monkey.vi.vhr.common.vo.base.BaseResponseVo;
import com.five.monkey.vi.vhr.common.vo.user.UserVo;
import com.five.monkey.vi.vhr.dubbo.user.UserDubbo;

/**
 * @author jim
 * @date 2021/3/26 16:19
 */
@RestController
@RequestMapping("/consumer/user")
public class UserController {

	@DubboReference
	private UserDubbo userDubbo;

	@GetMapping("/info/{id}")
	public BaseResponseVo<UserVo> infoById(@PathVariable("id") Long id) {
		BaseResponseVo<UserVo> responseVo = new BaseResponseVo<>();
		responseVo.setData(userDubbo.findUserById(id));
		return responseVo;
	}
}
