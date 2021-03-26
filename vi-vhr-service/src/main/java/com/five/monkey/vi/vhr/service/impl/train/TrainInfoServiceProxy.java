package com.five.monkey.vi.vhr.service.impl.train;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.five.monkey.vi.vhr.service.train.TrainInfoService;

/**
 * @author jim
 * @date 2021/3/25 17:56
 */
@Service("trainInfoServiceProxy")
public class TrainInfoServiceProxy implements TrainInfoService {

    @Autowired
    @Qualifier("trainInfoServiceImpl")
    private TrainInfoService trainInfoServiceImpl;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
}
