package ro.ase.csie.cts.homework01;

import ro.ase.csie.cts.homework01.phase03.Broker;

public class TestMain {
    public static void main(String[] args) throws Exception {
//        double totalOriginal = ro.ase.csie.cts.homework01.original.Account.calculate(new ro.ase.csie.cts.homework01.original.Account[] {
//                new ro.ase.csie.cts.homework01.original.Account(15523.5, 1.2, 1),
//                new ro.ase.csie.cts.homework01.original.Account(23323.5, 1.7, 2),
//                new ro.ase.csie.cts.homework01.original.Account(4322.0, 2.1, 1),
//                new ro.ase.csie.cts.homework01.original.Account(3320.1, 3.4, 3),
//                new ro.ase.csie.cts.homework01.original.Account(10000.3, 1.9, 0)
//        });
//        System.out.println("total original: " + totalOriginal);
//
//
//        double totalPhase01 = ro.ase.csie.cts.homework01.phase01.Account.calculateTotalBrokerageFee(new ro.ase.csie.cts.homework01.phase01.Account[] {
//                new ro.ase.csie.cts.homework01.phase01.Account(15523.5, 1.2, 10, ro.ase.csie.cts.homework01.phase01.AccountType.STANDARD),
//                new ro.ase.csie.cts.homework01.phase01.Account(23323.5, 1.7, 365, ro.ase.csie.cts.homework01.phase01.AccountType.PREMIUM),
//                new ro.ase.csie.cts.homework01.phase01.Account(4322.0, 2.1, 44, ro.ase.csie.cts.homework01.phase01.AccountType.STANDARD),
//                new ro.ase.csie.cts.homework01.phase01.Account(3320.1, 3.4, 67, ro.ase.csie.cts.homework01.phase01.AccountType.SUPER_PREMIUM),
//                new ro.ase.csie.cts.homework01.phase01.Account(10000.3, 1.9, 22, ro.ase.csie.cts.homework01.phase01.AccountType.BUDGET)
//        });
//        System.out.println("total phase 01: " + totalPhase01);
//
//
//        double totalPhase02 = ro.ase.csie.cts.homework01.phase02.Account.CalculateTotalBrokerageFee(new ro.ase.csie.cts.homework01.phase02.Account[] {
//                new ro.ase.csie.cts.homework01.phase02.Account(15523.5, 1.2, 10, ro.ase.csie.cts.homework01.phase02.AccountType.STANDARD),
//                new ro.ase.csie.cts.homework01.phase02.Account(23323.5, 1.7, 365, ro.ase.csie.cts.homework01.phase02.AccountType.PREMIUM),
//                new ro.ase.csie.cts.homework01.phase02.Account(4322.0, 2.1, 44, ro.ase.csie.cts.homework01.phase02.AccountType.STANDARD),
//                new ro.ase.csie.cts.homework01.phase02.Account(3320.1, 3.4, 67, ro.ase.csie.cts.homework01.phase02.AccountType.SUPER_PREMIUM),
//                new ro.ase.csie.cts.homework01.phase02.Account(10000.3, 1.9, 22, ro.ase.csie.cts.homework01.phase02.AccountType.BUDGET)
//        });
//        System.out.println("total phase 02: " + totalPhase02);


        double totalPhase03 = ro.ase.csie.cts.homework01.phase03.Account.CalculateTotalBrokerageFee(new ro.ase.csie.cts.homework01.phase03.Account[] {
                new ro.ase.csie.cts.homework01.phase03.Account(15523.5, 1.2, 10, ro.ase.csie.cts.homework01.phase03.AccountType.STANDARD),
                new ro.ase.csie.cts.homework01.phase03.Account(23323.5, 1.7, 365, ro.ase.csie.cts.homework01.phase03.AccountType.PREMIUM),
                new ro.ase.csie.cts.homework01.phase03.Account(4322.0, 2.1, 44, ro.ase.csie.cts.homework01.phase03.AccountType.STANDARD),
                new ro.ase.csie.cts.homework01.phase03.Account(3320.1, 3.4, 67, ro.ase.csie.cts.homework01.phase03.AccountType.SUPER_PREMIUM),
                new ro.ase.csie.cts.homework01.phase03.Account(10000.3, 1.9, 22, ro.ase.csie.cts.homework01.phase03.AccountType.BUDGET)
        }, new Broker());
        System.out.println("total phase 03: " + totalPhase03);
    }
}
