package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2026-04-05 15:42:36
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
