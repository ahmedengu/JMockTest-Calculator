public class CalcTest
{
    CalcInterface calcInterface;
    public CalcTest(CalcInterface calcInterface)
    {
        this.calcInterface = calcInterface;
    }

    public int add()
    {
        int result= calcInterface.add(5,4);
        return result;
    }
    public int sub()
    {
        int result= calcInterface.sub(5,4);
        return result;
    }
    public int div()
    {
        int result= calcInterface.div(5,4);
        return result;
    }
    public int mult()
    {
        int result= calcInterface.mult(5,4);
        return result;
    }
    public int adv()
    {
        int result= calcInterface.advCalc(5,4,'+');
        return result;
    }

}
