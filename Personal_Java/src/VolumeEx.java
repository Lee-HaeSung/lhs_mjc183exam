public class VolumeEx {
    public static void main(String[] args){
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원의 넓이 : " + calculator.areaCircle(r));
        System.out.println();

        Extent extent = new Extent();
        System.out.println("구의 부피 : " + extent.areaCircle(r));
        System.out.println();
    }
}
