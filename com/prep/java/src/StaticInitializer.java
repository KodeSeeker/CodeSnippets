public class StaticInitializer 
{
    public static final int x = 5;
    public static final int y; 
    //note that since y is final, it can be initialized only once.
        
    //Static initializer block, which is executed only once when the class is loaded.
    static 
    {
        if(x == 5)
            y = 10;
        else
            y = 5;
    }
    
    //constructor is called only after static initializer block
    public StaticInitializer(){} 
}


