public class multiple {
        public static void main(String[] args) {
            int mul = 5;

            Thread thread = new Thread(()->{
                for(int i=0;i<100000;i++){
                    if (i % mul == 0){
                        System.out.println(i);
                    }
                }
            });

            thread.start();
        }
}
