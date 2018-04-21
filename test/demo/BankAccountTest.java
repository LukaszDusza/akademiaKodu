package demo;

import org.junit.*;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;
    private static int count;

    @BeforeClass
 public static void beforeClass() {
        System.out.println("ta metoda zostanie uruch. przed testami");
    }

    @Before
    public void setup() {
        account = new BankAccount("Lukasz", "Bankowy", 1000.00, BankAccount.CHECKING);
        System.out.println("run Before method");
    }


    @Test
    public void deposit() throws Exception{
        //  fail("nie ma testow dla tej metody");
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(),0);
    }


  //  @Test(expected = IllegalArgumentException.class)
   @Test
    public void withdraw_nobranch() throws Exception{
     //   account = new BankAccount("Lukasz", "Bankowy", 1000.00);
     //   account.withdraw(600.00, false);
      //  assertEquals(400.00, balance,0);

        try {
            account.withdraw(600.00, false);
            fail("nie ma testow dla tej metody");
        } catch (IllegalArgumentException e) {

        }
    }
    @Test
    public void isChecked_true() {
       assertTrue("to konto nie jest Checking", account.isChecking());
    }

    @AfterClass
    public static void  afterClass() {
        System.out.println("run afterClass()");
    }

    @After
    public void teardown() {
        System.out.println("run taerdown()");
        }



}

// assertNotEquals() - uzywamy jezeli oczekujemy alby aktualna wartosc byla rozna.
// assertArraysEquals() - uzywamy do sprawdzania komatybilnosci tablic.