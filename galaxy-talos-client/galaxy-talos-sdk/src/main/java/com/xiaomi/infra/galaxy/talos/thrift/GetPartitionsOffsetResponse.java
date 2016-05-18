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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-5-18")
public class GetPartitionsOffsetResponse implements libthrift091.TBase<GetPartitionsOffsetResponse, GetPartitionsOffsetResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetPartitionsOffsetResponse> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("GetPartitionsOffsetResponse");

  private static final libthrift091.protocol.TField OFFSET_INFO_LIST_FIELD_DESC = new libthrift091.protocol.TField("offsetInfoList", libthrift091.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetPartitionsOffsetResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetPartitionsOffsetResponseTupleSchemeFactory());
  }

  /**
   * The list of OffsetInfo
   * 
   */
  public List<OffsetInfo> offsetInfoList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The list of OffsetInfo
     * 
     */
    OFFSET_INFO_LIST((short)1, "offsetInfoList");

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
        case 1: // OFFSET_INFO_LIST
          return OFFSET_INFO_LIST;
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
    tmpMap.put(_Fields.OFFSET_INFO_LIST, new libthrift091.meta_data.FieldMetaData("offsetInfoList", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, OffsetInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(GetPartitionsOffsetResponse.class, metaDataMap);
  }

  public GetPartitionsOffsetResponse() {
  }

  public GetPartitionsOffsetResponse(
    List<OffsetInfo> offsetInfoList)
  {
    this();
    this.offsetInfoList = offsetInfoList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetPartitionsOffsetResponse(GetPartitionsOffsetResponse other) {
    if (other.isSetOffsetInfoList()) {
      List<OffsetInfo> __this__offsetInfoList = new ArrayList<OffsetInfo>(other.offsetInfoList.size());
      for (OffsetInfo other_element : other.offsetInfoList) {
        __this__offsetInfoList.add(new OffsetInfo(other_element));
      }
      this.offsetInfoList = __this__offsetInfoList;
    }
  }

  public GetPartitionsOffsetResponse deepCopy() {
    return new GetPartitionsOffsetResponse(this);
  }

  @Override
  public void clear() {
    this.offsetInfoList = null;
  }

  public int getOffsetInfoListSize() {
    return (this.offsetInfoList == null) ? 0 : this.offsetInfoList.size();
  }

  public java.util.Iterator<OffsetInfo> getOffsetInfoListIterator() {
    return (this.offsetInfoList == null) ? null : this.offsetInfoList.iterator();
  }

  public void addToOffsetInfoList(OffsetInfo elem) {
    if (this.offsetInfoList == null) {
      this.offsetInfoList = new ArrayList<OffsetInfo>();
    }
    this.offsetInfoList.add(elem);
  }

  /**
   * The list of OffsetInfo
   * 
   */
  public List<OffsetInfo> getOffsetInfoList() {
    return this.offsetInfoList;
  }

  /**
   * The list of OffsetInfo
   * 
   */
  public GetPartitionsOffsetResponse setOffsetInfoList(List<OffsetInfo> offsetInfoList) {
    this.offsetInfoList = offsetInfoList;
    return this;
  }

  public void unsetOffsetInfoList() {
    this.offsetInfoList = null;
  }

  /** Returns true if field offsetInfoList is set (has been assigned a value) and false otherwise */
  public boolean isSetOffsetInfoList() {
    return this.offsetInfoList != null;
  }

  public void setOffsetInfoListIsSet(boolean value) {
    if (!value) {
      this.offsetInfoList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OFFSET_INFO_LIST:
      if (value == null) {
        unsetOffsetInfoList();
      } else {
        setOffsetInfoList((List<OffsetInfo>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OFFSET_INFO_LIST:
      return getOffsetInfoList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OFFSET_INFO_LIST:
      return isSetOffsetInfoList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetPartitionsOffsetResponse)
      return this.equals((GetPartitionsOffsetResponse)that);
    return false;
  }

  public boolean equals(GetPartitionsOffsetResponse that) {
    if (that == null)
      return false;

    boolean this_present_offsetInfoList = true && this.isSetOffsetInfoList();
    boolean that_present_offsetInfoList = true && that.isSetOffsetInfoList();
    if (this_present_offsetInfoList || that_present_offsetInfoList) {
      if (!(this_present_offsetInfoList && that_present_offsetInfoList))
        return false;
      if (!this.offsetInfoList.equals(that.offsetInfoList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_offsetInfoList = true && (isSetOffsetInfoList());
    list.add(present_offsetInfoList);
    if (present_offsetInfoList)
      list.add(offsetInfoList);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetPartitionsOffsetResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOffsetInfoList()).compareTo(other.isSetOffsetInfoList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOffsetInfoList()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.offsetInfoList, other.offsetInfoList);
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
    StringBuilder sb = new StringBuilder("GetPartitionsOffsetResponse(");
    boolean first = true;

    sb.append("offsetInfoList:");
    if (this.offsetInfoList == null) {
      sb.append("null");
    } else {
      sb.append(this.offsetInfoList);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (offsetInfoList == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'offsetInfoList' was not present! Struct: " + toString());
    }
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
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetPartitionsOffsetResponseStandardSchemeFactory implements SchemeFactory {
    public GetPartitionsOffsetResponseStandardScheme getScheme() {
      return new GetPartitionsOffsetResponseStandardScheme();
    }
  }

  private static class GetPartitionsOffsetResponseStandardScheme extends StandardScheme<GetPartitionsOffsetResponse> {

    public void read(libthrift091.protocol.TProtocol iprot, GetPartitionsOffsetResponse struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OFFSET_INFO_LIST
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list32 = iprot.readListBegin();
                struct.offsetInfoList = new ArrayList<OffsetInfo>(_list32.size);
                OffsetInfo _elem33;
                for (int _i34 = 0; _i34 < _list32.size; ++_i34)
                {
                  _elem33 = new OffsetInfo();
                  _elem33.read(iprot);
                  struct.offsetInfoList.add(_elem33);
                }
                iprot.readListEnd();
              }
              struct.setOffsetInfoListIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, GetPartitionsOffsetResponse struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.offsetInfoList != null) {
        oprot.writeFieldBegin(OFFSET_INFO_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.offsetInfoList.size()));
          for (OffsetInfo _iter35 : struct.offsetInfoList)
          {
            _iter35.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetPartitionsOffsetResponseTupleSchemeFactory implements SchemeFactory {
    public GetPartitionsOffsetResponseTupleScheme getScheme() {
      return new GetPartitionsOffsetResponseTupleScheme();
    }
  }

  private static class GetPartitionsOffsetResponseTupleScheme extends TupleScheme<GetPartitionsOffsetResponse> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, GetPartitionsOffsetResponse struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.offsetInfoList.size());
        for (OffsetInfo _iter36 : struct.offsetInfoList)
        {
          _iter36.write(oprot);
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, GetPartitionsOffsetResponse struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        libthrift091.protocol.TList _list37 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
        struct.offsetInfoList = new ArrayList<OffsetInfo>(_list37.size);
        OffsetInfo _elem38;
        for (int _i39 = 0; _i39 < _list37.size; ++_i39)
        {
          _elem38 = new OffsetInfo();
          _elem38.read(iprot);
          struct.offsetInfoList.add(_elem38);
        }
      }
      struct.setOffsetInfoListIsSet(true);
    }
  }

}

