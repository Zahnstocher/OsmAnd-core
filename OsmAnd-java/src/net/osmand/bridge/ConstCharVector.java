/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.osmand.bridge;

public class ConstCharVector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ConstCharVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ConstCharVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CoreOsmAndJNI.delete_ConstCharVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ConstCharVector() {
    this(CoreOsmAndJNI.new_ConstCharVector__SWIG_0(), true);
  }

  public ConstCharVector(long n) {
    this(CoreOsmAndJNI.new_ConstCharVector__SWIG_1(n), true);
  }

  public long size() {
    return CoreOsmAndJNI.ConstCharVector_size(swigCPtr, this);
  }

  public long capacity() {
    return CoreOsmAndJNI.ConstCharVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    CoreOsmAndJNI.ConstCharVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return CoreOsmAndJNI.ConstCharVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    CoreOsmAndJNI.ConstCharVector_clear(swigCPtr, this);
  }

  public void add(String x) {
    CoreOsmAndJNI.ConstCharVector_add(swigCPtr, this, x);
  }

  public String get(int i) {
    return CoreOsmAndJNI.ConstCharVector_get(swigCPtr, this, i);
  }

  public void set(int i, String val) {
    CoreOsmAndJNI.ConstCharVector_set(swigCPtr, this, i, val);
  }

}
