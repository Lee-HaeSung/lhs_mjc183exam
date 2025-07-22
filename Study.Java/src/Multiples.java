class MultiplesInterface implements multi{
    @Override
    public void multiples(int mul) {
        for(int i=0;i<100000;i++){
            if(i % mul==0){
                System.out.println(i);
            }
        }
    }
}

public class Multiples {
    public static void main(String[] args) {
        int mul = 6;

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                if (i % mul == 0) {
                    System.out.println(i);
                }
            }
        });

        thread.start();
    }
}
