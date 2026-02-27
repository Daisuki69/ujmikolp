package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaig implements zzadz {
    public static final zzaig zza = new zzaig(true);
    public static final zzaig zzb = new zzaig(false);
    public final boolean zzc;

    private zzaig(boolean z4) {
        this.zzc = z4;
    }

    public final String toString() {
        boolean z4 = !this.zzc;
        StringBuilder sb2 = new StringBuilder(String.valueOf(z4).length() + 33);
        sb2.append("IncorrectFragmentation{expected=");
        sb2.append(z4);
        sb2.append("}");
        return sb2.toString();
    }
}
