package com.wat.bean;

public class Idcard {
        private    Integer  id; 
        private    String   idcardcode;    //身份证号
        private    String   pic;           //身份证图片
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
			this.idcardcode = idcardcode;
		}
		public String getPic() {
			return pic;
		}
		public void setPic(String pic) {
			this.pic = pic;
		}
        
}
