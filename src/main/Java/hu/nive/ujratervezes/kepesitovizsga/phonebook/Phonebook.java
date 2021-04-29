package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class Phonebook {
    public void exportPhonebook(TreeMap<String, String> contacts, String output) {

        if (contacts == null){
            throw new IllegalArgumentException();
        }
        if (output == null){
            throw new IllegalArgumentException();
        }
/*
            public void writeLines(, BufferedWriter writer) {
                try {
                    for (String ) {
                        writer.write();
                    }
                } catch (IOException ioe) {
                    throw new IllegalStateException("Can not write file", ioe);
                }
            }


            }
        }*/
    }

}