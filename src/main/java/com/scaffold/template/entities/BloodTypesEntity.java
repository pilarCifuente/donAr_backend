package com.scaffold.template.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * La clase BloodTypesEntity representa un tipo de sangre.
 * Referencia a la tabla llamada "blood_types".
 */
@Entity
@Data
@Table(name = "blood_types")
@NoArgsConstructor
@AllArgsConstructor
public class BloodTypesEntity {

    /**
     * Identificador único de la entidad.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Descripción del tipo de sangre.
     */
    @Column(name = "description")
    private String description;
}
