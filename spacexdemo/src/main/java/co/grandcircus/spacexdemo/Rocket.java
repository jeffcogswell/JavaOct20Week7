package co.grandcircus.spacexdemo;

public class Rocket {
	private String name;
	private int stages;
	private int cost_per_launch;
	private String wikipedia;
	private String description;
	
	private RocketSize height;
	private RocketSize diameter;
	
	public RocketSize getHeight() {
		return height;
	}
	public void setHeight(RocketSize height) {
		this.height = height;
	}
	public RocketSize getDiameter() {
		return diameter;
	}
	public void setDiameter(RocketSize diameter) {
		this.diameter = diameter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStages() {
		return stages;
	}
	public void setStages(int stages) {
		this.stages = stages;
	}
	public int getCost_per_launch() {
		return cost_per_launch;
	}
	public void setCost_per_launch(int cost_per_launch) {
		this.cost_per_launch = cost_per_launch;
	}
	public String getWikipedia() {
		return wikipedia;
	}
	public void setWikipedia(String wikipedia) {
		this.wikipedia = wikipedia;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
