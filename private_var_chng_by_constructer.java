import java.util.*;
class aadi
{
    private int x = 10;
    
    aadi(int y)
    {
        this.x =  y;
    }
    void printda()
    {
        System.out.println(x);
    }
    
}

class private_var_chng_by_constructer
{
    public static void main(String arg[]){

    int y = 15;
    aadi obj = new aadi(y);
    // obj.x = 15;
    obj.printda();
    
    }
}