package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzalz implements zzamd {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;

    @Nullable
    private final String zze;
    private final int zzf;
    private final String zzg;
    private String zzh;
    private zzaeb zzi;
    private zzaeb zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzr;
    private boolean zzs;
    private int zzu;
    private zzaeb zzw;
    private long zzx;
    private final zzee zzc = new zzee(new byte[7], 7);
    private final zzef zzd = new zzef(Arrays.copyOf(zza, 10));
    private int zzp = -1;
    private int zzq = -1;
    private long zzt = androidx.media3.common.C.TIME_UNSET;
    private long zzv = androidx.media3.common.C.TIME_UNSET;

    public zzalz(boolean z4, @Nullable String str, int i, String str2) {
        this.zzb = z4;
        this.zze = str;
        this.zzf = i;
        this.zzg = str2;
        zzi();
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzo = false;
        zzi();
    }

    private final boolean zzh(zzef zzefVar, byte[] bArr, int i) {
        int iMin = Math.min(zzefVar.zzd(), i - this.zzl);
        zzefVar.zzm(bArr, this.zzl, iMin);
        int i4 = this.zzl + iMin;
        this.zzl = i4;
        return i4 == i;
    }

    private final void zzi() {
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 256;
    }

    private final void zzj(zzaeb zzaebVar, long j, int i, int i4) {
        this.zzk = 4;
        this.zzl = i;
        this.zzw = zzaebVar;
        this.zzx = j;
        this.zzu = i4;
    }

    private final void zzk() {
        this.zzk = 3;
        this.zzl = 0;
    }

    private static final boolean zzl(byte b8, byte b10) {
        return zzf((b10 & 255) | 65280);
    }

    private static final boolean zzm(zzef zzefVar, byte[] bArr, int i) {
        if (zzefVar.zzd() < i) {
            return false;
        }
        zzefVar.zzm(bArr, 0, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zzv = androidx.media3.common.C.TIME_UNSET;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzh = zzanrVar.zzc();
        zzaeb zzaebVarZzu = zzacxVar.zzu(zzanrVar.zzb(), 1);
        this.zzi = zzaebVarZzu;
        this.zzw = zzaebVarZzu;
        if (!this.zzb) {
            this.zzj = new zzacr();
            return;
        }
        zzanrVar.zza();
        zzaeb zzaebVarZzu2 = zzacxVar.zzu(zzanrVar.zzb(), 5);
        this.zzj = zzaebVarZzu2;
        zzs zzsVar = new zzs();
        zzsVar.zza(zzanrVar.zzc());
        zzsVar.zzl(this.zzg);
        zzsVar.zzm(MimeTypes.APPLICATION_ID3);
        zzaebVarZzu2.zzu(zzsVar.zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i) {
        this.zzv = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0260, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0261, code lost:
    
        r20.zzn = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0265, code lost:
    
        if (r20.zzo != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0267, code lost:
    
        r20.zzk = 1;
        r20.zzl = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x026d, code lost:
    
        zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0270, code lost:
    
        r21.zzh(r13);
        r9 = r19;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ec, code lost:
    
        r19 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0253, code lost:
    
        r20.zzr = (r14 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x025c, code lost:
    
        if (1 == ((r14 & 1) ^ 1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x025e, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ce  */
    @Override // com.google.android.gms.internal.ads.zzamd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzef r21) throws com.google.android.gms.internal.ads.zzas {
        /*
            Method dump skipped, instruction units count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalz.zzd(com.google.android.gms.internal.ads.zzef):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z4) {
    }
}
