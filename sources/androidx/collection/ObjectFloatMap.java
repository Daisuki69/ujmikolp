package androidx.collection;

import androidx.camera.core.impl.a;
import androidx.collection.internal.ContainerHelpersKt;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class ObjectFloatMap<K> {
    public int _capacity;
    public int _size;
    public Object[] keys;
    public long[] metadata;
    public float[] values;

    public /* synthetic */ ObjectFloatMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    public static /* synthetic */ void get_capacity$collection$annotations() {
    }

    public static /* synthetic */ void get_size$collection$annotations() {
    }

    public static /* synthetic */ String joinToString$default(ObjectFloatMap objectFloatMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i4 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i4 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i4 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i4 & 8) != 0) {
            i = -1;
        }
        if ((i4 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return objectFloatMap.joinToString(charSequence, charSequence2, charSequence6, i, charSequence5);
    }

    public final boolean all(Function2<? super K, ? super Float, Boolean> predicate) {
        j.g(predicate, "predicate");
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i - length)) >>> 31);
                for (int i6 = 0; i6 < i4; i6++) {
                    if ((255 & j) < 128) {
                        int i10 = (i << 3) + i6;
                        if (!((Boolean) predicate.invoke(objArr[i10], Float.valueOf(fArr[i10]))).booleanValue()) {
                            return false;
                        }
                    }
                    j >>= 8;
                }
                if (i4 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final boolean contains(K k8) {
        return findKeyIndex(k8) >= 0;
    }

    public final boolean containsKey(K k8) {
        return findKeyIndex(k8) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsValue(float r15) {
        /*
            r14 = this;
            float[] r0 = r14.values
            long[] r1 = r14.metadata
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L46
            r4 = r3
        Lb:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L41
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L25:
            if (r9 >= r7) goto L3f
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3b
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            int r10 = (r15 > r10 ? 1 : (r15 == r10 ? 0 : -1))
            if (r10 != 0) goto L3b
            r15 = 1
            return r15
        L3b:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L25
        L3f:
            if (r7 != r8) goto L46
        L41:
            if (r4 == r2) goto L46
            int r4 = r4 + 1
            goto Lb
        L46:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectFloatMap.containsValue(float):boolean");
    }

    public final int count() {
        return getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof androidx.collection.ObjectFloatMap
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            androidx.collection.ObjectFloatMap r1 = (androidx.collection.ObjectFloatMap) r1
            int r3 = r1.getSize()
            int r5 = r0.getSize()
            if (r3 == r5) goto L1b
            return r4
        L1b:
            java.lang.Object[] r3 = r0.keys
            float[] r5 = r0.values
            long[] r6 = r0.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L68
            r8 = r4
        L27:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L63
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L41:
            if (r13 >= r11) goto L61
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L5d
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            float r15 = r1.get(r15)
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 != 0) goto L5c
            goto L5d
        L5c:
            return r4
        L5d:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L41
        L61:
            if (r11 != r12) goto L68
        L63:
            if (r8 == r7) goto L68
            int r8 = r8 + 1
            goto L27
        L68:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectFloatMap.equals(java.lang.Object):boolean");
    }

    public final int findKeyIndex(K k8) {
        int i = 0;
        int iHashCode = (k8 != null ? k8.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i4 = iHashCode ^ (iHashCode << 16);
        int i6 = i4 & 127;
        int i10 = this._capacity;
        int i11 = i4 >>> 7;
        while (true) {
            int i12 = i11 & i10;
            long[] jArr = this.metadata;
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            long j = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j6 = (((long) i6) * ScatterMapKt.BitmaskLsb) ^ j;
            for (long j7 = (~j6) & (j6 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i12) & i10;
                if (j.b(this.keys[iNumberOfTrailingZeros], k8)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i11 = i12 + i;
        }
    }

    public final void forEach(Function2<? super K, ? super Float, Unit> block) {
        j.g(block, "block");
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i - length)) >>> 31);
                for (int i6 = 0; i6 < i4; i6++) {
                    if ((255 & j) < 128) {
                        int i10 = (i << 3) + i6;
                        block.invoke(objArr[i10], Float.valueOf(fArr[i10]));
                    }
                    j >>= 8;
                }
                if (i4 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void forEachIndexed(Function1<? super Integer, Unit> block) {
        j.g(block, "block");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i - length)) >>> 31);
                for (int i6 = 0; i6 < i4; i6++) {
                    if ((255 & j) < 128) {
                        a.x(i << 3, i6, block);
                    }
                    j >>= 8;
                }
                if (i4 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void forEachKey(Function1<? super K, Unit> block) {
        j.g(block, "block");
        Object[] objArr = this.keys;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i - length)) >>> 31);
                for (int i6 = 0; i6 < i4; i6++) {
                    if ((255 & j) < 128) {
                        block.invoke(objArr[(i << 3) + i6]);
                    }
                    j >>= 8;
                }
                if (i4 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void forEachValue(Function1<? super Float, Unit> block) {
        j.g(block, "block");
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i - length)) >>> 31);
                for (int i6 = 0; i6 < i4; i6++) {
                    if ((255 & j) < 128) {
                        block.invoke(Float.valueOf(fArr[(i << 3) + i6]));
                    }
                    j >>= 8;
                }
                if (i4 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final float get(K k8) {
        int iFindKeyIndex = findKeyIndex(k8);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        throw new NoSuchElementException("There is no key " + k8 + " in the map");
    }

    public final int getCapacity() {
        return this._capacity;
    }

    public final float getOrDefault(K k8, float f) {
        int iFindKeyIndex = findKeyIndex(k8);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : f;
    }

    public final float getOrElse(K k8, Function0<Float> defaultValue) {
        j.g(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(k8);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : ((Number) defaultValue.invoke()).floatValue();
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iFloatToIntBits = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i - length)) >>> 31);
                for (int i6 = 0; i6 < i4; i6++) {
                    if ((255 & j) < 128) {
                        int i10 = (i << 3) + i6;
                        Object obj = objArr[i10];
                        iFloatToIntBits += Float.floatToIntBits(fArr[i10]) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j >>= 8;
                }
                if (i4 != 8) {
                    return iFloatToIntBits;
                }
            }
            if (i == length) {
                return iFloatToIntBits;
            }
            i++;
        }
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final boolean none() {
        return this._size == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006c A[PHI: r8
  0x006c: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:22:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lb
            java.lang.String r1 = "{}"
            return r1
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            java.lang.Object[] r2 = r0.keys
            float[] r3 = r0.values
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L71
            r6 = 0
            r7 = r6
            r8 = r7
        L20:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L6c
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L3a:
            if (r13 >= r11) goto L6a
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L66
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            if (r15 != r0) goto L50
            java.lang.String r15 = "(this)"
        L50:
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0._size
            if (r8 >= r14) goto L66
            java.lang.String r14 = ", "
            r1.append(r14)
        L66:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3a
        L6a:
            if (r11 != r12) goto L71
        L6c:
            if (r7 == r5) goto L71
            int r7 = r7 + 1
            goto L20
        L71:
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r3 = "s.append('}').toString()"
            java.lang.String r1 = androidx.camera.core.impl.a.k(r1, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectFloatMap.toString():java.lang.String");
    }

    private ObjectFloatMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = ContainerHelpersKt.EMPTY_OBJECTS;
        this.values = FloatSetKt.getEmptyFloatArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean any(kotlin.jvm.functions.Function2<? super K, ? super java.lang.Float, java.lang.Boolean> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "predicate"
            kotlin.jvm.internal.j.g(r1, r2)
            java.lang.Object[] r2 = r0.keys
            float[] r3 = r0.values
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L5f
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5a
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L58
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L54
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            r13 = r3[r13]
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.Object r13 = r1.invoke(r14, r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L54
            r1 = 1
            return r1
        L54:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L58:
            if (r10 != r11) goto L5f
        L5a:
            if (r7 == r5) goto L5f
            int r7 = r7 + 1
            goto L16
        L5f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectFloatMap.any(kotlin.jvm.functions.Function2):boolean");
    }

    public final int count(Function2<? super K, ? super Float, Boolean> predicate) {
        j.g(predicate, "predicate");
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i4 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i - length)) >>> 31);
                for (int i10 = 0; i10 < i6; i10++) {
                    if ((255 & j) < 128) {
                        int i11 = (i << 3) + i10;
                        if (((Boolean) predicate.invoke(objArr[i11], Float.valueOf(fArr[i11]))).booleanValue()) {
                            i4++;
                        }
                    }
                    j >>= 8;
                }
                if (i6 != 8) {
                    return i4;
                }
            }
            if (i == length) {
                return i4;
            }
            i++;
        }
    }

    public final String joinToString(CharSequence separator) {
        j.g(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        j.g(separator, "separator");
        j.g(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        j.g(separator, "separator");
        j.g(prefix, "prefix");
        j.g(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(ObjectFloatMap objectFloatMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function2 function2, int i4, Object obj) {
        long[] jArr;
        long[] jArr2;
        int i6;
        if (obj == null) {
            CharSequence separator = (i4 & 1) != 0 ? ", " : charSequence;
            CharSequence prefix = (i4 & 2) != 0 ? "" : charSequence2;
            CharSequence postfix = (i4 & 4) == 0 ? charSequence3 : "";
            int i10 = (i4 & 8) != 0 ? -1 : i;
            CharSequence charSequence5 = (i4 & 16) != 0 ? "..." : charSequence4;
            j.g(separator, "separator");
            j.g(prefix, "prefix");
            j.g(postfix, "postfix");
            StringBuilder sbV = a.v(charSequence5, "truncated", function2, "transform", prefix);
            Object[] objArr = objectFloatMap.keys;
            float[] fArr = objectFloatMap.values;
            long[] jArr3 = objectFloatMap.metadata;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i11 = 0;
                int i12 = 0;
                loop0: while (true) {
                    long j = jArr3[i11];
                    int i13 = i11;
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8;
                        int i15 = 8 - ((~(i13 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j & 255) < 128) {
                                int i17 = (i13 << 3) + i16;
                                i6 = i14;
                                Object obj2 = objArr[i17];
                                float f = fArr[i17];
                                if (i12 == i10) {
                                    sbV.append(charSequence5);
                                    break loop0;
                                }
                                if (i12 != 0) {
                                    sbV.append(separator);
                                }
                                jArr2 = jArr3;
                                sbV.append((CharSequence) function2.invoke(obj2, Float.valueOf(f)));
                                i12++;
                            } else {
                                jArr2 = jArr3;
                                i6 = i14;
                            }
                            j >>= i6;
                            i16++;
                            i14 = i6;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i15 != i14) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i13 == length) {
                        break;
                    }
                    i11 = i13 + 1;
                    jArr3 = jArr;
                }
                sbV.append(postfix);
            } else {
                sbV.append(postfix);
            }
            String string = sbV.toString();
            j.f(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i) {
        j.g(separator, "separator");
        j.g(prefix, "prefix");
        j.g(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i, null, 16, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, int i, CharSequence charSequence2) {
        Object[] objArr;
        Object[] objArr2;
        int i4;
        j.g(separator, "separator");
        j.g(prefix, "prefix");
        StringBuilder sbT = a.t(charSequence, "postfix", charSequence2, "truncated", prefix);
        Object[] objArr3 = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            int i10 = 0;
            loop0: while (true) {
                long j = jArr[i6];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i6 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j & 255) < 128) {
                            int i14 = (i6 << 3) + i13;
                            i4 = i11;
                            Object obj = objArr3[i14];
                            float f = fArr[i14];
                            objArr2 = objArr3;
                            if (i10 == i) {
                                sbT.append(charSequence2);
                                break loop0;
                            }
                            if (i10 != 0) {
                                sbT.append(separator);
                            }
                            sbT.append(obj);
                            sbT.append('=');
                            sbT.append(f);
                            i10++;
                        } else {
                            objArr2 = objArr3;
                            i4 = i11;
                        }
                        j >>= i4;
                        i13++;
                        objArr3 = objArr2;
                        i11 = i4;
                    }
                    objArr = objArr3;
                    if (i12 != i11) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                }
                if (i6 == length) {
                    break;
                }
                i6++;
                objArr3 = objArr;
            }
            sbT.append(charSequence);
        } else {
            sbT.append(charSequence);
        }
        String string = sbT.toString();
        j.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String joinToString(CharSequence charSequence, CharSequence prefix, CharSequence postfix, int i, CharSequence charSequence2, Function2<? super K, ? super Float, ? extends CharSequence> function2) {
        Object[] objArr;
        Object[] objArr2;
        CharSequence separator = charSequence;
        j.g(separator, "separator");
        j.g(prefix, "prefix");
        j.g(postfix, "postfix");
        StringBuilder sbV = a.v(charSequence2, "truncated", function2, "transform", prefix);
        Object[] objArr3 = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i6 = 0;
            loop0: while (true) {
                long j = jArr[i4];
                int i10 = i4;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j & 255) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr3[i13];
                            float f = fArr[i13];
                            objArr2 = objArr3;
                            if (i6 == i) {
                                sbV.append(charSequence2);
                                break loop0;
                            }
                            if (i6 != 0) {
                                sbV.append(separator);
                            }
                            sbV.append((CharSequence) function2.invoke(obj, Float.valueOf(f)));
                            i6++;
                        } else {
                            objArr2 = objArr3;
                        }
                        j >>= 8;
                        i12++;
                        separator = charSequence;
                        objArr3 = objArr2;
                    }
                    objArr = objArr3;
                    if (i11 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                }
                if (i10 == length) {
                    break;
                }
                i4 = i10 + 1;
                separator = charSequence;
                objArr3 = objArr;
            }
            sbV.append(postfix);
        } else {
            sbV.append(postfix);
        }
        String string = sbV.toString();
        j.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0089 A[PHI: r11
  0x0089: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x003a, B:20:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(java.lang.CharSequence r21, java.lang.CharSequence r22, java.lang.CharSequence r23, int r24, kotlin.jvm.functions.Function2<? super K, ? super java.lang.Float, ? extends java.lang.CharSequence> r25) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r25
            java.lang.String r5 = "separator"
            kotlin.jvm.internal.j.g(r1, r5)
            java.lang.String r5 = "prefix"
            kotlin.jvm.internal.j.g(r2, r5)
            java.lang.String r5 = "postfix"
            java.lang.String r6 = "transform"
            java.lang.StringBuilder r2 = androidx.camera.core.impl.a.v(r3, r5, r4, r6, r2)
            java.lang.Object[] r5 = r0.keys
            float[] r6 = r0.values
            long[] r7 = r0.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L90
            r10 = 0
            r11 = 0
        L29:
            r12 = r7[r10]
            long r14 = ~r12
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto L89
            int r14 = r10 - r8
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r9 = 0
        L46:
            if (r9 >= r14) goto L86
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r12 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L7b
            int r16 = r10 << 3
            int r16 = r16 + r9
            r17 = r15
            r15 = r5[r16]
            r16 = r6[r16]
            r0 = r24
            if (r11 != r0) goto L66
            java.lang.String r0 = "..."
            r2.append(r0)
            goto L93
        L66:
            if (r11 == 0) goto L6b
            r2.append(r1)
        L6b:
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            java.lang.Object r0 = r4.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.append(r0)
            int r11 = r11 + 1
            goto L7d
        L7b:
            r17 = r15
        L7d:
            long r12 = r12 >> r17
            int r9 = r9 + 1
            r0 = r20
            r15 = r17
            goto L46
        L86:
            r0 = r15
            if (r14 != r0) goto L90
        L89:
            if (r10 == r8) goto L90
            int r10 = r10 + 1
            r0 = r20
            goto L29
        L90:
            r2.append(r3)
        L93:
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.j.f(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0088 A[PHI: r11
  0x0088: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x003a, B:20:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(java.lang.CharSequence r21, java.lang.CharSequence r22, java.lang.CharSequence r23, kotlin.jvm.functions.Function2<? super K, ? super java.lang.Float, ? extends java.lang.CharSequence> r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            java.lang.String r5 = "separator"
            kotlin.jvm.internal.j.g(r1, r5)
            java.lang.String r5 = "prefix"
            kotlin.jvm.internal.j.g(r2, r5)
            java.lang.String r5 = "postfix"
            java.lang.String r6 = "transform"
            java.lang.StringBuilder r2 = androidx.camera.core.impl.a.v(r3, r5, r4, r6, r2)
            java.lang.Object[] r5 = r0.keys
            float[] r6 = r0.values
            long[] r7 = r0.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L8f
            r10 = 0
            r11 = 0
        L29:
            r12 = r7[r10]
            long r14 = ~r12
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto L88
            int r14 = r10 - r8
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r9 = 0
        L46:
            if (r9 >= r14) goto L85
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r12 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L7a
            int r16 = r10 << 3
            int r16 = r16 + r9
            r17 = r15
            r15 = r5[r16]
            r16 = r6[r16]
            r0 = -1
            if (r11 != r0) goto L65
            java.lang.String r0 = "..."
            r2.append(r0)
            goto L92
        L65:
            if (r11 == 0) goto L6a
            r2.append(r1)
        L6a:
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            java.lang.Object r0 = r4.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.append(r0)
            int r11 = r11 + 1
            goto L7c
        L7a:
            r17 = r15
        L7c:
            long r12 = r12 >> r17
            int r9 = r9 + 1
            r0 = r20
            r15 = r17
            goto L46
        L85:
            r0 = r15
            if (r14 != r0) goto L8f
        L88:
            if (r10 == r8) goto L8f
            int r10 = r10 + 1
            r0 = r20
            goto L29
        L8f:
            r2.append(r3)
        L92:
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.j.f(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[PHI: r10
  0x007c: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x0030, B:20:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(java.lang.CharSequence r21, java.lang.CharSequence r22, kotlin.jvm.functions.Function2<? super K, ? super java.lang.Float, ? extends java.lang.CharSequence> r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r23
            java.lang.String r3 = "separator"
            kotlin.jvm.internal.j.g(r1, r3)
            java.lang.String r3 = "prefix"
            java.lang.String r4 = "transform"
            r5 = r22
            java.lang.StringBuilder r3 = androidx.camera.core.impl.a.v(r5, r3, r2, r4, r5)
            java.lang.Object[] r4 = r0.keys
            float[] r5 = r0.values
            long[] r6 = r0.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L81
            r9 = 0
            r10 = 0
        L22:
            r11 = r6[r9]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L7c
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L3c:
            if (r15 >= r13) goto L79
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L70
            int r16 = r9 << 3
            int r16 = r16 + r15
            r8 = r4[r16]
            r16 = r5[r16]
            r17 = r14
            r14 = -1
            if (r10 != r14) goto L5b
            java.lang.String r1 = "..."
            r3.append(r1)
            goto L86
        L5b:
            if (r10 == 0) goto L60
            r3.append(r1)
        L60:
            java.lang.Float r14 = java.lang.Float.valueOf(r16)
            java.lang.Object r8 = r2.invoke(r8, r14)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r3.append(r8)
            int r10 = r10 + 1
            goto L72
        L70:
            r17 = r14
        L72:
            long r11 = r11 >> r17
            int r15 = r15 + 1
            r14 = r17
            goto L3c
        L79:
            r8 = r14
            if (r13 != r8) goto L81
        L7c:
            if (r9 == r7) goto L81
            int r9 = r9 + 1
            goto L22
        L81:
            java.lang.String r1 = ""
            r3.append(r1)
        L86:
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.j.f(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0083 A[PHI: r11
  0x0083: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x0035, B:20:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(java.lang.CharSequence r22, kotlin.jvm.functions.Function2<? super K, ? super java.lang.Float, ? extends java.lang.CharSequence> r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            java.lang.String r3 = "separator"
            kotlin.jvm.internal.j.g(r1, r3)
            java.lang.String r3 = "transform"
            kotlin.jvm.internal.j.g(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ""
            r3.<init>(r4)
            java.lang.Object[] r5 = r0.keys
            float[] r6 = r0.values
            long[] r7 = r0.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L8a
            r10 = 0
            r11 = 0
        L24:
            r12 = r7[r10]
            long r14 = ~r12
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto L83
            int r14 = r10 - r8
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r9 = 0
        L41:
            if (r9 >= r14) goto L80
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r12 & r17
            r19 = 128(0x80, double:6.3E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L75
            int r17 = r10 << 3
            int r17 = r17 + r9
            r18 = r15
            r15 = r5[r17]
            r17 = r6[r17]
            r0 = -1
            if (r11 != r0) goto L60
            java.lang.String r0 = "..."
            r3.append(r0)
            goto L8d
        L60:
            if (r11 == 0) goto L65
            r3.append(r1)
        L65:
            java.lang.Float r0 = java.lang.Float.valueOf(r17)
            java.lang.Object r0 = r2.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3.append(r0)
            int r11 = r11 + 1
            goto L77
        L75:
            r18 = r15
        L77:
            long r12 = r12 >> r18
            int r9 = r9 + 1
            r0 = r21
            r15 = r18
            goto L41
        L80:
            r0 = r15
            if (r14 != r0) goto L8a
        L83:
            if (r10 == r8) goto L8a
            int r10 = r10 + 1
            r0 = r21
            goto L24
        L8a:
            r3.append(r4)
        L8d:
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.j.f(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectFloatMap.joinToString(java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[PHI: r10
  0x0079: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x002b, B:20:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(kotlin.jvm.functions.Function2<? super K, ? super java.lang.Float, ? extends java.lang.CharSequence> r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "transform"
            kotlin.jvm.internal.j.g(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ""
            r2.<init>(r3)
            java.lang.Object[] r4 = r0.keys
            float[] r5 = r0.values
            long[] r6 = r0.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7e
            r9 = 0
            r10 = 0
        L1d:
            r11 = r6[r9]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L79
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L37:
            if (r15 >= r13) goto L76
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L6d
            int r16 = r9 << 3
            int r16 = r16 + r15
            r8 = r4[r16]
            r16 = r5[r16]
            r18 = r14
            r14 = -1
            if (r10 != r14) goto L56
            java.lang.String r1 = "..."
            r2.append(r1)
            goto L81
        L56:
            if (r10 == 0) goto L5d
            java.lang.String r14 = ", "
            r2.append(r14)
        L5d:
            java.lang.Float r14 = java.lang.Float.valueOf(r16)
            java.lang.Object r8 = r1.invoke(r8, r14)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r2.append(r8)
            int r10 = r10 + 1
            goto L6f
        L6d:
            r18 = r14
        L6f:
            long r11 = r11 >> r18
            int r15 = r15 + 1
            r14 = r18
            goto L37
        L76:
            r8 = r14
            if (r13 != r8) goto L7e
        L79:
            if (r9 == r7) goto L7e
            int r9 = r9 + 1
            goto L1d
        L7e:
            r2.append(r3)
        L81:
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.j.f(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectFloatMap.joinToString(kotlin.jvm.functions.Function2):java.lang.String");
    }
}
