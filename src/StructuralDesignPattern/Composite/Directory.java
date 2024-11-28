package StructuralDesignPattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String name;
    List<FileSystem>fileSystemList;
    Directory(String dn){
        name = dn;
        fileSystemList = new ArrayList<>();
    }
    public void addDirectory(FileSystem fs){
        fileSystemList.add(fs);
    }
    public void getName(){
        System.out.println("Dir name :: " + name);
    }
    public void ls(){
        System.out.println("Directory name is " + name);
        for(FileSystem fs: fileSystemList){
            fs.getName();
        }
    }
    public void lsR(){
        System.out.println("Directory name is " + name);
        for(FileSystem fs: fileSystemList){
            fs.lsR();
        }
    }
}
