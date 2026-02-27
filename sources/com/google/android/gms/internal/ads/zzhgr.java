package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class zzhgr extends zzhgn implements RandomAccess, zzhij, zzhkb {
    private static final boolean[] zza;
    private static final zzhgr zzb;
    private boolean[] zzc;
    private int zzd;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        zzb = new zzhgr(zArr, 0, false);
    }

    public zzhgr() {
        this(zza, 0, true);
    }

    public static zzhgr zzd() {
        return zzb;
    }

    private static int zzi(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final void zzj(int i) {
        if (i < 0 || i >= this.zzd) {
            throw new IndexOutOfBoundsException(zzk(i));
        }
    }

    private final String zzk(int i) {
        int i4 = this.zzd;
        return androidx.media3.datasource.cache.c.n(new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i4).length()), "Index:", i, ", Size:", i4);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i4;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zzea();
        if (i < 0 || i > (i4 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzk(i));
        }
        int i6 = i + 1;
        boolean[] zArr = this.zzc;
        int length = zArr.length;
        if (i4 < length) {
            System.arraycopy(zArr, i, zArr, i6, i4 - i);
        } else {
            boolean[] zArr2 = new boolean[zzi(length)];
            System.arraycopy(this.zzc, 0, zArr2, 0, i);
            System.arraycopy(this.zzc, i, zArr2, i6, this.zzd - i);
            this.zzc = zArr2;
        }
        this.zzc[i] = zBooleanValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzea();
        byte[] bArr = zzhiu.zzb;
        collection.getClass();
        if (!(collection instanceof zzhgr)) {
            return super.addAll(collection);
        }
        zzhgr zzhgrVar = (zzhgr) collection;
        int i = zzhgrVar.zzd;
        if (i == 0) {
            return false;
        }
        int i4 = this.zzd;
        if (Integer.MAX_VALUE - i4 < i) {
            throw new OutOfMemoryError();
        }
        int i6 = i4 + i;
        boolean[] zArr = this.zzc;
        if (i6 > zArr.length) {
            this.zzc = Arrays.copyOf(zArr, i6);
        }
        System.arraycopy(zzhgrVar.zzc, 0, this.zzc, this.zzd, zzhgrVar.zzd);
        this.zzd = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhgr)) {
            return super.equals(obj);
        }
        zzhgr zzhgrVar = (zzhgr) obj;
        if (this.zzd != zzhgrVar.zzd) {
            return false;
        }
        boolean[] zArr = zzhgrVar.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (this.zzc[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzj(i);
        return Boolean.valueOf(this.zzc[i]);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzb = 1;
        for (int i = 0; i < this.zzd; i++) {
            iZzb = (iZzb * 31) + zzhiu.zzb(this.zzc[i]);
        }
        return iZzb;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.zzd;
        for (int i4 = 0; i4 < i; i4++) {
            if (this.zzc[i4] == zBooleanValue) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzea();
        zzj(i);
        boolean[] zArr = this.zzc;
        boolean z4 = zArr[i];
        if (i < this.zzd - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        zzea();
        if (i4 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzc;
        System.arraycopy(zArr, i4, zArr, i, this.zzd - i4);
        this.zzd -= i4 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zzea();
        zzj(i);
        boolean[] zArr = this.zzc;
        boolean z4 = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhit, com.google.android.gms.internal.ads.zzhij
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzhij zzh(int i) {
        if (i >= this.zzd) {
            return new zzhgr(i == 0 ? zza : Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean zzf(int i) {
        zzj(i);
        return this.zzc[i];
    }

    public final void zzg(boolean z4) {
        zzea();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            boolean[] zArr = new boolean[zzi(length)];
            System.arraycopy(this.zzc, 0, zArr, 0, this.zzd);
            this.zzc = zArr;
        }
        boolean[] zArr2 = this.zzc;
        int i4 = this.zzd;
        this.zzd = i4 + 1;
        zArr2[i4] = z4;
    }

    private zzhgr(boolean[] zArr, int i, boolean z4) {
        super(z4);
        this.zzc = zArr;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Boolean) obj).booleanValue());
        return true;
    }
}
