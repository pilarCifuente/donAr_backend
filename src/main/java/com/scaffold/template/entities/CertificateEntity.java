package com.scaffold.template.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * Entidad que representa un certificado en el sistema.
 * Esta clase está mapeada a la tabla "certificates" en la base de datos.
 */
@Entity
@Data
@Table(name = "certificates")
@NoArgsConstructor
@AllArgsConstructor
public class CertificateEntity {
    /**
     * Identificador único de la entidad.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Usuario asociado al certificado.
     * Está mapeado a la columna "user_id" en la base de datos.
     */
    @Column(name = "user_id")
    private UserEntity user;

    /**
     * Rol asociado al certificado.
     * Está mapeado a la columna "role_id" en la base de datos.
     */
    @Column(name = "role_id")
    private RoleEntity role;

    /**
     * Fecha de donación del usuario.
     * Está mapeada a la columna "donation_date" en la base de datos.
     * El formato de la fecha es "dd-MM-yyyy".
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "donation_date")
    private LocalDate donationDate;
}
