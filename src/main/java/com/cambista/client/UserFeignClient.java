package com.cambista.client;


import com.cambista.config.FeignClientConfig;
import com.cambista.dto.CambistaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "open", url = "${external.api.usd-url}",configuration = FeignClientConfig.class)
public interface UserFeignClient {

    @GetMapping("/{id}")
    CambistaDTO getCambista(@PathVariable("id") String id);

}
