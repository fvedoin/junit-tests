package exercise7;

import org.junit.Test;
import voting.Voting;

import static org.junit.Assert.*;

public class AgeVotingValidation {

    @Test
    public void age15_CantVote(){
        assertEquals("Fernando, you cant vote", Voting.canVote("Fernando", 2006));
    }

    @Test
    public void age16_OptionalVote(){
        assertEquals("Fernando, your vote is optional", Voting.canVote("Fernando", 2005));
    }

    @Test
    public void age17_OptionalVote(){
        assertEquals("Fernando, your vote is optional", Voting.canVote("Fernando", 2004));
    }

    @Test
    public void age18_MandatoryVote(){
        assertEquals("Fernando, your vote is mandatory", Voting.canVote("Fernando", 2003));
    }

    @Test
    public void age25_MandatoryVote(){
        assertEquals("Fernando, your vote is mandatory", Voting.canVote("Fernando", 1996));
    }

    @Test
    public void age70_MandatoryVote(){
        assertEquals("Fernando, your vote is mandatory", Voting.canVote("Fernando", 1951));
    }

    @Test
    public void age71_MandatoryVote(){
        assertEquals("Fernando, your vote is optional", Voting.canVote("Fernando", 1950));
    }
}
