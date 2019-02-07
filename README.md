# compilers-project

The grammar:
```
var is a variable name
str is a string

type ::= int | boolean | void | classname
op ::= + | - | * | /
exp ::= type var |
 str |
 this |
 println(exp) |
 exp op exp |
 exp.methodname(exp*) |
 new classname(exp*) |
vardec ::= type var
stmnt ::= vardec; |
       var = exp; |
       while(exp) stmnt |
       break; |
       { stmnt* } |
       if (exp) stmnt else stmnt |
       return exp; |
       return;
access ::= public | private
methoddef ::= access type methodname(vardec*) stmnt
instancedec ::= access vardec;
classdef ::= access class classname extends classname {
        instancedec*
        constructor(vardec*) stmt
        methoddef*
        }
program ::= classdef* exp
```
