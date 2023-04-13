package com.app.TrainingWebApp.exceptions;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;


@RequiredArgsConstructor
@Data
public class ApiException {
    private final String message;
    private final HttpStatus httpStatus;

}
