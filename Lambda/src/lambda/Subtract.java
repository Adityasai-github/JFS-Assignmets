package lambda;

interface subt{  
    int sub(int a,int b);  
}  
  
public class Subtract{  
    public static void main(String[] args) {  
          
        // Multiple parameters in lambda expression  
        Addable ad1=(a,b)->(a-b);  
        System.out.println(ad1.add(10,20));  
          

	}

}
