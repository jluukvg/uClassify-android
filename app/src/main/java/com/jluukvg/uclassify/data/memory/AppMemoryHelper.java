package com.jluukvg.uclassify.data.memory;

import com.jluukvg.uclassify.data.memory.model.ClassificationResults;

import javax.inject.Inject;

/**
 * Created by jluukvg on 8/12/17.
 *
 */

public class AppMemoryHelper implements MemoryHelper {

    @Inject
    public AppMemoryHelper() {

    }

    @Override
    public ClassificationResults getClassificationResults() {
        return new ClassificationResults();
    }

    @Override
    public void saveClassificationResults(ClassificationResults classificationResults) {

    }
}
