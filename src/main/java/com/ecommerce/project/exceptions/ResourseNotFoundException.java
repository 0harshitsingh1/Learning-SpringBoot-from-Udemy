package com.ecommerce.project.exceptions;

public class ResourseNotFoundException extends RuntimeException {
    String fieldName;
    String field;
    String resourceName;
    Long fieldId;

    public ResourseNotFoundException() {
    }

    public ResourseNotFoundException(String fieldName, String field, String resourceName) {
        super(String.format("%s not found with %s: %s", resourceName,fieldName,field));
        this.fieldName = fieldName;
        this.field = field;
        this.resourceName = resourceName;
    }

    public ResourseNotFoundException(String field, String resourceName, Long fieldId) {
        super(String.format("%s not found with %s: %d", resourceName,field,fieldId));
        this.field = field;
        this.resourceName = resourceName;
        this.fieldId = fieldId;
    }
}
