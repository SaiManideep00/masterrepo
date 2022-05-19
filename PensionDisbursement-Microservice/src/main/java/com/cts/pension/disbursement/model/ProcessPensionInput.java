package com.cts.pension.disbursement.model;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ProcessPensionInput {
	private Long aadharNumber;
	private double pensionAmount;
	private double bankCharge;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aadharNumber == null) ? 0 : aadharNumber.hashCode());
		long temp;
		temp = Double.doubleToLongBits(bankCharge);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(pensionAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProcessPensionInput other = (ProcessPensionInput) obj;
		if (aadharNumber == null) {
			if (other.aadharNumber != null)
				return false;
		} else if (!aadharNumber.equals(other.aadharNumber))
			return false;
		if (Double.doubleToLongBits(bankCharge) != Double.doubleToLongBits(other.bankCharge))
			return false;
		if (Double.doubleToLongBits(pensionAmount) != Double.doubleToLongBits(other.pensionAmount))
			return false;
		return true;
	}
	
	
	
}