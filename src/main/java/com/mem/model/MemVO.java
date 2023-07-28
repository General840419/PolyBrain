package com.mem.model;

import java.util.Date;

public class MemVO {
	public class MemberVO {
	    private int memNo;
	    private String memName;
	    private String memPid;
	    private int memGender; // 0:女 1:男
	    private byte[] memPic;
	    private String memEmail;
	    private String memPwd;
	    private String memPh;
	    private String memAddrs;
	    private Date memBirth;
	    private int memAuth; // 0: 黑名單 1: 普通
	    private int memVio;

	    // Getters and Setters

	    public int getMemNo() {
	        return memNo;
	    }

	    public void setMemNo(int memNo) {
	        this.memNo = memNo;
	    }

	    public String getMemName() {
	        return memName;
	    }

	    public void setMemName(String memName) {
	        this.memName = memName;
	    }

	    public String getMemPid() {
	        return memPid;
	    }

	    public void setMemPid(String memPid) {
	        this.memPid = memPid;
	    }

	    public int getMemGender() {
	        return memGender;
	    }

	    public void setMemGender(int memGender) {
	        this.memGender = memGender;
	    }

	    public byte[] getMemPic() {
	        return memPic;
	    }

	    public void setMemPic(byte[] memPic) {
	        this.memPic = memPic;
	    }

	    public String getMemEmail() {
	        return memEmail;
	    }

	    public void setMemEmail(String memEmail) {
	        this.memEmail = memEmail;
	    }

	    public String getMemPwd() {
	        return memPwd;
	    }

	    public void setMemPwd(String memPwd) {
	        this.memPwd = memPwd;
	    }

	    public String getMemPh() {
	        return memPh;
	    }

	    public void setMemPh(String memPh) {
	        this.memPh = memPh;
	    }

	    public String getMemAddrs() {
	        return memAddrs;
	    }

	    public void setMemAddrs(String memAddrs) {
	        this.memAddrs = memAddrs;
	    }

	    public Date getMemBirth() {
	        return memBirth;
	    }

	    public void setMemBirth(Date memBirth) {
	        this.memBirth = memBirth;
	    }

	    public int getMemAuth() {
	        return memAuth;
	    }

	    public void setMemAuth(int memAuth) {
	        this.memAuth = memAuth;
	    }

	    public int getMemVio() {
	        return memVio;
	    }

	    public void setMemVio(int memVio) {
	        this.memVio = memVio;
	    }
	}

}
