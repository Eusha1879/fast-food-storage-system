# fast-food-storage-system
CCT Algorithms and Constructs CA1 — Java-based Fast Food Storage System using OOP, Stack/Queue data structures, validation, testing, time complexity analysis, and GitHub version control.

```mermaid
flowchart TD
    %% Styling Classes
    classDef header fill:#1e293b,stroke:#38bdf8,stroke-width:2px,color:#fff,font-weight:bold,rx:8px,ry:8px
    classDef process fill:#0f172a,stroke:#0284c7,stroke-width:1.5px,color:#f8fafc,rx:6px,ry:6px
    classDef subProcess fill:#1e1e38,stroke:#818cf8,stroke-width:1.5px,color:#e0e7ff,rx:6px,ry:6px
    classDef oopBox fill:#0b192c,stroke:#06b6d4,stroke-width:1.5px,color:#e2e8f0,rx:6px,ry:6px
    classDef opBox fill:#111827,stroke:#10b981,stroke-width:1.5px,color:#f9fafb,rx:6px,ry:6px

    %% Main Header
    TITLE["FAST FOOD STORAGE SYSTEM"]:::header

    %% Steps Flow
    TITLE --> S1[" REQUIREMENTS ANALYSIS"]:::process
    S1 --> S2["DATA STRUCTURE SELECTION"]:::process
    S2 --> S3["JAVA + OOP DESIGN"]:::process

    %% Step 3: OOP Components
    subgraph OOP_DESIGN [" "]
        direction TB
        F1["<b>FoodItem.java</b><br/>─────────────<br/>• name<br/>• weight<br/>• bestBeforeDate<br/>• addedTime"]:::oopBox
        F2["<b>FoodStack.java</b><br/>─────────────<br/>📦 Stack Container"]:::oopBox
        F3["<b>StorageService.java</b><br/>─────────────<br/>🗄️ Storage Engine"]:::oopBox
    end

    S3 --> F1
    S3 --> F2
    S3 --> F3

    %% Step 4: Data Structure Operations
    F1 --> S4["⚡ 4. DATA STRUCTURE OPERATIONS"]:::process
    F2 --> S4
    F3 --> S4

    subgraph OPERATIONS ["Core Stack Methods"]
        direction TB
        O1["push()"]:::opBox
        O2["pop()"]:::opBox
        O3["peek()"]:::opBox
        UTILS["• search()   • display()<br/>• isEmpty()  • isFull()"]:::opBox
    end

    S4 --> O1
    S4 --> O2
    S4 --> O3
    O1 -.-> UTILS
    O2 -.-> UTILS
    O3 -.-> UTILS

    %% Final Pipeline Steps
    UTILS --> S5["⚠️ 5. VALIDATION + ERRORS"]:::subProcess
    S5 --> S6["🧪 6. TESTING"]:::subProcess
    S6 --> S7["📈 7. TIME COMPLEXITY ANALYSIS"]:::subProcess
