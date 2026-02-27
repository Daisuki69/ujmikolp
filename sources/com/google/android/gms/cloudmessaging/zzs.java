package com.google.android.gms.cloudmessaging;

import We.s;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzs {
    final int zza;
    final TaskCompletionSource zzb = new TaskCompletionSource();
    final int zzc;
    final Bundle zzd;

    public zzs(int i, int i4, Bundle bundle) {
        this.zza = i;
        this.zzc = i4;
        this.zzd = bundle;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request { what=");
        sb2.append(this.zzc);
        sb2.append(" id=");
        sb2.append(this.zza);
        sb2.append(" oneWay=");
        return s.s(sb2, zzb(), "}");
    }

    public abstract void zza(Bundle bundle);

    public abstract boolean zzb();

    public final void zzc(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + zztVar.toString());
        }
        this.zzb.setException(zztVar);
    }

    public final void zzd(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.zzb.setResult(obj);
    }
}
