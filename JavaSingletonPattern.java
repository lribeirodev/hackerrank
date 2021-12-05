import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    
    private static Singleton instance;
    
    public String str;
    
    private Singleton(){
        
    }
    
    static Singleton getSingleInstance(){
        return instance == null ? new Singleton() : instance;
    }
    
}
