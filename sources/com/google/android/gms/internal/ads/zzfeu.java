package com.google.android.gms.internal.ads;

import com.dynatrace.android.agent.Global;

/* JADX INFO: loaded from: classes3.dex */
final class zzfeu {
    private final zzfet zza = new zzfet();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    public final void zza() {
        this.zzd++;
    }

    public final void zzb() {
        this.zze++;
    }

    public final void zzc() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zzd() {
        this.zzc++;
        this.zza.zzb = true;
    }

    public final void zze() {
        this.zzf++;
    }

    public final zzfet zzf() {
        zzfet zzfetVar = this.zza;
        zzfet zzfetVarClone = zzfetVar.clone();
        zzfetVar.zza = false;
        zzfetVar.zzb = false;
        return zzfetVarClone;
    }

    public final String zzg() {
        StringBuilder sb2 = new StringBuilder("\n\tPool does not exist: ");
        sb2.append(this.zzd);
        sb2.append("\n\tNew pools created: ");
        sb2.append(this.zzb);
        sb2.append("\n\tPools removed: ");
        sb2.append(this.zzc);
        sb2.append("\n\tEntries added: ");
        sb2.append(this.zzf);
        sb2.append("\n\tNo entries retrieved: ");
        return We.s.o(sb2, Global.NEWLINE, this.zze);
    }
}
