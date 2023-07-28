package com.mem.model;

public class FuncVO {
    private String funcNo;
    private String funcName;

    public FuncVO(String funcNo, String funcName) {
        this.funcNo = funcNo;
        this.funcName = funcName;
    }

    public String getFuncNo() {
        return funcNo;
    }

    public void setFuncNo(String funcNo) {
        this.funcNo = funcNo;
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }
}
