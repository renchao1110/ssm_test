package com.hl95.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class UpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UpExample() {
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andMsgcontentIsNull() {
            addCriterion("msgContent is null");
            return (Criteria) this;
        }

        public Criteria andMsgcontentIsNotNull() {
            addCriterion("msgContent is not null");
            return (Criteria) this;
        }

        public Criteria andMsgcontentEqualTo(String value) {
            addCriterion("msgContent =", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentNotEqualTo(String value) {
            addCriterion("msgContent <>", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentGreaterThan(String value) {
            addCriterion("msgContent >", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentGreaterThanOrEqualTo(String value) {
            addCriterion("msgContent >=", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentLessThan(String value) {
            addCriterion("msgContent <", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentLessThanOrEqualTo(String value) {
            addCriterion("msgContent <=", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentLike(String value) {
            addCriterion("msgContent like", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentNotLike(String value) {
            addCriterion("msgContent not like", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentIn(List<String> values) {
            addCriterion("msgContent in", values, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentNotIn(List<String> values) {
            addCriterion("msgContent not in", values, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentBetween(String value1, String value2) {
            addCriterion("msgContent between", value1, value2, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentNotBetween(String value1, String value2) {
            addCriterion("msgContent not between", value1, value2, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andSpnumberIsNull() {
            addCriterion("spNumber is null");
            return (Criteria) this;
        }

        public Criteria andSpnumberIsNotNull() {
            addCriterion("spNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSpnumberEqualTo(Integer value) {
            addCriterion("spNumber =", value, "spnumber");
            return (Criteria) this;
        }

        public Criteria andSpnumberNotEqualTo(Integer value) {
            addCriterion("spNumber <>", value, "spnumber");
            return (Criteria) this;
        }

        public Criteria andSpnumberGreaterThan(Integer value) {
            addCriterion("spNumber >", value, "spnumber");
            return (Criteria) this;
        }

        public Criteria andSpnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("spNumber >=", value, "spnumber");
            return (Criteria) this;
        }

        public Criteria andSpnumberLessThan(Integer value) {
            addCriterion("spNumber <", value, "spnumber");
            return (Criteria) this;
        }

        public Criteria andSpnumberLessThanOrEqualTo(Integer value) {
            addCriterion("spNumber <=", value, "spnumber");
            return (Criteria) this;
        }

        public Criteria andSpnumberIn(List<Integer> values) {
            addCriterion("spNumber in", values, "spnumber");
            return (Criteria) this;
        }

        public Criteria andSpnumberNotIn(List<Integer> values) {
            addCriterion("spNumber not in", values, "spnumber");
            return (Criteria) this;
        }

        public Criteria andSpnumberBetween(Integer value1, Integer value2) {
            addCriterion("spNumber between", value1, value2, "spnumber");
            return (Criteria) this;
        }

        public Criteria andSpnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("spNumber not between", value1, value2, "spnumber");
            return (Criteria) this;
        }

        public Criteria andLinkidIsNull() {
            addCriterion("linkid is null");
            return (Criteria) this;
        }

        public Criteria andLinkidIsNotNull() {
            addCriterion("linkid is not null");
            return (Criteria) this;
        }

        public Criteria andLinkidEqualTo(Integer value) {
            addCriterion("linkid =", value, "linkid");
            return (Criteria) this;
        }

        public Criteria andLinkidNotEqualTo(Integer value) {
            addCriterion("linkid <>", value, "linkid");
            return (Criteria) this;
        }

        public Criteria andLinkidGreaterThan(Integer value) {
            addCriterion("linkid >", value, "linkid");
            return (Criteria) this;
        }

        public Criteria andLinkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("linkid >=", value, "linkid");
            return (Criteria) this;
        }

        public Criteria andLinkidLessThan(Integer value) {
            addCriterion("linkid <", value, "linkid");
            return (Criteria) this;
        }

        public Criteria andLinkidLessThanOrEqualTo(Integer value) {
            addCriterion("linkid <=", value, "linkid");
            return (Criteria) this;
        }

        public Criteria andLinkidIn(List<Integer> values) {
            addCriterion("linkid in", values, "linkid");
            return (Criteria) this;
        }

        public Criteria andLinkidNotIn(List<Integer> values) {
            addCriterion("linkid not in", values, "linkid");
            return (Criteria) this;
        }

        public Criteria andLinkidBetween(Integer value1, Integer value2) {
            addCriterion("linkid between", value1, value2, "linkid");
            return (Criteria) this;
        }

        public Criteria andLinkidNotBetween(Integer value1, Integer value2) {
            addCriterion("linkid not between", value1, value2, "linkid");
            return (Criteria) this;
        }

        public Criteria andServiceupIsNull() {
            addCriterion("serviceup is null");
            return (Criteria) this;
        }

        public Criteria andServiceupIsNotNull() {
            addCriterion("serviceup is not null");
            return (Criteria) this;
        }

        public Criteria andServiceupEqualTo(String value) {
            addCriterion("serviceup =", value, "serviceup");
            return (Criteria) this;
        }

        public Criteria andServiceupNotEqualTo(String value) {
            addCriterion("serviceup <>", value, "serviceup");
            return (Criteria) this;
        }

        public Criteria andServiceupGreaterThan(String value) {
            addCriterion("serviceup >", value, "serviceup");
            return (Criteria) this;
        }

        public Criteria andServiceupGreaterThanOrEqualTo(String value) {
            addCriterion("serviceup >=", value, "serviceup");
            return (Criteria) this;
        }

        public Criteria andServiceupLessThan(String value) {
            addCriterion("serviceup <", value, "serviceup");
            return (Criteria) this;
        }

        public Criteria andServiceupLessThanOrEqualTo(String value) {
            addCriterion("serviceup <=", value, "serviceup");
            return (Criteria) this;
        }

        public Criteria andServiceupLike(String value) {
            addCriterion("serviceup like", value, "serviceup");
            return (Criteria) this;
        }

        public Criteria andServiceupNotLike(String value) {
            addCriterion("serviceup not like", value, "serviceup");
            return (Criteria) this;
        }

        public Criteria andServiceupIn(List<String> values) {
            addCriterion("serviceup in", values, "serviceup");
            return (Criteria) this;
        }

        public Criteria andServiceupNotIn(List<String> values) {
            addCriterion("serviceup not in", values, "serviceup");
            return (Criteria) this;
        }

        public Criteria andServiceupBetween(String value1, String value2) {
            addCriterion("serviceup between", value1, value2, "serviceup");
            return (Criteria) this;
        }

        public Criteria andServiceupNotBetween(String value1, String value2) {
            addCriterion("serviceup not between", value1, value2, "serviceup");
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