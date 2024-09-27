package com.bootcamp.demo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.typeCompatibleWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.bootcamp.demo.matcher.EmailAddressMatcher;
import com.bootcamp.demo.matcher.PasswordMatcher;
import com.bootcamp.demo.matcher.UppercaseStringMatcher;

class HamcrestTest {
  @Test
  void testSum() {
    // MatcherAssert.class
    // Hamcrest Framework design is similar to English scentence
    assertThat(Calculator.sum(3, 4), is(equalTo(7)));
    assertThat(Calculator.sum(3, 4), is(not(equalTo(8))));
    // Junit5
    assertEquals(7, Calculator.sum(3, 4));
  }

  @Test
  void testComparison() {
    // Junit5
    assertTrue(Calculator.sum(3, 5) == 8);
    // Hamcrest
    assertThat(Calculator.sum(3, 5), is(greaterThanOrEqualTo(8)));
    assertThat(Calculator.sum(3, 5), is(lessThanOrEqualTo(8)));
    assertThat(Calculator.sum(3, 5), is(lessThan(9)));
    assertThat(Calculator.sum(3, 5), is(greaterThan(7)));
    // <, >, <=, >=

    // null check
    String result = null;
    assertThat(result, is(nullValue()));
    assertThat("abc", is(notNullValue()));
  }

  @Test
  void testString() {
    // contains
    String result = "vincent";
    assertThat(result, containsString("nce"));
    assertThat(result, not(containsString("abc")));
    assertThat(result, startsWith("vin"));
    assertThat(result, not(startsWith("abc")));
    // endsWith ...
  }

  @Test
  void testList() {
    // equals()
    List<String> fruits = List.of("apple", "orange", "cherry");
    assertThat(fruits, hasItem("apple"));
    assertThat(fruits, not(hasItem("banana")));
    assertThat(fruits, hasItems("apple", "cherry"));
    assertThat(fruits, not(hasItems("apple", "cherry", "banana")));
    assertThat(fruits, hasSize(3));
    // !!! contains - includes ALL items WITH ordering
    assertThat(fruits, contains("apple", "orange", "cherry"));
    assertThat(fruits, not(contains("apple", "orange")));
    assertThat(fruits, not(contains("apple", "cherry", "orange")));
    // !!! containsInAnyOrder
    assertThat(fruits, containsInAnyOrder("apple", "cherry", "orange"));
    // Check empty List
    List<String> emptyList = new LinkedList<>();
    assertThat(emptyList, hasSize(0));
    assertThat(emptyList, is(empty()));
  }

  @Test
  void testObjectType() {
    assertThat(new Student(18, "John"), instanceOf(Person.class));
     // test if Student.class is extending Person.class
    assertThat(Student.class, typeCompatibleWith(Person.class));
    assertThat(Person.class, not(typeCompatibleWith(Student.class)));
  }

  @Test
  void testCustomMatcher() {
    assertThat("ABC", UppercaseStringMatcher.create()); // Matcher Object
    assertThat("Abc", not(UppercaseStringMatcher.create())); // Matcher Object
  }

  @Test
  void testEmailAddress() {
    assertThat("vincentlau@gmail.com", EmailAddressMatcher.create());
    assertThat("vincentlau@gmailcom", not(EmailAddressMatcher.create()));
    assertThat("vincentlaugmail.com", not(EmailAddressMatcher.create()));
    assertThat("@gmail.com", not(EmailAddressMatcher.create()));
  }

  @Test
  void testPassword() {
    assertThat("Admin1234$", PasswordMatcher.create());
    assertThat("Admin1234", not(PasswordMatcher.create()));
    assertThat("admin1234#", not(PasswordMatcher.create()));
    assertThat("AdminAdmin#", not(PasswordMatcher.create()));
    assertThat("Admin1234#.", not(PasswordMatcher.create()));
  }
}