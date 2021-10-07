package traingle;

public class Main {
    public static void main(String[] args) {
        try{
            Traingle a = new Traingle(3,1,5);
        }catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }
}
