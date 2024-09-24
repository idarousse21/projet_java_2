package com.hemebiotech.analytics;

public class Main {
    public static void main(String[] args) throws Exception {
        ReadSymptomDataFromFile arraylistsymptoms = new ReadSymptomDataFromFile("symptoms.txt");
        AnalyticsCounter counter = new AnalyticsCounter(arraylistsymptoms.GetSymptoms());
        WriteSymptomsInFile writeSymptomsInFile = new WriteSymptomsInFile(counter.counterSymptoms(), "result.out");
        writeSymptomsInFile.writeToFile();
    }


}

