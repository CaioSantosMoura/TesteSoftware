package TestesdeExcecoes;

public class TemperatureConverter {
    public double celsiusToKelvin(double celsius) throws Exception {
        if (celsius < -273.15) {
            throw new Exception("Temperatura abaixo do zero absoluto");
        }
        return celsius + 273.15;
    }
}
