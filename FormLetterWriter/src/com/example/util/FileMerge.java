package com.example.util;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileMerge {

    private Path form;
    private Path list;
    private String nameToken = "<NAME>";
    private Pattern p = Pattern.compile(nameToken);
    private List<String> formLetter;
    private List<String> customLetter;
    private List<String> nameList;
    private int matchStringIndex;

    public FileMerge(Path form, Path list) {
        this.form = form;
        this.list = list;
    }

    // This method takes the form and merges it with the list
    // It generates new files with the names from the list
    public void writeMergedForms() throws IOException {
        //建立預設Charset物件
        Charset cs = Charset.defaultCharset();
        //讀入信件內容,儲存至List<String> formLetter中
        formLetter = Files.readAllLines(form, cs);
        //讀入收件人名,儲存至List<String> nameList中
        nameList = Files.readAllLines(list, cs);
        
        //逐一取出收件人名
        for(String name : nameList){
            //輸出檔案名稱規則: 收件人名Sean Cheng, 檔案名稱為Sean_Cheng.txt
            String fileName = name.replace(' ', '_').concat(".txt");
            //建立輸出檔Path物件
            Path output = form.resolveSibling(fileName);
            //建立輸出檔內容物件 LinkedList<String> customLetter            
            customLetter = new LinkedList<>();
            //自formLetter讀入信件內容,
            for(String content : formLetter){                
                if(hasToken(content)){
                    // 內容中包含<NAME>, 以收件人名取代
                    customLetter.add(mergeName(content, name));
                } else {
                    // 不包含<NAME>, 直接寫入
                    customLetter.add(content);
                }                
            }
            //寫出至輸出檔
            Files.write(output, customLetter, cs);
            System.out.println ("Wrote form letter to: " + name);
        }
    }

    // Produce a new string in the letter that replaces the token with the name
    private String mergeName(String form, String name) {
        Matcher m = p.matcher(form);
        return (m.replaceFirst(name));
    }

    // Determine if the String has the token
    private boolean hasToken(String s) {
        Matcher m = p.matcher(s);
        return m.find();
    }
}