package com.rotaesaber.gestao.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.security.SecureRandom;
import java.time.LocalDateTime;

public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOMEALUNO")
    private String nomeAluno;

    @Column(name = "CPFALUNO")
    private String cpfAluno;

    @Column(name = "RGALUNO")
    private String rgAluno;

    @Column(name = "DATANASCIMENTO")
    private LocalDateTime dataNascimento;

    @Column(name = "NOMERESPONSAVEL")
    private String nomeResponsavel;

    @Column(name = "CPFRESPONSAVEL")
    private String cpfResponsavel;

    @Column(name = "RGRESPONSAVEL")
    private String rgResponsavel;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "TELEFONE")
    private String telefone;

    @Column(name = "ENDERECO")
    private String endereco;

    @Column(name = "CEP")
    private String cep;

    @Column(name = "NOMEESCOLA")
    private String nomeEscola;

    @Column(name = "SERIE")
    private String serie;

    private String documentoImgFrente;
    private String documentoImgVerso;
}
