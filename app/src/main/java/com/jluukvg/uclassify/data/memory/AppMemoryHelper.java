package com.jluukvg.uclassify.data.memory;

import com.jluukvg.uclassify.data.memory.model.ClassificationResults;

import javax.inject.Inject;

/**
 * Created by jluukvg on 8/12/17.
 *
 */

public class AppMemoryHelper implements MemoryHelper {

    private ClassificationResults classificationResults;

    @Inject
    public AppMemoryHelper(ClassificationResults classificationResults) {
        this.classificationResults = classificationResults;
    }

    @Override
    public ClassificationResults getClassificationResults() {
        return classificationResults;
    }

    @Override
    public void saveClassificationResults(ClassificationResults classificationResults) {
        this.classificationResults = classificationResults;
    }
}
