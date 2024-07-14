package com.excelr.model;

public class Consumer {
 private int cid;
 private String cname;
 private double creading;
 private double preading;
Consumer() {
	super();
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public double getCreading() {
	return creading;
}
public void setCreading(double creading) {
	this.creading = creading;
}
public double getPreading() {
	return preading;
}
public void setPreading(double preading) {
	this.preading = preading;
}
@Override
public String toString() {
	return "Consumer [cid=" + cid + ", cname=" + cname + ", creading=" + creading + ", preading=" + preading + "]";
}
 
 
}
