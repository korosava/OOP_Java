package lab_12;

import com.serialization.Profile;
import com.serialization.Serial;
import company.Listt;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CoursesRegex {

    // константи:
    private static final String NAME = "Введіть ваше ім'я та прізвище: ";
    private static final String AGE = "Введіть ваш вік: ";
    private static final String NAME_ERROR = "Недозволене ім'я\n";
    private static final String AGE_ERROR = "Недозволений вік";

    private static final String MENU_INFO = "1. Контакти";
    private static final String MENU_REG = "2. Реєстрація на курс";
    private static final String MENU_TIME = "3. Розклад занятть";
    private static final String MENU_EXIT = "4. Вийти";
    private static final String EXIT_WORD = "Допобачення";
    private static final String MENU_BACK = "5.Повернутися";
    private static final String MENU_CHOOSE = "\nвведіть потрібний вам номер меню сюди: ";
    private static final String MENU_ERROR = "\nви ввели неіснуючий пункт меню, спрбуйте знову\n";


    private static final String COURSE_INFO = "Телефон:  067 507 72 83 , 063 040 83 76\n" +
            "\n" +
            "Пошта: pesPes@kimail.buda\n" +
            "\n" +
            "Скайп: pes374\n"+
            "\n" +
            "Адреса: вулиця Собача 3, 2-й поверх";

    private static final String COURSE_TIME = "ПН 11:00-17:00\n СР 13:00-16:00\n ЧТ 07:00-15:00";
    private static final String VISITORS = "відвідувачі: ";



    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        Listt<Profile> list = new Listt<Profile>();
        Serial serial = new Serial();
        Profile profile = new Profile();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        Pattern menuPattern = Pattern.compile("[1-4]");
        Pattern agePattern = Pattern.compile("[1-4]");
        Pattern namePattern = Pattern.compile("[A-z А-я]");

        Matcher menuMatcher;
        Matcher ageMatcher;
        Matcher nameMatcher;
        Matcher surNameMatcher;



        while(run) {

            System.out.println(MENU_INFO);
            System.out.println(MENU_REG);
            System.out.println(MENU_TIME);
            System.out.println(MENU_EXIT);

            System.out.println(MENU_CHOOSE);

            String menuNum = scanner.next();
            menuMatcher = menuPattern.matcher(menuNum);

            if (menuMatcher.find())
            {
                switch (Integer.parseInt(menuNum)) {

                    case 1:

                        System.out.println(MENU_INFO);
                        System.out.println(COURSE_INFO);

                        System.out.println("\n"+MENU_EXIT);
                        System.out.println(MENU_BACK);
                        System.out.println(MENU_CHOOSE);

                        run = exit(scanner.nextInt());

                        break;

                    case 2:

                        System.out.println(NAME);
                        String name = scanner.next();
                        String surName = scanner.next();

                        nameMatcher = namePattern.matcher(name);
                        surNameMatcher = namePattern.matcher(surName);

                        if (nameMatcher.find() && surNameMatcher.find())
                        {
                            profile.setName(name);
                            profile.setSurname(surName);
                        }
                        else
                            {
                                System.out.println(NAME_ERROR);
                            }
                        while(!nameMatcher.find() && !surNameMatcher.find())
                        {
                            System.out.println(NAME);
                            name = scanner.next();
                            surName = scanner.next();

                            nameMatcher = namePattern.matcher(name);
                            surNameMatcher = namePattern.matcher(surName);

                            if (nameMatcher.find() && surNameMatcher.find())
                            {
                                profile.setName(name);
                                profile.setSurname(surName);
                            }
                            else
                            {
                                System.out.println(NAME_ERROR);
                            }
                        }

                        System.out.println(AGE);
                        String age = scanner.next();

                        ageMatcher = agePattern.matcher(age);

                        if (ageMatcher.find())
                        {
                            profile.setAge(age);
                        }
                        else
                            {
                                System.out.println(AGE_ERROR);
                            }


                        list = (Listt<Profile>) serial.deserialize("profileList");
                        list.addFirst(profile);
                        serial.serialize("profileList", list);

                        System.out.println(VISITORS);
                        for (Profile p : list)
                        {
                            System.out.println(p.getName() + " " + p.getSurname()+ " "+ p.getAge());
                        }

                        System.out.println("\n"+MENU_EXIT);
                        System.out.println(MENU_BACK);
                        System.out.println(MENU_CHOOSE);

                        run = exit(scanner.nextInt());
                        break;

                    case 3:

                        System.out.println(COURSE_TIME);

                        System.out.println("\n"+MENU_EXIT);
                        System.out.println(MENU_BACK);
                        System.out.println(MENU_CHOOSE);

                        run = exit(scanner.nextInt());
                        break;
                    case 4:
                        run = exit(4);
                        break;
                }
            }
            else
                {
                    System.out.println(MENU_ERROR);
                }

        }


    }

    private static boolean exit (int x)
    {
        if (x == 4)
        {
            System.out.println(EXIT_WORD);
            return false;
        }

        return true;
    }


}
