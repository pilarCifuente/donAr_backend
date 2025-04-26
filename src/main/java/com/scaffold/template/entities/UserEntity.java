package com.scaffold.template.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Entidad que representa un usuario en el sistema.
 * Esta clase está mapeada a la tabla "users" en la base de datos.
 */

@Entity
@Data
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    /**
     * Identificador único del usuario.
     * Generado automáticamente.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Email del usuario.
     *  Debe ser único y no puede ser nulo.
     */
    @Column(unique = true, nullable = false)
    private String email;

    /**
     * Contraseña del usuario.
     * No puede ser nula.
     */
    @Column(nullable = false)
    private String password;

    /**
     * Nombre del usuario.
     */
    @Column
    private String name;

    /**
     * Apellido del usuario.
     */
    @Column
    private String lastName;

    /**
     * Tipo de documento del usuario.
     */
    @Column(name = "type_document_id")
    private DocumentTypeEntity documentType;

    /**
     * Documento del usuario.
     */
    @Column
    private String document;

    /**
     * Fecha de nacimiento del usuario.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column
    private LocalDate birthdate;

    /**
     * Indica si el usuario está activo.
     */
    @Column
    private Boolean active;
}
