// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

public interface IrValueParameterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.backend.common.serialization.proto.IrValueParameter)
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
   * <code>required int32 type = 4;</code>
   */
  boolean hasType();
  /**
   * <code>required int32 type = 4;</code>
   */
  int getType();

  /**
   * <code>optional int32 vararg_element_type = 5;</code>
   */
  boolean hasVarargElementType();
  /**
   * <code>optional int32 vararg_element_type = 5;</code>
   */
  int getVarargElementType();

  /**
   * <code>required bool is_crossinline = 6;</code>
   */
  boolean hasIsCrossinline();
  /**
   * <code>required bool is_crossinline = 6;</code>
   */
  boolean getIsCrossinline();

  /**
   * <code>required bool is_noinline = 7;</code>
   */
  boolean hasIsNoinline();
  /**
   * <code>required bool is_noinline = 7;</code>
   */
  boolean getIsNoinline();

  /**
   * <code>optional int32 default_value = 8;</code>
   */
  boolean hasDefaultValue();
  /**
   * <code>optional int32 default_value = 8;</code>
   */
  int getDefaultValue();
}