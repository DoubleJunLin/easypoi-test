package com.test.easypoi.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 
 * @author linjj
 * 人工作经历
 */
public class PersonWorkExperiences {

	@Excel(name = "身份证号")
    private String sfzh;
	
	@Excel(name = "姓名")
    private String name;
    
	@Excel(name = "工作时间")
    private String timeSolt;
	
	@Excel(name = "单位名称")
    private String comname;
	
    @Excel(name = "职位")
    private String position;
    
    @Excel(name = "简介")
    private String simpleinfo;
	
	public String getTimeSolt() {
		return timeSolt;
	}

	public void setTimeSolt(String timeSolt) {
		this.timeSolt = timeSolt;
	}

	public String getSfzh() {
		return sfzh;
	}

	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}

	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	

	public String getComname() {
		return comname;
	}

	public void setComname(String comname) {
		this.comname = comname;
	}

	public String getSimpleinfo() {
		return simpleinfo;
	}

	public void setSimpleinfo(String simpleinfo) {
		this.simpleinfo = simpleinfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PersonWorkExperiences [sfzh=" + sfzh + ", name=" + name
				+ ", timeSolt=" + timeSolt + ", comname=" + comname
				+ ", position=" + position + ", simpleinfo=" + simpleinfo + "]";
	}
}
