package com.cg.project.beans;

import javax.persistence.Entity;

@Entity
public class PEmployee extends Employee{
	private int hra,ta,da;

	public PEmployee() {}
	
	public PEmployee(int employeeId, String firstName, String lastName, String emailId) {
		super(employeeId, firstName, lastName, emailId);
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}

	public int getTa() {
		return ta;
	}

	public void setTa(int ta) {
		this.ta = ta;
	}

	public int getDa() {
		return da;
	}

	public void setDa(int da) {
		this.da = da;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + da;
		result = prime * result + hra;
		result = prime * result + ta;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PEmployee other = (PEmployee) obj;
		if (da != other.da)
			return false;
		if (hra != other.hra)
			return false;
		if (ta != other.ta)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PEmployee [hra=" + hra + ", ta=" + ta + ", da=" + da + "]";
	}	
}
