package com.ruoyi.project.houtai.chengyu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.houtai.chengyu.mapper.ChengyuMapper;
import com.ruoyi.project.houtai.chengyu.domain.Chengyu;
import com.ruoyi.project.houtai.chengyu.service.IChengyuService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 成语 服务层实现
 * 
 * @author ruoyi
 * @date 2019-05-03
 */
@Service
public class ChengyuServiceImpl implements IChengyuService 
{
	@Autowired
	private ChengyuMapper chengyuMapper;

	/**
     * 查询成语信息
     * 
     * @param chengyuId 成语ID
     * @return 成语信息
     */
    @Override
	public Chengyu selectChengyuById(Integer chengyuId)
	{
	    return chengyuMapper.selectChengyuById(chengyuId);
	}
	
	/**
     * 查询成语列表
     * 
     * @param chengyu 成语信息
     * @return 成语集合
     */
	@Override
	public List<Chengyu> selectChengyuList(Chengyu chengyu)
	{
	    return chengyuMapper.selectChengyuList(chengyu);
	}
	
    /**
     * 新增成语
     * 
     * @param chengyu 成语信息
     * @return 结果
     */
	@Override
	public int insertChengyu(Chengyu chengyu)
	{
	    return chengyuMapper.insertChengyu(chengyu);
	}
	
	/**
     * 修改成语
     * 
     * @param chengyu 成语信息
     * @return 结果
     */
	@Override
	public int updateChengyu(Chengyu chengyu)
	{
	    return chengyuMapper.updateChengyu(chengyu);
	}

	/**
     * 删除成语对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteChengyuByIds(String ids)
	{
		return chengyuMapper.deleteChengyuByIds(Convert.toStrArray(ids));
	}
	
}
