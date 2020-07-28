package com.wat.ssm.po;

public class Idcard {
    private Integer id;

    private String idcardcode;

    private String pic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdcardcode() {
        return idcardcode;
    }

    public void setIdcardcode(String idcardcode) {
        this.idcardcode = idcardcode == null ? null : idcardcode.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }
}