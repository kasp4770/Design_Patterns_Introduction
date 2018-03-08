### Purpose
Facilitates the reuse of many fine grained objects, making the
utilization of large numbers of objects more efficient.
### Use When
- Many like objects are used and storage cost is high.
- The majority of each object’s state can be made extrinsic.
- A few shared objects can replace many unshared ones.
- The identity of each object does not matter.
### Example
Systems that allow users to define their own application flows
and layouts often have a need to keep track of large numbers of
fields, pages, and other items that are almost identical to each
other. By making these items into flyweights all instances of each
object can share the intrinsic state while keeping the extrinsic
state separate. The intrinsic state would store the shared properties,
such as how a textbox looks, how much data it can hold, and
what events it exposes. The extrinsic state would store the
unshared properties, such as where the item belongs, how to
react to a user click, and how to handle events.