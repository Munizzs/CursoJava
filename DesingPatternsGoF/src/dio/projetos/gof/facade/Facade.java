package dio.projetos.gof.facade;

import dio.projetos.gof.subSistema1.crm.CrmService;
import dio.projetos.gof.subSistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome,String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarcliente(nome,cep,estado,cidade);
    }
}
