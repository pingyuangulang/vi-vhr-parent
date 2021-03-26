package com.five.monkey.vi.vhr.dubbo.employee;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author jim
 * @date 2021/3/26 14:27
 */
@DubboService(interfaceClass = EmployeeDubbo.class, timeout = 3000)
public class EmployeeDubboImpl implements EmployeeDubbo {

}
