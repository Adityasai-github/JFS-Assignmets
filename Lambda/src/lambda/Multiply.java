package lambda;
interface multi{  
    int mul(int a,int b);  
}  
  
public class Multiply{  
    public static void main(String[] args) {  
          
        // Multiple parameters in lambda expression  
        Addable ad1=(a,b)->(a*b);  
        System.out.println(ad1.add(10,20));  
          

	}

}
