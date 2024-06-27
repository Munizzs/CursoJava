package dio.projetos.gof.subSistema2.cep;

import dio.projetos.gof.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "São Paulo";
    }

    public String recuperarEstado(String cep){
        return "SP";
    }
}
