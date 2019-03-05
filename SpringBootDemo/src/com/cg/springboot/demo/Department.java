package com.cg.springboot.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
	@Value("10")
	private int deptNo;
	@Value("Training")
	private String deptName;
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + "]";
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("init");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("destory");
	}

}
