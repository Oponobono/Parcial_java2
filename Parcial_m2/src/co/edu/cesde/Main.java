package co.edu.cesde;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputData = new Scanner(System.in);

        List<Admin> admins = new ArrayList<>();
        List<Accountant> accountants=new ArrayList<>();
        List<CleaningStaff> cleaners=new ArrayList<>();
        List<Watchman> keepers = new ArrayList<>();

        System.out.println("Bienvenido");

        String stopexecution = "no";
        String stoparray = "no";

        while (stoparray.equalsIgnoreCase("no")) {
            while (stopexecution.equalsIgnoreCase("no")) {

                System.out.println("Escoja que perfil es el que desea ingresar:" + "\n" + "1. Administrador" + "\n" + "2. Contador" + "\n" + "3. Guardia de Seguridad" + "\n" + "4. Personal de Aseo");

                int option = inputData.nextInt();
                if (option < 1 || option > 4) {
                    System.out.println("La opcion ingresada no es correcta");
                }


                if (option == 1) {
                    Admin admin = new Admin();

                    System.out.println("Ingrese el nombre:");
                    admin.setName(inputData.nextLine());
                    System.out.println("Ingrese la identificación:");
                    admin.setIdentification(inputData.nextLine());
                    System.out.println("Ingrese la edad:");
                    admin.setAge(inputData.nextInt());
                    System.out.println("Ingrese el cargo:");
                    admin.setLeader(inputData.nextLine());
                    System.out.println("Indique si tiene parqueadero y el número de celda:");
                    admin.setParking(inputData.nextLine());
                    admins.add(admin);
                }

                if (option == 2) {
                    Accountant accountant = new Accountant();

                    System.out.println("Ingrese el nombre:");
                    accountant.setName(inputData.nextLine());
                    System.out.println("Ingrese la identificación:");
                    accountant.setIdentification(inputData.nextLine());
                    System.out.println("Ingrese la edad:");
                    accountant.setAge(inputData.nextInt());
                    System.out.println("Ingrese el cargo:");
                    accountant.setLeader(inputData.nextLine());
                    System.out.println("Indique si tiene parqueadero y el número de celda:");
                    accountant.setParking(inputData.nextLine());
                    accountants.add(accountant);
                }

                if (option == 3) {
                    Watchman keeper = new Watchman();

                    System.out.println("Ingrese el nombre:");
                    keeper.setName(inputData.nextLine());
                    System.out.println("Ingrese la identificación:");
                    keeper.setIdentification(inputData.nextLine());
                    System.out.println("Ingrese la edad:");
                    keeper.setAge(inputData.nextInt());
                    System.out.println("Ingrese los dias de trabajo:");
                    keeper.setWorkday(inputData.nextLine());
                    System.out.println("Indique si tiene salvoconducto:");
                    keeper.setWeapon(inputData.nextLine());
                    keepers.add(keeper);
                }

                if (option == 1) {
                    CleaningStaff cleaner = new CleaningStaff();

                    System.out.println("Ingrese el nombre:");
                    cleaner.setName(inputData.nextLine());
                    System.out.println("Ingrese la identificación:");
                    cleaner.setIdentification(inputData.nextLine());
                    System.out.println("Ingrese la edad:");
                    cleaner.setAge(inputData.nextInt());
                    System.out.println("Ingrese los dias libres:");
                    cleaner.setDayoff(inputData.nextLine());
                    cleaners.add(cleaner);
                }

                System.out.println("Desea ingresar otro perfil: SI - NO");
                String stop = inputData.nextLine();
                if (stop.equalsIgnoreCase("no")) {
                    stopexecution = "SI";
                }

            }

            System.out.println("Desea revisar los usuarios almacenados en este perfil?");
            String stoplist = inputData.nextLine();
            if (stoplist.equalsIgnoreCase("no")) {
                stoparray = "SI";
            } else {
                for (int i = 0; i < admins.size(); i++) {
                    System.out.println("Nombre:" + admins.get(i).getName());
                    System.out.println("Identificación:" + admins.get(i).getIdentification());
                    System.out.println("Edad:" + admins.get(i).getAge());
                    System.out.println("Cargo:" + admins.get(i).getLeader());
                    System.out.println("Parking:" + admins.get(i).getParking());
                }
            }
        }
    }
}
