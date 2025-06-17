public class SuperAirplane extends  Airplane{
    public static final int Normal = 1;
    public static final int SuperSonic = 2;

    public int flyMode = Normal;

    public void fly(){
        if(flyMode == SuperSonic){
            System.out.println("초음속 비행입니다.");
        }
        else{
            super.fly();
        }
    }
}
