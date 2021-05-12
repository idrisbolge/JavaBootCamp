package arensoft.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="jobTitles")
public class JobTitle {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	

	@Column(name="title")
	private String title;

	
	public JobTitle(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	
	
	public JobTitle() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
}
