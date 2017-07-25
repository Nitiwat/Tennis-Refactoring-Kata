
public class TennisGame2 implements TennisGame {
    public int P1point = 0;
    public int P2point = 0;

    private String player1Name;
    private String player2Name;
    private String[] Score = new String[]{"Love","Fifteen","Thirty","Forty"};

    public TennisGame2(String player1Name,String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String score = "";
        if (P1point == P2point && P1point < 3) {
            score = Score[P1point] + "-All";
        } else if (P1point == P2point && P1point >= 3) {
            score = "Deuce";
        } else if (P1point < 4 && P2point < 4) {
            score = Score[P1point] + "-" + Score[P2point];
        } else if (Math.abs(P1point - P2point) == 1) {
            if (P1point > P2point) {
                score = "Advantage " + player1Name;
            } else score = "Advantage " + player2Name;
        }

        if (Math.abs(P1point - P2point) >= 2 && (P1point >= 4 || P2point >= 4)) {
            if (P1point > P2point) {
                score = "Win for " + player1Name;
            } else score = "Win for " + player2Name;
        }
        return score;
    }

    public void P1Score() {
        P1point++;
    }

    public void P2Score() {
        P2point++;
    }

    public void wonPoint(String player) {
        if (player == "player1")
            P1Score();
        else
            P2Score();
    }
}