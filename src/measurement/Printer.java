package measurement;
//ilham rizqi a
//automatic text

public class Printer {
    
    public void printAllMachineTemperatures (double [] daftarPengukuranSuhuMesin){
        
        int n = daftarPengukuranSuhuMesin.length;
        
        int i = 0;
        
        while (i < n) {
            System.out.println(daftarPengukuranSuhuMesin[i]);
            i++;
            
        }
        
    }
    
}
