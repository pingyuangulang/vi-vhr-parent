package com.five.monkey.vi.vhr.service.impl.occur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.five.monkey.vi.vhr.service.occur.OccurDetailService;

/**
 * @author jim
 * @date 2021/3/25 17:52
 */
@Service("occurDetailServiceProxy")
public class OccurDetailServiceProxy implements OccurDetailService {

    @Autowired
    @Qualifier("occurDetailServiceImpl")
    private OccurDetailService occurDetailServiceImpl;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
}
