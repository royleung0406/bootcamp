## Getting Started

### Week4
- For "extends"
  - Attributes in Parent
    - if it is private, CANNOT inherit
    - if it is public, "this" is something like "alias", pointing back to "super"
  - Constructors in Parent
    - Even it is public, CANNOT inherit
    - Instead, child class calls parent constructor by "super"
  - Methods in Parent
    - if it is public, "this" is something like "alias", pointing back to "super"
    - if it is private, child class CANNOT access by "super"
    - Child class can "override" the same method in parent class

- Inheritance
  - Parent Class can hold its own attribute
  - Parent Class itself can create object

- No matter you are doing individual class or extends, you should override the following ...
  - equals()
  - hashCode()
  - toString()

- if you do not overwrite the above 3 methods, your class by default inherit Parent's one.
  - by default, all class has a super parent "Object.class"
  - "Object.class" makes use of "object address" to perform the above 3 methods

- Polymorphism
  - Compile-time (Static Polymorphism)
    - The scope of the "reference" is determined by the type of reference
    - When re-assign the object to a lower level type of reference, the object behavior may be different.
  - Run-time (Dynamic Polymorphism)
    - method implementation belongs to object itself (but not the reference type)

- Why do we need Inheritance + Polymorphism?
  - 1. abstract class type can be used in method parameter (i.e. Shape[] -> area)
  - 2. abstract class type can be an attribute of a class (i.e. Rank is an attribute of Card)