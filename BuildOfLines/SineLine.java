/*
 * Written by Savanna Shaver
 */
public class SineLine implements Line {
	private double amplitude;
	private double frequency;
	public SineLine()
	{
		this.amplitude = 0.0;
		this.frequency = 0.0;
	}
	public SineLine(double anA, double aF)
	{
		this.setAmplitude(anA);
		this.setFrequency(aF);
	}
	public double getAmplitude()
	{
		return this.amplitude;
	}
	
	public double getFrequency()
	{
		return this.frequency;
	}
	public void setAmplitude(double anA)
	{
		this.amplitude = anA;
	}
	public void setFrequency(double aF)
	{
		this.frequency = aF;
	}
	public double getYPoint(double x)
	{
		return this.amplitude * Math.sin(x*this.frequency);
	}


}
