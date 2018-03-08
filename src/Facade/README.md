### Purpose
Supplies a single interface to a set of interfaces within a system.
### Use When
- A simple interface is needed to provide access to a complex
system.
- There are many dependencies between system implementations
and clients.
- Systems and subsystems should be layered.
### Example
By exposing a set of functionalities through a web service
the client code needs to only worry about the simple interface
being exposed to them and not the complex relationships that
may or may not exist behind the web service layer. A single
web service call to update a system with new data may actually
involve communication with a number of databases and systems,
however this detail is hidden due to the implementation of the
facade pattern.