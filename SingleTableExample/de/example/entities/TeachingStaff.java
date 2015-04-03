package de.example.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "TS")
public class TeachingStaff extends Personal {

	private String qualification;
	private String subject;

	public TeachingStaff(int id, String sname, String qualification,
			String subject) {
		super(id, sname);
		this.qualification = qualification;
		this.subject = subject;
	}

	public TeachingStaff() {
		super();
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getsubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
