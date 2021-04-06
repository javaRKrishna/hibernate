//Actor.java (Entity class)
package com.kk.entity;

public class Actor {
	private int id;
	private String actorName;
	private String addrs;
	private long phone;
	private float remuneration;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public float getRemuneration() {
		return remuneration;
	}

	public void setRemuneration(float remuneration) {
		this.remuneration = remuneration;
	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", actorName=" + actorName + ", addrs=" + addrs + ", phone=" + phone
				+ ", remuneration=" + remuneration + "]";
	}
}
