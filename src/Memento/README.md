### Purpose
Allows for capturing and externalizing an object’s internal
state so that it can be restored later, all without violating
encapsulation.
### Use When
- The internal state of an object must be saved and restored
at a later time.
- Internal state cannot be exposed by interfaces without exposing
implementation.
- Encapsulation boundaries must be preserved.
### Example
Undo functionality can nicely be implemented using the
memento pattern. By serializing and deserializing the state of
an object before the change occurs we can preserve a snapshot
of it that can later be restored should the user choose to undo
the operation.