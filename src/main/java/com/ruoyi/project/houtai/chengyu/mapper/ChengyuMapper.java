package com.ruoyi.project.houtai.chengyu.mapper;

import com.ruoyi.project.houtai.chengyu.domain.Chengyu;
import java.util.List;	

/**
 * 成语 数据层
 * 
 * @author ruoyi
 * @date 2019-05-03
 */
public interface ChengyuMapper 
{
	/**
     * 查询成语信息
     * 
     * @param chengyuId 成语ID
     * @return 成语信息
     */
	public Chengyu selectChengyuById(Integer chengyuId);
	
	/**
     * 查询成语列表
     * 
     * @param chengyu 成语信息
     * @return 成语集合
     */
	public List<Chengyu> selectChengyuList(Chengyu chengyu);
	
	/**
     * 新增成语
     * 
     * @param chengyu 成语信息
     * @return 结果
     */
	public int insertChengyu(Chengyu chengyu);
	
	/**
     * 修改成语
     * 
     * @param chengyu 成语信息
     * @return 结果
     */
	public int updateChengyu(Chengyu chengyu);
	
	/**
     * 删除成语
     * 
     * @param chengyuId 成语ID
     * @return 结果
     */
	public int deleteChengyuById(Integer chengyuId);
	
	/**
     * 批量删除成语
     * 
     * @param chengyuIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteChengyuByIds(String[] chengyuIds);
	
}