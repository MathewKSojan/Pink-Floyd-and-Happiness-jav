import java.util.*;
// import java.Arrays.*;
//vosprung_code
class pink_floyd {
    public static void main(String[] args) {
        int sts=0;
        Scanner sc=new Scanner(System.in);
        int cnt=sc.nextInt();
        int id_ar[] = new int[cnt];
        
        for(int i=0;i<cnt;i++){
            id_ar[i]=i+1;
        }
        
        int ar[] = new int[cnt];
        for(int i=0;i<cnt;i++){
            int a=sc.nextInt();
            ar[i]=a;
        }
        for(int i=0;i<cnt;i++){
            if(ar[i]==id_ar[i]){
                sts=1;
            }
            else if(ar[i]!=id_ar[i]){
                sts=0;
            }
        }
        if(sts==1){
            System.out.println("Happy");
        }
        else{
            System.out.println("Sad");
        }
    }
}
