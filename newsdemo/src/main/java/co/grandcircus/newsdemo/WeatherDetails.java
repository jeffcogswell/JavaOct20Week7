package co.grandcircus.newsdemo;

import java.util.List;

public class WeatherDetails {
	public List<String> weather;
	public List<String> text;
	public List<String> getWeather() {
		return weather;
	}
	public void setWeather(List<String> weather) {
		this.weather = weather;
	}
	public List<String> getText() {
		return text;
	}
	public void setText(List<String> text) {
		this.text = text;
	}

}
