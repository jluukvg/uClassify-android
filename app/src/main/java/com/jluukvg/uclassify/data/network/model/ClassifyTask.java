package com.jluukvg.uclassify.data.network.model;

/**
 * Created by jluukvg on 8/11/17.
 *
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ClassifyTask {

    @SerializedName("texts")
    @Expose
    private List<String> texts = null;

    public List<String> getTexts() {
        return texts;
    }

    public void setTexts(List<String> texts) {
        this.texts = texts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassifyTask that = (ClassifyTask) o;

        return texts != null ? texts.equals(that.texts) : that.texts == null;
    }

    @Override
    public int hashCode() {
        return texts != null ? texts.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ClassifyTask{" +
                "texts=" + texts +
                '}';
    }
}
