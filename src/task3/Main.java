package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введіть ключ від продукту:");
        final  String codeForPro = "AsDw344wer3s_l!";
        final String codeForExpert = "Drt64_@dlx1_3";

        Scanner entCode = new Scanner(System.in);
        String code = entCode.next();

        switch (code){
            case codeForExpert:
                ExpertDocumentWorker userExpert = new ExpertDocumentWorker();
                userExpert.openDocument();
                userExpert.editDocument();
                userExpert.saveDocument();
                break;
            case codeForPro:
                ProDocumentWorker userPro = new ProDocumentWorker();
                userPro.openDocument();
                userPro.editDocument();
                userPro.saveDocument();
                break;
            default:
                DocumentWorker user = new DocumentWorker();
                user.openDocument();
                user.editDocument();
                user.saveDocument();
                break;

        }
    }
}
