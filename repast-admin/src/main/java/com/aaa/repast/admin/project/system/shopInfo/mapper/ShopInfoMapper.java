package com.aaa.repast.admin.project.system.shopInfo.mapper;

import com.aaa.repast.admin.project.system.shopInformation.domain.ShopInformation;

import java.util.List;

/**
 * 店铺的基本 数据层
 * 
 * @author Seven Lee
 * @date 2019-12-04
 */
public interface ShopInfoMapper
{
	/**
     * 查询店铺的基本信息
     * 
     * @param id 店铺的基本ID
     * @return 店铺的基本信息
     */
	ShopInformation selectShopInfoById(Long id);
	
	/**
     * 查询店铺的基本列表
     * 
     * @param shopInformation 店铺的基本信息
     * @return 店铺的基本集合
     */
	List<ShopInformation> selectShopInfoList(ShopInformation shopInformation);
	
	/**
     * 新增店铺的基本
     * 
     * @param shopInformation 店铺的基本信息
     * @return 结果
     */
	int insertShopInfo(ShopInformation shopInformation);
	
	/**
     * 修改店铺的基本
     * 
     * @param shopInformation 店铺的基本信息
     * @return 结果
     */
	int updateShopInfo(ShopInformation shopInformation);
	
	/**
     * 删除店铺的基本
     * 
     * @param id 店铺的基本ID
     * @return 结果
     */
	int deleteShopInfoById(Long id);
	
	/**
     * 批量删除店铺的基本
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	int deleteShopInfoByIds(String[] ids);
	
}