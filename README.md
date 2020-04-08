# UseCase-concrete-syntax

This language is a result of research project supported by *FAPESP*
grant #aaaa/nnnnn-d, São Paulo Research Foundation (FAPESP)

This is a language for use case representation. The idea is to make you life easy with it.

This concrete syntax is based on some other proposes, mainly Cockburn. The metamodel that guide this language is the GUIMeta, which is also based on Cockburn.

*I should put an image of metamodel here*


  ## How to Use
   - Git clone this repository
   - Open with Eclipse and Execute it with Eclipse plugin
   - Create a file with usecase Extension

   - **ASAP** I will figure out how to use it in a more simple way

# Features Version 0.1

   - Its capable to represent a use case with a Name **with several words**.
   - A main flow with any number of steps (*bug* steps can have same number).
   - Steps are made of a number and a sentence. They can be specialized in 'User' or 'System' Steps.
   - Steps are in one indentation level at Main flow.
   - Sentences are a sequence of words (*bug* simple quotation marks or apostrophe I do not know what is causing bugs);

  ## Bugs
     - In Sentences and Use case name: User and System cause problem, but user and system don't (capital letters only), symbol ', " are causing problems too
     - Steps can have the same number

# Example
