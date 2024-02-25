package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

interface WeatherStation{
    double getTemperature(String city);
    double getHumidity(String city);
}

public class WeatherStationTest {
    WeatherStation mockWeatherStation =  mock(WeatherStation.class);

    @Test
    public void testMockWeatherStation(){
        when(mockWeatherStation.getTemperature("Hong Kong")).thenReturn(25.5);
        when(mockWeatherStation.getTemperature("Tokyo")).thenReturn(18.3);

        System.out.println(mockWeatherStation.getTemperature("Hong Kong"));
        System.out.println(mockWeatherStation.getTemperature("Tokyo"));
        System.out.println(mockWeatherStation.getTemperature("Taipei"));

        assertEquals(25.5, mockWeatherStation.getTemperature("Hong Kong"),0.01); //delta=0.01
        assertEquals(18.3, mockWeatherStation.getTemperature("Tokyo"),0.01); //delta=0.01
    }
}