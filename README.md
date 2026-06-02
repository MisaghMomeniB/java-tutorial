<div align="center">

# ☕ Java Tutorial

**A hands-on, example-driven Java learning repository — from zero to OOP hero.**

[![Java](https://img.shields.io/badge/Java-8%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![Topics](https://img.shields.io/badge/Topics-OOP%20%7C%20Constructors%20%7C%20Access%20Modifiers-blue?style=for-the-badge)](https://github.com/MisaghMomeniB/java-tutorial)
[![Commits](https://img.shields.io/badge/Commits-327%2B-brightgreen?style=for-the-badge)](https://github.com/MisaghMomeniB/java-tutorial/commits/main)
[![Open Source](https://img.shields.io/badge/Open%20Source-%E2%9D%A4-red?style=for-the-badge)](https://github.com/MisaghMomeniB/java-tutorial)

> *"Learning Java one concept at a time — clean code, clear examples, no fluff."*

</div>

---

## 🧭 Table of Contents

- [About](#-about)
- [What's Inside](#-whats-inside)
- [Topics Covered](#-topics-covered)
- [Getting Started](#-getting-started)
- [Learning Path](#-learning-path)
- [Code Samples](#-code-samples)
- [Contributing](#-contributing)
- [Author](#-author)

---

## 📖 About

**java-tutorial** is a structured, example-first repository built to teach core Java concepts through practical, runnable code. With **327+ commits** and growing, it's a living reference for developers at every stage — whether you're writing your first class or revisiting fundamentals before an interview.

Each folder isolates one concept, with focused `.java` files you can read, run, and experiment with immediately. No frameworks, no setup headaches — just pure Java.

---

## 📦 What's Inside

```
☕ java-tutorial/
│
├── 📂 Access-Modifiers/           # public, private, protected, default — demystified
├── 📂 Consept-Of-Object-Oriented/ # The 4 pillars of OOP with real examples
├── 📂 Constructor/                # Default, parameterized & overloaded constructors
│
└── 📄 README.md
```

---

## 🗂 Topics Covered

### 🔐 Access Modifiers
> Control who can see and touch your code.

| Modifier | Visibility |
|---|---|
| `public` | Accessible from anywhere |
| `protected` | Same package + subclasses |
| `default` | Same package only |
| `private` | Class-only access |

Learn when and why to use each modifier — a critical skill for writing safe, maintainable Java.

---

### 🧱 Concept of Object-Oriented Programming (OOP)
> The four pillars that make Java *Java*.

| Pillar | What It Means |
|---|---|
| 🔒 **Encapsulation** | Bundle data and methods; hide internals |
| 🧬 **Inheritance** | Reuse and extend existing classes |
| 🎭 **Polymorphism** | One interface, many implementations |
| 🎨 **Abstraction** | Expose what matters, hide the rest |

Practical code examples show each concept in action — not just definitions.

---

### 🏗️ Constructors
> How Java objects are born.

- **Default Constructor** — no arguments, sensible defaults
- **Parameterized Constructor** — initialize with specific values
- **Constructor Overloading** — multiple signatures, flexible creation
- **`this()` chaining** — constructor calling constructor

---

## 🚀 Getting Started

### Prerequisites

- ✅ [JDK 8+](https://www.oracle.com/java/technologies/downloads/) installed
- ✅ Any IDE: [IntelliJ IDEA](https://www.jetbrains.com/idea/), [Eclipse](https://www.eclipse.org/), or [VS Code](https://code.visualstudio.com/) with Java extension
- ✅ Basic familiarity with running terminal commands

### Clone & Run

```bash
# Clone the repository
git clone https://github.com/MisaghMomeniB/java-tutorial.git

# Move into the project
cd java-tutorial

# Navigate to a topic folder
cd Access-Modifiers

# Compile a file
javac FileName.java

# Run it
java FileName
```

---

## 🗺️ Learning Path

Follow this order for the smoothest journey from beginner to confident Java developer:

```
1️⃣  Access-Modifiers
        │
        ▼
2️⃣  Constructor
        │
        ▼
3️⃣  Consept-Of-Object-Oriented
        │
        ▼
4️⃣  Build your own Java project! 🚀
```

Each step builds on the last. Don't skip — understanding access modifiers makes OOP click much faster.

---

## 💡 Code Samples

### Access Modifier Example
```java
public class BankAccount {
    private double balance;       // only this class can access it
    protected String ownerName;   // accessible by subclasses
    public String accountId;      // everyone can see this

    public double getBalance() {  // controlled access via public method
        return balance;
    }
}
```

### Constructor Example
```java
public class Person {
    String name;
    int age;

    // Default constructor
    Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Usage
Person p1 = new Person();                   // → Unknown, 0
Person p2 = new Person("Misagh", 25);       // → Misagh, 25
```

### OOP — Inheritance Example
```java
class Animal {
    void speak() {
        System.out.println("...");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Woof! 🐕");
    }
}
```

---

## 🛣️ Roadmap — Upcoming Topics

- [x] Access Modifiers
- [x] Constructors
- [x] OOP Concepts (Encapsulation, Inheritance, Polymorphism, Abstraction)
- [ ] Exception Handling ⚠️
- [ ] Collections Framework (List, Map, Set) 📚
- [ ] Interfaces & Abstract Classes 🎭
- [ ] Generics 🔮
- [ ] File I/O 📁
- [ ] Multithreading 🧵
- [ ] Java Streams & Lambda Expressions ⚡

---

## 🤝 Contributing

All contributions are welcome — whether it's a new topic, a cleaner example, or a typo fix!

1. **Fork** the repo
2. **Create** a branch: `git checkout -b topic/your-topic`
3. **Add** your Java files with clear comments
4. **Commit**: `git commit -m "Add: topic name"`
5. **Push** and open a **Pull Request**

Please keep examples focused, well-commented, and beginner-friendly.

---

## 📄 License

Distributed under the **MIT License** — free to use, learn from, and share.

---

<div align="center">

## 👨‍💻 Author

**Misagh Momeni Bashusqeh**
*Software Developer*

[![GitHub](https://img.shields.io/badge/GitHub-MisaghMomeniB-181717?style=for-the-badge&logo=github)](https://github.com/MisaghMomeniB)

---

*Made with ☕ and a passion for clean, teachable code.*
*Star ⭐ the repo if it helped you — it means a lot!*

</div>
