# Practical 7: JSON API and SQLite Database

**Enrollment Number:** 24012011028

## Aim

Develop an Android application that retrieves person information in JSON format from an online API and stores the received data in an SQLite database.

---

## Description

This practical demonstrates how an Android application can communicate with a web API to retrieve JSON data and store it locally.

The application uses `HttpURLConnection` to establish a connection with the API and performs the network operation in the background using Kotlin Coroutines. The received JSON response is converted into `Person` objects and displayed using a `RecyclerView`.

The application also uses `SQLiteOpenHelper` to save the retrieved information in a local SQLite database. This allows the stored data to remain available even when the application is offline.

The `Person` model implements `Serializable`, which allows person objects to be transferred between activities, such as passing location information to another activity.

---

## Key Concepts and Technologies

- **JSON Parsing:** Converts JSON response data into usable Kotlin objects.
- **HTTP Networking:** Uses `HttpURLConnection` to communicate with the online API.
- **Kotlin Coroutines:** Performs network operations asynchronously using `Dispatchers.IO`.
- **RecyclerView:** Displays the retrieved person information in a scrollable list.
- **SQLite Database:** Stores person records locally using `SQLiteOpenHelper`.
- **Serialization:** Allows `Person` objects to be passed between activities using `Serializable`.
- **Internet Permission:** Uses the required Internet permission to access the external API.
- **Custom Adapter:** Uses `PersonAdapter` to display person data inside the RecyclerView.

---

## Application Features

1. Fetches person information from a JSON API.
2. Parses the received JSON response.
3. Displays person records using RecyclerView.
4. Saves retrieved records into an SQLite database.
5. Allows locally stored data to be accessed from the database.
6. Supports passing person information between activities.
7. Provides location information through the application's map functionality.

---

## Screenshots

### 1. Application - Light Mode

[![Light Mode](screenshots/1.png)](screenshots/1.png)

---

### 2. Application - Dark Mode

[![Dark Mode](screenshots/2.png)](screenshots/2.png)

---

## Technologies Used

- **Language:** Kotlin
- **Platform:** Android
- **API Format:** JSON
- **Networking:** HttpURLConnection
- **Asynchronous Processing:** Kotlin Coroutines
- **UI Component:** RecyclerView
- **Database:** SQLite
- **Database Helper:** SQLiteOpenHelper
- **Data Transfer:** Serializable
- **Internet Access:** INTERNET Permission

---

## Conclusion

This practical demonstrates how an Android application can retrieve data from an online JSON API, process the response, display the information using RecyclerView, and store the data locally using SQLite.

It provides practical understanding of **API communication, JSON parsing, Kotlin Coroutines, RecyclerView, SQLite database operations, and Serializable objects** in Android development.
