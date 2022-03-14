package com.serasa.experian.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.persistence.EntityNotFoundException;

@ControllerAdvice
public class ExceptionHelper {

    @ExceptionHandler(value = {EntityNotFoundException.class})
    public ResponseEntity<Object> handleInvalidIdException(EntityNotFoundException ex) {
        return new ResponseEntity<Object>("Pessoa não encontrada", HttpStatus.NO_CONTENT);
    }

    @ExceptionHandler(value = {IndexOutOfBoundsException.class})
    public ResponseEntity<Object> handleInvalidIdException(IndexOutOfBoundsException ex) {
        return new ResponseEntity<Object>("Pessoa não encontrada", HttpStatus.NO_CONTENT);
    }

    @ExceptionHandler(value = {HttpMessageNotReadableException.class})
    public ResponseEntity<Object> handleInvalidInputException(HttpMessageNotReadableException ex) {

        return new ResponseEntity<Object>("JSON com parâmetros inválidos: " + ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public ResponseEntity<Object> handleInvalidInputException(MethodArgumentNotValidException ex) {
        return new ResponseEntity<Object>("JSON com parâmetros vazios ou nulos", HttpStatus.BAD_REQUEST);
    }

}
