---

## **Table of Contents**

1. [Installation](#installation)
   - [Frontend Setup](#frontend-setup)
   - [Backend Setup](#backend-setup)
2. [Usage](#usage)

---

## **Installation**

To get Exam up and running locally, follow these steps:

### **Frontend Setup**

1. Clone the repository:
   ```bash
   git clone https://github.com/CNeilas/TECHIN-exam.git
   ```
2. Navigate to the frontend directory:
   ```bash
   cd exam/exam-ui
   ```
3. Install dependencies:
   ```bash
   npm install
   ```
4. Start the development server:
   ```bash
   npm run dev
   ```

The React-Vite app will run at http://localhost:5173.

### **Backend Setup**

1. Navigate to the backend directory:
   ```bash
   cd exam/exam_api
   ```
2. Build the project:
   ```bash
   ./mvnw clean install
   ```
3. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

The backend server will run at http://localhost:8080.

## **Usage**

1. Open the frontend in your browser: [http://localhost:5173](http://localhost:5173).

   Users
   1. acc. name: admin; password: admin
   2. acc. name: user; password: user
