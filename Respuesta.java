public class Respuesta {
    
    public static void superDigito(int digit, int repeat){
        String bigDigit = ""; 
        for(int i=0; i<repeat; i++){
            bigDigit += digit;
        }
        
        char[] str = bigDigit.toCharArray();
        
        System.out.println(superDigito(str));
        
    }
    
    public static int superDigito(char[] str){
        int sum = 0; 
        
        for(int i=0; i<str.length; i++){
            sum += Integer.parseInt(String.valueOf(str[i]));  
        }
        
        char[] strNew = String.valueOf(sum).toCharArray();
        
        
        return strNew.length <= 1 ? sum : superDigito(strNew);
    }
    
    public static void main(String args[]) {
        
        superDigito(9999, 1);
    }
}
