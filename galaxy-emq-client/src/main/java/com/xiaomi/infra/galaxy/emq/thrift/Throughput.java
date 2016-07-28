/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emq.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-7-28")
public class Throughput implements libthrift091.TBase<Throughput, Throughput._Fields>, java.io.Serializable, Cloneable, Comparable<Throughput> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("Throughput");

  private static final libthrift091.protocol.TField READ_QPS_FIELD_DESC = new libthrift091.protocol.TField("readQps", libthrift091.protocol.TType.I64, (short)1);
  private static final libthrift091.protocol.TField WRITE_QPS_FIELD_DESC = new libthrift091.protocol.TField("writeQps", libthrift091.protocol.TType.I64, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThroughputStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThroughputTupleSchemeFactory());
  }

  /**
   * Queue read qps;
   * 
   */
  public long readQps; // optional
  /**
   * Queue write qps;
   * 
   */
  public long writeQps; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * Queue read qps;
     * 
     */
    READ_QPS((short)1, "readQps"),
    /**
     * Queue write qps;
     * 
     */
    WRITE_QPS((short)2, "writeQps");

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
        case 1: // READ_QPS
          return READ_QPS;
        case 2: // WRITE_QPS
          return WRITE_QPS;
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
  private static final int __READQPS_ISSET_ID = 0;
  private static final int __WRITEQPS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.READ_QPS,_Fields.WRITE_QPS};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.READ_QPS, new libthrift091.meta_data.FieldMetaData("readQps", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.WRITE_QPS, new libthrift091.meta_data.FieldMetaData("writeQps", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(Throughput.class, metaDataMap);
  }

  public Throughput() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Throughput(Throughput other) {
    __isset_bitfield = other.__isset_bitfield;
    this.readQps = other.readQps;
    this.writeQps = other.writeQps;
  }

  public Throughput deepCopy() {
    return new Throughput(this);
  }

  @Override
  public void clear() {
    setReadQpsIsSet(false);
    this.readQps = 0;
    setWriteQpsIsSet(false);
    this.writeQps = 0;
  }

  /**
   * Queue read qps;
   * 
   */
  public long getReadQps() {
    return this.readQps;
  }

  /**
   * Queue read qps;
   * 
   */
  public Throughput setReadQps(long readQps) {
    this.readQps = readQps;
    setReadQpsIsSet(true);
    return this;
  }

  public void unsetReadQps() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __READQPS_ISSET_ID);
  }

  /** Returns true if field readQps is set (has been assigned a value) and false otherwise */
  public boolean isSetReadQps() {
    return EncodingUtils.testBit(__isset_bitfield, __READQPS_ISSET_ID);
  }

  public void setReadQpsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __READQPS_ISSET_ID, value);
  }

  /**
   * Queue write qps;
   * 
   */
  public long getWriteQps() {
    return this.writeQps;
  }

  /**
   * Queue write qps;
   * 
   */
  public Throughput setWriteQps(long writeQps) {
    this.writeQps = writeQps;
    setWriteQpsIsSet(true);
    return this;
  }

  public void unsetWriteQps() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WRITEQPS_ISSET_ID);
  }

  /** Returns true if field writeQps is set (has been assigned a value) and false otherwise */
  public boolean isSetWriteQps() {
    return EncodingUtils.testBit(__isset_bitfield, __WRITEQPS_ISSET_ID);
  }

  public void setWriteQpsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WRITEQPS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case READ_QPS:
      if (value == null) {
        unsetReadQps();
      } else {
        setReadQps((Long)value);
      }
      break;

    case WRITE_QPS:
      if (value == null) {
        unsetWriteQps();
      } else {
        setWriteQps((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case READ_QPS:
      return Long.valueOf(getReadQps());

    case WRITE_QPS:
      return Long.valueOf(getWriteQps());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case READ_QPS:
      return isSetReadQps();
    case WRITE_QPS:
      return isSetWriteQps();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Throughput)
      return this.equals((Throughput)that);
    return false;
  }

  public boolean equals(Throughput that) {
    if (that == null)
      return false;

    boolean this_present_readQps = true && this.isSetReadQps();
    boolean that_present_readQps = true && that.isSetReadQps();
    if (this_present_readQps || that_present_readQps) {
      if (!(this_present_readQps && that_present_readQps))
        return false;
      if (this.readQps != that.readQps)
        return false;
    }

    boolean this_present_writeQps = true && this.isSetWriteQps();
    boolean that_present_writeQps = true && that.isSetWriteQps();
    if (this_present_writeQps || that_present_writeQps) {
      if (!(this_present_writeQps && that_present_writeQps))
        return false;
      if (this.writeQps != that.writeQps)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_readQps = true && (isSetReadQps());
    list.add(present_readQps);
    if (present_readQps)
      list.add(readQps);

    boolean present_writeQps = true && (isSetWriteQps());
    list.add(present_writeQps);
    if (present_writeQps)
      list.add(writeQps);

    return list.hashCode();
  }

  @Override
  public int compareTo(Throughput other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetReadQps()).compareTo(other.isSetReadQps());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReadQps()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.readQps, other.readQps);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWriteQps()).compareTo(other.isSetWriteQps());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWriteQps()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.writeQps, other.writeQps);
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
    StringBuilder sb = new StringBuilder("Throughput(");
    boolean first = true;

    if (isSetReadQps()) {
      sb.append("readQps:");
      sb.append(this.readQps);
      first = false;
    }
    if (isSetWriteQps()) {
      if (!first) sb.append(", ");
      sb.append("writeQps:");
      sb.append(this.writeQps);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ThroughputStandardSchemeFactory implements SchemeFactory {
    public ThroughputStandardScheme getScheme() {
      return new ThroughputStandardScheme();
    }
  }

  private static class ThroughputStandardScheme extends StandardScheme<Throughput> {

    public void read(libthrift091.protocol.TProtocol iprot, Throughput struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // READ_QPS
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.readQps = iprot.readI64();
              struct.setReadQpsIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WRITE_QPS
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.writeQps = iprot.readI64();
              struct.setWriteQpsIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, Throughput struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetReadQps()) {
        oprot.writeFieldBegin(READ_QPS_FIELD_DESC);
        oprot.writeI64(struct.readQps);
        oprot.writeFieldEnd();
      }
      if (struct.isSetWriteQps()) {
        oprot.writeFieldBegin(WRITE_QPS_FIELD_DESC);
        oprot.writeI64(struct.writeQps);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThroughputTupleSchemeFactory implements SchemeFactory {
    public ThroughputTupleScheme getScheme() {
      return new ThroughputTupleScheme();
    }
  }

  private static class ThroughputTupleScheme extends TupleScheme<Throughput> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, Throughput struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetReadQps()) {
        optionals.set(0);
      }
      if (struct.isSetWriteQps()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetReadQps()) {
        oprot.writeI64(struct.readQps);
      }
      if (struct.isSetWriteQps()) {
        oprot.writeI64(struct.writeQps);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, Throughput struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.readQps = iprot.readI64();
        struct.setReadQpsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.writeQps = iprot.readI64();
        struct.setWriteQpsIsSet(true);
      }
    }
  }

}

