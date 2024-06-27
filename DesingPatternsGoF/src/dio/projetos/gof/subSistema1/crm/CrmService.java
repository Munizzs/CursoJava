package dio.projetos.gof.subSistema1.crm;

public class CrmService {

    private CrmService() {
    }

    public static void gravarcliente(String nome, String cep, String estado, String cidade){
        System.out.println("Cliente salvo no sistema do CRM.");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(estado);
        System.out.println(cidade);
    }
}
