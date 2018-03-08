### Purpose
Allows for the dynamic creation of objects based upon easily
interchangeable algorithms.
### Use When
- Object creation algorithms should be decoupled from the system.
- Multiple representations of creation algorithms are required.
- The addition of new creation functionality without changing
the core code is necessary.
- Runtime control over the creation process is required.
### Example
A file transfer application could possibly use many different
protocols to send files and the actual transfer object that will be
created will be directly dependent on the chosen protocol. Using
a builder we can determine the right builder to use to instantiate
the right object. If the setting is FTP then the FTP builder would
be used when creating the object.