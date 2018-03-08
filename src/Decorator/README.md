### Purpose
Allows for the dynamic wrapping of objects in order to modify
their existing responsibilities and behaviors.
### Use When
- Object responsibilities and behaviors should be dynamically
modifiable.
- Concrete implementations should be decoupled from
responsibilities and behaviors.
- Subclassing to achieve modification is impractical or impossible.
- Specific functionality should not reside high in the object hierarchy.
- A lot of little objects surrounding a concrete implementation is
acceptable.
### Example
Many businesses set up their mail systems to take advantage of
decorators. When messages are sent from someone in the company
to an external address the mail server decorates the original
message with copyright and confidentiality information. As long
as the message remains internal the information is not attached.
This decoration allows the message itself to remain unchanged
until a runtime decision is made to wrap the message with
additional information.