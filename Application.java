public class Application {
    public static void main(String[] args) {


//        displayWaterObjectInfo(river);
//        displayWaterObjectInfo(sea);
//        displayWaterObjectInfo(ocean);
        Waterfall waterfall = new Waterfall("Victoria Falls", 23000, "Mwinilunga district", "Zimbabwe");
        Sea sea = new Sea("Mediterranean", 2500000, "Mediterranean Sea", "Turkey");
        Ocean ocean = new Ocean();
        displayWaterObjectInfo(ocean);
        ocean.getName();
        ocean.showRoute();
        ocean.showInfo();
    }

    public static void displayWaterObjectInfo(WaterBody WaterBody) {
        System.out.println("Назва: " + WaterBody.getName());
        System.out.println("Площа: " + WaterBody.getArea());


        
    }
}




