package co.grandcircus.spacexdemo;

public class Launch {
	
	public String static_fire_date_utc;
	public boolean success;
	public String details;
	public String name;
	public String id;
	public String rocket;
	public String getStatic_fire_date_utc() {
		return static_fire_date_utc;
	}
	public void setStatic_fire_date_utc(String static_fire_date_utc) {
		this.static_fire_date_utc = static_fire_date_utc;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRocket() {
		return rocket;
	}
	public void setRocket(String rocket) {
		this.rocket = rocket;
	}
	
	
}
