package com.shield.android.p;

import We.s;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import okio.Utf8;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: com.shield.android.p.d$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] qA;
        static final /* synthetic */ int[] qB;

        static {
            int[] iArr = new int[i.values().length];
            qB = iArr;
            try {
                iArr[i.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qB[i.EXPLICIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                qB[i.IMPLICIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[j.values().length];
            qA = iArr2;
            try {
                iArr2[j.CHOICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                qA[j.SEQUENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                qA[j.UNENCODED_CONTAINER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                qA[j.OCTET_STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                qA[j.BIT_STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                qA[j.INTEGER.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                qA[j.BOOLEAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                qA[j.UTC_TIME.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                qA[j.GENERALIZED_TIME.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                qA[j.OBJECT_IDENTIFIER.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                qA[j.SET_OF.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                qA[j.SEQUENCE_OF.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static final class a {
        private final Field qC;
        private final Object qD;
        private final f qE;
        private final j qF;
        private final j qG;
        private final h qH;
        private final int qI;
        private final int qJ;
        private final i qK;
        private final boolean qL;

        public a(Object obj, Field field, f fVar) throws e {
            this.qD = obj;
            this.qC = field;
            this.qE = fVar;
            j jVarDV = fVar.dV();
            this.qF = jVarDV;
            this.qG = fVar.ef();
            h hVarEb = fVar.eb();
            hVarEb = hVarEb == h.AUTOMATIC ? fVar.ed() != -1 ? h.CONTEXT_SPECIFIC : h.UNIVERSAL : hVarEb;
            this.qH = hVarEb;
            this.qI = com.shield.android.q.d.a(hVarEb);
            this.qJ = fVar.ed() != -1 ? fVar.ed() : (jVarDV == j.CHOICE || jVarDV == j.ANY) ? -1 : com.shield.android.q.d.a(jVarDV);
            i iVarEc = fVar.ec();
            this.qK = iVarEc;
            if ((iVarEc != i.EXPLICIT && iVarEc != i.IMPLICIT) || fVar.ed() != -1) {
                this.qL = fVar.ee();
            } else {
                throw new e("Tag number must be specified when tagging mode is " + iVarEc);
            }
        }

        public final Field dW() {
            return this.qC;
        }

        public final f dX() {
            return this.qE;
        }

        public final byte[] dY() throws e {
            Object objA = d.a(this.qD, this.qC);
            if (objA == null) {
                if (this.qL) {
                    return null;
                }
                throw new e("Required field not set");
            }
            byte[] bArrA = c.a(objA, this.qF, this.qG);
            int i = AnonymousClass1.qB[this.qK.ordinal()];
            if (i == 1) {
                return bArrA;
            }
            if (i == 2) {
                return d.a(this.qI, true, this.qJ, bArrA);
            }
            if (i != 3) {
                throw new RuntimeException("Unknown tagging mode: " + this.qK);
            }
            byte b8 = bArrA[0];
            if ((b8 & 31) == 31) {
                throw new e("High-tag-number form not supported");
            }
            int i4 = this.qJ;
            if (i4 >= 31) {
                throw new e("Unsupported high tag number: " + this.qJ);
            }
            byte b10 = (byte) ((b8 & (-32)) | i4);
            bArrA[0] = b10;
            bArrA[0] = (byte) ((b10 & Utf8.REPLACEMENT_BYTE) | (this.qI << 6));
            return bArrA;
        }
    }

    public static class b implements Comparator<byte[]> {
        private static final b qM = new b();

        private b() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            int iMin = Math.min(bArr3.length, bArr4.length);
            for (int i = 0; i < iMin; i++) {
                int i4 = (bArr3[i] & 255) - (bArr4[i] & 255);
                if (i4 != 0) {
                    return i4;
                }
            }
            return bArr3.length - bArr4.length;
        }
    }

    public static final class c {
        public static byte[] a(Object obj, j jVar, j jVar2) throws e {
            byte[] bArr;
            Class<?> cls = obj.getClass();
            if (g.class.equals(cls)) {
                ByteBuffer byteBufferEg = ((g) obj).eg();
                byte[] bArr2 = new byte[byteBufferEg.remaining()];
                byteBufferEg.get(bArr2);
                return bArr2;
            }
            if (jVar == null || jVar == j.ANY) {
                return d.a(obj);
            }
            switch (AnonymousClass1.qA[jVar.ordinal()]) {
                case 1:
                    com.shield.android.p.b bVar = (com.shield.android.p.b) cls.getDeclaredAnnotation(com.shield.android.p.b.class);
                    if (bVar != null && bVar.dV() == j.CHOICE) {
                        return d.b(obj);
                    }
                    break;
                case 2:
                    com.shield.android.p.b bVar2 = (com.shield.android.p.b) cls.getDeclaredAnnotation(com.shield.android.p.b.class);
                    if (bVar2 != null && bVar2.dV() == j.SEQUENCE) {
                        return d.d(obj);
                    }
                    break;
                case 4:
                case 5:
                    if (obj instanceof ByteBuffer) {
                        ByteBuffer byteBuffer = (ByteBuffer) obj;
                        bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.slice().get(bArr);
                    } else {
                        bArr = obj instanceof byte[] ? (byte[]) obj : null;
                    }
                    if (bArr != null) {
                        return d.a(0, false, com.shield.android.q.d.a(jVar), bArr);
                    }
                    break;
                case 6:
                    if (obj instanceof Integer) {
                        return d.q(((Integer) obj).intValue());
                    }
                    if (obj instanceof Long) {
                        return d.d(((Long) obj).longValue());
                    }
                    if (obj instanceof BigInteger) {
                        return d.a((BigInteger) obj);
                    }
                    break;
                case 7:
                    if (obj instanceof Boolean) {
                        return d.u(((Boolean) obj).booleanValue());
                    }
                    break;
                case 8:
                case 9:
                    if (obj instanceof String) {
                        return d.a(0, false, com.shield.android.q.d.a(jVar), ((String) obj).getBytes());
                    }
                    break;
                case 10:
                    if (obj instanceof String) {
                        return d.L((String) obj);
                    }
                    break;
                case 11:
                    return d.a((Collection) obj, jVar2);
                case 12:
                    return d.b((Collection) obj, jVar2);
            }
            throw new e("Unsupported conversion: " + cls.getName() + " to ASN.1 " + jVar);
        }
    }

    static {
        new g(new byte[]{5, 0});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] L(String str) throws e {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 2) {
            throw new e("OBJECT IDENTIFIER must contain at least two nodes: ".concat(str));
        }
        try {
            int i = Integer.parseInt(strArrSplit[0]);
            if (i > 6 || i < 0) {
                throw new e(s.f(i, "Invalid value for node #1: "));
            }
            try {
                int i4 = Integer.parseInt(strArrSplit[1]);
                if (i4 >= 40 || i4 < 0) {
                    throw new e(s.f(i4, "Invalid value for node #2: "));
                }
                int i6 = (40 * i) + i4;
                if (i6 > 255) {
                    throw new e(androidx.camera.core.impl.a.c(i, i4, "First two nodes out of range: ", "."));
                }
                byteArrayOutputStream.write(i6);
                for (int i10 = 2; i10 < strArrSplit.length; i10++) {
                    String str2 = strArrSplit[i10];
                    try {
                        int i11 = Integer.parseInt(str2);
                        if (i11 < 0) {
                            throw new e("Invalid value for node #" + (i10 + 1) + ": " + i11);
                        }
                        if (i11 <= 127) {
                            byteArrayOutputStream.write(i11);
                        } else if (i11 < 16384) {
                            byteArrayOutputStream.write((i11 >> 7) | 128);
                            byteArrayOutputStream.write(i11 & 127);
                        } else {
                            if (i11 >= 2097152) {
                                throw new e("Node #" + (i10 + 1) + " too large: " + i11);
                            }
                            byteArrayOutputStream.write((i11 >> 14) | 128);
                            byteArrayOutputStream.write(((i11 >> 7) & 127) | 128);
                            byteArrayOutputStream.write(i11 & 127);
                        }
                    } catch (NumberFormatException unused) {
                        throw new e("Node #" + (i10 + 1) + " not numeric: " + str2);
                    }
                }
                return a(0, false, 6, byteArrayOutputStream.toByteArray());
            } catch (NumberFormatException unused2) {
                throw new e("Node #2 not numeric: " + strArrSplit[1]);
            }
        } catch (NumberFormatException unused3) {
            throw new e("Node #1 not numeric: " + strArrSplit[0]);
        }
    }

    public static byte[] a(Object obj) throws e {
        Class<?> cls = obj.getClass();
        com.shield.android.p.b bVar = (com.shield.android.p.b) cls.getDeclaredAnnotation(com.shield.android.p.b.class);
        if (bVar == null) {
            throw new e(cls.getName() + " not annotated with " + com.shield.android.p.b.class.getName());
        }
        j jVarDV = bVar.dV();
        int i = AnonymousClass1.qA[jVarDV.ordinal()];
        if (i == 1) {
            return b(obj);
        }
        if (i == 2) {
            return a(obj, false);
        }
        if (i == 3) {
            return a(obj, true);
        }
        throw new e("Unsupported container type: " + jVarDV);
    }

    private static List<a> c(Object obj) throws e {
        Class<?> cls = obj.getClass();
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            f fVar = (f) field.getDeclaredAnnotation(f.class);
            if (fVar != null) {
                if (Modifier.isStatic(field.getModifiers())) {
                    throw new e(f.class.getName() + " used on a static field: " + cls.getName() + "." + field.getName());
                }
                try {
                    arrayList.add(new a(obj, field, fVar));
                } catch (e e) {
                    throw new e("Invalid ASN.1 annotation on " + cls.getName() + "." + field.getName(), e);
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ byte[] d(long j) {
        return a(0, false, 2, BigInteger.valueOf(j).toByteArray());
    }

    public static /* synthetic */ byte[] q(int i) {
        return a(0, false, 2, BigInteger.valueOf(i).toByteArray());
    }

    public static /* synthetic */ byte[] u(boolean z4) {
        byte[] bArr = new byte[1];
        if (z4) {
            bArr[0] = 1;
        } else {
            bArr[0] = 0;
        }
        return a(0, false, 1, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] b(Object obj) throws e {
        Class<?> cls = obj.getClass();
        List<a> listC = c(obj);
        if (!listC.isEmpty()) {
            a aVar = null;
            for (a aVar2 : listC) {
                if (a(obj, aVar2.dW()) != null) {
                    if (aVar != null) {
                        throw new e("Multiple non-null fields in CHOICE class " + cls.getName() + ": " + aVar.dW().getName() + ", " + aVar2.dW().getName());
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                return aVar.dY();
            }
            throw new e("No non-null fields in CHOICE class ".concat(cls.getName()));
        }
        throw new e("No fields annotated with " + f.class.getName() + " in CHOICE class " + cls.getName());
    }

    public static /* synthetic */ byte[] d(Object obj) throws e {
        return a(obj, false);
    }

    private static byte[] a(Object obj, boolean z4) throws e {
        Class<?> cls = obj.getClass();
        List<a> listC = c(obj);
        Collections.sort(listC, new k(1));
        if (listC.size() > 1) {
            a aVar = null;
            for (a aVar2 : listC) {
                if (aVar != null && aVar.dX().ea() == aVar2.dX().ea()) {
                    throw new e("Fields have the same index: " + cls.getName() + "." + aVar.dW().getName() + " and ." + aVar2.dW().getName());
                }
                aVar = aVar2;
            }
        }
        ArrayList<byte[]> arrayList = new ArrayList(listC.size());
        int length = 0;
        for (a aVar3 : listC) {
            try {
                byte[] bArrDY = aVar3.dY();
                if (bArrDY != null) {
                    arrayList.add(bArrDY);
                    length += bArrDY.length;
                }
            } catch (e e) {
                throw new e("Failed to encode " + cls.getName() + "." + aVar3.dW().getName(), e);
            }
        }
        if (z4) {
            byte[] bArr = new byte[length];
            int length2 = 0;
            for (byte[] bArr2 : arrayList) {
                System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                length2 += bArr2.length;
            }
            return bArr;
        }
        return a(0, true, 16, (byte[][]) arrayList.toArray(new byte[0][]));
    }

    public static /* synthetic */ byte[] b(Collection collection, j jVar) throws e {
        return a(collection, jVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(a aVar, a aVar2) {
        return aVar.dX().ea() - aVar2.dX().ea();
    }

    private static byte[] a(Collection<?> collection, j jVar, boolean z4) throws e {
        int i;
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(c.a(it.next(), jVar, null));
        }
        if (z4) {
            if (arrayList.size() > 1) {
                Collections.sort(arrayList, b.qM);
            }
            i = 17;
        } else {
            i = 16;
        }
        return a(0, true, i, (byte[][]) arrayList.toArray(new byte[0][]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object a(Object obj, Field field) throws e {
        try {
            return field.get(obj);
        } catch (ReflectiveOperationException e) {
            throw new e("Failed to read " + obj.getClass().getName() + "." + field.getName(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] a(int i, boolean z4, int i4, byte[]... bArr) {
        byte[] bArr2;
        if (i4 < 31) {
            int i6 = 6;
            byte b8 = (byte) ((i << 6) | (z4 ? 32 : 0) | i4);
            int length = 0;
            for (byte[] bArr3 : bArr) {
                length += bArr3.length;
            }
            int length2 = 2;
            if (length < 128) {
                bArr2 = new byte[length + 2];
                bArr2[0] = b8;
                bArr2[1] = (byte) length;
            } else {
                if (length <= 255) {
                    bArr2 = new byte[length + 3];
                    bArr2[1] = -127;
                    bArr2[2] = (byte) length;
                    i6 = 3;
                } else if (length <= 65535) {
                    bArr2 = new byte[length + 4];
                    bArr2[1] = -126;
                    bArr2[2] = (byte) (length >> 8);
                    bArr2[3] = (byte) length;
                    i6 = 4;
                } else if (length <= 16777215) {
                    bArr2 = new byte[length + 5];
                    bArr2[1] = -125;
                    bArr2[2] = (byte) (length >> 16);
                    bArr2[3] = (byte) (length >> 8);
                    bArr2[4] = (byte) length;
                    i6 = 5;
                } else {
                    bArr2 = new byte[length + 6];
                    bArr2[1] = -124;
                    bArr2[2] = (byte) (length >> 24);
                    bArr2[3] = (byte) (length >> 16);
                    bArr2[4] = (byte) (length >> 8);
                    bArr2[5] = (byte) length;
                }
                bArr2[0] = b8;
                length2 = i6;
            }
            for (byte[] bArr4 : bArr) {
                System.arraycopy(bArr4, 0, bArr2, length2, bArr4.length);
                length2 += bArr4.length;
            }
            return bArr2;
        }
        throw new IllegalArgumentException(s.f(i4, "High tag numbers not supported: "));
    }

    public static /* synthetic */ byte[] a(BigInteger bigInteger) {
        return a(0, false, 2, bigInteger.toByteArray());
    }

    public static /* synthetic */ byte[] a(Collection collection, j jVar) throws e {
        return a(collection, jVar, true);
    }
}
