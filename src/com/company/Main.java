package com.company;

import javax.print.Doc;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Document[] docs = new Document[4];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < docs.length; i++) {
            int id = sc.nextInt();
            String title = sc.next();
            String folderName = sc.next();
            int pages = sc.nextInt();

            docs[i] = new Document(id, title, folderName, pages);
        }

        Document[] finalResult = docsWithOddPages(docs);
        for (Document d :
                finalResult) {
            System.out.printf(d.getId() + " " + d.getTitle() + " " + d.getFolderName() + " " + d.getPages() + "\n");
        }
    }

    private static Document[] bubbleSort(Document[] result) {
        Document[] temp = new Document[result.length];
        int index = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 1; j < result.length - i; j++) {
                if (result[j - 1].getId() > result[j].getId()) {
                    //swap Documents objects (fundamental things)
                    //we can not swap any attributes of any objects so we need to swap the Document objects
                    temp[index] = result[j - 1];
                    result[j - 1] = result[j];
                    result[j] = temp[index];
                }
            }
        }

        return result;
    }

    private static Document[] docsWithOddPages(Document[] docs) {
        int index = 0;
        for (int i = 0; i < docs.length; i++) {
            if (docs[i].getPages() % 2 != 0) {
                //  fDocs[j] = docs[i];
                index++;
            }
        }
        Document[] fDocs = new Document[index];
        int j = 0;
        for (int i = 0; i < docs.length; i++) {
            if (docs[i].getPages() % 2 != 0) {
                fDocs[j] = docs[i];
                j++;
            }

        }
        return bubbleSort(fDocs);
    }
}
