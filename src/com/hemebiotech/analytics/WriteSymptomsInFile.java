package com.hemebiotech.analytics;
import java.io.FileWriter;
import java.util.Map;


public class WriteSymptomsInFile {
    private Map<String, Integer> mapSymptomSorted;
    private String filepath;
    public WriteSymptomsInFile(Map<String, Integer> symptomSorted, String filePath) {
        this.mapSymptomSorted = symptomSorted;
        this.filepath = filePath;
    }
    /**
     * Writes the sorted symptoms and their counts to a file.
     *
     * @param symptomSorted A sorted map containing symptoms as keys and their counts as values.
     * @param filePath The path of the file where the symptoms will be written.
     *
     * @throws Exception If an error occurs while writing to the file.
     */
    public void writeToFile() throws Exception {
        try (FileWriter writer = new FileWriter(filepath)) {
            for (Map.Entry<String, Integer> entry : mapSymptomSorted.entrySet()) {
                writer.write(entry.getKey() + " : " + entry.getValue() + "\n");
            }
        }
    }

}