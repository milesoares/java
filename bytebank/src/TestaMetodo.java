public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDaMilena = new Conta();
        contaDaMilena.saldo = 100;
        contaDaMilena.deposita(50);
        System.out.println(contaDaMilena.saldo);

        boolean conseguiuRetirar = contaDaMilena.saca(20);
        System.out.println(contaDaMilena.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaEmilly = new Conta();
        contaDaEmilly.deposita(1000);
        boolean sucessoTransferencia = contaDaEmilly.transfere(850, contaDaMilena);

        if (sucessoTransferencia) {
            System.out.println("transferencia com sucesso");
        } else {
            System.err.println("faltou dinheiro");
        }
        System.out.println(contaDaEmilly.saldo);
        System.out.println(contaDaMilena.saldo);

        contaDaMilena.titular = "milena soares";
        System.out.println(contaDaMilena.titular);
    }
}
