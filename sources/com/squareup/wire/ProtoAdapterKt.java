package com.squareup.wire;

import We.s;
import cj.C1129o;
import cj.L;
import cj.t;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import defpackage.AbstractC1414e;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okhttp3.internal.http2.Http2Connection;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Utf8;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtoAdapterKt {
    private static final int FIXED_32_SIZE = 4;
    private static final int FIXED_64_SIZE = 8;
    private static final int FIXED_BOOL_SIZE = 1;

    /* JADX INFO: renamed from: com.squareup.wire.ProtoAdapterKt$delegateEncode$1, reason: invalid class name and case insensitive filesystem */
    public static final class C13191 implements Function1<ProtoWriter, Unit> {
        final /* synthetic */ ProtoAdapter<E> $this_delegateEncode;
        final /* synthetic */ E $value;

        public C13191(ProtoAdapter<E> protoAdapter, E e) {
            this.$this_delegateEncode = protoAdapter;
            this.$value = e;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IOException {
            invoke((ProtoWriter) obj);
            return Unit.f18162a;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void invoke(ProtoWriter forwardWriter) throws IOException {
            j.g(forwardWriter, "forwardWriter");
            this.$this_delegateEncode.encode(forwardWriter, this.$value);
        }
    }

    public static final ProtoAdapter<Boolean> commonBool() {
        return new ProtoAdapter<Boolean>(FieldEncoding.VARINT, z.a(Boolean.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonBool.1
            {
                Boolean bool = Boolean.FALSE;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Boolean bool) throws IOException {
                encode(protoWriter, bool.booleanValue());
            }

            public int encodedSize(boolean z4) {
                return 1;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Boolean redact(Boolean bool) {
                return redact(bool.booleanValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Boolean bool) throws IOException {
                encode(reverseProtoWriter, bool.booleanValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Boolean bool) {
                return encodedSize(bool.booleanValue());
            }

            public Boolean redact(boolean z4) {
                throw new UnsupportedOperationException();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Boolean decode(ProtoReader reader) {
                j.g(reader, "reader");
                return Boolean.valueOf(reader.readVarint32() != 0);
            }

            public void encode(ProtoWriter writer, boolean z4) throws IOException {
                j.g(writer, "writer");
                writer.writeVarint32(z4 ? 1 : 0);
            }

            public void encode(ReverseProtoWriter writer, boolean z4) throws IOException {
                j.g(writer, "writer");
                writer.writeVarint32(z4 ? 1 : 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Boolean decode(ProtoReader32 reader) {
                j.g(reader, "reader");
                return Boolean.valueOf(reader.readVarint32() != 0);
            }
        };
    }

    public static final ProtoAdapter<ByteString> commonBytes() {
        return new ProtoAdapter<ByteString>(FieldEncoding.LENGTH_DELIMITED, z.a(ByteString.class), Syntax.PROTO_2, ByteString.EMPTY) { // from class: com.squareup.wire.ProtoAdapterKt.commonBytes.1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ByteString value) {
                j.g(value, "value");
                return value.size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ByteString redact(ByteString value) {
                j.g(value, "value");
                throw new UnsupportedOperationException();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ByteString decode(ProtoReader reader) {
                j.g(reader, "reader");
                return reader.readBytes();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ByteString value) throws IOException {
                j.g(writer, "writer");
                j.g(value, "value");
                writer.writeBytes(value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ByteString decode(ProtoReader32 reader) {
                j.g(reader, "reader");
                return reader.readBytes();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ByteString value) throws IOException {
                j.g(writer, "writer");
                j.g(value, "value");
                writer.writeBytes(value);
            }
        };
    }

    public static final <E> ProtoAdapter<List<E>> commonCreatePacked(ProtoAdapter<E> protoAdapter) {
        j.g(protoAdapter, "<this>");
        if (protoAdapter.getFieldEncoding$wire_runtime() != FieldEncoding.LENGTH_DELIMITED) {
            return new PackedProtoAdapter(protoAdapter);
        }
        throw new IllegalArgumentException("Unable to pack a length-delimited type.");
    }

    public static final <E> ProtoAdapter<List<E>> commonCreateRepeated(ProtoAdapter<E> protoAdapter) {
        j.g(protoAdapter, "<this>");
        return new RepeatedProtoAdapter(protoAdapter);
    }

    public static final <E> E commonDecode(ProtoAdapter<E> protoAdapter, byte[] bytes) {
        j.g(protoAdapter, "<this>");
        j.g(bytes, "bytes");
        return protoAdapter.decode(ProtoReader32Kt.ProtoReader32$default(bytes, 0, 0, 6, (Object) null));
    }

    public static final DoubleProtoAdapter commonDouble() {
        return new DoubleProtoAdapter();
    }

    public static final ProtoAdapter<Duration> commonDuration() {
        return new ProtoAdapter<Duration>(FieldEncoding.LENGTH_DELIMITED, z.a(com.shield.android.internal.j.C()), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonDuration.1
            private final int getSameSignNanos(Duration duration) {
                return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getNano() : duration.getNano() - Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            }

            private final long getSameSignSeconds(Duration duration) {
                return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getSeconds() : duration.getSeconds() + 1;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Duration duration) throws IOException {
                encode2(protoWriter, com.shield.android.internal.j.p(duration));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Duration duration) {
                return encodedSize2(com.shield.android.internal.j.p(duration));
            }

            /* JADX INFO: renamed from: redact, reason: avoid collision after fix types in other method */
            public Duration redact2(Duration value) {
                j.g(value, "value");
                return value;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Duration duration) throws IOException {
                encode2(reverseProtoWriter, com.shield.android.internal.j.p(duration));
            }

            /* JADX INFO: renamed from: encodedSize, reason: avoid collision after fix types in other method */
            public int encodedSize2(Duration value) {
                j.g(value, "value");
                long sameSignSeconds = getSameSignSeconds(value);
                int iEncodedSizeWithTag = sameSignSeconds != 0 ? ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(sameSignSeconds)) : 0;
                int sameSignNanos = getSameSignNanos(value);
                return sameSignNanos != 0 ? ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(sameSignNanos)) + iEncodedSizeWithTag : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Duration redact(Duration duration) {
                return redact2(com.shield.android.internal.j.p(duration));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Duration decode(ProtoReader reader) throws IOException {
                j.g(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                long jLongValue = 0;
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(jBeginMessage);
                        Duration durationOfSeconds = Duration.ofSeconds(jLongValue, iIntValue);
                        j.f(durationOfSeconds, "ofSeconds(...)");
                        return durationOfSeconds;
                    }
                    if (iNextTag == 1) {
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (iNextTag != 2) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    }
                }
            }

            /* JADX INFO: renamed from: encode, reason: avoid collision after fix types in other method */
            public void encode2(ProtoWriter writer, Duration value) throws IOException {
                j.g(writer, "writer");
                j.g(value, "value");
                long sameSignSeconds = getSameSignSeconds(value);
                if (sameSignSeconds != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(sameSignSeconds));
                }
                int sameSignNanos = getSameSignNanos(value);
                if (sameSignNanos != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(sameSignNanos));
                }
            }

            /* JADX INFO: renamed from: encode, reason: avoid collision after fix types in other method */
            public void encode2(ReverseProtoWriter writer, Duration value) throws IOException {
                j.g(writer, "writer");
                j.g(value, "value");
                int sameSignNanos = getSameSignNanos(value);
                if (sameSignNanos != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(sameSignNanos));
                }
                long sameSignSeconds = getSameSignSeconds(value);
                if (sameSignSeconds != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(sameSignSeconds));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Duration decode(ProtoReader32 reader) throws IOException {
                j.g(reader, "reader");
                int iBeginMessage = reader.beginMessage();
                long jLongValue = 0;
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(iBeginMessage);
                        Duration durationOfSeconds = Duration.ofSeconds(jLongValue, iIntValue);
                        j.f(durationOfSeconds, "ofSeconds(...)");
                        return durationOfSeconds;
                    }
                    if (iNextTag == 1) {
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (iNextTag != 2) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    }
                }
            }
        };
    }

    public static final ProtoAdapter<Unit> commonEmpty() {
        return new ProtoAdapter<Unit>(FieldEncoding.LENGTH_DELIMITED, z.a(Unit.class), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonEmpty.1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Unit decode(ProtoReader32 protoReader32) throws IOException {
                decode2(protoReader32);
                return Unit.f18162a;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Unit value) {
                j.g(writer, "writer");
                j.g(value, "value");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Unit value) {
                j.g(value, "value");
                return 0;
            }

            /* JADX INFO: renamed from: redact, reason: avoid collision after fix types in other method */
            public void redact2(Unit value) {
                j.g(value, "value");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Unit decode(ProtoReader protoReader) throws IOException {
                decode2(protoReader);
                return Unit.f18162a;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Unit value) {
                j.g(writer, "writer");
                j.g(value, "value");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Unit redact(Unit unit) {
                redact2(unit);
                return Unit.f18162a;
            }

            /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
            public void decode2(ProtoReader reader) throws IOException {
                j.g(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        reader.endMessageAndGetUnknownFields(jBeginMessage);
                        return;
                    }
                }
            }

            /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
            public void decode2(ProtoReader32 reader) throws IOException {
                j.g(reader, "reader");
                int iBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        reader.endMessageAndGetUnknownFields(iBeginMessage);
                        return;
                    }
                }
            }
        };
    }

    public static final <E> void commonEncode(ProtoAdapter<E> protoAdapter, BufferedSink sink, E e) throws IOException {
        j.g(protoAdapter, "<this>");
        j.g(sink, "sink");
        ReverseProtoWriter reverseProtoWriter = new ReverseProtoWriter();
        protoAdapter.encode(reverseProtoWriter, e);
        reverseProtoWriter.writeTo(sink);
    }

    public static final <E> ByteString commonEncodeByteString(ProtoAdapter<E> protoAdapter, E e) throws IOException {
        j.g(protoAdapter, "<this>");
        Buffer buffer = new Buffer();
        protoAdapter.encode(buffer, e);
        return buffer.readByteString();
    }

    public static final <E> void commonEncodeWithTag(ProtoAdapter<E> protoAdapter, ProtoWriter writer, int i, E e) throws IOException {
        j.g(protoAdapter, "<this>");
        j.g(writer, "writer");
        if (e == null) {
            return;
        }
        writer.writeTag(i, protoAdapter.getFieldEncoding$wire_runtime());
        if (protoAdapter.getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
            writer.writeVarint32(protoAdapter.encodedSize(e));
        }
        protoAdapter.encode(writer, e);
    }

    public static final <E> int commonEncodedSizeWithTag(ProtoAdapter<E> protoAdapter, int i, E e) {
        j.g(protoAdapter, "<this>");
        if (e == null) {
            return 0;
        }
        int iEncodedSize = protoAdapter.encodedSize(e);
        if (protoAdapter.getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
            iEncodedSize += ProtoWriter.Companion.varint32Size$wire_runtime(iEncodedSize);
        }
        return ProtoWriter.Companion.tagSize$wire_runtime(i) + iEncodedSize;
    }

    public static final ProtoAdapter<Integer> commonFixed32() {
        return new ProtoAdapter<Integer>(FieldEncoding.FIXED32, z.a(Integer.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonFixed32.1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) throws IOException {
                encode(protoWriter, num.intValue());
            }

            public int encodedSize(int i) {
                return 4;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) throws IOException {
                encode(reverseProtoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            public Integer redact(int i) {
                throw new UnsupportedOperationException();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader reader) {
                j.g(reader, "reader");
                return Integer.valueOf(reader.readFixed32());
            }

            public void encode(ProtoWriter writer, int i) throws IOException {
                j.g(writer, "writer");
                writer.writeFixed32(i);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader32 reader) {
                j.g(reader, "reader");
                return Integer.valueOf(reader.readFixed32());
            }

            public void encode(ReverseProtoWriter writer, int i) throws IOException {
                j.g(writer, "writer");
                writer.writeFixed32(i);
            }
        };
    }

    public static final ProtoAdapter<Long> commonFixed64() {
        return new ProtoAdapter<Long>(FieldEncoding.FIXED64, z.a(Long.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonFixed64.1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l6) throws IOException {
                encode(protoWriter, l6.longValue());
            }

            public int encodedSize(long j) {
                return 8;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l6) {
                return redact(l6.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l6) throws IOException {
                encode(reverseProtoWriter, l6.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l6) {
                return encodedSize(l6.longValue());
            }

            public Long redact(long j) {
                throw new UnsupportedOperationException();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader reader) {
                j.g(reader, "reader");
                return Long.valueOf(reader.readFixed64());
            }

            public void encode(ProtoWriter writer, long j) throws IOException {
                j.g(writer, "writer");
                writer.writeFixed64(j);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader32 reader) {
                j.g(reader, "reader");
                return Long.valueOf(reader.readFixed64());
            }

            public void encode(ReverseProtoWriter writer, long j) throws IOException {
                j.g(writer, "writer");
                writer.writeFixed64(j);
            }
        };
    }

    public static final FloatProtoAdapter commonFloat() {
        return new FloatProtoAdapter();
    }

    public static final ProtoAdapter<Instant> commonInstant() {
        return new ProtoAdapter<Instant>(FieldEncoding.LENGTH_DELIMITED, z.a(com.shield.android.internal.j.y()), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonInstant.1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Instant instant) throws IOException {
                encode2(protoWriter, com.shield.android.internal.j.r(instant));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Instant instant) {
                return encodedSize2(com.shield.android.internal.j.r(instant));
            }

            /* JADX INFO: renamed from: redact, reason: avoid collision after fix types in other method */
            public Instant redact2(Instant value) {
                j.g(value, "value");
                return value;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Instant instant) throws IOException {
                encode2(reverseProtoWriter, com.shield.android.internal.j.r(instant));
            }

            /* JADX INFO: renamed from: encodedSize, reason: avoid collision after fix types in other method */
            public int encodedSize2(Instant value) {
                j.g(value, "value");
                long epochSecond = value.getEpochSecond();
                int iEncodedSizeWithTag = epochSecond != 0 ? ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(epochSecond)) : 0;
                int nano = value.getNano();
                return nano != 0 ? ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(nano)) + iEncodedSizeWithTag : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Instant redact(Instant instant) {
                return redact2(com.shield.android.internal.j.r(instant));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Instant decode(ProtoReader reader) throws IOException {
                j.g(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                long jLongValue = 0;
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(jBeginMessage);
                        Instant instantOfEpochSecond = Instant.ofEpochSecond(jLongValue, iIntValue);
                        j.f(instantOfEpochSecond, "ofEpochSecond(...)");
                        return instantOfEpochSecond;
                    }
                    if (iNextTag == 1) {
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (iNextTag != 2) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    }
                }
            }

            /* JADX INFO: renamed from: encode, reason: avoid collision after fix types in other method */
            public void encode2(ProtoWriter writer, Instant value) throws IOException {
                j.g(writer, "writer");
                j.g(value, "value");
                long epochSecond = value.getEpochSecond();
                if (epochSecond != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(epochSecond));
                }
                int nano = value.getNano();
                if (nano != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(nano));
                }
            }

            /* JADX INFO: renamed from: encode, reason: avoid collision after fix types in other method */
            public void encode2(ReverseProtoWriter writer, Instant value) throws IOException {
                j.g(writer, "writer");
                j.g(value, "value");
                int nano = value.getNano();
                if (nano != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(nano));
                }
                long epochSecond = value.getEpochSecond();
                if (epochSecond != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(epochSecond));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Instant decode(ProtoReader32 reader) throws IOException {
                j.g(reader, "reader");
                int iBeginMessage = reader.beginMessage();
                long jLongValue = 0;
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(iBeginMessage);
                        Instant instantOfEpochSecond = Instant.ofEpochSecond(jLongValue, iIntValue);
                        j.f(instantOfEpochSecond, "ofEpochSecond(...)");
                        return instantOfEpochSecond;
                    }
                    if (iNextTag == 1) {
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (iNextTag != 2) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    }
                }
            }
        };
    }

    public static final ProtoAdapter<Integer> commonInt32() {
        return new ProtoAdapter<Integer>(FieldEncoding.VARINT, z.a(Integer.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonInt32.1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) throws IOException {
                encode(protoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) throws IOException {
                encode(reverseProtoWriter, num.intValue());
            }

            public int encodedSize(int i) {
                return ProtoWriter.Companion.int32Size$wire_runtime(i);
            }

            public Integer redact(int i) {
                throw new UnsupportedOperationException();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader reader) {
                j.g(reader, "reader");
                return Integer.valueOf(reader.readVarint32());
            }

            public void encode(ProtoWriter writer, int i) throws IOException {
                j.g(writer, "writer");
                writer.writeSignedVarint32$wire_runtime(i);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader32 reader) {
                j.g(reader, "reader");
                return Integer.valueOf(reader.readVarint32());
            }

            public void encode(ReverseProtoWriter writer, int i) throws IOException {
                j.g(writer, "writer");
                writer.writeSignedVarint32$wire_runtime(i);
            }
        };
    }

    public static final ProtoAdapter<Long> commonInt64() {
        return new ProtoAdapter<Long>(FieldEncoding.VARINT, z.a(Long.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonInt64.1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l6) throws IOException {
                encode(protoWriter, l6.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l6) {
                return encodedSize(l6.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l6) {
                return redact(l6.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l6) throws IOException {
                encode(reverseProtoWriter, l6.longValue());
            }

            public int encodedSize(long j) {
                return ProtoWriter.Companion.varint64Size$wire_runtime(j);
            }

            public Long redact(long j) {
                throw new UnsupportedOperationException();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader reader) {
                j.g(reader, "reader");
                return Long.valueOf(reader.readVarint64());
            }

            public void encode(ProtoWriter writer, long j) throws IOException {
                j.g(writer, "writer");
                writer.writeVarint64(j);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader32 reader) {
                j.g(reader, "reader");
                return Long.valueOf(reader.readVarint64());
            }

            public void encode(ReverseProtoWriter writer, long j) throws IOException {
                j.g(writer, "writer");
                writer.writeVarint64(j);
            }
        };
    }

    public static final <K, V> ProtoAdapter<Map<K, V>> commonNewMapAdapter(ProtoAdapter<K> keyAdapter, ProtoAdapter<V> valueAdapter) {
        j.g(keyAdapter, "keyAdapter");
        j.g(valueAdapter, "valueAdapter");
        return new MapProtoAdapter(keyAdapter, valueAdapter);
    }

    public static final ProtoAdapter<Integer> commonSfixed32() {
        return commonFixed32();
    }

    public static final ProtoAdapter<Long> commonSfixed64() {
        return commonFixed64();
    }

    public static final ProtoAdapter<Integer> commonSint32() {
        return new ProtoAdapter<Integer>(FieldEncoding.VARINT, z.a(Integer.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonSint32.1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) throws IOException {
                encode(protoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) throws IOException {
                encode(reverseProtoWriter, num.intValue());
            }

            public int encodedSize(int i) {
                ProtoWriter.Companion companion = ProtoWriter.Companion;
                return companion.varint32Size$wire_runtime(companion.encodeZigZag32$wire_runtime(i));
            }

            public Integer redact(int i) {
                throw new UnsupportedOperationException();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader reader) {
                j.g(reader, "reader");
                return Integer.valueOf(ProtoWriter.Companion.decodeZigZag32$wire_runtime(reader.readVarint32()));
            }

            public void encode(ProtoWriter writer, int i) throws IOException {
                j.g(writer, "writer");
                writer.writeVarint32(ProtoWriter.Companion.encodeZigZag32$wire_runtime(i));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader32 reader) {
                j.g(reader, "reader");
                return Integer.valueOf(ProtoWriter.Companion.decodeZigZag32$wire_runtime(reader.readVarint32()));
            }

            public void encode(ReverseProtoWriter writer, int i) throws IOException {
                j.g(writer, "writer");
                writer.writeVarint32(ProtoWriter.Companion.encodeZigZag32$wire_runtime(i));
            }
        };
    }

    public static final ProtoAdapter<Long> commonSint64() {
        return new ProtoAdapter<Long>(FieldEncoding.VARINT, z.a(Long.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonSint64.1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l6) throws IOException {
                encode(protoWriter, l6.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l6) {
                return encodedSize(l6.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l6) {
                return redact(l6.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l6) throws IOException {
                encode(reverseProtoWriter, l6.longValue());
            }

            public int encodedSize(long j) {
                ProtoWriter.Companion companion = ProtoWriter.Companion;
                return companion.varint64Size$wire_runtime(companion.encodeZigZag64$wire_runtime(j));
            }

            public Long redact(long j) {
                throw new UnsupportedOperationException();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader reader) {
                j.g(reader, "reader");
                return Long.valueOf(ProtoWriter.Companion.decodeZigZag64$wire_runtime(reader.readVarint64()));
            }

            public void encode(ProtoWriter writer, long j) throws IOException {
                j.g(writer, "writer");
                writer.writeVarint64(ProtoWriter.Companion.encodeZigZag64$wire_runtime(j));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader32 reader) {
                j.g(reader, "reader");
                return Long.valueOf(ProtoWriter.Companion.decodeZigZag64$wire_runtime(reader.readVarint64()));
            }

            public void encode(ReverseProtoWriter writer, long j) throws IOException {
                j.g(writer, "writer");
                writer.writeVarint64(ProtoWriter.Companion.encodeZigZag64$wire_runtime(j));
            }
        };
    }

    public static final ProtoAdapter<String> commonString() {
        return new ProtoAdapter<String>(FieldEncoding.LENGTH_DELIMITED, z.a(String.class), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonString.1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(String value) {
                j.g(value, "value");
                return (int) Utf8.size$default(value, 0, 0, 3, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public String redact(String value) {
                j.g(value, "value");
                throw new UnsupportedOperationException();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public String decode(ProtoReader reader) {
                j.g(reader, "reader");
                return reader.readString();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, String value) throws IOException {
                j.g(writer, "writer");
                j.g(value, "value");
                writer.writeString(value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public String decode(ProtoReader32 reader) {
                j.g(reader, "reader");
                return reader.readString();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, String value) throws IOException {
                j.g(writer, "writer");
                j.g(value, "value");
                writer.writeString(value);
            }
        };
    }

    public static final ProtoAdapter<List<?>> commonStructList() {
        return new ProtoAdapter<List<?>>(FieldEncoding.LENGTH_DELIMITED, z.a(Map.class), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonStructList.1
            @Override // com.squareup.wire.ProtoAdapter
            public List<?> decode(ProtoReader protoReader) throws IOException {
                ArrayList arrayListJ = AbstractC1414e.j(protoReader, "reader");
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag == -1) {
                        protoReader.endMessageAndGetUnknownFields(jBeginMessage);
                        return arrayListJ;
                    }
                    if (iNextTag != 1) {
                        protoReader.skip();
                    } else {
                        arrayListJ.add(ProtoAdapter.STRUCT_VALUE.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(List<?> list) {
                int iEncodedSizeWithTag = 0;
                if (list == null) {
                    return 0;
                }
                Iterator<?> it = list.iterator();
                while (it.hasNext()) {
                    iEncodedSizeWithTag += ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(1, it.next());
                }
                return iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public List<Object> redact(List<?> list) {
                if (list == null) {
                    return null;
                }
                List<?> list2 = list;
                ArrayList arrayList = new ArrayList(t.l(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(ProtoAdapter.STRUCT_VALUE.redact(it.next()));
                }
                return arrayList;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, List<?> list) throws IOException {
                j.g(writer, "writer");
                if (list == null) {
                    return;
                }
                Iterator<?> it = list.iterator();
                while (it.hasNext()) {
                    ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 1, it.next());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, List<?> list) throws IOException {
                j.g(writer, "writer");
                if (list == null) {
                    return;
                }
                for (int size = list.size() - 1; -1 < size; size--) {
                    ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 1, list.get(size));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public List<?> decode(ProtoReader32 reader) throws IOException {
                j.g(reader, "reader");
                ArrayList arrayList = new ArrayList();
                int iBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(iBeginMessage);
                        return arrayList;
                    }
                    if (iNextTag != 1) {
                        reader.skip();
                    } else {
                        arrayList.add(ProtoAdapter.STRUCT_VALUE.decode(reader));
                    }
                }
            }
        };
    }

    public static final ProtoAdapter<Map<String, ?>> commonStructMap() {
        return new ProtoAdapter<Map<String, ?>>(FieldEncoding.LENGTH_DELIMITED, z.a(Map.class), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonStructMap.1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Map<String, ?> map) {
                int iVarint32Size$wire_runtime = 0;
                if (map == null) {
                    return 0;
                }
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    int iEncodedSizeWithTag = ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(2, value) + ProtoAdapter.STRING.encodedSizeWithTag(1, key);
                    ProtoWriter.Companion companion = ProtoWriter.Companion;
                    iVarint32Size$wire_runtime += companion.varint32Size$wire_runtime(iEncodedSizeWithTag) + companion.tagSize$wire_runtime(1) + iEncodedSizeWithTag;
                }
                return iVarint32Size$wire_runtime;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Map<String, Object> redact(Map<String, ?> map) {
                if (map == null) {
                    return null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(L.b(map.size()));
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), ProtoAdapter.STRUCT_VALUE.redact(entry));
                }
                return linkedHashMap;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Map<String, ?> decode(ProtoReader reader) throws IOException {
                j.g(reader, "reader");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(jBeginMessage);
                        return linkedHashMap;
                    }
                    if (iNextTag != 1) {
                        reader.skip();
                    } else {
                        long jBeginMessage2 = reader.beginMessage();
                        String strDecode = null;
                        Object objDecode = null;
                        while (true) {
                            int iNextTag2 = reader.nextTag();
                            if (iNextTag2 == -1) {
                                break;
                            }
                            if (iNextTag2 == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag2 != 2) {
                                reader.readUnknownField(iNextTag2);
                            } else {
                                objDecode = ProtoAdapter.STRUCT_VALUE.decode(reader);
                            }
                        }
                        reader.endMessageAndGetUnknownFields(jBeginMessage2);
                        if (strDecode != null) {
                            linkedHashMap.put(strDecode, objDecode);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Map<String, ?> map) throws IOException {
                j.g(writer, "writer");
                if (map == null) {
                    return;
                }
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, key);
                    ProtoAdapter<Object> protoAdapter2 = ProtoAdapter.STRUCT_VALUE;
                    int iEncodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(2, value) + iEncodedSizeWithTag;
                    writer.writeTag(1, FieldEncoding.LENGTH_DELIMITED);
                    writer.writeVarint32(iEncodedSizeWithTag2);
                    protoAdapter.encodeWithTag(writer, 1, key);
                    protoAdapter2.encodeWithTag(writer, 2, value);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Map<String, ?> map) throws IOException {
                j.g(writer, "writer");
                if (map == null) {
                    return;
                }
                Map.Entry[] entryArr = (Map.Entry[]) map.entrySet().toArray(new Map.Entry[0]);
                C1129o.x(entryArr);
                for (Map.Entry entry : entryArr) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    int byteCount = writer.getByteCount();
                    ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 2, value);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, str);
                    writer.writeVarint32(writer.getByteCount() - byteCount);
                    writer.writeTag(1, FieldEncoding.LENGTH_DELIMITED);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Map<String, ?> decode(ProtoReader32 reader) throws IOException {
                j.g(reader, "reader");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int iBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(iBeginMessage);
                        return linkedHashMap;
                    }
                    if (iNextTag != 1) {
                        reader.skip();
                    } else {
                        int iBeginMessage2 = reader.beginMessage();
                        String strDecode = null;
                        Object objDecode = null;
                        while (true) {
                            int iNextTag2 = reader.nextTag();
                            if (iNextTag2 == -1) {
                                break;
                            }
                            if (iNextTag2 == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag2 != 2) {
                                reader.readUnknownField(iNextTag2);
                            } else {
                                objDecode = ProtoAdapter.STRUCT_VALUE.decode(reader);
                            }
                        }
                        reader.endMessageAndGetUnknownFields(iBeginMessage2);
                        if (strDecode != null) {
                            linkedHashMap.put(strDecode, objDecode);
                        }
                    }
                }
            }
        };
    }

    public static final ProtoAdapter commonStructNull() {
        return new ProtoAdapter(FieldEncoding.VARINT, z.a(Void.class), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonStructNull.1
            @Override // com.squareup.wire.ProtoAdapter
            public Void redact(Void r1) {
                return null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Void r22) {
                return ProtoWriter.Companion.varint32Size$wire_runtime(0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSizeWithTag(int i, Void r32) {
                int iEncodedSize = encodedSize(r32);
                ProtoWriter.Companion companion = ProtoWriter.Companion;
                return companion.varint32Size$wire_runtime(iEncodedSize) + companion.tagSize$wire_runtime(i);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void decode(ProtoReader reader) throws IOException {
                j.g(reader, "reader");
                int varint32 = reader.readVarint32();
                if (varint32 == 0) {
                    return null;
                }
                throw new IOException(s.f(varint32, "expected 0 but was "));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Void r22) throws IOException {
                j.g(writer, "writer");
                writer.writeVarint32(0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ProtoWriter writer, int i, Void r42) throws IOException {
                j.g(writer, "writer");
                writer.writeTag(i, getFieldEncoding$wire_runtime());
                encode(writer, r42);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Void r22) throws IOException {
                j.g(writer, "writer");
                writer.writeVarint32(0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ReverseProtoWriter writer, int i, Void r42) throws IOException {
                j.g(writer, "writer");
                encode(writer, r42);
                writer.writeTag(i, getFieldEncoding$wire_runtime());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void decode(ProtoReader32 reader) throws IOException {
                j.g(reader, "reader");
                int varint32 = reader.readVarint32();
                if (varint32 == 0) {
                    return null;
                }
                throw new IOException(s.f(varint32, "expected 0 but was "));
            }
        };
    }

    public static final ProtoAdapter<Object> commonStructValue() {
        return new ProtoAdapter<Object>(FieldEncoding.LENGTH_DELIMITED, z.a(Object.class), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonStructValue.1
            @Override // com.squareup.wire.ProtoAdapter
            public Object decode(ProtoReader reader) throws IOException {
                j.g(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Object objDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(jBeginMessage);
                        return objDecode;
                    }
                    switch (iNextTag) {
                        case 1:
                            objDecode = ProtoAdapter.STRUCT_NULL.decode(reader);
                            break;
                        case 2:
                            objDecode = ProtoAdapter.DOUBLE.decode(reader);
                            break;
                        case 3:
                            objDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            objDecode = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 5:
                            objDecode = ProtoAdapter.STRUCT_MAP.decode(reader);
                            break;
                        case 6:
                            objDecode = ProtoAdapter.STRUCT_LIST.decode(reader);
                            break;
                        default:
                            reader.skip();
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Object obj) throws IOException {
                j.g(writer, "writer");
                if (obj == null) {
                    ProtoAdapter.STRUCT_NULL.encodeWithTag(writer, 1, obj);
                    return;
                }
                if (obj instanceof Number) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, Double.valueOf(((Number) obj).doubleValue()));
                    return;
                }
                if (obj instanceof String) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, obj);
                    return;
                }
                if (obj instanceof Boolean) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, obj);
                    return;
                }
                if (obj instanceof Map) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 5, (Map<String, ?>) obj);
                } else if (obj instanceof List) {
                    ProtoAdapter.STRUCT_LIST.encodeWithTag(writer, 6, obj);
                } else {
                    throw new IllegalArgumentException("unexpected struct value: " + obj);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ProtoWriter writer, int i, Object obj) throws IOException {
                j.g(writer, "writer");
                if (obj != null) {
                    super.encodeWithTag(writer, i, obj);
                    return;
                }
                writer.writeTag(i, getFieldEncoding$wire_runtime());
                writer.writeVarint32(encodedSize(obj));
                encode(writer, obj);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Object obj) {
                if (obj == null) {
                    return ProtoAdapter.STRUCT_NULL.encodedSizeWithTag(1, obj);
                }
                if (obj instanceof Number) {
                    return ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(((Number) obj).doubleValue()));
                }
                if (obj instanceof String) {
                    return ProtoAdapter.STRING.encodedSizeWithTag(3, obj);
                }
                if (obj instanceof Boolean) {
                    return ProtoAdapter.BOOL.encodedSizeWithTag(4, obj);
                }
                if (obj instanceof Map) {
                    return ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(5, (Map) obj);
                }
                if (obj instanceof List) {
                    return ProtoAdapter.STRUCT_LIST.encodedSizeWithTag(6, obj);
                }
                throw new IllegalArgumentException("unexpected struct value: " + obj);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSizeWithTag(int i, Object obj) {
                if (obj != null) {
                    return super.encodedSizeWithTag(i, obj);
                }
                int iEncodedSize = encodedSize(obj);
                ProtoWriter.Companion companion = ProtoWriter.Companion;
                return companion.varint32Size$wire_runtime(iEncodedSize) + companion.tagSize$wire_runtime(i) + iEncodedSize;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Object redact(Object obj) {
                if (obj == null) {
                    return ProtoAdapter.STRUCT_NULL.redact(obj);
                }
                if (obj instanceof Number) {
                    return obj;
                }
                if (obj instanceof String) {
                    return null;
                }
                if (obj instanceof Boolean) {
                    return obj;
                }
                if (obj instanceof Map) {
                    return ProtoAdapter.STRUCT_MAP.redact((Map) obj);
                }
                if (obj instanceof List) {
                    return ProtoAdapter.STRUCT_LIST.redact(obj);
                }
                throw new IllegalArgumentException("unexpected struct value: " + obj);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ReverseProtoWriter writer, int i, Object obj) throws IOException {
                j.g(writer, "writer");
                if (obj == null) {
                    int byteCount = writer.getByteCount();
                    encode(writer, obj);
                    writer.writeVarint32(writer.getByteCount() - byteCount);
                    writer.writeTag(i, getFieldEncoding$wire_runtime());
                    return;
                }
                super.encodeWithTag(writer, i, obj);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Object obj) throws IOException {
                j.g(writer, "writer");
                if (obj == null) {
                    ProtoAdapter.STRUCT_NULL.encodeWithTag(writer, 1, obj);
                    return;
                }
                if (obj instanceof Number) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, Double.valueOf(((Number) obj).doubleValue()));
                    return;
                }
                if (obj instanceof String) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, obj);
                    return;
                }
                if (obj instanceof Boolean) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, obj);
                    return;
                }
                if (obj instanceof Map) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 5, (Map<String, ?>) obj);
                } else if (obj instanceof List) {
                    ProtoAdapter.STRUCT_LIST.encodeWithTag(writer, 6, obj);
                } else {
                    throw new IllegalArgumentException("unexpected struct value: " + obj);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Object decode(ProtoReader32 reader) throws IOException {
                j.g(reader, "reader");
                int iBeginMessage = reader.beginMessage();
                Object objDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                objDecode = ProtoAdapter.STRUCT_NULL.decode(reader);
                                break;
                            case 2:
                                objDecode = ProtoAdapter.DOUBLE.decode(reader);
                                break;
                            case 3:
                                objDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                objDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 5:
                                objDecode = ProtoAdapter.STRUCT_MAP.decode(reader);
                                break;
                            case 6:
                                objDecode = ProtoAdapter.STRUCT_LIST.decode(reader);
                                break;
                            default:
                                reader.skip();
                                break;
                        }
                    } else {
                        reader.endMessageAndGetUnknownFields(iBeginMessage);
                        return objDecode;
                    }
                }
            }
        };
    }

    public static final <E> String commonToString(E e) {
        return String.valueOf(e);
    }

    public static final <E> void commonTryDecode(ProtoAdapter<E> protoAdapter, ProtoReader reader, List<E> destination) {
        j.g(protoAdapter, "<this>");
        j.g(reader, "reader");
        j.g(destination, "destination");
        if (reader.beforePossiblyPackedScalar$wire_runtime()) {
            destination.add(protoAdapter.decode(reader));
        }
    }

    public static final ProtoAdapter<Integer> commonUint32() {
        return new ProtoAdapter<Integer>(FieldEncoding.VARINT, z.a(Integer.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonUint32.1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) throws IOException {
                encode(protoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) throws IOException {
                encode(reverseProtoWriter, num.intValue());
            }

            public int encodedSize(int i) {
                return ProtoWriter.Companion.varint32Size$wire_runtime(i);
            }

            public Integer redact(int i) {
                throw new UnsupportedOperationException();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader reader) {
                j.g(reader, "reader");
                return Integer.valueOf(reader.readVarint32());
            }

            public void encode(ProtoWriter writer, int i) throws IOException {
                j.g(writer, "writer");
                writer.writeVarint32(i);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader32 reader) {
                j.g(reader, "reader");
                return Integer.valueOf(reader.readVarint32());
            }

            public void encode(ReverseProtoWriter writer, int i) throws IOException {
                j.g(writer, "writer");
                writer.writeVarint32(i);
            }
        };
    }

    public static final ProtoAdapter<Long> commonUint64() {
        return new ProtoAdapter<Long>(FieldEncoding.VARINT, z.a(Long.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonUint64.1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l6) throws IOException {
                encode(protoWriter, l6.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l6) {
                return encodedSize(l6.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l6) {
                return redact(l6.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l6) throws IOException {
                encode(reverseProtoWriter, l6.longValue());
            }

            public int encodedSize(long j) {
                return ProtoWriter.Companion.varint64Size$wire_runtime(j);
            }

            public Long redact(long j) {
                throw new UnsupportedOperationException();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader reader) {
                j.g(reader, "reader");
                return Long.valueOf(reader.readVarint64());
            }

            public void encode(ProtoWriter writer, long j) throws IOException {
                j.g(writer, "writer");
                writer.writeVarint64(j);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader32 reader) {
                j.g(reader, "reader");
                return Long.valueOf(reader.readVarint64());
            }

            public void encode(ReverseProtoWriter writer, long j) throws IOException {
                j.g(writer, "writer");
                writer.writeVarint64(j);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> ProtoAdapter<?> commonWithLabel(ProtoAdapter<E> protoAdapter, WireField.Label label) {
        j.g(protoAdapter, "<this>");
        j.g(label, "label");
        return label.isRepeated() ? label.isPacked() ? protoAdapter.asPacked() : protoAdapter.asRepeated() : protoAdapter;
    }

    public static final <T> ProtoAdapter<T> commonWrapper(final ProtoAdapter<T> delegate, String typeUrl) {
        j.g(delegate, "delegate");
        j.g(typeUrl, "typeUrl");
        return new ProtoAdapter<T>(typeUrl, FieldEncoding.LENGTH_DELIMITED, delegate.getType(), Syntax.PROTO_3, delegate.getIdentity()) { // from class: com.squareup.wire.ProtoAdapterKt.commonWrapper.1
            @Override // com.squareup.wire.ProtoAdapter
            public T decode(ProtoReader reader) throws IOException {
                j.g(reader, "reader");
                T identity = delegate.getIdentity();
                ProtoAdapter<T> protoAdapter = delegate;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(jBeginMessage);
                        return identity;
                    }
                    if (iNextTag == 1) {
                        identity = protoAdapter.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, T t5) throws IOException {
                j.g(writer, "writer");
                if (t5 == null || t5.equals(delegate.getIdentity())) {
                    return;
                }
                delegate.encodeWithTag(writer, 1, t5);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(T t5) {
                if (t5 == null || t5.equals(delegate.getIdentity())) {
                    return 0;
                }
                return delegate.encodedSizeWithTag(1, t5);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public T redact(T t5) {
                if (t5 == null) {
                    return null;
                }
                return delegate.redact(t5);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, T t5) throws IOException {
                j.g(writer, "writer");
                if (t5 == null || t5.equals(delegate.getIdentity())) {
                    return;
                }
                delegate.encodeWithTag(writer, 1, t5);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public T decode(ProtoReader32 reader) throws IOException {
                j.g(reader, "reader");
                T identity = delegate.getIdentity();
                ProtoAdapter<T> protoAdapter = delegate;
                int iBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(iBeginMessage);
                        return identity;
                    }
                    if (iNextTag == 1) {
                        identity = protoAdapter.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    public static final <E> void delegateEncode(ProtoAdapter<E> protoAdapter, ReverseProtoWriter writer, E e) throws IOException {
        j.g(protoAdapter, "<this>");
        j.g(writer, "writer");
        writer.writeForward$wire_runtime(new C13191(protoAdapter, e));
    }

    public static final <E> E commonDecode(ProtoAdapter<E> protoAdapter, ByteString bytes) {
        j.g(protoAdapter, "<this>");
        j.g(bytes, "bytes");
        return protoAdapter.decode(ProtoReader32Kt.ProtoReader32$default(bytes, 0, 0, 6, (Object) null));
    }

    public static final <E> E commonDecode(ProtoAdapter<E> protoAdapter, BufferedSource source) {
        j.g(protoAdapter, "<this>");
        j.g(source, "source");
        return protoAdapter.decode(new ProtoReader(source));
    }

    public static final <E> void commonTryDecode(ProtoAdapter<E> protoAdapter, ProtoReader32 reader, List<E> destination) {
        j.g(protoAdapter, "<this>");
        j.g(reader, "reader");
        j.g(destination, "destination");
        if (reader.beforePossiblyPackedScalar()) {
            destination.add(protoAdapter.decode(reader));
        }
    }

    public static final <E> byte[] commonEncode(ProtoAdapter<E> protoAdapter, E e) throws IOException {
        j.g(protoAdapter, "<this>");
        Buffer buffer = new Buffer();
        protoAdapter.encode(buffer, e);
        return buffer.readByteArray();
    }

    public static final <E> void commonEncodeWithTag(ProtoAdapter<E> protoAdapter, ReverseProtoWriter writer, int i, E e) throws IOException {
        j.g(protoAdapter, "<this>");
        j.g(writer, "writer");
        if (e == null) {
            return;
        }
        if (protoAdapter.getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
            int byteCount = writer.getByteCount();
            protoAdapter.encode(writer, e);
            writer.writeVarint32(writer.getByteCount() - byteCount);
        } else {
            protoAdapter.encode(writer, e);
        }
        writer.writeTag(i, protoAdapter.getFieldEncoding$wire_runtime());
    }
}
