package com.covid19army.core.dtos;

import java.io.Serializable;

public class OtpVerificationRequestDto  implements Serializable   {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7526227585190885113L;

	private String mobilenumber;

	private int otp;

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}
	
}
