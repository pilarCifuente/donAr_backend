package com.scaffold.template.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * La clase EconomicContributionEntity representa una contribución económica.
 * Referencia a la tabla llamada "economic_contributions".
 */
@Entity
@Data
@Table(name = "economic_contributions")
@NoArgsConstructor
@AllArgsConstructor
public class EconomicContributionEntity {
    /**
     * Identificador único de la entidad.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Usuario asociado a la contribucion economica.
     * Está mapeado a la columna "user_id" en la base de datos.
     */
    @Column(name = "user_id")
    private UserEntity user;

    /**
     * Monto asociado a la contribucion economica.
     */
    @Column
    private Double amount;

    /**
     * Fecha de la contribucion economica.
     */
    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime date;
}
