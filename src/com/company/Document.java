package com.company;

public class Document{
    int id;
    String title;
    String folderName;
    int pages;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }



    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getFolderName() {
        return folderName;
    }

    public int getPages() {
        return pages;
    }

    public Document(int id, String title, String folderName, int pages) {
        this.id = id;
        this.title = title;
        this.folderName = folderName;
        this.pages = pages;
    }


}
