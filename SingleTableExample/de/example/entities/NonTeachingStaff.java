package de.example.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "NS")
public class NonTeachingStaff extends Personal {
	private String area;

	public NonTeachingStaff(int sid, String sname, String area) {
		super(sid, sname);
		this.area = area;
	}

	public NonTeachingStaff() {
		super();
	}

	public String getArea() {
		return area;
	}

	public void setAreaexpertise(String area) {
		this.area = area;
	}
}
