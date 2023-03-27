package task3;

public class TemperatureConverter {

    public double celciusToKelvin(double temperature){
        return temperature + 273.15;
    }

    public double kelvinToCelcius(double temperature){
        return temperature - 273.15;
    }

    public double celciusToFahrenheit(double temperature){
        return 1.8 * temperature + 32;
    }

    public double fahrenheitToCelcius(double temperature){
        return (temperature - 32) / 1.8;
    }

    public double kelvinToFahrenheit(double temperature){
        return 1.8 * (temperature - 273.15) + 32;
    }

    public double fahrenheitToKelvin(double temperature){
        return (temperature - 32) / 1.8 + 273.15;
    }
}
