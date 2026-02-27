package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
final class zzfyv implements zzfzp {
    private final Map zza;
    private final zzarw zzb;
    private final zzgdy zzc;
    private final long zzd;

    public zzfyv(zzarw zzarwVar, Map map, zzfui zzfuiVar, zzgea zzgeaVar) {
        this.zza = map;
        this.zzb = zzarwVar;
        this.zzc = zzgeaVar.zza(112);
        this.zzd = zzfuiVar.zzj();
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zza();
        return null;
    }

    public final Void zza() throws Exception {
        zzast zzastVar;
        try {
            try {
                this.zzc.zza();
                S1.y yVar = (S1.y) this.zza.get("gs");
                if (yVar != null && (zzastVar = (zzast) yVar.get(this.zzd, TimeUnit.MILLISECONDS)) != null) {
                    zzarw zzarwVar = this.zzb;
                    synchronized (zzarwVar) {
                        zzarwVar.zzad(zzastVar.zzg());
                        zzarwVar.zzN(zzastVar.zzc());
                    }
                }
            } catch (Throwable th2) {
                this.zzc.zzc();
                throw th2;
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e) {
            this.zzc.zzb(e);
        }
        this.zzc.zzc();
        return null;
    }
}
