### Purpose
Defines a representation for a grammar as well as a mechanism
to understand and act upon the grammar.
### Use When
- There is grammar to interpret that can be represented as
large syntax trees.
- The grammar is simple.
- Efficiency is not important.
- Decoupling grammar from underlying expressions is desired.
### Example
Text based adventures, wildly popular in the 1980’s, provide
a good example of this. Many had simple commands, such
as “step down” that allowed traversal of the game. These
commands could be nested such that it altered their meaning.
For example, “go in” would result in a different outcome than
“go up”. By creating a hierarchy of commands based upon
the command and the qualifier (non-terminal and terminal
expressions) the application could easily map many command
variations to a relating tree of actions. //