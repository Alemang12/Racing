package com.narvasoft.apirest.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "usuarios")
@ToString
@Getter
@Setter
@EqualsAndHashCode
public class Usuarios  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "marca")
    private String marca;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "motor", nullable = false, length = 50, unique = true)
    private String motor;

    @Column(name = "placa")
    private String placa;

    @Column(name = "foto")
    private String foto;
}
