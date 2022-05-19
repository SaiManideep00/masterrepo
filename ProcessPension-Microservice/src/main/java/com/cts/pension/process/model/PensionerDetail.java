package com.cts.pension.process.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class PensionerDetail {
	
	private long aadharNumber;
	private String name;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfBirth;
	private String pan;
	private double salaryEarned;
	private double allowances;
	private String pensionType;
	private String bankName;
	private String accountNumber;
	private String bankType;
	
	@Override
	public String toString() {
		return "PensionerDetail [aadharNumber=" + aadharNumber + ", name=" + name + ", dateOfBirth=" + dateOfBirth
				+ ", pan=" + pan + ", salaryEarned=" + salaryEarned + ", allowances=" + allowances + ", pensionType="
				+ pensionType + ", bankName=" + bankName + ", accountNumber=" + accountNumber + ", bankType=" + bankType
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (aadharNumber ^ (aadharNumber >>> 32));
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		long temp;
		temp = Double.doubleToLongBits(allowances);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((bankName == null) ? 0 : bankName.hashCode());
		result = prime * result + ((bankType == null) ? 0 : bankType.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pan == null) ? 0 : pan.hashCode());
		result = prime * result + ((pensionType == null) ? 0 : pensionType.hashCode());
		temp = Double.doubleToLongBits(salaryEarned);
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
		PensionerDetail other = (PensionerDetail) obj;
		if (aadharNumber != other.aadharNumber)
			return false;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (Double.doubleToLongBits(allowances) != Double.doubleToLongBits(other.allowances))
			return false;
		if (bankName == null) {
			if (other.bankName != null)
				return false;
		} else if (!bankName.equals(other.bankName))
			return false;
		if (bankType == null) {
			if (other.bankType != null)
				return false;
		} else if (!bankType.equals(other.bankType))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pan == null) {
			if (other.pan != null)
				return false;
		} else if (!pan.equals(other.pan))
			return false;
		if (pensionType == null) {
			if (other.pensionType != null)
				return false;
		} else if (!pensionType.equals(other.pensionType))
			return false;
		if (Double.doubleToLongBits(salaryEarned) != Double.doubleToLongBits(other.salaryEarned))
			return false;
		return true;
	}
	
	
	
	
	
}
