package com.scaffold.template.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * La clase NotificationEntity representa una notificación.
 * Referencia a la tabla llamada "notifications".
 */
@Entity
@Data
@Table(name = "notifications")
@NoArgsConstructor
@AllArgsConstructor
public class NotificationEntity {
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
     * Tipo de notificacion.
     * Está mapeado a la columna "notification_type_id" en la base de datos.
     */
    @Column(name = "notification_type_id")
    private NotificationTypeEntity notificationType;

    /**
     * Titulo de la notificacion
     */
    @Column
    private String title;

    /**
     * Asunto de la notificacion
     */
    @Column
    private String subject;

    /**
     * mensaje de la notificacion
     */
    @Column
    private String message;

    /**
     * Fecha de la notificacion.
     */
    @Column(name = "shipping_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime shippingDate;


}
