/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-12-12")
public class GetPartitionOffsetRequest implements libthrift091.TBase<GetPartitionOffsetRequest, GetPartitionOffsetRequest._Fields>, java.io.Serializable, Cloneable, Comparable<GetPartitionOffsetRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("GetPartitionOffsetRequest");

  private static final libthrift091.protocol.TField TOPIC_AND_PARTITION_FIELD_DESC = new libthrift091.protocol.TField("topicAndPartition", libthrift091.protocol.TType.STRUCT, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetPartitionOffsetRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetPartitionOffsetRequestTupleSchemeFactory());
  }

  /**
   * The specified topicAndPartition
   * 
   */
  public com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition topicAndPartition; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The specified topicAndPartition
     * 
     */
    TOPIC_AND_PARTITION((short)1, "topicAndPartition");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TOPIC_AND_PARTITION
          return TOPIC_AND_PARTITION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOPIC_AND_PARTITION, new libthrift091.meta_data.FieldMetaData("topicAndPartition", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(GetPartitionOffsetRequest.class, metaDataMap);
  }

  public GetPartitionOffsetRequest() {
  }

  public GetPartitionOffsetRequest(
    com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition topicAndPartition)
  {
    this();
    this.topicAndPartition = topicAndPartition;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetPartitionOffsetRequest(GetPartitionOffsetRequest other) {
    if (other.isSetTopicAndPartition()) {
      this.topicAndPartition = new com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition(other.topicAndPartition);
    }
  }

  public GetPartitionOffsetRequest deepCopy() {
    return new GetPartitionOffsetRequest(this);
  }

  @Override
  public void clear() {
    this.topicAndPartition = null;
  }

  /**
   * The specified topicAndPartition
   * 
   */
  public com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition getTopicAndPartition() {
    return this.topicAndPartition;
  }

  /**
   * The specified topicAndPartition
   * 
   */
  public GetPartitionOffsetRequest setTopicAndPartition(com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition topicAndPartition) {
    this.topicAndPartition = topicAndPartition;
    return this;
  }

  public void unsetTopicAndPartition() {
    this.topicAndPartition = null;
  }

  /** Returns true if field topicAndPartition is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicAndPartition() {
    return this.topicAndPartition != null;
  }

  public void setTopicAndPartitionIsSet(boolean value) {
    if (!value) {
      this.topicAndPartition = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPIC_AND_PARTITION:
      if (value == null) {
        unsetTopicAndPartition();
      } else {
        setTopicAndPartition((com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPIC_AND_PARTITION:
      return getTopicAndPartition();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPIC_AND_PARTITION:
      return isSetTopicAndPartition();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetPartitionOffsetRequest)
      return this.equals((GetPartitionOffsetRequest)that);
    return false;
  }

  public boolean equals(GetPartitionOffsetRequest that) {
    if (that == null)
      return false;

    boolean this_present_topicAndPartition = true && this.isSetTopicAndPartition();
    boolean that_present_topicAndPartition = true && that.isSetTopicAndPartition();
    if (this_present_topicAndPartition || that_present_topicAndPartition) {
      if (!(this_present_topicAndPartition && that_present_topicAndPartition))
        return false;
      if (!this.topicAndPartition.equals(that.topicAndPartition))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_topicAndPartition = true && (isSetTopicAndPartition());
    list.add(present_topicAndPartition);
    if (present_topicAndPartition)
      list.add(topicAndPartition);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetPartitionOffsetRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTopicAndPartition()).compareTo(other.isSetTopicAndPartition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicAndPartition()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicAndPartition, other.topicAndPartition);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GetPartitionOffsetRequest(");
    boolean first = true;

    sb.append("topicAndPartition:");
    if (this.topicAndPartition == null) {
      sb.append("null");
    } else {
      sb.append(this.topicAndPartition);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (topicAndPartition == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicAndPartition' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (topicAndPartition != null) {
      topicAndPartition.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetPartitionOffsetRequestStandardSchemeFactory implements SchemeFactory {
    public GetPartitionOffsetRequestStandardScheme getScheme() {
      return new GetPartitionOffsetRequestStandardScheme();
    }
  }

  private static class GetPartitionOffsetRequestStandardScheme extends StandardScheme<GetPartitionOffsetRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, GetPartitionOffsetRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPIC_AND_PARTITION
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.topicAndPartition = new com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition();
              struct.topicAndPartition.read(iprot);
              struct.setTopicAndPartitionIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, GetPartitionOffsetRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topicAndPartition != null) {
        oprot.writeFieldBegin(TOPIC_AND_PARTITION_FIELD_DESC);
        struct.topicAndPartition.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetPartitionOffsetRequestTupleSchemeFactory implements SchemeFactory {
    public GetPartitionOffsetRequestTupleScheme getScheme() {
      return new GetPartitionOffsetRequestTupleScheme();
    }
  }

  private static class GetPartitionOffsetRequestTupleScheme extends TupleScheme<GetPartitionOffsetRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, GetPartitionOffsetRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.topicAndPartition.write(oprot);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, GetPartitionOffsetRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topicAndPartition = new com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition();
      struct.topicAndPartition.read(iprot);
      struct.setTopicAndPartitionIsSet(true);
    }
  }

}

