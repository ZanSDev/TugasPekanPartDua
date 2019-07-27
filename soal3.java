
package ujianpekandua;




public class soal3 {
    public static void main(String[] args) {
        
        String[][] data = {{"Fauzan",String.valueOf(62813)},{"Kardi",String.valueOf(62814)},{"Rohman",String.valueOf(62815)}};
            
        System.out.println("Nomer Tiga : ");
        
           for (int x = 0; x < data.length; x++) {
               System.out.println("Nama : "+data[x][0]);
               System.out.println("Nomor : " +data[x][1]);
        }
            
        
        
    }
}
