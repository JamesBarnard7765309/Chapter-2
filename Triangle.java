public class Triangle {
    public static void main(String[] args)
    {
        //your goal is to complete this program to generate the area of a triangle.
        //height, base
        //triangleArea= height * base * 1.0/2.0

        java.util.Scanner input = new java.util.Scanner(System.in);

        //create a prompt to ask for height
        System.out.print("Enter height of a triangle: ");

        //create nextDouble() method to retrieve value from the keyboard
        double height = input.nextDouble();

        System.out.print("Enter base of this triangle: ");
        double base = input.nextDouble();

        double HALF = 0.5;

        double areaOfTriangle = height * base * HALF;

        System.out.println("---Component of the triangle---");
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Area of The triangle: " + areaOfTriangle);
    }
}
