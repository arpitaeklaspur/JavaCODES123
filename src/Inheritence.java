class  Calculator
{
    public int add(int i, int j)
    {
        return i+j;
    }
}
class CalcAdv extends Calculator
{
    public int sub(int i, int j)
    {
        return i-j;
    }

}
public class Inheritence {
    public static void main(String[] args)
    {
        CalcAdv c1 = new CalcAdv();
        int result1 = c1.add(5,4);
        int result2 = c1.sub(5,4);

        System.out.println(result1);
        System.out.println(result2);

    }
}
