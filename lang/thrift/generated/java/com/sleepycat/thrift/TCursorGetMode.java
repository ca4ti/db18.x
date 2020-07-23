/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.sleepycat.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TCursorGetMode implements org.apache.thrift.TEnum {
  CURRENT(1),
  FIRST(2),
  GET_BOTH(3),
  GET_BOTH_RANGE(4),
  GET_RECNO(5),
  LAST(6),
  NEXT(7),
  NEXT_DUP(8),
  NEXT_NO_DUP(9),
  PREV(10),
  PREV_DUP(11),
  PREV_NO_DUP(12),
  SET(13),
  SET_RANGE(14),
  SET_RECNO(15);

  private final int value;

  private TCursorGetMode(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TCursorGetMode findByValue(int value) { 
    switch (value) {
      case 1:
        return CURRENT;
      case 2:
        return FIRST;
      case 3:
        return GET_BOTH;
      case 4:
        return GET_BOTH_RANGE;
      case 5:
        return GET_RECNO;
      case 6:
        return LAST;
      case 7:
        return NEXT;
      case 8:
        return NEXT_DUP;
      case 9:
        return NEXT_NO_DUP;
      case 10:
        return PREV;
      case 11:
        return PREV_DUP;
      case 12:
        return PREV_NO_DUP;
      case 13:
        return SET;
      case 14:
        return SET_RANGE;
      case 15:
        return SET_RECNO;
      default:
        return null;
    }
  }
}