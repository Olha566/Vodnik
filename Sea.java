public class Sea extends WaterBody implements Navigable {
    private String source = "google map";
    private String destination = "in the middle of nowhere";

    public Sea(String name, double area, String source, String destination) {
        super(name, area);
        this.source = source;
        this.destination = destination;
    }

    @Override
    public void showInfo() {
        System.out.println("Sea: " + getName());
        System.out.println("Area: " + getArea());
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
    }

    @Override
    public void showRoute() {
        System.out.println("Showing sea route...");

    }
}