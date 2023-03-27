package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {

        {
            ListaDuplamenteEncadeada<String> minhaListaEncadeada = new ListaDuplamenteEncadeada<>();

            minhaListaEncadeada.add("c1");
            minhaListaEncadeada.add("c2");
            minhaListaEncadeada.add("c3");
            minhaListaEncadeada.add("c4");
            minhaListaEncadeada.add("c5");
            minhaListaEncadeada.add("c6");
            minhaListaEncadeada.add("c7");


            minhaListaEncadeada.remove(4);
            minhaListaEncadeada.add(4,"99");
            System.out.println(minhaListaEncadeada);
            System.out.println(minhaListaEncadeada.get(3));


        }
    }
}
