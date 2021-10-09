package com.SpringMVC.DemoProject;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class NameValidationConstraintValidator implements ConstraintValidator<NameValidation, String> {

    private String prefixValue;

    @Override
    public void initialize(NameValidation constraintAnnotation) {
        prefixValue = constraintAnnotation.value();


        //        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {


        boolean result = false;

        if (value != null) {
            result = value.startsWith(prefixValue);
            return result;
        } else
            return result;
    }
}
