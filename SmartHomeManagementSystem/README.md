**DCIT-50: Midterms Laboratory Examination**

This Java program that I made simulates a Simplified Smart Home System. 

It models different electronic devices, allowing users to control their status,
settings, and view their information using Object-Oriented Programming (OOP) principles

## Project Structure
The project consists of the following classes:

**• Device.java**

- The parent class (superclass).

- Contains common attributes like deviceName, status (ON/OFF), and location.

- Includes a static variable deviceCount to track the total number of devices created.

**• LightBulb.java**

- A subclass of Device.

- Adds specific attributes: brightnessLevel and color.

- Contains constructor overloading to allow creating bulbs with different default settings.

**• Thermostat.java**

- A subclass of Device.

- Adds specific attributes: temperature and mode (e.g., "cooling", "heating").

- Includes method overloading for setTemperature() to update settings in different ways.

**•SmartHomeController.java**

- A controller class that manages an array of devices.

- Demonstrates how to iterate through objects to perform bulk actions (like turning all devices ON or OFF).

**• Main.java (or SmartHomeMain.java)**

- The main entry point of the program.

- Instantiates objects, populates the device array, and runs the demonstration.
