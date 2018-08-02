package com.imooc.seller.repositories;

import com.imooc.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 订单数据库操作管理
 * spring:JpaRepository,JpaSpecificationExecutor
 */
public interface OrderRepository extends JpaRepository<Order,String>, JpaSpecificationExecutor<Order> {
}
