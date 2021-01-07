package exercise6;

import exercise1.MyFirstTest;
import exercise2.TrueOrFalseValidation;
import exercise3.EqualityValidation;
import exercise4.BeforeAndAfterTestConditions;
import exercise5.BeforeAndAfterClassTestConditions;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        MyFirstTest.class,
        TrueOrFalseValidation.class,
        EqualityValidation.class,
        BeforeAndAfterTestConditions.class,
        BeforeAndAfterClassTestConditions.class
})
public class SuiteTest {
}
