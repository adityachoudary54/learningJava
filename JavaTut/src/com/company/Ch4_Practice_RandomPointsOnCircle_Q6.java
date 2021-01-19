package com.company;

public class Ch4_Practice_RandomPointsOnCircle_Q6 {
    public static void main(String[] args) {
        double alpha = Math.random() * Math.PI * 2;
        double x1, y1;
        x1 = 40 * Math.cos(alpha);
        y1 = 40 * Math.sin(alpha);

        alpha = Math.random() * Math.PI * 2;
        double x2, y2;
        x2 = 40 * Math.cos(alpha);
        y2 = 40 * Math.sin(alpha);

        alpha = Math.random() * Math.PI * 2;
        double x3, y3;
        x3 = 40 * Math.cos(alpha);
        y3 = 40 * Math.sin(alpha);

        double a, b, c;
        a = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
        b = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
        c = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        double angle1, angle2, angle3;
        angle1 = Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));
        angle2 = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c)));
        angle3 = Math.toDegrees(Math.acos((c * c + a * a - b * b) / (2 * c * a)));

        System.out.printf("The angles are:%.2f, %.2f, %.2f\n", angle1, angle2, angle3);
        System.out.println(angle1 + angle2 + angle3);
    }
}
