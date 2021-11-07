package lambda;
interface divi{  
    int div(int a,int b);  
}  
  
public class Division{  
    public static void main(String[] args) {  
          
        // Multiple parameters in lambda expression  
        Addable ad1=(a,b)->(a/b);  
        System.out.println(ad1.add(10,20));  
          

	}

}
