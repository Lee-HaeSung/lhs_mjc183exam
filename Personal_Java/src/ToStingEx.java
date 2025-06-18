public class ToStingEx {
    public static void main(String[] args){
        SmartPhone2 myphone = new SmartPhone2("삼성전자", "안드로이드");

        String strObj = myphone.toString();
        System.out.println(strObj);

        System.out.println(myphone);
    }
}
