package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {//-
    private List<String> arrayListSymptoms;
    /**
     * Constructor that initializes the AnalyticsCounter object with the given list of symptoms.//-
     * This method counts the occurrences of symptoms in the given list of symptoms and returns a sorted map of the counts.//+
     * It uses a HashMap to store the count of each symptom and then sorts the results using a TreeMap.//+
     *
     * @param arrayListSymptoms the list of symptoms to be counted//-
     * @return a sorted map containing the count of each symptom in the input list
     */
    public AnalyticsCounter(List<String> arrayListSymptoms) {//-
        this.arrayListSymptoms = arrayListSymptoms;//-
    }//-
    public Map<String, Integer> counterSymptoms() {
        Map<String, Integer> mapSymptomCount = new HashMap<>();
        for (String symptom : arrayListSymptoms) {
            if (mapSymptomCount.containsKey(symptom)) {
                mapSymptomCount.put(symptom, mapSymptomCount.get(symptom) + 1);
            } else {
                mapSymptomCount.put(symptom, 1);
            }
        }
        Map<String, Integer> sortedMap = new TreeMap<>(mapSymptomCount);
        return sortedMap;
    }
}
