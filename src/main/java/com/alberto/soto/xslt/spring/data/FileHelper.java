package com.alberto.soto.xslt.spring.data;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * com.alberto.soto.xslt.spring.data
 * Class FileHelper
 * By berto. 24/06/2018
 */
public class FileHelper {
    public static final String RESOURCE_PATH = "WEB-INF/xsl";

    public static List<String> getScripts() {
        //No funciona bien en el deployment
        final Logger log = LoggerFactory.getLogger(FileHelper.class);
        ArrayList<String> aux = new ArrayList();
        try {
            File folder = new File(RESOURCE_PATH);
            for (File file : folder.listFiles()) {
                if (file.isFile() && StringUtils.equals(FilenameUtils.getExtension(file.getAbsolutePath()), "xslt")) {
                    log.info(file.getAbsolutePath());
                    aux.add(file.getName());
                }
            }
        } catch (Exception e) {
            log.error("listing Scripts", e);
        }
        return aux;
    }
}
