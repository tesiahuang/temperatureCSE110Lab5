package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{


    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit((float) ((getValue() * 1.8) + 32));
    }

    public String toString()
    {

        return getValue() + " C";
    }
}
