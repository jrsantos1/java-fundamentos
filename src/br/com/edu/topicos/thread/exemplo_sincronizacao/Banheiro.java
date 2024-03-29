package br.com.edu.topicos.thread.exemplo_sincronizacao;

public class Banheiro {

    public void fazNumero1(){

        String nome = Thread.currentThread().getName();
        System.out.println("Batendo na porta");

        synchronized (this){


        System.out.println(nome + " entrando no banheiro");
        System.out.println(nome + " fazendo coisa rápida");

        try{
            Thread.sleep(8000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(nome + " dando descarga");
        System.out.println(nome + " levando a mão");
        System.out.println(nome + " saindo do banheiro");
        }
    }

    public void fazNumero2(){

        String nome = Thread.currentThread().getName();
        System.out.println("Batendo na porta");

        synchronized (this){

        System.out.println(nome + " entrando no banheiro");
        System.out.println(nome + " fazendo coisa demorada");

        try {
            Thread.sleep(15000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(nome + " dando descarga");
        System.out.println(nome + " levando a mão");
        System.out.println(nome + " saindo do banheiro");
        }
    }

}
