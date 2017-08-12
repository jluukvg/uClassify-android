package com.jluukvg.uclassify.data.memory.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Classification {

    @SerializedName("className")
    @Expose
    private String className;
    @SerializedName("p")
    @Expose
    private Float p;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Float getP() {
        return p;
    }

    public void setP(Float p) {
        this.p = p;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Classification that = (Classification) o;

        return (className != null ? className.equals(that.className) : that.className == null)
                && (p != null ? p.equals(that.p) : that.p == null);
    }

    @Override
    public int hashCode() {
        int result = className != null ? className.hashCode() : 0;
        result = 31 * result + (p != null ? p.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Classification{" +
                "className='" + className + '\'' +
                ", p=" + p +
                '}';
    }
}
