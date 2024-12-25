# Scala Generic Type Comparison Bug

This repository demonstrates a common error when comparing generic types in Scala using the `==` operator. The `==` operator performs reference equality comparison which means two objects are only equal if they are the same instance in memory. This behavior is not consistent with the expected logical equality.

The `bug.scala` file contains code that highlights this issue. The `bugSolution.scala` file shows how to fix the issue using the `equals` method. 

## Problem Description
When comparing generic types in Scala using `==`, it is important to understand that you are comparing object references, not the contents of the objects.  This can lead to unexpected results if the objects are different instances even if they contain the same data. 

## Solution
The correct way to compare generic types in Scala is to use the `equals` method. This method compares the content of the objects rather than their references.