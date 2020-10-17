

 
package com.rm.model;

public class Project {
	
	int id;
	String title;
	String description;
	String domain;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public Project() {
		super();
	}
public Project(int id,String title,String description,String domain) {
	super();
	this.id = id;
	this.title =title;
	this.description = description;
	this.domain = domain;
	
}
@Override
public String toString() {
	return "Project [id=" + id + ", title=" + title + ", description=" + description + ", domain=" + domain + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((description == null) ? 0 : description.hashCode());
	result = prime * result + ((domain == null) ? 0 : domain.hashCode());
	result = prime * result + id;
	result = prime * result + ((title == null) ? 0 : title.hashCode());
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
	Project other = (Project) obj;
	if (description == null) {
		if (other.description != null)
			return false;
	} else if (!description.equals(other.description))
		return false;
	if (domain == null) {
		if (other.domain != null)
			return false;
	} else if (!domain.equals(other.domain))
		return false;
	if (id != other.id)
		return false;
	if (title == null) {
		if (other.title != null)
			return false;
	} else if (!title.equals(other.title))
		return false;
	return true;
}

}
