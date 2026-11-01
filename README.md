# ☕ Core Java & OOP Mastery Repository

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java%20SE-0969DA?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java SE"/>
  <img src="https://img.shields.io/badge/Focus-Core%20Java%20%26%20OOP-00E5FF?style=for-the-badge&logo=java&logoColor=black" alt="Core Java & OOP"/>
  <img src="https://img.shields.io/badge/Projects-15%20Mini%20Applications-FFA116?style=for-the-badge" alt="15 Mini Projects"/>
  <img src="https://img.shields.io/badge/Status-Hands--on%20Laboratory-2EA44F?style=for-the-badge" alt="Laboratory"/>
</p>

---

## 📖 Overview

A comprehensive, hands-on repository covering foundational and advanced **Core Java concepts, Object-Oriented Architecture (OOP), Concurrency, Collections, File I/O**, and **15 real-world console mini-applications**.

Engineered to build rock-solid Java foundations from scratch before transitioning into enterprise backend frameworks like Spring Boot.

---

## 🎮 15 Console Mini-Applications (`src/mini_projects/`)

A curated collection of interactive console-based applications demonstrating real-world logic, state management, and user interaction:

| Application | Core Concepts Applied | Highlights |
| :--- | :--- | :--- |
| 🏦 **Bank Application** (`Bank.java`) | OOP, State Encapsulation, Transactions | Account balance management, deposit, withdrawal, and overdraft protection. |
| 🎵 **Music Player** (`MusicPlayer.java`) | Java Sound API (`javax.sound.sampled`), File I/O | Audio playback controller playing `.wav` audio files directly from code. |
| 🛒 **Shopping Cart** (`ShoppingCart.java`) | Collections (`ArrayList`), Price Calculations | Adding, removing, and computing item totals with tax calculations. |
| 🪢 **Hangman Game** (`HangmanGame.java`) | String manipulation, Array tracking, File I/O | Word guessing engine reading dynamic dictionary words from `words.txt`. |
| ⏰ **Alarm Clock** (`AlarmClock.java`) | Multithreading, `TimerTask`, Sound API | Scheduled timer checking current time and triggering audio alerts. |
| ❓ **Quiz Game** (`QuizGame.java`) | 2D Arrays, Score Tracking, Scanner Logic | Interactive multiple-choice trivia challenge with answer validation. |
| 🎰 **Slot Machine** (`SlotMachine.java`) | `Math.random()`, Betting logic, Loops | Casino-style slot game with symbol matching and balance payouts. |
| 🎲 **Dice Roller** (`DiceRoller.java`) | Randomization, ASCII graphics | Visual dice rolling simulator with sum evaluations. |
| ✊ **Rock Paper Scissors** (`StonePaperScissors.java`) | Conditionals, Enum/String matching | Game engine playing against randomized computer selections. |
| 🔢 **Guess the Number** (`GuessNumberGame.java`) | Binary Search principles, Loop counters | High-low guessing game tracking total attempts. |
| 📝 **Mad Libs Generator** (`MadLibsGame.java`) | String formatting, Dynamic substitution | Story template engine populating user-supplied nouns and adjectives. |
| 🧮 **Console Calculator** (`Calculator.java`) | Exception handling, Arithmetic methods | Multi-operation calculator with zero-division defense. |
| 📈 **Compound Interest** (`CompoundInterestCalculator.java`) | `Math.pow()`, Financial algorithms | Principal, rate, and time compound interest projections. |
| 🌡️ **Temperature Converter** (`TemperatureConverter.java`) | Unit conversions, Formula logic | Bidirectional Celsius to Fahrenheit transformation. |
| ⚖️ **Weight Converter** (`WeightConverter.java`) | Metric conversions, Input formatting | Pounds (lbs) to Kilograms (kg) conversion utility. |

---

## 🏛️ Comprehensive Core Java Modules

### 1. 🧱 Object-Oriented Programming (`src/oops/`, `src/inheritance/`, `src/polymorphism/`)
- **Four Pillars**: Encapsulation (`GetterAndSetter.java`), Inheritance (`SingleInheritanceDemo.java`, `Vehicle.java`, `Dog.java`), Polymorphism (`RuntimePolymorphism.java`, `MethodOverriding.java`), and Abstraction (`Abstraction.java`, `Interface.java`).
- **Object Relationships**: Aggregation (`Aggregation.java`) vs. Composition (`Composition.java`).
- **Constructors**: Default, Parameterized, and Overloaded constructors (`ConstructorOverloading.java`), `super()` and `this` keyword execution.

### 2. 🗃️ Collections Framework (`src/collections/`)
In-depth implementations comparing performance, ordering, and synchronization:
- **Lists**: `ArrayListDemo.java`, `LinkedListDemo.java`, `VectorDemo.java`, `StackDemo.java`.
- **Thread Safety**: `CopyOnWriteArrayListDemo.java` (concurrent read-heavy collections).
- **Maps**: `HashMapDemo.java`, `HashMaps.java` (key-value hashing, collision handling).

### 3. ⚡ Concurrency & Multithreading (`src/multithreading/`, `src/threading/`, `src/timerTask/`)
- **Threads**: Extending `Thread` vs. implementing `Runnable`.
- **Scheduled Tasks**: `TimerTaskDemo.java` and `CountdownTimer.java` for periodic job execution.

### 4. 💾 File I/O & Streams (`src/fileIO/`, `src/io/`)
- Reading and writing local files (`FileIODemo.java`, `FileReaderDemo.java`).
- Scanner keyboard input buffering and parsing (`ScannerBasics.java`).

### 5. 🛡️ Exception Handling & Generics (`src/exceptionHandling/`, `src/generics/`)
- Robust `try-catch-finally` blocks, checked vs. unchecked exceptions (`ExceptionHandlingDemo.java`).
- Type safety and reusable components via Java Generics (`GenericsDemo.java`).

### 6. 🧩 Modern Core Utilities (`src/dateTime/`, `src/enums/`, `src/anonymousClasses/`)
- `java.time` API (`DateTimeDemo.java`).
- Type-safe Enums (`Day.java`, `EnumDemo.java`).
- Anonymous Inner Classes before Lambdas (`AnonymousClassDemo.java`).

---

## 🏃 How to Compile & Run

Any project or core concept file can be executed directly from the terminal:

```bash
# Clone the repository
git clone https://github.com/alok0770/learning-core-java.git
cd learning-core-java

# Compile a mini project (e.g., HangmanGame or Bank)
javac -d out src/mini_projects/Bank.java

# Run the compiled program
java -cp out mini_projects.Bank
```

---

## 👨‍💻 Author

**Alok Rana**  
- 🐙 GitHub: [@alok0770](https://github.com/alok0770)  
- 🌐 Portfolio: [portfolio-alok-2b96.vercel.app](https://portfolio-alok-2b96.vercel.app/)  
- 💼 LeetCode: [@Alok_0770](https://leetcode.com/u/Alok_0770/)  
