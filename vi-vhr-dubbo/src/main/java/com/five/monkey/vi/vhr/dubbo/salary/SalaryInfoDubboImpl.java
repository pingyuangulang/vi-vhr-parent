package com.five.monkey.vi.vhr.dubbo.salary;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.five.monkey.vi.vhr.service.salary.SalaryInfoService;

/**
 * @author jim
 * @date 2021/3/26 15:01
 */
@DubboService(interfaceClass = SalaryInfoDubbo.class, timeout = 3000)
public class SalaryInfoDubboImpl implements SalaryInfoDubbo {

	@Autowired
	@Qualifier("salaryInfoServiceProxy")
	private SalaryInfoService salaryInfoServiceProxy;

}
