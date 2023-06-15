package com.kunintns.statisticData.intersectionInfo.vo;

import com.kunintns.statisticData.common.vo.DefaultVO;

public class IntersectionInfoVO extends DefaultVO {
    
	private int intrsctnNo;
	
	private String intrsctnId;
	
	private int startLatitude;
	
	private int endLatitude;
	
	private int startLongitude;
	
	private int endLongitude;

	
	public int getIntrsctnNo() {
		return intrsctnNo;
	}

	public void setIntrsctnNo(int intrsctnNo) {
		this.intrsctnNo = intrsctnNo;
	}

	public String getIntrsctnId() {
		return intrsctnId;
	}

	public void setIntrsctnId(String intrsctnId) {
		this.intrsctnId = intrsctnId;
	}

	public int getStartLatitude() {
		return startLatitude;
	}

	public void setStartLatitude(int startLatitude) {
		this.startLatitude = startLatitude;
	}

	public int getEndLatitude() {
		return endLatitude;
	}

	public void setEndLatitude(int endLatitude) {
		this.endLatitude = endLatitude;
	}

	public int getStartLongitude() {
		return startLongitude;
	}

	public void setStartLongitude(int startLongitude) {
		this.startLongitude = startLongitude;
	}

	public int getEndLongitude() {
		return endLongitude;
	}

	public void setEndLongitude(int endLongitude) {
		this.endLongitude = endLongitude;
	}
}