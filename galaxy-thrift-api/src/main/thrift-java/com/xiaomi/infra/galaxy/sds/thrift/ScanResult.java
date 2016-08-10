/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-8-10")
public class ScanResult implements libthrift091.TBase<ScanResult, ScanResult._Fields>, java.io.Serializable, Cloneable, Comparable<ScanResult> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("ScanResult");

  private static final libthrift091.protocol.TField NEXT_START_KEY_FIELD_DESC = new libthrift091.protocol.TField("nextStartKey", libthrift091.protocol.TType.MAP, (short)1);
  private static final libthrift091.protocol.TField RECORDS_FIELD_DESC = new libthrift091.protocol.TField("records", libthrift091.protocol.TType.LIST, (short)2);
  private static final libthrift091.protocol.TField THROTTLED_FIELD_DESC = new libthrift091.protocol.TField("throttled", libthrift091.protocol.TType.BOOL, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ScanResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ScanResultTupleSchemeFactory());
  }

  /**
   * 下一个需要扫描的记录主键，NULL表示达到制定的结束位置
   */
  public Map<String,Datum> nextStartKey; // optional
  /**
   * 扫描的记录
   */
  public List<Map<String,Datum>> records; // optional
  /**
   * 是否超过表的qps quota
   */
  public boolean throttled; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 下一个需要扫描的记录主键，NULL表示达到制定的结束位置
     */
    NEXT_START_KEY((short)1, "nextStartKey"),
    /**
     * 扫描的记录
     */
    RECORDS((short)2, "records"),
    /**
     * 是否超过表的qps quota
     */
    THROTTLED((short)3, "throttled");

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
        case 1: // NEXT_START_KEY
          return NEXT_START_KEY;
        case 2: // RECORDS
          return RECORDS;
        case 3: // THROTTLED
          return THROTTLED;
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
  private static final int __THROTTLED_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.NEXT_START_KEY,_Fields.RECORDS,_Fields.THROTTLED};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NEXT_START_KEY, new libthrift091.meta_data.FieldMetaData("nextStartKey", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.MAP        , "Dictionary")));
    tmpMap.put(_Fields.RECORDS, new libthrift091.meta_data.FieldMetaData("records", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.MAP            , "Dictionary"))));
    tmpMap.put(_Fields.THROTTLED, new libthrift091.meta_data.FieldMetaData("throttled", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(ScanResult.class, metaDataMap);
  }

  public ScanResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ScanResult(ScanResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetNextStartKey()) {
      this.nextStartKey = other.nextStartKey;
    }
    if (other.isSetRecords()) {
      List<Map<String,Datum>> __this__records = new ArrayList<Map<String,Datum>>(other.records.size());
      for (Map<String,Datum> other_element : other.records) {
        __this__records.add(other_element);
      }
      this.records = __this__records;
    }
    this.throttled = other.throttled;
  }

  public ScanResult deepCopy() {
    return new ScanResult(this);
  }

  @Override
  public void clear() {
    this.nextStartKey = null;
    this.records = null;
    setThrottledIsSet(false);
    this.throttled = false;
  }

  public int getNextStartKeySize() {
    return (this.nextStartKey == null) ? 0 : this.nextStartKey.size();
  }

  public void putToNextStartKey(String key, Datum val) {
    if (this.nextStartKey == null) {
      this.nextStartKey = new HashMap<String,Datum>();
    }
    this.nextStartKey.put(key, val);
  }

  /**
   * 下一个需要扫描的记录主键，NULL表示达到制定的结束位置
   */
  public Map<String,Datum> getNextStartKey() {
    return this.nextStartKey;
  }

  /**
   * 下一个需要扫描的记录主键，NULL表示达到制定的结束位置
   */
  public ScanResult setNextStartKey(Map<String,Datum> nextStartKey) {
    this.nextStartKey = nextStartKey;
    return this;
  }

  public void unsetNextStartKey() {
    this.nextStartKey = null;
  }

  /** Returns true if field nextStartKey is set (has been assigned a value) and false otherwise */
  public boolean isSetNextStartKey() {
    return this.nextStartKey != null;
  }

  public void setNextStartKeyIsSet(boolean value) {
    if (!value) {
      this.nextStartKey = null;
    }
  }

  public int getRecordsSize() {
    return (this.records == null) ? 0 : this.records.size();
  }

  public java.util.Iterator<Map<String,Datum>> getRecordsIterator() {
    return (this.records == null) ? null : this.records.iterator();
  }

  public void addToRecords(Map<String,Datum> elem) {
    if (this.records == null) {
      this.records = new ArrayList<Map<String,Datum>>();
    }
    this.records.add(elem);
  }

  /**
   * 扫描的记录
   */
  public List<Map<String,Datum>> getRecords() {
    return this.records;
  }

  /**
   * 扫描的记录
   */
  public ScanResult setRecords(List<Map<String,Datum>> records) {
    this.records = records;
    return this;
  }

  public void unsetRecords() {
    this.records = null;
  }

  /** Returns true if field records is set (has been assigned a value) and false otherwise */
  public boolean isSetRecords() {
    return this.records != null;
  }

  public void setRecordsIsSet(boolean value) {
    if (!value) {
      this.records = null;
    }
  }

  /**
   * 是否超过表的qps quota
   */
  public boolean isThrottled() {
    return this.throttled;
  }

  /**
   * 是否超过表的qps quota
   */
  public ScanResult setThrottled(boolean throttled) {
    this.throttled = throttled;
    setThrottledIsSet(true);
    return this;
  }

  public void unsetThrottled() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __THROTTLED_ISSET_ID);
  }

  /** Returns true if field throttled is set (has been assigned a value) and false otherwise */
  public boolean isSetThrottled() {
    return EncodingUtils.testBit(__isset_bitfield, __THROTTLED_ISSET_ID);
  }

  public void setThrottledIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __THROTTLED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NEXT_START_KEY:
      if (value == null) {
        unsetNextStartKey();
      } else {
        setNextStartKey((Map<String,Datum>)value);
      }
      break;

    case RECORDS:
      if (value == null) {
        unsetRecords();
      } else {
        setRecords((List<Map<String,Datum>>)value);
      }
      break;

    case THROTTLED:
      if (value == null) {
        unsetThrottled();
      } else {
        setThrottled((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NEXT_START_KEY:
      return getNextStartKey();

    case RECORDS:
      return getRecords();

    case THROTTLED:
      return Boolean.valueOf(isThrottled());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NEXT_START_KEY:
      return isSetNextStartKey();
    case RECORDS:
      return isSetRecords();
    case THROTTLED:
      return isSetThrottled();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ScanResult)
      return this.equals((ScanResult)that);
    return false;
  }

  public boolean equals(ScanResult that) {
    if (that == null)
      return false;

    boolean this_present_nextStartKey = true && this.isSetNextStartKey();
    boolean that_present_nextStartKey = true && that.isSetNextStartKey();
    if (this_present_nextStartKey || that_present_nextStartKey) {
      if (!(this_present_nextStartKey && that_present_nextStartKey))
        return false;
      if (!this.nextStartKey.equals(that.nextStartKey))
        return false;
    }

    boolean this_present_records = true && this.isSetRecords();
    boolean that_present_records = true && that.isSetRecords();
    if (this_present_records || that_present_records) {
      if (!(this_present_records && that_present_records))
        return false;
      if (!this.records.equals(that.records))
        return false;
    }

    boolean this_present_throttled = true && this.isSetThrottled();
    boolean that_present_throttled = true && that.isSetThrottled();
    if (this_present_throttled || that_present_throttled) {
      if (!(this_present_throttled && that_present_throttled))
        return false;
      if (this.throttled != that.throttled)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_nextStartKey = true && (isSetNextStartKey());
    list.add(present_nextStartKey);
    if (present_nextStartKey)
      list.add(nextStartKey);

    boolean present_records = true && (isSetRecords());
    list.add(present_records);
    if (present_records)
      list.add(records);

    boolean present_throttled = true && (isSetThrottled());
    list.add(present_throttled);
    if (present_throttled)
      list.add(throttled);

    return list.hashCode();
  }

  @Override
  public int compareTo(ScanResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNextStartKey()).compareTo(other.isSetNextStartKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNextStartKey()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.nextStartKey, other.nextStartKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRecords()).compareTo(other.isSetRecords());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecords()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.records, other.records);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetThrottled()).compareTo(other.isSetThrottled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThrottled()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.throttled, other.throttled);
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
    StringBuilder sb = new StringBuilder("ScanResult(");
    boolean first = true;

    if (isSetNextStartKey()) {
      sb.append("nextStartKey:");
      if (this.nextStartKey == null) {
        sb.append("null");
      } else {
        sb.append(this.nextStartKey);
      }
      first = false;
    }
    if (isSetRecords()) {
      if (!first) sb.append(", ");
      sb.append("records:");
      if (this.records == null) {
        sb.append("null");
      } else {
        sb.append(this.records);
      }
      first = false;
    }
    if (isSetThrottled()) {
      if (!first) sb.append(", ");
      sb.append("throttled:");
      sb.append(this.throttled);
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

  private static class ScanResultStandardSchemeFactory implements SchemeFactory {
    public ScanResultStandardScheme getScheme() {
      return new ScanResultStandardScheme();
    }
  }

  private static class ScanResultStandardScheme extends StandardScheme<ScanResult> {

    public void read(libthrift091.protocol.TProtocol iprot, ScanResult struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NEXT_START_KEY
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map330 = iprot.readMapBegin();
                struct.nextStartKey = new HashMap<String,Datum>(2*_map330.size);
                String _key331;
                Datum _val332;
                for (int _i333 = 0; _i333 < _map330.size; ++_i333)
                {
                  _key331 = iprot.readString();
                  _val332 = new Datum();
                  _val332.read(iprot);
                  struct.nextStartKey.put(_key331, _val332);
                }
                iprot.readMapEnd();
              }
              struct.setNextStartKeyIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RECORDS
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list334 = iprot.readListBegin();
                struct.records = new ArrayList<Map<String,Datum>>(_list334.size);
                Map<String,Datum> _elem335;
                for (int _i336 = 0; _i336 < _list334.size; ++_i336)
                {
                  {
                    libthrift091.protocol.TMap _map337 = iprot.readMapBegin();
                    _elem335 = new HashMap<String,Datum>(2*_map337.size);
                    String _key338;
                    Datum _val339;
                    for (int _i340 = 0; _i340 < _map337.size; ++_i340)
                    {
                      _key338 = iprot.readString();
                      _val339 = new Datum();
                      _val339.read(iprot);
                      _elem335.put(_key338, _val339);
                    }
                    iprot.readMapEnd();
                  }
                  struct.records.add(_elem335);
                }
                iprot.readListEnd();
              }
              struct.setRecordsIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // THROTTLED
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.throttled = iprot.readBool();
              struct.setThrottledIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, ScanResult struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nextStartKey != null) {
        if (struct.isSetNextStartKey()) {
          oprot.writeFieldBegin(NEXT_START_KEY_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, struct.nextStartKey.size()));
            for (Map.Entry<String, Datum> _iter341 : struct.nextStartKey.entrySet())
            {
              oprot.writeString(_iter341.getKey());
              _iter341.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.records != null) {
        if (struct.isSetRecords()) {
          oprot.writeFieldBegin(RECORDS_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.MAP, struct.records.size()));
            for (Map<String,Datum> _iter342 : struct.records)
            {
              {
                oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, _iter342.size()));
                for (Map.Entry<String, Datum> _iter343 : _iter342.entrySet())
                {
                  oprot.writeString(_iter343.getKey());
                  _iter343.getValue().write(oprot);
                }
                oprot.writeMapEnd();
              }
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetThrottled()) {
        oprot.writeFieldBegin(THROTTLED_FIELD_DESC);
        oprot.writeBool(struct.throttled);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ScanResultTupleSchemeFactory implements SchemeFactory {
    public ScanResultTupleScheme getScheme() {
      return new ScanResultTupleScheme();
    }
  }

  private static class ScanResultTupleScheme extends TupleScheme<ScanResult> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, ScanResult struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNextStartKey()) {
        optionals.set(0);
      }
      if (struct.isSetRecords()) {
        optionals.set(1);
      }
      if (struct.isSetThrottled()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetNextStartKey()) {
        {
          oprot.writeI32(struct.nextStartKey.size());
          for (Map.Entry<String, Datum> _iter344 : struct.nextStartKey.entrySet())
          {
            oprot.writeString(_iter344.getKey());
            _iter344.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetRecords()) {
        {
          oprot.writeI32(struct.records.size());
          for (Map<String,Datum> _iter345 : struct.records)
          {
            {
              oprot.writeI32(_iter345.size());
              for (Map.Entry<String, Datum> _iter346 : _iter345.entrySet())
              {
                oprot.writeString(_iter346.getKey());
                _iter346.getValue().write(oprot);
              }
            }
          }
        }
      }
      if (struct.isSetThrottled()) {
        oprot.writeBool(struct.throttled);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, ScanResult struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TMap _map347 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.nextStartKey = new HashMap<String,Datum>(2*_map347.size);
          String _key348;
          Datum _val349;
          for (int _i350 = 0; _i350 < _map347.size; ++_i350)
          {
            _key348 = iprot.readString();
            _val349 = new Datum();
            _val349.read(iprot);
            struct.nextStartKey.put(_key348, _val349);
          }
        }
        struct.setNextStartKeyIsSet(true);
      }
      if (incoming.get(1)) {
        {
          libthrift091.protocol.TList _list351 = new libthrift091.protocol.TList(libthrift091.protocol.TType.MAP, iprot.readI32());
          struct.records = new ArrayList<Map<String,Datum>>(_list351.size);
          Map<String,Datum> _elem352;
          for (int _i353 = 0; _i353 < _list351.size; ++_i353)
          {
            {
              libthrift091.protocol.TMap _map354 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
              _elem352 = new HashMap<String,Datum>(2*_map354.size);
              String _key355;
              Datum _val356;
              for (int _i357 = 0; _i357 < _map354.size; ++_i357)
              {
                _key355 = iprot.readString();
                _val356 = new Datum();
                _val356.read(iprot);
                _elem352.put(_key355, _val356);
              }
            }
            struct.records.add(_elem352);
          }
        }
        struct.setRecordsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.throttled = iprot.readBool();
        struct.setThrottledIsSet(true);
      }
    }
  }

}

