public class CircleArea {
        public static void main(String[] args) {

            java.util.Scanner input = new java.util.Scanner(System.in);
            System.out.print("Enter a radius value: ");
            double radius = input.nextDouble();
            double area = Math.PI * radius * radius;
            System.out.println("Area of the circle is" + area);
            }
        }
