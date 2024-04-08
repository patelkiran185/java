public class deciToBin {
    public static void main(String[] args){
        int num=102;
        String sts=" ";
        while(num>0){
            sts=num%2+sts;
            num=num/2;
        }
        String s="";
        for(int i=0;i<sts.length();i++){
            // if(sts.charAt(i)==' '){
            //     continue;
            // }
            s+=sts.charAt(i); 
        }
        System.out.println(s);
 
    }


    
}
