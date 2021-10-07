package com.qiguliuxing.dts.db.service;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.qiguliuxing.dts.db.dao.TbmRoleMapper;
import com.qiguliuxing.dts.db.domain.TbmRole;
import com.qiguliuxing.dts.db.domain.TbmRoleExample;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class TbmRoleService {
	@Resource
	private TbmRoleMapper roleMapper;

	public Set<String> queryByIds(Integer[] roleIds) {
		Set<String> roles = new HashSet<String>();
		if (roleIds.length == 0) {
			return roles;
		}

		TbmRoleExample example = new TbmRoleExample();
		example.or().andIdIn(Arrays.asList(roleIds)).andEnabledEqualTo(true).andDeletedEqualTo(false);
		List<TbmRole> roleList = roleMapper.selectByExample(example);

		for (TbmRole role : roleList) {
			roles.add(role.getName());
		}

		return roles;

	}

	public List<TbmRole> querySelective(String roleName, Integer page, Integer size, String sort, String order) {
		TbmRoleExample example = new TbmRoleExample();
		TbmRoleExample.Criteria criteria = example.createCriteria();

		if (!StringUtils.isEmpty(roleName)) {
			criteria.andNameEqualTo("%" + roleName + "%");
		}
		criteria.andDeletedEqualTo(false);

		if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
			example.setOrderByClause(sort + " " + order);
		}

		PageHelper.startPage(page, size);
		return roleMapper.selectByExample(example);
	}

	public TbmRole findById(Integer id) {
		return roleMapper.selectByPrimaryKey(id);
	}

	public void add(TbmRole role) {
		role.setAddTime(LocalDateTime.now());
		role.setUpdateTime(LocalDateTime.now());
		roleMapper.insertSelective(role);
	}

	public void deleteById(Integer id) {
		roleMapper.logicalDeleteByPrimaryKey(id);
	}

	public void updateById(TbmRole role) {
		role.setUpdateTime(LocalDateTime.now());
		roleMapper.updateByPrimaryKeySelective(role);
	}

	public boolean checkExist(String name) {
		TbmRoleExample example = new TbmRoleExample();
		example.or().andNameEqualTo(name).andDeletedEqualTo(false);
		return roleMapper.countByExample(example) != 0;
	}

	public List<TbmRole> queryAll() {
		TbmRoleExample example = new TbmRoleExample();
		example.or().andDeletedEqualTo(false);
		return roleMapper.selectByExample(example);
	}
}
