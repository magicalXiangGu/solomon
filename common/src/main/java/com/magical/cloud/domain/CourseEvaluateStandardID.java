package com.magical.cloud.domain;

import org.axonframework.common.IdentifierFactory;

/**
 * Created by zhouxp on 2017/10/27
 */
public class CourseEvaluateStandardID {

    private final String identifier;

    private final int hashCode;

    public CourseEvaluateStandardID() {
        this.identifier = IdentifierFactory.getInstance().generateIdentifier();
        this.hashCode = identifier.hashCode();
    }

    public CourseEvaluateStandardID(String identifier) {
        this.identifier = identifier;
        this.hashCode = identifier.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseEvaluateStandardID that = (CourseEvaluateStandardID) o;

        if (hashCode != that.hashCode) return false;
        return identifier != null ? identifier.equals(that.identifier) : that.identifier == null;
    }

    @Override
    public int hashCode() {
        return this.hashCode;
    }

    @Override
    public String toString() {
        return this.identifier;
    }

    public String getIdentifier() {
        return identifier;
    }
}
