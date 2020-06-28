package com.chy.mall.service;

import com.chy.mall.controller.vo.MallShoppingCartItemVO;
import com.chy.mall.entity.MallShoppingCartItem;

import java.util.List;

public interface MallShoppingCartService {

    /**
     * 保存商品至购物车中
     *
     * @param mallShoppingCartItem
     * @return
     */
    String saveNewBeeMallCartItem(MallShoppingCartItem mallShoppingCartItem);

    /**
     * 修改购物车中的属性
     *
     * @param mallShoppingCartItem
     * @return
     */
    String updateNewBeeMallCartItem(MallShoppingCartItem mallShoppingCartItem);

    /**
     * 获取购物项详情
     *
     * @param mallShoppingCartItemId
     * @return
     */
    MallShoppingCartItem getNewBeeMallCartItemById(Long mallShoppingCartItemId);

    /**
     * 删除购物车中的商品
     *
     * @param mallShoppingCartItemId
     * @return
     */
    Boolean deleteById(Long mallShoppingCartItemId);

    /**
     * 获取我的购物车中的列表数据
     *
     * @param mallUserId
     * @return
     */
    List<MallShoppingCartItemVO> getMyShoppingCartItems(Long mallUserId);
}
