package com.hh.ishare.service.impl;

import com.hh.ishare.bean.DataType;
import com.hh.ishare.mapper.DataTypeMapper;
import com.hh.ishare.query.LeftNavQuery;
import com.hh.ishare.service.DataTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dataTypeService")
public class DataTypeServiceImpl implements DataTypeService {

    @Autowired
    private DataTypeMapper dataTypeMapper;

    @Override
    public int add(DataType type) {

        List<DataType> dtaTypeList = dataTypeMapper.selectBySelective(type);
        if(dtaTypeList.size()==0){
            return dataTypeMapper.insertSelective(type);
        }else{
            return -1;
        }
    }

    @Override
    public int delete(DataType type) {
        return dataTypeMapper.deleteByPrimaryKey(type.getId());
    }

    @Override
    public int update(DataType type) {
        System.out.println(type.getId()+""+type.getTypeName());
        return dataTypeMapper.updateByPrimaryKeySelective(type);
    }

    @Override
    public List<DataType> list(DataType type) {

        return dataTypeMapper.selectBySelective(type);
    }
}
