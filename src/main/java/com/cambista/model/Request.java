package com.cambista.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Request {

    private BigDecimal monto;
    private String monedaOrigen;
    private String monedaDestino;

}
