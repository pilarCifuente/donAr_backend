package com.scaffold.template.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * La clase ShiftEntity representa un turno.
 * Referencia a la tabla llamada "shifts".
 */
@Entity
@Data
@Table(name = "shifts")
@NoArgsConstructor
@AllArgsConstructor
public class ShiftEntity {
    /**
     * Identificador único de la entidad.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Usuario asociado al turno.
     * Está mapeado a la columna "user_id" en la base de datos.
     */
    @Column(name = "user_id")
    private UserEntity user;

    /**
     * Sede asociada.
     * Está mapeado a la columna "site_id" en la base de datos.
     */
    @Column(name = "site_id")
    private SiteEntity site;

    /**
     * Estado del turno.
     * Está mapeado a la columna "shift_states_id" en la base de datos.
     */
    @Column(name = "shift_states_id")
    private ShiftStateEntity shiftState;

    /**
     * Fecha y hora del turno
     */
    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime date;

    /**
     * Observaciones de la donacion.
     */
    @Column
    private String observations;
}
