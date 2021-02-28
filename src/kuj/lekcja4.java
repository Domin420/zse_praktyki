package kuj;
import java.util.Scanner;
public class lekcja4 {
    // zadanie 1
    public static void main(String[] args) {
        Scanner podaj = new Scanner(System.in);

        System.out.println("podaj liczbę: ");
        int liczba = podaj.nextInt();
        if (liczba == 0) {
            System.out.println("podana liczba jest równa 0.");
        } else {
            if (liczba > 0) {
                System.out.println("podana liczba jest większa od 0.");
            } else {
                if (liczba < 0) {
                    System.out.println("podana liczba jest mniejsza od 0.");
                }
            }
        }


// zadanie 2
        {
            Scanner x = new Scanner(System.in);
            System.out.println("podaj liczbę: ");
            int raz = x.nextInt();
            Scanner y = new Scanner(System.in);
            System.out.println("podaj liczbę: ");
            int dwa = y.nextInt();
            Scanner z = new Scanner(System.in);
            System.out.println("podaj liczbę: ");
            int trzy = z.nextInt();
            if (raz == dwa) {
                System.out.println("pierwsza liczba jest równa drugiej.");
            }
            if (dwa == trzy) {
                System.out.println("druga liczba jest równa trzeciej.");
            }
            if (raz == trzy) {
                System.out.println("pierwsza liczba jest równa trzeciej.");
            }
            if (raz == dwa && dwa == trzy && raz == trzy) {
            } else {
                if (raz > dwa) {
                    if (raz > trzy)
                        System.out.println("pierwsza liczba jest największa.");
                } else {
                    if (dwa > trzy) {
                        System.out.println("druga liczba jest największa.");
                    } else {
                        System.out.println("trzecia liczba jest największa.");
                    }
                }
            }
        }


//zadanie 3
        {
            // poprawny login: admin
            // poprawne hasło: haslo
            Scanner login = new Scanner(System.in);
            System.out.println("podaj swój login: ");
            String log = login.next();
            Scanner haslo = new Scanner(System.in);
            System.out.println("podaj swoje haslo: ");
            String has = haslo.next();
            if (log.equals("kox") && has.equals("42oweed")) {
                System.out.println("pomyślnie zalogowano.");
            } else {
                System.out.println("niepoprawny login lub hasło.");
            }
        }

//zadanie 4
        {
            Scanner x = new Scanner(System.in);
            System.out.println("podaj liczbę: ");
            int raz = x.nextInt();
            Scanner y = new Scanner(System.in);
            System.out.println("podaj liczbę: ");
            int dwa = y.nextInt();
            Scanner z = new Scanner(System.in);
            System.out.println("podaj liczbę: ");
            int trzy = z.nextInt();
            if (raz < dwa && dwa < trzy) {
                System.out.println("kolejność rosnąca.");
            } else {
                if (trzy < dwa && dwa < raz) {
                    System.out.println("kolejność malejąca.");
                } else {
                    System.out.println("brak kolejności.");
                }
            }
        }


//zadanie 5
        {
            Scanner l1 = new Scanner(System.in);
            System.out.println("podaj pierwszą liczbę: ");
            double x = l1.nextInt();
            Scanner l2 = new Scanner(System.in);
            System.out.println("podaj drugą liczbę: ");
            double y = l2.nextInt();
            Scanner działanie = new Scanner(System.in);
            System.out.println("wybierz działanie (+,-,*,/): ");
            char wybór = działanie.next().charAt(0);
            switch (wybór) {
                case '+':
                    double wynikdodawania = x + y;
                    System.out.println("wynik dodawania: " + wynikdodawania);
                    break;
                case '-':
                    double wynikodejmowania = x - y;
                    System.out.println("wynik odejmowania: " + wynikodejmowania);
                    break;
                case '*':
                    double wynikmnożenia = x * y;
                    System.out.println("wynik mnożenia: " + wynikmnożenia);
                    break;
                case '/':
                    double wynikdzielenia = x / y;
                    System.out.println("wynik dzielenia: " + wynikdzielenia);
                    break;
                default:
                    System.out.println("nie wybrano żadnego działania.");
                    break;


   
            }
        }
    }
}
