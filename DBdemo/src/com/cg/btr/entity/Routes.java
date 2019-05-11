package com.cg.btr.entity;
import java.util.ArrayList;
public class Routes
{
	int routeid;
	ArrayList<String> routes=new ArrayList<>();
	public int getRouteid() {
		return routeid;
	}
	public void setRouteid(int routeid) {
		this.routeid = routeid;
	}
	public ArrayList<String> getRoutes() {
		return routes;
	}
	public void setRoutes(ArrayList<String> routes) {
		this.routes = routes;
	}
	public Routes() {	}
	public Routes(int routeid, ArrayList<String> routes) {
		super();
		this.routeid = routeid;
		this.routes = routes;
	}
	

}
