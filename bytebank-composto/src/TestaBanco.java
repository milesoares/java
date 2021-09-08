public class TestaBanco {
    public static void main(String[] args) {
        Cliente milena = new Cliente();
        milena.nome = "Milena Soares";
        milena.cpf = "222.222.222-22";
        milena.profissao = "Desenvolvedora de Software";

        Conta contaDaMilena = new Conta();
        contaDaMilena.deposita(1000);

        // associa o cliente milena a conta contaDaMilena
        contaDaMilena.titular = milena;
        System.out.println(contaDaMilena.titular.nome);
        System.out.println(contaDaMilena.titular);
        System.out.println(milena);
    }
}