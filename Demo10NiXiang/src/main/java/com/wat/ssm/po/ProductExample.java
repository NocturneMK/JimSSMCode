package com.wat.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNull() {
            addCriterion("CATEGORYID is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("CATEGORYID is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(Integer value) {
            addCriterion("CATEGORYID =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(Integer value) {
            addCriterion("CATEGORYID <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(Integer value) {
            addCriterion("CATEGORYID >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CATEGORYID >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(Integer value) {
            addCriterion("CATEGORYID <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("CATEGORYID <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<Integer> values) {
            addCriterion("CATEGORYID in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<Integer> values) {
            addCriterion("CATEGORYID not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(Integer value1, Integer value2) {
            addCriterion("CATEGORYID between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("CATEGORYID not between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andBasepriceIsNull() {
            addCriterion("BASEPRICE is null");
            return (Criteria) this;
        }

        public Criteria andBasepriceIsNotNull() {
            addCriterion("BASEPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andBasepriceEqualTo(Double value) {
            addCriterion("BASEPRICE =", value, "baseprice");
            return (Criteria) this;
        }

        public Criteria andBasepriceNotEqualTo(Double value) {
            addCriterion("BASEPRICE <>", value, "baseprice");
            return (Criteria) this;
        }

        public Criteria andBasepriceGreaterThan(Double value) {
            addCriterion("BASEPRICE >", value, "baseprice");
            return (Criteria) this;
        }

        public Criteria andBasepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("BASEPRICE >=", value, "baseprice");
            return (Criteria) this;
        }

        public Criteria andBasepriceLessThan(Double value) {
            addCriterion("BASEPRICE <", value, "baseprice");
            return (Criteria) this;
        }

        public Criteria andBasepriceLessThanOrEqualTo(Double value) {
            addCriterion("BASEPRICE <=", value, "baseprice");
            return (Criteria) this;
        }

        public Criteria andBasepriceIn(List<Double> values) {
            addCriterion("BASEPRICE in", values, "baseprice");
            return (Criteria) this;
        }

        public Criteria andBasepriceNotIn(List<Double> values) {
            addCriterion("BASEPRICE not in", values, "baseprice");
            return (Criteria) this;
        }

        public Criteria andBasepriceBetween(Double value1, Double value2) {
            addCriterion("BASEPRICE between", value1, value2, "baseprice");
            return (Criteria) this;
        }

        public Criteria andBasepriceNotBetween(Double value1, Double value2) {
            addCriterion("BASEPRICE not between", value1, value2, "baseprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIsNull() {
            addCriterion("MARKETPRICE is null");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIsNotNull() {
            addCriterion("MARKETPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andMarketpriceEqualTo(Double value) {
            addCriterion("MARKETPRICE =", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotEqualTo(Double value) {
            addCriterion("MARKETPRICE <>", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceGreaterThan(Double value) {
            addCriterion("MARKETPRICE >", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("MARKETPRICE >=", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceLessThan(Double value) {
            addCriterion("MARKETPRICE <", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceLessThanOrEqualTo(Double value) {
            addCriterion("MARKETPRICE <=", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIn(List<Double> values) {
            addCriterion("MARKETPRICE in", values, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotIn(List<Double> values) {
            addCriterion("MARKETPRICE not in", values, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceBetween(Double value1, Double value2) {
            addCriterion("MARKETPRICE between", value1, value2, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotBetween(Double value1, Double value2) {
            addCriterion("MARKETPRICE not between", value1, value2, "marketprice");
            return (Criteria) this;
        }

        public Criteria andSellpriceIsNull() {
            addCriterion("SELLPRICE is null");
            return (Criteria) this;
        }

        public Criteria andSellpriceIsNotNull() {
            addCriterion("SELLPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSellpriceEqualTo(Double value) {
            addCriterion("SELLPRICE =", value, "sellprice");
            return (Criteria) this;
        }

        public Criteria andSellpriceNotEqualTo(Double value) {
            addCriterion("SELLPRICE <>", value, "sellprice");
            return (Criteria) this;
        }

        public Criteria andSellpriceGreaterThan(Double value) {
            addCriterion("SELLPRICE >", value, "sellprice");
            return (Criteria) this;
        }

        public Criteria andSellpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("SELLPRICE >=", value, "sellprice");
            return (Criteria) this;
        }

        public Criteria andSellpriceLessThan(Double value) {
            addCriterion("SELLPRICE <", value, "sellprice");
            return (Criteria) this;
        }

        public Criteria andSellpriceLessThanOrEqualTo(Double value) {
            addCriterion("SELLPRICE <=", value, "sellprice");
            return (Criteria) this;
        }

        public Criteria andSellpriceIn(List<Double> values) {
            addCriterion("SELLPRICE in", values, "sellprice");
            return (Criteria) this;
        }

        public Criteria andSellpriceNotIn(List<Double> values) {
            addCriterion("SELLPRICE not in", values, "sellprice");
            return (Criteria) this;
        }

        public Criteria andSellpriceBetween(Double value1, Double value2) {
            addCriterion("SELLPRICE between", value1, value2, "sellprice");
            return (Criteria) this;
        }

        public Criteria andSellpriceNotBetween(Double value1, Double value2) {
            addCriterion("SELLPRICE not between", value1, value2, "sellprice");
            return (Criteria) this;
        }

        public Criteria andSellcountIsNull() {
            addCriterion("SELLCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSellcountIsNotNull() {
            addCriterion("SELLCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSellcountEqualTo(Integer value) {
            addCriterion("SELLCOUNT =", value, "sellcount");
            return (Criteria) this;
        }

        public Criteria andSellcountNotEqualTo(Integer value) {
            addCriterion("SELLCOUNT <>", value, "sellcount");
            return (Criteria) this;
        }

        public Criteria andSellcountGreaterThan(Integer value) {
            addCriterion("SELLCOUNT >", value, "sellcount");
            return (Criteria) this;
        }

        public Criteria andSellcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("SELLCOUNT >=", value, "sellcount");
            return (Criteria) this;
        }

        public Criteria andSellcountLessThan(Integer value) {
            addCriterion("SELLCOUNT <", value, "sellcount");
            return (Criteria) this;
        }

        public Criteria andSellcountLessThanOrEqualTo(Integer value) {
            addCriterion("SELLCOUNT <=", value, "sellcount");
            return (Criteria) this;
        }

        public Criteria andSellcountIn(List<Integer> values) {
            addCriterion("SELLCOUNT in", values, "sellcount");
            return (Criteria) this;
        }

        public Criteria andSellcountNotIn(List<Integer> values) {
            addCriterion("SELLCOUNT not in", values, "sellcount");
            return (Criteria) this;
        }

        public Criteria andSellcountBetween(Integer value1, Integer value2) {
            addCriterion("SELLCOUNT between", value1, value2, "sellcount");
            return (Criteria) this;
        }

        public Criteria andSellcountNotBetween(Integer value1, Integer value2) {
            addCriterion("SELLCOUNT not between", value1, value2, "sellcount");
            return (Criteria) this;
        }

        public Criteria andSexrequestIsNull() {
            addCriterion("SEXREQUEST is null");
            return (Criteria) this;
        }

        public Criteria andSexrequestIsNotNull() {
            addCriterion("SEXREQUEST is not null");
            return (Criteria) this;
        }

        public Criteria andSexrequestEqualTo(String value) {
            addCriterion("SEXREQUEST =", value, "sexrequest");
            return (Criteria) this;
        }

        public Criteria andSexrequestNotEqualTo(String value) {
            addCriterion("SEXREQUEST <>", value, "sexrequest");
            return (Criteria) this;
        }

        public Criteria andSexrequestGreaterThan(String value) {
            addCriterion("SEXREQUEST >", value, "sexrequest");
            return (Criteria) this;
        }

        public Criteria andSexrequestGreaterThanOrEqualTo(String value) {
            addCriterion("SEXREQUEST >=", value, "sexrequest");
            return (Criteria) this;
        }

        public Criteria andSexrequestLessThan(String value) {
            addCriterion("SEXREQUEST <", value, "sexrequest");
            return (Criteria) this;
        }

        public Criteria andSexrequestLessThanOrEqualTo(String value) {
            addCriterion("SEXREQUEST <=", value, "sexrequest");
            return (Criteria) this;
        }

        public Criteria andSexrequestLike(String value) {
            addCriterion("SEXREQUEST like", value, "sexrequest");
            return (Criteria) this;
        }

        public Criteria andSexrequestNotLike(String value) {
            addCriterion("SEXREQUEST not like", value, "sexrequest");
            return (Criteria) this;
        }

        public Criteria andSexrequestIn(List<String> values) {
            addCriterion("SEXREQUEST in", values, "sexrequest");
            return (Criteria) this;
        }

        public Criteria andSexrequestNotIn(List<String> values) {
            addCriterion("SEXREQUEST not in", values, "sexrequest");
            return (Criteria) this;
        }

        public Criteria andSexrequestBetween(String value1, String value2) {
            addCriterion("SEXREQUEST between", value1, value2, "sexrequest");
            return (Criteria) this;
        }

        public Criteria andSexrequestNotBetween(String value1, String value2) {
            addCriterion("SEXREQUEST not between", value1, value2, "sexrequest");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCommendIsNull() {
            addCriterion("COMMEND is null");
            return (Criteria) this;
        }

        public Criteria andCommendIsNotNull() {
            addCriterion("COMMEND is not null");
            return (Criteria) this;
        }

        public Criteria andCommendEqualTo(String value) {
            addCriterion("COMMEND =", value, "commend");
            return (Criteria) this;
        }

        public Criteria andCommendNotEqualTo(String value) {
            addCriterion("COMMEND <>", value, "commend");
            return (Criteria) this;
        }

        public Criteria andCommendGreaterThan(String value) {
            addCriterion("COMMEND >", value, "commend");
            return (Criteria) this;
        }

        public Criteria andCommendGreaterThanOrEqualTo(String value) {
            addCriterion("COMMEND >=", value, "commend");
            return (Criteria) this;
        }

        public Criteria andCommendLessThan(String value) {
            addCriterion("COMMEND <", value, "commend");
            return (Criteria) this;
        }

        public Criteria andCommendLessThanOrEqualTo(String value) {
            addCriterion("COMMEND <=", value, "commend");
            return (Criteria) this;
        }

        public Criteria andCommendLike(String value) {
            addCriterion("COMMEND like", value, "commend");
            return (Criteria) this;
        }

        public Criteria andCommendNotLike(String value) {
            addCriterion("COMMEND not like", value, "commend");
            return (Criteria) this;
        }

        public Criteria andCommendIn(List<String> values) {
            addCriterion("COMMEND in", values, "commend");
            return (Criteria) this;
        }

        public Criteria andCommendNotIn(List<String> values) {
            addCriterion("COMMEND not in", values, "commend");
            return (Criteria) this;
        }

        public Criteria andCommendBetween(String value1, String value2) {
            addCriterion("COMMEND between", value1, value2, "commend");
            return (Criteria) this;
        }

        public Criteria andCommendNotBetween(String value1, String value2) {
            addCriterion("COMMEND not between", value1, value2, "commend");
            return (Criteria) this;
        }

        public Criteria andUploadfileidIsNull() {
            addCriterion("uploadfileid is null");
            return (Criteria) this;
        }

        public Criteria andUploadfileidIsNotNull() {
            addCriterion("uploadfileid is not null");
            return (Criteria) this;
        }

        public Criteria andUploadfileidEqualTo(Integer value) {
            addCriterion("uploadfileid =", value, "uploadfileid");
            return (Criteria) this;
        }

        public Criteria andUploadfileidNotEqualTo(Integer value) {
            addCriterion("uploadfileid <>", value, "uploadfileid");
            return (Criteria) this;
        }

        public Criteria andUploadfileidGreaterThan(Integer value) {
            addCriterion("uploadfileid >", value, "uploadfileid");
            return (Criteria) this;
        }

        public Criteria andUploadfileidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uploadfileid >=", value, "uploadfileid");
            return (Criteria) this;
        }

        public Criteria andUploadfileidLessThan(Integer value) {
            addCriterion("uploadfileid <", value, "uploadfileid");
            return (Criteria) this;
        }

        public Criteria andUploadfileidLessThanOrEqualTo(Integer value) {
            addCriterion("uploadfileid <=", value, "uploadfileid");
            return (Criteria) this;
        }

        public Criteria andUploadfileidIn(List<Integer> values) {
            addCriterion("uploadfileid in", values, "uploadfileid");
            return (Criteria) this;
        }

        public Criteria andUploadfileidNotIn(List<Integer> values) {
            addCriterion("uploadfileid not in", values, "uploadfileid");
            return (Criteria) this;
        }

        public Criteria andUploadfileidBetween(Integer value1, Integer value2) {
            addCriterion("uploadfileid between", value1, value2, "uploadfileid");
            return (Criteria) this;
        }

        public Criteria andUploadfileidNotBetween(Integer value1, Integer value2) {
            addCriterion("uploadfileid not between", value1, value2, "uploadfileid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}