import java.util.*;
class practiceproblem{
    public static void main(String[]args){
        // welcome to bridglab
        System.out.println("Welcome to Bridgelab");

        // // Add two numbers
        int a=10;
        int b=20;
        System.out.println(a+b);

        // 3. Celsius to Fahrenheit Conversion
        // Fahrenheit = (Celsius * 9/5) + 32.
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the celcius temp: ");
        int c= sc.nextInt();
        int f=(c*9/5)+32;
        System.out.println("temperature in fahrehnite:"+f);

        // // 4. Area of a Circle
        System.out.println("enter radius of circle:");
        int r=sc.nextInt();
        System.out.print("Area of circle:"+3.14*r*r);

        // Volume of a Cylinder
        int rc=2;
        int h=3;
        System.out.println("Volume: "+ 3.14*rc*rc*h);

        // calculate simple interest
        int p=1000,radius=10,t=2;
        System.out.println("simple interest is:"+(p*radius*t)/100);

        // perimeter if rectangle
        int l=20,breadth=30;
        System.out.println("Perimeter if rectangle :"+2*(l+breadth));

        // 3. Power Calculation
        int base=2,exp=8;
        System.out.println("power :"+Math.pow(base,exp));

        // calculate average of three numbers
        int a1=10,b1=20,c1=30;
        System.out.println("Average:"+(a1+b1+c1)/3);

        // kilometer to miles Miles = Kilometers * 0.621371.
        int kilometer=1000;
        System.out.println("Kilometer to miles:"+kilometer * 0.621371);
    }
}