package com.pl.jokes_about_chuck_norris.History;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteFile {

    public static void writeByte(byte[] bytes) {
        try {
            Files.write(Paths.get("com.pl.jokes_about_chuck_norris.History.txt"), bytes, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
