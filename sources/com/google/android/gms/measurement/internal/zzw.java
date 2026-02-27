package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;

/* JADX INFO: loaded from: classes3.dex */
public final class zzw extends BroadcastReceiver {
    private final zzic zza;

    public zzw(zzic zzicVar) {
        this.zza = zzicVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    @Override // android.content.BroadcastReceiver
    @androidx.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r3, android.content.Intent r4) {
        /*
            r2 = this;
            if (r4 != 0) goto La
            com.google.android.gms.measurement.internal.zzic r3 = r2.zza
            java.lang.String r4 = "App receiver called with null intent"
            com.google.android.gms.internal.ads.AbstractC1173g.B(r3, r4)
            return
        La:
            java.lang.String r3 = r4.getAction()
            if (r3 != 0) goto L18
            com.google.android.gms.measurement.internal.zzic r3 = r2.zza
            java.lang.String r4 = "App receiver called with null action"
            com.google.android.gms.internal.ads.AbstractC1173g.B(r3, r4)
            return
        L18:
            int r4 = r3.hashCode()
            r0 = -1928239649(0xffffffff8d1165df, float:-4.4804198E-31)
            r1 = 1
            if (r4 == r0) goto L32
            r0 = 1279883384(0x4c497878, float:5.2814304E7)
            if (r4 == r0) goto L28
            goto L3c
        L28:
            java.lang.String r4 = "com.google.android.gms.measurement.BATCHES_AVAILABLE"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L3c
            r3 = r1
            goto L3d
        L32:
            java.lang.String r4 = "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L3c
            r3 = 0
            goto L3d
        L3c:
            r3 = -1
        L3d:
            if (r3 == 0) goto L65
            if (r3 == r1) goto L49
            com.google.android.gms.measurement.internal.zzic r3 = r2.zza
            java.lang.String r4 = "App receiver called with unknown action"
            com.google.android.gms.internal.ads.AbstractC1173g.B(r3, r4)
            return
        L49:
            com.google.android.gms.measurement.internal.zzic r3 = r2.zza
            com.google.android.gms.measurement.internal.zzgu r4 = r3.zzaV()
            com.google.android.gms.measurement.internal.zzgs r4 = r4.zzk()
            java.lang.String r0 = "[sgtm] App Receiver notified batches are available"
            r4.zza(r0)
            com.google.android.gms.measurement.internal.zzhz r3 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzt r4 = new com.google.android.gms.measurement.internal.zzt
            r4.<init>()
            r3.zzj(r4)
            return
        L65:
            com.google.android.gms.measurement.internal.zzic r3 = r2.zza
            com.google.android.gms.internal.measurement.zzqp.zza()
            com.google.android.gms.measurement.internal.zzal r4 = r3.zzc()
            r0 = 0
            com.google.android.gms.measurement.internal.zzfx r1 = com.google.android.gms.measurement.internal.zzfy.zzaQ
            boolean r4 = r4.zzp(r0, r1)
            if (r4 != 0) goto L78
            return
        L78:
            com.google.android.gms.measurement.internal.zzgu r4 = r3.zzaV()
            com.google.android.gms.measurement.internal.zzgs r4 = r4.zzk()
            java.lang.String r0 = "App receiver notified triggers are available"
            r4.zza(r0)
            com.google.android.gms.measurement.internal.zzhz r4 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzu r0 = new com.google.android.gms.measurement.internal.zzu
            r0.<init>()
            r4.zzj(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzw.onReceive(android.content.Context, android.content.Intent):void");
    }

    public final /* synthetic */ void zza() {
        this.zza.zzx().zzh(((Long) zzfy.zzC.zzb(null)).longValue());
    }
}
