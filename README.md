# S3.01.Patterns1.Lv2

# 📞 International Address & Phone Manager – Abstract Factory Pattern

## 🌍 Java Project Using the Abstract Factory Pattern
This project implements a simple international address and phone number manager using the Abstract Factory design pattern in Java with IntelliJ. It allows storing contacts with country-specific formats for addresses and phone numbers, while ensuring code modularity and adherence to the Single Responsibility Principle.

### 📚 Overview
The application supports:

Adding international contacts

Handling different address and phone number formats per country

Encapsulation of creation logic using Abstract Factory

Clean separation of concerns between entities and their creation

### 🧱 Design Structure

🧩 Abstract Factory Interfaces

```
public interface ContactFactory {
    Address createAddress(String street, String city, String postalCode);
    PhoneNumber createPhoneNumber(String number);
}

public interface Address {
    String getFullAddress();
}

public interface PhoneNumber {
    String getFormattedNumber();
}
```

### 🇪🇸 Spanish Implementation

```
ContactFactory spanishFactory = new SpainContactFactory();
Address address = spanishFactory.createAddress("Calle Mayor 5", "Madrid", "28013");
PhoneNumber phone = spanishFactory.createPhoneNumber("600123456");
Address Output: Calle Mayor 5, 28013 Madrid, Spain

Phone Output: +34 600123456
```

🇺🇸 USA Implementation

```
ContactFactory usaFactory = new UsaContactFactory();
Address address = usaFactory.createAddress("Main St 101", "New York", "10001");
PhoneNumber phone = usaFactory.createPhoneNumber("5551234567");
Address Output: Main St 101, New York, 10001, USA

Phone Output: +1 5551234567
```

### 📒 Contact Manager Features
### ✅ Add new contacts via a factory

### 📋 Display full international contact list

### ☑️ Extendable: Simply add new factories for more countries

```
manager.addContact(usaFactory, "Main St", "New York", "10001", "5551234567");
manager.displayAllContacts();
```

### 🧪 Principles Followed

Single Responsibility Principle (SRP): Each class has one reason to change.

Abstract Factory Pattern: To create families of related objects without specifying their concrete classes.

### 🛠️ Tools Used

IntelliJ IDEA – Development Environment

Java – Core programming language

OOP & Design Patterns – Code architecture and maintainability

🚀 Example Output

```
Address: Calle Mayor 5, 28013 Madrid, Spain
Phone: +34 600123456
--------------------
Address: Main St 101, New York, 10001, USA
Phone: +1 5551234567
--------------------
```

### 🪡 Git Hub link:
https://github.com/ArnauAsole/S3.01.Patterns1.Lv2.git

### 🙏 Special thanks to:
Marc, Ana, Ignasi, Alejandro, Vanina, Javier, Toni, Alvaro and Albert.

