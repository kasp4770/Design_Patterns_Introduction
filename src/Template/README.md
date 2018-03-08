### Purpose
Identifies the framework of an algorithm, allowing implementing
classes to define the actual behavior.
### Use When
- A single abstract implementation of an algorithm is needed.
- Common behavior among subclasses should be localized to a
common class.
- Parent classes should be able to uniformly invoke behavior in
their subclasses.
- Most or all subclasses need to implement the behavior.
### Example
A parent class, InstantMessage, will likely have all the methods
required to handle sending a message. However, the actual
serialization of the data to send may vary depending on the
implementation. A video message and a plain text message
will require different algorithms in order to serialize the data
correctly. Subclasses of InstantMessage can provide their
own implementation of the serialization method, allowing the
parent class to work with them without understanding their
implementation details.