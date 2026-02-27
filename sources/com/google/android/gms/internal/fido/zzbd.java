package com.google.android.gms.internal.fido;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzbd extends zzba {
    static final zzbd zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzbd(objArr, 0, objArr, 0, 0);
    }

    public zzbd(Object[] objArr, int i, Object[] objArr2, int i4, int i6) {
        this.zzb = objArr;
        this.zze = i;
        this.zzc = objArr2;
        this.zzf = i4;
        this.zzg = i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.zzc;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iZza = zzav.zza(obj.hashCode());
        while (true) {
            int i = iZza & this.zzf;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iZza = i + 1;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzba, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.fido.zzba, com.google.android.gms.internal.fido.zzaw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzg().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.fido.zzaw
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzg);
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.fido.zzaw
    public final int zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.fido.zzaw
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzba, com.google.android.gms.internal.fido.zzaw
    /* JADX INFO: renamed from: zzd */
    public final zzbf iterator() {
        return zzg().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzaw
    public final Object[] zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.fido.zzba
    public final zzaz zzh() {
        return zzaz.zzh(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.fido.zzba
    public final boolean zzj() {
        return true;
    }
}
