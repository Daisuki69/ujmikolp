package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import androidx.annotation.Nullable;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbbd {

    @Nullable
    private zzbas zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    public zzbbd(Context context) {
        this.zzc = context;
    }

    public final Future zza(zzbat zzbatVar) {
        zzbax zzbaxVar = new zzbax(this);
        zzbbb zzbbbVar = new zzbbb(this, zzbatVar, zzbaxVar);
        zzbbc zzbbcVar = new zzbbc(this, zzbaxVar);
        synchronized (this.zzd) {
            zzbas zzbasVar = new zzbas(this.zzc, com.google.android.gms.ads.internal.zzt.zzs().zza(), zzbbbVar, zzbbcVar);
            this.zza = zzbasVar;
            zzbasVar.checkAvailabilityAndConnect();
        }
        return zzbaxVar;
    }

    public final /* synthetic */ void zzb() {
        synchronized (this.zzd) {
            try {
                zzbas zzbasVar = this.zza;
                if (zzbasVar == null) {
                    return;
                }
                zzbasVar.disconnect();
                this.zza = null;
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ zzbas zzc() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzd() {
        return this.zzb;
    }

    public final /* synthetic */ void zze(boolean z4) {
        this.zzb = true;
    }

    public final /* synthetic */ Object zzf() {
        return this.zzd;
    }
}
