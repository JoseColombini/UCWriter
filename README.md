# Welcome to UCWriter

UCWriter is a framework to represent use cases , it uses the concepts of MDE to improve the model quality, creating a structured format to reduce ambiguity, inconsistency, not in conformance to a standard, unclear documentation etc. All the documentation can be found in the [git wiki](https://github.com/JoseColombini/UCWriter/wiki)

It is a result of a research to propose a concrete syntax to an abstract syntax and semantics that exist. The bases of UCWriter to represent the behavioral requirements are the abstract syntax and semantics of GUIMeta, the concrete syntax are inspired mainly on Cockburn works, but also looks to RUCM and UCMeta, and others. The theorical approach for this research is avaliable on [Theoretical Approach page in this wiki](/wiki/Theoretical-Approach)

## Features

- Represent use cases adressed by names and a tag number
- Pre and post condition
- Main flow:
  - Steps are numbered in ascend order;
  - Steps are specialized in user steps, system steps or repeating steps
  - Repeating steps are similar to while loops, with a condition and a flow of steps inside (it allows loops inside loops);
- Alternative Flows:
  - Point to steps that start from;
  - Named with letters;
  - steps are numbered in ascend order (but are not specialized);
  - Can end the use case or return to another step;
- Can include another use case
- Can represent more than one use case in a single file
- Has logical operators for conditions (and, or, not)
- All steps inherit what they are inside as part of its qualified name:
  - All steps has a number as a name like '3', but if this step is inside a loop named '5', our step a qualified name '5.3'. With extension is the same, our extension is named 'c', so the steps will be like 'c.3'.

### Web Version features

- The web editor can save only one file (each file can have multiple use cases) per machine (use webstorage for local storage, unfortunately free servers are very limited in space to storage the use cases in then);
- Syntax highlight
- Warning and errors alert

To know how to enjoy with features of UCWrite accesses the wiki page [How to Use](/wiki/How-to-use) 

## Futures work and what you can help with


## Team

This research was made by José Colombini with the advise of Professor Fabio Levy Siqueira, both at Escola Politécnica da USP, with the support of FAPESP, Fundação de Amparo a Pesquisa do Estado de São Paulo, grant #2019/12641-7, São Paulo Research Foundation (FAPESP)

**The opinions, hypotheses and conclusions or recommendations express in this material are responsibilities of the authors and note necessarily reflect the vision of FAPESP.**
