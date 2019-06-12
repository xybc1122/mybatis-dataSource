package com.example.demo1.sys.service.impl;

import com.example.demo1.sys.entity.Tenant;
import com.example.demo1.mapper.TenantMapper;
import com.example.demo1.sys.service.ITenantService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 租户表 服务实现类
 * </p>
 *
 * @author 陈恩惠
 * @since 2019-06-12
 */
@Service
public class TenantServiceImpl extends ServiceImpl<TenantMapper, Tenant> implements ITenantService {

}
