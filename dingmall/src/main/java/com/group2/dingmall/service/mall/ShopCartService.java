package com.group2.dingmall.service.mall;

import com.group2.dingmall.controller.mall.param.CartItemParam;
import com.group2.dingmall.controller.mall.vo.BookInCartVO;
import com.group2.dingmall.po.ShopCart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ShopCartService {

    // 添加商品
    void addGoodToCart(CartItemParam cartItemParam, String loginName);

    // 删除购物项
    void deleteGoodFromCart(long bookId, String loginName);

    // 修改购物项
    void updateGoodFromCart(CartItemParam cartItemParam, String loginName);

    // 获得购物车清单
    List<BookInCartVO> getShopCart(String loginName);
}
