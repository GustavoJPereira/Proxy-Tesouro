package com.apiTemp.proxy.controller;

import com.apiTemp.proxy.entity.ExtratoDeEntregas;
import com.apiTemp.proxy.entity.RespostaDaApi;
import com.apiTemp.proxy.entity.Rgf;
import com.apiTemp.proxy.entity.Rreo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController (value = "/")
public class Endpoints {
    @GetMapping(value = "extrato_entregas")
    public ResponseEntity<List<ExtratoDeEntregas>> getExtratoDeExtregas(@RequestParam int id_ente,
                                                                        @RequestParam int an_referencia) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://apidatalake.tesouro.gov.br/ords/siconfi/tt/extrato_entregas?id_ente=" + id_ente +
                "&an_referencia=" + an_referencia;
        RespostaDaApi resposta = restTemplate.getForObject(url, RespostaDaApi.class);
        List<?> itens = resposta.getItems();
        return new ResponseEntity<>((List<ExtratoDeEntregas>) itens, HttpStatus.OK);
    }

    @GetMapping(value = "rreo")
    public ResponseEntity<List<Rreo>> getRreo(@RequestParam int an_exercicio, @RequestParam int nr_periodo,
                                              @RequestParam String co_tipo_demonstrativo, @RequestParam int id_ente,
                                              @RequestParam(required = false) String no_anexo,
                                              @RequestParam(required = false) String co_esfera) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://apidatalake.tesouro.gov.br/ords/siconfi/tt/rreo?id_ente=" + id_ente +
                        "&an_exercicio=" + an_exercicio + "&nr_periodo=" + nr_periodo +
                        "&co_tipo_demonstrativo=" + co_tipo_demonstrativo +
                        (no_anexo!= null ? "&no_anexo=" + no_anexo : "") +
                        (co_esfera!= null? "&co_esfera=" + co_esfera: "");
        RespostaDaApi resposta = restTemplate.getForObject(url, RespostaDaApi.class);
        List<?> itens = resposta.getItems();
        return new ResponseEntity<>((List<Rreo>) itens, HttpStatus.OK);
    }

    @GetMapping(value = "rgf")
    public ResponseEntity <List<Rgf>> getRgf(@RequestParam int an_exercicio, @RequestParam String in_periodicidade,
                                             @RequestParam int nr_periodo, @RequestParam String co_tipo_demonstrativo,
                                             @RequestParam String co_poder, @RequestParam int id_ente,
                                             @RequestParam(required = false) String no_anexo,
                                             @RequestParam(required = false) String co_esfera) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://apidatalake.tesouro.gov.br/ords/siconfi/tt/rgf?id_ente=" + id_ente +
                "&an_exercicio=" + an_exercicio + "&in_periodicidade=" + in_periodicidade + "&nr_periodo=" + nr_periodo +
                "&co_tipo_demonstrativo=" + co_tipo_demonstrativo + "&co_poder=" + co_poder +
                (no_anexo != null ? "&no_anexo=" + no_anexo : "") + (co_esfera != null ? "&co_esfera=" + co_esfera : "");
        RespostaDaApi resposta = restTemplate.getForObject(url, RespostaDaApi.class);
        List<?> itens = resposta.getItems();
        return new ResponseEntity<>((List<Rgf>) itens, HttpStatus.OK);
    }


}
