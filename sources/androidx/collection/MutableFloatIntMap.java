package androidx.collection;

import bj.AbstractC1046q;
import cj.C1127m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class MutableFloatIntMap extends FloatIntMap {
    private int growthLimit;

    public MutableFloatIntMap() {
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

    private final int findInsertIndex(float f) {
        int iFloatToIntBits = Float.floatToIntBits(f) * ScatterMapKt.MurmurHashC1;
        int i = iFloatToIntBits ^ (iFloatToIntBits << 16);
        int i4 = i >>> 7;
        int i6 = i & 127;
        int i10 = this._capacity;
        int i11 = i4 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j6 = i6;
            int i15 = i12;
            long j7 = j ^ (j6 * ScatterMapKt.BitmaskLsb);
            for (long j9 = (~j7) & (j7 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i11) & i10;
                if (this.keys[iNumberOfTrailingZeros] == f) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i4);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i4);
                }
                this._size++;
                int i16 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i17 = iFindFirstAvailableSlot >> 3;
                long j10 = jArr2[i17];
                int i18 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i16 - (((j10 >> i18) & 255) == 128 ? 1 : 0);
                jArr2[i17] = (j10 & (~(255 << i18))) | (j6 << i18);
                int i19 = this._capacity;
                int i20 = ((iFindFirstAvailableSlot - 7) & i19) + (i19 & 7);
                int i21 = i20 >> 3;
                int i22 = (i20 & 7) << 3;
                jArr2[i21] = ((~(255 << i22)) & jArr2[i21]) | (j6 << i22);
                return ~iFindFirstAvailableSlot;
            }
            i12 = i15 + 8;
            i11 = (i11 + i12) & i10;
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
        this.keys = new float[iMax];
        this.values = new int[iMax];
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
        MutableFloatIntMap mutableFloatIntMap = this;
        long[] jArr2 = mutableFloatIntMap.metadata;
        float[] fArr = mutableFloatIntMap.keys;
        int[] iArr = mutableFloatIntMap.values;
        int i4 = mutableFloatIntMap._capacity;
        initializeStorage(i);
        float[] fArr2 = mutableFloatIntMap.keys;
        int[] iArr2 = mutableFloatIntMap.values;
        int i6 = 0;
        while (i6 < i4) {
            if (((jArr2[i6 >> 3] >> ((i6 & 7) << 3)) & 255) < 128) {
                float f = fArr[i6];
                int iFloatToIntBits = Float.floatToIntBits(f) * ScatterMapKt.MurmurHashC1;
                int i10 = iFloatToIntBits ^ (iFloatToIntBits << 16);
                int iFindFirstAvailableSlot = mutableFloatIntMap.findFirstAvailableSlot(i10 >>> 7);
                long j = i10 & 127;
                long[] jArr3 = mutableFloatIntMap.metadata;
                int i11 = iFindFirstAvailableSlot >> 3;
                int i12 = (iFindFirstAvailableSlot & 7) << 3;
                jArr3[i11] = (jArr3[i11] & (~(255 << i12))) | (j << i12);
                int i13 = mutableFloatIntMap._capacity;
                int i14 = ((iFindFirstAvailableSlot - 7) & i13) + (i13 & 7);
                int i15 = i14 >> 3;
                int i16 = (i14 & 7) << 3;
                jArr = jArr2;
                jArr3[i15] = ((~(255 << i16)) & jArr3[i15]) | (j << i16);
                fArr2[iFindFirstAvailableSlot] = f;
                iArr2[iFindFirstAvailableSlot] = iArr[i6];
            } else {
                jArr = jArr2;
            }
            i6++;
            mutableFloatIntMap = this;
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

    public final int getOrPut(float f, Function0<Integer> defaultValue) {
        j.g(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(f);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        int iIntValue = ((Number) defaultValue.invoke()).intValue();
        put(f, iIntValue);
        return iIntValue;
    }

    public final void minusAssign(float f) {
        remove(f);
    }

    public final void plusAssign(FloatIntMap from) {
        j.g(from, "from");
        putAll(from);
    }

    public final void put(float f, int i) {
        set(f, i);
    }

    public final void putAll(FloatIntMap from) {
        j.g(from, "from");
        float[] fArr = from.keys;
        int[] iArr = from.values;
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
                        set(fArr[i10], iArr[i10]);
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

    public final void remove(float f) {
        int iFindKeyIndex = findKeyIndex(f);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public final void removeIf(Function2<? super Float, ? super Integer, Boolean> predicate) {
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
                        if (((Boolean) predicate.invoke(Float.valueOf(this.keys[i10]), Integer.valueOf(this.values[i10]))).booleanValue()) {
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

    public final void set(float f, int i) {
        int iFindInsertIndex = findInsertIndex(f);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.keys[iFindInsertIndex] = f;
        this.values[iFindInsertIndex] = i;
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

    public /* synthetic */ MutableFloatIntMap(int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 6 : i);
    }

    public final void minusAssign(float[] keys) {
        j.g(keys, "keys");
        for (float f : keys) {
            remove(f);
        }
    }

    public final int put(float f, int i, int i4) {
        int iFindInsertIndex = findInsertIndex(f);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        } else {
            i4 = this.values[iFindInsertIndex];
        }
        this.keys[iFindInsertIndex] = f;
        this.values[iFindInsertIndex] = i;
        return i4;
    }

    public MutableFloatIntMap(int i) {
        super(null);
        if (i >= 0) {
            initializeStorage(ScatterMapKt.unloadedCapacity(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }

    public final boolean remove(float f, int i) {
        int iFindKeyIndex = findKeyIndex(f);
        if (iFindKeyIndex < 0 || this.values[iFindKeyIndex] != i) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void minusAssign(FloatSet keys) {
        j.g(keys, "keys");
        float[] fArr = keys.elements;
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
                        remove(fArr[(i << 3) + i6]);
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

    public final void minusAssign(FloatList keys) {
        j.g(keys, "keys");
        float[] fArr = keys.content;
        int i = keys._size;
        for (int i4 = 0; i4 < i; i4++) {
            remove(fArr[i4]);
        }
    }
}
