package com.jluukvg.uclassify.data.memory.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by jluukvg on 8/12/17.
 *
 */

public class ClassificationResults {

    @SerializedName("classification")
    @Expose
    private List<Classification> classification = null;

    public List<Classification> getClassification() {
        return classification;
    }

    public void setClassification(List<Classification> classification) {
        this.classification = classification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassificationResults that = (ClassificationResults) o;

        return classification != null ? classification.equals(that.classification) : that.classification == null;
    }

    @Override
    public int hashCode() {
        return classification != null ? classification.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ClassificationResults{" +
                "classification=" + classification +
                '}';
    }
}
