package com.scaffold.template.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidad que representa la relación entre un usuario y su rol en el sistema.
 * Esta clase está mapeada a la tabla "users_roles" en la base de datos.
 */
@Entity
@Data
@Table(name = "users_roles")
@NoArgsConstructor
@AllArgsConstructor
public class UserRoleEntity {
    /**
     * Identificador único de la entidad.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Usuario asociado.
     * Está mapeado a la columna "user_id" en la base de datos.
     */
    @Column(name = "user_id")
    private UserEntity user;

    /**
     * Rol asociado.
     * Está mapeado a la columna "role_id" en la base de datos.
     */
    @Column(name = "role_id")
    private RoleEntity role;
}
