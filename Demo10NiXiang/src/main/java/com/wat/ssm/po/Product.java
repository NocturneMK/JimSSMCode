package com.wat.ssm.po;

import java.util.Date;

public class Product {
    private Integer id;

    private String name;

    private Integer categoryid;

    private Double baseprice;

    private Double marketprice;

    private Double sellprice;

    private Integer sellcount;

    private String sexrequest;

    private String description;

    private Date createtime;

    private String commend;

    private Integer uploadfileid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public Double getBaseprice() {
        return baseprice;
    }

    public void setBaseprice(Double baseprice) {
        this.baseprice = baseprice;
    }

    public Double getMarketprice() {
        return marketprice;
    }

    public void setMarketprice(Double marketprice) {
        this.marketprice = marketprice;
    }

    public Double getSellprice() {
        return sellprice;
    }

    public void setSellprice(Double sellprice) {
        this.sellprice = sellprice;
    }

    public Integer getSellcount() {
        return sellcount;
    }

    public void setSellcount(Integer sellcount) {
        this.sellcount = sellcount;
    }

    public String getSexrequest() {
        return sexrequest;
    }

    public void setSexrequest(String sexrequest) {
        this.sexrequest = sexrequest == null ? null : sexrequest.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCommend() {
        return commend;
    }

    public void setCommend(String commend) {
        this.commend = commend == null ? null : commend.trim();
    }

    public Integer getUploadfileid() {
        return uploadfileid;
    }

    public void setUploadfileid(Integer uploadfileid) {
        this.uploadfileid = uploadfileid;
    }
}