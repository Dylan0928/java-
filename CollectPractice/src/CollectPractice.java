import java.util.HashSet;
import java.util.Scanner;

public class CollectPractice {

    public static void main(String[] args) {
        String str1, str2, str3;
        Scanner scanner = new Scanner(System.in);
        HashSet hs = new HashSet();
        
        System.out.println("請輸入六個不重複字串：");
        for(int i =0; i<6 ; i++){
            str1 = scanner.nextLine();
            if(hs.contains(str1))
                System.out.println(str1+"已重複！");
            else
                hs.add(str1);
        }
        System.out.println(hs);
        System.out.println("你想要尋找什麼元素?");
        str2 = scanner.nextLine();
        if(hs.contains(str2))
            System.out.println(str2+"存在！");
        else
            System.out.println(str2+"不存在！");
        
        System.out.println("你想要刪除什麼元素?");
        str3 = scanner.nextLine();
        if(hs.contains(str3)){
            hs.remove(str3);
            System.out.println(str3+"成功刪除！");}
        else
            System.out.println(str3+"不存在！");
        
        System.out.println("目前存在元素個數："+hs.size());
        System.out.println(hs);
    }
    
}
