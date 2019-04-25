/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collabproject;

import java.io.File;

/**
 *
 * @author david
 */
public class CollabProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File fileReader = new File("c:/Users/david/Desktop/gitHubCollab");
        if (fileReader.isDirectory()) {
            File[] listOfFolders = fileReader.listFiles();
            for (File file : listOfFolders) {
                if (file.isDirectory()) {
                    File[] listOfFiles = file.listFiles();
                    for(File files : listOfFiles){
                        System.out.println(file.getName());
                        System.out.println(files.getName());
                    }
                }
            }
        }

    }
}
