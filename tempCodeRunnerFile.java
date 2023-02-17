public class palindrom {
    static boolean isAnagram(String a, String b) {
        
        char chr1[]= a.toLowerCase().toCharArray();
        char chr2[]= b.toLowerCase().toCharArray();
    

        Arrays.sort(chr1);
        Arrays.sort(chr2);    
      
        return Arrays.equals(chr1, chr2);
     }

     public static void main(String[] args) {
        String a = "anagraam";
        String b = "marganaa";
        System.out.println(isAnagram(a, b));;
     }