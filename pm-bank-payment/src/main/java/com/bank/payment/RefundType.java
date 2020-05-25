package com.bank.payment;

public enum RefundType {

    RETURN("RETURN", "RETURN"),
    REFUND("REFUND", "REFUND");

    RefundType(String code, String msg) {
    }

    public String code;

    public String msg;


    @Override
    public String toString() {
        return super.toString();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
