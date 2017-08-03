package com.jluukvg.uclassify.data.network.model;

/**
 * Created by jluukvg on 8/2/17.
 *
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ClassifierResponse {

    @SerializedName("textCoverage")
    @Expose
    private Float textCoverage;
    @SerializedName("classification")
    @Expose
    private List<Classification> classification = null;

    public Float getTextCoverage() {
        return textCoverage;
    }

    public void setTextCoverage(Float textCoverage) {
        this.textCoverage = textCoverage;
    }

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

        ClassifierResponse that = (ClassifierResponse) o;

        return (textCoverage != null ? textCoverage.equals(that.textCoverage) : that.textCoverage == null)
                && (classification != null ? classification.equals(that.classification) : that.classification == null);
    }

    @Override
    public int hashCode() {
        int result = textCoverage != null ? textCoverage.hashCode() : 0;
        result = 31 * result + (classification != null ? classification.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ClassifierResponse{" +
                "textCoverage=" + textCoverage +
                ", classification=" + classification +
                '}';
    }
}
