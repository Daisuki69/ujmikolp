package com.google.protobuf;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class M implements W {
    public static final int[] j = new int[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Unsafe f10056k = o0.j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f10057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f10058b;
    public final AbstractC1187a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f10059d;
    public final int e;
    public final O f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final B f10060g;
    public final e0 h;
    public final I i;

    public M(int[] iArr, Object[] objArr, AbstractC1187a abstractC1187a, int[] iArr2, int i, O o8, B b8, e0 e0Var, C1196j c1196j, I i4) {
        this.f10057a = iArr;
        this.f10058b = objArr;
        boolean z4 = abstractC1187a instanceof AbstractC1203q;
        this.f10059d = iArr2;
        this.e = i;
        this.f = o8;
        this.f10060g = b8;
        this.h = e0Var;
        this.c = abstractC1187a;
        this.i = i4;
    }

    public static boolean i(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC1203q) {
            return ((AbstractC1203q) obj).n();
        }
        return true;
    }

    public static M m(V v7, O o8, B b8, e0 e0Var, C1196j c1196j, I i) {
        if (v7 instanceof V) {
            return n(v7, o8, b8, e0Var, c1196j, i);
        }
        v7.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0360  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.protobuf.M n(com.google.protobuf.V r29, com.google.protobuf.O r30, com.google.protobuf.B r31, com.google.protobuf.e0 r32, com.google.protobuf.C1196j r33, com.google.protobuf.I r34) {
        /*
            Method dump skipped, instruction units count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.M.n(com.google.protobuf.V, com.google.protobuf.O, com.google.protobuf.B, com.google.protobuf.e0, com.google.protobuf.j, com.google.protobuf.I):com.google.protobuf.M");
    }

    public static int o(Object obj, long j6) {
        return ((Integer) o0.c.i(obj, j6)).intValue();
    }

    public static long p(Object obj, long j6) {
        return ((Long) o0.c.i(obj, j6)).longValue();
    }

    public static Field q(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbW = We.s.w("Field ", str, " for ");
            sbW.append(cls.getName());
            sbW.append(" not found. Known fields are ");
            sbW.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbW.toString());
        }
    }

    public static int s(int i) {
        return (i & 267386880) >>> 20;
    }

    @Override // com.google.protobuf.W
    public final void a(Object obj, E e) throws CodedOutputStream$OutOfSpaceException {
        e.getClass();
        u(obj, e);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(com.google.protobuf.AbstractC1203q r12) {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.M.b(com.google.protobuf.q):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:131:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05fd A[PHI: r21 r23 r24
  0x05fd: PHI (r21v47 int) = 
  (r21v30 int)
  (r21v31 int)
  (r21v32 int)
  (r21v36 int)
  (r21v38 int)
  (r21v39 int)
  (r21v40 int)
  (r21v44 int)
  (r21v48 int)
 binds: [B:291:0x07e9, B:287:0x07c9, B:283:0x07a9, B:255:0x0708, B:241:0x06a0, B:237:0x0680, B:233:0x0662, B:226:0x061e, B:220:0x05fb] A[DONT_GENERATE, DONT_INLINE]
  0x05fd: PHI (r23v19 int) = 
  (r23v2 int)
  (r23v3 int)
  (r23v4 int)
  (r23v8 int)
  (r23v10 int)
  (r23v11 int)
  (r23v12 int)
  (r23v16 int)
  (r23v20 int)
 binds: [B:291:0x07e9, B:287:0x07c9, B:283:0x07a9, B:255:0x0708, B:241:0x06a0, B:237:0x0680, B:233:0x0662, B:226:0x061e, B:220:0x05fb] A[DONT_GENERATE, DONT_INLINE]
  0x05fd: PHI (r24v18 int) = 
  (r24v2 int)
  (r24v3 int)
  (r24v4 int)
  (r24v8 int)
  (r24v10 int)
  (r24v11 int)
  (r24v12 int)
  (r24v15 int)
  (r24v19 int)
 binds: [B:291:0x07e9, B:287:0x07c9, B:283:0x07a9, B:255:0x0708, B:241:0x06a0, B:237:0x0680, B:233:0x0662, B:226:0x061e, B:220:0x05fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0317 A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // com.google.protobuf.W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(com.google.protobuf.AbstractC1203q r30) {
        /*
            Method dump skipped, instruction units count: 2734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.M.c(com.google.protobuf.q):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // com.google.protobuf.W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(com.google.protobuf.AbstractC1203q r12, com.google.protobuf.AbstractC1203q r13) {
        /*
            Method dump skipped, instruction units count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.M.d(com.google.protobuf.q, com.google.protobuf.q):boolean");
    }

    public final boolean e(AbstractC1203q abstractC1203q, AbstractC1203q abstractC1203q2, int i) {
        return g(abstractC1203q, i) == g(abstractC1203q2, i);
    }

    public final W f(int i) {
        int i4 = (i / 3) * 2;
        Object[] objArr = this.f10058b;
        W w6 = (W) objArr[i4];
        if (w6 != null) {
            return w6;
        }
        W wA = T.c.a((Class) objArr[i4 + 1]);
        objArr[i4] = wA;
        return wA;
    }

    public final boolean g(Object obj, int i) {
        int i4 = this.f10057a[i + 2];
        long j6 = i4 & 1048575;
        if (j6 == 1048575) {
            int iT = t(i);
            long j7 = iT & 1048575;
            switch (s(iT)) {
                case 0:
                    if (Double.doubleToRawLongBits(o0.c.e(obj, j7)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(o0.c.f(obj, j7)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (o0.c.h(obj, j7) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (o0.c.h(obj, j7) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (o0.c.g(obj, j7) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (o0.c.h(obj, j7) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (o0.c.g(obj, j7) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return o0.c.c(obj, j7);
                case 8:
                    Object objI = o0.c.i(obj, j7);
                    if (objI instanceof String) {
                        return !((String) objI).isEmpty();
                    }
                    if (objI instanceof C1192f) {
                        return !C1192f.c.equals(objI);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (o0.c.i(obj, j7) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !C1192f.c.equals(o0.c.i(obj, j7));
                case 11:
                    if (o0.c.g(obj, j7) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (o0.c.g(obj, j7) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (o0.c.g(obj, j7) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (o0.c.h(obj, j7) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (o0.c.g(obj, j7) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (o0.c.h(obj, j7) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (o0.c.i(obj, j7) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((o0.c.g(obj, j6) & (1 << (i4 >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean h(Object obj, int i, int i4, int i6, int i10) {
        return i4 == 1048575 ? g(obj, i) : (i6 & i10) != 0;
    }

    @Override // com.google.protobuf.W
    public final boolean isInitialized(Object obj) {
        int i;
        int i4;
        int i6;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.e) {
            int i13 = this.f10059d[i12];
            int[] iArr = this.f10057a;
            int i14 = iArr[i13];
            int iT = t(i13);
            int i15 = iArr[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i10) {
                if (i16 != 1048575) {
                    i11 = f10056k.getInt(obj, i16);
                }
                i4 = i13;
                i6 = i11;
                i = i16;
            } else {
                int i18 = i11;
                i = i10;
                i4 = i13;
                i6 = i18;
            }
            if ((268435456 & iT) == 0 || h(obj, i4, i, i6, i17)) {
                int iS = s(iT);
                if (iS == 9 || iS == 17) {
                    if (h(obj, i4, i, i6, i17)) {
                        if (!f(i4).isInitialized(o0.c.i(obj, iT & 1048575))) {
                        }
                    } else {
                        continue;
                    }
                    i12++;
                    i10 = i;
                    i11 = i6;
                } else {
                    if (iS != 27) {
                        if (iS == 60 || iS == 68) {
                            if (j(obj, i14, i4)) {
                                if (!f(i4).isInitialized(o0.c.i(obj, iT & 1048575))) {
                                }
                            } else {
                                continue;
                            }
                            i12++;
                            i10 = i;
                            i11 = i6;
                        } else if (iS != 49) {
                            if (iS != 50) {
                                continue;
                            } else {
                                Object objI = o0.c.i(obj, iT & 1048575);
                                this.i.getClass();
                                H h = (H) objI;
                                if (h.isEmpty()) {
                                    continue;
                                } else {
                                    if (((G) this.f10058b[(i4 / 3) * 2]).f10048a.f10047b.f10132a != x0.MESSAGE) {
                                        continue;
                                    } else {
                                        W wA = null;
                                        for (Object obj2 : h.values()) {
                                            if (wA == null) {
                                                wA = T.c.a(obj2.getClass());
                                            }
                                            if (!wA.isInitialized(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i12++;
                            i10 = i;
                            i11 = i6;
                        }
                    }
                    List list = (List) o0.c.i(obj, iT & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        W wF = f(i4);
                        for (int i19 = 0; i19 < list.size(); i19++) {
                            if (wF.isInitialized(list.get(i19))) {
                            }
                        }
                    }
                    i12++;
                    i10 = i;
                    i11 = i6;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean j(Object obj, int i, int i4) {
        return o0.c.g(obj, (long) (this.f10057a[i4 + 2] & 1048575)) == i;
    }

    public final void k(Object obj, Object obj2, int i) {
        if (g(obj2, i)) {
            long jT = t(i) & 1048575;
            Unsafe unsafe = f10056k;
            Object object = unsafe.getObject(obj2, jT);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f10057a[i] + " is present but null: " + obj2);
            }
            W wF = f(i);
            if (!g(obj, i)) {
                if (i(object)) {
                    AbstractC1203q abstractC1203qNewInstance = wF.newInstance();
                    wF.mergeFrom(abstractC1203qNewInstance, object);
                    unsafe.putObject(obj, jT, abstractC1203qNewInstance);
                } else {
                    unsafe.putObject(obj, jT, object);
                }
                r(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jT);
            if (!i(object2)) {
                AbstractC1203q abstractC1203qNewInstance2 = wF.newInstance();
                wF.mergeFrom(abstractC1203qNewInstance2, object2);
                unsafe.putObject(obj, jT, abstractC1203qNewInstance2);
                object2 = abstractC1203qNewInstance2;
            }
            wF.mergeFrom(object2, object);
        }
    }

    public final void l(Object obj, Object obj2, int i) {
        int[] iArr = this.f10057a;
        int i4 = iArr[i];
        if (j(obj2, i4, i)) {
            long jT = t(i) & 1048575;
            Unsafe unsafe = f10056k;
            Object object = unsafe.getObject(obj2, jT);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            W wF = f(i);
            if (!j(obj, i4, i)) {
                if (i(object)) {
                    AbstractC1203q abstractC1203qNewInstance = wF.newInstance();
                    wF.mergeFrom(abstractC1203qNewInstance, object);
                    unsafe.putObject(obj, jT, abstractC1203qNewInstance);
                } else {
                    unsafe.putObject(obj, jT, object);
                }
                o0.n(obj, iArr[i + 2] & 1048575, i4);
                return;
            }
            Object object2 = unsafe.getObject(obj, jT);
            if (!i(object2)) {
                AbstractC1203q abstractC1203qNewInstance2 = wF.newInstance();
                wF.mergeFrom(abstractC1203qNewInstance2, object2);
                unsafe.putObject(obj, jT, abstractC1203qNewInstance2);
                object2 = abstractC1203qNewInstance2;
            }
            wF.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    @Override // com.google.protobuf.W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void makeImmutable(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.M.makeImmutable(java.lang.Object):void");
    }

    @Override // com.google.protobuf.W
    public final void mergeFrom(Object obj, Object obj2) {
        Object obj3;
        if (!i(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f10057a;
            if (i >= iArr.length) {
                X.j(this.h, obj, obj2);
                return;
            }
            int iT = t(i);
            long j6 = iT & 1048575;
            int i4 = iArr[i];
            switch (s(iT)) {
                case 0:
                    obj3 = obj;
                    if (g(obj2, i)) {
                        n0 n0Var = o0.c;
                        n0Var.m(obj3, j6, n0Var.e(obj2, j6));
                        r(obj3, i);
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 1:
                    obj3 = obj;
                    if (g(obj2, i)) {
                        n0 n0Var2 = o0.c;
                        n0Var2.n(obj3, j6, n0Var2.f(obj2, j6));
                        r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 2:
                    obj3 = obj;
                    if (g(obj2, i)) {
                        n0 n0Var3 = o0.c;
                        n0Var3.p(obj3, j6, n0Var3.h(obj2, j6));
                        r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 3:
                    obj3 = obj;
                    if (g(obj2, i)) {
                        n0 n0Var4 = o0.c;
                        n0Var4.p(obj3, j6, n0Var4.h(obj2, j6));
                        r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 4:
                    obj3 = obj;
                    if (g(obj2, i)) {
                        o0.n(obj3, j6, o0.c.g(obj2, j6));
                        r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 5:
                    obj3 = obj;
                    if (g(obj2, i)) {
                        n0 n0Var5 = o0.c;
                        n0Var5.p(obj3, j6, n0Var5.h(obj2, j6));
                        r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 6:
                    obj3 = obj;
                    if (g(obj2, i)) {
                        o0.n(obj3, j6, o0.c.g(obj2, j6));
                        r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 7:
                    obj3 = obj;
                    if (g(obj2, i)) {
                        n0 n0Var6 = o0.c;
                        n0Var6.k(obj3, j6, n0Var6.c(obj2, j6));
                        r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 8:
                    obj3 = obj;
                    if (g(obj2, i)) {
                        o0.o(obj3, j6, o0.c.i(obj2, j6));
                        r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 9:
                    obj3 = obj;
                    k(obj3, obj2, i);
                    continue;
                    i += 3;
                    obj = obj3;
                    break;
                case 10:
                    obj3 = obj;
                    if (g(obj2, i)) {
                        o0.o(obj3, j6, o0.c.i(obj2, j6));
                        r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 11:
                    obj3 = obj;
                    if (g(obj2, i)) {
                        o0.n(obj3, j6, o0.c.g(obj2, j6));
                        r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 12:
                    obj3 = obj;
                    if (g(obj2, i)) {
                        o0.n(obj3, j6, o0.c.g(obj2, j6));
                        r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 13:
                    obj3 = obj;
                    if (g(obj2, i)) {
                        o0.n(obj3, j6, o0.c.g(obj2, j6));
                        r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 14:
                    obj3 = obj;
                    if (g(obj2, i)) {
                        n0 n0Var7 = o0.c;
                        n0Var7.p(obj3, j6, n0Var7.h(obj2, j6));
                        r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 15:
                    obj3 = obj;
                    if (g(obj2, i)) {
                        o0.n(obj3, j6, o0.c.g(obj2, j6));
                        r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 16:
                    if (g(obj2, i)) {
                        n0 n0Var8 = o0.c;
                        obj3 = obj;
                        n0Var8.p(obj3, j6, n0Var8.h(obj2, j6));
                        r(obj3, i);
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 17:
                    k(obj, obj2, i);
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
                    this.f10060g.b(obj, obj2, j6);
                    break;
                case 50:
                    Class cls = X.f10072a;
                    n0 n0Var9 = o0.c;
                    Object objI = n0Var9.i(obj, j6);
                    Object objI2 = n0Var9.i(obj2, j6);
                    this.i.getClass();
                    H hC = (H) objI;
                    H h = (H) objI2;
                    if (!h.isEmpty()) {
                        if (!hC.f10051a) {
                            hC = hC.c();
                        }
                        hC.b();
                        if (!h.isEmpty()) {
                            hC.putAll(h);
                        }
                    }
                    o0.o(obj, j6, hC);
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
                    if (j(obj2, i4, i)) {
                        o0.o(obj, j6, o0.c.i(obj2, j6));
                        o0.n(obj, iArr[i + 2] & 1048575, i4);
                    }
                    break;
                case 60:
                    l(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (j(obj2, i4, i)) {
                        o0.o(obj, j6, o0.c.i(obj2, j6));
                        o0.n(obj, iArr[i + 2] & 1048575, i4);
                    }
                    break;
                case 68:
                    l(obj, obj2, i);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
    }

    @Override // com.google.protobuf.W
    public final AbstractC1203q newInstance() {
        this.f.getClass();
        return (AbstractC1203q) ((AbstractC1203q) this.c).k(4);
    }

    public final void r(Object obj, int i) {
        int i4 = this.f10057a[i + 2];
        long j6 = 1048575 & i4;
        if (j6 == 1048575) {
            return;
        }
        o0.n(obj, j6, (1 << (i4 >>> 20)) | o0.c.g(obj, j6));
    }

    public final int t(int i) {
        return this.f10057a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:121:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0368 A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(java.lang.Object r33, com.google.protobuf.E r34) throws com.google.protobuf.CodedOutputStream$OutOfSpaceException {
        /*
            Method dump skipped, instruction units count: 2730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.M.u(java.lang.Object, com.google.protobuf.E):void");
    }
}
