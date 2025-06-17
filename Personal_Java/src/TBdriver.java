public class TBdriver {
    private String name;
    private int age;
    private IVehicle iVehicle;

    public TBdriver(String name, int age, IVehicle iVehicle){
        this.name = name;
        this.age = age;
        this.iVehicle = iVehicle;
    }

    public void drive(){
        if(iVehicle instanceof Truck truck){
            System.out.println(this.name + "가 " + truck.drive() + " ");
        }
        else if(iVehicle instanceof Bicycle bicycle){
            System.out.println(this.name + "는 " + bicycle.drive() + " ");
        }
    }

    public void breakk(){
        if(iVehicle instanceof Truck truck){
            System.out.println(this.name + "의 " + truck.breakk() + " ");
        }
        else if(iVehicle instanceof Bicycle bicycle){
            System.out.println(this.name + "가 " + bicycle.breakk() + " ");
        }
    }

    public static void main(String[] args){
        Truck truck = new Truck("타요",12);
        Bicycle bicycle = new Bicycle("삼천리",2);

        TBdriver tBdriver1 = new TBdriver("김철수", 24, truck);
        TBdriver tBdriver2 = new TBdriver("김영희",21, bicycle);

        tBdriver1.drive();
        tBdriver1.breakk();
        tBdriver2.drive();
        tBdriver2.breakk();

    }
}
