package com.method_reference_examples;

import java.io.File;
import java.io.FileFilter;

public class FindHiddenFiles {

    public static void toFindHiddenFileUsingAnonymous(){

        File[] hiddenFile = new File("D:\\TCCS_LearnQA\\TestCase_Sample")
                .listFiles(new FileFilter() {
                    @Override
                    public boolean accept(File pathname) {
                        return pathname.isHidden();
                    }
                });
        for(File fileName : hiddenFile){
            System.out.println(fileName.getName());
        }
    }

    public static void toFindHiddenFileUsingMR(){

        File[] hiddenFile = new File("D:\\TCCS_LearnQA\\TestCase_Sample")
                .listFiles(File::isHidden);

        for(File fileName : hiddenFile){
            System.out.println(fileName.getName());
        }
    }
    public static void main(String[] args) {
        //toFindHiddenFileUsingAnonymous();
        toFindHiddenFileUsingMR();
    }
}
