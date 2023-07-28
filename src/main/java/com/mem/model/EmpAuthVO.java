package com.mem.model;

public class EmpAuthVO {
    private int empNo;
    private String funcNo;

    // Constructors
    public EmpAuthVO() {
    }

    public EmpAuthVO(int empNo, String funcNo) {
        this.empNo = empNo;
        this.funcNo = funcNo;
    }

    // Getters and Setters
    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getFuncNo() {
        return funcNo;
    }

    public void setFuncNo(String funcNo) {
        this.funcNo = funcNo;
    }
}

