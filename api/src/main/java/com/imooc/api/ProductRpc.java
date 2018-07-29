package com.imooc.api;

import com.googlecode.jsonrpc4j.JsonRpcService;
import com.imooc.api.domain.ProductRpcReq;
import com.imooc.entity.Product;

import java.util.List;

/**
 * 产品相关RPC服务 jsonrpc4j:轻量级的跨语言远程调用协议
 */
@JsonRpcService("rpc/products")
public interface ProductRpc {

    /**
     * 查询多个产品
     * @param req
     * @return
     */
    List<Product> query(ProductRpcReq req);

    /**
     * 查询单个产品
     * @param id
     * @return
     */
    Product findOne(String id);

}
