package m5t2_davispaulino2;

public class M5T2_DavisPaulino2 {        
    
    public static void main(String[] args) {
        showMessage();
        myMethod();
        displayValue(23);
    }
    
    public static void displayValue(int num){
        System.out.println("The value is "+num);
    }
    
    // this method will give me a value of 23
    public static void myMethod(){
        int value = 23;
        System.out.println(value);
    }
    
    // this method will say my name
    public static void showMessage()
    {
        System.out.println("My name is Eugene.");
    }
}

    



