package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzalv implements zzacu {
    private final zzalw zza = new zzalw(null, 0, MimeTypes.AUDIO_AC4);
    private final zzef zzb = new zzef(16384);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        int i;
        zzef zzefVar = new zzef(10);
        int i4 = 0;
        while (true) {
            zzacl zzaclVar = (zzacl) zzacvVar;
            zzaclVar.zzh(zzefVar.zzi(), 0, 10, false);
            zzefVar.zzh(0);
            if (zzefVar.zzx() != 4801587) {
                break;
            }
            zzefVar.zzk(3);
            int iZzG = zzefVar.zzG();
            i4 += iZzG + 10;
            zzaclVar.zzj(iZzG, false);
        }
        zzacvVar.zzl();
        zzacl zzaclVar2 = (zzacl) zzacvVar;
        zzaclVar2.zzj(i4, false);
        int i6 = 0;
        int i10 = i4;
        while (true) {
            int i11 = 7;
            zzaclVar2.zzh(zzefVar.zzi(), 0, 7, false);
            zzefVar.zzh(0);
            int iZzt = zzefVar.zzt();
            if (iZzt == 44096 || iZzt == 44097) {
                i6++;
                if (i6 >= 4) {
                    return true;
                }
                byte[] bArrZzi = zzefVar.zzi();
                if (bArrZzi.length < 7) {
                    i = -1;
                } else {
                    int i12 = ((bArrZzi[2] & 255) << 8) | (bArrZzi[3] & 255);
                    if (i12 == 65535) {
                        i12 = ((bArrZzi[4] & 255) << 16) | ((bArrZzi[5] & 255) << 8) | (bArrZzi[6] & 255);
                    } else {
                        i11 = 4;
                    }
                    if (iZzt == 44097) {
                        i11 += 2;
                    }
                    i = i12 + i11;
                }
                if (i == -1) {
                    return false;
                }
                zzaclVar2.zzj(i - 7, false);
            } else {
                zzacvVar.zzl();
                i10++;
                if (i10 - i4 >= 8192) {
                    return false;
                }
                zzaclVar2.zzj(i10, false);
                i6 = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ List zze() {
        return AbstractC1170d.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zza.zzb(zzacxVar, new zzanr(Integer.MIN_VALUE, 0, 1));
        zzacxVar.zzv();
        zzacxVar.zzw(new zzadu(androidx.media3.common.C.TIME_UNSET, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        zzef zzefVar = this.zzb;
        int iZza = zzacvVar.zza(zzefVar.zzi(), 0, 16384);
        if (iZza == -1) {
            return -1;
        }
        zzefVar.zzh(0);
        zzefVar.zzf(iZza);
        if (!this.zzc) {
            this.zza.zzc(0L, 4);
            this.zzc = true;
        }
        this.zza.zzd(zzefVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j6) {
        this.zzc = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ zzacu zzi() {
        return AbstractC1170d.b(this);
    }
}
