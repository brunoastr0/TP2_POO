import java.util.Scanner;

public class exeer {


    public static void main(String[] args){
          /*Scanner scanner = new Scanner(System.in);
    
    String input = scanner.nextLine();*/
    String input = "18 horas e 30 minutos";
    char[] ch = input.toCharArray();
    int cont =0;
    String sum = "";
    int f = 0;
  

   for(char i : ch){
       
        if(Character.isDigit(i)){
        
            if(Integer.parseInt(String.valueOf(i)) < 10){
                sum += i; 
                for(int j = 0; j<1;j++){
                    if(cont == 1) break;
                    System.out.print("0");
                    cont++;
                }
                 
            }
            
            
        }
        
        
   }
   
    f =(int)(Integer.parseInt(String.valueOf(sum)));
    
   
   System.out.print((f));
   
   System.out.println();
      
    }
            
        
   
}

