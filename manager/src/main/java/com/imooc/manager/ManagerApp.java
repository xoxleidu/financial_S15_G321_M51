/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ManagerApp
 * Author:   XBAO
 * Date:     2018/7/17 23:16
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.imooc.manager;


import com.imooc.swagger.EnableMySwagger;
import com.imooc.swagger.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Import;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author XBAO
 * @create 2018/7/17
 * @since 1.0.0
 */
@SpringBootApplication
@EntityScan(basePackages = {"com.imooc.entity"})
//@EnableMySwagger//使用自己的注解swagger--第二种方法：swagger包里配置文件:spring.factories
public class ManagerApp {

    public static void main(String[] args){
        SpringApplication.run(ManagerApp.class);
    }

}