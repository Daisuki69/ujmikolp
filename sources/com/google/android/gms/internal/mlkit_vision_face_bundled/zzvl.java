package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.camera.core.impl.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class zzvl extends zzth implements RandomAccess, zzvb {
    private long[] zza;
    private int zzb;

    static {
        new zzvl(new long[0], 0, false);
    }

    public zzvl() {
        this(new long[10], 0, true);
    }

    private final String zzg(int i) {
        return a.c(i, this.zzb, "Index:", ", Size:");
    }

    private final void zzh(int i) {
        if (i < 0 || i >= this.zzb) {
            throw new IndexOutOfBoundsException(zzg(i));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i4;
        long jLongValue = ((Long) obj).longValue();
        zza();
        if (i < 0 || i > (i4 = this.zzb)) {
            throw new IndexOutOfBoundsException(zzg(i));
        }
        int i6 = i + 1;
        long[] jArr = this.zza;
        if (i4 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i6, i4 - i);
        } else {
            long[] jArr2 = new long[a.a(i4, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.zza, i, jArr2, i6, this.zzb - i);
            this.zza = jArr2;
        }
        this.zza[i] = jLongValue;
        this.zzb++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzvc.zzb;
        collection.getClass();
        if (!(collection instanceof zzvl)) {
            return super.addAll(collection);
        }
        zzvl zzvlVar = (zzvl) collection;
        int i = zzvlVar.zzb;
        if (i == 0) {
            return false;
        }
        int i4 = this.zzb;
        if (Integer.MAX_VALUE - i4 < i) {
            throw new OutOfMemoryError();
        }
        int i6 = i4 + i;
        long[] jArr = this.zza;
        if (i6 > jArr.length) {
            this.zza = Arrays.copyOf(jArr, i6);
        }
        System.arraycopy(zzvlVar.zza, 0, this.zza, this.zzb, zzvlVar.zzb);
        this.zzb = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzvl)) {
            return super.equals(obj);
        }
        zzvl zzvlVar = (zzvl) obj;
        if (this.zzb != zzvlVar.zzb) {
            return false;
        }
        long[] jArr = zzvlVar.zza;
        for (int i = 0; i < this.zzb; i++) {
            if (this.zza[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzh(i);
        return Long.valueOf(this.zza[i]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            long j = this.zza[i4];
            byte[] bArr = zzvc.zzb;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.zzb;
        for (int i4 = 0; i4 < i; i4++) {
            if (this.zza[i4] == jLongValue) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzh(i);
        long[] jArr = this.zza;
        long j = jArr[i];
        if (i < this.zzb - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        zza();
        if (i4 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zza;
        System.arraycopy(jArr, i4, jArr, i, this.zzb - i4);
        this.zzb -= i4 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        zzh(i);
        long[] jArr = this.zza;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvb
    public final /* bridge */ /* synthetic */ zzvb zzd(int i) {
        if (i >= this.zzb) {
            return new zzvl(Arrays.copyOf(this.zza, i), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i) {
        zzh(i);
        return this.zza[i];
    }

    public final void zzf(long j) {
        zza();
        int i = this.zzb;
        long[] jArr = this.zza;
        if (i == jArr.length) {
            long[] jArr2 = new long[a.a(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.zza = jArr2;
        }
        long[] jArr3 = this.zza;
        int i4 = this.zzb;
        this.zzb = i4 + 1;
        jArr3[i4] = j;
    }

    private zzvl(long[] jArr, int i, boolean z4) {
        super(z4);
        this.zza = jArr;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Long) obj).longValue());
        return true;
    }
}
