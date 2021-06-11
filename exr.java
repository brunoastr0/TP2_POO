import java.util.Scanner;

class exr{


    public static void main(String[] args){
        char[] vog = {'a','e','i','o','u'};

        Scanner input = new Scanner(System.in);
        String vowel = input.nextLine().toLowerCase();
        
        do{
            if(vowel.length() > 1){
                System.out.println("Erro");
                return;
            }
            else{
                for(char i: vog){
                    if(vowel.equals(Character.toString(i))){
                        System.out.println("Vogal");
                        return;
                    }
                    
                }System.out.println("consoante");
                return;
            }
        }while(true);



    }
}