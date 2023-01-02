package org.example.pz1;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int m = 3;
            System.out.println("Enter value of variable \"t\":");
            double t = scanner.nextDouble();
            System.out.println("Enter value of variable \"c\":");
            double c = scanner.nextDouble();
            for (double p = 0.0; p <= 5.0; p += 0.9) {
                for (double x = 0.0; x <= 3.0; x += 0.3) {
                    double a = 0;
                    if (p > x && x > 1) {
                        a = ((p * p + 5 * p + 4) * x) / (Math.cbrt(Math.pow(p, 3) * Math.pow(x, 4)));
                    } else if (p > 1) {
                        a = Math.pow((Math.tan(p)) / (Math.pow(Math.tan(p), 2) - 1), x);
                    } else {
                        a = Math.pow(t, 3) * x / 6;
                    }

                    double b = Math.pow(
                            Math.pow(
                                    Math.abs(3 * a - 2) + c, 4
                            ), 1.0 / (m + 3)
                    );
                    double P = Math.pow(
                            Math.sqrt(
                                    Math.abs(12 - 10 * m) + 1
                            ) - 5 * a - 2 * c, 1.0 / b
                    );

                    System.out.printf("m = %d, t = %f, c = %f, p = %f, x = %f. Result: a = %f, b = %f, P = %f\n",
                            m, t, c, p, x, a, b, P);
                }
            }

        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }

    }
}
