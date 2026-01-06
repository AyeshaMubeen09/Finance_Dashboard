📱 Finance Dashboard Android App

📌 Overview
The Finance Dashboard App is an Android application built using Kotlin and XML in Android Studio.
It provides a clean and modern user interface for managing basic financial actions such as viewing account balance, transactions, and navigating between features like deposit, withdrawal, and transfers.
The app uses dummy authentication, meaning any email and password are accepted for login. No backend or database integration is required, making it ideal for learning Android development concepts and UI navigation.

✨ Features
Dummy Login & Register system
Home dashboard displaying:
Account balance
Quick action buttons (Deposit, Withdraw, Transfer)
Transaction history using RecyclerView
Bottom navigation bar (Home, Explore, Bookmark)
Separate screens for:
Deposit
Withdraw
Transfer
Notifications
Settings
Refer & Earn
Clean UI with Material Design components
Uses ViewBinding for safer view handling

🛠 Technologies Used
Language: Kotlin
UI Design: XML
IDE: Android Studio
Architecture: Activity-based navigation
UI Components:
ConstraintLayout
RecyclerView
BottomNavigationView
Build Tools: Gradle
Minimum SDK: As configured in the project

🔁 Application Flow
App launches into Login Screen
User can:
Login → navigates to Home (MainActivity)
Register → navigates back to Login
Home dashboard allows:
Viewing balance and transaction list
Navigating to Deposit, Withdraw, Transfer screens
Switching tabs using Bottom Navigation
All navigation is handled using Intents
Note: Authentication is dummy; no validation or database is used.

▶️ How to Run the Project
Clone the repository:
Copy code
Bash
git clone https://github.com/AyeshaMubeen09/Finance_Dashboard.git
Open the project in Android Studio
Let Gradle sync complete
Run the app on:
Android Emulator or
Physical Android device
Login with any email & password to access the dashboard

🚀 Future Improvements
Integrate Firebase Authentication
Store transactions using Room Database or Firebase Firestore
Add real-time balance updates
Implement logout functionality
Improve UI animations and transitions
Add dark mode support
Convert to MVVM architecture
Add form validation for login and register

📌 Note
This project is intended for learning purposes, UI practice, and understanding Android navigation and layouts.
No real financial data or backend services are used.

📌 Author
Ayesha Mubeen