package com.wat.mapper;

import java.util.List;

import com.wat.bean.IdcardCustom;

public interface IdcardCustomerMapper {
     public   List<IdcardCustom>    findIdCardPeople(String name);
}
