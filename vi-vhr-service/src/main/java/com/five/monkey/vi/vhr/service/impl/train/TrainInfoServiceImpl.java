package com.five.monkey.vi.vhr.service.impl.train;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.five.monkey.vi.vhr.dal.mapper.base.TrainInfoMapper;
import com.five.monkey.vi.vhr.service.train.TrainInfoService;

/**
 * @author jim
 * @date 2021/3/25 17:17
 */
@Service("trainInfoServiceImpl")
public class TrainInfoServiceImpl implements TrainInfoService {

	@Autowired
	private TrainInfoMapper trainInfoMapper;
}
