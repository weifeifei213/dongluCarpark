package com.dongluhitec.card.domain.db.singlecarpark;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.dongluhitec.card.domain.db.DomainObject;
import com.dongluhitec.card.domain.util.StrUtil;

@Entity
public class SingleCarparkInOutHistory extends DomainObject{
	
	public enum Property{
		plateNo,userName,carType,inTime,outTime,inDevice,outDevice,operaName,returnAccount,shouldMoney,factMoney,freeMoney
	}
	public enum Label{
		inTimeLabel,outTimeLabel
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -6080299047343306789L;
	
	
	private String plateNo;
	private String userName;
	private Long userId;
	private String carType;
	@Temporal(TemporalType.TIMESTAMP)
	private Date inTime;
	@Temporal(TemporalType.TIMESTAMP)
	private Date outTime;
	
	private String inDevice;
	private String outDevice;
	
	private Float shouldMoney;
	private Float factMoney;
	private Float freeMoney;
	
	private String operaName;
	
	private Long returnAccount;
	
	private String smallImg;
	private String bigImg;
	private String outSmallImg;
	private String outBigImg;
	private String inPlateNO;
	private String outPlateNO;
	
	private String inPhotographType;
	private String outPhotographType;

	public String getPlateNo() {
		return plateNo;
	}
	public String getInTimeLabel(){
		return StrUtil.formatDate(inTime, "yyyy-MM-dd HH:mm:ss");
	}
	public String getOutTimeLabel(){
		return StrUtil.formatDate(inTime, "yyyy-MM-dd HH:mm:ss");
	}
	
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
		if (pcs != null)
			pcs.firePropertyChange("plateNo", null, null);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if (pcs != null)
			pcs.firePropertyChange("userName", null, null);
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
		if (pcs != null)
			pcs.firePropertyChange("carType", null, null);
	}

	public Date getInTime() {
		return inTime;
	}

	public void setInTime(Date inTime) {
		this.inTime = inTime;
		if (pcs != null)
			pcs.firePropertyChange("inTime", null, null);
	}

	public Date getOutTime() {
		return outTime;
	}

	public void setOutTime(Date outTime) {
		this.outTime = outTime;
		if (pcs != null)
			pcs.firePropertyChange("outTime", null, null);
	}


	public String getOperaName() {
		return operaName;
	}

	public void setOperaName(String operaName) {
		this.operaName = operaName;
		if (pcs != null)
			pcs.firePropertyChange("operaName", null, null);
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getSmallImg() {
		return smallImg;
	}

	public void setSmallImg(String smallImg) {
		this.smallImg = smallImg;
		if (pcs != null)
			pcs.firePropertyChange("smallImg", null, null);
	}

	public String getBigImg() {
		return bigImg;
	}

	public void setBigImg(String bigImg) {
		this.bigImg = bigImg;
		if (pcs != null)
			pcs.firePropertyChange("bigImg", null, null);
	}


	public String getInDevice() {
		return inDevice;
	}

	public void setInDevice(String inDevice) {
		this.inDevice = inDevice;
		if (pcs != null)
			pcs.firePropertyChange("inDevice", null, null);
	}

	public String getOutDevice() {
		return outDevice;
	}

	public void setOutDevice(String outDevice) {
		this.outDevice = outDevice;
		if (pcs != null)
			pcs.firePropertyChange("outDevice", null, null);
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
		if (pcs != null)
			pcs.firePropertyChange("userId", null, null);
	}

	public Float getShouldMoney() {
		return shouldMoney;
	}

	public void setShouldMoney(float shouldMoney) {
		this.shouldMoney = shouldMoney;
		if (pcs != null)
			pcs.firePropertyChange("shouldMoney", null, null);
	}

	public Float getFactMoney() {
		return factMoney;
	}

	public void setFactMoney(float factMoney) {
		this.factMoney = factMoney;
		if (pcs != null)
			pcs.firePropertyChange("factMoney", null, null);
	}

	public Float getFreeMoney() {
		return freeMoney;
	}

	public void setFreeMoney(float freeMoney) {
		this.freeMoney = freeMoney;
		if (pcs != null)
			pcs.firePropertyChange("freeMoney", null, null);
	}

	public Long getReturnAccount() {
		return returnAccount;
	}

	public void setReturnAccount(Long returnAccount) {
		this.returnAccount = returnAccount;
		if (pcs != null)
			pcs.firePropertyChange("returnAccount", null, null);
	}

	public String getInPhotographType() {
		return inPhotographType;
	}

	public void setInPhotographType(String inPhotographType) {
		this.inPhotographType = inPhotographType;
		if (pcs != null)
			pcs.firePropertyChange("inPhotographType", null, null);
	}

	public String getOutPhotographType() {
		return outPhotographType;
	}

	public void setOutPhotographType(String outPhotographType) {
		this.outPhotographType = outPhotographType;
		if (pcs != null)
			pcs.firePropertyChange("outPhotographType", null, null);
	}
	public String getOutSmallImg() {
		return outSmallImg;
	}
	public void setOutSmallImg(String outSmallImg) {
		this.outSmallImg = outSmallImg;
		if (pcs != null)
			pcs.firePropertyChange("outSmallImg", null, null);
	}
	public String getOutBigImg() {
		return outBigImg;
	}
	public void setOutBigImg(String outBigImg) {
		this.outBigImg = outBigImg;
		if (pcs != null)
			pcs.firePropertyChange("outBigImg", null, null);
	}
	public String getInPlateNO() {
		return inPlateNO;
	}
	public void setInPlateNO(String inPlateNO) {
		this.inPlateNO = inPlateNO;
		if (pcs != null)
			pcs.firePropertyChange("inPlateNO", null, null);
	}
	public String getOutPlateNO() {
		return outPlateNO;
	}
	public void setOutPlateNO(String outPlateNO) {
		this.outPlateNO = outPlateNO;
		if (pcs != null)
			pcs.firePropertyChange("outPlateNO", null, null);
	}
	
}
