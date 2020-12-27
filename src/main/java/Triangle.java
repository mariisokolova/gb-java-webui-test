public class Triangle {

    public static double getSquare(int a, int b, int c){
        double s = (a + b + c) / 2.0;
        double triangleSquare = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return triangleSquare;
    }

}
