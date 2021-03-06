package com.donglu.carpark.ui.view.setting.wizard;

import com.dongluhitec.card.domain.db.DomainObject;
import com.dongluhitec.card.domain.db.singlecarpark.CameraTypeEnum;
import com.dongluhitec.card.domain.util.StrUtil;

public class DownloadDeviceInfo extends DomainObject {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ip;
	private CameraTypeEnum type;
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
		if (pcs != null)
			pcs.firePropertyChange("ip", null, null);
	}
	public CameraTypeEnum getType() {
		return type;
	}
	public void setType(CameraTypeEnum type) {
		this.type = type;
		if (pcs != null)
			pcs.firePropertyChange("type", null, null);
	}
	@Override
	public String getLabelString() {
		return ip+"-"+type;
	}
	@Override
	public boolean equals(Object obj) {
		if (!obj.getClass().equals(this.getClass())) {
			return false;
		}
		if (!StrUtil.isEmpty(ip)&&!StrUtil.isEmpty(obj)) {
			DownloadDeviceInfo info=(DownloadDeviceInfo)obj;
			return ip.equals(info.getIp());
		}
		return super.equals(obj);
	}
	
	
}
