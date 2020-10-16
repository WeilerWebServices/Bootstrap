// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

public interface IrTypeParameterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameter)
    org.jetbrains.kotlin.protobuf.MessageLiteOrBuilder {

  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase base = 1;</code>
   */
  boolean hasBase();
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase base = 1;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase getBase();

  /**
   * <code>required int32 name = 2;</code>
   */
  boolean hasName();
  /**
   * <code>required int32 name = 2;</code>
   */
  int getName();

  /**
   * <code>required int32 index = 3;</code>
   */
  boolean hasIndex();
  /**
   * <code>required int32 index = 3;</code>
   */
  int getIndex();

  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeVariance variance = 4;</code>
   */
  boolean hasVariance();
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeVariance variance = 4;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeVariance getVariance();

  /**
   * <code>repeated int32 super_type = 5;</code>
   */
  java.util.List<java.lang.Integer> getSuperTypeList();
  /**
   * <code>repeated int32 super_type = 5;</code>
   */
  int getSuperTypeCount();
  /**
   * <code>repeated int32 super_type = 5;</code>
   */
  int getSuperType(int index);

  /**
   * <code>required bool is_reified = 6;</code>
   */
  boolean hasIsReified();
  /**
   * <code>required bool is_reified = 6;</code>
   */
  boolean getIsReified();
}