package com.five.monkey.vi.vhr.service.impl.salary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.five.monkey.vi.vhr.service.salary.SalaryInfoService;

/**
 * @author jim
 * @date 2021/3/25 17:54
 */
@Service("salaryInfoServiceProxy")
public class SalaryInfoServiceProxy implements SalaryInfoService {

    @Autowired
    @Qualifier("salaryInfoServiceImpl")
    private SalaryInfoService salaryInfoServiceImpl;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
}
