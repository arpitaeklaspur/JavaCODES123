public class Overloading {
    public int sum(){
        int a = 10;
        int b = 20;
        return a+b;
    }
    public int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        Overloading obj = new Overloading();
        System.out.println(obj.sum());
        System.out.println(obj.sum(20,30));
    }
}
