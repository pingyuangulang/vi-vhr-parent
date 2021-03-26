package com.five.monkey.vi.vhr.service.impl.remove;

import com.five.monkey.vi.vhr.service.remove.RemoveInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author jim
 * @date 2021/3/25 17:49
 */
@Service("removeInfoServiceProxy")
public class RemoveInfoServiceProxy implements RemoveInfoService {

    @Autowired
    @Qualifier("removeInfoServiceImpl")
    private RemoveInfoService removeInfoServiceImpl;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
}
