package dio.gof.facade;

import dio.gof.subSistemaCep.CepApi;
import dio.gof.subSistemaCrm.CrmService;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);
        CrmService.salvarCliente(nome, cep, cidade, estado);
    }
}
