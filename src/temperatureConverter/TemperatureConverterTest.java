package temperatureConverter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TemperatureConverterTest {

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0.0), 0.01);
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32.0),0.01);
    }

    @Test
    public void testCelsiusToKelvin() {
        assertEquals(273.15, TemperatureConverter.celsiusToKelvin(0.0),0.01);
    }

    @Test
    public void testKelvinToCelsius() {
        assertEquals(0.0, TemperatureConverter.kelvinToCelsius(273.15),0.01);
    }

    @Test
    public void testFahrenheitToKelvin() {
        assertEquals(273.15, TemperatureConverter.fahrenheitToKelvin(32.0),0.01);
    }

    @Test
    public void testKelvinToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.kelvinToFahrenheit(273.15),0.01);
    }
}
