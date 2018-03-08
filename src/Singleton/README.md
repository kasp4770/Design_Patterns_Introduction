### Purpose
Ensures that only one instance of a class is allowed within a system.
### Use When
 - Exactly one instance of a class is required.
 - Controlled access to a single object is necessary.
 
### Example
Most languages provide some sort of system or environment
object that allows the language to interact with the native operat-
ing system. Since the application is physically running on only one
operating system there is only ever a need for a single instance of
this system object. The singleton pattern would be implemented
by the language runtime to ensure that only a single copy of the
system object is created and to ensure only appropriate processes
are allowed access to it.