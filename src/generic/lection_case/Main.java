package generic.lection_case;

public class Main {
    public static void main(String[] args) {
        EmployeeUtils util = new EmployeeUtils();
        Developer de = new Developer();
        de.setName("Andrew");
        System.out.println("util.print(de) = " + util.print(de));

        Manager ma = new Manager();
        System.out.println("util.print(ma) = " + util.print(ma));
        System.out.println("de.toString() = " + de.toString());

        Formater<Developer, Manager> formater = new Formater<>();
        formater.setDevloperF(de);
        formater.setManagerF(ma);
        System.out.println("formater.getDevloperF() = " + formater.getDevloperF());
        System.out.println("formater.getManagerF() = " + formater.getManagerF());

        Repository<Developer, Manager> repository = new DevelopreMenegerRepository();
        repository.save(de, ma);

        System.out.println("repository.getKey() = " + repository.getKey());
        System.out.println("repository.getValue() = " + repository.getValue());

        SysAdmin sysAdmin = new SysAdmin();
        sysAdmin.setName("Vova");
        SysAdminManager sysAdminManager = new SysAdminManager();
        sysAdminManager.setName("Tom");
        System.out.println("util.print(sysAdmin) = " + util.print(sysAdmin));
        System.out.println("util.print(sysAdminManager) = " + util.print(sysAdminManager));



        Repository<SysAdmin, SysAdminManager> sysAdminRepocitory = new SysAdminRepocitory();
        sysAdminRepocitory.save(sysAdmin, sysAdminManager);
        System.out.println("sysAdminRepocitory.getKey() = " + sysAdminRepocitory.getKey());
        System.out.println("sysAdminRepocitory.getKey() = " + sysAdminRepocitory.getValue());
    }
}
