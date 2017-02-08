package com.cis.ui.controllers;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;

public class LockForm {
	
	
	private Integer lockNo;
	private String lockID;
	private String machineNAME;
	private String machineSIZE;
	private String machinePrice;
	
	public Integer getLockNo() {
		return lockNo;
	}
	public void setLockNo(Integer lockNo) {
		this.lockNo = lockNo;
	}
	public String getLockID() {
		return lockID;
	}
	public void setLockID(String lockID) {
		this.lockID = lockID;
	}
	public String getMachineNAME() {
		return machineNAME;
	}
	public void setMachineNAME(String machineNAME) {
		this.machineNAME = machineNAME;
	}
	public String getMachineSIZE() {
		return machineSIZE;
	}
	public void setMachineSIZE(String machineSIZE) {
		this.machineSIZE = machineSIZE;
	}
	public String getMachinePrice() {
		return machinePrice;
	}
	public void setMachinePrice(String machinePrice) {
		this.machinePrice = machinePrice;
	}
}
