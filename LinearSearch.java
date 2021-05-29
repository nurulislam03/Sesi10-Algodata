public class LinearSearch {
    
    public static void main(String[] args) {
        int[] angka ={3, 5, 7, 10, 17, 8, 6};
        boolean ketemu = false;
        int key = 6;
        
        for(int i=0;i<angka.length;i++){
            if(key == angka[i]){
                System.out.println("Data ditemukan pada index ke-" + i);
                ketemu = true;
                break;
                
            }
        }
        if(ketemu == false){
            System.out.println("Data tidak ditemukan");
        }
    }
    
}
