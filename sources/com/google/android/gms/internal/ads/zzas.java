package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.dynatrace.android.agent.Global;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class zzas extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzas(@Nullable String str, @Nullable Throwable th2, boolean z4, int i) {
        super(str, th2);
        this.zza = z4;
        this.zzb = i;
    }

    public static zzas zza(@Nullable String str, @Nullable Throwable th2) {
        return new zzas(str, th2, true, 0);
    }

    public static zzas zzb(@Nullable String str, @Nullable Throwable th2) {
        return new zzas(str, th2, true, 1);
    }

    public static zzas zzc(@Nullable String str) {
        return new zzas(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String strConcat = message != null ? message.concat(Global.BLANK) : "";
        boolean z4 = this.zza;
        int i = this.zzb;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + String.valueOf(z4).length() + strConcat.length() + 20 + 11 + 1);
        sb2.append(strConcat);
        sb2.append("{contentIsMalformed=");
        sb2.append(z4);
        sb2.append(", dataType=");
        return We.s.o(sb2, "}", i);
    }
}
