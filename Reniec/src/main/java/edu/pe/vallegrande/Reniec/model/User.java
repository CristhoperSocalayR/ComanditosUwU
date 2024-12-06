package edu.pe.vallegrande.Reniec.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table("usuarios")
public class User {

    @Id
    private Long id;

    @Column("dni")
    private String dni;

    @Column("nombres")
    private String nombres;

    @Column("apellidoPaterno")
    private String apellidoPaterno;

    @Column("apellidoMaterno")
    private String apellidoMaterno;

    @Column("codVerifica")
    private String codVerifica;

    @Column("success")
    private Boolean success = true;
}
