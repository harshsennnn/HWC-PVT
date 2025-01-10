public class BadCode{
    public String name;    // public field violation
    public void method(){
        if(name==test){    // no spaces, equals vs equals()
            System.out.println(test);}    // bad brace placement
        
        if(true)    // missing braces
            return;
        
        boolean flag=true;if(flag==true)System.out.println(bad);    // multiple statements, simplify boolean
    }}
