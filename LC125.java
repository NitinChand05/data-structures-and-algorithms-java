public class LC125 {
    public static void main(String args[]){
        String s ="A man, a plan, a canal: Panama";

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left =0 ;
        int right = s.length()-1;
        

        if(s.length() == 0){
            System.out.println(true);
            return;
        }

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                System.out.println(false);
                return;
            }
                right --;
                left++;
                        
        }
        System.out.println(true);
    }
}
