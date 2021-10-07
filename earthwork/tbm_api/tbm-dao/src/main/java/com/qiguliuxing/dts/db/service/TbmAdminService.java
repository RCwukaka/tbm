package com.qiguliuxing.dts.db.service;

import com.github.pagehelper.PageHelper;
import com.qiguliuxing.dts.db.dao.TbmAdminMapper;
import com.qiguliuxing.dts.db.domain.TbmAdmin;
import com.qiguliuxing.dts.db.domain.TbmAdminExample;
import com.qiguliuxing.dts.db.domain.TbmAdmin.Column;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class TbmAdminService {
	private final Column[] result = new Column[] { Column.id, Column.username, Column.avatar, Column.roleIds };
	@Resource
	private TbmAdminMapper adminMapper;

	public List<TbmAdmin> findAdmin(String username) {
		TbmAdminExample example = new TbmAdminExample();
		example.or().andUsernameEqualTo(username).andDeletedEqualTo(false);
		return adminMapper.selectByExample(example);
	}

	public TbmAdmin findAdmin(Integer id) {
		return adminMapper.selectByPrimaryKey(id);
	}

	public List<TbmAdmin> querySelective(String username, Integer page, Integer limit, String sort, String order) {
		TbmAdminExample example = new TbmAdminExample();
		TbmAdminExample.Criteria criteria = example.createCriteria();

		if (!StringUtils.isEmpty(username)) {
			criteria.andUsernameLike("%" + username + "%");
		}
		criteria.andDeletedEqualTo(false);

		if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
			example.setOrderByClause(sort + " " + order);
		}

		PageHelper.startPage(page, limit);
		return adminMapper.selectByExampleSelective(example, result);
	}

	public int updateById(TbmAdmin admin) {
		admin.setUpdateTime(LocalDateTime.now());
		return adminMapper.updateByPrimaryKeySelective(admin);
	}

	public void deleteById(Integer id) {
		adminMapper.logicalDeleteByPrimaryKey(id);
	}

	public void add(TbmAdmin admin) {
		admin.setAddTime(LocalDateTime.now());
		admin.setUpdateTime(LocalDateTime.now());
		adminMapper.insertSelective(admin);
	}

	public TbmAdmin findById(Integer id) {
		return adminMapper.selectByPrimaryKeySelective(id, result);
	}

	public List<TbmAdmin> allAdmin() {
		TbmAdminExample example = new TbmAdminExample();
		example.or().andDeletedEqualTo(false);
		return adminMapper.selectByExample(example);
	}
}
