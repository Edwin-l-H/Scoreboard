public class Scoreboard
{
    private String teamOne;
    private String teamTwo;
    private int teamOneScore;
    private int teamTwoScore;
    private String activeTeam;

    public Scoreboard(String one, String two)
    {
        teamOne = one;
        teamTwo = two;
        activeTeam = teamOne;
    }
    public String getScore()
    {
        return teamOneScore + " - " + teamTwoScore + " - " + activeTeam;
    }

    public void recordPlay(int score)
    {
        //This bit of code adds the score earned from the play
        if (activeTeam == teamOne)
        {
            teamOneScore += score;
        }
        else
        {
            teamTwoScore += score;
        }


        //This bit of code switches the active team
        if (score <= 0)
        {
            
            if (activeTeam == teamOne) 
            {
                activeTeam = teamTwo;
            }
            else if (activeTeam == teamTwo)
            {
                activeTeam = teamOne;
            }
        }
        

    }
}
