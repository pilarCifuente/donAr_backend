package com.scaffold.template.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * La clase ShiftState representa un estado de turno.
 * Referencia a la tabla llamada "shift_states".
 */
@Entity
@Data
@Table(name = "shift_states")
@NoArgsConstructor
@AllArgsConstructor
public class ShiftStateEntity {

    /**
     * Identificador único de la entidad.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Descripción del estado del turno.
     */
    @Column(name = "description")
    private String description;
}
