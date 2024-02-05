package Lesson5_task21;

public class Country {
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public void setSeaPath(boolean seaPath) {
        this.seaPath = seaPath;
    }

    private String countryName;
    private int population;
    private  double square;
    private String capitalName;
    private boolean seaPath;

    public String getCountryName() {
        return countryName;
    }

    public int getPopulation() {
        return population;
    }

    public double getSquare() {
        return square;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public boolean isSeaPath() {
        return seaPath;
    }

    public Country(String countryName) {
        this.countryName = countryName;
    }



}
