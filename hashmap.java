import java.util.*;

class hashmap{
    public static void main(String []ags){

        hashmap h1=new hashmap();
        String str1="RAM";        
        String str2="SAM";        
        String str3="CAM";
        System.out.println(str1.hashCode());    
        System.out.println(str2.hashCode());    
        System.out.println(str3.hashCode());    

        HashMap hm=new HashMap();
        hm.put("RAM","PTC");
        hm.put("SAM","Accenture");
        hm.put("CAM","EQtech");
        // hm.put("Ajinkya","Veritas");

        System.out.println(hm);
        System.out.println(h1);


    }
}