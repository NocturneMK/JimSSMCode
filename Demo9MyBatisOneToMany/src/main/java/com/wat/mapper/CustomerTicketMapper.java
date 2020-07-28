package com.wat.mapper;
import java.util.List;

import com.wat.bean.Customer;
import com.wat.bean.Ticket;
public interface CustomerTicketMapper {
        public  Customer    findBycustomerName(String   name);
}
