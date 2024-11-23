/*
 * © ${2024} Jarbas Vitor Pereira Montenegro. All rights reserved.
 * This file is part of the schedule-api and is protected under copyright law.
 * Unauthorized reproduction, modification, or distribution is prohibited.
 *
 */

package com.atac.schedule_api.repository;

import com.atac.schedule_api.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Long> {
}
