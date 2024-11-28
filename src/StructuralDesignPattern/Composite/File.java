package StructuralDesignPattern.Composite;

public class File implements FileSystem{

    String name;
    File(String fs){
        this.name = fs;
    }

    public void getName(){
        System.out.println("File name :: " + name);
    }

    public void ls(){
        System.out.println("File name is " + name);
    }

    public void lsR(){
        System.out.println("File name is " + name);
    }

}
