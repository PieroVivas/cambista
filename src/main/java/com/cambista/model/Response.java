package com.cambista.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Rates")

public class Response{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name="moneda_tipo_cambio")
    private BigDecimal monedaTipoCambio;

    @Column(name="tipo_cambio")
    private BigDecimal tipoCambio;

    @Column(name="monto")
    private BigDecimal monto;

    @Column(name="moneda_origen")
    private String monedaOrigen;

    @Column(name="moneda_destino")
    private String monedaDestino;


}
