package com.hh.ishare.service;

import com.hh.ishare.bean.DataType;
import com.hh.ishare.query.LeftNavQuery;

import java.util.List;

public interface DataTypeService {
    int add(DataType type);
    int delete(DataType type);
    int update(DataType type);
    List<DataType> list(DataType type);

}
