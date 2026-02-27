package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzglq extends zzgke {
    static final zzglq zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzglq(objArr, 0, objArr, 0, 0);
    }

    public zzglq(Object[] objArr, int i, Object[] objArr2, int i4, int i6) {
        this.zzb = objArr;
        this.zze = i;
        this.zzc = objArr2;
        this.zzf = i4;
        this.zzg = i6;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.zzc;
            if (objArr.length != 0) {
                int iZzb = zzgjs.zzb(obj);
                while (true) {
                    int i = iZzb & this.zzf;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iZzb = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgke, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgke, com.google.android.gms.internal.ads.zzgjv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zze().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgke, com.google.android.gms.internal.ads.zzgjv
    /* JADX INFO: renamed from: zza */
    public final zzgmd iterator() {
        return zze().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final Object[] zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final int zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final int zzg(Object[] objArr, int i) {
        Object[] objArr2 = this.zzb;
        int i4 = this.zzg;
        System.arraycopy(objArr2, 0, objArr, i, i4);
        return i + i4;
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final boolean zzq() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final zzgjz zzr() {
        return zzgjz.zzt(this.zzb, this.zzg);
    }
}
