package com.cambista.service;

import com.cambista.client.UserFeignClient;
import com.cambista.dao.RatesDao;
import com.cambista.dto.CambistaDTO;
import com.cambista.model.Request;
import com.cambista.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CambistaService implements CambistaServiceInterface{

    private final RatesDao dao;


    @Autowired
    UserFeignClient feignClient;

    public CambistaService(RatesDao dao) {
        this.dao = dao;
    }

    @Override
    public CambistaDTO cotizar(Request request) {

        CambistaDTO cambistaDTO =new CambistaDTO();
        try {
            cambistaDTO = feignClient.getCambista(request.getMonedaOrigen());

        }catch (Exception e){

            e.getStackTrace();

        }
        return cambistaDTO;

    }


    public Response cotizacion(Request request) {

        CambistaDTO cambistaDTO = cotizar(request);
        Response response = new Response();

        response.setMonedaOrigen(request.getMonedaOrigen());
        response.setMonedaDestino(request.getMonedaDestino());
        response.setMonto(request.getMonto());
        response.setMonedaTipoCambio(cambistaDTO.getRates().get(request.getMonedaDestino()).multiply(request.getMonto()));
        response.setTipoCambio(cambistaDTO.getRates().get(request.getMonedaDestino()));

        dao.save(response);

        return response;
    }

    public List<Response> listar (){
        return dao.findAll();
    }


}
