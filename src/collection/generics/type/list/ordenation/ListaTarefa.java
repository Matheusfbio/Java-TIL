package collection.generics.type.list.ordenation;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //attribute
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumerototalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("elementos na lista: " + listaTarefa.obterNumerototalTarefas());

        listaTarefa.adicionarTarefa("lavar a louça");
        listaTarefa.adicionarTarefa("lavar a louça");
        listaTarefa.adicionarTarefa("Fazer a janta");
        listaTarefa.adicionarTarefa("prepara as coisas de natan");
        System.out.println("elementos na lista: " + listaTarefa.obterNumerototalTarefas());

        listaTarefa.removerTarefa("lavar a louça");
        System.out.println("elementos na lista: " + listaTarefa.obterNumerototalTarefas());

        listaTarefa.obterDescricaoTarefas();
        System.out.println("elementos na lista: " + listaTarefa.obterNumerototalTarefas());


    }
}
