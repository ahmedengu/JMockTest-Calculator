import junit.framework.Assert;
import org.jmock.Mockery;
import org.junit.Test;
public class TestClass3
{
    @Test
    public void add()
    {
        org.jmock.Mockery TestInterfaceMock= new Mockery();
        final CalcInterface calcInterface =TestInterfaceMock.mock(CalcInterface.class);
        TestInterfaceMock.checking(new org.jmock.Expectations()
        {{
            oneOf(calcInterface).add(4,5);
            will(returnValue((9)));
        }});
        int j= calcInterface.add(4,5);
        System.out.println(j);
        Assert.assertEquals(j, 9);
    }

    @Test
    public void sub()
    {
        org.jmock.Mockery TestInterfaceMock= new Mockery();
        final CalcInterface testInterface=TestInterfaceMock.mock(CalcInterface.class);
        TestInterfaceMock.checking(new org.jmock.Expectations()
        {{
            oneOf(testInterface).sub(5,4);
            will(returnValue((1)));
        }});
        int j=testInterface.sub(5,4);
        System.out.println(j);
        Assert.assertEquals(j, 1);
    }

    @Test
    public void div()
    {
        org.jmock.Mockery TestInterfaceMock= new Mockery();
        final CalcInterface testInterface=TestInterfaceMock.mock(CalcInterface.class);
        TestInterfaceMock.checking(new org.jmock.Expectations()
        {{
            oneOf(testInterface).div(10,5);
            will(returnValue((2)));
        }});
        int j=testInterface.div(10,5);
        System.out.println(j);
        Assert.assertEquals(j, 2);
    }


    @Test
    public void mult()
    {
        org.jmock.Mockery TestInterfaceMock= new Mockery();
        final CalcInterface testInterface=TestInterfaceMock.mock(CalcInterface.class);
        TestInterfaceMock.checking(new org.jmock.Expectations()
        {{
            oneOf(testInterface).mult(4,5);
            will(returnValue((20)));
        }});
        int j=testInterface.mult(4,5);
        System.out.println(j);
        Assert.assertEquals(j, 20);
    }


    @Test
    public void adv()
    {
        org.jmock.Mockery TestInterfaceMock= new Mockery();
        final CalcInterface testInterface=TestInterfaceMock.mock(CalcInterface.class);
        TestInterfaceMock.checking(new org.jmock.Expectations()
        {{
            oneOf(testInterface).advCalc(4,5,'+');
            will(returnValue((9)));
        }});
        int j=testInterface.advCalc(4,5,'+');
        System.out.println(j);
        Assert.assertEquals(j, 9);
    }


}
