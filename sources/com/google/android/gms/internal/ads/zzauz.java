package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzauz extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzava zza;

    public zzauz(zzava zzavaVar) {
        Objects.requireNonNull(zzavaVar);
        this.zza = zzavaVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzava.class) {
            this.zza.zzd(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (zzava.class) {
            this.zza.zzd(null);
        }
    }
}
