public class Extent extends Calculator{
    @Override
    public double areaCircle(double r){
        System.out.println("구의 부피를 구하겠습니다.");
        return Math.PI * r * r * r * 4/3;
    }
}
