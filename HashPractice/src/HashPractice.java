import java.util.HashSet;
import java.util.Scanner;

public class HashPractice {
    public static void main(String[] args) {
       HashSet hs = new HashSet();
       String str0, str1, str2;
       Scanner scanner = new Scanner(System.in);
       do{
           System.out.println("請輸入第"+(hs.size()+1)+"個字串:");
           str0 = scanner.nextLine();
           if(str0 == null || "".equals(str0))
               System.out.println("請重新輸入字串！");
           else if(hs.contains(str0))
               System.out.println("字串已存在，請重新輸入！");
           else
               hs.add(str0);
       } while(hs.size()<6);
        System.out.println("您輸入的六個字串為：");
        System.out.println(hs);
        
        System.out.println("輸入欲尋找的元素：");
        str1 = scanner.nextLine();
        System.out.println(hs.contains(str1)? str1+"存在":str1+"不存在");
        
        System.out.println("輸入欲刪除的元素：");
        str2 = scanner.nextLine();
        if(hs.contains(str2)){
            hs.remove(str2);
            System.out.println(str2+"刪除成功！");
        } else
            System.out.println(str2+"不存在，刪除失敗！");
        
        System.out.println("目前元素個數為："+hs.size());
        System.out.println("目前集合元素為：");
        System.out.println(hs);
    }
    
}
