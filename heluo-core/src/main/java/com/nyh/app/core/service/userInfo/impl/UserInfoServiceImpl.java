package com.nyh.app.core.service.userInfo.impl;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nyh.app.common.constant.AppConstant;
import com.nyh.app.common.exception.SystemException;
import com.nyh.app.common.util.AesEncryptor;
import com.nyh.app.common.util.HttpsUtil;
import com.nyh.app.common.util.JsonUtil;
import com.nyh.app.common.vo.PageVo;
import com.nyh.app.core.context.WebContext;
import com.nyh.app.core.orm.userInfo.domain.UserInfo;
import com.nyh.app.core.orm.userInfo.mapper.UserInfoMapper;
import com.nyh.app.core.service.userInfo.UserInfoService;

import lombok.extern.slf4j.Slf4j;

/**
 * TODO
 *
 * @author niuxudong[niu_xu_dong@163.com]
 * @date: 2017-12-26 21:50:59
 * @review: niuxudong[niu_xu_dong@163.com]/2017-12-26 21:50:59
 */
@Service
@Slf4j
public class UserInfoServiceImpl implements UserInfoService {
	
	@Autowired
	private UserInfoMapper mapper;
	
	
	/**
	 * 登陆
	 */
	@Override
	public Map<String, Object> insert() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("aaa", "bbbb");
		return map;
	}
	
	@Override
	public PageInfo<UserInfo> findAll(PageVo pageVo) {
		PageHelper.startPage(pageVo);
		PageInfo<UserInfo> pageInfo = new PageInfo<UserInfo>(mapper.findAll());
		return pageInfo;
	}

	@Override
	public UserInfo findOne(String userId) {
		return mapper.findOne(userId);
	}

}