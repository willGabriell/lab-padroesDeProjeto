package dio.gof.subSistemaCrm;

public class CrmService {
    private CrmService() {
        super();
    }

    public static void salvarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente salvo no sistema de CRM");
    }
}
