// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sendmail.proto

package jp.co.neosystem.grpc;

public interface MailRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sendmail.MailRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string from = 1;</code>
   * @return The from.
   */
  java.lang.String getFrom();
  /**
   * <code>string from = 1;</code>
   * @return The bytes for from.
   */
  com.google.protobuf.ByteString
      getFromBytes();

  /**
   * <code>string to = 2;</code>
   * @return The to.
   */
  java.lang.String getTo();
  /**
   * <code>string to = 2;</code>
   * @return The bytes for to.
   */
  com.google.protobuf.ByteString
      getToBytes();

  /**
   * <code>string subject = 3;</code>
   * @return The subject.
   */
  java.lang.String getSubject();
  /**
   * <code>string subject = 3;</code>
   * @return The bytes for subject.
   */
  com.google.protobuf.ByteString
      getSubjectBytes();

  /**
   * <code>string text = 4;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <code>string text = 4;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <code>repeated bytes attach = 5;</code>
   * @return A list containing the attach.
   */
  java.util.List<com.google.protobuf.ByteString> getAttachList();
  /**
   * <code>repeated bytes attach = 5;</code>
   * @return The count of attach.
   */
  int getAttachCount();
  /**
   * <code>repeated bytes attach = 5;</code>
   * @param index The index of the element to return.
   * @return The attach at the given index.
   */
  com.google.protobuf.ByteString getAttach(int index);
}
