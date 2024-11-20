# cambista
Prueba técnica (Post y Get)
Para poder obtener la cotización de moneda es con el endpoint POST

localhost:8085/cambista/cotizar

ejemplo 
{
"monto" : 66,
"monedaOrigen" : "PEN",
"monedaDestino" : "USD"
}

para listar todo lo guardado en consulta es en GET

localhost:8085/cambista

