/*
 * © ${2024} Jarbas Vitor Pereira Montenegro. All rights reserved.
 * This file is part of the schedule-api and is protected under copyright law.
 * Unauthorized reproduction, modification, or distribution is prohibited.
 *
 */

package com.atac.schedule_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class NotFoundAdvice {

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String notFoundHandler(NotFoundException ex){
        return ex.getMessage();
    }
}
