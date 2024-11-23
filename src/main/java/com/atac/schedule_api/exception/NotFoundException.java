/*
 * © ${2024} Jarbas Vitor Pereira Montenegro. All rights reserved.
 * This file is part of the schedule-api and is protected under copyright law.
 * Unauthorized reproduction, modification, or distribution is prohibited.
 *
 */

package com.atac.schedule_api.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(Long id) {
        super("Coud not found ID: " + id);
    }
}
