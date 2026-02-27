package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzajo implements zzajt {
    @Override // com.google.android.gms.internal.ads.zzajt
    public final boolean zza(zzu zzuVar) {
        String str = zzuVar.zzo;
        return Objects.equals(str, MimeTypes.TEXT_SSA) || Objects.equals(str, MimeTypes.TEXT_VTT) || Objects.equals(str, MimeTypes.APPLICATION_MP4VTT) || Objects.equals(str, MimeTypes.APPLICATION_SUBRIP) || Objects.equals(str, MimeTypes.APPLICATION_TX3G) || Objects.equals(str, MimeTypes.APPLICATION_PGS) || Objects.equals(str, MimeTypes.APPLICATION_VOBSUB) || Objects.equals(str, MimeTypes.APPLICATION_DVBSUBS) || Objects.equals(str, MimeTypes.APPLICATION_TTML);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    @Override // com.google.android.gms.internal.ads.zzajt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzu r4) {
        /*
            r3 = this;
            java.lang.String r4 = r4.zzo
            if (r4 == 0) goto L73
            int r0 = r4.hashCode()
            r1 = 1
            r2 = 2
            switch(r0) {
                case -1351681404: goto L5f;
                case -1248334819: goto L55;
                case -1026075066: goto L4b;
                case -1004728940: goto L41;
                case 691401887: goto L37;
                case 822864842: goto L2d;
                case 1157994102: goto L23;
                case 1668750253: goto L19;
                case 1693976202: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L69
        Le:
            java.lang.String r0 = "application/ttml+xml"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L69
            r0 = 8
            goto L6a
        L19:
            java.lang.String r0 = "application/x-subrip"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L69
            r0 = 3
            goto L6a
        L23:
            java.lang.String r0 = "application/vobsub"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L69
            r0 = 6
            goto L6a
        L2d:
            java.lang.String r0 = "text/x-ssa"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L69
            r0 = 0
            goto L6a
        L37:
            java.lang.String r0 = "application/x-quicktime-tx3g"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L69
            r0 = 4
            goto L6a
        L41:
            java.lang.String r0 = "text/vtt"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L69
            r0 = r1
            goto L6a
        L4b:
            java.lang.String r0 = "application/x-mp4-vtt"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L69
            r0 = r2
            goto L6a
        L55:
            java.lang.String r0 = "application/pgs"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L69
            r0 = 5
            goto L6a
        L5f:
            java.lang.String r0 = "application/dvbsubs"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L69
            r0 = 7
            goto L6a
        L69:
            r0 = -1
        L6a:
            switch(r0) {
                case 0: goto L72;
                case 1: goto L72;
                case 2: goto L71;
                case 3: goto L70;
                case 4: goto L6f;
                case 5: goto L6f;
                case 6: goto L6f;
                case 7: goto L6f;
                case 8: goto L6e;
                default: goto L6d;
            }
        L6d:
            goto L73
        L6e:
            return r1
        L6f:
            return r2
        L70:
            return r1
        L71:
            return r2
        L72:
            return r1
        L73:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "Unsupported MIME type: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajo.zzb(com.google.android.gms.internal.ads.zzu):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    @Override // com.google.android.gms.internal.ads.zzajt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzajv zzc(com.google.android.gms.internal.ads.zzu r3) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajo.zzc(com.google.android.gms.internal.ads.zzu):com.google.android.gms.internal.ads.zzajv");
    }
}
