package StructuralDesignPattern.Composite;

public class Client {
    public static void main(String[] args) {
        Directory CDrive = new Directory("C");
        Directory songs = new Directory("Songs");
        CDrive.addDirectory(songs);
        songs.addDirectory(new File("Brown Rang"));
        songs.addDirectory(new File("Mirrors"));
        songs.addDirectory(new File("Perfect"));

        CDrive.addDirectory(new Directory("Movies"));
        CDrive.addDirectory(new Directory("Photos"));

        CDrive.addDirectory(new File("main.cpp"));

        CDrive.lsR();

    }
}
