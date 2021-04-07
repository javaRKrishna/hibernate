//Actor.java (Entity class)
package com.kk.entity;

public  class Actor implements IActor {
	private Integer Id;
	private String actorName;
	private String Addrs;
	private Long phone;
	private Float remuneration;
	
	public Actor() {
		System.out.println("Actor: 0-param construcotr"+this.getClass()+" ---->"+this.getClass().getSuperclass());
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getAddrs() {
		return Addrs;
	}

	public void setAddrs(String addrs) {
		Addrs = addrs;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Float getRemuneration() {
		return remuneration;
	}

	public void setRemuneration(Float remuneration) {
		this.remuneration = remuneration;
	}

	@Override
	public String toString() {
		return "Actor [Id=" + Id + ", actorName=" + actorName + ", Addrs=" + Addrs + ", phone=" + phone
				+ ", remuneration=" + remuneration + "]";
	}

	@Override
	public Integer getActorId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setActorId(Integer actorId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getActorAddrs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setActorAddrs(String actorAddrs) {
		// TODO Auto-generated method stub
		
	}

}
