package com.importcsvfiles.helper;

import com.importcsvfiles.model.Tutorial;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CSVHelper {
    public static String TYPE ="text/csv";
    static String[] HEADERS ={"Id","Title","Description","Published"};
    public static boolean hasCSVFormat(MultipartFile file) {
//        if (!TYPE.equals(file.getContentType()))
//            return false;
//        return true;
//    }
      if (TYPE.equals(file.getContentType()) || file.getContentType().equals("application/vnd.ms-excel")) {
        return true;
    }
    return false;
}
    public static List<Tutorial> csvTutorials(InputStream inputStream) {
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
             CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {
            List<Tutorial> tutorials = new ArrayList<Tutorial>();
            Iterable<CSVRecord> csvRecords = csvParser.getRecords();
            for (CSVRecord csvRecord : csvRecords) {
                Tutorial tutorial = new Tutorial(
//                        Long.parseLong(csvRecord.get("cameraId")),
                        csvRecord.get("model"),
                        csvRecord.get("brand"),
                        csvRecord.get("cameraType"),
                        csvRecord.get("lensType"),
                        Integer.parseInt(csvRecord.get("price"))
                );
                tutorials.add(tutorial);
            }
            return tutorials;
        } catch (IOException e) {
            throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
        }
    }
}
