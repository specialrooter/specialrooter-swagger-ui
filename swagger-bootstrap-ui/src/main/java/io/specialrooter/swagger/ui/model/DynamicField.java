package io.specialrooter.swagger.ui.model;

public class DynamicField {
    private String name;
    private String value;
    private boolean required;
    private Class<?> dataTypeClass = Void.class;
    private String example;

    public DynamicField() {
    }

    public DynamicField(String name, String value, boolean required, String example) {
        this.name = name;
        this.value = value;
        this.required = required;
        this.example = example;
    }

    public DynamicField(String name, String value, boolean required) {
        this.name = name;
        this.value = value;
        this.required = required;
    }

    public DynamicField(String name, String value, boolean required, Class<?> dataTypeClass) {
        this.name = name;
        this.value = value;
        this.required = required;
        this.dataTypeClass = dataTypeClass;
    }

    public DynamicField(String name, String value, boolean required, Class<?> dataTypeClass, String example) {
        this.name = name;
        this.value = value;
        this.required = required;
        this.dataTypeClass = dataTypeClass;
        this.example = example;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public Class<?> getDataTypeClass() {
        return dataTypeClass;
    }

    public void setDataTypeClass(Class<?> dataTypeClass) {
        this.dataTypeClass = dataTypeClass;
    }
}
