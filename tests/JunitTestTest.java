import org.junit.*;


import static org.junit.Assert.*;

public class JunitTestTest {
    public static JunitTest junitTest;

    // @BeforeClass : 해당 클래스에서 딱 한번만 실행하는 어노테이션
    @BeforeClass
    public static void makeInstance() throws Exception {
        junitTest = new JunitTest("홍길동", 20, 180.0f);
        System.out.println("wqejwqk");
    }

    // @Before : 단위 테스트 메소드가 실행되기전 무조건 실행 됨
    // 테스트 메소드가 10개라면 10번 실행 됨
    @Before
    public void beforeTest() throws Exception {
        System.out.println("before!!");
    }

    // @Test : 실제 테스트를 진행할 메소드
    @Test
    public void getName() throws Exception {
        assertEquals("홍길동", junitTest.getName());
    }

    @Test
    public void getAge() throws Exception {
        assertEquals(20, junitTest.getAge());
    }

    @Test
    public void getTall() throws Exception {
        assertEquals(180.0f, junitTest.getTall());
    }

    @Test
    public void setAge() throws Exception {
        junitTest.setAge(29);
    }

    @Test
    public void getAge2() throws Exception {
        assertEquals(29, junitTest.getAge());
    }

    // @Ignore : 해당 테스트는 무시 함
    @Test
    @Ignore
    public void setTall() throws Exception {
        junitTest.setTall(170.0f);
    }

    @Test
    public void getTall2() throws Exception {
        assertEquals(170.0f, junitTest.getTall());
    }


    @Test
    public void setName() throws Exception {
        junitTest.setName("임꺽정");
    }

    @Test
    public void getName2() throws Exception {
        assertEquals("홍길동", junitTest.getName());
    }

    // @After : 단위 테스트가 실행된 이후 한번씩 실행 됨
    // 테스트 메소드가 10개라면 10번 실행 됨
    @After
    public void printAfter() throws Exception {
        System.out.println("After!!");
    }

    // @AfterClass : 해당 테스트에서 딱 한번만 실행 됨
    @AfterClass
    public static void printAfterClass() throws Exception {
        System.out.println("AFTER CLASS");
    }
}