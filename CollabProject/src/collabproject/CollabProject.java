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
        File fileReader = new File("c/Users/david/gitHubCollab");
        if (fileReader.isDirectory()) {
            File[] listOfFiles = fileReader.listFiles();
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                }
            }
        }

    }
}
