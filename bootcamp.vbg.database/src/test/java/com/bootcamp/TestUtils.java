package com.bootcamp;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by darextossa on 11/30/17.
 */
public class TestUtils {

    public File getFile(String relativePath) throws Exception {

        /*URL url = getClass().getClassLoader().getResource(relativePath);
        File file = new File(url.getFile());*/

        File file = new File(getClass().getClassLoader().getResource(relativePath).toURI());

        if(!file.exists()) {
            throw new FileNotFoundException("File:" + relativePath);
        }

        return file;

    }
}
