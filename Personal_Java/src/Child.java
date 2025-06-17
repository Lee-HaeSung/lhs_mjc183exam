public class Child extends Parent{
//    public String field2;
//
//    @Override
//    public void method2(){
//        System.out.println("Child-method2()");
//    }
//
//    public void method3(){
//        System.out.println("Child-method3()");
//    }
    public String name;

    public Child() {
        this("홍길동");
        System.out.println("Child() call");
    }

    public Child(String name){
        this.name = name;
        System.out.println("Child(String name) call");
    }
}
