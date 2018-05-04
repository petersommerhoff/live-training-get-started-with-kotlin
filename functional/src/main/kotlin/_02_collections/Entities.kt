package _02_collections

import java.time.Instant

data class User(val username: String, val age: Int, val paid: Boolean)

data class Employee(val name: String, val yearlySalary: Int)

data class LogEntry(val time: Instant, val text: String)