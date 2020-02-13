import java.util.*;

public class Main {
    public static void main(String[] args) {

//        List<String> lista = new ArrayList<>();
//
//        lista.add("Alberto");
//        lista.add("joao");
//        String valor = lista.get(0);
//        for (String valor :lista){
//            System.out.println(valor);
//        }

//        Set<String> conjunto = new HashSet<>();
//        conjunto.add("Fácil");
//        conjunto.add("Difícil");
//        conjunto.add("Normal");
//
//        for (String valor :conjunto){
//            System.out.println(valor);
//        }
//        conjunto.remove("Normal");
//        for (String valor :conjunto){
//            System.out.println(valor);
//        }

//        Map<Integer, String> mapa = new HashMap<>();
//
//        mapa.put(4,"Fizemos 4 gols contra você");
//        mapa.put(1,"Fizemos 2 gols contra você");
//        mapa.put(2,"Fizemos 2 gols contra você");
//        mapa.put(10,"Fizemos 10 gols contra você");
//
//        for (Integer chave :mapa.keySet()){
//            String valor = mapa.get(chave);
//            System.out.println(valor);
//        }

        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(0, " Ovos");
        mapa.put(1, " Água");
        mapa.put(2, " Escopeta");
        mapa.put(3, " Cavalo");
        mapa.put(4, " Dentista");
        mapa.put(5, " Fogo");

        System.out.println(mapa);
        for (Integer chave :mapa.keySet()){
            String valor = mapa.get(chave);
            System.out.println(valor);
        }
        System.out.println("=======================================================");
        Map<String, String> dicionario = new HashMap<>();
        dicionario.put("Joao > ", "Juan, fisura, Maromba");
        dicionario.put("Miguel > ","Night Watch, Bruce Wayne, Tampinha");
        dicionario.put("Maria > ", "Wonder Woman, Mary, Marilene");
        dicionario.put("Lucas > ", "Lukinha, Jorge, George");

        for (String chave :dicionario.keySet()){
            String valor = dicionario.get(chave);
            System.out.println(chave + valor);
        }
        System.out.println("=======================================================");
        // com lista
        List<Integer> listavazia = new ArrayList<>();
        listavazia.add(1);
        listavazia.add(7);
        listavazia.add(8);
        listavazia.add(6);
        listavazia.add(5);
        listavazia.add(8);
        listavazia.add(8);
        listavazia.add(5);
        for(Integer valor :listavazia) {
            System.out.println(valor);
        }
        System.out.println("=======================================================");
        // com conjunto
        Map<Integer, Integer> conjuntovazio = new HashMap<>();
        conjuntovazio.put(0, 1);
        conjuntovazio.put(1, 5);
        conjuntovazio.put(9, 5);
        conjuntovazio.put(15, 6);
        conjuntovazio.put(4, 7);
        conjuntovazio.put(20, 8);
        conjuntovazio.put(6, 8);
        conjuntovazio.put(7, 8);

        for (Integer chave :conjuntovazio.keySet()) {
            Integer percorrer = conjuntovazio.get(chave);
            System.out.println(percorrer);
        }
        System.out.println("=======================================================");
    }
}

