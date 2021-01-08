package exercise8;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import voting.Voting;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AgeVotingValidation_DDT {
    String name;
    int birthYear;
    String result;

    public AgeVotingValidation_DDT(String name, int birthYear, String result) {
        this.name = name;
        this.birthYear = birthYear;
        this.result = result;
    }

    @Test
    public void validateMandatoryVoting() {
        assertEquals(result, Voting.canVote(name, birthYear));
    }

    @Parameters(name = "{0} | {1} | {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Fernando", 2007, "Fernando, you cant vote"},
                {"Fernando", 2006, "Fernando, you cant vote"},
                {"Fernando", 2005, "Fernando, your vote is optional"},
                {"Fernando", 2004, "Fernando, your vote is optional"},
                {"Fernando", 2003, "Fernando, your vote is mandatory"},
                {"Fernando", 1996, "Fernando, your vote is mandatory"},
                {"Fernando", 1951, "Fernando, your vote is mandatory"},
                {"Fernando", 1950, "Fernando, your vote is optional"}
        });
    }
}
