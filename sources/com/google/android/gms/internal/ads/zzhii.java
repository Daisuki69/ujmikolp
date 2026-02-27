package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class zzhii extends zzhgn implements RandomAccess, zzhip, zzhkb {
    private static final int[] zza;
    private static final zzhii zzb;
    private int[] zzc;
    private int zzd;

    static {
        int[] iArr = new int[0];
        zza = iArr;
        zzb = new zzhii(iArr, 0, false);
    }

    public zzhii() {
        this(zza, 0, true);
    }

    public static zzhii zzd() {
        return zzb;
    }

    private static int zzk(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final void zzl(int i) {
        if (i < 0 || i >= this.zzd) {
            throw new IndexOutOfBoundsException(zzm(i));
        }
    }

    private final String zzm(int i) {
        int i4 = this.zzd;
        return androidx.media3.datasource.cache.c.n(new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i4).length()), "Index:", i, ", Size:", i4);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i4;
        int iIntValue = ((Integer) obj).intValue();
        zzea();
        if (i < 0 || i > (i4 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzm(i));
        }
        int i6 = i + 1;
        int[] iArr = this.zzc;
        int length = iArr.length;
        if (i4 < length) {
            System.arraycopy(iArr, i, iArr, i6, i4 - i);
        } else {
            int[] iArr2 = new int[zzk(length)];
            System.arraycopy(this.zzc, 0, iArr2, 0, i);
            System.arraycopy(this.zzc, i, iArr2, i6, this.zzd - i);
            this.zzc = iArr2;
        }
        this.zzc[i] = iIntValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzea();
        byte[] bArr = zzhiu.zzb;
        collection.getClass();
        if (!(collection instanceof zzhii)) {
            return super.addAll(collection);
        }
        zzhii zzhiiVar = (zzhii) collection;
        int i = zzhiiVar.zzd;
        if (i == 0) {
            return false;
        }
        int i4 = this.zzd;
        if (Integer.MAX_VALUE - i4 < i) {
            throw new OutOfMemoryError();
        }
        int i6 = i4 + i;
        int[] iArr = this.zzc;
        if (i6 > iArr.length) {
            this.zzc = Arrays.copyOf(iArr, i6);
        }
        System.arraycopy(zzhiiVar.zzc, 0, this.zzc, this.zzd, zzhiiVar.zzd);
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
        if (!(obj instanceof zzhii)) {
            return super.equals(obj);
        }
        zzhii zzhiiVar = (zzhii) obj;
        if (this.zzd != zzhiiVar.zzd) {
            return false;
        }
        int[] iArr = zzhiiVar.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (this.zzc[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzl(i);
        return Integer.valueOf(this.zzc[i]);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i4 = 0; i4 < this.zzd; i4++) {
            i = (i * 31) + this.zzc[i4];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.zzd;
        for (int i4 = 0; i4 < i; i4++) {
            if (this.zzc[i4] == iIntValue) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzea();
        zzl(i);
        int[] iArr = this.zzc;
        int i4 = iArr[i];
        if (i < this.zzd - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        zzea();
        if (i4 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzc;
        System.arraycopy(iArr, i4, iArr, i, this.zzd - i4);
        this.zzd -= i4 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return Integer.valueOf(zzg(i, ((Integer) obj).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhit, com.google.android.gms.internal.ads.zzhij
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzhip zzh(int i) {
        if (i >= this.zzd) {
            return new zzhii(i == 0 ? zza : Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzhip
    public final int zzf(int i) {
        zzl(i);
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhip
    public final int zzg(int i, int i4) {
        zzea();
        zzl(i);
        int[] iArr = this.zzc;
        int i6 = iArr[i];
        iArr[i] = i4;
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.zzhip
    public final void zzi(int i) {
        zzea();
        int i4 = this.zzd;
        int length = this.zzc.length;
        if (i4 == length) {
            int[] iArr = new int[zzk(length)];
            System.arraycopy(this.zzc, 0, iArr, 0, this.zzd);
            this.zzc = iArr;
        }
        int[] iArr2 = this.zzc;
        int i6 = this.zzd;
        this.zzd = i6 + 1;
        iArr2[i6] = i;
    }

    public final void zzj(int i) {
        int length = this.zzc.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new int[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzk(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzhii(int[] iArr, int i, boolean z4) {
        super(z4);
        this.zzc = iArr;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzi(((Integer) obj).intValue());
        return true;
    }
}
