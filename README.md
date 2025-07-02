☕️ *Both projects are fully Java-based! From console logic to GUI interfaces, everything was built using Java — with a touch of NetBeans to bring it to life.*

# 1. Credit Card Validation System 💳
A simple Java program that uses the **Luhn algorithm** to validate credit card numbers.

This project was built as part of my third semester to explore how algorithms and string manipulation can be applied in real-world cases like checking card legitimacy and type.


# Features
* **Luhn Algorithm Check**: Verifies if the entered card number is mathematically valid.
* **Card Type Detection**: Identifies the type of card (Visa, MasterCard, or American Express) based on the number prefix.
* **Formatted Output**: Automatically formats the number into `XXXX XXXX XXXX XXXX` for readability.
* **User Input Friendly**: Accepts input with dashes (e.g., `1234-5678-9012-3456`) and processes it cleanly.

# 2. Final Project 📑

**Hospital Reception System** — Java Desktop Application

This is a simple Java-based **hospital reception system** developed using Object-Oriented Programming concepts. The system simulates how a hospital receptionist handles patient registration, appointments, and basic records.

💡 Developed in NetBeans using Java & MySQL (simulated via placeholder database connection)


# Features
* **Patient Registration**
  Capture basic patient details via a simple form interface.
* **Appointment Scheduling**
  Let receptionists assign appointments and time slots.
* **Basic Data Handling**
  Includes a simulated database connection using `DatabaseConnection.java`.
* **Styled Interface**
  Lightweight UI enhancements using a CSS file (`styles.css.txt`).

# File Structure 📁
```
HospitalReceptionSystem/
├── src/
│   ├── HospitalReceptionApp.java         # Main application logic
│   ├── database/
│   │   └── DatabaseConnection.java       # Database simulation
│   └── resources/
│       └── styles.css.txt                # UI styling
├── nbproject/                            # NetBeans project files
└── build.xml                             # Build file for NetBeans
```

# How to Run
1. Open the project in **NetBeans** IDE.
2. Build and Run `HospitalReceptionApp.java`.
