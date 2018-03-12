package org.hzhang.studentserviceapi.domain;

/**
 * Created by xm180224 on 12/03/2018.
 */
public class Student {
	private String name;
	private String className;

	public Student() {
	}

	public Student(String name, String className) {
		super();
		this.name = name;
		this.className = className;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString(){
		return String.format("{name=%s,className=%s}", getName(), getClassName());
	}
}
