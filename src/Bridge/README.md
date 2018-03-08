### Purpose
Defines an abstract object structure independently of the
implementation object structure in order to limit coupling.
### Use When
- Abstractions and implementations should not be bound at
compile time.
- Abstractions and implementations should be independently
extensible.
- Changes in the implementation of an abstraction should
have no impact on clients.
- Implementation details should be hidden from the client.
### Example
The Java Virtual Machine (JVM) has its own native set of functions
that abstract the use of windowing, system logging, and byte
code execution but the actual implementation of these functions
is delegated to the operating system the JVM is running on.
When an application instructs the JVM to render a window it
delegates the rendering call to the concrete implementation
of the JVM that knows how to communicate with the operating
system in order to render the window.