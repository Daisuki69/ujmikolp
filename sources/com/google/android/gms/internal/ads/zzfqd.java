package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfqd {

    @VisibleForTesting
    final zzfqg zza;

    @VisibleForTesting
    final boolean zzb;

    private zzfqd(zzfqg zzfqgVar) {
        this.zza = zzfqgVar;
        this.zzb = zzfqgVar != null;
    }

    public static zzfqd zzb(Context context, String str, String str2) {
        zzfqg zzfqeVar;
        try {
            try {
                try {
                    IBinder iBinderInstantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderInstantiate == null) {
                        zzfqeVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderInstantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfqeVar = iInterfaceQueryLocalInterface instanceof zzfqg ? (zzfqg) iInterfaceQueryLocalInterface : new zzfqe(iBinderInstantiate);
                    }
                    zzfqeVar.zzj(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfqd(zzfqeVar);
                } catch (Exception e) {
                    throw new zzfpg(e);
                }
            } catch (RemoteException | zzfpg | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzfqd(new zzfqh());
            }
        } catch (Exception e7) {
            throw new zzfpg(e7);
        }
    }

    public static zzfqd zzc() {
        zzfqh zzfqhVar = new zzfqh();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfqd(zzfqhVar);
    }

    public final zzfqc zza(byte[] bArr) {
        return new zzfqc(this, bArr, null);
    }
}
