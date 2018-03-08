### Purpose
Provide an interface that delegates creation calls to one or
more concrete classes in order to deliver specific objects.
### Use When
- The creation of objects should be independent of the system
utilizing them.
- Systems should be capable of using multiple families of objects.
- Families of objects must be used together.
- Libraries must be published without exposing implementation
details.
- Concrete classes should be decoupled from clients.
### Example
Email editors will allow for editing in multiple formats including
plain text, rich text, and HTML. Depending on the format being
used, different objects will need to be created. If the message
is plain text then there could be a body object that represented
just plain text and an attachment object that simply encrypted
the attachment into Base64. If the message is HTML then the
body object would represent HTML encoded text and the
attachment object would allow for inline representation and a
standard attachment. By utilizing an abstract factory for creation
we can then ensure that the appropriate object sets are created
based upon the style of email that is being sent.