package com.gxitsky.creational.prototype;

public interface IMail extends Cloneable {

    Object clone() throws CloneNotSupportedException;
}
