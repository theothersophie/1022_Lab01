package ca.yorku.a1022_lab01.zero;

import org.junit.Test;

import ca.yorku.a1022_lab01.BMIModel;

public class BMIModelTest
{
    @Test
    public void getBMITest()
    {
        double w, h;
        System.out.println("Testing BMImodel.getBMI");
        w = 90;
        h = 0.5 + 2.5 * Math.random();
        System.out.println(w+","+h);
        System.out.println(BMIModel.getBMI(w,h));
    }

    @Test
    public void toDoubleTest()
    {
        String s;
        System.out.println("Testing BMIModel.toDouble");
        s = Double.toString(100*Math.random());
        System.out.println(s);
        System.out.println(BMIModel.toDouble(s));
    }

    @Test
    public void formatBMITest()
    {
        double bmi;
        System.out.println("Testing BMIModel.formatBMI");
        bmi = 10 + 50* Math.random();
        System.out.println(bmi);
        System.out.println(BMIModel.formatBMI(bmi));
    }
}
