package androidx.datastore.preferences.protobuf;

import We.s;
import androidx.datastore.preferences.protobuf.ArrayDecoders;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class MessageSchema<T> implements Schema<T> {
    private static final int CHECK_INITIALIZED_BIT = 1024;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int HAS_HAS_BIT = 4096;
    private static final int INTS_PER_FIELD = 3;
    private static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
    private static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_BIT = 256;
    private static final int REQUIRED_MASK = 268435456;
    private static final int UTF8_CHECK_BIT = 512;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final ProtoSyntax syntax;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.MessageSchema$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i, int i4, MessageLite messageLite, ProtoSyntax protoSyntax, boolean z4, int[] iArr2, int i6, int i10, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i;
        this.maxFieldNumber = i4;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.syntax = protoSyntax;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(messageLite);
        this.useCachedSizeField = z4;
        this.intArray = iArr2;
        this.checkInitializedCount = i6;
        this.repeatedFieldOffsetStart = i10;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    private boolean arePresentForEquals(T t5, T t10, int i) {
        return isFieldPresent(t5, i) == isFieldPresent(t10, i);
    }

    private static <T> boolean booleanAt(T t5, long j) {
        return UnsafeUtil.getBoolean(t5, j);
    }

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i, int i4, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i, registers);
        int i6 = registers.int1;
        if (i6 < 0 || i6 > i4 - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i10 = iDecodeVarint32 + i6;
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (iDecodeVarint32 < i10) {
            int iDecodeVarint322 = iDecodeVarint32 + 1;
            int i11 = bArr[iDecodeVarint32];
            if (i11 < 0) {
                iDecodeVarint322 = ArrayDecoders.decodeVarint32(i11, bArr, iDecodeVarint322, registers);
                i11 = registers.int1;
            }
            int i12 = iDecodeVarint322;
            int i13 = i11 >>> 3;
            int i14 = i11 & 7;
            if (i13 != 1) {
                if (i13 == 2 && i14 == metadata.valueType.getWireType()) {
                    iDecodeVarint32 = decodeMapEntryValue(bArr, i12, i4, metadata.valueType, metadata.defaultValue.getClass(), registers);
                    obj2 = registers.object1;
                } else {
                    iDecodeVarint32 = ArrayDecoders.skipField(i11, bArr, i12, i4, registers);
                }
            } else if (i14 == metadata.keyType.getWireType()) {
                iDecodeVarint32 = decodeMapEntryValue(bArr, i12, i4, metadata.keyType, null, registers);
                obj = registers.object1;
            } else {
                iDecodeVarint32 = ArrayDecoders.skipField(i11, bArr, i12, i4, registers);
            }
        }
        if (iDecodeVarint32 != i10) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i10;
    }

    private int decodeMapEntryValue(byte[] bArr, int i, int i4, WireFormat.FieldType fieldType, Class<?> cls, ArrayDecoders.Registers registers) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = Boolean.valueOf(registers.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return ArrayDecoders.decodeBytes(bArr, i, registers);
            case 3:
                registers.object1 = Double.valueOf(ArrayDecoders.decodeDouble(bArr, i));
                return i + 8;
            case 4:
            case 5:
                registers.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i));
                return i + 4;
            case 6:
            case 7:
                registers.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i));
                return i + 8;
            case 8:
                registers.object1 = Float.valueOf(ArrayDecoders.decodeFloat(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                registers.object1 = Integer.valueOf(registers.int1);
                return iDecodeVarint32;
            case 12:
            case 13:
                int iDecodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = Long.valueOf(registers.long1);
                return iDecodeVarint642;
            case 14:
                return ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) cls), bArr, i, i4, registers);
            case 15:
                int iDecodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                registers.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                return iDecodeVarint322;
            case 16:
                int iDecodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                return iDecodeVarint643;
            case 17:
                return ArrayDecoders.decodeStringRequireUtf8(bArr, i, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t5, long j) {
        return UnsafeUtil.getDouble(t5, j);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj2) {
        Internal.EnumVerifier enumFieldVerifier;
        int iNumberAt = numberAt(i);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i)) == null) ? ub : (UB) filterUnknownEnumMap(i, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub, unknownFieldSchema, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i, int i4, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj) {
        MapEntryLite.Metadata<?, ?> metadataForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = unknownFieldSchema.getBuilderFromMessage(obj);
                }
                ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(metadataForMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(codedBuilderNewCodedBuilder.getCodedOutput(), metadataForMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub, i4, codedBuilderNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private static <T> float floatAt(T t5, long j) {
        return UnsafeUtil.getFloat(t5, j);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i) {
        return (Internal.EnumVerifier) this.objects[((i / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int i) {
        return this.objects[(i / 3) * 2];
    }

    private Schema getMessageFieldSchema(int i) {
        int i4 = (i / 3) * 2;
        Schema schema = (Schema) this.objects[i4];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaSchemaFor = Protobuf.getInstance().schemaFor((Class) this.objects[i4 + 1]);
        this.objects[i4] = schemaSchemaFor;
        return schemaSchemaFor;
    }

    public static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        return unknownFieldSetLiteNewInstance;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t5) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(t5));
    }

    private static <T> int intAt(T t5, long j) {
        return UnsafeUtil.getInt(t5, j);
    }

    private static boolean isEnforceUtf8(int i) {
        return (i & 536870912) != 0;
    }

    private boolean isFieldPresent(T t5, int i, int i4, int i6, int i10) {
        return i4 == 1048575 ? isFieldPresent(t5, i) : (i6 & i10) != 0;
    }

    private static boolean isLegacyEnumIsClosed(int i) {
        return (i & Integer.MIN_VALUE) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i, int i4) {
        List list = (List) UnsafeUtil.getObject(obj, offset(i));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(i4);
        for (int i6 = 0; i6 < list.size(); i6++) {
            if (!messageFieldSchema.isInitialized(list.get(i6))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.datastore.preferences.protobuf.Schema] */
    private boolean isMapInitialized(T t5, int i, int i4) {
        Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(t5, offset(i)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i4)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? SchemaFor = 0;
        for (Object obj : mapForMapData.values()) {
            SchemaFor = SchemaFor;
            if (SchemaFor == 0) {
                SchemaFor = Protobuf.getInstance().schemaFor((Class) obj.getClass());
            }
            if (!SchemaFor.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(T t5, T t10, int i) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i) & 1048575;
        return UnsafeUtil.getInt(t5, jPresenceMaskAndOffsetAt) == UnsafeUtil.getInt(t10, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T t5, int i, int i4) {
        return UnsafeUtil.getInt(t5, (long) (presenceMaskAndOffsetAt(i4) & 1048575)) == i;
    }

    private static boolean isRequired(int i) {
        return (i & 268435456) != 0;
    }

    private static <T> long longAt(T t5, long j) {
        return UnsafeUtil.getLong(t5, j);
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> r18, androidx.datastore.preferences.protobuf.ExtensionSchema<ET> r19, T r20, androidx.datastore.preferences.protobuf.Reader r21, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.mergeFromHelper(androidx.datastore.preferences.protobuf.UnknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema, java.lang.Object, androidx.datastore.preferences.protobuf.Reader, androidx.datastore.preferences.protobuf.ExtensionRegistryLite):void");
    }

    private final <K, V> void mergeMap(Object obj, int i, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) throws IOException {
        long jOffset = offset(typeAndOffsetAt(i));
        Object object = UnsafeUtil.getObject(obj, jOffset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            UnsafeUtil.putObject(obj, jOffset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            UnsafeUtil.putObject(obj, jOffset, objNewMapField);
            object = objNewMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T t5, T t10, int i) {
        if (isFieldPresent(t10, i)) {
            long jOffset = offset(typeAndOffsetAt(i));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t10, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + t10);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i);
            if (!isFieldPresent(t5, i)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t5, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t5, jOffset, object);
                }
                setFieldPresent(t5, i);
                return;
            }
            Object object2 = unsafe.getObject(t5, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t5, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T t5, T t10, int i) {
        int iNumberAt = numberAt(i);
        if (isOneofPresent(t10, iNumberAt, i)) {
            long jOffset = offset(typeAndOffsetAt(i));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t10, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + t10);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i);
            if (!isOneofPresent(t5, iNumberAt, i)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t5, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t5, jOffset, object);
                }
                setOneofPresent(t5, iNumberAt, i);
                return;
            }
            Object object2 = unsafe.getObject(t5, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t5, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeSingleField(T t5, T t10, int i) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(i);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t10, i)) {
                    UnsafeUtil.putDouble(t5, jOffset, UnsafeUtil.getDouble(t10, jOffset));
                    setFieldPresent(t5, i);
                }
                break;
            case 1:
                if (isFieldPresent(t10, i)) {
                    UnsafeUtil.putFloat(t5, jOffset, UnsafeUtil.getFloat(t10, jOffset));
                    setFieldPresent(t5, i);
                }
                break;
            case 2:
                if (isFieldPresent(t10, i)) {
                    UnsafeUtil.putLong(t5, jOffset, UnsafeUtil.getLong(t10, jOffset));
                    setFieldPresent(t5, i);
                }
                break;
            case 3:
                if (isFieldPresent(t10, i)) {
                    UnsafeUtil.putLong(t5, jOffset, UnsafeUtil.getLong(t10, jOffset));
                    setFieldPresent(t5, i);
                }
                break;
            case 4:
                if (isFieldPresent(t10, i)) {
                    UnsafeUtil.putInt(t5, jOffset, UnsafeUtil.getInt(t10, jOffset));
                    setFieldPresent(t5, i);
                }
                break;
            case 5:
                if (isFieldPresent(t10, i)) {
                    UnsafeUtil.putLong(t5, jOffset, UnsafeUtil.getLong(t10, jOffset));
                    setFieldPresent(t5, i);
                }
                break;
            case 6:
                if (isFieldPresent(t10, i)) {
                    UnsafeUtil.putInt(t5, jOffset, UnsafeUtil.getInt(t10, jOffset));
                    setFieldPresent(t5, i);
                }
                break;
            case 7:
                if (isFieldPresent(t10, i)) {
                    UnsafeUtil.putBoolean(t5, jOffset, UnsafeUtil.getBoolean(t10, jOffset));
                    setFieldPresent(t5, i);
                }
                break;
            case 8:
                if (isFieldPresent(t10, i)) {
                    UnsafeUtil.putObject(t5, jOffset, UnsafeUtil.getObject(t10, jOffset));
                    setFieldPresent(t5, i);
                }
                break;
            case 9:
                mergeMessage(t5, t10, i);
                break;
            case 10:
                if (isFieldPresent(t10, i)) {
                    UnsafeUtil.putObject(t5, jOffset, UnsafeUtil.getObject(t10, jOffset));
                    setFieldPresent(t5, i);
                }
                break;
            case 11:
                if (isFieldPresent(t10, i)) {
                    UnsafeUtil.putInt(t5, jOffset, UnsafeUtil.getInt(t10, jOffset));
                    setFieldPresent(t5, i);
                }
                break;
            case 12:
                if (isFieldPresent(t10, i)) {
                    UnsafeUtil.putInt(t5, jOffset, UnsafeUtil.getInt(t10, jOffset));
                    setFieldPresent(t5, i);
                }
                break;
            case 13:
                if (isFieldPresent(t10, i)) {
                    UnsafeUtil.putInt(t5, jOffset, UnsafeUtil.getInt(t10, jOffset));
                    setFieldPresent(t5, i);
                }
                break;
            case 14:
                if (isFieldPresent(t10, i)) {
                    UnsafeUtil.putLong(t5, jOffset, UnsafeUtil.getLong(t10, jOffset));
                    setFieldPresent(t5, i);
                }
                break;
            case 15:
                if (isFieldPresent(t10, i)) {
                    UnsafeUtil.putInt(t5, jOffset, UnsafeUtil.getInt(t10, jOffset));
                    setFieldPresent(t5, i);
                }
                break;
            case 16:
                if (isFieldPresent(t10, i)) {
                    UnsafeUtil.putLong(t5, jOffset, UnsafeUtil.getLong(t10, jOffset));
                    setFieldPresent(t5, i);
                }
                break;
            case 17:
                mergeMessage(t5, t10, i);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(t5, t10, jOffset);
                break;
            case 50:
                SchemaUtil.mergeMap(this.mapFieldSchema, t5, t10, jOffset);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(t10, iNumberAt, i)) {
                    UnsafeUtil.putObject(t5, jOffset, UnsafeUtil.getObject(t10, jOffset));
                    setOneofPresent(t5, iNumberAt, i);
                }
                break;
            case 60:
                mergeOneofMessage(t5, t10, i);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(t10, iNumberAt, i)) {
                    UnsafeUtil.putObject(t5, jOffset, UnsafeUtil.getObject(t10, jOffset));
                    setOneofPresent(t5, iNumberAt, i);
                }
                break;
            case 68:
                mergeOneofMessage(t5, t10, i);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T t5, int i) {
        Schema messageFieldSchema = getMessageFieldSchema(i);
        long jOffset = offset(typeAndOffsetAt(i));
        if (!isFieldPresent(t5, i)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t5, jOffset);
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableOneofMessageFieldForMerge(T t5, int i, int i4) {
        Schema messageFieldSchema = getMessageFieldSchema(i4);
        if (!isOneofPresent(t5, i, i4)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t5, offset(typeAndOffsetAt(i4)));
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public static <T> MessageSchema<T> newSchema(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        return messageInfo instanceof RawMessageInfo ? newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema) : newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    public static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        int i;
        FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i4 = 0;
        int i6 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i4++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i6++;
            }
        }
        int[] iArr2 = i4 > 0 ? new int[i4] : null;
        int[] iArr3 = i6 > 0 ? new int[i6] : null;
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i10 < fields.length) {
            FieldInfo fieldInfo2 = fields[i10];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i11, objArr);
            if (i12 < checkInitialized.length && checkInitialized[i12] == fieldNumber3) {
                checkInitialized[i12] = i11;
                i12++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr2[i13] = i11;
                i13++;
            } else {
                if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                    i = i11;
                    iArr3[i14] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                    i14++;
                }
                i10++;
                i11 = i + 3;
            }
            i = i11;
            i10++;
            i11 = i + 3;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new MessageSchema<>(iArr, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), structuralMessageInfo.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0376  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> androidx.datastore.preferences.protobuf.MessageSchema<T> newSchemaForRawMessageInfo(androidx.datastore.preferences.protobuf.RawMessageInfo r32, androidx.datastore.preferences.protobuf.NewInstanceSchema r33, androidx.datastore.preferences.protobuf.ListFieldSchema r34, androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r35, androidx.datastore.preferences.protobuf.ExtensionSchema<?> r36, androidx.datastore.preferences.protobuf.MapFieldSchema r37) {
        /*
            Method dump skipped, instruction units count: 1009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.newSchemaForRawMessageInfo(androidx.datastore.preferences.protobuf.RawMessageInfo, androidx.datastore.preferences.protobuf.NewInstanceSchema, androidx.datastore.preferences.protobuf.ListFieldSchema, androidx.datastore.preferences.protobuf.UnknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema, androidx.datastore.preferences.protobuf.MapFieldSchema):androidx.datastore.preferences.protobuf.MessageSchema");
    }

    private int numberAt(int i) {
        return this.buffer[i];
    }

    private static long offset(int i) {
        return i & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t5, long j) {
        return ((Boolean) UnsafeUtil.getObject(t5, j)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t5, long j) {
        return ((Double) UnsafeUtil.getObject(t5, j)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t5, long j) {
        return ((Float) UnsafeUtil.getObject(t5, j)).floatValue();
    }

    private static <T> int oneofIntAt(T t5, long j) {
        return ((Integer) UnsafeUtil.getObject(t5, j)).intValue();
    }

    private static <T> long oneofLongAt(T t5, long j) {
        return ((Long) UnsafeUtil.getObject(t5, j)).longValue();
    }

    private <K, V> int parseMapField(T t5, byte[] bArr, int i, int i4, int i6, long j, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i6);
        Object object = unsafe.getObject(t5, j);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(t5, j, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(bArr, i, i4, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    private int parseOneofField(T t5, byte[] bArr, int i, int i4, int i6, int i10, int i11, int i12, int i13, long j, int i14, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j6 = this.buffer[i14 + 2] & 1048575;
        switch (i13) {
            case 51:
                if (i11 != 1) {
                    return i;
                }
                unsafe.putObject(t5, j, Double.valueOf(ArrayDecoders.decodeDouble(bArr, i)));
                int i15 = i + 8;
                unsafe.putInt(t5, j6, i10);
                return i15;
            case 52:
                if (i11 != 5) {
                    return i;
                }
                unsafe.putObject(t5, j, Float.valueOf(ArrayDecoders.decodeFloat(bArr, i)));
                int i16 = i + 4;
                unsafe.putInt(t5, j6, i10);
                return i16;
            case 53:
            case 54:
                if (i11 != 0) {
                    return i;
                }
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                unsafe.putObject(t5, j, Long.valueOf(registers.long1));
                unsafe.putInt(t5, j6, i10);
                return iDecodeVarint64;
            case 55:
            case 62:
                if (i11 != 0) {
                    return i;
                }
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                unsafe.putObject(t5, j, Integer.valueOf(registers.int1));
                unsafe.putInt(t5, j6, i10);
                return iDecodeVarint32;
            case 56:
            case 65:
                if (i11 != 1) {
                    return i;
                }
                unsafe.putObject(t5, j, Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i)));
                int i17 = i + 8;
                unsafe.putInt(t5, j6, i10);
                return i17;
            case 57:
            case 64:
                if (i11 != 5) {
                    return i;
                }
                unsafe.putObject(t5, j, Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i)));
                int i18 = i + 4;
                unsafe.putInt(t5, j6, i10);
                return i18;
            case 58:
                if (i11 != 0) {
                    return i;
                }
                int iDecodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                unsafe.putObject(t5, j, Boolean.valueOf(registers.long1 != 0));
                unsafe.putInt(t5, j6, i10);
                return iDecodeVarint642;
            case 59:
                if (i11 != 2) {
                    return i;
                }
                int iDecodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                int i19 = registers.int1;
                if (i19 == 0) {
                    unsafe.putObject(t5, j, "");
                } else {
                    if ((i12 & 536870912) != 0 && !Utf8.isValidUtf8(bArr, iDecodeVarint322, iDecodeVarint322 + i19)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t5, j, new String(bArr, iDecodeVarint322, i19, Internal.UTF_8));
                    iDecodeVarint322 += i19;
                }
                unsafe.putInt(t5, j6, i10);
                return iDecodeVarint322;
            case 60:
                if (i11 != 2) {
                    return i;
                }
                Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(t5, i10, i14);
                int iMergeMessageField = ArrayDecoders.mergeMessageField(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(i14), bArr, i, i4, registers);
                storeOneofMessageField(t5, i10, i14, objMutableOneofMessageFieldForMerge);
                return iMergeMessageField;
            case 61:
                if (i11 != 2) {
                    return i;
                }
                int iDecodeBytes = ArrayDecoders.decodeBytes(bArr, i, registers);
                unsafe.putObject(t5, j, registers.object1);
                unsafe.putInt(t5, j6, i10);
                return iDecodeBytes;
            case 63:
                if (i11 != 0) {
                    return i;
                }
                int iDecodeVarint323 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                int i20 = registers.int1;
                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i14);
                if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i20)) {
                    getMutableUnknownFields(t5).storeField(i6, Long.valueOf(i20));
                    return iDecodeVarint323;
                }
                unsafe.putObject(t5, j, Integer.valueOf(i20));
                unsafe.putInt(t5, j6, i10);
                return iDecodeVarint323;
            case 66:
                if (i11 != 0) {
                    return i;
                }
                int iDecodeVarint324 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                unsafe.putObject(t5, j, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                unsafe.putInt(t5, j6, i10);
                return iDecodeVarint324;
            case 67:
                if (i11 != 0) {
                    return i;
                }
                int iDecodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                unsafe.putObject(t5, j, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                unsafe.putInt(t5, j6, i10);
                return iDecodeVarint643;
            case 68:
                if (i11 == 3) {
                    Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(t5, i10, i14);
                    int iMergeGroupField = ArrayDecoders.mergeGroupField(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(i14), bArr, i, i4, (i6 & (-8)) | 4, registers);
                    storeOneofMessageField(t5, i10, i14, objMutableOneofMessageFieldForMerge2);
                    return iMergeGroupField;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int parseRepeatedField(T t5, byte[] bArr, int i, int i4, int i6, int i10, int i11, int i12, long j, int i13, long j6, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufListMutableCopyWithCapacity = (Internal.ProtobufList) unsafe.getObject(t5, j6);
        if (!protobufListMutableCopyWithCapacity.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity.size();
            protobufListMutableCopyWithCapacity = protobufListMutableCopyWithCapacity.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t5, j6, protobufListMutableCopyWithCapacity);
        }
        Internal.ProtobufList protobufList = protobufListMutableCopyWithCapacity;
        switch (i13) {
            case 18:
            case 35:
                if (i11 == 2) {
                    return ArrayDecoders.decodePackedDoubleList(bArr, i, protobufList, registers);
                }
                if (i11 == 1) {
                    return ArrayDecoders.decodeDoubleList(i6, bArr, i, i4, protobufList, registers);
                }
                return i;
            case 19:
            case 36:
                if (i11 == 2) {
                    return ArrayDecoders.decodePackedFloatList(bArr, i, protobufList, registers);
                }
                if (i11 == 5) {
                    return ArrayDecoders.decodeFloatList(i6, bArr, i, i4, protobufList, registers);
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i11 == 2) {
                    return ArrayDecoders.decodePackedVarint64List(bArr, i, protobufList, registers);
                }
                if (i11 == 0) {
                    return ArrayDecoders.decodeVarint64List(i6, bArr, i, i4, protobufList, registers);
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i11 == 2) {
                    return ArrayDecoders.decodePackedVarint32List(bArr, i, protobufList, registers);
                }
                if (i11 == 0) {
                    return ArrayDecoders.decodeVarint32List(i6, bArr, i, i4, protobufList, registers);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i11 == 2) {
                    return ArrayDecoders.decodePackedFixed64List(bArr, i, protobufList, registers);
                }
                if (i11 == 1) {
                    return ArrayDecoders.decodeFixed64List(i6, bArr, i, i4, protobufList, registers);
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i11 == 2) {
                    return ArrayDecoders.decodePackedFixed32List(bArr, i, protobufList, registers);
                }
                if (i11 == 5) {
                    return ArrayDecoders.decodeFixed32List(i6, bArr, i, i4, protobufList, registers);
                }
                return i;
            case 25:
            case 42:
                if (i11 == 2) {
                    return ArrayDecoders.decodePackedBoolList(bArr, i, protobufList, registers);
                }
                if (i11 == 0) {
                    return ArrayDecoders.decodeBoolList(i6, bArr, i, i4, protobufList, registers);
                }
                return i;
            case 26:
                if (i11 == 2) {
                    return (j & 536870912) == 0 ? ArrayDecoders.decodeStringList(i6, bArr, i, i4, protobufList, registers) : ArrayDecoders.decodeStringListRequireUtf8(i6, bArr, i, i4, protobufList, registers);
                }
                return i;
            case 27:
                if (i11 == 2) {
                    return ArrayDecoders.decodeMessageList(getMessageFieldSchema(i12), i6, bArr, i, i4, protobufList, registers);
                }
                return i;
            case 28:
                if (i11 == 2) {
                    return ArrayDecoders.decodeBytesList(i6, bArr, i, i4, protobufList, registers);
                }
                return i;
            case 30:
            case 44:
                if (i11 != 2) {
                    if (i11 == 0) {
                        iDecodeVarint32List = ArrayDecoders.decodeVarint32List(i6, bArr, i, i4, protobufList, registers);
                    }
                    return i;
                }
                iDecodeVarint32List = ArrayDecoders.decodePackedVarint32List(bArr, i, protobufList, registers);
                SchemaUtil.filterUnknownEnumList((Object) t5, i10, (List<Integer>) protobufList, getEnumFieldVerifier(i12), (Object) null, (UnknownFieldSchema<UT, Object>) this.unknownFieldSchema);
                return iDecodeVarint32List;
            case 33:
            case 47:
                if (i11 == 2) {
                    return ArrayDecoders.decodePackedSInt32List(bArr, i, protobufList, registers);
                }
                if (i11 == 0) {
                    return ArrayDecoders.decodeSInt32List(i6, bArr, i, i4, protobufList, registers);
                }
                return i;
            case 34:
            case 48:
                if (i11 == 2) {
                    return ArrayDecoders.decodePackedSInt64List(bArr, i, protobufList, registers);
                }
                if (i11 == 0) {
                    return ArrayDecoders.decodeSInt64List(i6, bArr, i, i4, protobufList, registers);
                }
                return i;
            case 49:
                if (i11 == 3) {
                    return ArrayDecoders.decodeGroupList(getMessageFieldSchema(i12), i6, bArr, i, i4, protobufList, registers);
                }
                return i;
            default:
                return i;
        }
    }

    private int positionForFieldNumber(int i) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, 0);
    }

    private int presenceMaskAndOffsetAt(int i) {
        return this.buffer[i + 2];
    }

    private <E> void readGroupList(Object obj, long j, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j), schema, extensionRegistryLite);
    }

    private <E> void readMessageList(Object obj, int i, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i)), schema, extensionRegistryLite);
    }

    private void readString(Object obj, int i, Reader reader) throws IOException {
        if (isEnforceUtf8(i)) {
            UnsafeUtil.putObject(obj, offset(i), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj, offset(i), reader.readString());
        } else {
            UnsafeUtil.putObject(obj, offset(i), reader.readBytes());
        }
    }

    private void readStringList(Object obj, int i, Reader reader) throws IOException {
        if (isEnforceUtf8(i)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i)));
        }
    }

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbW = s.w("Field ", str, " for ");
            sbW.append(cls.getName());
            sbW.append(" not found. Known fields are ");
            sbW.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbW.toString());
        }
    }

    private void setFieldPresent(T t5, int i) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & iPresenceMaskAndOffsetAt;
        if (j == 1048575) {
            return;
        }
        UnsafeUtil.putInt(t5, j, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.getInt(t5, j));
    }

    private void setOneofPresent(T t5, int i, int i4) {
        UnsafeUtil.putInt(t5, presenceMaskAndOffsetAt(i4) & 1048575, i);
    }

    private int slowPositionForFieldNumber(int i, int i4) {
        int length = (this.buffer.length / 3) - 1;
        while (i4 <= length) {
            int i6 = (length + i4) >>> 1;
            int i10 = i6 * 3;
            int iNumberAt = numberAt(i10);
            if (i == iNumberAt) {
                return i10;
            }
            if (i < iNumberAt) {
                length = i6 - 1;
            } else {
                i4 = i6 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void storeFieldData(androidx.datastore.preferences.protobuf.FieldInfo r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.storeFieldData(androidx.datastore.preferences.protobuf.FieldInfo, int[], int, java.lang.Object[]):void");
    }

    private void storeMessageField(T t5, int i, Object obj) {
        UNSAFE.putObject(t5, offset(typeAndOffsetAt(i)), obj);
        setFieldPresent(t5, i);
    }

    private void storeOneofMessageField(T t5, int i, int i4, Object obj) {
        UNSAFE.putObject(t5, offset(typeAndOffsetAt(i4)), obj);
        setOneofPresent(t5, i, i4);
    }

    private static int type(int i) {
        return (i & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i) {
        return this.buffer[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeFieldsInAscendingOrder(T r19, androidx.datastore.preferences.protobuf.Writer r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.writeFieldsInAscendingOrder(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeFieldsInDescendingOrder(T r11, androidx.datastore.preferences.protobuf.Writer r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.writeFieldsInDescendingOrder(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    private <K, V> void writeMapHelper(Writer writer, int i, Object obj, int i4) throws IOException {
        if (obj != null) {
            writer.writeMap(i, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i4)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.writeString(i, (String) obj);
        } else {
            writer.writeBytes(i, (ByteString) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t5, Writer writer) throws IOException {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(t5), writer);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public boolean equals(T t5, T t10) {
        int length = this.buffer.length;
        for (int i = 0; i < length; i += 3) {
            if (!equals(t5, t10, i)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(t5).equals(this.unknownFieldSchema.getFromMessage(t10))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t5).equals(this.extensionSchema.getExtensions(t10));
        }
        return true;
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0559 A[PHI: r0 r1
  0x0559: PHI (r0v2 androidx.datastore.preferences.protobuf.MessageSchema<T>) = 
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v26 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v32 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
  (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
 binds: [B:22:0x005b, B:249:0x054f, B:218:0x04b0, B:204:0x0467, B:196:0x0440, B:189:0x0419, B:166:0x0330, B:160:0x0312, B:154:0x02f4, B:148:0x02d6, B:142:0x02b8, B:136:0x029a, B:130:0x027c, B:124:0x025e, B:118:0x0240, B:112:0x0223, B:106:0x0206, B:100:0x01e9, B:94:0x01cc, B:87:0x01aa, B:82:0x0176, B:79:0x016a, B:76:0x015a, B:73:0x014a, B:70:0x013a, B:67:0x012e, B:64:0x0122, B:61:0x0115, B:54:0x00f5, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x0559: PHI (r1v4 T) = 
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v5 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
 binds: [B:22:0x005b, B:249:0x054f, B:218:0x04b0, B:204:0x0467, B:196:0x0440, B:189:0x0419, B:166:0x0330, B:160:0x0312, B:154:0x02f4, B:148:0x02d6, B:142:0x02b8, B:136:0x029a, B:130:0x027c, B:124:0x025e, B:118:0x0240, B:112:0x0223, B:106:0x0206, B:100:0x01e9, B:94:0x01cc, B:87:0x01aa, B:82:0x0176, B:79:0x016a, B:76:0x015a, B:73:0x014a, B:70:0x013a, B:67:0x012e, B:64:0x0122, B:61:0x0115, B:54:0x00f5, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getSerializedSize(T r18) {
        /*
            Method dump skipped, instruction units count: 1546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.getSerializedSize(java.lang.Object):int");
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int hashCode(T t5) {
        int i;
        int iHashLong;
        int i4;
        int iOneofIntAt;
        int length = this.buffer.length;
        int i6 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i10);
            int iNumberAt = numberAt(i10);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i = i6 * 53;
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(t5, jOffset)));
                    i6 = iHashLong + i;
                    break;
                case 1:
                    i = i6 * 53;
                    iHashLong = Float.floatToIntBits(UnsafeUtil.getFloat(t5, jOffset));
                    i6 = iHashLong + i;
                    break;
                case 2:
                    i = i6 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t5, jOffset));
                    i6 = iHashLong + i;
                    break;
                case 3:
                    i = i6 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t5, jOffset));
                    i6 = iHashLong + i;
                    break;
                case 4:
                    i4 = i6 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t5, jOffset);
                    i6 = i4 + iOneofIntAt;
                    break;
                case 5:
                    i = i6 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t5, jOffset));
                    i6 = iHashLong + i;
                    break;
                case 6:
                    i4 = i6 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t5, jOffset);
                    i6 = i4 + iOneofIntAt;
                    break;
                case 7:
                    i = i6 * 53;
                    iHashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(t5, jOffset));
                    i6 = iHashLong + i;
                    break;
                case 8:
                    i = i6 * 53;
                    iHashLong = ((String) UnsafeUtil.getObject(t5, jOffset)).hashCode();
                    i6 = iHashLong + i;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(t5, jOffset);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i6 = (i6 * 53) + iHashCode;
                    break;
                case 10:
                    i = i6 * 53;
                    iHashLong = UnsafeUtil.getObject(t5, jOffset).hashCode();
                    i6 = iHashLong + i;
                    break;
                case 11:
                    i4 = i6 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t5, jOffset);
                    i6 = i4 + iOneofIntAt;
                    break;
                case 12:
                    i4 = i6 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t5, jOffset);
                    i6 = i4 + iOneofIntAt;
                    break;
                case 13:
                    i4 = i6 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t5, jOffset);
                    i6 = i4 + iOneofIntAt;
                    break;
                case 14:
                    i = i6 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t5, jOffset));
                    i6 = iHashLong + i;
                    break;
                case 15:
                    i4 = i6 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t5, jOffset);
                    i6 = i4 + iOneofIntAt;
                    break;
                case 16:
                    i = i6 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t5, jOffset));
                    i6 = iHashLong + i;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(t5, jOffset);
                    if (object2 != null) {
                        iHashCode = object2.hashCode();
                    }
                    i6 = (i6 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i6 * 53;
                    iHashLong = UnsafeUtil.getObject(t5, jOffset).hashCode();
                    i6 = iHashLong + i;
                    break;
                case 50:
                    i = i6 * 53;
                    iHashLong = UnsafeUtil.getObject(t5, jOffset).hashCode();
                    i6 = iHashLong + i;
                    break;
                case 51:
                    if (isOneofPresent(t5, iNumberAt, i10)) {
                        i = i6 * 53;
                        iHashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(t5, jOffset)));
                        i6 = iHashLong + i;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t5, iNumberAt, i10)) {
                        i = i6 * 53;
                        iHashLong = Float.floatToIntBits(oneofFloatAt(t5, jOffset));
                        i6 = iHashLong + i;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t5, iNumberAt, i10)) {
                        i = i6 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t5, jOffset));
                        i6 = iHashLong + i;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t5, iNumberAt, i10)) {
                        i = i6 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t5, jOffset));
                        i6 = iHashLong + i;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t5, iNumberAt, i10)) {
                        i4 = i6 * 53;
                        iOneofIntAt = oneofIntAt(t5, jOffset);
                        i6 = i4 + iOneofIntAt;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t5, iNumberAt, i10)) {
                        i = i6 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t5, jOffset));
                        i6 = iHashLong + i;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t5, iNumberAt, i10)) {
                        i4 = i6 * 53;
                        iOneofIntAt = oneofIntAt(t5, jOffset);
                        i6 = i4 + iOneofIntAt;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t5, iNumberAt, i10)) {
                        i = i6 * 53;
                        iHashLong = Internal.hashBoolean(oneofBooleanAt(t5, jOffset));
                        i6 = iHashLong + i;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t5, iNumberAt, i10)) {
                        i = i6 * 53;
                        iHashLong = ((String) UnsafeUtil.getObject(t5, jOffset)).hashCode();
                        i6 = iHashLong + i;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t5, iNumberAt, i10)) {
                        i = i6 * 53;
                        iHashLong = UnsafeUtil.getObject(t5, jOffset).hashCode();
                        i6 = iHashLong + i;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t5, iNumberAt, i10)) {
                        i = i6 * 53;
                        iHashLong = UnsafeUtil.getObject(t5, jOffset).hashCode();
                        i6 = iHashLong + i;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t5, iNumberAt, i10)) {
                        i4 = i6 * 53;
                        iOneofIntAt = oneofIntAt(t5, jOffset);
                        i6 = i4 + iOneofIntAt;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t5, iNumberAt, i10)) {
                        i4 = i6 * 53;
                        iOneofIntAt = oneofIntAt(t5, jOffset);
                        i6 = i4 + iOneofIntAt;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t5, iNumberAt, i10)) {
                        i4 = i6 * 53;
                        iOneofIntAt = oneofIntAt(t5, jOffset);
                        i6 = i4 + iOneofIntAt;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t5, iNumberAt, i10)) {
                        i = i6 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t5, jOffset));
                        i6 = iHashLong + i;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t5, iNumberAt, i10)) {
                        i4 = i6 * 53;
                        iOneofIntAt = oneofIntAt(t5, jOffset);
                        i6 = i4 + iOneofIntAt;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t5, iNumberAt, i10)) {
                        i = i6 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t5, jOffset));
                        i6 = iHashLong + i;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t5, iNumberAt, i10)) {
                        i = i6 * 53;
                        iHashLong = UnsafeUtil.getObject(t5, jOffset).hashCode();
                        i6 = iHashLong + i;
                    }
                    break;
            }
        }
        int iHashCode2 = this.unknownFieldSchema.getFromMessage(t5).hashCode() + (i6 * 53);
        return this.hasExtensions ? (iHashCode2 * 53) + this.extensionSchema.getExtensions(t5).hashCode() : iHashCode2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    @Override // androidx.datastore.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isInitialized(T r15) {
        /*
            r14 = this;
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 0
            r3 = r0
            r2 = r1
            r4 = r2
        L7:
            int r5 = r14.checkInitializedCount
            r6 = 1
            if (r2 >= r5) goto L9b
            int[] r5 = r14.intArray
            r9 = r5[r2]
            int r5 = r14.numberAt(r9)
            int r13 = r14.typeAndOffsetAt(r9)
            int[] r7 = r14.buffer
            int r8 = r9 + 2
            r7 = r7[r8]
            r8 = r7 & r0
            int r7 = r7 >>> 20
            int r12 = r6 << r7
            if (r8 == r3) goto L32
            if (r8 == r0) goto L2f
            sun.misc.Unsafe r3 = androidx.datastore.preferences.protobuf.MessageSchema.UNSAFE
            long r6 = (long) r8
            int r4 = r3.getInt(r15, r6)
        L2f:
            r11 = r4
            r10 = r8
            goto L34
        L32:
            r10 = r3
            r11 = r4
        L34:
            boolean r3 = isRequired(r13)
            r7 = r14
            r8 = r15
            if (r3 == 0) goto L43
            boolean r15 = r7.isFieldPresent(r8, r9, r10, r11, r12)
            if (r15 != 0) goto L43
            return r1
        L43:
            int r15 = type(r13)
            r3 = 9
            if (r15 == r3) goto L83
            r3 = 17
            if (r15 == r3) goto L83
            r3 = 27
            if (r15 == r3) goto L7c
            r3 = 60
            if (r15 == r3) goto L6b
            r3 = 68
            if (r15 == r3) goto L6b
            r3 = 49
            if (r15 == r3) goto L7c
            r3 = 50
            if (r15 == r3) goto L64
            goto L94
        L64:
            boolean r15 = r14.isMapInitialized(r8, r13, r9)
            if (r15 != 0) goto L94
            return r1
        L6b:
            boolean r15 = r14.isOneofPresent(r8, r5, r9)
            if (r15 == 0) goto L94
            androidx.datastore.preferences.protobuf.Schema r15 = r14.getMessageFieldSchema(r9)
            boolean r15 = isInitialized(r8, r13, r15)
            if (r15 != 0) goto L94
            return r1
        L7c:
            boolean r15 = r14.isListInitialized(r8, r13, r9)
            if (r15 != 0) goto L94
            return r1
        L83:
            boolean r15 = r7.isFieldPresent(r8, r9, r10, r11, r12)
            if (r15 == 0) goto L94
            androidx.datastore.preferences.protobuf.Schema r15 = r14.getMessageFieldSchema(r9)
            boolean r15 = isInitialized(r8, r13, r15)
            if (r15 != 0) goto L94
            return r1
        L94:
            int r2 = r2 + 1
            r15 = r8
            r3 = r10
            r4 = r11
            goto L7
        L9b:
            r7 = r14
            r8 = r15
            boolean r15 = r7.hasExtensions
            if (r15 == 0) goto Lae
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r15 = r7.extensionSchema
            androidx.datastore.preferences.protobuf.FieldSet r15 = r15.getExtensions(r8)
            boolean r15 = r15.isInitialized()
            if (r15 != 0) goto Lae
            return r1
        Lae:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.isInitialized(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    @Override // androidx.datastore.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void makeImmutable(T r8) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.makeImmutable(java.lang.Object):void");
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T t5, T t10) {
        checkMutable(t5);
        t10.getClass();
        for (int i = 0; i < this.buffer.length; i += 3) {
            mergeSingleField(t5, t10, i);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t5, t10);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t5, t10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x009d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x043e  */
    @androidx.datastore.preferences.protobuf.CanIgnoreReturnValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int parseMessage(T r27, byte[] r28, int r29, int r30, int r31, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers r32) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.parseMessage(java.lang.Object, byte[], int, int, int, androidx.datastore.preferences.protobuf.ArrayDecoders$Registers):int");
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void writeTo(T t5, Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t5, writer);
        } else {
            writeFieldsInAscendingOrder(t5, writer);
        }
    }

    private boolean isFieldPresent(T t5, int i) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & iPresenceMaskAndOffsetAt;
        if (j != 1048575) {
            return (UnsafeUtil.getInt(t5, j) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(UnsafeUtil.getDouble(t5, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(UnsafeUtil.getFloat(t5, jOffset)) != 0;
            case 2:
                return UnsafeUtil.getLong(t5, jOffset) != 0;
            case 3:
                return UnsafeUtil.getLong(t5, jOffset) != 0;
            case 4:
                return UnsafeUtil.getInt(t5, jOffset) != 0;
            case 5:
                return UnsafeUtil.getLong(t5, jOffset) != 0;
            case 6:
                return UnsafeUtil.getInt(t5, jOffset) != 0;
            case 7:
                return UnsafeUtil.getBoolean(t5, jOffset);
            case 8:
                Object object = UnsafeUtil.getObject(t5, jOffset);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof ByteString) {
                    return !ByteString.EMPTY.equals(object);
                }
                throw new IllegalArgumentException();
            case 9:
                return UnsafeUtil.getObject(t5, jOffset) != null;
            case 10:
                return !ByteString.EMPTY.equals(UnsafeUtil.getObject(t5, jOffset));
            case 11:
                return UnsafeUtil.getInt(t5, jOffset) != 0;
            case 12:
                return UnsafeUtil.getInt(t5, jOffset) != 0;
            case 13:
                return UnsafeUtil.getInt(t5, jOffset) != 0;
            case 14:
                return UnsafeUtil.getLong(t5, jOffset) != 0;
            case 15:
                return UnsafeUtil.getInt(t5, jOffset) != 0;
            case 16:
                return UnsafeUtil.getLong(t5, jOffset) != 0;
            case 17:
                return UnsafeUtil.getObject(t5, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private int positionForFieldNumber(int i, int i4) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, i4);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T t5, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        extensionRegistryLite.getClass();
        checkMutable(t5);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t5, reader, extensionRegistryLite);
    }

    private boolean equals(T t5, T t10, int i) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (!arePresentForEquals(t5, t10, i) || Double.doubleToLongBits(UnsafeUtil.getDouble(t5, jOffset)) != Double.doubleToLongBits(UnsafeUtil.getDouble(t10, jOffset))) {
                }
                break;
            case 1:
                if (!arePresentForEquals(t5, t10, i) || Float.floatToIntBits(UnsafeUtil.getFloat(t5, jOffset)) != Float.floatToIntBits(UnsafeUtil.getFloat(t10, jOffset))) {
                }
                break;
            case 2:
                if (!arePresentForEquals(t5, t10, i) || UnsafeUtil.getLong(t5, jOffset) != UnsafeUtil.getLong(t10, jOffset)) {
                }
                break;
            case 3:
                if (!arePresentForEquals(t5, t10, i) || UnsafeUtil.getLong(t5, jOffset) != UnsafeUtil.getLong(t10, jOffset)) {
                }
                break;
            case 4:
                if (!arePresentForEquals(t5, t10, i) || UnsafeUtil.getInt(t5, jOffset) != UnsafeUtil.getInt(t10, jOffset)) {
                }
                break;
            case 5:
                if (!arePresentForEquals(t5, t10, i) || UnsafeUtil.getLong(t5, jOffset) != UnsafeUtil.getLong(t10, jOffset)) {
                }
                break;
            case 6:
                if (!arePresentForEquals(t5, t10, i) || UnsafeUtil.getInt(t5, jOffset) != UnsafeUtil.getInt(t10, jOffset)) {
                }
                break;
            case 7:
                if (!arePresentForEquals(t5, t10, i) || UnsafeUtil.getBoolean(t5, jOffset) != UnsafeUtil.getBoolean(t10, jOffset)) {
                }
                break;
            case 8:
                if (!arePresentForEquals(t5, t10, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t5, jOffset), UnsafeUtil.getObject(t10, jOffset))) {
                }
                break;
            case 9:
                if (!arePresentForEquals(t5, t10, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t5, jOffset), UnsafeUtil.getObject(t10, jOffset))) {
                }
                break;
            case 10:
                if (!arePresentForEquals(t5, t10, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t5, jOffset), UnsafeUtil.getObject(t10, jOffset))) {
                }
                break;
            case 11:
                if (!arePresentForEquals(t5, t10, i) || UnsafeUtil.getInt(t5, jOffset) != UnsafeUtil.getInt(t10, jOffset)) {
                }
                break;
            case 12:
                if (!arePresentForEquals(t5, t10, i) || UnsafeUtil.getInt(t5, jOffset) != UnsafeUtil.getInt(t10, jOffset)) {
                }
                break;
            case 13:
                if (!arePresentForEquals(t5, t10, i) || UnsafeUtil.getInt(t5, jOffset) != UnsafeUtil.getInt(t10, jOffset)) {
                }
                break;
            case 14:
                if (!arePresentForEquals(t5, t10, i) || UnsafeUtil.getLong(t5, jOffset) != UnsafeUtil.getLong(t10, jOffset)) {
                }
                break;
            case 15:
                if (!arePresentForEquals(t5, t10, i) || UnsafeUtil.getInt(t5, jOffset) != UnsafeUtil.getInt(t10, jOffset)) {
                }
                break;
            case 16:
                if (!arePresentForEquals(t5, t10, i) || UnsafeUtil.getLong(t5, jOffset) != UnsafeUtil.getLong(t10, jOffset)) {
                }
                break;
            case 17:
                if (!arePresentForEquals(t5, t10, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t5, jOffset), UnsafeUtil.getObject(t10, jOffset))) {
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!isOneofCaseEqual(t5, t10, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t5, jOffset), UnsafeUtil.getObject(t10, jOffset))) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T t5, byte[] bArr, int i, int i4, ArrayDecoders.Registers registers) throws IOException {
        parseMessage(t5, bArr, i, i4, 0, registers);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj, offset(i)));
    }
}
