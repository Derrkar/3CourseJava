package lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Programmer programmer1 = new Programmer.Builder().withName("Eugen").withSurname("Grod").withMiddleName("Volodumurovich").build();
        programmer1.setProgrammingLanguage("Java");
        programmer1.setContractNumber(1);

        Programmer programmer2 = new Programmer.Builder().withName("Olexandr").withSurname("Kozak").withMiddleName("Olegovich").build();
        programmer2.setProgrammingLanguage("Python");
        programmer2.setContractNumber(2);

        Programmer programmer3 = new Programmer.Builder().withName("Anna").withSurname("Pushyak").withMiddleName("Stepanivna").build();
        programmer3.setProgrammingLanguage("C#");
        programmer3.setContractNumber(3);

        Programmer programmer4 = new Programmer.Builder().withName("Ivan").withSurname("Kolomiec").withMiddleName("Mukolaivna").build();
        programmer4.setProgrammingLanguage("C++");
        programmer4.setContractNumber(4);

        BusinessAnalyst businessAnalyst1 = new BusinessAnalyst.Builder().withName("Ivan").withSurname("Ivanov").withMiddleName("Ivanovich").build();
        businessAnalyst1.setFacilitationSkill(10);
        businessAnalyst1.setOralSkill(8);
        businessAnalyst1.setOrganizationalSkill(7);

        List<Worker> list = new ArrayList<>();
        list.add(programmer1);
        list.add(programmer2);
        list.add(programmer3);
        list.add(programmer4);
        list.add(businessAnalyst1);

        Project project1 = new Project.Builder().withProjectName("GitHub").withWorkerList(list).build();
        System.out.println(list);
        System.out.println(project1);
        Project.filter(list, "Eugen");
        System.out.println(list);
    }
}