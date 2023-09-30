public class EuclideanAlgorithm {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 48, b = 18;
        int gcdResult = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is " + gcdResult);
    }
}

This code is a Java program that implements the Euclidean algorithm to find the greatest common divisor (GCD) of two integers. The Euclidean algorithm is a method that repeatedly divides the larger number by the smaller number and takes the remainder until the remainder is zero. The last non-zero remainder is the GCD of the original numbers123

The code consists of two methods: gcd and main. The gcd method takes two parameters, a and b, which are the two integers whose GCD we want to find. The method uses a recursive approach, which means it calls itself with new arguments until a base case is reached. The base case is when b is zero, in which case the method returns a as the GCD. Otherwise, the method calls itself with b and a % b as the new arguments, where a % b is the remainder of dividing a by b. This way, the method mimics the steps of the Euclidean algorithm until it finds the GCD.

The main method is where the program starts executing. It declares two variables, a and b, and assigns them some values. It then calls the gcd method with these values and stores the result in another variable, gcdResult. It then prints out a message that shows the values of a, b, and gcdResult.

For example, if we run this code with a = 48 and b = 18, the gcd method will perform the following steps:

gcd(48, 18) = gcd(18, 12) // since 48 % 18 = 12 gcd(18, 12) = gcd(12, 6) // since 18 % 12 = 6 gcd(12, 6) = gcd(6, 0) // since 12 % 6 = 0 gcd(6, 0) = 6 // base case, return a

So the GCD of 48 and 18 is 6. The program will print out:

GCD of 48 and 18 is 6
