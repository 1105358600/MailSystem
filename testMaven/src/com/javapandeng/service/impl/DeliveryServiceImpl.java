package com.javapandeng.service.impl;

import com.javapandeng.base.BaseDao;
import com.javapandeng.base.BaseServiceImpl;
import com.javapandeng.mapper.DeliveryMapper;
import com.javapandeng.po.Delivery;
import com.javapandeng.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryServiceImpl extends BaseServiceImpl<Delivery> implements DeliveryService {
    @Autowired
    DeliveryMapper DeliveryMapper;

    @Override
    public BaseDao<Delivery> getBaseDao() {
        return DeliveryMapper;
    }
}
