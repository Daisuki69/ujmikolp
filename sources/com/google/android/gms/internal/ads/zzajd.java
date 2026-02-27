package com.google.android.gms.internal.ads;

import androidx.media3.extractor.ogg.OggPageHeader;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzajd {
    private final zzaje zza = new zzaje();
    private final zzef zzb = new zzef(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    private final int zzf(int i) {
        int i4;
        int i6 = 0;
        this.zzd = 0;
        do {
            int i10 = this.zzd;
            int i11 = i + i10;
            zzaje zzajeVar = this.zza;
            if (i11 >= zzajeVar.zzc) {
                break;
            }
            this.zzd = i10 + 1;
            i4 = zzajeVar.zzf[i11];
            i6 += i4;
        } while (i4 == 255);
        return i6;
    }

    public final void zza() {
        this.zza.zza();
        this.zzb.zza(0);
        this.zzc = -1;
        this.zze = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzb(com.google.android.gms.internal.ads.zzacv r8) throws java.io.IOException {
        /*
            r7 = this;
            boolean r0 = r7.zze
            r1 = 0
            if (r0 != 0) goto L6
            goto Ld
        L6:
            r7.zze = r1
            com.google.android.gms.internal.ads.zzef r0 = r7.zzb
            r0.zza(r1)
        Ld:
            boolean r0 = r7.zze
            r2 = 1
            if (r0 != 0) goto L91
            int r0 = r7.zzc
            if (r0 >= 0) goto L4a
            com.google.android.gms.internal.ads.zzaje r0 = r7.zza
            r3 = -1
            boolean r3 = r0.zzb(r8, r3)
            if (r3 == 0) goto L49
            boolean r3 = r0.zzc(r8, r2)
            if (r3 != 0) goto L27
            goto L49
        L27:
            int r3 = r0.zzd
            int r0 = r0.zza
            r0 = r0 & r2
            if (r0 != r2) goto L3e
            com.google.android.gms.internal.ads.zzef r0 = r7.zzb
            int r0 = r0.zze()
            if (r0 != 0) goto L3e
            int r0 = r7.zzf(r1)
            int r3 = r3 + r0
            int r0 = r7.zzd
            goto L3f
        L3e:
            r0 = r1
        L3f:
            boolean r3 = com.google.android.gms.internal.ads.zzacy.zzd(r8, r3)
            if (r3 != 0) goto L46
            return r1
        L46:
            r7.zzc = r0
            goto L4a
        L49:
            return r1
        L4a:
            int r0 = r7.zzf(r0)
            int r3 = r7.zzc
            int r4 = r7.zzd
            int r3 = r3 + r4
            if (r0 <= 0) goto L86
            com.google.android.gms.internal.ads.zzef r4 = r7.zzb
            int r5 = r4.zze()
            int r5 = r5 + r0
            r4.zzc(r5)
            byte[] r5 = r4.zzi()
            int r6 = r4.zze()
            boolean r5 = com.google.android.gms.internal.ads.zzacy.zzc(r8, r5, r6, r0)
            if (r5 != 0) goto L6e
            return r1
        L6e:
            int r5 = r4.zze()
            int r5 = r5 + r0
            r4.zzf(r5)
            com.google.android.gms.internal.ads.zzaje r0 = r7.zza
            int r4 = r3 + (-1)
            int[] r0 = r0.zzf
            r0 = r0[r4]
            r4 = 255(0xff, float:3.57E-43)
            if (r0 == r4) goto L83
            goto L84
        L83:
            r2 = r1
        L84:
            r7.zze = r2
        L86:
            com.google.android.gms.internal.ads.zzaje r0 = r7.zza
            int r0 = r0.zzc
            if (r3 != r0) goto L8d
            r3 = -1
        L8d:
            r7.zzc = r3
            goto Ld
        L91:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajd.zzb(com.google.android.gms.internal.ads.zzacv):boolean");
    }

    public final zzaje zzc() {
        return this.zza;
    }

    public final zzef zzd() {
        return this.zzb;
    }

    public final void zze() {
        zzef zzefVar = this.zzb;
        if (zzefVar.zzi().length == 65025) {
            return;
        }
        zzefVar.zzb(Arrays.copyOf(zzefVar.zzi(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, zzefVar.zze())), zzefVar.zze());
    }
}
