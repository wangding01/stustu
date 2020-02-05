package com.study.demo.day0204;

/**
 * 
 * @author wangding
 * @date 2020年2月5日 下午3:17:30
 * @Description：set集合的bean
 */
public class SetCollectionBean {
	private String name;
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public SetCollectionBean(String name, String age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		System.out.println("当前hashcode:" + super.hashCode());
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "SetCollectionBean：" + this.name + this.age;
	}
}
