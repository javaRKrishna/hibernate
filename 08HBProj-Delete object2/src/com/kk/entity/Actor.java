//Actor.java (Entity class)
package com.kk.entity;

public final class Actor {
	private Integer id;
	private String actorName;
	private String addrs;
	private Long phone;
	private Float remuneration;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
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
		return "Actor [id=" + id + ", actorName=" + actorName + ", addrs=" + addrs + ", phone=" + phone
				+ ", remuneration=" + remuneration + "]";
	}

	
}
