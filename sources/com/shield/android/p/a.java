package com.shield.android.p;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    private final int qn;
    private final String qo;
    private final Object[] qp;

    /* JADX INFO: renamed from: com.shield.android.p.a$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] qq;

        static {
            int[] iArr = new int[j.values().length];
            qq = iArr;
            try {
                iArr[j.CHOICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qq[j.SEQUENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                qq[j.UNENCODED_CONTAINER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                qq[j.SET_OF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                qq[j.SEQUENCE_OF.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                qq[j.INTEGER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                qq[j.OBJECT_IDENTIFIER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                qq[j.UTC_TIME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                qq[j.GENERALIZED_TIME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                qq[j.BOOLEAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: com.shield.android.p.a$a, reason: collision with other inner class name */
    public static final class C0078a {
        private final Field qr;
        private final f qs;
        private final j qt;
        private final h qu;
        private final int qv;
        private final int qw;
        private final i qx;
        private final boolean qy;

        public C0078a(Field field, f fVar) throws com.shield.android.p.c {
            this.qr = field;
            this.qs = fVar;
            j jVarDV = fVar.dV();
            this.qt = jVarDV;
            h hVarEb = fVar.eb();
            hVarEb = hVarEb == h.AUTOMATIC ? fVar.ed() != -1 ? h.CONTEXT_SPECIFIC : h.UNIVERSAL : hVarEb;
            this.qu = hVarEb;
            this.qv = com.shield.android.q.d.a(hVarEb);
            this.qw = fVar.ed() != -1 ? fVar.ed() : (jVarDV == j.CHOICE || jVarDV == j.ANY) ? -1 : com.shield.android.q.d.a(jVarDV);
            i iVarEc = fVar.ec();
            this.qx = iVarEc;
            if ((iVarEc != i.EXPLICIT && iVarEc != i.IMPLICIT) || fVar.ed() != -1) {
                this.qy = fVar.ee();
            } else {
                throw new com.shield.android.p.c("Tag number must be specified when tagging mode is " + iVarEc);
            }
        }

        public final void a(com.shield.android.q.a aVar, Object obj) throws com.shield.android.p.c {
            int iEk = aVar.ek();
            if (this.qw != -1) {
                int iEl = aVar.el();
                if (iEk != this.qv || iEl != this.qw) {
                    throw new b("Tag mismatch. Expected: " + com.shield.android.q.d.b(this.qv, this.qw) + ", but found " + com.shield.android.q.d.b(iEk, iEl));
                }
            } else if (iEk != this.qv) {
                throw new b("Tag mismatch. Expected class: " + com.shield.android.q.d.r(this.qv) + ", but found " + com.shield.android.q.d.r(iEk));
            }
            if (this.qx == i.EXPLICIT) {
                try {
                    aVar = aVar.eo().ep();
                } catch (com.shield.android.q.b e) {
                    throw new com.shield.android.p.c("Failed to read contents of EXPLICIT data value", e);
                }
            }
            c.a(obj, this.qr, this.qt, aVar);
        }

        public final Field dQ() {
            return this.qr;
        }

        public final f dR() {
            return this.qs;
        }

        public final boolean dS() {
            return this.qy;
        }

        public final int dT() {
            return this.qv;
        }

        public final int dU() {
            return this.qw;
        }
    }

    public static class b extends com.shield.android.p.c {
        public b(String str) {
            super(str);
        }
    }

    public a(String str, Object... objArr) {
        this.qn = -1;
        this.qo = str;
        this.qp = objArr;
    }

    public static <T> T a(ByteBuffer byteBuffer, Class<T> cls) throws com.shield.android.p.c {
        try {
            com.shield.android.q.a aVarEp = new com.shield.android.q.e(byteBuffer).ep();
            if (aVarEp != null) {
                return (T) a(aVarEp, cls);
            }
            throw new com.shield.android.p.c("Empty input");
        } catch (com.shield.android.q.b e) {
            throw new com.shield.android.p.c("Failed to decode top-level data value", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> List<T> c(com.shield.android.q.a aVar, Class<T> cls) throws com.shield.android.p.c {
        ArrayList arrayList = new ArrayList();
        com.shield.android.q.c cVarEo = aVar.eo();
        while (true) {
            try {
                com.shield.android.q.a aVarEp = cVarEo.ep();
                if (aVarEp == null) {
                    return arrayList;
                }
                arrayList.add(ByteBuffer.class.equals(cls) ? aVarEp.en() : g.class.equals(cls) ? new g(aVarEp.em()) : a(aVarEp, cls));
            } catch (com.shield.android.q.b e) {
                throw new com.shield.android.p.c("Malformed data value", e);
            }
        }
    }

    public static /* synthetic */ Object e(com.shield.android.q.a aVar, Class cls) throws com.shield.android.p.c {
        return a(aVar, cls, false);
    }

    private static long p(ByteBuffer byteBuffer) throws com.shield.android.p.c {
        long j = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0L;
        }
        while (byteBuffer.hasRemaining()) {
            if (j > 72057594037927935L) {
                throw new com.shield.android.p.c("Base-128 number too large");
            }
            byte b8 = byteBuffer.get();
            j = (j << 7) | ((long) (b8 & 127));
            if ((b8 & 128) == 0) {
                return j;
            }
        }
        throw new com.shield.android.p.c("Truncated base-128 encoded input: missing terminating byte, with highest bit not set");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BigInteger q(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return BigInteger.ZERO;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return new BigInteger(bArr);
    }

    public static /* synthetic */ int r(ByteBuffer byteBuffer) throws com.shield.android.p.c {
        BigInteger bigIntegerQ = q(byteBuffer);
        if (bigIntegerQ.compareTo(BigInteger.valueOf(-2147483648L)) < 0 || bigIntegerQ.compareTo(BigInteger.valueOf(2147483647L)) > 0) {
            throw new com.shield.android.p.c(String.format("INTEGER cannot be represented as int: %1$d (0x%1$x)", bigIntegerQ));
        }
        return bigIntegerQ.intValue();
    }

    public static /* synthetic */ long s(ByteBuffer byteBuffer) throws com.shield.android.p.c {
        BigInteger bigIntegerQ = q(byteBuffer);
        if (bigIntegerQ.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0 || bigIntegerQ.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
            throw new com.shield.android.p.c(String.format("INTEGER cannot be represented as long: %1$d (0x%1$x)", bigIntegerQ));
        }
        return bigIntegerQ.longValue();
    }

    public static /* synthetic */ String u(ByteBuffer byteBuffer) throws com.shield.android.p.c {
        if (!byteBuffer.hasRemaining()) {
            throw new com.shield.android.p.c("Empty OBJECT IDENTIFIER");
        }
        long jP = p(byteBuffer);
        int iMin = (int) Math.min(jP / 40, 2L);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Long.toString(iMin));
        sb2.append('.');
        sb2.append(Long.toString(jP - ((long) (iMin * 40))));
        while (byteBuffer.hasRemaining()) {
            long jP2 = p(byteBuffer);
            sb2.append('.');
            sb2.append(Long.toString(jP2));
        }
        return sb2.toString();
    }

    public Object[] cF() {
        return this.qp;
    }

    public int dP() {
        return this.qn;
    }

    public String toString() {
        String str = this.qo;
        if (str != null) {
            return String.format(str, this.qp);
        }
        StringBuilder sb2 = new StringBuilder("mIssueId: ");
        sb2.append(this.qn);
        for (Object obj : this.qp) {
            sb2.append(", ");
            sb2.append(obj.toString());
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T b(com.shield.android.q.a aVar, Class<T> cls) throws com.shield.android.p.c {
        List<C0078a> listB = b(cls);
        if (listB.isEmpty()) {
            throw new com.shield.android.p.c("No fields annotated with " + f.class.getName() + " in CHOICE class " + cls.getName());
        }
        int i = 0;
        while (i < listB.size() - 1) {
            C0078a c0078a = listB.get(i);
            int iDU = c0078a.dU();
            int iDT = c0078a.dT();
            i++;
            for (int i4 = i; i4 < listB.size(); i4++) {
                C0078a c0078a2 = listB.get(i4);
                int iDU2 = c0078a2.dU();
                int iDT2 = c0078a2.dT();
                if (iDU == iDU2 && iDT == iDT2) {
                    throw new com.shield.android.p.c("CHOICE fields are indistinguishable because they have the same tag class and number: " + cls.getName() + "." + c0078a.dQ().getName() + " and ." + c0078a2.dQ().getName());
                }
            }
        }
        try {
            T tNewInstance = cls.getConstructor(null).newInstance(null);
            Iterator<C0078a> it = listB.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a(aVar, tNewInstance);
                    return tNewInstance;
                } catch (b unused) {
                }
            }
            throw new com.shield.android.p.c("No options of CHOICE " + cls.getName() + " matched");
        } catch (IllegalArgumentException | ReflectiveOperationException e) {
            throw new com.shield.android.p.c("Failed to instantiate ".concat(cls.getName()), e);
        }
    }

    public a(int i, Object... objArr) {
        this.qn = i;
        this.qo = null;
        this.qp = objArr;
    }

    private static <T> T a(com.shield.android.q.a aVar, Class<T> cls) throws com.shield.android.p.c {
        if (aVar == null) {
            throw new NullPointerException("container == null");
        }
        if (cls != null) {
            j jVarA = a((Class<?>) cls);
            int i = AnonymousClass1.qq[jVarA.ordinal()];
            if (i == 1) {
                return (T) b(aVar, cls);
            }
            if (i != 2) {
                if (i == 3) {
                    return (T) a(aVar, cls, true);
                }
                throw new com.shield.android.p.c("Parsing container " + jVarA + " not supported");
            }
            int iA = com.shield.android.q.d.a(jVarA);
            if (aVar.ek() == 0 && aVar.el() == iA) {
                return (T) a(aVar, cls, false);
            }
            throw new b("Unexpected data value read as " + cls.getName() + ". Expected " + com.shield.android.q.d.b(0, iA) + ", but read: " + com.shield.android.q.d.b(aVar.ek(), aVar.el()));
        }
        throw new NullPointerException("containerClass == null");
    }

    public static final class c {
        private static final byte[] qz = new byte[0];

        public static void a(Object obj, Field field, j jVar, com.shield.android.q.a aVar) throws com.shield.android.p.c {
            try {
                int i = AnonymousClass1.qq[jVar.ordinal()];
                if (i != 4 && i != 5) {
                    field.set(obj, a(jVar, aVar, field.getType()));
                } else if (g.class.equals(field.getType())) {
                    field.set(obj, a(jVar, aVar, field.getType()));
                } else {
                    field.set(obj, a.c(aVar, a.a(field)));
                }
            } catch (ReflectiveOperationException e) {
                throw new com.shield.android.p.c("Failed to set value of " + obj.getClass().getName() + "." + field.getName(), e);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v24, types: [T, byte[]] */
        private static <T> T a(j jVar, com.shield.android.q.a aVar, Class<T> cls) throws com.shield.android.p.c {
            if (ByteBuffer.class.equals(cls)) {
                return (T) aVar.en();
            }
            if (byte[].class.equals(cls)) {
                ByteBuffer byteBufferEn = aVar.en();
                if (!byteBufferEn.hasRemaining()) {
                    return (T) qz;
                }
                ?? r52 = (T) new byte[byteBufferEn.remaining()];
                byteBufferEn.get((byte[]) r52);
                return r52;
            }
            if (g.class.equals(cls)) {
                return (T) new g(aVar.em());
            }
            ByteBuffer byteBufferEn2 = aVar.en();
            int i = AnonymousClass1.qq[jVar.ordinal()];
            if (i == 1) {
                com.shield.android.p.b bVar = (com.shield.android.p.b) cls.getDeclaredAnnotation(com.shield.android.p.b.class);
                if (bVar != null && bVar.dV() == j.CHOICE) {
                    return (T) a.b(aVar, cls);
                }
            } else if (i == 2) {
                com.shield.android.p.b bVar2 = (com.shield.android.p.b) cls.getDeclaredAnnotation(com.shield.android.p.b.class);
                if (bVar2 != null && bVar2.dV() == j.SEQUENCE) {
                    return (T) a.e(aVar, cls);
                }
            } else {
                switch (i) {
                    case 6:
                        if (!Integer.TYPE.equals(cls) && !Integer.class.equals(cls)) {
                            if (!Long.TYPE.equals(cls) && !Long.class.equals(cls)) {
                                if (BigInteger.class.equals(cls)) {
                                    return (T) a.q(byteBufferEn2);
                                }
                            } else {
                                return (T) Long.valueOf(a.s(byteBufferEn2));
                            }
                        } else {
                            return (T) Integer.valueOf(a.r(byteBufferEn2));
                        }
                        break;
                    case 7:
                        if (String.class.equals(cls)) {
                            return (T) a.u(byteBufferEn2);
                        }
                        break;
                    case 8:
                    case 9:
                        if (String.class.equals(cls)) {
                            byte[] bArr = new byte[byteBufferEn2.remaining()];
                            byteBufferEn2.get(bArr);
                            return (T) new String(bArr);
                        }
                        break;
                    case 10:
                        if (Boolean.TYPE.equals(cls)) {
                            if (byteBufferEn2.remaining() == 1) {
                                return (T) Boolean.valueOf(byteBufferEn2.get() != 0);
                            }
                            throw new com.shield.android.p.c("Incorrect encoded size of boolean value: " + byteBufferEn2.remaining());
                        }
                        break;
                }
            }
            throw new com.shield.android.p.c("Unsupported conversion: ASN.1 " + jVar + " to " + cls.getName());
        }
    }

    private static <T> T a(com.shield.android.q.a aVar, Class<T> cls, boolean z4) throws com.shield.android.p.c {
        com.shield.android.q.a aVarEp;
        List<C0078a> listB = b(cls);
        Collections.sort(listB, new k(0));
        if (listB.size() > 1) {
            C0078a c0078a = null;
            for (C0078a c0078a2 : listB) {
                if (c0078a != null && c0078a.dR().ea() == c0078a2.dR().ea()) {
                    throw new com.shield.android.p.c("Fields have the same index: " + cls.getName() + "." + c0078a.dQ().getName() + " and ." + c0078a2.dQ().getName());
                }
                c0078a = c0078a2;
            }
        }
        try {
            T tNewInstance = cls.getConstructor(null).newInstance(null);
            com.shield.android.q.c cVarEo = aVar.eo();
            int i = 0;
            while (i < listB.size()) {
                if (z4 && i == 0) {
                    aVarEp = aVar;
                } else {
                    try {
                        aVarEp = cVarEo.ep();
                    } catch (com.shield.android.q.b e) {
                        throw new com.shield.android.p.c("Malformed data value", e);
                    }
                }
                if (aVarEp == null) {
                    break;
                }
                for (int i4 = i; i4 < listB.size(); i4++) {
                    C0078a c0078a3 = listB.get(i4);
                    try {
                        if (c0078a3.dS()) {
                            try {
                                c0078a3.a(aVarEp, tNewInstance);
                            } catch (b unused) {
                            }
                        } else {
                            c0078a3.a(aVarEp, tNewInstance);
                        }
                        i = i4 + 1;
                        break;
                    } catch (com.shield.android.p.c e7) {
                        throw new com.shield.android.p.c("Failed to parse " + cls.getName() + "." + c0078a3.dQ().getName(), e7);
                    }
                }
            }
            return tNewInstance;
        } catch (IllegalArgumentException | ReflectiveOperationException e10) {
            throw new com.shield.android.p.c("Failed to instantiate ".concat(cls.getName()), e10);
        }
    }

    private static List<C0078a> b(Class<?> cls) throws com.shield.android.p.c {
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            f fVar = (f) field.getDeclaredAnnotation(f.class);
            if (fVar != null) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        arrayList.add(new C0078a(field, fVar));
                    } catch (com.shield.android.p.c e) {
                        throw new com.shield.android.p.c("Invalid ASN.1 annotation on " + cls.getName() + "." + field.getName(), e);
                    }
                } else {
                    throw new com.shield.android.p.c(f.class.getName() + " used on a static field: " + cls.getName() + "." + field.getName());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(C0078a c0078a, C0078a c0078a2) {
        return c0078a.dR().ea() - c0078a2.dR().ea();
    }

    private static j a(Class<?> cls) throws com.shield.android.p.c {
        com.shield.android.p.b bVar = (com.shield.android.p.b) cls.getDeclaredAnnotation(com.shield.android.p.b.class);
        if (bVar != null) {
            int i = AnonymousClass1.qq[bVar.dV().ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                throw new com.shield.android.p.c("Unsupported ASN.1 container annotation type: " + bVar.dV());
            }
            return bVar.dV();
        }
        throw new com.shield.android.p.c(cls.getName() + " is not annotated with " + com.shield.android.p.b.class.getName());
    }

    public static /* synthetic */ Class a(Field field) throws com.shield.android.p.c, ClassNotFoundException {
        String typeName = field.getGenericType().getTypeName();
        int iIndexOf = typeName.indexOf(60);
        if (iIndexOf == -1) {
            throw new com.shield.android.p.c("Not a container type: " + field.getGenericType());
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = typeName.indexOf(62, i);
        if (iIndexOf2 == -1) {
            throw new com.shield.android.p.c("Not a container type: " + field.getGenericType());
        }
        return Class.forName(typeName.substring(i, iIndexOf2));
    }
}
