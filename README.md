🏥 Sistem de Gestiune Clinică Medicală (Java & Hibernate)
Acest proiect reprezintă o soluție software completă pentru administrarea unei clinici medicale. Aplicația facilitează interacțiunea dintre medici și pacienți, gestionând programările și istoricul medical printr-o arhitectură modulară.

💎 Arhitectura și Concepte POO
Proiectul a fost structurat pentru a demonstra utilizarea avansată a programării orientate pe obiecte:

Încapsulare: Datele sensibile din clase precum Pacient, Doctor sau User sunt protejate prin modificatori de acces privați și accesate exclusiv prin metode de tip getter/setter.

Abstractizare prin Servicii: Logica complexă de business este izolată în stratul de servicii (ex: AppointmentService, AuthService), separând procesarea datelor de interfața cu utilizatorul.

Utilizarea Enumerărilor: Rolurile utilizatorilor sunt gestionate prin tipul UserRole (PATIENT, DOCTOR), asigurând o clasificare clară a accesului în sistem.

Gestiunea Persistenței: Utilizarea Hibernate și a clasei HibernateUtil permite maparea obiectelor Java direct pe o bază de date relațională.

🚀 Funcționalități Principale
Aplicația oferă un set de instrumente esențiale pentru managementul medical:

Autentificare și Roluri: Sistemul permite logarea securizată a utilizatorilor în funcție de rolul atribuit (Medic sau Pacient).

Managementul Programărilor: Utilizatorii pot crea și vizualiza programări medicale prin intermediul AppointmentService.

Dosar Medical și Prescripții: Medicii pot gestiona istoricul medical al pacienților și pot emite prescripții digitale.

Meniu Interactiv: Interfața de tip consolă (ConsoleMenu) oferă o navigare intuitivă prin toate modulele aplicației.

🛠️ Stack Tehnologic
Limbaj: Java

ORM (Persistență): Hibernate / JPA (configurat prin persistence.xml)

Management Proiect: Maven (gestiune prin pom.xml)

Interfață: Console UI (bazată pe clasa Scanner)

📁 Structura Proiectului
Codul sursă este organizat în pachete specifice pentru a menține o structură curată:

org.example.Model: Entitățile de bază (Doctor, Pacient, User, etc.).

org.example.Servicii: Logica de business pentru programări, pacienți și medici.

org.example.Controller: Gestionarea meniului principal prin ConsoleMenu.

org.example.Database: Configurarea utilitară pentru Hibernate.
