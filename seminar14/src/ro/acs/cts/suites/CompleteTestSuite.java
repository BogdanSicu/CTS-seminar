package ro.acs.cts.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.acs.cts.teste.GrupaTest;
import ro.acs.cts.teste.GrupaTestWithFakes;
import ro.acs.cts.teste.GrupaTestWithMocks;
import ro.acs.cts.teste.GrupaTestWithStubs;

@RunWith(Suite.class)
@Suite.SuiteClasses({GrupaTest.class, GrupaTestWithFakes.class, GrupaTestWithStubs.class, GrupaTestWithMocks.class})
public class CompleteTestSuite {


}
