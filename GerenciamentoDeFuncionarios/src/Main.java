import entities.Funcionario;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> list = new ArrayList<>();

        int res = 0;

        while (res != 5) {
            System.out.println(" 1 - Adicionar, 2 - Remover, 3 - Buscar, 4 - Listar, 5 - Sair.");
            System.out.print("Digite o que você deseja fazer: ");
            res = sc.nextInt();

            if (res == 1) {
                System.out.print("Nome: ");
                String nome = sc.next();
                System.out.print("ID: ");
                int id = sc.nextInt();
                System.out.print("Cargo: ");
                String cargo = sc.next();
                System.out.print("Salário: ");
                double salario = sc.nextDouble();
                Funcionario funcionario = new Funcionario(nome, id, salario, cargo);
                list.add(funcionario);
                System.out.println("Funcionário adicionado com sucesso!");

            } else if (res == 2) {
                System.out.print("Digite o ID do funcionario que você deseja remover: ");
                int id = sc.nextInt();
                for (int i = 0; i < list.size(); i++) {
                    Funcionario f = list.get(i);
                    if (f.getID() == id) {
                        list.remove(f);
                        System.out.println("Funcionário removido com sucesso!");
                        break;
                    }
                }

            } else if (res == 3) {
                System.out.print("Digite o ID do funcionario: ");
                int id = sc.nextInt();
                for (int i = 0; i < list.size(); i++) {
                    Funcionario f = list.get(i);
                    if (f.getID() == id) {
                        System.out.println("Funcionário: " + f.getNome() + " | Cargo: " + f.getCargo() + " | Salário: " + f.getSalario() + " | Id: " + f.getID());
                        break;
                    }
                }
            } else if (res == 4) {
                for (Funcionario f : list) {
                    System.out.println(f);
                }
            }

        }

        }
    }
