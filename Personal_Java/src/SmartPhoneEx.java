public class SmartPhoneEx {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("갤럭시", "소프트그린");

        System.out.println("모델 : " + smartPhone.model);
        System.out.println("컬러 : " + smartPhone.color);

        System.out.println("wifi 상태 : " + smartPhone.wifi);
        smartPhone.setWifi(true);
        smartPhone.internet();

        smartPhone.bell();
        smartPhone.sendVideo("여보세요?");
        smartPhone.receiveVoice("나야~ 거기 잘지내니");
        smartPhone.sendVideo("뭐하냐;");
        smartPhone.hangUp();
    }
}