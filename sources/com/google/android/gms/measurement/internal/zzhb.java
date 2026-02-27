package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import dOYHB6.yFtIp6.ht2aO8;

/* JADX INFO: loaded from: classes3.dex */
final class zzhb extends BroadcastReceiver {
    private final zzpg zza;
    private boolean zzb;
    private boolean zzc;

    public zzhb(zzpg zzpgVar) {
        Preconditions.checkNotNull(zzpgVar);
        this.zza = zzpgVar;
    }

    @Override // android.content.BroadcastReceiver
    @MainThread
    public final void onReceive(Context context, Intent intent) {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzu();
        String action = intent.getAction();
        zzpgVar.zzaV().zzk().zzb("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            zzpgVar.zzaV().zze().zzb("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zZzb = zzpgVar.zzi().zzb();
        if (this.zzc != zZzb) {
            this.zzc = zZzb;
            zzpgVar.zzaW().zzj(new zzha(this, zZzb));
        }
    }

    @WorkerThread
    public final void zza() {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzu();
        zzpgVar.zzaW().zzg();
        if (this.zzb) {
            return;
        }
        ht2aO8.registerReceiver(zzpgVar.zzaY(), this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.zzc = zzpgVar.zzi().zzb();
        zzpgVar.zzaV().zzk().zzb("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzc));
        this.zzb = true;
    }

    @WorkerThread
    public final void zzb() {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzu();
        zzpgVar.zzaW().zzg();
        zzpgVar.zzaW().zzg();
        if (this.zzb) {
            zzpgVar.zzaV().zzk().zza("Unregistering connectivity change receiver");
            this.zzb = false;
            this.zzc = false;
            try {
                ht2aO8.unregisterReceiver(zzpgVar.zzaY(), this);
            } catch (IllegalArgumentException e) {
                this.zza.zzaV().zzb().zzb("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public final /* synthetic */ zzpg zzc() {
        return this.zza;
    }
}
