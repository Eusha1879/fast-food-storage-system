# fast-food-storage-system
CCT Algorithms and Constructs CA1 — Java-based Fast Food Storage System using OOP, Stack/Queue data structures, validation, testing, time complexity analysis, and GitHub version control.

flowchart TD

    A["🍔 FAST FOOD STORAGE SYSTEM<br/>CCT CA1 - Algorithms & Constructs"]

    A --> B["1️⃣ Requirements Analysis"]
    B --> B1["Maximum capacity = 8 trays"]
    B --> B2["Store name, weight, best-before date, added time"]
    B --> B3["Add / Remove / Peek / Search / Display / Exit"]

    B --> C["2️⃣ Data Structure Selection"]

    C --> C1["Choose suitable structure"]
    C --> C2["Explain why it fits the scenario"]
    C --> C3["Analyse time complexity"]

    C --> D["3️⃣ Java + OOP Design"]

    D --> D1["FoodItem.java"]
    D --> D2["FoodStack.java"]
    D --> D3["StorageService.java"]
    D --> D4["FoodValidator.java"]
    D --> D5["Main.java"]

    D1 --> D11["name : String"]
    D1 --> D12["weight : double"]
    D1 --> D13["bestBeforeDate : LocalDate"]
    D1 --> D14["addedTime : LocalDateTime"]

    D --> E["4️⃣ Data Structure Operations"]

    E --> E1["push() / add()"]
    E --> E2["pop() / remove()"]
    E --> E3["peek()"]
    E --> E4["search()"]
    E --> E5["display()"]
    E --> E6["isEmpty()"]
    E --> E7["isFull()"]

    E --> F["5️⃣ Validation + Error Handling"]

    F --> F1["Reject invalid weight"]
    F --> F2["Reject invalid best-before date"]
    F --> F3["Prevent more than 8 trays"]
    F --> F4["Handle empty storage"]
    F --> F5["Handle invalid menu input"]

    F --> G["6️⃣ Testing"]

    G --> G1["Valid input tests"]
    G --> G2["Invalid input tests"]
    G --> G3["Full storage test"]
    G --> G4["Empty storage test"]
    G --> G5["Search test"]

    G --> H["7️⃣ Time Complexity Analysis"]

    H --> H1["Add"]
    H --> H2["Remove"]
    H --> H3["Peek"]
    H --> H4["Search"]
    H --> H5["Display"]

    H --> I["8️⃣ GitHub"]

    I --> I1["Create repository"]
    I --> I2["Meaningful commits"]
    I --> I3["5-8 commits per member"]
    I --> I4["Give lecturer repository access"]
    I --> I5["Add GitHub link to poster"]

    I --> J["9️⃣ Poster + Video"]

    J --> J1["400-500 word poster"]
    J --> J2["Problem explanation"]
    J --> J3["Data structure explanation"]
    J --> J4["Advantages + limitations"]
    J --> J5["GitHub commit screenshots"]
    J --> J6["Recorded explanation"]

    J --> K["🔟 Final Submission"]

    K --> K1["Java Project"]
    K --> K2["PPT Poster"]
    K --> K3["Video Link"]
    K --> K4["GitHub Link"]
    K --> K5["AI Use Word Document"]
