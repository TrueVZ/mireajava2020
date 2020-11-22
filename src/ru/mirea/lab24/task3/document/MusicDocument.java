package ru.mirea.lab24.task3.document;

public class MusicDocument extends IDocument {

    public MusicDocument() {
    }

    @Override
    public void open() {
        System.out.println("Opened MusicDocument");
    }

    @Override
    public void new_file() {
        System.out.println("New MusicDocument");
    }

    @Override
    public String getType() {
        return "Music";
    }
}
