// AlgorithmName.java
package com.example.common.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface AlgorithmName {
    String value();
}
