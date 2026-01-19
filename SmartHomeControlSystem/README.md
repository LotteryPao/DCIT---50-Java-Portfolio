**Laboratory Activity#6: Smart Home Control System **


## System Overview
This Java Lab Activity is a simplified **Smart Home Management System** developed for "Smartify PH". It models the interaction between a central control system and various smart devices (AC, Lamps, TV, Microwave). 

This system demonstrates how a single list of devices can be managed polymorphically, allowing the main program to turn devices on/off and display their unique status details without knowing the specific object type at compile time.

##  Key Learning Objectives
This project fulfills the following Laboratory Activity requirements:
* **Inheritance:** Creating specific devices (`AirConditioner`, `Television`, etc.) that inherit from a common `Device` class.
* **Polymorphism:** Using parent references (`Device`) to hold child objects and demonstrating **Dynamic Binding** (overriding `showStatus()`).
* **Encapsulation:** Protecting device attributes (like `temperature`, `volume`) and using setters to control state changes.
* **Static Methods:** Implementing utility functions (`controlAllDevices`) that operate on lists of objects without belonging to a specific instance.
* **Constructors:** Utilizing **Copy Constructors** (in the Lamp class) to duplicate object states.


## Features implemented
* **Centralized Control**: A static method to batch switch all devices ON or OFF.

* **Device Counting**: A logic to count how many devices are currently consuming power.

* Unique Behaviors includes:

* **Air Conditioner**: Tracks fan speed and temperature.

* **Lamp Shade**: Tracks brightness and color (includes a feature to clone settings from another lamp).

* **Television**: Tracks channel and volume.

* **Microwave**: Tracks timer and heat level.

