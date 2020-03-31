package br.com.marcelosv.kafkaline.ibgewrapper.gateway.feign;

import br.com.marcelosv.kafkaline.ibgewrapper.gateway.json.CidadeJson;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface CidadeClient {

    @RequestLine("GET /api/v1/localidades/estados/{UF}/municipios")
    List<CidadeJson> get(@Param("UF") String uf);

}
