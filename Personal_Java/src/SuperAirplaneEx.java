public class SuperAirplaneEx {
    public static void main(String[] args){
        SuperAirplane superAirplane = new SuperAirplane();

        superAirplane.takeoff();
        superAirplane.fly();
        superAirplane.flyMode = SuperAirplane.SuperSonic;
        superAirplane.fly();
        superAirplane.flyMode = SuperAirplane.Normal;
        superAirplane.fly();

        superAirplane.land();
    }
}
