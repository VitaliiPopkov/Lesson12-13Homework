package Task2Converter;

public class KelvinTemperature extends ConverterTemperature {


    @Override
    public void convert() {
        double degreeKelvin = (celsiusTemperatureNow + 273);
        System.out.println(degreeKelvin);

    }
}
