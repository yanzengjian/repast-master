package com.aaa.repast.admin.project.system.shopInfo.service;

import com.aaa.repast.admin.project.system.shopInfo.mapper.ShopInfoMapper;
import com.aaa.repast.admin.project.system.shopInformation.domain.ShopInformation;
import com.aaa.repast.admin.project.system.shopInformation.mapper.ShopInformationMapper;
import com.aaa.repast.admin.project.system.shopInformation.service.IShopInformationService;
import com.aaa.repast.common.support.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 店铺的基本 服务层实现
 * 
 * @author Seven Lee
 * @date 2019-12-04
 */
@Service
public class ShopInfoServiceImpl implements IShopInfoService
{
	@Autowired
	private ShopInfoMapper shopInfoMapper;

	/**
     * 查询店铺的基本信息
     * 
     * @param id 店铺的基本ID
     * @return 店铺的基本信息
     */
    @Override
	public ShopInformation selectShopInfoById(Long id)
	{
	    return shopInfoMapper.selectShopInfoById(id);
	}
	
	/**
     * 查询店铺的基本列表
     * 
     * @param shopInformation 店铺的基本信息
     * @return 店铺的基本集合
     */
	@Override
	public List<ShopInformation> selectShopInfoList(ShopInformation shopInformation)
	{
	    return shopInfoMapper.selectShopInfoList(shopInformation);
	}
	
    /**
     * 新增店铺的基本
     * 
     * @param shopInformation 店铺的基本信息
     * @return 结果
     */
	@Override
	public int insertShopInfo(ShopInformation shopInformation)
	{
	    return shopInfoMapper.insertShopInfo(shopInformation);
	}
	
	/**
     * 修改店铺的基本
     * 
     * @param shopInformation 店铺的基本信息
     * @return 结果
     */
	@Override
	public int updateShopInfo(ShopInformation shopInformation)
	{
	    return shopInfoMapper.updateShopInfo(shopInformation);
	}

	/**
     * 删除店铺的基本对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteShopInfoByIds(String ids)
	{
		return shopInfoMapper.deleteShopInfoByIds(Convert.toStrArray(ids));
	}
	
}
