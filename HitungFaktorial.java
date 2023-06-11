public class HitungFaktorial {
    static int faktorial(int i){ 
        if(i==0 || i==1) return 1; 
        return i*faktorial(i-1); 
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print(faktorial(6)); 
    }
}