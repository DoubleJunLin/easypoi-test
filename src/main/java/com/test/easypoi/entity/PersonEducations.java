package com.test.easypoi.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 
 * @author linjj
 * 人教育经历
 */
public class PersonEducations {

	@Excel(name = "身份证号")
    private String sfzh;
	
	@Excel(name = "姓名")
    private String name;
	
	@Excel(name = "在校时间")
    private String timeSolt;
	
	@Excel(name = "学校名称")
    private String sclname;
	
    @Excel(name = "专业")
    private String major;
    
    @Excel(name = "学历")
    private String degree;
    

	public String getTimeSolt() {
		return timeSolt;
	}

	public void setTimeSolt(String timeSolt) {
		this.timeSolt = timeSolt;
	}

	public String getSclname() {
		return sclname;
	}

	public void setSclname(String sclname) {
		this.sclname = sclname;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
	

	public String getSfzh() {
		return sfzh;
	}

	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PersonEducations [sfzh=" + sfzh + ", name=" + name
				+ ", timeSolt=" + timeSolt + ", sclname=" + sclname
				+ ", major=" + major + ", degree=" + degree + "]";
	}
	
}
