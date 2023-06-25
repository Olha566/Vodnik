public abstract class WaterBody {
    private String name;
    private double area;
    private String type;

    public WaterBody(String name, double area, String type) {
        this.name = name;
        this.area = area;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }
    public String getType() {
        return type;
}
    public abstract void showInfo();
}
