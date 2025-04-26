package com.scaffold.template.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * La clase Site representa una sede.
 * Referencia a la tabla llamada "sites".
 */
@Entity
@Data
@Table(name = "sites")
@NoArgsConstructor
@AllArgsConstructor
public class SiteEntity {

    /**
     * Identificador único de la entidad.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Nombre de la sede
     */
    @Column(name = "site_name")
    private String siteName;

    /**
     * Direccion de la sede
     */
    @Column
    private String address;
}
