package ro.acs.cts.suites;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.*;
import ro.acs.cts.categories.TesteRight;
import ro.acs.cts.categories.TesteUrgente;

@RunWith(Categories.class)
@SuiteClasses(CompleteTestSuite.class) //nerecomandat
@Categories.IncludeCategory({TesteUrgente.class})
@Categories.ExcludeCategory({TesteRight.class})
public class CustomTestSuite {
}
