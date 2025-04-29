CPE102 Lab 4 — Java OOP Projects: Cylinder, Message, and Bank Customer (Plain README)
======================================================================================

Author: Beartu
Course: CPE 102 – Computer Programming II (Spring 2024–2025)
Assignment: Lab 4

--------------------------------------------------

Project Goals
-------------

This Java project demonstrates the following:

1. **Cylinder Class**:
   - Radius and height representation.
   - Static counter for number of Cylinder objects.
   - Methods for volume and surface area calculations.
   - Proper encapsulation with getters, setters, toString, and equals.

2. **Message Class**:
   - Message text and cost handling.
   - Static counter for number of Message objects.
   - Methods for appending messages and checking equality.

3. **Bank Customer Class**:
   - Representation of customer information including account details.
   - Deposit and withdraw functionalities.
   - Proper encapsulation with getters, setters, toString, and equals.

All classes are tested individually in the project.

--------------------------------------------------

Folder Structure
----------------

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources (bank.java, cylinder.java, message.java, main.java)
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder.

--------------------------------------------------

Build & Run
-----------

Requirements:
- JDK 17 or later
- Command-line interface

To compile:
    javac -d bin src/*.java

To run:
    java -cp bin main

Ensure all `.class` files are properly generated before execution.

--------------------------------------------------

Implementation Notes
--------------------

- Each class has constructors (default, parameterized, and copy).
- Static counters track the number of created objects where needed.
- Proper method separation for operational logic and object manipulation.
- `Scanner` is used for interaction when needed.
- Object-Oriented Programming (OOP) principles like encapsulation and abstraction are followed.

--------------------------------------------------

End of README