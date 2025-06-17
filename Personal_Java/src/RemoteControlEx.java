public class RemoteControlEx {
    public static void main(String[] args){
        RemoteControl rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(3);
        rc.turnOff();

        rc = new Television();
        rc.setMute(true);
        rc.setMute(false);

        rc = new Audio();
        rc.setVolume(5);
        rc.setMute(true);
        rc.setMute(false);
    }
}
