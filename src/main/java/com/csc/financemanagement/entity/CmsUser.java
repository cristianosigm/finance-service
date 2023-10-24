package com.csc.financemanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "cms_user", schema = "finance")
public class CmsUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @NotBlank
    private String role;

    @Column(unique = true, nullable = false)
    private String username;

    @NotBlank
    private String password;

    @Builder.Default
    private Boolean locked = Boolean.FALSE;

}
