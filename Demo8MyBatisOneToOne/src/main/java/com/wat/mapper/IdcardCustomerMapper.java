package com.wat.mapper;

import java.util.List;

import com.wat.bean.Idcard;

public interface IdcardCustomerMapper {
     public   List<Idcard>    findIdCardPeople(String name);
}
