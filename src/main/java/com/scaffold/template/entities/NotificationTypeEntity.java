package com.scaffold.template.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * La clase NotificationTypeEntity representa un tipo de notificación.
 * Referencia a la tabla llamada "notification_types".
 */
@Entity
@Data
@Table(name = "notification_types")
@NoArgsConstructor
@AllArgsConstructor
public class NotificationTypeEntity {
    /**
     * Identificador único de la entidad.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Descripción del tipo de notificación.
     */
    @Column(name = "description")
    private String description;
}
