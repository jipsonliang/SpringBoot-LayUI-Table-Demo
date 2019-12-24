package com.example.getStaticResDemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.getStaticResDemo.dao.CustumerTableDao;
import com.example.getStaticResDemo.entity.CustumerTable;
import com.example.getStaticResDemo.service.CustumerTableService;
import org.springframework.stereotype.Service;

/**
 * (CustumerTable)表服务实现类
 *
 * @author makejava
 * @since 2019-12-22 17:59:14
 */
@Service("custumerTableService")
public class CustumerTableServiceImpl extends ServiceImpl<CustumerTableDao, CustumerTable> implements CustumerTableService {

}