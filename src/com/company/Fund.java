package com.company;

import java.text.MessageFormat;
import java.util.Objects;

public class Fund {
    public static int LOONIES = 1;
    public static int TOONIES = 2;
    public static int FIVEBILL = 5;
    public static int TENBILL = 10;
    public static int TWENTYBILL = 20;

    public int getLooniesFund() {
        return looniesFund;
    }

    public void setLooniesFund(int looniesFund) {
        this.looniesFund = looniesFund;
    }

    public int getTooniesFund() {
        return tooniesFund;
    }

    public void setTooniesFund(int tooniesFund) {
        this.tooniesFund = tooniesFund;
    }

    public int getFiveBillFund() {
        return fiveBillFund;
    }

    public void setFiveBillFund(int fiveBillFund) {
        this.fiveBillFund = fiveBillFund;
    }

    public int getTenBillFund() {
        return tenBillFund;
    }

    public void setTenBillFund(int tenBillFund) {
        this.tenBillFund = tenBillFund;
    }

    public int getTwentyBillFund() {
        return twentyBillFund;
    }

    public void setTwentyBillFund(int twentyBillFund) {
        this.twentyBillFund = twentyBillFund;
    }

    public int looniesFund;
    public int tooniesFund;
    public int fiveBillFund;
    public int tenBillFund;
    public int twentyBillFund;
    public Fund() {
        this.looniesFund = 0;
        this.tooniesFund = 0;
        this.fiveBillFund = 0;
        this.tenBillFund = 0;
        this.twentyBillFund = 0;
    }
    public Fund(int tooniesFund, int looniesFund, int fiveBillFund, int tenBillFund, int twentyBillFund) {
        this.looniesFund = looniesFund;
        this.tooniesFund = tooniesFund;
        this.fiveBillFund = fiveBillFund;
        this.tenBillFund = tenBillFund;
        this.twentyBillFund = twentyBillFund;
    }

    public Fund(Fund fund) {
        tooniesFund = fund.tooniesFund;
        looniesFund = fund.looniesFund;
        fiveBillFund = fund.fiveBillFund;
        tenBillFund = fund.tenBillFund;
        twentyBillFund = fund.twentyBillFund;
    }

    public void addFund(int tooniesFund, int looniesFund, int fiveBillFund, int tenBillFund, int twentyBillFund) {
        this.tooniesFund += tooniesFund;
        this.looniesFund += looniesFund;
        this.fiveBillFund += fiveBillFund;
        this.tenBillFund += tenBillFund;
        this.twentyBillFund += twentyBillFund;
    }

    public int fundTotal(int tooniesFund, int looniesFund, int fiveBillFund, int tenBillFund, int twentyBillFund) {
        int total = tooniesFund * TOONIES + looniesFund * LOONIES + fiveBillFund * FIVEBILL + tenBillFund * TENBILL + twentyBillFund * TWENTYBILL;
        return total;
    }

    @Override
    public String toString() {
        String fundsString = "(" + this.tooniesFund + "x $1)" + "+" + "(" + this.looniesFund + "x $2)" + "+" + "(" + this.fiveBillFund + "x $5)" + "+" + "(" + this.tenBillFund + "x $10)" + "+" + "(" + this.twentyBillFund + "x $20)";
        return fundsString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fund fund = (Fund) o;
        return looniesFund == fund.looniesFund && tooniesFund == fund.tooniesFund && fiveBillFund == fund.fiveBillFund && tenBillFund == fund.tenBillFund && twentyBillFund == fund.twentyBillFund;
    }

    @Override
    public int hashCode() {
        return Objects.hash(looniesFund, tooniesFund, fiveBillFund, tenBillFund, twentyBillFund);
    }
}
