package com.squareup.wire;

import We.s;
import X5.f;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapterKt;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.ReflectionKt;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import xj.InterfaceC2488d;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ProtoAdapter<E> {
    public static final ProtoAdapter<Boolean> BOOL;
    public static final ProtoAdapter<Boolean> BOOL_VALUE;
    public static final ProtoAdapter<ByteString> BYTES;
    public static final ProtoAdapter<ByteString> BYTES_VALUE;
    public static final Companion Companion = new Companion(null);
    public static final ProtoAdapter<Double> DOUBLE;
    public static final ProtoAdapter<double[]> DOUBLE_ARRAY;
    public static final ProtoAdapter<Double> DOUBLE_VALUE;
    public static final ProtoAdapter<Duration> DURATION;
    public static final ProtoAdapter<Unit> EMPTY;
    public static final ProtoAdapter<Integer> FIXED32;
    public static final ProtoAdapter<int[]> FIXED32_ARRAY;
    public static final ProtoAdapter<Long> FIXED64;
    public static final ProtoAdapter<long[]> FIXED64_ARRAY;
    public static final ProtoAdapter<Float> FLOAT;
    public static final ProtoAdapter<float[]> FLOAT_ARRAY;
    public static final ProtoAdapter<Float> FLOAT_VALUE;
    public static final ProtoAdapter<Instant> INSTANT;
    public static final ProtoAdapter<Integer> INT32;
    public static final ProtoAdapter<int[]> INT32_ARRAY;
    public static final ProtoAdapter<Integer> INT32_VALUE;
    public static final ProtoAdapter<Long> INT64;
    public static final ProtoAdapter<long[]> INT64_ARRAY;
    public static final ProtoAdapter<Long> INT64_VALUE;
    public static final ProtoAdapter<Integer> SFIXED32;
    public static final ProtoAdapter<int[]> SFIXED32_ARRAY;
    public static final ProtoAdapter<Long> SFIXED64;
    public static final ProtoAdapter<long[]> SFIXED64_ARRAY;
    public static final ProtoAdapter<Integer> SINT32;
    public static final ProtoAdapter<int[]> SINT32_ARRAY;
    public static final ProtoAdapter<Long> SINT64;
    public static final ProtoAdapter<long[]> SINT64_ARRAY;
    public static final ProtoAdapter<String> STRING;
    public static final ProtoAdapter<String> STRING_VALUE;
    public static final ProtoAdapter<List<?>> STRUCT_LIST;
    public static final ProtoAdapter<Map<String, ?>> STRUCT_MAP;
    public static final ProtoAdapter STRUCT_NULL;
    public static final ProtoAdapter<Object> STRUCT_VALUE;
    public static final ProtoAdapter<Integer> UINT32;
    public static final ProtoAdapter<int[]> UINT32_ARRAY;
    public static final ProtoAdapter<Integer> UINT32_VALUE;
    public static final ProtoAdapter<Long> UINT64;
    public static final ProtoAdapter<long[]> UINT64_ARRAY;
    public static final ProtoAdapter<Long> UINT64_VALUE;
    private final FieldEncoding fieldEncoding;
    private final E identity;
    private final ProtoAdapter<List<E>> packedAdapter;
    private final ProtoAdapter<List<E>> repeatedAdapter;
    private final String sourceFile;
    private final Syntax syntax;
    private final InterfaceC2488d type;
    private final String typeUrl;

    public static final class Companion {

        public static final class UnsupportedTypeProtoAdapter extends ProtoAdapter {
            public UnsupportedTypeProtoAdapter() {
                super(FieldEncoding.LENGTH_DELIMITED, z.a(Void.class));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
                return ((Number) encodedSize((Void) obj)).intValue();
            }

            public Void encodedSize(Void value) {
                j.g(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void redact(Void value) {
                j.g(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void decode(ProtoReader reader) {
                j.g(reader, "reader");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void encode(ProtoWriter writer, Void value) {
                j.g(writer, "writer");
                j.g(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void decode(ProtoReader32 reader) {
                j.g(reader, "reader");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void encode(ReverseProtoWriter writer, Void value) {
                j.g(writer, "writer");
                j.g(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <M extends Message<?, ?>> ProtoAdapter<M> get(M message) {
            j.g(message, "message");
            return get(message.getClass());
        }

        public final <E extends WireEnum> EnumAdapter<E> newEnumAdapter(Class<E> type) {
            j.g(type, "type");
            return new RuntimeEnumAdapter(type);
        }

        public final <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(ProtoAdapter<K> keyAdapter, ProtoAdapter<V> valueAdapter) {
            j.g(keyAdapter, "keyAdapter");
            j.g(valueAdapter, "valueAdapter");
            return new MapProtoAdapter(keyAdapter, valueAdapter);
        }

        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> type) {
            j.g(type, "type");
            return ReflectionKt.createRuntimeMessageAdapter$default(type, null, Syntax.PROTO_2, null, false, 24, null);
        }

        private Companion() {
        }

        public final <M> ProtoAdapter<M> get(Class<M> type) {
            j.g(type, "type");
            try {
                Object obj = type.getField("ADAPTER").get(null);
                j.e(obj, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<M of com.squareup.wire.ProtoAdapter.Companion.get>");
                return (ProtoAdapter) obj;
            } catch (IllegalAccessException e) {
                throw new IllegalArgumentException("failed to access " + type.getName() + "#ADAPTER", e);
            } catch (NoSuchFieldException e7) {
                throw new IllegalArgumentException("failed to access " + type.getName() + "#ADAPTER", e7);
            }
        }

        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> type, String typeUrl) {
            j.g(type, "type");
            j.g(typeUrl, "typeUrl");
            return ReflectionKt.createRuntimeMessageAdapter$default(type, typeUrl, Syntax.PROTO_2, null, false, 24, null);
        }

        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> type, String typeUrl, Syntax syntax) {
            j.g(type, "type");
            j.g(typeUrl, "typeUrl");
            j.g(syntax, "syntax");
            return ReflectionKt.createRuntimeMessageAdapter$default(type, typeUrl, syntax, null, false, 24, null);
        }

        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> type, String typeUrl, Syntax syntax, ClassLoader classLoader) {
            j.g(type, "type");
            j.g(typeUrl, "typeUrl");
            j.g(syntax, "syntax");
            return ReflectionKt.createRuntimeMessageAdapter$default(type, typeUrl, syntax, classLoader, false, 16, null);
        }

        public final ProtoAdapter<?> get(String adapterString) {
            j.g(adapterString, "adapterString");
            return get(adapterString, ProtoAdapter.class.getClassLoader());
        }

        public final ProtoAdapter<?> get(String adapterString, ClassLoader classLoader) {
            j.g(adapterString, "adapterString");
            try {
                int iE = C2576A.E(adapterString, '#', 0, 6);
                String strSubstring = adapterString.substring(0, iE);
                j.f(strSubstring, "substring(...)");
                String strSubstring2 = adapterString.substring(iE + 1);
                j.f(strSubstring2, "substring(...)");
                Object obj = Class.forName(strSubstring, true, classLoader).getField(strSubstring2).get(null);
                j.e(obj, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
                return (ProtoAdapter) obj;
            } catch (ClassNotFoundException e) {
                throw new IllegalArgumentException("failed to access ".concat(adapterString), e);
            } catch (IllegalAccessException e7) {
                throw new IllegalArgumentException("failed to access ".concat(adapterString), e7);
            } catch (NoSuchFieldException e10) {
                throw new IllegalArgumentException("failed to access ".concat(adapterString), e10);
            }
        }
    }

    static {
        ProtoAdapter<Duration> unsupportedTypeProtoAdapter;
        ProtoAdapter<Instant> unsupportedTypeProtoAdapter2;
        ProtoAdapter<Boolean> protoAdapterCommonBool = ProtoAdapterKt.commonBool();
        BOOL = protoAdapterCommonBool;
        ProtoAdapter<Integer> protoAdapterCommonInt32 = ProtoAdapterKt.commonInt32();
        INT32 = protoAdapterCommonInt32;
        INT32_ARRAY = new IntArrayProtoAdapter(protoAdapterCommonInt32);
        ProtoAdapter<Integer> protoAdapterCommonUint32 = ProtoAdapterKt.commonUint32();
        UINT32 = protoAdapterCommonUint32;
        UINT32_ARRAY = new IntArrayProtoAdapter(protoAdapterCommonUint32);
        ProtoAdapter<Integer> protoAdapterCommonSint32 = ProtoAdapterKt.commonSint32();
        SINT32 = protoAdapterCommonSint32;
        SINT32_ARRAY = new IntArrayProtoAdapter(protoAdapterCommonSint32);
        ProtoAdapter<Integer> protoAdapterCommonFixed32 = ProtoAdapterKt.commonFixed32();
        FIXED32 = protoAdapterCommonFixed32;
        FIXED32_ARRAY = new IntArrayProtoAdapter(protoAdapterCommonFixed32);
        ProtoAdapter<Integer> protoAdapterCommonSfixed32 = ProtoAdapterKt.commonSfixed32();
        SFIXED32 = protoAdapterCommonSfixed32;
        SFIXED32_ARRAY = new IntArrayProtoAdapter(protoAdapterCommonSfixed32);
        ProtoAdapter<Long> protoAdapterCommonInt64 = ProtoAdapterKt.commonInt64();
        INT64 = protoAdapterCommonInt64;
        INT64_ARRAY = new LongArrayProtoAdapter(protoAdapterCommonInt64);
        ProtoAdapter<Long> protoAdapterCommonUint64 = ProtoAdapterKt.commonUint64();
        UINT64 = protoAdapterCommonUint64;
        UINT64_ARRAY = new LongArrayProtoAdapter(protoAdapterCommonUint64);
        ProtoAdapter<Long> protoAdapterCommonSint64 = ProtoAdapterKt.commonSint64();
        SINT64 = protoAdapterCommonSint64;
        SINT64_ARRAY = new LongArrayProtoAdapter(protoAdapterCommonSint64);
        ProtoAdapter<Long> protoAdapterCommonFixed64 = ProtoAdapterKt.commonFixed64();
        FIXED64 = protoAdapterCommonFixed64;
        FIXED64_ARRAY = new LongArrayProtoAdapter(protoAdapterCommonFixed64);
        ProtoAdapter<Long> protoAdapterCommonSfixed64 = ProtoAdapterKt.commonSfixed64();
        SFIXED64 = protoAdapterCommonSfixed64;
        SFIXED64_ARRAY = new LongArrayProtoAdapter(protoAdapterCommonSfixed64);
        FloatProtoAdapter floatProtoAdapterCommonFloat = ProtoAdapterKt.commonFloat();
        FLOAT = floatProtoAdapterCommonFloat;
        FLOAT_ARRAY = new FloatArrayProtoAdapter(floatProtoAdapterCommonFloat);
        DoubleProtoAdapter doubleProtoAdapterCommonDouble = ProtoAdapterKt.commonDouble();
        DOUBLE = doubleProtoAdapterCommonDouble;
        DOUBLE_ARRAY = new DoubleArrayProtoAdapter(doubleProtoAdapterCommonDouble);
        ProtoAdapter<ByteString> protoAdapterCommonBytes = ProtoAdapterKt.commonBytes();
        BYTES = protoAdapterCommonBytes;
        ProtoAdapter<String> protoAdapterCommonString = ProtoAdapterKt.commonString();
        STRING = protoAdapterCommonString;
        EMPTY = ProtoAdapterKt.commonEmpty();
        STRUCT_MAP = ProtoAdapterKt.commonStructMap();
        STRUCT_LIST = ProtoAdapterKt.commonStructList();
        STRUCT_NULL = ProtoAdapterKt.commonStructNull();
        STRUCT_VALUE = ProtoAdapterKt.commonStructValue();
        DOUBLE_VALUE = ProtoAdapterKt.commonWrapper(doubleProtoAdapterCommonDouble, "type.googleapis.com/google.protobuf.DoubleValue");
        FLOAT_VALUE = ProtoAdapterKt.commonWrapper(floatProtoAdapterCommonFloat, "type.googleapis.com/google.protobuf.FloatValue");
        INT64_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonInt64, "type.googleapis.com/google.protobuf.Int64Value");
        UINT64_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonUint64, "type.googleapis.com/google.protobuf.UInt64Value");
        INT32_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonInt32, "type.googleapis.com/google.protobuf.Int32Value");
        UINT32_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonUint32, "type.googleapis.com/google.protobuf.UInt32Value");
        BOOL_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonBool, "type.googleapis.com/google.protobuf.BoolValue");
        STRING_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonString, "type.googleapis.com/google.protobuf.StringValue");
        BYTES_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonBytes, "type.googleapis.com/google.protobuf.BytesValue");
        try {
            unsupportedTypeProtoAdapter = ProtoAdapterKt.commonDuration();
        } catch (NoClassDefFoundError unused) {
            unsupportedTypeProtoAdapter = new Companion.UnsupportedTypeProtoAdapter();
        }
        DURATION = unsupportedTypeProtoAdapter;
        try {
            unsupportedTypeProtoAdapter2 = ProtoAdapterKt.commonInstant();
        } catch (NoClassDefFoundError unused2) {
            unsupportedTypeProtoAdapter2 = new Companion.UnsupportedTypeProtoAdapter();
        }
        INSTANT = unsupportedTypeProtoAdapter2;
    }

    public ProtoAdapter(FieldEncoding fieldEncoding, InterfaceC2488d interfaceC2488d, String str, Syntax syntax, E e, String str2) {
        PackedProtoAdapter packedProtoAdapter;
        FieldEncoding fieldEncoding2;
        j.g(fieldEncoding, "fieldEncoding");
        j.g(syntax, "syntax");
        this.fieldEncoding = fieldEncoding;
        this.type = interfaceC2488d;
        this.typeUrl = str;
        this.syntax = syntax;
        this.identity = e;
        this.sourceFile = str2;
        boolean z4 = this instanceof PackedProtoAdapter;
        RepeatedProtoAdapter repeatedProtoAdapter = null;
        if (z4 || (this instanceof RepeatedProtoAdapter) || fieldEncoding == (fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED)) {
            packedProtoAdapter = null;
        } else {
            if (getFieldEncoding$wire_runtime() == fieldEncoding2) {
                throw new IllegalArgumentException("Unable to pack a length-delimited type.");
            }
            packedProtoAdapter = new PackedProtoAdapter(this);
        }
        this.packedAdapter = packedProtoAdapter;
        if (!(this instanceof RepeatedProtoAdapter) && !z4) {
            repeatedProtoAdapter = new RepeatedProtoAdapter(this);
        }
        this.repeatedAdapter = repeatedProtoAdapter;
    }

    public static final <M extends Message<?, ?>> ProtoAdapter<M> get(M m) {
        return Companion.get(m);
    }

    public static final <E extends WireEnum> EnumAdapter<E> newEnumAdapter(Class<E> cls) {
        return Companion.newEnumAdapter(cls);
    }

    public static final <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
        return Companion.newMapAdapter(protoAdapter, protoAdapter2);
    }

    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls) {
        return Companion.newMessageAdapter(cls);
    }

    public final ProtoAdapter<List<E>> asPacked() {
        if (this.fieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
            throw new IllegalArgumentException("Unable to pack a length-delimited type.");
        }
        ProtoAdapter<List<E>> protoAdapter = this.packedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        throw new UnsupportedOperationException("Can't create a packed adapter from a packed or repeated adapter.");
    }

    public final ProtoAdapter<List<E>> asRepeated() {
        ProtoAdapter<List<E>> protoAdapter = this.repeatedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        throw new UnsupportedOperationException("Can't create a repeated adapter from a repeated or packed adapter.");
    }

    public E decode(ProtoReader32 reader) throws IOException {
        j.g(reader, "reader");
        return decode(reader.asProtoReader());
    }

    public abstract E decode(ProtoReader protoReader) throws IOException;

    public abstract void encode(ProtoWriter protoWriter, E e) throws IOException;

    public final void encode(OutputStream stream, E e) throws IOException {
        j.g(stream, "stream");
        BufferedSink bufferedSinkBuffer = Okio.buffer(Okio.sink(stream));
        encode(bufferedSinkBuffer, e);
        bufferedSinkBuffer.emit();
    }

    public final ByteString encodeByteString(E e) throws IOException {
        Buffer buffer = new Buffer();
        encode(buffer, e);
        return buffer.readByteString();
    }

    public void encodeWithTag(ProtoWriter writer, int i, E e) throws IOException {
        j.g(writer, "writer");
        if (e != null) {
            writer.writeTag(i, getFieldEncoding$wire_runtime());
            if (getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
                writer.writeVarint32(encodedSize(e));
            }
            encode(writer, e);
        }
    }

    public abstract int encodedSize(E e);

    public int encodedSizeWithTag(int i, E e) {
        if (e == null) {
            return 0;
        }
        int iEncodedSize = encodedSize(e);
        if (getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
            iEncodedSize += ProtoWriter.Companion.varint32Size$wire_runtime(iEncodedSize);
        }
        return ProtoWriter.Companion.tagSize$wire_runtime(i) + iEncodedSize;
    }

    public final FieldEncoding getFieldEncoding$wire_runtime() {
        return this.fieldEncoding;
    }

    public final E getIdentity() {
        return this.identity;
    }

    public final ProtoAdapter<List<E>> getPackedAdapter$wire_runtime() {
        return this.packedAdapter;
    }

    public final ProtoAdapter<List<E>> getRepeatedAdapter$wire_runtime() {
        return this.repeatedAdapter;
    }

    public final String getSourceFile() {
        return this.sourceFile;
    }

    public final Syntax getSyntax() {
        return this.syntax;
    }

    public final InterfaceC2488d getType() {
        return this.type;
    }

    public final String getTypeUrl() {
        return this.typeUrl;
    }

    public final boolean isStruct$wire_runtime() {
        return equals(STRUCT_MAP) || equals(STRUCT_LIST) || equals(STRUCT_VALUE) || equals(STRUCT_NULL);
    }

    public abstract E redact(E e);

    public String toString(E e) {
        return String.valueOf(e);
    }

    public final void tryDecode(ProtoReader reader, List<E> destination) throws IOException {
        j.g(reader, "reader");
        j.g(destination, "destination");
        if (reader.beforePossiblyPackedScalar$wire_runtime()) {
            destination.add(decode(reader));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ProtoAdapter<?> withLabel$wire_runtime(WireField.Label label) {
        j.g(label, "label");
        return label.isRepeated() ? label.isPacked() ? asPacked() : asRepeated() : this;
    }

    public static final class EnumConstantNotFoundException extends IllegalArgumentException {
        public final int value;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public EnumConstantNotFoundException(int i, Class<?> type) {
            this(i, z.a(type));
            j.g(type, "type");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public EnumConstantNotFoundException(int i, InterfaceC2488d interfaceC2488d) {
            StringBuilder sbT = s.t(i, "Unknown enum tag ", " for ");
            sbT.append(interfaceC2488d != null ? f.n(interfaceC2488d).getName() : null);
            super(sbT.toString());
            this.value = i;
        }
    }

    public static final <M> ProtoAdapter<M> get(Class<M> cls) {
        return Companion.get(cls);
    }

    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls, String str) {
        return Companion.newMessageAdapter(cls, str);
    }

    public final E decode(InputStream stream) throws IOException {
        j.g(stream, "stream");
        return decode(Okio.buffer(Okio.source(stream)));
    }

    public static final ProtoAdapter<?> get(String str) {
        return Companion.get(str);
    }

    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls, String str, Syntax syntax) {
        return Companion.newMessageAdapter(cls, str, syntax);
    }

    public final E decode(byte[] bytes) throws IOException {
        j.g(bytes, "bytes");
        return decode(ProtoReader32Kt.ProtoReader32$default(bytes, 0, 0, 6, (Object) null));
    }

    public final void tryDecode(ProtoReader32 reader, List<E> destination) throws IOException {
        j.g(reader, "reader");
        j.g(destination, "destination");
        if (reader.beforePossiblyPackedScalar()) {
            destination.add(decode(reader));
        }
    }

    public static final ProtoAdapter<?> get(String str, ClassLoader classLoader) {
        return Companion.get(str, classLoader);
    }

    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls, String str, Syntax syntax, ClassLoader classLoader) {
        return Companion.newMessageAdapter(cls, str, syntax, classLoader);
    }

    public final E decode(ByteString bytes) throws IOException {
        j.g(bytes, "bytes");
        return decode(ProtoReader32Kt.ProtoReader32$default(bytes, 0, 0, 6, (Object) null));
    }

    public void encode(ReverseProtoWriter writer, E e) throws IOException {
        j.g(writer, "writer");
        writer.writeForward$wire_runtime(new ProtoAdapterKt.C13191(this, e));
    }

    public final E decode(BufferedSource source) throws IOException {
        j.g(source, "source");
        return decode(new ProtoReader(source));
    }

    public final void encode(BufferedSink sink, E e) throws IOException {
        j.g(sink, "sink");
        ReverseProtoWriter reverseProtoWriter = new ReverseProtoWriter();
        encode(reverseProtoWriter, e);
        reverseProtoWriter.writeTo(sink);
    }

    public void encodeWithTag(ReverseProtoWriter writer, int i, E e) throws IOException {
        j.g(writer, "writer");
        if (e != null) {
            if (getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
                int byteCount = writer.getByteCount();
                encode(writer, e);
                writer.writeVarint32(writer.getByteCount() - byteCount);
            } else {
                encode(writer, e);
            }
            writer.writeTag(i, getFieldEncoding$wire_runtime());
        }
    }

    public final byte[] encode(E e) throws IOException {
        Buffer buffer = new Buffer();
        encode(buffer, e);
        return buffer.readByteArray();
    }

    public /* synthetic */ ProtoAdapter(FieldEncoding fieldEncoding, InterfaceC2488d interfaceC2488d, String str, Syntax syntax, Object obj, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fieldEncoding, interfaceC2488d, str, syntax, (i & 16) != 0 ? null : obj, (i & 32) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, InterfaceC2488d interfaceC2488d) {
        this(fieldEncoding, interfaceC2488d, (String) null, Syntax.PROTO_2);
        j.g(fieldEncoding, "fieldEncoding");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, InterfaceC2488d interfaceC2488d, String str) {
        this(fieldEncoding, interfaceC2488d, str, Syntax.PROTO_2);
        j.g(fieldEncoding, "fieldEncoding");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, InterfaceC2488d interfaceC2488d, String str, Syntax syntax) {
        this(fieldEncoding, interfaceC2488d, str, syntax, (Object) null);
        j.g(fieldEncoding, "fieldEncoding");
        j.g(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type) {
        this(fieldEncoding, z.a(type));
        j.g(fieldEncoding, "fieldEncoding");
        j.g(type, "type");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type, String str) {
        this(fieldEncoding, z.a(type), str, Syntax.PROTO_2);
        j.g(fieldEncoding, "fieldEncoding");
        j.g(type, "type");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type, String str, Syntax syntax) {
        this(fieldEncoding, z.a(type), str, syntax);
        j.g(fieldEncoding, "fieldEncoding");
        j.g(type, "type");
        j.g(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type, String str, Syntax syntax, E e) {
        this(fieldEncoding, z.a(type), str, syntax, e, (String) null);
        j.g(fieldEncoding, "fieldEncoding");
        j.g(type, "type");
        j.g(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type, String str, Syntax syntax, E e, String str2) {
        this(fieldEncoding, z.a(type), str, syntax, e, str2);
        j.g(fieldEncoding, "fieldEncoding");
        j.g(type, "type");
        j.g(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, InterfaceC2488d interfaceC2488d, String str, Syntax syntax, E e) {
        this(fieldEncoding, interfaceC2488d, str, syntax, e, (String) null);
        j.g(fieldEncoding, "fieldEncoding");
        j.g(syntax, "syntax");
    }
}
