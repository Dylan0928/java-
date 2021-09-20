
import java.io.FileReader;
import java.io.IOException;

public class Caseconversion {

    public static void main(String args[]) {
        
        if(args[0].equals("")){
            System.out.println("程式正確用法：");
            System.out.println("-U 將檔案內的所有字母轉乘大寫");
            System.out.println("-L 將檔案內的所有字母轉乘小寫");
        } else if(args[0].equalsIgnoreCase("-U")){
            try{
            FileReader fin = new FileReader("source.txt");
            
            int i = fin.read();
                    while(i != -1){
                        char a = (char)i;
                        System.out.println(Character.toUpperCase(a));
                        i = fin.read();
                    }
            } catch(IOException ex){
                System.err.println(ex);
            }
        }
            
    }
    
}
