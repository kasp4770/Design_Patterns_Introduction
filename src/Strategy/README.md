### Purpose
Defines a set of encapsulated algorithms that can be swapped
to carry out a specific behavior.
### Use When
- The only difference between many related classes is their
behavior.
- Multiple versions or variations of an algorithm are required.
- Algorithms access or utilize data that calling code shouldn’t
be exposed to.
- The behavior of a class should be defined at runtime.
- Conditional statements are complex and hard to maintain.
### Example
When importing data into a new system different validation
algorithms may be run based on the data set. By configuring the
import to utilize strategies the conditional logic to determine
what validation set to run can be removed and the import can be
decoupled from the actual validation code. This will allow us to
dynamically call one or more strategies during the import.