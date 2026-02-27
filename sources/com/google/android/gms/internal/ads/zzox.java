package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzox {
    public final String zza;

    @Nullable
    private final zzow zzb;

    @Nullable
    private final Object zzc;

    static {
        new zzox("");
    }

    public zzox(String str) {
        this.zza = str;
        this.zzb = Build.VERSION.SDK_INT >= 31 ? new zzow() : null;
        this.zzc = new Object();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzox)) {
            return false;
        }
        zzox zzoxVar = (zzox) obj;
        return Objects.equals(this.zza, zzoxVar.zza) && Objects.equals(this.zzb, zzoxVar.zzb) && Objects.equals(this.zzc, zzoxVar.zzc);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, this.zzc);
    }

    @RequiresApi(31)
    public final synchronized LogSessionId zza() {
        zzow zzowVar;
        zzowVar = this.zzb;
        if (zzowVar == null) {
            throw null;
        }
        return zzowVar.zza;
    }

    @RequiresApi(31)
    public final synchronized void zzb(LogSessionId logSessionId) {
        zzow zzowVar = this.zzb;
        if (zzowVar == null) {
            throw null;
        }
        LogSessionId logSessionId2 = zzowVar.zza;
        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        zzghc.zzh(logSessionId2.equals(LogSessionId.LOG_SESSION_ID_NONE));
        zzowVar.zza = logSessionId;
    }
}
