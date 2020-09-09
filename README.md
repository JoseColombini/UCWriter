# Welcome to UCWriter

UCWriter is a tool to represent use cases. It uses concepts of MDE to improve the model quality, creating a structured format to reduce ambiguity, inconsistency, lack of conformance to a standard, unclear documentation etc. The documentation can be found in the [git wiki](https://github.com/JoseColombini/UCWriter/wiki)

This tool is a result of a research that proposes a concrete syntax to an existing abstract syntax and semantics. The representation of the behavioral requirements used by UCWriter is based on the abstract syntax and semantics of GUIMeta. The concrete syntax is inspired mainly on Cockburn works, but also looks to RUCM and UCMeta, and others. The theorical approach for this research is described on [Theoretical Approach page in this wiki](https://github.com/JoseColombini/UCWriter/wiki/Theoretical-Approach)

## Features

- Represent use cases adressed by names and a tag number
- Pre and post condition
- Main flow:
  - Steps are numbered in ascend order;
  - Steps are specialized in user steps, system steps or repeating steps;
  - Repeating steps are similar to while loops, with a condition and a flow of steps inside (it allows loops inside loops);
- Alternative Flows:
  - Reference to the step in the original flow where the alternative flow start;
  - Named with letters;
  - Steps are numbered in ascend order (but are not specialized);
  - Can end the use case or return to another step;
- Allows including another use case
- Can represent more than one use case in a single file
- Has logical operators for conditions (and, or, not)
- Steps have qualified name, what allows precise reference by Alternative flows:
  - All steps have a number such as '3'; but if this step is inside a loop named '5', its qualified name will be '5.3'. With alternative flows is the same: if the alternative flow is named 'c', the steps, for exemplo, will be named 'c.3'.

### Web Version features

- The web editor can save only one file (each file can have multiple use cases) per machine (uses HTML webstorage for local storage);
- Syntax highlight;
- Alert warning and errors.

The wiki page [How to Use](https://github.com/JoseColombini/UCWriter/wiki/How-to-use) explains how to use the features of UCWrite.

## Futures work and what you can help with


## Team

This research was made by José Colombini with the advise of Professor Fabio Levy Siqueira, both at Escola Politécnica da USP, with the support of FAPESP, Fundação de Amparo a Pesquisa do Estado de São Paulo, grant #2019/12641-7, São Paulo Research Foundation (FAPESP)

**The opinions, hypotheses and conclusions or recommendations express in this material are responsibilities of the authors and note necessarily reflect the vision of FAPESP.**
