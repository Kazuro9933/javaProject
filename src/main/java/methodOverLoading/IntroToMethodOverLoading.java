package methodOverLoading;

public class IntroToMethodOverLoading {

    public int getAreaOfRectangle(int length, int width){
        return length * width;
    }
    public int getAreaOfRectangle(long length, long width){
        return (int)(length * width);
    }


    public int getPerimetersOfSquare(int length, int width){
        return (length * width);
    }
    public int getPerimetersOfSquare(long length, long width) {
        return (int) (length * width);
    }
    public int getPerimetersOfSquare(double length, double width) {
        return (int) (length * width);
    }

}
