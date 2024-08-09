package application;

public class FormatadorCepExemplo {

    public static void main(String[] args) {

        try {

            String cepFormatado = formatarCep("619303500");
            System.out.println(cepFormatado);

        } catch (CepInvalidoException e) {

            System.out.println("O cep não corresponde com as regras de negócio");
        }
    }

    public static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }

        return "23.765-06";

    }
}
