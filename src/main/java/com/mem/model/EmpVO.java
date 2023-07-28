package com.mem.model;

public class EmpVO {
    private int empNo;
    private String empName;
    private int empGender;
    private String empEmail;
    private String empPwd;
    private String funcNo;
    private String empPh;
    private byte[] empPic;
    private int empState;

    // Constructor
    public EmpVO() {
    }

    // Getters and Setters
    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpGender() {
        return empGender;
    }

    public void setEmpGender(int empGender) {
        this.empGender = empGender;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpPwd() {
        return empPwd;
    }

    public void setEmpPwd(String empPwd) {
        this.empPwd = empPwd;
    }

    public String getFuncNo() {
        return funcNo;
    }

    public void setFuncNo(String funcNo) {
        this.funcNo = funcNo;
    }

    public String getEmpPh() {
        return empPh;
    }

    public void setEmpPh(String empPh) {
        this.empPh = empPh;
    }

    public byte[] getEmpPic() {
        return empPic;
    }

    public void setEmpPic(byte[] empPic) {
        this.empPic = empPic;
    }

    public int getEmpState() {
        return empState;
    }

    public void setEmpState(int empState) {
        this.empState = empState;
    }

}
