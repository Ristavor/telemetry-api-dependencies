// IAlgorithm.java
package com.example.common.model;

import java.util.Map;

public interface IAlgorithm {
    void setParameters(Map<String, String> parameters);
    void setInput(String inputData);
    String solve();
}
