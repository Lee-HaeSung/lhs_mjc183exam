public class SmartPhone2 {
    private String company;
    private String os;

    public SmartPhone2(String company, String os){
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString(){
        return company + ", " + os;
    }
}
