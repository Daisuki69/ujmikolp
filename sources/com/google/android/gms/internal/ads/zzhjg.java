package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class zzhjg extends zzhgn implements RandomAccess, zzhis, zzhkb {
    private static final long[] zza;
    private static final zzhjg zzb;
    private long[] zzc;
    private int zzd;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        zzb = new zzhjg(jArr, 0, false);
    }

    public zzhjg() {
        this(zza, 0, true);
    }

    public static zzhjg zzg() {
        return zzb;
    }

    private static int zzj(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final void zzk(int i) {
        if (i < 0 || i >= this.zzd) {
            throw new IndexOutOfBoundsException(zzl(i));
        }
    }

    private final String zzl(int i) {
        int i4 = this.zzd;
        return androidx.media3.datasource.cache.c.n(new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i4).length()), "Index:", i, ", Size:", i4);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i4;
        long jLongValue = ((Long) obj).longValue();
        zzea();
        if (i < 0 || i > (i4 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzl(i));
        }
        int i6 = i + 1;
        long[] jArr = this.zzc;
        int length = jArr.length;
        if (i4 < length) {
            System.arraycopy(jArr, i, jArr, i6, i4 - i);
        } else {
            long[] jArr2 = new long[zzj(length)];
            System.arraycopy(this.zzc, 0, jArr2, 0, i);
            System.arraycopy(this.zzc, i, jArr2, i6, this.zzd - i);
            this.zzc = jArr2;
        }
        this.zzc[i] = jLongValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzea();
        byte[] bArr = zzhiu.zzb;
        collection.getClass();
        if (!(collection instanceof zzhjg)) {
            return super.addAll(collection);
        }
        zzhjg zzhjgVar = (zzhjg) collection;
        int i = zzhjgVar.zzd;
        if (i == 0) {
            return false;
        }
        int i4 = this.zzd;
        if (Integer.MAX_VALUE - i4 < i) {
            throw new OutOfMemoryError();
        }
        int i6 = i4 + i;
        long[] jArr = this.zzc;
        if (i6 > jArr.length) {
            this.zzc = Arrays.copyOf(jArr, i6);
        }
        System.arraycopy(zzhjgVar.zzc, 0, this.zzc, this.zzd, zzhjgVar.zzd);
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
        if (!(obj instanceof zzhjg)) {
            return super.equals(obj);
        }
        zzhjg zzhjgVar = (zzhjg) obj;
        if (this.zzd != zzhjgVar.zzd) {
            return false;
        }
        long[] jArr = zzhjgVar.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (this.zzc[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzk(i);
        return Long.valueOf(this.zzc[i]);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i4 = 0; i4 < this.zzd; i4++) {
            long j = this.zzc[i4];
            byte[] bArr = zzhiu.zzb;
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
        int i = this.zzd;
        for (int i4 = 0; i4 < i; i4++) {
            if (this.zzc[i4] == jLongValue) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzea();
        zzk(i);
        long[] jArr = this.zzc;
        long j = jArr[i];
        if (i < this.zzd - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        zzea();
        if (i4 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzc;
        System.arraycopy(jArr, i4, jArr, i, this.zzd - i4);
        this.zzd -= i4 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return Long.valueOf(zze(i, ((Long) obj).longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhis
    public final long zzc(int i) {
        zzk(i);
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhis
    public final void zzd(long j) {
        zzea();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            long[] jArr = new long[zzj(length)];
            System.arraycopy(this.zzc, 0, jArr, 0, this.zzd);
            this.zzc = jArr;
        }
        long[] jArr2 = this.zzc;
        int i4 = this.zzd;
        this.zzd = i4 + 1;
        jArr2[i4] = j;
    }

    @Override // com.google.android.gms.internal.ads.zzhis
    public final long zze(int i, long j) {
        zzea();
        zzk(i);
        long[] jArr = this.zzc;
        long j6 = jArr[i];
        jArr[i] = j;
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.zzhit, com.google.android.gms.internal.ads.zzhij
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzhis zzh(int i) {
        if (i >= this.zzd) {
            return new zzhjg(i == 0 ? zza : Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzi(int i) {
        int length = this.zzc.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new long[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzhjg(long[] jArr, int i, boolean z4) {
        super(z4);
        this.zzc = jArr;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzd(((Long) obj).longValue());
        return true;
    }
}
