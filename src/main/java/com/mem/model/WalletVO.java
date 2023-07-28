package com.mem.model;

import java.util.Date;

public class WalletVO {
    private int walletHistoryNo;
    private int memNo;
    private int transType; // 0: 提領 1: 儲值 2: 付款
    private Date transDate;
    private int accNo;
    private int bankNo;
    private int transNote; // 0:商城 1:競標 2:預約

    // Getters and Setters

    public int getWalletHistoryNo() {
        return walletHistoryNo;
    }

    public void setWalletHistoryNo(int walletHistoryNo) {
        this.walletHistoryNo = walletHistoryNo;
    }

    public int getMemNo() {
        return memNo;
    }

    public void setMemNo(int memNo) {
        this.memNo = memNo;
    }

    public int getTransType() {
        return transType;
    }

    public void setTransType(int transType) {
        this.transType = transType;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public int getBankNo() {
        return bankNo;
    }

    public void setBankNo(int bankNo) {
        this.bankNo = bankNo;
    }

    public int getTransNote() {
        return transNote;
    }

    public void setTransNote(int transNote) {
        this.transNote = transNote;
    }
}

