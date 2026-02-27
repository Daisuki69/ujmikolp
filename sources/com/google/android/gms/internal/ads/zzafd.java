package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafd implements zzacu {
    private zzacx zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzafb zzo;
    private zzafh zzp;
    private final zzef zza = new zzef(4);
    private final zzef zzb = new zzef(9);
    private final zzef zzc = new zzef(11);
    private final zzef zzd = new zzef();
    private final zzafe zze = new zzafe();
    private int zzg = 1;

    private final zzef zza(zzacv zzacvVar) throws IOException {
        zzef zzefVar = this.zzd;
        if (this.zzl > zzefVar.zzj()) {
            int iZzj = zzefVar.zzj();
            zzefVar.zzb(new byte[Math.max(iZzj + iZzj, this.zzl)], 0);
        } else {
            zzefVar.zzh(0);
        }
        zzefVar.zzf(this.zzl);
        zzacvVar.zzc(zzefVar.zzi(), 0, this.zzl);
        return zzefVar;
    }

    private final void zzb() {
        if (this.zzn) {
            return;
        }
        this.zzf.zzw(new zzadu(androidx.media3.common.C.TIME_UNSET, 0L));
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        zzef zzefVar = this.zza;
        zzacl zzaclVar = (zzacl) zzacvVar;
        zzaclVar.zzh(zzefVar.zzi(), 0, 3, false);
        zzefVar.zzh(0);
        if (zzefVar.zzx() != 4607062) {
            return false;
        }
        zzaclVar.zzh(zzefVar.zzi(), 0, 2, false);
        zzefVar.zzh(0);
        if ((zzefVar.zzt() & 250) != 0) {
            return false;
        }
        zzaclVar.zzh(zzefVar.zzi(), 0, 4, false);
        zzefVar.zzh(0);
        int iZzB = zzefVar.zzB();
        zzacvVar.zzl();
        zzacl zzaclVar2 = (zzacl) zzacvVar;
        zzaclVar2.zzj(iZzB, false);
        zzaclVar2.zzh(zzefVar.zzi(), 0, 4, false);
        zzefVar.zzh(0);
        return zzefVar.zzB() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ List zze() {
        return AbstractC1170d.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zzf = zzacxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0006 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzg(com.google.android.gms.internal.ads.zzacv r15, com.google.android.gms.internal.ads.zzads r16) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafd.zzg(com.google.android.gms.internal.ads.zzacv, com.google.android.gms.internal.ads.zzads):int");
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j6) {
        if (j == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ zzacu zzi() {
        return AbstractC1170d.b(this);
    }
}
