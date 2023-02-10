package day31maps;

public class EnumRunner {
    public static void main(String[] args) {
        String capital = UsStates.CALIFORNIA.getCapital();
        System.out.println(capital);

        String abbr = UsStates.FLORIDA.getAbbreviation();
        System.out.println(abbr);

        String state = UsStates.getStateNameFromAbbreviation("FL");
        System.out.println(state);
        String statename = UsStates.getStateNameFromCapital("Denver");
        System.out.println(statename);
        String abbreviation = UsStates.getAbbreviationFromCapital("Atlanta");
        System.out.println(abbreviation);
    }
}
