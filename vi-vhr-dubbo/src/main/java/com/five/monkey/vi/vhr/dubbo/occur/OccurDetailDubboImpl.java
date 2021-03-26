package com.five.monkey.vi.vhr.dubbo.occur;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author jim
 * @date 2021/3/26 15:00
 */
@DubboService(interfaceClass = OccurDetailDubbo.class, timeout = 3000)
public class OccurDetailDubboImpl implements OccurDetailDubbo {

}
