package Presentation;

import Domain.Client;
import Logic.Log;
import Logic.SavingAccount;
import Logic.CurrentAccount;

public class LogTesting {

    public LogTesting() {
    }

    public void test() {
        Client clients[] = new Client[10];
        Client client1 = new Client("7-0901-0345", "Samuel", "88765432", "Limon, Pacuare");
        Client client2 = new Client("5-0239-0871", "Yamell", "9012-3456", "Limon, Bellavista");
        Client client3 = new Client("3-0540-0875", "Josh", "67890123", "Limon, Roosevelt");
        Client client4 = new Client("4-0980-0897", "Kel", "43218765", "Limon, Pueblo Nuevo");
        Client client5 = new Client("5-0140-0876", "Daniel", "87654321", "Limon, Colina");
        Client client6 = new Client("2-0260-0834", "Samir", "78901234", "Limon, Marchena");
        Client client7 = new Client("5-0320-0897", "Esteban", "65437890", "Limon, Los Cocos");
        Client client8 = new Client("1-0670-0819", "Miguel", "89012345", "Limon, Atlantida");
        Client client9 = new Client("7-0410-0853", "Rafael", "43210987", "Limon, Corales");
        Client client10 = new Client("1-0720-0895", "Donatelo", "33542187", "Limon, Pacuare");

        clients[0] = client1;
        clients[1] = client2;
        clients[2] = client3;
        clients[3] = client4;
        clients[4] = client5;
        clients[5] = client6;
        clients[6] = client7;
        clients[7] = client8;
        clients[8] = client9;
        clients[9] = client10;

        SavingAccount account1 = new SavingAccount("2024-11-29", 8, 10, "104560", 30000, client1);
        SavingAccount account2 = new SavingAccount("2024-11-29", 6, 12, "104561", 18000, client2);
        SavingAccount account3 = new SavingAccount("2024-11-29", 20, 15, "104562", 23000, client3);
        SavingAccount account4 = new SavingAccount("2024-11-29", 8, 16, "104563", 30000, client4);
        SavingAccount account5 = new SavingAccount("2024-11-29", 14, 12, "104564", 17000, client5);
        CurrentAccount account6 = new CurrentAccount(15, "104565", 30000, client6);
        CurrentAccount account7 = new CurrentAccount(12, "104561", 18000, client2);
        CurrentAccount account8 = new CurrentAccount(18, "104562", 23000, client3);
        CurrentAccount account9 = new CurrentAccount(12, "104563", 30000, client4);
        CurrentAccount account10 = new CurrentAccount(15, "104564", 17000, client5);

        Log log[] = new Log[10];
        log[0] = new Log(1, "Saving Amount", account1, 5000);
        log[1] = new Log(2, "Saving Amount", account2, 8000);
        log[2] = new Log(3, "Saving Amount", account3, 15000);
        log[3] = new Log(4, "Saving Amount", account4, 13000);
        log[4] = new Log(5, "Saving Amount", account5, 12000);
        log[5] = new Log(6, "Saving Amount", account6, 9000);
        log[6] = new Log(2, "Saving Amount", account7, 8000);
        log[7] = new Log(3, "Saving Amount", account8, 7000);
        log[8] = new Log(4, "Saving Amount", account9, 11000);
        log[9] = new Log(4, "Saving Amount", account10, 8000);

        for (int i = 0; i < log.length; i++) {
            if (log[i] != null) {
                System.out.println(log[0].toString());
                System.out.println(log[1].toString());
                System.out.println(log[2].toString());
                System.out.println(log[3].toString());
                System.out.println(log[4].toString());
                System.out.println(log[5].toString());
                System.out.println(log[6].toString());
                System.out.println(log[7].toString());
                System.out.println(log[8].toString());
                System.out.println(log[9].toString());
            }

        }
    }
}