/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan.latihan.pkg1;

/**
 *
 * @author user
 */
public class PercabanganLatihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
//       char gender = 'm' ;
//        if (gender == 'P'|| gender == 'p'|| gender == 'F' || gender == 'f'){
//             System.out.println("PEREMPUAN");
//          }
//        else if (gender == 'L'|| gender =='l'|| gender =='M'|| gender == 'm'){
//           System.out.println("LAKI LAKI");
//}
//      else {
//           System.out.println("MOHON MAAF SISTEM TIDAK VALID");
//      }
//   int usia = 24;
//   String paras = "ganteng";
//   String uang = "banyak";
//   String pintar = "ya";
//   if (usia >= 24 && paras == "ganteng" && uang =="banyak" && pintar =="ya"){
//       System.out.println ("SAYA MAU MENIKAH");
//   }
//   else {
//       System.out.println ("SAYA TIDAK MAU MENIKAH");
//        }
//    }
//  }
        int nilaiAndroid = 55;
        String wajah ="Cantik";
        String asal = "Malang";
        
System.out.println("Apakah mau menikah");
String nilaiAndroidHuruf;
    if (nilaiAndroid >= 85){
        nilaiAndroidHuruf ="A";
    }
    else if (nilaiAndroid >= 75){
        nilaiAndroidHuruf = "B";
    }
    else if (nilaiAndroid >= 65){
        nilaiAndroidHuruf = "C";
    }
    else if (nilaiAndroid >=55){
        nilaiAndroidHuruf = "D";
    }
    else{
        nilaiAndroidHuruf = "E";
}
        
    if (nilaiAndroidHuruf =="A" && wajah == "Cantik"&& asal == "Malang"){
        System.out.println("MAU BANGET");
    }
    else if (nilaiAndroidHuruf== "C" && wajah =="Cantik"&& asal =="Malang"){
        System.out.println("BOLEH LAH");
    }
    else if (asal =="Malang"){
        System.out.println("SAYA PIKIR PIKIR DULU");
        
    }
    else {
        System.out.println ("ABSOLUTELY NO");
        }
    }
}