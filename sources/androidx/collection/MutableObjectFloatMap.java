package androidx.collection;

import bj.AbstractC1046q;
import cj.C1127m;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes.dex */
public final class MutableObjectFloatMap<K> extends ObjectFloatMap<K> {
    private int growthLimit;

    public MutableObjectFloatMap() {
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

    private final int findIndex(K k8) {
        int iHashCode = (k8 != null ? k8.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i = iHashCode ^ (iHashCode << 16);
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
            int i15 = i6;
            long j7 = j ^ (j6 * ScatterMapKt.BitmaskLsb);
            for (long j9 = (~j7) & (j7 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int iNumberOfTrailingZeros = (i11 + (Long.numberOfTrailingZeros(j9) >> 3)) & i10;
                if (j.b(this.keys[iNumberOfTrailingZeros], k8)) {
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
            i12 += 8;
            i11 = (i11 + i12) & i10;
            i6 = i15;
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
        this.keys = new Object[iMax];
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
        int i4;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        int i6 = this._capacity;
        initializeStorage(i);
        Object[] objArr2 = this.keys;
        float[] fArr2 = this.values;
        int i10 = 0;
        while (i10 < i6) {
            if (((jArr[i10 >> 3] >> ((i10 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i10];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int i11 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i11 >>> 7);
                long j = i11 & 127;
                long[] jArr2 = this.metadata;
                int i12 = iFindFirstAvailableSlot >> 3;
                int i13 = (iFindFirstAvailableSlot & 7) << 3;
                i4 = i10;
                jArr2[i12] = (jArr2[i12] & (~(255 << i13))) | (j << i13);
                int i14 = this._capacity;
                int i15 = ((iFindFirstAvailableSlot - 7) & i14) + (i14 & 7);
                int i16 = i15 >> 3;
                int i17 = (i15 & 7) << 3;
                jArr2[i16] = (jArr2[i16] & (~(255 << i17))) | (j << i17);
                objArr2[iFindFirstAvailableSlot] = obj;
                fArr2[iFindFirstAvailableSlot] = fArr[i4];
            } else {
                i4 = i10;
            }
            i10 = i4 + 1;
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
        C1127m.m(this.keys, null, 0, this._capacity);
        initializeGrowth();
    }

    public final float getOrPut(K k8, Function0<Float> defaultValue) {
        j.g(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(k8);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        float fFloatValue = ((Number) defaultValue.invoke()).floatValue();
        set(k8, fFloatValue);
        return fFloatValue;
    }

    public final void minusAssign(K k8) {
        remove(k8);
    }

    public final void plusAssign(ObjectFloatMap<K> from) {
        j.g(from, "from");
        putAll(from);
    }

    public final void put(K k8, float f) {
        set(k8, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(ObjectFloatMap<K> from) {
        j.g(from, "from");
        Object[] objArr = from.keys;
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
                        set(objArr[i10], fArr[i10]);
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

    public final void remove(K k8) {
        int iFindKeyIndex = findKeyIndex(k8);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public final void removeIf(Function2<? super K, ? super Float, Boolean> predicate) {
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
                        if (((Boolean) predicate.invoke(this.keys[i10], Float.valueOf(this.values[i10]))).booleanValue()) {
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
        this.keys[i] = null;
    }

    public final void set(K k8, float f) {
        int iFindIndex = findIndex(k8);
        if (iFindIndex < 0) {
            iFindIndex = ~iFindIndex;
        }
        this.keys[iFindIndex] = k8;
        this.values[iFindIndex] = f;
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

    public /* synthetic */ MutableObjectFloatMap(int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 6 : i);
    }

    public final void minusAssign(K[] keys) {
        j.g(keys, "keys");
        for (K k8 : keys) {
            remove(k8);
        }
    }

    public final float put(K k8, float f, float f3) {
        int iFindIndex = findIndex(k8);
        if (iFindIndex < 0) {
            iFindIndex = ~iFindIndex;
        } else {
            f3 = this.values[iFindIndex];
        }
        this.keys[iFindIndex] = k8;
        this.values[iFindIndex] = f;
        return f3;
    }

    public MutableObjectFloatMap(int i) {
        super(null);
        if (i >= 0) {
            initializeStorage(ScatterMapKt.unloadedCapacity(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }

    public final boolean remove(K k8, float f) {
        int iFindKeyIndex = findKeyIndex(k8);
        if (iFindKeyIndex < 0 || this.values[iFindKeyIndex] != f) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void minusAssign(Iterable<? extends K> keys) {
        j.g(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(Sequence<? extends K> keys) {
        j.g(keys, "keys");
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<K> keys) {
        j.g(keys, "keys");
        Object[] objArr = keys.elements;
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
                        remove(objArr[(i << 3) + i6]);
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
}
