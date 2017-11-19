package com.test.easypoi.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 测试人员类
 * @author JueYue
 *   2014年7月26日 下午10:51:30
 */
public class Person {

	@Excel(name = "身份证号")
    private String sfzh;
	
	@Excel(name = "姓名")
    private String name;
	
    @Excel(name = "性别")
    private String sex;
    
    @Excel(name = "年龄")
    private String age;
    
    @Excel(name = "籍贯")
    private String origin;
    
    @Excel(name = "学历职称")
    private String academTitle;
    
    @Excel(name = "工作单位及职务")
    private String jobInfo;
    
    @Excel(name = "手机")
    private String tel;
    
    @Excel(name = "Email")
    private String email;
    
    @Excel(name = "地域")
    private String district;
    
    @Excel(name = "现住地")
    private String address;
    
    @Excel(name = "所属领域")
    private String academFileds;
    
    @Excel(name = "全部信息")
    private String allinfo;
    
    @Excel(name = "成果概要")
    private String achievementsS;

    @Excel(name = "行业")
    private String industry;
    
    @Excel(name = "企业")
    private String enterprises;
    
    @Excel(name = "分类")
    private String categories;

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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	

	public String getAcademTitle() {
		return academTitle;
	}

	public void setAcademTitle(String academTitle) {
		this.academTitle = academTitle;
	}

	public String getJobInfo() {
		return jobInfo;
	}

	public void setJobInfo(String jobInfo) {
		this.jobInfo = jobInfo;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAcademFileds() {
		return academFileds;
	}

	public void setAcademFileds(String academFileds) {
		this.academFileds = academFileds;
	}
	
	public String getAllinfo() {
		return allinfo;
	}

	public void setAllinfo(String allinfo) {
		this.allinfo = allinfo;
	}

	public String getAchievementsS() {
		return achievementsS;
	}

	public void setAchievementsS(String achievementsS) {
		this.achievementsS = achievementsS;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getEnterprises() {
		return enterprises;
	}

	public void setEnterprises(String enterprises) {
		this.enterprises = enterprises;
	}
	
	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "Person [sfzh=" + sfzh + ", name=" + name + ", sex=" + sex
				+ ", age=" + age + ", origin=" + origin + ", academTitle="
				+ academTitle + ", jobInfo=" + jobInfo + ", tel=" + tel
				+ ", email=" + email + ", district=" + district + ", address="
				+ address + ", academFileds=" + academFileds + ", allinfo="
				+ allinfo + ", achievementsS=" + achievementsS + ", industry="
				+ industry + ", enterprises=" + enterprises + "]";
	}
}
