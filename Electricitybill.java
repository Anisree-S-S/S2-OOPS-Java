import java.util.*;
class ElectricityBill
{
  public static void main(String[] args)
  {
    int sum=0,unit;
    unit=50;
    if(unit<=50)
    {
      sum=unit*6;
    }
    else if((unit>50)&&(unit<=100))
    {
      sum=(50*6)+(unit-50*7);
    }
    else if((unit>100)&&(unit<=200))
    {
      sum=(100*7)+(unit-100*8);
    }
    else if(unit>200)
    {
      sum=unit*10;
    }
    System.out.println("The cost of the bill is :",+sum);
  }
}
