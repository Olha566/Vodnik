public class Ocean extends WaterBody implements Navigable {

    private String source;


    public Ocean() {
        super("Pacific ocean", 180.000000, "ocean");
        this.source = "Bering Strait near the Arctic Circle to the shores of Antarctica";
    }

    @Override
    public void showInfo() {
        System.out.println("Ocean: " + getName());
        System.out.println("Area: " + getArea());
        System.out.println("Source: " + source);
    }

    @Override
    public void showRoute() {
        System.out.println("Route: You can get there by ship from any island or continent");

    }
    public String getName() {
       String name = "Pacific ocean";
       return name;
    }
    @Override
    public String getType() {
        String type = "Ocean";
        return type;
    }
}
