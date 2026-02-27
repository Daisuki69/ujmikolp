package com.google.android.gms.ads.preload;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class zzb {
    protected final zzck zza;
    private final AdFormat zzb;
    private final Context zzc;

    public zzb(@NonNull Context context, AdFormat adFormat) {
        this.zza = com.google.android.gms.ads.zzb.zza(context);
        this.zzc = context.getApplicationContext();
        this.zzb = adFormat;
    }

    public final boolean zzb(String str, PreloadConfiguration preloadConfiguration, PreloadCallbackV2 preloadCallbackV2) {
        if (str == null) {
            return false;
        }
        try {
            return this.zza.zzm(str, zzf.zzs(this.zzc, preloadConfiguration, this.zzb), preloadCallbackV2 == null ? null : new zza(this, preloadCallbackV2));
        } catch (RemoteException e) {
            StringBuilder sb2 = new StringBuilder(str.length() + 37);
            sb2.append("Failed to preload ad for preload ID ");
            sb2.append(str);
            sb2.append(".");
            zzo.zzj(sb2.toString(), e);
            return false;
        }
    }

    public final boolean zzc(String str, PreloadConfiguration preloadConfiguration) {
        if (str == null) {
            return false;
        }
        try {
            return this.zza.zzm(str, zzf.zzs(this.zzc, preloadConfiguration, this.zzb), null);
        } catch (RemoteException e) {
            StringBuilder sb2 = new StringBuilder(str.length() + 37);
            sb2.append("Failed to preload ad for preload ID ");
            sb2.append(str);
            sb2.append(".");
            zzo.zzj(sb2.toString(), e);
            return false;
        }
    }

    public final boolean zzd(String str) {
        try {
            return this.zza.zzn(this.zzb.getValue(), str);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final int zze(String str) {
        try {
            return this.zza.zzt(this.zzb.getValue(), str);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return 0;
        }
    }

    public final boolean zzf(String str) {
        try {
            return this.zza.zzu(this.zzb.getValue(), str);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final void zzg() {
        try {
            this.zza.zzv(this.zzb.getValue());
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final Map zzh() {
        PreloadConfiguration preloadConfigurationZzq;
        try {
            Bundle bundleZzs = this.zza.zzs(this.zzb.getValue());
            HashMap map = new HashMap();
            for (String str : bundleZzs.keySet()) {
                byte[] byteArray = bundleZzs.getByteArray(str);
                if (byteArray != null && (preloadConfigurationZzq = zzf.zzq((zzft) SafeParcelableSerializer.deserializeFromBytes(byteArray, zzft.CREATOR))) != null) {
                    map.put(str, preloadConfigurationZzq);
                }
            }
            return map;
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return new HashMap();
        }
    }

    @Nullable
    public final PreloadConfiguration zzi(String str) {
        try {
            zzft zzftVarZzr = this.zza.zzr(this.zzb.getValue(), str);
            if (zzftVarZzr == null) {
                return null;
            }
            return zzf.zzq(zzftVarZzr);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final Context zzj() {
        return this.zzc;
    }
}
