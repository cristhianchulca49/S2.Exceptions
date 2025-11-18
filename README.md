# S2.Exceptions
These exercises aim to practice key object-oriented programming concepts such as inheritance, abstract classes, object initialization, encapsulation, constructors, and method implementation.
---

#🧩 S1.01 Level 1

## 📄 Description
**Practice creating basic classes, iterating through collections, throwing custom exceptions, and handling internal Java exceptions.**

1. Class Product

Attributes:

``name``

``price``

2. Class Sale

Attributes:

A collection of ``products``

``totalPrice``

Method:

- ``calculateTotal()`` -> Check whether the product collection is empty.

- If empty → throw the custom exception ``EmptySaleException.``

- If not empty → iterate through the collection and sum all product prices.

- Store the result in the ``totalPrice`` attribute.

3. Class EmptySaleException

Requirements:

- Must extend Exception (checked exception).

- The constructor must receive the message:
"To make a sale, you must add products first".

- When caught, the message must be displayed using ``getMessage()``.

--- 
#🧩  S1.02 Level 2
## 📄 Description
**Create a class that handles all exceptions that can occur when reading user input from the keyboard using Java’s Scanner.**

The class must:

- Instantiate a single ``Scanner`` object.

- Provide static methods to read different types of data.

- Ask for input repeatedly until the user enters a valid value.

- Display clear error messages when input is incorrect.

🛠️ Methods to Implement (Handle InputMismatchException)
✔️ Read a byte

``public static byte readByte(String message)``;

✔️ Read an int

``public static int readInt(String message)``;

✔️ Read a float

``public static float readFloat(String message)``;

✔️ Read a double

``public static double readDouble(String message)``;

Expected behavior:
If the user enters an invalid format (e.g., enters a float with a dot instead of a comma), the method must display a message such as:
"Format error"


and continue asking until the input is valid.

🛠️ Methods to Implement (Handle a Custom Exception that Extends Exception)
✔️ Read a character

``public static char readChar(String message)``;

✔️ Read a String

``public static String readString(String message)``;

✔️ Read Yes/No

``public static boolean readYesNo(String message)``;

- If the user enters "s" → return true

- If the user enters "n" → return false

- Any other value → custom exception

---

## 💻 Technologies Used
- **IntelliJ IDEA**  
- **Java**

---

## 📋 Requirements
- **JDK 25.0.1**

---

## 🛠️ Installation
Clone this repository:
git clone https://github.com/cristhianchulca49/S1.Exceptions.git

---
🤝 Contributions are welcome! 
- Please follow these steps to contribute: 
- Fork the repository Create a new branch: git checkout -b feature/NewFeature 
- Make your changes and commit them: git commit -m 'Add New Feature' 
- Push the changes to your branch: git push origin feature/NewFeature 
- Open a Pull Request
