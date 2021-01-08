package exercise14;

import categories.Positives;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(Positives.class)
@SuiteClasses({
        CategorizedTests.class
})
public class CategoriesSuite {
}
