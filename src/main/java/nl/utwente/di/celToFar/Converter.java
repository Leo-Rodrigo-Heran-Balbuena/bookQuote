package nl.utwente.di.celToFar;

public class Converter {
    public double convertcelsius(String celsius) {
        return (Integer.parseInt(celsius)*33.8);
    }
}
