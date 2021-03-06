package org.maruhan.domain;
public class RouteVO {
	private Integer routeno;
	private String routename;
	private double lat;
	private double lng;
	public Integer getRouteno() {
		return routeno;
	}
	public void setRouteno(Integer routeno) {
		this.routeno = routeno;
	}
	public String getRoutename() {
		return routename;
	}
	public void setRoutename(String routename) {
		this.routename = routename;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	
	@Override
	public String toString() {
		return "RouteVO [routeno=" + routeno + ", routename=" + routename + ", lat=" + lat + ", lng=" + lng + "\n";
	}
	
}
