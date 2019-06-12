package com.example.demo1.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.example.demo1.dds.DynamicDataSource;
import com.example.demo1.sys.entity.Tenant;
import com.example.demo1.sys.service.ITenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName InitTargetDataSources
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/6/12 14:36
 **/
@Component
public class InitTargetDataSources implements CommandLineRunner {

//    @Autowired
//    private DynamicDataSource dynamicDataSource;

    @Autowired
    private ITenantService iTenantService;

    @Override
    public void run(String... args) {
        System.out.println("测试");
        List<Tenant> list = iTenantService.list();

        DynamicDataSource dynamicDataSource = ApplicationContextRegister.getBean(DynamicDataSource.class);
        Map<Object, Object> dataSourceMap = list.stream().collect(Collectors.toMap(
                Tenant::getTenant, tenant -> {
                    DruidDataSource druidDataSource = new DruidDataSource();
                    druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
                    druidDataSource.setUrl(tenant.getDbUrl());
                    druidDataSource.setUsername(tenant.getDbName());
                    druidDataSource.setPassword(tenant.getDbPwd());
                    druidDataSource.setDbType(tenant.getDbType());
                    return druidDataSource;
                }
        ));
        dynamicDataSource.setTargetDataSources(dataSourceMap);
        dynamicDataSource.afterPropertiesSet();
        System.out.println(dynamicDataSource);
    }
}
