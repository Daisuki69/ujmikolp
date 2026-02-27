package com.squareup.wire.internal;

import X5.f;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import okio.ByteString;
import xj.InterfaceC2488d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class JsonIntegration<F, A> {

    public static final class ByteStringJsonFormatter implements JsonFormatter<ByteString> {
        public static final ByteStringJsonFormatter INSTANCE = new ByteStringJsonFormatter();

        private ByteStringJsonFormatter() {
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public ByteString fromString(String value) {
            j.g(value, "value");
            return ByteString.Companion.decodeBase64(value);
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public String toStringOrNumber(ByteString value) {
            j.g(value, "value");
            return value.base64();
        }
    }

    public static final class IntAsStringJsonFormatter implements JsonFormatter<Integer> {
        public static final IntAsStringJsonFormatter INSTANCE = new IntAsStringJsonFormatter();

        private IntAsStringJsonFormatter() {
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Integer num) {
            return toStringOrNumber(num.intValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public Integer fromString(String value) {
            j.g(value, "value");
            return Integer.valueOf(Integer.parseInt(value));
        }

        public String toStringOrNumber(int i) {
            return String.valueOf(i);
        }
    }

    public static final class LongAsStringJsonFormatter implements JsonFormatter<Long> {
        public static final LongAsStringJsonFormatter INSTANCE = new LongAsStringJsonFormatter();

        private LongAsStringJsonFormatter() {
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Long l6) {
            return toStringOrNumber(l6.longValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public Long fromString(String value) {
            long jLongValueExact;
            j.g(value, "value");
            try {
                jLongValueExact = Long.parseLong(value);
            } catch (Exception unused) {
                jLongValueExact = new BigDecimal(value).longValueExact();
            }
            return Long.valueOf(jLongValueExact);
        }

        public String toStringOrNumber(long j) {
            return String.valueOf(j);
        }
    }

    public static final class StringJsonFormatter implements JsonFormatter<String> {
        public static final StringJsonFormatter INSTANCE = new StringJsonFormatter();

        private StringJsonFormatter() {
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public String fromString(String value) {
            j.g(value, "value");
            return value;
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public String toStringOrNumber(String value) {
            j.g(value, "value");
            return value;
        }
    }

    public static final class UnsignedIntAsNumberJsonFormatter implements JsonFormatter<Integer> {
        public static final UnsignedIntAsNumberJsonFormatter INSTANCE = new UnsignedIntAsNumberJsonFormatter();
        private static final long maxInt = 2147483647L;
        private static final long power32 = 4294967296L;

        private UnsignedIntAsNumberJsonFormatter() {
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Integer num) {
            return toStringOrNumber(num.intValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public Integer fromString(String value) {
            j.g(value, "value");
            long j = (long) Double.parseDouble(value);
            if (j >= maxInt) {
                j -= power32;
            }
            return Integer.valueOf((int) j);
        }

        public Object toStringOrNumber(int i) {
            return i < 0 ? Long.valueOf(((long) i) + power32) : Integer.valueOf(i);
        }
    }

    public static final class UnsignedIntAsStringJsonFormatter implements JsonFormatter<Integer> {
        public static final UnsignedIntAsStringJsonFormatter INSTANCE = new UnsignedIntAsStringJsonFormatter();
        private static final long power32 = 4294967296L;

        private UnsignedIntAsStringJsonFormatter() {
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Integer num) {
            return toStringOrNumber(num.intValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public Integer fromString(String value) {
            j.g(value, "value");
            return Integer.valueOf((int) Long.parseLong(value));
        }

        public Object toStringOrNumber(int i) {
            return i < 0 ? String.valueOf(((long) i) + power32) : String.valueOf(i);
        }
    }

    public static final class UnsignedLongAsNumberJsonFormatter implements JsonFormatter<Long> {
        public static final UnsignedLongAsNumberJsonFormatter INSTANCE = new UnsignedLongAsNumberJsonFormatter();
        private static final BigInteger power64 = new BigInteger("18446744073709551616");
        private static final BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE);

        private UnsignedLongAsNumberJsonFormatter() {
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Long l6) {
            return toStringOrNumber(l6.longValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public Long fromString(String value) {
            BigInteger bigInteger;
            j.g(value, "value");
            try {
                bigInteger = new BigInteger(value);
            } catch (Exception unused) {
                bigInteger = new BigDecimal(value).toBigInteger();
            }
            return Long.valueOf(bigInteger.compareTo(maxLong) > 0 ? bigInteger.subtract(power64).longValue() : bigInteger.longValue());
        }

        public Object toStringOrNumber(long j) {
            return j < 0 ? power64.add(BigInteger.valueOf(j)) : Long.valueOf(j);
        }
    }

    public static final class UnsignedLongAsStringJsonFormatter implements JsonFormatter<Long> {
        public static final UnsignedLongAsStringJsonFormatter INSTANCE = new UnsignedLongAsStringJsonFormatter();

        private UnsignedLongAsStringJsonFormatter() {
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Long l6) {
            return toStringOrNumber(l6.longValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public Long fromString(String value) {
            j.g(value, "value");
            return UnsignedLongAsNumberJsonFormatter.INSTANCE.fromString(value);
        }

        public String toStringOrNumber(long j) {
            return UnsignedLongAsNumberJsonFormatter.INSTANCE.toStringOrNumber(j).toString();
        }
    }

    private final <M, B> A jsonAdapter(F f, Syntax syntax, FieldOrOneOfBinding<M, B> fieldOrOneOfBinding) {
        A aFrameworkAdapter;
        if (fieldOrOneOfBinding.getSingleAdapter().isStruct$wire_runtime()) {
            return structAdapter(f);
        }
        JsonFormatter<?> jsonFormatter = jsonFormatter(syntax, fieldOrOneOfBinding.getSingleAdapter());
        if (jsonFormatter != null) {
            aFrameworkAdapter = formatterAdapter(jsonFormatter);
        } else {
            InterfaceC2488d type = fieldOrOneOfBinding.getSingleAdapter().getType();
            Class clsO = type != null ? f.o(type) : null;
            j.e(clsO, "null cannot be cast to non-null type java.lang.reflect.Type");
            aFrameworkAdapter = frameworkAdapter(f, clsO);
        }
        return fieldOrOneOfBinding.getLabel().isRepeated() ? listAdapter(aFrameworkAdapter) : fieldOrOneOfBinding.isMap() ? mapAdapter(f, mapKeyJsonFormatter(fieldOrOneOfBinding.getKeyAdapter()), aFrameworkAdapter) : aFrameworkAdapter;
    }

    private final JsonFormatter<?> jsonFormatter(Syntax syntax, ProtoAdapter<?> protoAdapter) {
        if (j.b(protoAdapter, ProtoAdapter.BYTES) || j.b(protoAdapter, ProtoAdapter.BYTES_VALUE)) {
            return ByteStringJsonFormatter.INSTANCE;
        }
        if (j.b(protoAdapter, ProtoAdapter.DURATION)) {
            return DurationJsonFormatter.INSTANCE;
        }
        if (j.b(protoAdapter, ProtoAdapter.INSTANT)) {
            return InstantJsonFormatter.INSTANCE;
        }
        if (protoAdapter instanceof EnumAdapter) {
            return new EnumJsonFormatter((EnumAdapter) protoAdapter);
        }
        if (syntax == Syntax.PROTO_2) {
            if (j.b(protoAdapter, ProtoAdapter.UINT64) || j.b(protoAdapter, ProtoAdapter.UINT64_VALUE)) {
                return UnsignedLongAsNumberJsonFormatter.INSTANCE;
            }
            return null;
        }
        if (j.b(protoAdapter, ProtoAdapter.UINT32) || j.b(protoAdapter, ProtoAdapter.FIXED32) || j.b(protoAdapter, ProtoAdapter.UINT32_VALUE)) {
            return UnsignedIntAsNumberJsonFormatter.INSTANCE;
        }
        if (j.b(protoAdapter, ProtoAdapter.INT64) || j.b(protoAdapter, ProtoAdapter.SFIXED64) || j.b(protoAdapter, ProtoAdapter.SINT64) || j.b(protoAdapter, ProtoAdapter.INT64_VALUE)) {
            return LongAsStringJsonFormatter.INSTANCE;
        }
        if (j.b(protoAdapter, ProtoAdapter.FIXED64) || j.b(protoAdapter, ProtoAdapter.UINT64) || j.b(protoAdapter, ProtoAdapter.UINT64_VALUE)) {
            return UnsignedLongAsStringJsonFormatter.INSTANCE;
        }
        return null;
    }

    private final JsonFormatter<?> mapKeyJsonFormatter(ProtoAdapter<?> protoAdapter) {
        if (j.b(protoAdapter, ProtoAdapter.STRING)) {
            return StringJsonFormatter.INSTANCE;
        }
        if (j.b(protoAdapter, ProtoAdapter.INT32) || j.b(protoAdapter, ProtoAdapter.SINT32) || j.b(protoAdapter, ProtoAdapter.SFIXED32)) {
            return IntAsStringJsonFormatter.INSTANCE;
        }
        if (j.b(protoAdapter, ProtoAdapter.FIXED32) || j.b(protoAdapter, ProtoAdapter.UINT32)) {
            return UnsignedIntAsStringJsonFormatter.INSTANCE;
        }
        if (j.b(protoAdapter, ProtoAdapter.INT64) || j.b(protoAdapter, ProtoAdapter.SFIXED64) || j.b(protoAdapter, ProtoAdapter.SINT64)) {
            return LongAsStringJsonFormatter.INSTANCE;
        }
        if (j.b(protoAdapter, ProtoAdapter.FIXED64) || j.b(protoAdapter, ProtoAdapter.UINT64)) {
            return UnsignedLongAsStringJsonFormatter.INSTANCE;
        }
        throw new IllegalStateException(("Unexpected map key type: " + protoAdapter.getType()).toString());
    }

    public abstract A formatterAdapter(JsonFormatter<?> jsonFormatter);

    public abstract A frameworkAdapter(F f, Type type);

    public final <M, B> List<A> jsonAdapters(RuntimeMessageAdapter<M, B> adapter, F f) {
        j.g(adapter, "adapter");
        FieldOrOneOfBinding<M, B>[] fieldOrOneOfBindingArr = (FieldOrOneOfBinding[]) adapter.getFields().values().toArray(new FieldOrOneOfBinding[0]);
        ArrayList arrayList = new ArrayList(fieldOrOneOfBindingArr.length);
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : fieldOrOneOfBindingArr) {
            arrayList.add(jsonAdapter(f, adapter.getSyntax(), fieldOrOneOfBinding));
        }
        return arrayList;
    }

    public abstract A listAdapter(A a8);

    public abstract A mapAdapter(F f, JsonFormatter<?> jsonFormatter, A a8);

    public abstract A structAdapter(F f);
}
