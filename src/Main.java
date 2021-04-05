import java.util.*;
public class Main {
    public static void main(String[] args) {
        boolean isExit = true;
        System.out.println("Добро пожаловать в тарификатор!");
        Phone myPhone = new Phone();
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Введите любую цифру для продолжения, a - пополнить счет, либо s-выход из программы:" );
            char act = scan.next().charAt(0);
            switch (act) {
                case 'a': {
                    System.out.println("Введите сумму для пополнения счета:");
                    myPhone.setRemains(scan.nextInt());
                    isExit = false;
                    break;
                }
                case 's': {
                    isExit = true;
                    break;
            }
                default: {
                    System.out.println("Введите номер телефона, с которого идет звонок:");
                    String from = scan.next();
                    System.out.println("Введите номер телефона, на который идет звонок:");
                    String to = scan.next();
                    System.out.println("Введите продолжительность разговора в минутах:");
                    int longtime = scan.nextInt();
                    myPhone.isCalling(from, to, longtime);
                    for (int i = 0; i < Phone.tar.length; i++) {
                        if ((Phone.tar[i][0] == Integer.parseInt(myPhone.getFromNumb().substring(0,3)))&&(Phone.tar[i][1] == Integer.parseInt(myPhone.getToNumb().substring(0,3)))) {
                            if ((myPhone.getRemains() - Phone.tar[i][2] * myPhone.getMinutes()) < 0) {
                                System.out.println("Остаток средств на счете (" + myPhone.getRemains() + ") не позволяет совершить звонок, необходимо пополнить счет.");
                                break;
                            }
                            System.out.println("Звонок с номера " + myPhone.getFromNumb() + " на номер " + myPhone.getToNumb() + " продолжительностью " + myPhone.getMinutes() + ": тариф " + Phone.tar[i][2] + ", стоимость разговора - " + Phone.tar[i][2] * myPhone.getMinutes());
                            System.out.println("Остаток средств на счете: " + (myPhone.getRemains() - Phone.tar[i][2] * myPhone.getMinutes()));
                            myPhone.setRemains(myPhone.getRemains() - Phone.tar[i][2] * myPhone.getMinutes());
                            break;

                        }
                    }
                    isExit = false;
                }

            }
        }
        while (isExit == false);

    }
}
