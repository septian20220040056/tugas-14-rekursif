public class DeretBilangan {
    static void deret(int i){ 
        if(i<10){ 
            System.out.print(i+ " "); 
            deret(++i); 
        } 
    } 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
         int i=0; 
         deret(i); 
    }
}