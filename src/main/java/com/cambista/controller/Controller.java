package com.cambista.controller;

import com.cambista.dto.CambistaDTO;
import com.cambista.model.Request;
import com.cambista.model.Response;
import com.cambista.service.CambistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cambista",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public class Controller {

    @Autowired
    CambistaService service;

    @PostMapping(path ="/cotizar")
    public Response response (@RequestBody Request request){

        return this.service.cotizacion(request);
    }

   @GetMapping()
    List<Response> findAll(){
        return service.listar();
   };


}
