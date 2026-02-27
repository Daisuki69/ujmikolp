package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzanv {
    private final List zza;
    private final String zzb = MimeTypes.VIDEO_MP2T;
    private final zzaeb[] zzc;
    private final zzfp zzd;

    public zzanv(List list, String str) {
        this.zza = list;
        this.zzc = new zzaeb[list.size()];
        zzfp zzfpVar = new zzfp(new zzfo() { // from class: com.google.android.gms.internal.ads.zzanu
            @Override // com.google.android.gms.internal.ads.zzfo
            public final /* synthetic */ void zza(long j, zzef zzefVar) {
                this.zza.zzc(j, zzefVar);
            }
        });
        this.zzd = zzfpVar;
        zzfpVar.zza(3);
    }

    public final void zza(zzacx zzacxVar, zzanr zzanrVar) {
        int i = 0;
        while (true) {
            zzaeb[] zzaebVarArr = this.zzc;
            if (i >= zzaebVarArr.length) {
                return;
            }
            zzanrVar.zza();
            zzaeb zzaebVarZzu = zzacxVar.zzu(zzanrVar.zzb(), 3);
            zzu zzuVar = (zzu) this.zza.get(i);
            String str = zzuVar.zzo;
            boolean z4 = true;
            if (!MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str)) {
                z4 = false;
            }
            zzghc.zzf(z4, "Invalid closed caption MIME type provided: %s", str);
            zzs zzsVar = new zzs();
            zzsVar.zza(zzanrVar.zzc());
            zzsVar.zzl(this.zzb);
            zzsVar.zzm(str);
            zzsVar.zzf(zzuVar.zze);
            zzsVar.zze(zzuVar.zzd);
            zzsVar.zzJ(zzuVar.zzL);
            zzsVar.zzp(zzuVar.zzr);
            zzaebVarZzu.zzu(zzsVar.zzM());
            zzaebVarArr[i] = zzaebVarZzu;
            i++;
        }
    }

    public final void zzb(long j, zzef zzefVar) {
        if (zzefVar.zzd() < 9) {
            return;
        }
        int iZzB = zzefVar.zzB();
        int iZzB2 = zzefVar.zzB();
        int iZzs = zzefVar.zzs();
        if (iZzB == 434 && iZzB2 == 1195456820 && iZzs == 3) {
            this.zzd.zzc(j, zzefVar);
        }
    }

    public final /* synthetic */ void zzc(long j, zzef zzefVar) {
        zzach.zzb(j, zzefVar, this.zzc);
    }
}
