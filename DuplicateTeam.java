public class DuplicateTeam {
    

    static String findDuplicateTeam(String[] teamNames) {
        for (int i = 0; i < teamNames.length; i++) {
            for (int j = i + 1; j < teamNames.length; j++) {
                if (teamNames[i].equals(teamNames[j])) {
                    return teamNames[i];
                }
            }
        }

        return "No Duplicate";
    }

    public static void main(String[] args) {
        String[] teamNames = {"ByteForce", "CodeCrafters", "ByteForce"};

        String result = findDuplicateTeam(teamNames);

        System.out.println("Duplicate Found: " + result);
    }
}
    

