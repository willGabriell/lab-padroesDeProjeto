package dio.gof.subSistemaCep;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instancia;
    }

    public String recuperarCidade(String cidade) {
        return "Araraquara";
    }

    public String recuperarEstado(String cidade) {
        return "SP";
    }
}
