package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzhx implements zzkm {
    private final zzlw zza;
    private final zzhw zzb;

    @Nullable
    private zzll zzc;

    @Nullable
    private zzkm zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzhx(zzhw zzhwVar, zzdb zzdbVar) {
        this.zzb = zzhwVar;
        this.zza = new zzlw(zzdbVar);
    }

    public final void zza() {
        this.zzf = true;
        this.zza.zza();
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zzb();
    }

    public final void zzc(long j) {
        this.zza.zzc(j);
    }

    public final void zzd(zzll zzllVar) throws zzhz {
        zzkm zzkmVar;
        zzkm zzkmVarZzd = zzllVar.zzd();
        if (zzkmVarZzd == null || zzkmVarZzd == (zzkmVar = this.zzd)) {
            return;
        }
        if (zzkmVar != null) {
            throw zzhz.zzc(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzkmVarZzd;
        this.zzc = zzllVar;
        zzkmVarZzd.zzi(this.zza.zzj());
    }

    public final void zze(zzll zzllVar) {
        if (zzllVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzf(boolean r6) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzll r0 = r5.zzc
            if (r0 == 0) goto L69
            boolean r0 = r0.zzY()
            if (r0 != 0) goto L69
            if (r6 == 0) goto L15
            com.google.android.gms.internal.ads.zzll r0 = r5.zzc
            int r0 = r0.zze()
            r1 = 2
            if (r0 != r1) goto L69
        L15:
            com.google.android.gms.internal.ads.zzll r0 = r5.zzc
            boolean r0 = r0.zzX()
            if (r0 != 0) goto L28
            if (r6 != 0) goto L69
            com.google.android.gms.internal.ads.zzll r6 = r5.zzc
            boolean r6 = r6.zzdb()
            if (r6 == 0) goto L28
            goto L69
        L28:
            com.google.android.gms.internal.ads.zzkm r6 = r5.zzd
            r6.getClass()
            long r0 = r6.zzg()
            boolean r2 = r5.zze
            if (r2 == 0) goto L4d
            com.google.android.gms.internal.ads.zzlw r2 = r5.zza
            long r3 = r2.zzg()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L43
            r2.zzb()
            goto L75
        L43:
            r3 = 0
            r5.zze = r3
            boolean r3 = r5.zzf
            if (r3 == 0) goto L4d
            r2.zza()
        L4d:
            com.google.android.gms.internal.ads.zzlw r2 = r5.zza
            r2.zzc(r0)
            com.google.android.gms.internal.ads.zzau r6 = r6.zzj()
            com.google.android.gms.internal.ads.zzau r0 = r2.zzj()
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L75
            r2.zzi(r6)
            com.google.android.gms.internal.ads.zzhw r0 = r5.zzb
            r0.zzc(r6)
            goto L75
        L69:
            r6 = 1
            r5.zze = r6
            boolean r6 = r5.zzf
            if (r6 == 0) goto L75
            com.google.android.gms.internal.ads.zzlw r6 = r5.zza
            r6.zza()
        L75:
            long r0 = r5.zzg()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhx.zzf(boolean):long");
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final long zzg() {
        if (this.zze) {
            return this.zza.zzg();
        }
        zzkm zzkmVar = this.zzd;
        zzkmVar.getClass();
        return zzkmVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final boolean zzh() {
        if (this.zze) {
            return false;
        }
        zzkm zzkmVar = this.zzd;
        zzkmVar.getClass();
        return zzkmVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzi(zzau zzauVar) {
        zzkm zzkmVar = this.zzd;
        if (zzkmVar != null) {
            zzkmVar.zzi(zzauVar);
            zzauVar = this.zzd.zzj();
        }
        this.zza.zzi(zzauVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final zzau zzj() {
        zzkm zzkmVar = this.zzd;
        return zzkmVar != null ? zzkmVar.zzj() : this.zza.zzj();
    }
}
