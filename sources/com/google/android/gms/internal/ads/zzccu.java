package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzccu extends zzccq {
    public zzccu(zzcbd zzcbdVar) {
        super(zzcbdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final boolean zze(String str) {
        String strZzf = com.google.android.gms.ads.internal.util.client.zzf.zzf(str);
        zzcbd zzcbdVar = (zzcbd) this.zzc.get();
        if (zzcbdVar != null && strZzf != null) {
            zzcbdVar.zzt(strZzf, this);
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("VideoStreamNoopCache is doing nothing.");
        zzq(str, strZzf, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzl() {
    }
}
