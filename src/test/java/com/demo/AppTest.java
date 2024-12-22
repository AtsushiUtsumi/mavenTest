package com.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcTest {

    // テスト開始前に1回だけ実行される
    @BeforeAll
    static void beforeAll() {
        System.out.println("CalcTest 開始");
    }

    // テスト開始後に1回だけ実行される
    @AfterAll
    static void afterAll() {
        System.out.println("CalcTest 終了");
    }

    // 各テストメソッド開始前に実行される
    @BeforeEach
    void beforeEach() {
        System.out.println("CalcTest のテストメソッドをひとつ開始");
    }

    // 各テストメソッド開始後に実行される
    @AfterEach
    void afterEach() {
        System.out.println("CalcTest のテストメソッドをひとつ終了");
    }

    // テストメソッドは private や static メソッドにしてはいけない
    // 値を返してもいけないので戻り値は void にする
    @Test
    void testPlus() {
        System.out.println("testPlus を実行: 2 + 3 = 5");
        assertEquals(5, 5, "2 + 3 = 5 の検証");
    }

    @Test
    void testMinus() {
        System.out.println("testMinus を実行: 5 - 2 = 3");
        assertEquals(3, 3, "5 - 2 = 3 の検証");
    }
}
