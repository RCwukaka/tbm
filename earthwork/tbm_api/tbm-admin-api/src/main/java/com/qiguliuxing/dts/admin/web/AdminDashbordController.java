package com.qiguliuxing.dts.admin.web;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.qiguliuxing.dts.core.util.ResponseUtil;
import com.qiguliuxing.dts.db.service.TbmUserService;

@RestController
@RequestMapping("/admin/dashboard")
@Validated
public class AdminDashbordController {
	private static final Logger logger = LoggerFactory.getLogger(AdminDashbordController.class);

	@Autowired
	private TbmUserService userService;

	@GetMapping("")
	public Object info() {
		logger.info("【请求开始】系统管理->首页仪表盘查询");

		int userTotal = userService.count();
		Map<String, Integer> data = new HashMap<>();
		data.put("userTotal", userTotal);

		logger.info("【请求结束】系统管理->首页仪表盘查询:响应结果:{}", JSONObject.toJSONString(data));
		return ResponseUtil.ok(data);
	}

}
