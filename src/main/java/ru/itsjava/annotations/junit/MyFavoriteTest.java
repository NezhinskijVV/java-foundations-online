package ru.itsjava.annotations.junit;

public class MyFavoriteTest {

    @BeforeAll
    public void beforeAllMethod(){
        System.out.println("BEFORE ALL");
    }

    @Test
    public void test1(){}

    @Test
    public void test2(){}

    @Test
    public void test3(){
        throw new RuntimeException();
    }

    @Test
    public void test4(){
        throw new RuntimeException();
    }

    public void noTestMethod(){}
}