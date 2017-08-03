package junit;

public class CoverageTest {
    public static int  testadd(int x, int y){
        int c = 0;
        if(x == 10){
            c = x + y;
        }else{
            c = (x + y)*2;
        }
        return c;
    }
}