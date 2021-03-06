/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class btCompoundShapeData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btCompoundShapeData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btCompoundShapeData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btCompoundShapeData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_collisionShapeData(btCollisionShapeData value) {
    gdxBulletJNI.btCompoundShapeData_m_collisionShapeData_set(swigCPtr, this, btCollisionShapeData.getCPtr(value), value);
  }

  public btCollisionShapeData getM_collisionShapeData() {
    long cPtr = gdxBulletJNI.btCompoundShapeData_m_collisionShapeData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btCollisionShapeData(cPtr, false);
  }

  public void setM_childShapePtr(btCompoundShapeChildData value) {
    gdxBulletJNI.btCompoundShapeData_m_childShapePtr_set(swigCPtr, this, btCompoundShapeChildData.getCPtr(value), value);
  }

  public btCompoundShapeChildData getM_childShapePtr() {
    long cPtr = gdxBulletJNI.btCompoundShapeData_m_childShapePtr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btCompoundShapeChildData(cPtr, false);
  }

  public void setM_numChildShapes(int value) {
    gdxBulletJNI.btCompoundShapeData_m_numChildShapes_set(swigCPtr, this, value);
  }

  public int getM_numChildShapes() {
    return gdxBulletJNI.btCompoundShapeData_m_numChildShapes_get(swigCPtr, this);
  }

  public void setM_collisionMargin(float value) {
    gdxBulletJNI.btCompoundShapeData_m_collisionMargin_set(swigCPtr, this, value);
  }

  public float getM_collisionMargin() {
    return gdxBulletJNI.btCompoundShapeData_m_collisionMargin_get(swigCPtr, this);
  }

  public btCompoundShapeData() {
    this(gdxBulletJNI.new_btCompoundShapeData(), true);
  }

}
