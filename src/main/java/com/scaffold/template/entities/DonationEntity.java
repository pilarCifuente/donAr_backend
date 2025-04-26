package com.scaffold.template.entities;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * La clase DonationEntity representa una donación.
 * Referencia a la tabla llamada "donations".
 */
@Entity
@Data
@Table(name = "donations")
@NoArgsConstructor
@AllArgsConstructor
public class DonationEntity {
    /**
     * Identificador único de la entidad.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Turno asociado a la donación
     */
    @Column(name = "shift_id")
    private ShiftEntity shift;

    /**
     * Usuario asociado a la donacion.
     * Está mapeado a la columna "user_id" en la base de datos.
     */
    @Column(name = "user_id")
    private UserEntity user;

    /**
     * Sede asociada a la donacion.
     * Está mapeado a la columna "site_id" en la base de datos.
     */
    @Column(name = "site_id")
    private SiteEntity site;

    /**
     * Tipo de sangre asociada a la donacion.
     * Está mapeado a la columna "blood_type_id" en la base de datos.
     */
    @Column(name = "blood_type_id")
    private BloodTypesEntity bloodType;

    /**
     * Fecha de la donacion.
     */
    @Column(name = "donation_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime donationDate;

    /**
     * Ml donados
     */
    @Column(name = "donated_volume_ml")
    private Integer donatedVolumeMl;
}
