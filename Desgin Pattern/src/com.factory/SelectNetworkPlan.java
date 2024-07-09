package com.factory;

public class SelectNetworkPlan {

	 public CellularPlan  getPlan(String planType) {

	 
		 if(planType==null) {
			 return null;
		 }
		 if(planType.equalsIgnoreCase("ThreeG")) {
			 return new ThreeG();
		 }
		 else if(planType.equalsIgnoreCase("FourG")) {
			 return new FourG();
		 }
		return null;
	 }}
