package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzuk extends zzws {
    private final boolean zzb;
    private final zzbd zzc;
    private final zzbc zzd;
    private zzui zze;

    @Nullable
    private zzuh zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzuk(zzur zzurVar, boolean z4) {
        boolean z5;
        super(zzurVar);
        if (z4) {
            zzurVar.zzI();
            z5 = true;
        } else {
            z5 = false;
        }
        this.zzb = z5;
        this.zzc = new zzbd();
        this.zzd = new zzbc();
        zzurVar.zzH();
        this.zze = zzui.zzp(zzurVar.zzJ());
    }

    private final Object zzK(Object obj) {
        return (this.zze.zzs() == null || !obj.equals(zzui.zzc)) ? obj : this.zze.zzs();
    }

    private final boolean zzL(long j) {
        zzuh zzuhVar = this.zzf;
        int iZze = this.zze.zze(zzuhVar.zza.zza);
        if (iZze == -1) {
            return false;
        }
        zzui zzuiVar = this.zze;
        zzbc zzbcVar = this.zzd;
        zzuiVar.zzd(iZze, zzbcVar, false);
        long j6 = zzbcVar.zzd;
        if (j6 != androidx.media3.common.C.TIME_UNSET && j >= j6) {
            j = Math.max(0L, j6 - 1);
        }
        zzuhVar.zzo(j);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zzur
    public final void zzA(zzaj zzajVar) {
        if (this.zzi) {
            this.zze = this.zze.zzr(new zzwo(this.zze.zzb, zzajVar));
        } else {
            this.zze = zzui.zzp(zzajVar);
        }
        ((zzws) this).zza.zzA(zzajVar);
    }

    @Override // com.google.android.gms.internal.ads.zzws
    public final void zzB() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzv(null, ((zzws) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzws, com.google.android.gms.internal.ads.zzur
    public final void zzC(zzun zzunVar) {
        ((zzuh) zzunVar).zzu();
        if (zzunVar == this.zzf) {
            this.zzf = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    @Override // com.google.android.gms.internal.ads.zzws
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzD(com.google.android.gms.internal.ads.zzbe r12) {
        /*
            r11 = this;
            boolean r0 = r11.zzh
            r1 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzui r0 = r11.zze
            com.google.android.gms.internal.ads.zzui r12 = r0.zzr(r12)
            r11.zze = r12
            com.google.android.gms.internal.ads.zzuh r12 = r11.zzf
            if (r12 == 0) goto L97
            long r2 = r12.zzq()
            r11.zzL(r2)
            goto L97
        L1a:
            boolean r0 = r12.zzg()
            if (r0 == 0) goto L36
            boolean r0 = r11.zzi
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zzui r0 = r11.zze
            com.google.android.gms.internal.ads.zzui r12 = r0.zzr(r12)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbd.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzui.zzc
            com.google.android.gms.internal.ads.zzui r12 = com.google.android.gms.internal.ads.zzui.zzq(r12, r0, r2)
        L33:
            r11.zze = r12
            goto L97
        L36:
            com.google.android.gms.internal.ads.zzbd r3 = r11.zzc
            r0 = 0
            r4 = 0
            r12.zzb(r0, r3, r4)
            java.lang.Object r8 = r3.zzb
            com.google.android.gms.internal.ads.zzuh r2 = r11.zzf
            if (r2 == 0) goto L5d
            long r6 = r2.zza()
            com.google.android.gms.internal.ads.zzui r9 = r11.zze
            com.google.android.gms.internal.ads.zzbc r10 = r11.zzd
            com.google.android.gms.internal.ads.zzup r2 = r2.zza
            java.lang.Object r2 = r2.zza
            r9.zzo(r2, r10)
            com.google.android.gms.internal.ads.zzui r2 = r11.zze
            r2.zzb(r0, r3, r4)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L5d
            goto L5e
        L5d:
            r6 = r4
        L5e:
            com.google.android.gms.internal.ads.zzbc r4 = r11.zzd
            r5 = 0
            r2 = r12
            android.util.Pair r12 = r2.zzm(r3, r4, r5, r6)
            java.lang.Object r0 = r12.first
            java.lang.Object r12 = r12.second
            java.lang.Long r12 = (java.lang.Long) r12
            long r3 = r12.longValue()
            boolean r12 = r11.zzi
            if (r12 == 0) goto L7b
            com.google.android.gms.internal.ads.zzui r12 = r11.zze
            com.google.android.gms.internal.ads.zzui r12 = r12.zzr(r2)
            goto L7f
        L7b:
            com.google.android.gms.internal.ads.zzui r12 = com.google.android.gms.internal.ads.zzui.zzq(r2, r8, r0)
        L7f:
            r11.zze = r12
            com.google.android.gms.internal.ads.zzuh r12 = r11.zzf
            if (r12 == 0) goto L97
            boolean r0 = r11.zzL(r3)
            if (r0 == 0) goto L97
            com.google.android.gms.internal.ads.zzup r12 = r12.zza
            java.lang.Object r0 = r12.zza
            java.lang.Object r0 = r11.zzK(r0)
            com.google.android.gms.internal.ads.zzup r1 = r12.zza(r0)
        L97:
            r12 = 1
            r11.zzi = r12
            r11.zzh = r12
            com.google.android.gms.internal.ads.zzui r12 = r11.zze
            r11.zze(r12)
            if (r1 == 0) goto Lab
            com.google.android.gms.internal.ads.zzuh r12 = r11.zzf
            r12.getClass()
            r12.zzt(r1)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuk.zzD(com.google.android.gms.internal.ads.zzbe):void");
    }

    @Override // com.google.android.gms.internal.ads.zzws
    @Nullable
    public final zzup zzE(zzup zzupVar) {
        Object objZzs = this.zze.zzs();
        Object obj = zzupVar.zza;
        if (objZzs != null && this.zze.zzs().equals(obj)) {
            obj = zzui.zzc;
        }
        return zzupVar.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzws, com.google.android.gms.internal.ads.zzur
    /* JADX INFO: renamed from: zzF, reason: merged with bridge method [inline-methods] */
    public final zzuh zzG(zzup zzupVar, zzyv zzyvVar, long j) {
        zzuh zzuhVar = new zzuh(zzupVar, zzyvVar, j);
        zzuhVar.zzr(((zzws) this).zza);
        if (this.zzh) {
            zzuhVar.zzt(zzupVar.zza(zzK(zzupVar.zza)));
            return zzuhVar;
        }
        this.zzf = zzuhVar;
        if (!this.zzg) {
            this.zzg = true;
            zzv(null, ((zzws) this).zza);
        }
        return zzuhVar;
    }

    @Override // com.google.android.gms.internal.ads.zztx, com.google.android.gms.internal.ads.zzto
    public final void zzd() {
        this.zzh = false;
        this.zzg = false;
        super.zzd();
    }

    public final zzbe zzz() {
        return this.zze;
    }
}
