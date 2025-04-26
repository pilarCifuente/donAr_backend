package com.scaffold.template.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidad que representa un tipo de documento en el sistema.
 * Esta clase está mapeada a la tabla "document_types" en la base de datos.
 */
@Entity
@Data
@Table(name = "document_types")
@NoArgsConstructor
@AllArgsConstructor
public class DocumentTypeEntity {

    /**
     * Identificador único de la entidad.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Tipo de documento del usuario.
     */
    @Column(name = "type_document_id")
    private DocumentTypeEntity documentType;

}
