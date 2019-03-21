package entregaolamundo;

public class Aplication {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setNome("André");
        helloWorld.imprimir();


        HelloWorld helloWorld2 = new HelloWorld();
        helloWorld2.setNome("Carlos");
        helloWorld2.imprimir();

        HelloWorld helloWorld3 = new HelloWorld();
        helloWorld3.setNome("Santos");
        helloWorld3.imprimir();

        HelloWorld helloWorld4 = new HelloWorld();
        helloWorld4.imprimir();
        
        Teste mensagem = new Teste();
        mensagem.setMensagem("Busquem conhecimento");
        mensagem.exibirMensagem();
    }
}
