# UseCase-concrete-syntax

This language is a result of research project supported by *FAPESP*

This is a language for use case representation. The idea is to make you life easy with it.

This concrete syntax is based on some other proposes, mainly Cockburn. The metamodel that guide this language is the GUIMeta, which is also based on Cockburn.

*I should put an image of metamodel here*


  ## How to Use
   - Git clone this repository
   - Open with Eclipse IDE with Xtext
   - Open "useCase.xtext.useCaseDsl/src/useCase/xtext/useCaseDsl" then you will find 'UseCaseDsl.xtext' file
   - Open this file and execute it as 'Generated Xtext artifact'
   - execute the project folder 'useCaseDsl.xtext.useCaseDsl' as Eclipse plugin
   - Create a file with '.usecase' Extension
   - Enjoy it

   - **ASAP** I will figure out how to use it in a more simple way

# Features Version 0.3

   - Its capable to represent a use case with a Name **with several words**.
   - A main flow with any number of steps (*bug* steps can have same number).
   - Steps are made of a number and a sentence. They can be specialized in *User*, *System* or *Repeating* Steps (the last one still under developing).
   - Steps are in one indentation level at Main flow.
   - Sentences are a sequence of words (*bug* simple quotation marks or apostrophe I do not know what is causing bugs);
   - Alternatives flows are now available. They contain Extensions and each extension has a several number of Extension Steps
   - Extension are in one identation level of use case, and its steps are in two identation level of use case (one when compare to Extension)

  ## Reserved words
   - All reserved words has all letters **UPPERCASE**. This was design to avoid capturing common words as reserved ones.
   - The reserved words are:
     - USER
     - SYSTEM
     - WHILE
     - IF
     - UC
     - END
     - AND
     - OR
     - MAINFLOW
     - ALTERNATIVEFLOW
     - RETURN
     - TO
     - PRECONDITION
     - POSTCONDITION






  ## Bugs
     - Symbol ', " are causing problems everywhere
     - Steps can have the same number
     - attribute name do not recognize Number as a valid name, it demand an ID
     - No cross reference is made for now, because of this the references for *Extensions* (*resumeAt*, *startFrom*) are just INT declaration
# Example
