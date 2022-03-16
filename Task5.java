class Task5 {

    public static double triangleArea(int side1, int side2, int side3){
        double semiPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }
    public static void main(String[] args) {
        System.out.println(triangleArea(12, 5, 10));
    }
}
