
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionMain {

    public static void main(String[] args) {
        try{
        System.out.println("Reading from file:"+args[0]);
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.err.println("未指定檔案名稱，程式結束！");
            System.exit(1);
        }
        
        BufferedReader b = null;
        try{
        b =  new BufferedReader(new FileReader(args[0]));
        String s =null;
        while((s = b.readLine()) != null){
            System.out.println(s);
        }
        }catch(FileNotFoundException ex){
            System.err.println("檔案不存在："+args[0]);
        }catch(IOException ie){
            System.out.println("檔案讀取發生錯誤："+ie);
        } finally{
            try{
            b.close();
            } catch (IOException ex){
                System.err.println("檔案讀取發生錯誤！"+ex.getMessage());
            }
        }
        }
    }
    

