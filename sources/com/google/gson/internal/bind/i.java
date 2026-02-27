package com.google.gson.internal.bind;

import We.s;
import com.dynatrace.android.agent.Global;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.j;
import com.google.gson.o;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.google.gson.z;
import d4.AbstractC1331a;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final z f9955A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final z f9956B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f9957a = new TypeAdapters$29(Class.class, new y() { // from class: com.google.gson.internal.bind.TypeAdapters$1
        @Override // com.google.gson.y
        public final Object read(j3.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported"));
        }

        @Override // com.google.gson.y
        public final void write(j3.b bVar, Object obj) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported"));
        }
    }.nullSafe());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f9958b = new TypeAdapters$29(BitSet.class, new y() { // from class: com.google.gson.internal.bind.TypeAdapters$2
        @Override // com.google.gson.y
        public final Object read(j3.a aVar) throws IOException {
            boolean z4;
            BitSet bitSet = new BitSet();
            aVar.b();
            int iPeek = aVar.peek();
            int i4 = 0;
            while (iPeek != 2) {
                int iC = AbstractC2217b.c(iPeek);
                if (iC == 5 || iC == 6) {
                    int iC2 = aVar.C();
                    if (iC2 == 0) {
                        z4 = false;
                    } else {
                        if (iC2 != 1) {
                            StringBuilder sbT = s.t(iC2, "Invalid bitset value ", ", expected 0 or 1; at path ");
                            sbT.append(aVar.r());
                            throw new JsonSyntaxException(sbT.toString());
                        }
                        z4 = true;
                    }
                } else {
                    if (iC != 7) {
                        throw new JsonSyntaxException("Invalid bitset value type: " + AbstractC1331a.x(iPeek) + "; at path " + aVar.getPath());
                    }
                    z4 = aVar.z();
                }
                if (z4) {
                    bitSet.set(i4);
                }
                i4++;
                iPeek = aVar.peek();
            }
            aVar.i();
            return bitSet;
        }

        @Override // com.google.gson.y
        public final void write(j3.b bVar, Object obj) throws IOException {
            BitSet bitSet = (BitSet) obj;
            bVar.c();
            int length = bitSet.length();
            for (int i4 = 0; i4 < length; i4++) {
                bVar.B(bitSet.get(i4) ? 1L : 0L);
            }
            bVar.i();
        }
    }.nullSafe());
    public static final y c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f9959d;
    public static final z e;
    public static final z f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z f9960g;
    public static final z h;
    public static final z i;
    public static final z j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final y f9961k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final z f9962l;
    public static final y m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final y f9963n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final y f9964o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final z f9965p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final z f9966q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final z f9967r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final z f9968s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final z f9969t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final z f9970u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final z f9971v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final z f9972w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final z f9973x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final z f9974y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final y f9975z;

    static {
        y yVar = new y() { // from class: com.google.gson.internal.bind.TypeAdapters$3
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) {
                int iPeek = aVar.peek();
                if (iPeek != 9) {
                    return iPeek == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.I())) : Boolean.valueOf(aVar.z());
                }
                aVar.G();
                return null;
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                bVar.C((Boolean) obj);
            }
        };
        c = new y() { // from class: com.google.gson.internal.bind.TypeAdapters$4
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) {
                if (aVar.peek() != 9) {
                    return Boolean.valueOf(aVar.I());
                }
                aVar.G();
                return null;
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                Boolean bool = (Boolean) obj;
                bVar.E(bool == null ? "null" : bool.toString());
            }
        };
        f9959d = new TypeAdapters$30(Boolean.TYPE, Boolean.class, yVar);
        e = new TypeAdapters$30(Byte.TYPE, Byte.class, new y() { // from class: com.google.gson.internal.bind.TypeAdapters$5
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) throws IOException {
                if (aVar.peek() == 9) {
                    aVar.G();
                    return null;
                }
                try {
                    int iC = aVar.C();
                    if (iC <= 255 && iC >= -128) {
                        return Byte.valueOf((byte) iC);
                    }
                    StringBuilder sbT = s.t(iC, "Lossy conversion from ", " to byte; at path ");
                    sbT.append(aVar.r());
                    throw new JsonSyntaxException(sbT.toString());
                } catch (NumberFormatException e7) {
                    throw new JsonSyntaxException(e7);
                }
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                if (((Number) obj) == null) {
                    bVar.r();
                } else {
                    bVar.B(r4.byteValue());
                }
            }
        });
        f = new TypeAdapters$30(Short.TYPE, Short.class, new y() { // from class: com.google.gson.internal.bind.TypeAdapters$6
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) throws IOException {
                if (aVar.peek() == 9) {
                    aVar.G();
                    return null;
                }
                try {
                    int iC = aVar.C();
                    if (iC <= 65535 && iC >= -32768) {
                        return Short.valueOf((short) iC);
                    }
                    StringBuilder sbT = s.t(iC, "Lossy conversion from ", " to short; at path ");
                    sbT.append(aVar.r());
                    throw new JsonSyntaxException(sbT.toString());
                } catch (NumberFormatException e7) {
                    throw new JsonSyntaxException(e7);
                }
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                if (((Number) obj) == null) {
                    bVar.r();
                } else {
                    bVar.B(r4.shortValue());
                }
            }
        });
        f9960g = new TypeAdapters$30(Integer.TYPE, Integer.class, new y() { // from class: com.google.gson.internal.bind.TypeAdapters$7
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) {
                if (aVar.peek() == 9) {
                    aVar.G();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.C());
                } catch (NumberFormatException e7) {
                    throw new JsonSyntaxException(e7);
                }
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                if (((Number) obj) == null) {
                    bVar.r();
                } else {
                    bVar.B(r4.intValue());
                }
            }
        });
        h = new TypeAdapters$29(AtomicInteger.class, new y() { // from class: com.google.gson.internal.bind.TypeAdapters$8
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) {
                try {
                    return new AtomicInteger(aVar.C());
                } catch (NumberFormatException e7) {
                    throw new JsonSyntaxException(e7);
                }
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                bVar.B(((AtomicInteger) obj).get());
            }
        }.nullSafe());
        i = new TypeAdapters$29(AtomicBoolean.class, new y() { // from class: com.google.gson.internal.bind.TypeAdapters$9
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) {
                return new AtomicBoolean(aVar.z());
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                bVar.F(((AtomicBoolean) obj).get());
            }
        }.nullSafe());
        j = new TypeAdapters$29(AtomicIntegerArray.class, new y() { // from class: com.google.gson.internal.bind.TypeAdapters$10
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                aVar.b();
                while (aVar.t()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.C()));
                    } catch (NumberFormatException e7) {
                        throw new JsonSyntaxException(e7);
                    }
                }
                aVar.i();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i4 = 0; i4 < size; i4++) {
                    atomicIntegerArray.set(i4, ((Integer) arrayList.get(i4)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                bVar.c();
                int length = ((AtomicIntegerArray) obj).length();
                for (int i4 = 0; i4 < length; i4++) {
                    bVar.B(r6.get(i4));
                }
                bVar.i();
            }
        }.nullSafe());
        f9961k = new y() { // from class: com.google.gson.internal.bind.TypeAdapters$11
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) {
                if (aVar.peek() == 9) {
                    aVar.G();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.D());
                } catch (NumberFormatException e7) {
                    throw new JsonSyntaxException(e7);
                }
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    bVar.r();
                } else {
                    bVar.B(number.longValue());
                }
            }
        };
        new y() { // from class: com.google.gson.internal.bind.TypeAdapters$12
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) {
                if (aVar.peek() != 9) {
                    return Float.valueOf((float) aVar.B());
                }
                aVar.G();
                return null;
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    bVar.r();
                    return;
                }
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(numberValueOf.floatValue());
                }
                bVar.D(numberValueOf);
            }
        };
        new y() { // from class: com.google.gson.internal.bind.TypeAdapters$13
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) {
                if (aVar.peek() != 9) {
                    return Double.valueOf(aVar.B());
                }
                aVar.G();
                return null;
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    bVar.r();
                } else {
                    bVar.z(number.doubleValue());
                }
            }
        };
        f9962l = new TypeAdapters$30(Character.TYPE, Character.class, new y() { // from class: com.google.gson.internal.bind.TypeAdapters$14
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) {
                if (aVar.peek() == 9) {
                    aVar.G();
                    return null;
                }
                String strI = aVar.I();
                if (strI.length() == 1) {
                    return Character.valueOf(strI.charAt(0));
                }
                StringBuilder sbW = s.w("Expecting character, got: ", strI, "; at ");
                sbW.append(aVar.r());
                throw new JsonSyntaxException(sbW.toString());
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                Character ch2 = (Character) obj;
                bVar.E(ch2 == null ? null : String.valueOf(ch2));
            }
        });
        y yVar2 = new y() { // from class: com.google.gson.internal.bind.TypeAdapters$15
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) {
                int iPeek = aVar.peek();
                if (iPeek != 9) {
                    return iPeek == 8 ? Boolean.toString(aVar.z()) : aVar.I();
                }
                aVar.G();
                return null;
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                bVar.E((String) obj);
            }
        };
        m = new y() { // from class: com.google.gson.internal.bind.TypeAdapters$16
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) {
                if (aVar.peek() == 9) {
                    aVar.G();
                    return null;
                }
                String strI = aVar.I();
                try {
                    return com.google.gson.internal.e.j(strI);
                } catch (NumberFormatException e7) {
                    StringBuilder sbW = s.w("Failed parsing '", strI, "' as BigDecimal; at path ");
                    sbW.append(aVar.r());
                    throw new JsonSyntaxException(sbW.toString(), e7);
                }
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                bVar.D((BigDecimal) obj);
            }
        };
        f9963n = new y() { // from class: com.google.gson.internal.bind.TypeAdapters$17
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) {
                if (aVar.peek() == 9) {
                    aVar.G();
                    return null;
                }
                String strI = aVar.I();
                try {
                    com.google.gson.internal.e.d(strI);
                    return new BigInteger(strI);
                } catch (NumberFormatException e7) {
                    StringBuilder sbW = s.w("Failed parsing '", strI, "' as BigInteger; at path ");
                    sbW.append(aVar.r());
                    throw new JsonSyntaxException(sbW.toString(), e7);
                }
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                bVar.D((BigInteger) obj);
            }
        };
        f9964o = new y() { // from class: com.google.gson.internal.bind.TypeAdapters$18
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) {
                if (aVar.peek() != 9) {
                    return new com.google.gson.internal.g(aVar.I());
                }
                aVar.G();
                return null;
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                bVar.D((com.google.gson.internal.g) obj);
            }
        };
        f9965p = new TypeAdapters$29(String.class, yVar2);
        f9966q = new TypeAdapters$29(StringBuilder.class, new y() { // from class: com.google.gson.internal.bind.TypeAdapters$19
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) {
                if (aVar.peek() != 9) {
                    return new StringBuilder(aVar.I());
                }
                aVar.G();
                return null;
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                StringBuilder sb2 = (StringBuilder) obj;
                bVar.E(sb2 == null ? null : sb2.toString());
            }
        });
        f9967r = new TypeAdapters$29(StringBuffer.class, new y() { // from class: com.google.gson.internal.bind.TypeAdapters$20
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) {
                if (aVar.peek() != 9) {
                    return new StringBuffer(aVar.I());
                }
                aVar.G();
                return null;
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                StringBuffer stringBuffer = (StringBuffer) obj;
                bVar.E(stringBuffer == null ? null : stringBuffer.toString());
            }
        });
        f9968s = new TypeAdapters$29(URL.class, new y() { // from class: com.google.gson.internal.bind.TypeAdapters$21
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) {
                if (aVar.peek() == 9) {
                    aVar.G();
                    return null;
                }
                String strI = aVar.I();
                if (strI.equals("null")) {
                    return null;
                }
                return new URL(strI);
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                URL url = (URL) obj;
                bVar.E(url == null ? null : url.toExternalForm());
            }
        });
        f9969t = new TypeAdapters$29(URI.class, new y() { // from class: com.google.gson.internal.bind.TypeAdapters$22
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) {
                if (aVar.peek() == 9) {
                    aVar.G();
                    return null;
                }
                try {
                    String strI = aVar.I();
                    if (strI.equals("null")) {
                        return null;
                    }
                    return new URI(strI);
                } catch (URISyntaxException e7) {
                    throw new JsonIOException(e7);
                }
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                URI uri = (URI) obj;
                bVar.E(uri == null ? null : uri.toASCIIString());
            }
        });
        final y yVar3 = new y() { // from class: com.google.gson.internal.bind.TypeAdapters$23
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) {
                if (aVar.peek() != 9) {
                    return InetAddress.getByName(aVar.I());
                }
                aVar.G();
                return null;
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                InetAddress inetAddress = (InetAddress) obj;
                bVar.E(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        final Class<InetAddress> cls = InetAddress.class;
        f9970u = new z() { // from class: com.google.gson.internal.bind.TypeAdapters$32
            @Override // com.google.gson.z
            public final y a(j jVar, TypeToken typeToken) {
                final Class<?> rawType = typeToken.getRawType();
                if (cls.isAssignableFrom(rawType)) {
                    return new y() { // from class: com.google.gson.internal.bind.TypeAdapters$32.1
                        @Override // com.google.gson.y
                        public final Object read(j3.a aVar) {
                            Object obj = yVar3.read(aVar);
                            if (obj != null) {
                                Class cls2 = rawType;
                                if (!cls2.isInstance(obj)) {
                                    throw new JsonSyntaxException("Expected a " + cls2.getName() + " but was " + obj.getClass().getName() + "; at path " + aVar.r());
                                }
                            }
                            return obj;
                        }

                        @Override // com.google.gson.y
                        public final void write(j3.b bVar, Object obj) {
                            yVar3.write(bVar, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + yVar3 + "]";
            }
        };
        f9971v = new TypeAdapters$29(UUID.class, new y() { // from class: com.google.gson.internal.bind.TypeAdapters$24
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) {
                if (aVar.peek() == 9) {
                    aVar.G();
                    return null;
                }
                String strI = aVar.I();
                try {
                    return UUID.fromString(strI);
                } catch (IllegalArgumentException e7) {
                    StringBuilder sbW = s.w("Failed parsing '", strI, "' as UUID; at path ");
                    sbW.append(aVar.r());
                    throw new JsonSyntaxException(sbW.toString(), e7);
                }
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                UUID uuid = (UUID) obj;
                bVar.E(uuid == null ? null : uuid.toString());
            }
        });
        f9972w = new TypeAdapters$29(Currency.class, new y() { // from class: com.google.gson.internal.bind.TypeAdapters$25
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) {
                String strI = aVar.I();
                try {
                    return Currency.getInstance(strI);
                } catch (IllegalArgumentException e7) {
                    StringBuilder sbW = s.w("Failed parsing '", strI, "' as Currency; at path ");
                    sbW.append(aVar.r());
                    throw new JsonSyntaxException(sbW.toString(), e7);
                }
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                bVar.E(((Currency) obj).getCurrencyCode());
            }
        }.nullSafe());
        final y yVar4 = new y() { // from class: com.google.gson.internal.bind.TypeAdapters$26
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) throws IOException {
                int iC;
                int i4 = 0;
                if (aVar.peek() == 9) {
                    aVar.G();
                    return null;
                }
                aVar.c();
                int i6 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (aVar.peek() != 4) {
                    String strE = aVar.E();
                    iC = aVar.C();
                    strE.getClass();
                    switch (strE) {
                        case "dayOfMonth":
                            i10 = iC;
                            break;
                        case "minute":
                            i12 = iC;
                            break;
                        case "second":
                            i13 = iC;
                            break;
                        case "year":
                            i4 = iC;
                            break;
                        case "month":
                            i6 = iC;
                            break;
                        case "hourOfDay":
                            i11 = iC;
                            break;
                    }
                }
                aVar.k();
                return new GregorianCalendar(i4, i6, i10, i11, i12, i13);
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                if (((Calendar) obj) == null) {
                    bVar.r();
                    return;
                }
                bVar.f();
                bVar.m("year");
                bVar.B(r4.get(1));
                bVar.m("month");
                bVar.B(r4.get(2));
                bVar.m("dayOfMonth");
                bVar.B(r4.get(5));
                bVar.m("hourOfDay");
                bVar.B(r4.get(11));
                bVar.m("minute");
                bVar.B(r4.get(12));
                bVar.m("second");
                bVar.B(r4.get(13));
                bVar.k();
            }
        };
        f9973x = new z() { // from class: com.google.gson.internal.bind.TypeAdapters$31
            @Override // com.google.gson.z
            public final y a(j jVar, TypeToken typeToken) {
                Class rawType = typeToken.getRawType();
                if (rawType == Calendar.class || rawType == GregorianCalendar.class) {
                    return yVar4;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + yVar4 + "]";
            }
        };
        f9974y = new TypeAdapters$29(Locale.class, new y() { // from class: com.google.gson.internal.bind.TypeAdapters$27
            @Override // com.google.gson.y
            public final Object read(j3.a aVar) {
                if (aVar.peek() == 9) {
                    aVar.G();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.I(), Global.UNDERSCORE);
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            }

            @Override // com.google.gson.y
            public final void write(j3.b bVar, Object obj) throws IOException {
                Locale locale = (Locale) obj;
                bVar.E(locale == null ? null : locale.toString());
            }
        });
        final JsonElementTypeAdapter jsonElementTypeAdapter = JsonElementTypeAdapter.f9898a;
        f9975z = jsonElementTypeAdapter;
        final Class<o> cls2 = o.class;
        f9955A = new z() { // from class: com.google.gson.internal.bind.TypeAdapters$32
            @Override // com.google.gson.z
            public final y a(j jVar, TypeToken typeToken) {
                final Class rawType = typeToken.getRawType();
                if (cls2.isAssignableFrom(rawType)) {
                    return new y() { // from class: com.google.gson.internal.bind.TypeAdapters$32.1
                        @Override // com.google.gson.y
                        public final Object read(j3.a aVar) {
                            Object obj = jsonElementTypeAdapter.read(aVar);
                            if (obj != null) {
                                Class cls22 = rawType;
                                if (!cls22.isInstance(obj)) {
                                    throw new JsonSyntaxException("Expected a " + cls22.getName() + " but was " + obj.getClass().getName() + "; at path " + aVar.r());
                                }
                            }
                            return obj;
                        }

                        @Override // com.google.gson.y
                        public final void write(j3.b bVar, Object obj) {
                            jsonElementTypeAdapter.write(bVar, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls2.getName() + ",adapter=" + jsonElementTypeAdapter + "]";
            }
        };
        f9956B = EnumTypeAdapter.f9892d;
    }

    public static z a(final TypeToken typeToken, final y yVar) {
        return new z() { // from class: com.google.gson.internal.bind.TypeAdapters$28
            @Override // com.google.gson.z
            public final y a(j jVar, TypeToken typeToken2) {
                if (typeToken2.equals(typeToken)) {
                    return yVar;
                }
                return null;
            }
        };
    }

    public static z b(Class cls, y yVar) {
        return new TypeAdapters$29(cls, yVar);
    }

    public static z c(Class cls, Class cls2, y yVar) {
        return new TypeAdapters$30(cls, cls2, yVar);
    }
}
