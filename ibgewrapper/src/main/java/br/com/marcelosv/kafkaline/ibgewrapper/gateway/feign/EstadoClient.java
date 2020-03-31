package br.com.marcelosv.kafkaline.ibgewrapper.gateway.feign;

import br.com.marcelosv.kafkaline.ibgewrapper.gateway.json.EstadoJson;
import feign.RequestLine;

import java.util.List;

public interface EstadoClient {

    @RequestLine("GET /api/v1/localidades/estados")
    List<EstadoJson> get();

}
