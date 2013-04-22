/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkHtmlToText {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CkHtmlToText(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CkHtmlToText obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkHtmlToText(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkHtmlToText() {
    this(chilkatJNI.new_CkHtmlToText(), true);
  }

  public boolean IsUnlocked() {
    return chilkatJNI.CkHtmlToText_IsUnlocked(swigCPtr, this);
  }

  public boolean ToText(String html, CkString outStr) {
    return chilkatJNI.CkHtmlToText_ToText(swigCPtr, this, html, CkString.getCPtr(outStr), outStr);
  }

  public String toText(String html) {
    return chilkatJNI.CkHtmlToText_toText(swigCPtr, this, html);
  }

  public boolean UnlockComponent(String code) {
    return chilkatJNI.CkHtmlToText_UnlockComponent(swigCPtr, this, code);
  }

  public boolean WriteStringToFile(String str, String filename, String charset) {
    return chilkatJNI.CkHtmlToText_WriteStringToFile(swigCPtr, this, str, filename, charset);
  }

  public boolean ReadFileToString(String filename, String srcCharset, CkString outStr) {
    return chilkatJNI.CkHtmlToText_ReadFileToString(swigCPtr, this, filename, srcCharset, CkString.getCPtr(outStr), outStr);
  }

  public String readFileToString(String filename, String srcCharset) {
    return chilkatJNI.CkHtmlToText_readFileToString(swigCPtr, this, filename, srcCharset);
  }

  public int get_RightMargin() {
    return chilkatJNI.CkHtmlToText_get_RightMargin(swigCPtr, this);
  }

  public void put_RightMargin(int newVal) {
    chilkatJNI.CkHtmlToText_put_RightMargin(swigCPtr, this, newVal);
  }

  public boolean get_SuppressLinks() {
    return chilkatJNI.CkHtmlToText_get_SuppressLinks(swigCPtr, this);
  }

  public void put_SuppressLinks(boolean newVal) {
    chilkatJNI.CkHtmlToText_put_SuppressLinks(swigCPtr, this, newVal);
  }

  public boolean get_DecodeHtmlEntities() {
    return chilkatJNI.CkHtmlToText_get_DecodeHtmlEntities(swigCPtr, this);
  }

  public void put_DecodeHtmlEntities(boolean newVal) {
    chilkatJNI.CkHtmlToText_put_DecodeHtmlEntities(swigCPtr, this, newVal);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkHtmlToText_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkHtmlToText_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkHtmlToText_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkHtmlToText_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkHtmlToText_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public boolean SaveLastError(String filename) {
    return chilkatJNI.CkHtmlToText_SaveLastError(swigCPtr, this, filename);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkHtmlToText_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkHtmlToText_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkHtmlToText_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkHtmlToText_lastErrorText(swigCPtr, this);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkHtmlToText_lastErrorXml(swigCPtr, this);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkHtmlToText_lastErrorHtml(swigCPtr, this);
  }

}