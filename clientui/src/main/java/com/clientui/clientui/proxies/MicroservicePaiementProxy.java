package com.clientui.clientui.proxies;


import com.clientui.clientui.beans.PaiementBean;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "zuul-server")
@LoadBalancerClient(name = "microservice-paiement" )
public interface MicroservicePaiementProxy {

    @PostMapping(value = "/paiement")
    ResponseEntity<PaiementBean> payerUneCommande(@RequestBody PaiementBean paiement);

}
