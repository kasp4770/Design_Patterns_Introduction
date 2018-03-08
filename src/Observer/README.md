### Purpose
Lets one or more objects be notified of state changes in other
objects within the system.
### Use When
- State changes in one or more objects should trigger behavior
in other objects
- Broadcasting capabilities are required.
- An understanding exists that objects will be blind to the
expense of notification.
### Example
This pattern can be found in almost every GUI environment.
When buttons, text, and other fields are placed in applications
the application typically registers as a listener for those controls.
When a user triggers an event, such as clicking a button, the
control iterates through its registered observers and sends a
notification to each.