package util;

public class MyMath {
   private int num1;
   private int num2;
   private String operator;

   public MyMath(){
       this.num1=0;
       this.num2=0;
       this.operator="";
   }

   public MyMath(int num1,int num2,String operator){
       this.num1=num1;
       this.num2=num2;
       this.operator=operator;
   }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void calculate(){
        String resultFormat="Result (%d %s %d) => %s";

        switch(operator){
            case "+":
                System.out.println("Result ("+num1 +operator+num2+") => "+(num1+num2));
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            default:
                System.out.println(num1/num2);
                break;
        }
    }
}
