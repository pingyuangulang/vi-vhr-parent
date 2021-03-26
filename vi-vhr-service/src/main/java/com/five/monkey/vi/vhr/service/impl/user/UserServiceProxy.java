package com.five.monkey.vi.vhr.service.impl.user;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.five.monkey.vi.vhr.common.constant.UserConstant;
import com.five.monkey.vi.vhr.common.vo.user.UserVo;
import com.five.monkey.vi.vhr.service.user.UserService;

/**
 * @author jim
 * @date 2021/3/25 17:59
 */
@Service("userServiceProxy")
public class UserServiceProxy implements UserService {

	@Autowired
	@Qualifier("userServiceImpl")
	private UserService			userServiceImpl;

	@Autowired
	private StringRedisTemplate	stringRedisTemplate;

	@Override
	public UserVo findUserById(Long id) {
		UserVo vo;
		String value = stringRedisTemplate.opsForValue().get(UserConstant.USER_KEY_PREFIX + id);
		if (StringUtils.isBlank(value)) {
			vo = userServiceImpl.findUserById(id);
			if (Objects.nonNull(vo)) {
				stringRedisTemplate.opsForValue().set(UserConstant.USER_KEY_PREFIX + id, JSON.toJSONString(vo), 7L, TimeUnit.DAYS);
			}
		} else {
			vo = JSON.parseObject(value, UserVo.class);
		}
		return vo;
	}

	@Override
	public List<UserVo> list(int start, int length) {
		return userServiceImpl.list(start, length);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public UserVo insertSelective(UserVo userVo) {
		return userServiceImpl.insertSelective(userVo);
	}
}
