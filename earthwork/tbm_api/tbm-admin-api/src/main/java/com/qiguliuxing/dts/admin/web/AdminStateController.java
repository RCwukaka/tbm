package com.qiguliuxing.dts.admin.web;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.qiguliuxing.dts.core.util.ResponseUtil;
import com.qiguliuxing.dts.core.validator.Order;
import com.qiguliuxing.dts.core.validator.Sort;
import com.qiguliuxing.dts.db.domain.TbmRegion;
import com.qiguliuxing.dts.db.domain.TbmState;
import com.qiguliuxing.dts.db.service.TbmRegionService;
import com.qiguliuxing.dts.db.service.TbmStateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin/tbm")
@Validated
public class AdminStateController {
	private static final Logger logger = LoggerFactory.getLogger(AdminStateController.class);

	@Autowired
	private TbmStateService stateService;

	@GetMapping("/info")
	public Object info(@RequestParam(defaultValue = "1840") Integer id) {
		logger.info("【请求开始】盾构机状态->查询,请求参数,id:{}", id);

		TbmState tbmState = stateService.findStateById(id);

		logger.info("【请求结束】盾构机状态->查询,响应结果:{}", JSONObject.toJSONString(tbmState.getId()));
		return ResponseUtil.ok(tbmState);
	}
}
