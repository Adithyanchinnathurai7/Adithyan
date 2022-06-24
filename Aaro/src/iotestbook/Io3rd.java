package iotestbook;
import java.io.*;
class onlyext implements FilenameFilter{
String ext;
public onlyext(String e)
{   ext="."+e;   }
public boolean accept(File dir, String name){
return name.endsWith(ext);
 }    }
class Dirlistonly{
public static void main(String args[]){
String dirname="c:/users";
File f1=new File(dirname);
FilenameFilter only=new onlyext("html");
String s[]=f1.list(only);
for (int i=0;i<s.length;i++){
System.out.println(s[i]);   }    
}    }
