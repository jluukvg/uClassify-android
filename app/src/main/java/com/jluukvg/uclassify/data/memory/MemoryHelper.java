package com.jluukvg.uclassify.data.memory;

import com.jluukvg.uclassify.data.memory.model.ClassificationResults;
import com.jluukvg.uclassify.data.network.model.ClassifierResponse;

/**
 * Created by jluukvg on 8/12/17.
 *
 */

public interface MemoryHelper {

    void saveClassificationResults(ClassificationResults classificationResults);

    ClassificationResults getClassificationResults();
}
