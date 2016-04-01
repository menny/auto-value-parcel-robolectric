
package com.example.menny.roboautovalue;

import java.util.List;

abstract class XAutoValue_TestModel2 extends TestModel2 {

 private final List<String> strings;

 XAutoValue_TestModel2(
     List<String> strings) {
   if (strings == null) {
     throw new NullPointerException("Null strings");
   }
   this.strings = strings;
 }

 @Override
 public List<String> strings() {
   return strings;
 }

 @Override
 public String toString() {
   return "TestModel2{"
       + "strings=" + strings
       + "}";
 }

 @Override
 public boolean equals(Object o) {
   if (o == this) {
     return true;
   }
   if (o instanceof TestModel2) {
     TestModel2 that = (TestModel2) o;
     return (this.strings.equals(that.strings()));
   }
   return false;
 }

 @Override
 public int hashCode() {
   int h = 1;
   h *= 1000003;
   h ^= this.strings.hashCode();
   return h;
 }

}
