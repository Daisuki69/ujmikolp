package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzang {
    private final List zza;
    private final zzaeb[] zzc;
    private final String zzb = MimeTypes.VIDEO_MP2T;
    private final zzfp zzd = new zzfp(new zzfo() { // from class: com.google.android.gms.internal.ads.zzanf
        @Override // com.google.android.gms.internal.ads.zzfo
        public final /* synthetic */ void zza(long j, zzef zzefVar) {
            this.zza.zzf(j, zzefVar);
        }
    });

    public zzang(List list, String str) {
        this.zza = list;
        this.zzc = new zzaeb[list.size()];
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
            String strZzc = zzuVar.zza;
            if (strZzc == null) {
                strZzc = zzanrVar.zzc();
            }
            zzs zzsVar = new zzs();
            zzsVar.zza(strZzc);
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

    public final void zzb(int i) {
        this.zzd.zza(i);
    }

    public final void zzc(long j, zzef zzefVar) {
        this.zzd.zzc(j, zzefVar);
    }

    public final void zzd() {
        this.zzd.zze();
    }

    public final void zze() {
        this.zzd.zze();
    }

    public final /* synthetic */ void zzf(long j, zzef zzefVar) {
        zzach.zza(j, zzefVar, this.zzc);
    }
}
