public class Bicycle implements IBicycle{
    public String name;
    public int wheelCount;

    public Bicycle(String name, int wheelCount){
        this.name = name;
        this.wheelCount = wheelCount;
    }

    public String getName(){
        return name;
    }

    public int getWheelCount(){
        return wheelCount;
    }
    @Override
    public String drive(){
        return wheelCount + "개의 바퀴가 있는 자전거 " + name + "를 탄다.";
    }

    @Override
    public String breakk(){
        return "자전거 " + name + "에서 내렸다.";
    }
}
