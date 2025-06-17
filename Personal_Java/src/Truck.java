public class Truck implements ITruck{
    public String name;
    public int wheelCount;

    public Truck(String name, int wheelCount){
        this.name = name;
        this.wheelCount = wheelCount;
    }

    public String getName(){
        return name;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    @Override
    public String drive(){
        return wheelCount + "개의 바퀴가 있는 트럭 " + name + "을 운전합니다";
    }

    @Override
    public String breakk(){
        return "트럭 " + name + "가 멈춥니다.";
    }
}
