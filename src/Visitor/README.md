### Purpose
Allows for one or more operations to be applied to a set of objects
at runtime, decoupling the operations from the object structure.
### Use When
- An object structure must have many unrelated operations
performed upon it.
- The object structure can’t change but operations performed
on it can.
- Operations must be performed on the concrete classes of an
object structure.
- Exposing internal state or operations of the object structure
is acceptable.
- Operations should be able to operate on multiple object
structures that implement the same interface sets.
### Example
Calculating taxes in different regions on sets of invoices would
require many different variations of calculation logic. Implementing
a visitor allows the logic to be decoupled from the invoices and
line items. This allows the hierarchy of items to be visited by calculation
code that can then apply the proper rates for the region.
Changing regions is as simple as substituting a different visitor.