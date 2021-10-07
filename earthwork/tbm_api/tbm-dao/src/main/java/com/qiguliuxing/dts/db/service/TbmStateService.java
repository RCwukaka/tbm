package com.qiguliuxing.dts.db.service;

import com.qiguliuxing.dts.db.dao.TbmStateMapper;
import com.qiguliuxing.dts.db.domain.TbmAdmin;
import com.qiguliuxing.dts.db.domain.TbmAdmin.Column;
import com.qiguliuxing.dts.db.domain.TbmState;
import com.qiguliuxing.dts.db.domain.TbmStateExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbmStateService {
	private final Column[] result = new Column[] { Column.id, Column.username, Column.avatar, Column.roleIds };
	@Resource
	private TbmStateMapper stateMapper;

	public List<TbmState> allAdmin() {
		TbmStateExample example = new TbmStateExample();
		return stateMapper.selectByExample(example);
	}

	public TbmState findStateById(Integer id) {
		return stateMapper.selectByPrimaryKey(id);
	}
}
