package com.workintech.s18d2.exceptions;

import org.apache.http.HttpStatus;

import java.time.LocalDateTime;

public record PlantErrorResponse(Integer status, String message, LocalDateTime localDateTime) {
}
