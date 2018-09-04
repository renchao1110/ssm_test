package com.hl95.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportExample() {
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

        public Criteria andPlatformIsNull() {
            addCriterion("PlatForm is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("PlatForm is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("PlatForm =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("PlatForm <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("PlatForm >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("PlatForm >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("PlatForm <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("PlatForm <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("PlatForm like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("PlatForm not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("PlatForm in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("PlatForm not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("PlatForm between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("PlatForm not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andFunikeyIsNull() {
            addCriterion("FUnikey is null");
            return (Criteria) this;
        }

        public Criteria andFunikeyIsNotNull() {
            addCriterion("FUnikey is not null");
            return (Criteria) this;
        }

        public Criteria andFunikeyEqualTo(String value) {
            addCriterion("FUnikey =", value, "funikey");
            return (Criteria) this;
        }

        public Criteria andFunikeyNotEqualTo(String value) {
            addCriterion("FUnikey <>", value, "funikey");
            return (Criteria) this;
        }

        public Criteria andFunikeyGreaterThan(String value) {
            addCriterion("FUnikey >", value, "funikey");
            return (Criteria) this;
        }

        public Criteria andFunikeyGreaterThanOrEqualTo(String value) {
            addCriterion("FUnikey >=", value, "funikey");
            return (Criteria) this;
        }

        public Criteria andFunikeyLessThan(String value) {
            addCriterion("FUnikey <", value, "funikey");
            return (Criteria) this;
        }

        public Criteria andFunikeyLessThanOrEqualTo(String value) {
            addCriterion("FUnikey <=", value, "funikey");
            return (Criteria) this;
        }

        public Criteria andFunikeyLike(String value) {
            addCriterion("FUnikey like", value, "funikey");
            return (Criteria) this;
        }

        public Criteria andFunikeyNotLike(String value) {
            addCriterion("FUnikey not like", value, "funikey");
            return (Criteria) this;
        }

        public Criteria andFunikeyIn(List<String> values) {
            addCriterion("FUnikey in", values, "funikey");
            return (Criteria) this;
        }

        public Criteria andFunikeyNotIn(List<String> values) {
            addCriterion("FUnikey not in", values, "funikey");
            return (Criteria) this;
        }

        public Criteria andFunikeyBetween(String value1, String value2) {
            addCriterion("FUnikey between", value1, value2, "funikey");
            return (Criteria) this;
        }

        public Criteria andFunikeyNotBetween(String value1, String value2) {
            addCriterion("FUnikey not between", value1, value2, "funikey");
            return (Criteria) this;
        }

        public Criteria andForgaddrIsNull() {
            addCriterion("FOrgAddr is null");
            return (Criteria) this;
        }

        public Criteria andForgaddrIsNotNull() {
            addCriterion("FOrgAddr is not null");
            return (Criteria) this;
        }

        public Criteria andForgaddrEqualTo(String value) {
            addCriterion("FOrgAddr =", value, "forgaddr");
            return (Criteria) this;
        }

        public Criteria andForgaddrNotEqualTo(String value) {
            addCriterion("FOrgAddr <>", value, "forgaddr");
            return (Criteria) this;
        }

        public Criteria andForgaddrGreaterThan(String value) {
            addCriterion("FOrgAddr >", value, "forgaddr");
            return (Criteria) this;
        }

        public Criteria andForgaddrGreaterThanOrEqualTo(String value) {
            addCriterion("FOrgAddr >=", value, "forgaddr");
            return (Criteria) this;
        }

        public Criteria andForgaddrLessThan(String value) {
            addCriterion("FOrgAddr <", value, "forgaddr");
            return (Criteria) this;
        }

        public Criteria andForgaddrLessThanOrEqualTo(String value) {
            addCriterion("FOrgAddr <=", value, "forgaddr");
            return (Criteria) this;
        }

        public Criteria andForgaddrLike(String value) {
            addCriterion("FOrgAddr like", value, "forgaddr");
            return (Criteria) this;
        }

        public Criteria andForgaddrNotLike(String value) {
            addCriterion("FOrgAddr not like", value, "forgaddr");
            return (Criteria) this;
        }

        public Criteria andForgaddrIn(List<String> values) {
            addCriterion("FOrgAddr in", values, "forgaddr");
            return (Criteria) this;
        }

        public Criteria andForgaddrNotIn(List<String> values) {
            addCriterion("FOrgAddr not in", values, "forgaddr");
            return (Criteria) this;
        }

        public Criteria andForgaddrBetween(String value1, String value2) {
            addCriterion("FOrgAddr between", value1, value2, "forgaddr");
            return (Criteria) this;
        }

        public Criteria andForgaddrNotBetween(String value1, String value2) {
            addCriterion("FOrgAddr not between", value1, value2, "forgaddr");
            return (Criteria) this;
        }

        public Criteria andFdestaddrIsNull() {
            addCriterion("FDestAddr is null");
            return (Criteria) this;
        }

        public Criteria andFdestaddrIsNotNull() {
            addCriterion("FDestAddr is not null");
            return (Criteria) this;
        }

        public Criteria andFdestaddrEqualTo(String value) {
            addCriterion("FDestAddr =", value, "fdestaddr");
            return (Criteria) this;
        }

        public Criteria andFdestaddrNotEqualTo(String value) {
            addCriterion("FDestAddr <>", value, "fdestaddr");
            return (Criteria) this;
        }

        public Criteria andFdestaddrGreaterThan(String value) {
            addCriterion("FDestAddr >", value, "fdestaddr");
            return (Criteria) this;
        }

        public Criteria andFdestaddrGreaterThanOrEqualTo(String value) {
            addCriterion("FDestAddr >=", value, "fdestaddr");
            return (Criteria) this;
        }

        public Criteria andFdestaddrLessThan(String value) {
            addCriterion("FDestAddr <", value, "fdestaddr");
            return (Criteria) this;
        }

        public Criteria andFdestaddrLessThanOrEqualTo(String value) {
            addCriterion("FDestAddr <=", value, "fdestaddr");
            return (Criteria) this;
        }

        public Criteria andFdestaddrLike(String value) {
            addCriterion("FDestAddr like", value, "fdestaddr");
            return (Criteria) this;
        }

        public Criteria andFdestaddrNotLike(String value) {
            addCriterion("FDestAddr not like", value, "fdestaddr");
            return (Criteria) this;
        }

        public Criteria andFdestaddrIn(List<String> values) {
            addCriterion("FDestAddr in", values, "fdestaddr");
            return (Criteria) this;
        }

        public Criteria andFdestaddrNotIn(List<String> values) {
            addCriterion("FDestAddr not in", values, "fdestaddr");
            return (Criteria) this;
        }

        public Criteria andFdestaddrBetween(String value1, String value2) {
            addCriterion("FDestAddr between", value1, value2, "fdestaddr");
            return (Criteria) this;
        }

        public Criteria andFdestaddrNotBetween(String value1, String value2) {
            addCriterion("FDestAddr not between", value1, value2, "fdestaddr");
            return (Criteria) this;
        }

        public Criteria andFsubmittimeIsNull() {
            addCriterion("FSubmitTime is null");
            return (Criteria) this;
        }

        public Criteria andFsubmittimeIsNotNull() {
            addCriterion("FSubmitTime is not null");
            return (Criteria) this;
        }

        public Criteria andFsubmittimeEqualTo(Date value) {
            addCriterion("FSubmitTime =", value, "fsubmittime");
            return (Criteria) this;
        }

        public Criteria andFsubmittimeNotEqualTo(Date value) {
            addCriterion("FSubmitTime <>", value, "fsubmittime");
            return (Criteria) this;
        }

        public Criteria andFsubmittimeGreaterThan(Date value) {
            addCriterion("FSubmitTime >", value, "fsubmittime");
            return (Criteria) this;
        }

        public Criteria andFsubmittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FSubmitTime >=", value, "fsubmittime");
            return (Criteria) this;
        }

        public Criteria andFsubmittimeLessThan(Date value) {
            addCriterion("FSubmitTime <", value, "fsubmittime");
            return (Criteria) this;
        }

        public Criteria andFsubmittimeLessThanOrEqualTo(Date value) {
            addCriterion("FSubmitTime <=", value, "fsubmittime");
            return (Criteria) this;
        }

        public Criteria andFsubmittimeIn(List<Date> values) {
            addCriterion("FSubmitTime in", values, "fsubmittime");
            return (Criteria) this;
        }

        public Criteria andFsubmittimeNotIn(List<Date> values) {
            addCriterion("FSubmitTime not in", values, "fsubmittime");
            return (Criteria) this;
        }

        public Criteria andFsubmittimeBetween(Date value1, Date value2) {
            addCriterion("FSubmitTime between", value1, value2, "fsubmittime");
            return (Criteria) this;
        }

        public Criteria andFsubmittimeNotBetween(Date value1, Date value2) {
            addCriterion("FSubmitTime not between", value1, value2, "fsubmittime");
            return (Criteria) this;
        }

        public Criteria andFfeeterminalIsNull() {
            addCriterion("FFeeTerminal is null");
            return (Criteria) this;
        }

        public Criteria andFfeeterminalIsNotNull() {
            addCriterion("FFeeTerminal is not null");
            return (Criteria) this;
        }

        public Criteria andFfeeterminalEqualTo(String value) {
            addCriterion("FFeeTerminal =", value, "ffeeterminal");
            return (Criteria) this;
        }

        public Criteria andFfeeterminalNotEqualTo(String value) {
            addCriterion("FFeeTerminal <>", value, "ffeeterminal");
            return (Criteria) this;
        }

        public Criteria andFfeeterminalGreaterThan(String value) {
            addCriterion("FFeeTerminal >", value, "ffeeterminal");
            return (Criteria) this;
        }

        public Criteria andFfeeterminalGreaterThanOrEqualTo(String value) {
            addCriterion("FFeeTerminal >=", value, "ffeeterminal");
            return (Criteria) this;
        }

        public Criteria andFfeeterminalLessThan(String value) {
            addCriterion("FFeeTerminal <", value, "ffeeterminal");
            return (Criteria) this;
        }

        public Criteria andFfeeterminalLessThanOrEqualTo(String value) {
            addCriterion("FFeeTerminal <=", value, "ffeeterminal");
            return (Criteria) this;
        }

        public Criteria andFfeeterminalLike(String value) {
            addCriterion("FFeeTerminal like", value, "ffeeterminal");
            return (Criteria) this;
        }

        public Criteria andFfeeterminalNotLike(String value) {
            addCriterion("FFeeTerminal not like", value, "ffeeterminal");
            return (Criteria) this;
        }

        public Criteria andFfeeterminalIn(List<String> values) {
            addCriterion("FFeeTerminal in", values, "ffeeterminal");
            return (Criteria) this;
        }

        public Criteria andFfeeterminalNotIn(List<String> values) {
            addCriterion("FFeeTerminal not in", values, "ffeeterminal");
            return (Criteria) this;
        }

        public Criteria andFfeeterminalBetween(String value1, String value2) {
            addCriterion("FFeeTerminal between", value1, value2, "ffeeterminal");
            return (Criteria) this;
        }

        public Criteria andFfeeterminalNotBetween(String value1, String value2) {
            addCriterion("FFeeTerminal not between", value1, value2, "ffeeterminal");
            return (Criteria) this;
        }

        public Criteria andFserviceupidIsNull() {
            addCriterion("FServiceUPID is null");
            return (Criteria) this;
        }

        public Criteria andFserviceupidIsNotNull() {
            addCriterion("FServiceUPID is not null");
            return (Criteria) this;
        }

        public Criteria andFserviceupidEqualTo(Integer value) {
            addCriterion("FServiceUPID =", value, "fserviceupid");
            return (Criteria) this;
        }

        public Criteria andFserviceupidNotEqualTo(Integer value) {
            addCriterion("FServiceUPID <>", value, "fserviceupid");
            return (Criteria) this;
        }

        public Criteria andFserviceupidGreaterThan(Integer value) {
            addCriterion("FServiceUPID >", value, "fserviceupid");
            return (Criteria) this;
        }

        public Criteria andFserviceupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FServiceUPID >=", value, "fserviceupid");
            return (Criteria) this;
        }

        public Criteria andFserviceupidLessThan(Integer value) {
            addCriterion("FServiceUPID <", value, "fserviceupid");
            return (Criteria) this;
        }

        public Criteria andFserviceupidLessThanOrEqualTo(Integer value) {
            addCriterion("FServiceUPID <=", value, "fserviceupid");
            return (Criteria) this;
        }

        public Criteria andFserviceupidIn(List<Integer> values) {
            addCriterion("FServiceUPID in", values, "fserviceupid");
            return (Criteria) this;
        }

        public Criteria andFserviceupidNotIn(List<Integer> values) {
            addCriterion("FServiceUPID not in", values, "fserviceupid");
            return (Criteria) this;
        }

        public Criteria andFserviceupidBetween(Integer value1, Integer value2) {
            addCriterion("FServiceUPID between", value1, value2, "fserviceupid");
            return (Criteria) this;
        }

        public Criteria andFserviceupidNotBetween(Integer value1, Integer value2) {
            addCriterion("FServiceUPID not between", value1, value2, "fserviceupid");
            return (Criteria) this;
        }

        public Criteria andFreportcodeIsNull() {
            addCriterion("FReportCode is null");
            return (Criteria) this;
        }

        public Criteria andFreportcodeIsNotNull() {
            addCriterion("FReportCode is not null");
            return (Criteria) this;
        }

        public Criteria andFreportcodeEqualTo(String value) {
            addCriterion("FReportCode =", value, "freportcode");
            return (Criteria) this;
        }

        public Criteria andFreportcodeNotEqualTo(String value) {
            addCriterion("FReportCode <>", value, "freportcode");
            return (Criteria) this;
        }

        public Criteria andFreportcodeGreaterThan(String value) {
            addCriterion("FReportCode >", value, "freportcode");
            return (Criteria) this;
        }

        public Criteria andFreportcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FReportCode >=", value, "freportcode");
            return (Criteria) this;
        }

        public Criteria andFreportcodeLessThan(String value) {
            addCriterion("FReportCode <", value, "freportcode");
            return (Criteria) this;
        }

        public Criteria andFreportcodeLessThanOrEqualTo(String value) {
            addCriterion("FReportCode <=", value, "freportcode");
            return (Criteria) this;
        }

        public Criteria andFreportcodeLike(String value) {
            addCriterion("FReportCode like", value, "freportcode");
            return (Criteria) this;
        }

        public Criteria andFreportcodeNotLike(String value) {
            addCriterion("FReportCode not like", value, "freportcode");
            return (Criteria) this;
        }

        public Criteria andFreportcodeIn(List<String> values) {
            addCriterion("FReportCode in", values, "freportcode");
            return (Criteria) this;
        }

        public Criteria andFreportcodeNotIn(List<String> values) {
            addCriterion("FReportCode not in", values, "freportcode");
            return (Criteria) this;
        }

        public Criteria andFreportcodeBetween(String value1, String value2) {
            addCriterion("FReportCode between", value1, value2, "freportcode");
            return (Criteria) this;
        }

        public Criteria andFreportcodeNotBetween(String value1, String value2) {
            addCriterion("FReportCode not between", value1, value2, "freportcode");
            return (Criteria) this;
        }

        public Criteria andFlinkidIsNull() {
            addCriterion("FLinkID is null");
            return (Criteria) this;
        }

        public Criteria andFlinkidIsNotNull() {
            addCriterion("FLinkID is not null");
            return (Criteria) this;
        }

        public Criteria andFlinkidEqualTo(Integer value) {
            addCriterion("FLinkID =", value, "flinkid");
            return (Criteria) this;
        }

        public Criteria andFlinkidNotEqualTo(Integer value) {
            addCriterion("FLinkID <>", value, "flinkid");
            return (Criteria) this;
        }

        public Criteria andFlinkidGreaterThan(Integer value) {
            addCriterion("FLinkID >", value, "flinkid");
            return (Criteria) this;
        }

        public Criteria andFlinkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FLinkID >=", value, "flinkid");
            return (Criteria) this;
        }

        public Criteria andFlinkidLessThan(Integer value) {
            addCriterion("FLinkID <", value, "flinkid");
            return (Criteria) this;
        }

        public Criteria andFlinkidLessThanOrEqualTo(Integer value) {
            addCriterion("FLinkID <=", value, "flinkid");
            return (Criteria) this;
        }

        public Criteria andFlinkidIn(List<Integer> values) {
            addCriterion("FLinkID in", values, "flinkid");
            return (Criteria) this;
        }

        public Criteria andFlinkidNotIn(List<Integer> values) {
            addCriterion("FLinkID not in", values, "flinkid");
            return (Criteria) this;
        }

        public Criteria andFlinkidBetween(Integer value1, Integer value2) {
            addCriterion("FLinkID between", value1, value2, "flinkid");
            return (Criteria) this;
        }

        public Criteria andFlinkidNotBetween(Integer value1, Integer value2) {
            addCriterion("FLinkID not between", value1, value2, "flinkid");
            return (Criteria) this;
        }

        public Criteria andFackstatusIsNull() {
            addCriterion("FAckStatus is null");
            return (Criteria) this;
        }

        public Criteria andFackstatusIsNotNull() {
            addCriterion("FAckStatus is not null");
            return (Criteria) this;
        }

        public Criteria andFackstatusEqualTo(String value) {
            addCriterion("FAckStatus =", value, "fackstatus");
            return (Criteria) this;
        }

        public Criteria andFackstatusNotEqualTo(String value) {
            addCriterion("FAckStatus <>", value, "fackstatus");
            return (Criteria) this;
        }

        public Criteria andFackstatusGreaterThan(String value) {
            addCriterion("FAckStatus >", value, "fackstatus");
            return (Criteria) this;
        }

        public Criteria andFackstatusGreaterThanOrEqualTo(String value) {
            addCriterion("FAckStatus >=", value, "fackstatus");
            return (Criteria) this;
        }

        public Criteria andFackstatusLessThan(String value) {
            addCriterion("FAckStatus <", value, "fackstatus");
            return (Criteria) this;
        }

        public Criteria andFackstatusLessThanOrEqualTo(String value) {
            addCriterion("FAckStatus <=", value, "fackstatus");
            return (Criteria) this;
        }

        public Criteria andFackstatusLike(String value) {
            addCriterion("FAckStatus like", value, "fackstatus");
            return (Criteria) this;
        }

        public Criteria andFackstatusNotLike(String value) {
            addCriterion("FAckStatus not like", value, "fackstatus");
            return (Criteria) this;
        }

        public Criteria andFackstatusIn(List<String> values) {
            addCriterion("FAckStatus in", values, "fackstatus");
            return (Criteria) this;
        }

        public Criteria andFackstatusNotIn(List<String> values) {
            addCriterion("FAckStatus not in", values, "fackstatus");
            return (Criteria) this;
        }

        public Criteria andFackstatusBetween(String value1, String value2) {
            addCriterion("FAckStatus between", value1, value2, "fackstatus");
            return (Criteria) this;
        }

        public Criteria andFackstatusNotBetween(String value1, String value2) {
            addCriterion("FAckStatus not between", value1, value2, "fackstatus");
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