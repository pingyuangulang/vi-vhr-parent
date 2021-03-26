package com.five.monkey.vi.vhr.dubbo.user;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.five.monkey.vi.vhr.common.vo.user.UserVo;
import com.five.monkey.vi.vhr.service.user.UserService;

/**
 * @author jim
 * @date 2021/3/26 11:42
 */
@DubboService(interfaceClass = UserDubbo.class, timeout = 3000)
public class UserDubboImpl implements UserDubbo {

	@Autowired
	@Qualifier("userServiceProxy")
	private UserService userServiceProxy;

	@Override
	public UserVo findUserById(Long id) {
		return userServiceProxy.findUserById(id);
	}
}
