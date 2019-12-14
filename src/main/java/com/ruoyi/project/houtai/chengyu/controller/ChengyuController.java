package com.ruoyi.project.houtai.chengyu.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.houtai.chengyu.domain.Chengyu;
import com.ruoyi.project.houtai.chengyu.service.IChengyuService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 成语信息操作处理
 * 
 * @author ruoyi
 * @date 2019-05-03
 */
@Controller
@RequestMapping("/houtai/chengyu")
public class ChengyuController extends BaseController
{
    private String prefix = "houtai/chengyu";
	
	@Autowired
	private IChengyuService chengyuService;
	
	@RequiresPermissions("houtai:chengyu:view")
	@GetMapping()
	public String chengyu()
	{
	    return prefix + "/chengyu";
	}
	
	/**
	 * 查询成语列表
	 */
	@RequiresPermissions("houtai:chengyu:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Chengyu chengyu)
	{
		startPage();
        List<Chengyu> list = chengyuService.selectChengyuList(chengyu);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出成语列表
	 */
	@RequiresPermissions("houtai:chengyu:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Chengyu chengyu)
    {
    	List<Chengyu> list = chengyuService.selectChengyuList(chengyu);
        ExcelUtil<Chengyu> util = new ExcelUtil<Chengyu>(Chengyu.class);
        return util.exportExcel(list, "chengyu");
    }
	
	/**
	 * 新增成语
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存成语
	 */
	@RequiresPermissions("houtai:chengyu:add")
	@Log(title = "成语", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Chengyu chengyu)
	{		
		return toAjax(chengyuService.insertChengyu(chengyu));
	}

	/**
	 * 修改成语
	 */
	@GetMapping("/edit/{chengyuId}")
	public String edit(@PathVariable("chengyuId") Integer chengyuId, ModelMap mmap)
	{
		Chengyu chengyu = chengyuService.selectChengyuById(chengyuId);
		mmap.put("chengyu", chengyu);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存成语
	 */
	@RequiresPermissions("houtai:chengyu:edit")
	@Log(title = "成语", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Chengyu chengyu)
	{		
		return toAjax(chengyuService.updateChengyu(chengyu));
	}
	
	/**
	 * 删除成语
	 */
	@RequiresPermissions("houtai:chengyu:remove")
	@Log(title = "成语", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(chengyuService.deleteChengyuByIds(ids));
	}
	
}
