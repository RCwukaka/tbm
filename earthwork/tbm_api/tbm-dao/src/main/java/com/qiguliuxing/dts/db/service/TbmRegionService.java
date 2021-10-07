package com.qiguliuxing.dts.db.service;

import com.github.pagehelper.PageHelper;
import com.qiguliuxing.dts.db.dao.TbmRegionMapper;
import com.qiguliuxing.dts.db.domain.TbmRegion;
import com.qiguliuxing.dts.db.domain.TbmRegionExample;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbmRegionService {

	@Resource
	private TbmRegionMapper regionMapper;

	public List<TbmRegion> getAll() {
		TbmRegionExample example = new TbmRegionExample();
		byte b = 4;
		example.or().andTypeNotEqualTo(b);
		return regionMapper.selectByExample(example);
	}

	public List<TbmRegion> queryByPid(Integer parentId) {
		TbmRegionExample example = new TbmRegionExample();
		example.or().andPidEqualTo(parentId);
		return regionMapper.selectByExample(example);
	}

	public TbmRegion findById(Integer id) {
		return regionMapper.selectByPrimaryKey(id);
	}

	public List<TbmRegion> querySelective(String name, Integer code, Integer page, Integer size, String sort,
										  String order) {
		TbmRegionExample example = new TbmRegionExample();
		TbmRegionExample.Criteria criteria = example.createCriteria();

		if (!StringUtils.isEmpty(name)) {
			criteria.andNameLike("%" + name + "%");
		}
		if (!StringUtils.isEmpty(code)) {
			criteria.andCodeEqualTo(code);
		}

		if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
			example.setOrderByClause(sort + " " + order);
		}

		PageHelper.startPage(page, size);
		return regionMapper.selectByExample(example);
	}
}
