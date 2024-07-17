package com.tka.Spring.demo;

public class allcardetails {
	int carid;
	String carname;
	String carowner;
	int carprice;

	public allcardetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public allcardetails(int carid, String carname, String carowner, int carprice) {
		super();
		this.carid = carid;
		this.carname = carname;
		this.carowner = carowner;
		this.carprice = carprice;
	}

	@Override
	public String toString() {
		return "allcardetails [carid=" + carid + ", carname=" + carname + ", carowner=" + carowner + ", carprice="
				+ carprice + "]";
	}

	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getCarowner() {
		return carowner;
	}

	public void setCarowner(String carowner) {
		this.carowner = carowner;
	}

	public int getCarprice() {
		return carprice;
	}

	public void setCarprice(int carprice) {
		this.carprice = carprice;
	}

}
