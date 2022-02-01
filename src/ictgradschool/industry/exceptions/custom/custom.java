package ictgradschool.industry.exceptions.custom;

import ictgradschool.Keyboard;

public class custom {

    private void printInitials(String input) {
        input = input.trim();
        String firstChar = Character.toString(input.charAt(0));
        String newChars = "";
        System.out.println(firstChar);
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                newChars = Character.toString(input.charAt(i + 1));
                System.out.print("" + newChars);
            }
        }
    }


    public void checkLength(String mystr) throws ExceedMaxStringLengthException {
        if (mystr.length() > 100) {
            throw new ExceedMaxStringLengthException("string too long");
        }
    }

    public void checkFirstInitial(String mystr) throws InvalidWordException {
        if (Character.isDigit(mystr.charAt(0))) {
            throw new InvalidWordException("first initial is digital");
        }
    }


    public void start() {
        System.out.println("Enter a string of at most 100 character: ");
        String mystr = Keyboard.readInput();
        try {
            checkLength(mystr);
        } catch (ExceedMaxStringLengthException e) {
            System.out.println(e);
            System.exit(1);
        }


        try {
            checkFirstInitial(mystr);
        } catch (InvalidWordException e) {
            System.out.println(e);


        }


    }
}






