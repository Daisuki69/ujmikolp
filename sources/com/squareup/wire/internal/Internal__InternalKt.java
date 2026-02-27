package com.squareup.wire.internal;

import We.s;
import androidx.media3.exoplayer.upstream.CmcdData;
import cj.C1110A;
import cj.C1112C;
import cj.L;
import cj.M;
import cj.t;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoReader32;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kj.AbstractC1785b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import xj.InterfaceC2488d;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class Internal__InternalKt {
    private static final String ESCAPED_CHARS = ",[]{}\\";

    /* JADX INFO: renamed from: com.squareup.wire.internal.Internal__InternalKt$sanitize$2, reason: invalid class name */
    public /* synthetic */ class AnonymousClass2 extends i implements Function1<String, String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1, Internal__InternalKt.class, "sanitize", "sanitize(Ljava/lang/String;)Ljava/lang/String;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String p02) {
            j.g(p02, "p0");
            return Internal.sanitize(p02);
        }
    }

    /* JADX INFO: renamed from: -redactElements, reason: not valid java name */
    public static final <T> List<T> m188redactElements(List<? extends T> list, ProtoAdapter<T> adapter) {
        j.g(list, "<this>");
        j.g(adapter, "adapter");
        List<? extends T> list2 = list;
        ArrayList arrayList = new ArrayList(t.l(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(adapter.redact(it.next()));
        }
        return arrayList;
    }

    public static final String boxedOneOfClassName(String oneOfName) {
        j.g(oneOfName, "oneOfName");
        if (oneOfName.length() <= 0) {
            return oneOfName;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = oneOfName.charAt(0);
        String strValueOf = String.valueOf(cCharAt);
        j.e(strValueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = strValueOf.toUpperCase(locale);
        j.f(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            upperCase = String.valueOf(Character.toTitleCase(cCharAt));
        } else if (cCharAt != 329) {
            char cCharAt2 = upperCase.charAt(0);
            String strSubstring = upperCase.substring(1);
            j.f(strSubstring, "substring(...)");
            String lowerCase = strSubstring.toLowerCase(locale);
            j.f(lowerCase, "toLowerCase(...)");
            upperCase = cCharAt2 + lowerCase;
        }
        sb2.append((Object) upperCase);
        String strSubstring2 = oneOfName.substring(1);
        j.f(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        return sb2.toString();
    }

    public static final String boxedOneOfKeyFieldName(String oneOfName, String fieldName) {
        j.g(oneOfName, "oneOfName");
        j.g(fieldName, "fieldName");
        String upperCase = (oneOfName + '_' + fieldName).toUpperCase(Locale.ROOT);
        j.f(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static final String boxedOneOfKeysFieldName(String oneOfName) {
        j.g(oneOfName, "oneOfName");
        String upperCase = oneOfName.concat("_keys").toUpperCase(Locale.ROOT);
        j.f(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static final void checkElementsNotNull(List<?> list) {
        j.g(list, "list");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == null) {
                throw new NullPointerException(s.g(i, "Element at index ", " is null"));
            }
        }
    }

    public static final boolean commonEquals(Instant instant, Object obj) {
        j.g(instant, "<this>");
        if (instant == obj) {
            return true;
        }
        return obj != null && com.shield.android.internal.j.w(obj) && instant.getEpochSecond() == com.shield.android.internal.j.r(obj).getEpochSecond() && instant.getNano() == com.shield.android.internal.j.r(obj).getNano();
    }

    public static final int commonHashCode(Instant instant) {
        j.g(instant, "<this>");
        long epochSecond = instant.getEpochSecond();
        return instant.getNano() + (((int) (epochSecond ^ (epochSecond >>> 32))) * 31);
    }

    public static final <T> List<T> copyOf(String name, List<? extends T> list) {
        j.g(name, "name");
        j.d(list);
        return Internal.copyOf(list);
    }

    public static final int countNonNull(Object obj, Object obj2) {
        return (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0);
    }

    public static final double decodePrimitive_double(ProtoReader32 reader) {
        j.g(reader, "reader");
        return Double.longBitsToDouble(reader.readFixed64());
    }

    public static final int decodePrimitive_fixed32(ProtoReader32 reader) {
        j.g(reader, "reader");
        return reader.readFixed32();
    }

    public static final long decodePrimitive_fixed64(ProtoReader32 reader) {
        j.g(reader, "reader");
        return reader.readFixed64();
    }

    public static final float decodePrimitive_float(ProtoReader32 reader) {
        j.g(reader, "reader");
        return Float.intBitsToFloat(reader.readFixed32());
    }

    public static final int decodePrimitive_int32(ProtoReader32 reader) {
        j.g(reader, "reader");
        return reader.readVarint32();
    }

    public static final long decodePrimitive_int64(ProtoReader32 reader) {
        j.g(reader, "reader");
        return reader.readVarint64();
    }

    public static final int decodePrimitive_sfixed32(ProtoReader32 reader) {
        j.g(reader, "reader");
        return reader.readFixed32();
    }

    public static final long decodePrimitive_sfixed64(ProtoReader32 reader) {
        j.g(reader, "reader");
        return reader.readFixed64();
    }

    public static final int decodePrimitive_sint32(ProtoReader32 reader) {
        j.g(reader, "reader");
        return ProtoWriter.Companion.decodeZigZag32$wire_runtime(reader.readVarint32());
    }

    public static final long decodePrimitive_sint64(ProtoReader32 reader) {
        j.g(reader, "reader");
        return ProtoWriter.Companion.decodeZigZag64$wire_runtime(reader.readVarint64());
    }

    public static final int decodePrimitive_uint32(ProtoReader32 reader) {
        j.g(reader, "reader");
        return reader.readVarint32();
    }

    public static final long decodePrimitive_uint64(ProtoReader32 reader) {
        j.g(reader, "reader");
        return reader.readVarint64();
    }

    public static final void encodeArray_double(double[] array, ReverseProtoWriter writer, int i) {
        j.g(array, "array");
        j.g(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeFixed64(Double.doubleToLongBits(array[length]));
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_fixed32(int[] array, ReverseProtoWriter writer, int i) {
        j.g(array, "array");
        j.g(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeFixed32(array[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_fixed64(long[] array, ReverseProtoWriter writer, int i) {
        j.g(array, "array");
        j.g(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeFixed64(array[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_float(float[] array, ReverseProtoWriter writer, int i) {
        j.g(array, "array");
        j.g(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeFixed32(Float.floatToIntBits(array[length]));
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_int32(int[] array, ReverseProtoWriter writer, int i) {
        j.g(array, "array");
        j.g(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeSignedVarint32$wire_runtime(array[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_int64(long[] array, ReverseProtoWriter writer, int i) {
        j.g(array, "array");
        j.g(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeVarint64(array[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_sfixed32(int[] array, ReverseProtoWriter writer, int i) {
        j.g(array, "array");
        j.g(writer, "writer");
        Internal.encodeArray_fixed32(array, writer, i);
    }

    public static final void encodeArray_sfixed64(long[] array, ReverseProtoWriter writer, int i) {
        j.g(array, "array");
        j.g(writer, "writer");
        Internal.encodeArray_fixed64(array, writer, i);
    }

    public static final void encodeArray_sint32(int[] array, ReverseProtoWriter writer, int i) {
        j.g(array, "array");
        j.g(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeVarint32(ProtoWriter.Companion.encodeZigZag32$wire_runtime(array[length]));
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_sint64(long[] array, ReverseProtoWriter writer, int i) {
        j.g(array, "array");
        j.g(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeVarint64(ProtoWriter.Companion.encodeZigZag64$wire_runtime(array[length]));
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_uint32(int[] array, ReverseProtoWriter writer, int i) {
        j.g(array, "array");
        j.g(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeVarint32(array[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_uint64(long[] array, ReverseProtoWriter writer, int i) {
        j.g(array, "array");
        j.g(writer, "writer");
        Internal.encodeArray_int64(array, writer, i);
    }

    public static final boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private static final InterfaceC2488d getTypeName$Internal__InternalKt(Object obj) {
        return z.a(obj.getClass());
    }

    public static final <T> List<T> immutableCopyOf(String name, List<? extends T> list) {
        j.g(name, "name");
        j.g(list, "list");
        if (list instanceof MutableOnWriteList) {
            list = (List<T>) ((MutableOnWriteList) list).getMutableList$wire_runtime();
        }
        if (list == C1112C.f9377a || (list instanceof ImmutableList)) {
            return (List<T>) list;
        }
        ImmutableList immutableList = new ImmutableList(list);
        if (immutableList.contains(null)) {
            throw new IllegalArgumentException(name.concat(".contains(null)").toString());
        }
        return immutableList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> immutableCopyOfMapWithStructValues(String name, Map<K, ? extends V> map) {
        j.g(name, "name");
        j.g(map, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key == null) {
                throw new IllegalArgumentException(name.concat(".containsKey(null)").toString());
            }
            linkedHashMap.put(key, Internal.immutableCopyOfStruct(name, value));
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        j.f(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T immutableCopyOfStruct(String name, T t5) {
        j.g(name, "name");
        if (t5 == 0 || (t5 instanceof Boolean) || (t5 instanceof Double) || (t5 instanceof String)) {
            return t5;
        }
        if (t5 instanceof List) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) t5).iterator();
            while (it.hasNext()) {
                arrayList.add(Internal.immutableCopyOfStruct(name, it.next()));
            }
            T t10 = (T) Collections.unmodifiableList(arrayList);
            j.f(t10, "unmodifiableList(...)");
            return t10;
        }
        if (!(t5 instanceof Map)) {
            StringBuilder sbW = s.w("struct value ", name, " must be a JSON type (null, Boolean, Double, String, List, or Map) but was ");
            sbW.append(getTypeName$Internal__InternalKt(t5));
            sbW.append(": ");
            sbW.append(t5);
            throw new IllegalArgumentException(sbW.toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) t5).entrySet()) {
            linkedHashMap.put(Internal.immutableCopyOfStruct(name, entry.getKey()), Internal.immutableCopyOfStruct(name, entry.getValue()));
        }
        T t11 = (T) Collections.unmodifiableMap(linkedHashMap);
        j.f(t11, "unmodifiableMap(...)");
        return t11;
    }

    public static final IllegalStateException missingRequiredFields(Object... args) {
        j.g(args, "args");
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        int iA = AbstractC1785b.a(0, args.length - 1, 2);
        String str = "";
        if (iA >= 0) {
            while (true) {
                if (args[i] == null) {
                    if (sb2.length() > 0) {
                        str = CmcdData.Factory.STREAMING_FORMAT_SS;
                    }
                    sb2.append("\n  ");
                    sb2.append(args[i + 1]);
                }
                if (i == iA) {
                    break;
                }
                i += 2;
            }
        }
        String string = sb2.toString();
        j.f(string, "toString(...)");
        throw new IllegalStateException(s.k("Required field", str, " not set:", string));
    }

    public static final <T> List<T> newMutableList() {
        return new MutableOnWriteList(C1112C.f9377a);
    }

    public static final <K, V> Map<K, V> newMutableMap() {
        return new LinkedHashMap();
    }

    public static final String sanitize(String value) {
        j.g(value, "value");
        StringBuilder sb2 = new StringBuilder(value.length());
        for (int i = 0; i < value.length(); i++) {
            char cCharAt = value.charAt(i);
            if (C2576A.y(ESCAPED_CHARS, cCharAt)) {
                sb2.append('\\');
            }
            sb2.append(cCharAt);
        }
        String string = sb2.toString();
        j.f(string, "toString(...)");
        return string;
    }

    public static final <K, V> Map<K, V> copyOf(String name, Map<K, ? extends V> map) {
        j.g(name, "name");
        j.d(map);
        return Internal.copyOf(map);
    }

    public static final int countNonNull(Object obj, Object obj2, Object obj3) {
        return (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0) + (obj3 != null ? 1 : 0);
    }

    public static final double decodePrimitive_double(ProtoReader reader) {
        j.g(reader, "reader");
        return Double.longBitsToDouble(reader.readFixed64());
    }

    public static final int decodePrimitive_fixed32(ProtoReader reader) {
        j.g(reader, "reader");
        return reader.readFixed32();
    }

    public static final long decodePrimitive_fixed64(ProtoReader reader) {
        j.g(reader, "reader");
        return reader.readFixed64();
    }

    public static final float decodePrimitive_float(ProtoReader reader) {
        j.g(reader, "reader");
        return Float.intBitsToFloat(reader.readFixed32());
    }

    public static final int decodePrimitive_int32(ProtoReader reader) {
        j.g(reader, "reader");
        return reader.readVarint32();
    }

    public static final long decodePrimitive_int64(ProtoReader reader) {
        j.g(reader, "reader");
        return reader.readVarint64();
    }

    public static final int decodePrimitive_sfixed32(ProtoReader reader) {
        j.g(reader, "reader");
        return reader.readFixed32();
    }

    public static final long decodePrimitive_sfixed64(ProtoReader reader) {
        j.g(reader, "reader");
        return reader.readFixed64();
    }

    public static final int decodePrimitive_sint32(ProtoReader reader) {
        j.g(reader, "reader");
        return ProtoWriter.Companion.decodeZigZag32$wire_runtime(reader.readVarint32());
    }

    public static final long decodePrimitive_sint64(ProtoReader reader) {
        j.g(reader, "reader");
        return ProtoWriter.Companion.decodeZigZag64$wire_runtime(reader.readVarint64());
    }

    public static final int decodePrimitive_uint32(ProtoReader reader) {
        j.g(reader, "reader");
        return reader.readVarint32();
    }

    public static final long decodePrimitive_uint64(ProtoReader reader) {
        j.g(reader, "reader");
        return reader.readVarint64();
    }

    public static final int commonHashCode(Duration duration) {
        j.g(duration, "<this>");
        long seconds = duration.getSeconds();
        return duration.getNano() + (((int) (seconds ^ (seconds >>> 32))) * 31);
    }

    public static final <K, V> Map<K, V> copyOf(Map<K, ? extends V> map) {
        j.g(map, "map");
        return new LinkedHashMap(map);
    }

    public static final int countNonNull(Object obj, Object obj2, Object obj3, Object obj4, Object... rest) {
        j.g(rest, "rest");
        int i = obj != null ? 1 : 0;
        if (obj2 != null) {
            i++;
        }
        if (obj3 != null) {
            i++;
        }
        if (obj4 != null) {
            i++;
        }
        for (Object obj5 : rest) {
            if (obj5 != null) {
                i++;
            }
        }
        return i;
    }

    public static final boolean commonEquals(Duration duration, Object obj) {
        j.g(duration, "<this>");
        if (duration == obj) {
            return true;
        }
        return obj != null && com.shield.android.internal.j.B(obj) && duration.getSeconds() == com.shield.android.internal.j.p(obj).getSeconds() && duration.getNano() == com.shield.android.internal.j.p(obj).getNano();
    }

    public static final <T> List<T> copyOf(List<? extends T> list) {
        j.g(list, "list");
        if (list != C1112C.f9377a && !(list instanceof ImmutableList)) {
            return new ArrayList(list);
        }
        return new MutableOnWriteList(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: -redactElements, reason: not valid java name */
    public static final <K, V> Map<K, V> m189redactElements(Map<K, ? extends V> map, ProtoAdapter<V> adapter) {
        j.g(map, "<this>");
        j.g(adapter, "adapter");
        LinkedHashMap linkedHashMap = new LinkedHashMap(L.b(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), adapter.redact(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static final String sanitize(List<String> values) {
        j.g(values, "values");
        return C1110A.F(values, null, "[", "]", AnonymousClass2.INSTANCE, 25);
    }

    public static final <K, V> Map<K, V> immutableCopyOf(String name, Map<K, ? extends V> map) {
        j.g(name, "name");
        j.g(map, "map");
        if (map.isEmpty()) {
            return M.e();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Set<K> setKeySet = linkedHashMap.keySet();
        j.e(setKeySet, "null cannot be cast to non-null type kotlin.collections.Collection<K of com.squareup.wire.internal.Internal__InternalKt.immutableCopyOf?>");
        if (!setKeySet.contains(null)) {
            Collection<V> collectionValues = linkedHashMap.values();
            j.e(collectionValues, "null cannot be cast to non-null type kotlin.collections.Collection<V of com.squareup.wire.internal.Internal__InternalKt.immutableCopyOf?>");
            if (!collectionValues.contains(null)) {
                Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
                j.f(mapUnmodifiableMap, "unmodifiableMap(...)");
                return mapUnmodifiableMap;
            }
            throw new IllegalArgumentException(name.concat(".containsValue(null)").toString());
        }
        throw new IllegalArgumentException(name.concat(".containsKey(null)").toString());
    }

    public static final void checkElementsNotNull(Map<?, ?> map) {
        j.g(map, "map");
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null) {
                throw new NullPointerException("map.containsKey(null)");
            }
            if (value == null) {
                throw new NullPointerException("Value for key " + key + " is null");
            }
        }
    }
}
