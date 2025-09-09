#Kali Terminal UI

A Java Swing desktop application that simulates a Linux Kali-style terminal interface. Users can type commands into a styled terminal input field and see output with a realistic prompt, colors, and font styling. Currently supports basic command input and styled terminal output.

##📋 Features

Simulates a Linux-style terminal interface with a green-on-black theme

Styled JTextPane for terminal output (supports colors and fonts)

Realistic prompt with username, host, and directory

Custom input JTextField for entering commands

Scrollable output area

Background image support for immersive terminal UI

⚠️ Currently, the app only displays typed commands. Command execution or Linux simulation will be implemented in future updates.

🛠️ Technologies Used

Java 24 (Swing GUI)

StyledDocument for colored text output

AWT and Swing components

Background image rendering for UI

🗂 Project Structure
KaliTerminalUI/
├── src/
│   └── mycput/ac/za/kaliterminalui/
│       └── KaliTerminalUI.java  # Main Java Swing application
├── kali_terminal_bg.jpg          # Background image for terminal
├── .gitignore                    # Ignoring build and IDE files
└── README.md

💻 Installation & Usage

Clone the repo:

git clone https://github.com/YaseenKannemeyer/KaliTerminalUI.git


Import the project into your preferred IDE (e.g., NetBeans, IntelliJ IDEA).

Make sure kali_terminal_bg.jpg is in the project root or update the path in KaliTerminalUI.java.

Compile and run KaliTerminalUI.java.

Type commands into the input field to see them displayed in the terminal output area.

🚀 How It Works

User types a command in the input field and presses Enter.

The command is displayed in the terminal output pane with a styled prompt and colors.

StyledDocument API is used to render colored text in the output area.

Background image and text styling create a realistic terminal look.

🔐 Security Notice

This app is purely a UI simulation and does not execute system commands.

All styling and prompt formatting are handled in Java Swing.

No sensitive data or credentials are stored in the app.

📞 Contact

For questions or collaboration:

Email: yaseenkannemeyer@gmail.com

GitHub: YaseenKannemeyer

📄 License

This project is in the public domain. Feel free to use and modify it freely.

© 2025 Mogamat Yaseen Kannemeyer
