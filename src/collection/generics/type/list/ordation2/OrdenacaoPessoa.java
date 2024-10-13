package collection.generics.type.list.ordation2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> personList;

    public OrdenacaoPessoa() {
        this.personList = new ArrayList<>();
    }

    public void addPerson(String name, int age, double height) {
        personList.add(new Pessoa(name, age, height));
    }

    public List<Pessoa> orderToAge() {
        List<Pessoa> peopleToAge = new ArrayList<>(personList);
        Collections.sort(peopleToAge);
        return peopleToAge;
    }

    public List<Pessoa> orderToAltura(){
        List<Pessoa> peopleToHeight = new ArrayList<>(personList);
        Collections.sort(peopleToHeight, new ComparatorToHeight());
        return peopleToHeight;
    }


    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.addPerson("Matheus",25,1.75);
        System.out.println(ordenacaoPessoa.orderToAge());
    }
}
