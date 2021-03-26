package com.five.monkey.vi.vhr.service.impl.user;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.five.monkey.vi.vhr.common.vo.user.UserVo;
import com.five.monkey.vi.vhr.dal.entity.User;
import com.five.monkey.vi.vhr.dal.entity.UserExample;
import com.five.monkey.vi.vhr.dal.mapper.base.UserMapper;
import com.five.monkey.vi.vhr.service.user.UserService;

/**
 * @author jim
 * @date 2021/3/25 16:19
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public UserVo findUserById(Long id) {
		User user = userMapper.selectByPrimaryKey(id);
		UserVo vo = null;
		if (Objects.nonNull(user)) {
			vo = new UserVo();
			BeanUtils.copyProperties(user, vo);
		}
		return vo;
	}

	@Override
	public List<UserVo> list(int start, int length) {
		UserExample example = new UserExample();
		example.setStart(start);
		example.setLength(length);
		return userMapper.selectByExample(example).stream().map(user -> {
			UserVo userVo = new UserVo();
			BeanUtils.copyProperties(user, userVo);
			return userVo;
		}).collect(Collectors.toList());
	}

	@Override
	public UserVo insertSelective(UserVo userVo) {
		User user = new User();
		BeanUtils.copyProperties(userVo, user);
		userMapper.insertSelective(user);
		BeanUtils.copyProperties(user, userVo);
		return userVo;
	}
}
