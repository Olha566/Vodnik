public class Waterfall extends WaterBody implements Navigable {
    private String source;
    private String destination;

    public Waterfall(String name, double area, String source, String destination) {
        super(name, area);
        this.source = source;
        this.destination = destination;
    }
    @Override
    public  String getName() {
        return null;
    }

    @Override
    public void showInfo() {

    }

    public  String getType() {
        return null;
    }


    @Override
    public void showRoute() {

    }
}
