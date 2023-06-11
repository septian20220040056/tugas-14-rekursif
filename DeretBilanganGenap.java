public class DeretBilanganGenap {

    static void deretGenap(int i){ 
        if(i<=20) {
            System.out.print(i +" ");
            deretGenap(i+=2);
        }         
    } 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        deretGenap(0); 
    }
}