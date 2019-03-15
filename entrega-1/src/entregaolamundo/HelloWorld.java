package entregaolamundo;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class HelloWorld {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void imprimir() {
        DateFormat data = new SimpleDateFormat("HH:mm:ss");
        Date data1 = new Date();

        System.out.println(data.format(data1) + " - Olá " + this.getNome() + ". Você acabou de fazer seu primeiro Hello Word em Java. Parabéns.");
    }
}
