package androidx.collection;

import bj.AbstractC1046q;
import cj.C1127m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class MutableIntFloatMap extends IntFloatMap {
    private int growthLimit;

    public MutableIntFloatMap() {
        this(0, 1, null);
    }

    private final void adjustStorage() {
        int i = this._capacity;
        if (i > 8) {
            long j = this._size;
            AbstractC1046q.a aVar = AbstractC1046q.f9177a;
            if (Long.compare((j * 32) ^ Long.MIN_VALUE, (((long) i) * 25) ^ Long.MIN_VALUE) <= 0) {
                removeDeletedMarkers();
                return;
            }
        }
        resizeStorage(ScatterMapKt.nextCapacity(this._capacity));
    }

    private final int findFirstAvailableSlot(int i) {
        int i4 = this._capacity;
        int i6 = i & i4;
        int i10 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i11 = i6 >> 3;
            int i12 = (i6 & 7) << 3;
            long j = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j6 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j6 != 0) {
                return (i6 + (Long.numberOfTrailingZeros(j6) >> 3)) & i4;
            }
            i10 += 8;
            i6 = (i6 + i10) & i4;
        }
    }

    private final int findInsertIndex(int i) {
        int i4 = ScatterMapKt.MurmurHashC1 * i;
        int i6 = i4 ^ (i4 << 16);
        int i10 = i6 >>> 7;
        int i11 = i6 & 127;
        int i12 = this._capacity;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j6 = i11;
            int i17 = i14;
            long j7 = j ^ (j6 * ScatterMapKt.BitmaskLsb);
            for (long j9 = (~j7) & (j7 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int iNumberOfTrailingZeros = (i13 + (Long.numberOfTrailingZeros(j9) >> 3)) & i12;
                if (this.keys[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i10);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i10);
                }
                this._size++;
                int i18 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i19 = iFindFirstAvailableSlot >> 3;
                long j10 = jArr2[i19];
                int i20 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i18 - (((j10 >> i20) & 255) == 128 ? 1 : 0);
                jArr2[i19] = (j10 & (~(255 << i20))) | (j6 << i20);
                int i21 = this._capacity;
                int i22 = ((iFindFirstAvailableSlot - 7) & i21) + (i21 & 7);
                int i23 = i22 >> 3;
                int i24 = (i22 & 7) << 3;
                jArr2[i23] = ((~(255 << i24)) & jArr2[i23]) | (j6 << i24);
                return ~iFindFirstAvailableSlot;
            }
            i14 = i17 + 8;
            i13 = (i13 + i14) & i12;
        }
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    private final void initializeMetadata(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            jArr = new long[((i + 15) & (-8)) >> 3];
            C1127m.n(jArr);
        }
        this.metadata = jArr;
        int i4 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j)) | j;
        initializeGrowth();
    }

    private final void initializeStorage(int i) {
        int iMax = i > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(i)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.keys = new int[iMax];
        this.values = new float[iMax];
    }

    private final void removeDeletedMarkers() {
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i4 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            int i10 = i6 >> 3;
            int i11 = (i6 & 7) << 3;
            if (((jArr[i10] >> i11) & 255) == 254) {
                long[] jArr2 = this.metadata;
                jArr2[i10] = (128 << i11) | (jArr2[i10] & (~(255 << i11)));
                int i12 = this._capacity;
                int i13 = ((i6 - 7) & i12) + (i12 & 7);
                int i14 = i13 >> 3;
                int i15 = (i13 & 7) << 3;
                jArr2[i14] = ((~(255 << i15)) & jArr2[i14]) | (128 << i15);
                i4++;
            }
        }
        this.growthLimit += i4;
    }

    private final void resizeStorage(int i) {
        long[] jArr;
        MutableIntFloatMap mutableIntFloatMap = this;
        long[] jArr2 = mutableIntFloatMap.metadata;
        int[] iArr = mutableIntFloatMap.keys;
        float[] fArr = mutableIntFloatMap.values;
        int i4 = mutableIntFloatMap._capacity;
        initializeStorage(i);
        int[] iArr2 = mutableIntFloatMap.keys;
        float[] fArr2 = mutableIntFloatMap.values;
        int i6 = 0;
        while (i6 < i4) {
            if (((jArr2[i6 >> 3] >> ((i6 & 7) << 3)) & 255) < 128) {
                int i10 = iArr[i6];
                int i11 = ScatterMapKt.MurmurHashC1 * i10;
                int i12 = i11 ^ (i11 << 16);
                int iFindFirstAvailableSlot = mutableIntFloatMap.findFirstAvailableSlot(i12 >>> 7);
                long j = i12 & 127;
                long[] jArr3 = mutableIntFloatMap.metadata;
                int i13 = iFindFirstAvailableSlot >> 3;
                int i14 = (iFindFirstAvailableSlot & 7) << 3;
                jArr3[i13] = (jArr3[i13] & (~(255 << i14))) | (j << i14);
                int i15 = mutableIntFloatMap._capacity;
                int i16 = ((iFindFirstAvailableSlot - 7) & i15) + (i15 & 7);
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                jArr = jArr2;
                jArr3[i17] = ((~(255 << i18)) & jArr3[i17]) | (j << i18);
                iArr2[iFindFirstAvailableSlot] = i10;
                fArr2[iFindFirstAvailableSlot] = fArr[i6];
            } else {
                jArr = jArr2;
            }
            i6++;
            mutableIntFloatMap = this;
            jArr2 = jArr;
        }
    }

    private final void writeMetadata(int i, long j) {
        long[] jArr = this.metadata;
        int i4 = i >> 3;
        int i6 = (i & 7) << 3;
        jArr[i4] = (jArr[i4] & (~(255 << i6))) | (j << i6);
        int i10 = this._capacity;
        int i11 = ((i - 7) & i10) + (i10 & 7);
        int i12 = i11 >> 3;
        int i13 = (i11 & 7) << 3;
        jArr[i12] = (j << i13) | (jArr[i12] & (~(255 << i13)));
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            C1127m.n(jArr);
            long[] jArr2 = this.metadata;
            int i = this._capacity;
            int i4 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i4] = (jArr2[i4] & (~j)) | j;
        }
        initializeGrowth();
    }

    public final float getOrPut(int i, Function0<Float> defaultValue) {
        j.g(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(i);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        float fFloatValue = ((Number) defaultValue.invoke()).floatValue();
        put(i, fFloatValue);
        return fFloatValue;
    }

    public final void minusAssign(int i) {
        remove(i);
    }

    public final void plusAssign(IntFloatMap from) {
        j.g(from, "from");
        putAll(from);
    }

    public final void put(int i, float f) {
        set(i, f);
    }

    public final void putAll(IntFloatMap from) {
        j.g(from, "from");
        int[] iArr = from.keys;
        float[] fArr = from.values;
        long[] jArr = from.metadata;
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
                        set(iArr[i10], fArr[i10]);
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

    public final void remove(int i) {
        int iFindKeyIndex = findKeyIndex(i);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public final void removeIf(Function2<? super Integer, ? super Float, Boolean> predicate) {
        j.g(predicate, "predicate");
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
                        if (((Boolean) predicate.invoke(Integer.valueOf(this.keys[i10]), Float.valueOf(this.values[i10]))).booleanValue()) {
                            removeValueAt(i10);
                        }
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

    public final void removeValueAt(int i) {
        this._size--;
        long[] jArr = this.metadata;
        int i4 = i >> 3;
        int i6 = (i & 7) << 3;
        jArr[i4] = (jArr[i4] & (~(255 << i6))) | (254 << i6);
        int i10 = this._capacity;
        int i11 = ((i - 7) & i10) + (i10 & 7);
        int i12 = i11 >> 3;
        int i13 = (i11 & 7) << 3;
        jArr[i12] = (jArr[i12] & (~(255 << i13))) | (254 << i13);
    }

    public final void set(int i, float f) {
        int iFindInsertIndex = findInsertIndex(i);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.keys[iFindInsertIndex] = i;
        this.values[iFindInsertIndex] = f;
    }

    public final int trim() {
        int i = this._capacity;
        int iNormalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (iNormalizeCapacity >= i) {
            return 0;
        }
        resizeStorage(iNormalizeCapacity);
        return i - this._capacity;
    }

    public /* synthetic */ MutableIntFloatMap(int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 6 : i);
    }

    public final void minusAssign(int[] keys) {
        j.g(keys, "keys");
        for (int i : keys) {
            remove(i);
        }
    }

    public final float put(int i, float f, float f3) {
        int iFindInsertIndex = findInsertIndex(i);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        } else {
            f3 = this.values[iFindInsertIndex];
        }
        this.keys[iFindInsertIndex] = i;
        this.values[iFindInsertIndex] = f;
        return f3;
    }

    public MutableIntFloatMap(int i) {
        super(null);
        if (i >= 0) {
            initializeStorage(ScatterMapKt.unloadedCapacity(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }

    public final boolean remove(int i, float f) {
        int iFindKeyIndex = findKeyIndex(i);
        if (iFindKeyIndex < 0 || this.values[iFindKeyIndex] != f) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void minusAssign(IntSet keys) {
        j.g(keys, "keys");
        int[] iArr = keys.elements;
        long[] jArr = keys.metadata;
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
                        remove(iArr[(i << 3) + i6]);
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

    public final void minusAssign(IntList keys) {
        j.g(keys, "keys");
        int[] iArr = keys.content;
        int i = keys._size;
        for (int i4 = 0; i4 < i; i4++) {
            remove(iArr[i4]);
        }
    }
}
