package queuesWithMatrix;

import stacks.PilhaObj;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    private List<Remedio> lista;
    PilhaObj<Integer> pilha;

    public Repositorio() {
        this.lista = new ArrayList<>();
        this.pilha = new PilhaObj<>(10);
    }

    public void salvar(Remedio remedio){
        lista.add(remedio);
        pilha.push(remedio.getId());
    }

    public void deletar(Integer id){
        for (Remedio remedio : lista) {
            if (remedio.getId() == id){
                lista.remove(remedio);
                System.out.println("Remédio removido!");
                break;
            }
        }
        System.out.println("ID inexistente");
    }

    public void exibir(){
        if (lista.isEmpty()){
            System.out.println("Repositório vazio");
        }
        for (Remedio remedio : lista) {
            System.out.println(remedio);
        }
    }

    public void desfazer(){
        if (pilha.isEmpty()){
            System.out.println("Não há nada a desfazer");
        }
        Integer id = pilha.pop();
        deletar(id);
    }
}

