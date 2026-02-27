package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.AacUtil;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaej implements zzacu {
    private static final int[] zza = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzb = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private final byte[] zze;
    private final zzaeb zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private zzacx zzn;
    private zzaeb zzo;
    private zzaeb zzp;
    private zzadv zzq;
    private long zzr;
    private boolean zzs;

    static {
        String str = zzeo.zza;
        Charset charset = StandardCharsets.UTF_8;
        zzc = "#!AMR\n".getBytes(charset);
        zzd = "#!AMR-WB\n".getBytes(charset);
    }

    public zzaej() {
        throw null;
    }

    private final boolean zza(zzacv zzacvVar) throws IOException {
        byte[] bArr = zzc;
        if (zzb(zzacvVar, bArr)) {
            this.zzg = false;
            zzacvVar.zzf(bArr.length);
            return true;
        }
        byte[] bArr2 = zzd;
        if (!zzb(zzacvVar, bArr2)) {
            return false;
        }
        this.zzg = true;
        zzacvVar.zzf(bArr2.length);
        return true;
    }

    private static boolean zzb(zzacv zzacvVar, byte[] bArr) throws IOException {
        zzacvVar.zzl();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzacvVar.zzi(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a A[Catch: EOFException -> 0x00a4, TryCatch #0 {EOFException -> 0x00a4, blocks: (B:4:0x0007, B:6:0x0018, B:20:0x003a, B:22:0x0043, B:21:0x003f, B:31:0x005d, B:32:0x0085, B:33:0x0086, B:34:0x00a3), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f A[Catch: EOFException -> 0x00a4, TryCatch #0 {EOFException -> 0x00a4, blocks: (B:4:0x0007, B:6:0x0018, B:20:0x003a, B:22:0x0043, B:21:0x003f, B:31:0x005d, B:32:0x0085, B:33:0x0086, B:34:0x00a3), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzc(com.google.android.gms.internal.ads.zzacv r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaej.zzc(com.google.android.gms.internal.ads.zzacv):int");
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        return zza(zzacvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ List zze() {
        return AbstractC1170d.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zzn = zzacxVar;
        zzaeb zzaebVarZzu = zzacxVar.zzu(0, 1);
        this.zzo = zzaebVarZzu;
        this.zzp = zzaebVarZzu;
        zzacxVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        this.zzo.getClass();
        String str = zzeo.zza;
        if (zzacvVar.zzn() == 0 && !zza(zzacvVar)) {
            throw zzas.zzb("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z4 = this.zzg;
            String str2 = MimeTypes.AUDIO_AMR_WB;
            String str3 = true != z4 ? MimeTypes.AUDIO_AMR : MimeTypes.AUDIO_AMR_WB;
            if (true != z4) {
                str2 = MimeTypes.AUDIO_AMR_NB;
            }
            int i = true != z4 ? 8000 : AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
            int i4 = z4 ? zzb[8] : zza[7];
            zzaeb zzaebVar = this.zzo;
            zzs zzsVar = new zzs();
            zzsVar.zzl(str3);
            zzsVar.zzm(str2);
            zzsVar.zzn(i4);
            zzsVar.zzE(1);
            zzsVar.zzF(i);
            zzaebVar.zzu(zzsVar.zzM());
        }
        int iZzc = zzc(zzacvVar);
        if (this.zzq == null) {
            zzadu zzaduVar = new zzadu(androidx.media3.common.C.TIME_UNSET, 0L);
            this.zzq = zzaduVar;
            this.zzn.zzw(zzaduVar);
        }
        return iZzc == -1 ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j6) {
        this.zzh = 0L;
        this.zzi = 0;
        this.zzj = 0;
        this.zzr = j6;
        this.zzm = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ zzacu zzi() {
        return AbstractC1170d.b(this);
    }

    public zzaej(int i) {
        this.zze = new byte[1];
        this.zzk = -1;
        zzacr zzacrVar = new zzacr();
        this.zzf = zzacrVar;
        this.zzp = zzacrVar;
    }
}
