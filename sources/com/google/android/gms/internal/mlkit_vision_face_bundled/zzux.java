package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.camera.core.impl.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class zzux extends zzth implements RandomAccess, zzvb {
    private int[] zza;
    private int zzb;

    static {
        new zzux(new int[0], 0, false);
    }

    public zzux() {
        this(new int[10], 0, true);
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
        int iIntValue = ((Integer) obj).intValue();
        zza();
        if (i < 0 || i > (i4 = this.zzb)) {
            throw new IndexOutOfBoundsException(zzg(i));
        }
        int i6 = i + 1;
        int[] iArr = this.zza;
        if (i4 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i6, i4 - i);
        } else {
            int[] iArr2 = new int[a.a(i4, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.zza, i, iArr2, i6, this.zzb - i);
            this.zza = iArr2;
        }
        this.zza[i] = iIntValue;
        this.zzb++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzvc.zzb;
        collection.getClass();
        if (!(collection instanceof zzux)) {
            return super.addAll(collection);
        }
        zzux zzuxVar = (zzux) collection;
        int i = zzuxVar.zzb;
        if (i == 0) {
            return false;
        }
        int i4 = this.zzb;
        if (Integer.MAX_VALUE - i4 < i) {
            throw new OutOfMemoryError();
        }
        int i6 = i4 + i;
        int[] iArr = this.zza;
        if (i6 > iArr.length) {
            this.zza = Arrays.copyOf(iArr, i6);
        }
        System.arraycopy(zzuxVar.zza, 0, this.zza, this.zzb, zzuxVar.zzb);
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
        if (!(obj instanceof zzux)) {
            return super.equals(obj);
        }
        zzux zzuxVar = (zzux) obj;
        if (this.zzb != zzuxVar.zzb) {
            return false;
        }
        int[] iArr = zzuxVar.zza;
        for (int i = 0; i < this.zzb; i++) {
            if (this.zza[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzh(i);
        return Integer.valueOf(this.zza[i]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            i = (i * 31) + this.zza[i4];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.zzb;
        for (int i4 = 0; i4 < i; i4++) {
            if (this.zza[i4] == iIntValue) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzh(i);
        int[] iArr = this.zza;
        int i4 = iArr[i];
        if (i < this.zzb - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        zza();
        if (i4 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zza;
        System.arraycopy(iArr, i4, iArr, i, this.zzb - i4);
        this.zzb -= i4 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zza();
        zzh(i);
        int[] iArr = this.zza;
        int i4 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvb
    public final /* bridge */ /* synthetic */ zzvb zzd(int i) {
        if (i >= this.zzb) {
            return new zzux(Arrays.copyOf(this.zza, i), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final int zze(int i) {
        zzh(i);
        return this.zza[i];
    }

    public final void zzf(int i) {
        zza();
        int i4 = this.zzb;
        int[] iArr = this.zza;
        if (i4 == iArr.length) {
            int[] iArr2 = new int[a.a(i4, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i4);
            this.zza = iArr2;
        }
        int[] iArr3 = this.zza;
        int i6 = this.zzb;
        this.zzb = i6 + 1;
        iArr3[i6] = i;
    }

    private zzux(int[] iArr, int i, boolean z4) {
        super(z4);
        this.zza = iArr;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Integer) obj).intValue());
        return true;
    }
}
