package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzafk implements zzacu {
    private zzacx zzb;
    private int zzc;
    private int zzd;
    private int zze;

    @Nullable
    private zzago zzg;
    private zzacv zzh;
    private zzafn zzi;

    @Nullable
    private zzaim zzj;
    private final zzef zza = new zzef(2);
    private long zzf = -1;

    private final int zza(zzacv zzacvVar) throws IOException {
        zzef zzefVar = this.zza;
        zzefVar.zza(2);
        ((zzacl) zzacvVar).zzh(zzefVar.zzi(), 0, 2, false);
        return zzefVar.zzt();
    }

    private final void zzb() {
        zzacx zzacxVar = this.zzb;
        zzacxVar.getClass();
        zzacxVar.zzv();
        this.zzb.zzw(new zzadu(androidx.media3.common.C.TIME_UNSET, 0L));
        this.zzc = 6;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        if (zza(zzacvVar) != 65496) {
            return false;
        }
        int iZza = zza(zzacvVar);
        this.zzd = iZza;
        if (iZza == 65504) {
            zzef zzefVar = this.zza;
            zzefVar.zza(2);
            zzacl zzaclVar = (zzacl) zzacvVar;
            zzaclVar.zzh(zzefVar.zzi(), 0, 2, false);
            zzaclVar.zzj(zzefVar.zzt() - 2, false);
            iZza = zza(zzacvVar);
            this.zzd = iZza;
        }
        return iZza == 65505;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ List zze() {
        return AbstractC1170d.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zzb = zzacxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018e  */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzg(com.google.android.gms.internal.ads.zzacv r27, com.google.android.gms.internal.ads.zzads r28) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafk.zzg(com.google.android.gms.internal.ads.zzacv, com.google.android.gms.internal.ads.zzads):int");
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j6) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzaim zzaimVar = this.zzj;
            zzaimVar.getClass();
            zzaimVar.zzh(j, j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ zzacu zzi() {
        return AbstractC1170d.b(this);
    }
}
