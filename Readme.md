# NGO Resources Sharing Network

A web-based application developed in Java using JDBC and MySQL to enable NGOs to share and request resources such as food, clothes, medicine, and volunteers. This platform allows multiple NGOs to collaborate efficiently and distribute resources based on demand and availability.

## 🛠️ Tech Stack

- **Backend:** Java (JDBC, DAO Design Pattern)
- **Frontend:** HTML, CSS, JavaScript
- **Database:** MySQL
- **IDE:** Visual Studio Code
- **Build Tool:** No specific build tool used (pure Java project)

---

## 📁 Folder Structure

NGO-Sharing-Network/
│
├── src/
│ ├── dao/
│ │ └── NGOResourceDAO.java
│ ├── model/
│ │ └── NGOResource.java
│ ├── util/
│ │ └── DBConnection.java
│ └── main/
│ └── Main.java
│
├── web/
│ ├── index.html
│ ├── addResource.html
│ ├── requestResource.html
│ └── styles/
│ └── style.css
│
├── sql/
│ └── database_schema.sql
│
├── .vscode/
│ └── launch.json
│
├── README.md
└── LICENSE

---

## 🧑‍💻 Features

- Add available resources by NGO
- Request resources from other NGOs
- View and manage resource listings
- Connect NGOs for collaboration
- MySQL database for persistent storage

---

## 🚀 Getting Started

### Prerequisites

- Java JDK (8+)
- MySQL Server
- Visual Studio Code with Extension: “Java Extension Pack”

### Database Setup

1. Start your MySQL server.
2. Open the `sql/database_schema.sql` file.
3. Run it in your MySQL Workbench or command-line client to create the required database and tables.

### Running the Project

1. Clone this repository:

   ```bash
   git clone https://github.com/your-username/NGO-Sharing-Network.git
   cd NGO-Sharing-Network
private static final String URL = "jdbc:mysql://localhost:3306/ngodb";
private static final String USER = "root";
private static final String PASSWORD = "yourpassword";
