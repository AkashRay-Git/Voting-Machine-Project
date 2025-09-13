import java.util.Scanner;

public class votingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] candidates = { "1.Akash", "2.Deepak", "3.Nitish" };
        int[] votes = new int[candidates.length];
        System.out.println("Vote for: 1.Akash, 2.Deepak, 3.Nitish");
        System.out.println("Enter Number Of Voters");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Voter " + (i + 1) + " Please Cast Your Votes");

            for (int j = 0; j < candidates.length; j++) {
                System.out.println(candidates[j]);
            }
            System.out.println("Enter Your Choice(1-" + candidates.length + "):");
            int vote = sc.nextInt();

            if (vote >= 1 && vote <= candidates.length) {
                votes[vote - 1]++;
                System.out.println("vote casted for " + candidates[vote - 1]);
                System.out.println();
            } else {
                System.out.println("Invalid VOtes! vote not counted");
            }
        }
        System.out.println("\n==== Voting Result ====\n");
        for (int i = 0; i < candidates.length; i++) {
            System.out.println(candidates[i] + " -> " + votes[i] + "votes");
        }

        int maxVotes = votes[0];
        int winnerIndex = 0;
        boolean tie = false;

        for (int i = 1; i < votes.length; i++) {
            if (votes[i] > maxVotes) {
                maxVotes = votes[i];
                winnerIndex = i;
                tie = false;
            } else if (votes[i] == maxVotes) {
                tie = true;
            }
        }

        System.out.println("\n====Final Result====");
        if (tie) {
            System.out.println("its tie! no clear winner");

        } else {
            System.out.println("winner: " + candidates[winnerIndex] + " with " + maxVotes + " votes ");
        }

    }
}
