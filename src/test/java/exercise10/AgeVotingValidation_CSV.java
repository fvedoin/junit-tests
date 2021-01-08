package exercise10;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import voting.Voting;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class AgeVotingValidation_CSV {

    @Test
    @FileParameters(value = "src/test/resources/data.csv",
            mapper = CsvWithHeaderMapper.class)
    public void validateMandatoryVoting(String name, int birthYear, String result) {
        assertEquals(result, Voting.canVote(name, birthYear));
    }
}
