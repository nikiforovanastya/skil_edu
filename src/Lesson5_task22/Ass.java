package Lesson5_task22;

public class Ass {
    private String color;
    private double weight;
    private int girth;
    private boolean isCellulite;

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public int getGirth() {
        return girth;
    }

    public boolean isCellulite() {
        return isCellulite;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setGirth(int girth) {
        this.girth = girth;
    }

    public void setCellulite(boolean cellulite) {
        isCellulite = cellulite;
    }

    public Ass(String color, boolean isCellulite) {
        this.color = color;
        this.isCellulite = isCellulite;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
