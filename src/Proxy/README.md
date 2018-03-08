### Purpose
Allows for object level access control by acting as a pass through
entity or a placeholder object.
### Use When
- The object being represented is external to the system.
- Objects need to be created on demand.
- Access control for the original object is required.
- Added functionality is required when an object is accessed.
### Example
Ledger applications often provide a way for users to reconcile
their bank statements with their ledger data on demand, automating
much of the process. The actual operation of communicating
with a third party is a relatively expensive operation that should be
limited. By using a proxy to represent the communications object
we can limit the number of times or the intervals the communication
is invoked. In addition, we can wrap the complex instantiation
of the communication object inside the proxy class, decoupling
calling code from the implementation details.