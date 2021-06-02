package com.covid19army.core.common.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.covid19army.core.dtos.OtpVerificationRequestDto;

@FeignClient(name="OtpServiceClient", url="${app.client.otpservice.url:http://localhost:8080}")
public interface OtpServiceClient {

	@PostMapping("/motp/verify")
	public boolean validateOtp(@RequestBody OtpVerificationRequestDto otpVerificationDto);  
}
