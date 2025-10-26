package fag.objetos;

public class Temperatura {
	private double celsius;
	
	public Temperatura() {	
	}
	public Temperatura(double celsius) {
		setCelsius(celsius);
	}
	
	public double getCelsius() {
		return celsius;
	}
	
	public void setCelsius(double celsius) {
		if(celsius>-273.15) {
			this.celsius=celsius;
		}
	}
	
	public double paraFahrenheit() {
		double Fahrenheit = (celsius * 9/5) + 32;
		return Fahrenheit;
	}
	public double paraKelvin() {
		double Kelvin = celsius + 273.15;
		return Kelvin;
	}
}
	

