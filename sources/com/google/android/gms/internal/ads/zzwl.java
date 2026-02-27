package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes3.dex */
final class zzwl {
    private int zza;
    private final SparseArray zzb;
    private final zzdf zzc;

    public zzwl() {
        this(zzwk.zza);
    }

    public final Object zza(int i) {
        SparseArray sparseArray;
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i4 = this.zza;
            if (i4 <= 0 || i >= this.zzb.keyAt(i4)) {
                break;
            }
            this.zza--;
        }
        while (true) {
            int i6 = this.zza;
            sparseArray = this.zzb;
            if (i6 >= sparseArray.size() - 1 || i < sparseArray.keyAt(this.zza + 1)) {
                break;
            }
            this.zza++;
        }
        return sparseArray.valueAt(this.zza);
    }

    public final void zzb(int i, Object obj) {
        if (this.zza == -1) {
            zzghc.zzh(this.zzb.size() == 0);
            this.zza = 0;
        }
        SparseArray sparseArray = this.zzb;
        if (sparseArray.size() > 0) {
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            zzghc.zza(i >= iKeyAt);
            if (iKeyAt == i) {
                this.zzc.zza(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        sparseArray.append(i, obj);
    }

    public final Object zzc() {
        return this.zzb.valueAt(r0.size() - 1);
    }

    public final void zzd(int i) {
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i4 >= sparseArray.size() - 1) {
                return;
            }
            int i6 = i4 + 1;
            if (i < sparseArray.keyAt(i6)) {
                return;
            }
            this.zzc.zza(sparseArray.valueAt(i4));
            sparseArray.removeAt(i4);
            int i10 = this.zza;
            if (i10 > 0) {
                this.zza = i10 - 1;
            }
            i4 = i6;
        }
    }

    public final void zze() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i >= sparseArray.size()) {
                this.zza = -1;
                sparseArray.clear();
                return;
            } else {
                this.zzc.zza(sparseArray.valueAt(i));
                i++;
            }
        }
    }

    public final boolean zzf() {
        return this.zzb.size() == 0;
    }

    public zzwl(zzdf zzdfVar) {
        this.zzb = new SparseArray();
        this.zzc = zzdfVar;
        this.zza = -1;
    }
}
