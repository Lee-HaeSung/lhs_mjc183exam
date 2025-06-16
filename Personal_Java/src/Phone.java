public class Phone {
    protected String model;
    protected String color;

    public void bell(){ //메소드, void로 하면 return 값이 필요없음
        System.out.println("띠리리리링 전화왔습니다.");
    }

    public void sendVideo(String message){
        System.out.println("메세지를 보냅니다. \n메세지 내용 : " + message);
    }

    public void receiveVoice(String message){
        System.out.println("메세지가 도착했습니다. \n메세지 내용 : " + message);
    }

    public void hangUp(){
        System.out.println("전화를 끊습니다.");
    }
}
