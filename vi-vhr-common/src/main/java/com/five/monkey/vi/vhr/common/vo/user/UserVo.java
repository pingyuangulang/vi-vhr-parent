package com.five.monkey.vi.vhr.common.vo.user;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * @author jim
 * @date 2021/3/25 18:02
 */
@Data
public class UserVo implements Serializable {

	private static final long	serialVersionUID	= 127648649623342616L;

	private Long				id;

	private String				identifyId;

	private String				name;

	private String				phone;

	private String				email;

	private String				address;

	private Byte				sex;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date				birthday;

	private Byte				wedLock;

	private String				race;

	private String				place;

	private String				politic;

	private String				school;

	private String				specialty;

	private Byte				topDegree;

}
