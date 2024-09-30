public class Main
{
    public static void main(String[] args)
    {
        String info;
        Scoreboard game = new Scoreboard("Red", "Blue");
        info = game.getScore();
        System.out.println(info);

        //Team 1 gains a point.
        game.recordPlay(1);
        info = game.getScore();
        System.out.println(info);

        //Team 1 does not gain a point. Active team changes to team 2.
        game.recordPlay(0);
        info = game.getScore();
        System.out.println(info);

        //Team 2 gains 3 points.
        game.recordPlay(3);
        info = game.getScore();
        System.out.println(info);

        //Team 2 gains 1 point.
        game.recordPlay(1);
        info = game.getScore();
        System.out.println(info);

        //Team 2 does not gain a point. Active team changes to team 2.
        game.recordPlay(0);
        info = game.getScore();
        System.out.println(info);

        //Team 1 does not gain a point. Active team changes to team 2.
        game.recordPlay(0);
        info = game.getScore();
        System.out.println(info);

        //Team 2 gains 4 points.
        game.recordPlay(4);
        info = game.getScore();
        System.out.println(info);

        //Team 2 does not gain a point. Active team changes to team 2.
        game.recordPlay(0);
        info = game.getScore();
        System.out.println(info);

        //This is a different game being played
        Scoreboard match = new Scoreboard("Lions", "Tigers");

        info = match.getScore();
        System.out.println(info);

        info = game.getScore();
        System.out.println(info);
    }
}
