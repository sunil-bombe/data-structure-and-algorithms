package com.webwork.interview.geeks.lamdba.functionalInterfaces;

@FunctionalInterface
public interface BiFunctional <A, B, C>{
public C apply(A a, B b);
}
