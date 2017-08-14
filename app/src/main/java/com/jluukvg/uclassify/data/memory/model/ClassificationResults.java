package com.jluukvg.uclassify.data.memory.model;

import com.jluukvg.uclassify.data.network.model.Classification;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by jluukvg on 8/12/17.
 *
 */

public class ClassificationResults {

    private ArrayList<Classification> classificationResults = new ArrayList<>();

    @Inject
    public ClassificationResults() {
    }

    public List<Classification> getClassificationResults() {
        return classificationResults;
    }

    public void setClassificationResults(ArrayList<Classification> classificationResults) {
        this.classificationResults = classificationResults;
    }

    public void addTopicToClassification(Classification topic) {
        classificationResults.add(topic);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassificationResults that = (ClassificationResults) o;

        return classificationResults != null ? classificationResults.equals(that.classificationResults) : that.classificationResults == null;
    }

    @Override
    public int hashCode() {
        return classificationResults != null ? classificationResults.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ClassificationResults{" +
                "classificationResults=" + classificationResults +
                '}';
    }
}
