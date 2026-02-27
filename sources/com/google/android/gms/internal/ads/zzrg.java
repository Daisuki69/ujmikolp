package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackException;
import androidx.media3.extractor.ts.TsExtractor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzrg extends zzsz implements zzkm {
    private final Context zzb;
    private final zzpu zzc;
    private final zzqc zzd;

    @Nullable
    private final zzsm zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;

    @Nullable
    private zzu zzi;

    @Nullable
    private zzu zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;
    private boolean zzp;
    private long zzq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzrg(Context context, zzso zzsoVar, zztb zztbVar, boolean z4, @Nullable Handler handler, @Nullable zzpv zzpvVar, zzqc zzqcVar) {
        super(1, zzsoVar, zztbVar, false, 44100.0f);
        byte[] bArr = null;
        zzsm zzsmVar = Build.VERSION.SDK_INT >= 35 ? new zzsm(zzsl.zzb) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzqcVar;
        this.zze = zzsmVar;
        this.zzo = -1000;
        this.zzc = new zzpu(handler, zzpvVar);
        this.zzq = androidx.media3.common.C.TIME_UNSET;
        zzqcVar.zza(new zzrf(this, bArr));
    }

    private static List zzbd(zztb zztbVar, zzu zzuVar, boolean z4, zzqc zzqcVar) throws zztd {
        zzst zzstVarZza;
        return zzuVar.zzo == null ? zzgjz.zzi() : (!zzqcVar.zzd(zzuVar) || (zzstVarZza = zztl.zza()) == null) ? zztl.zzc(zztbVar, zzuVar, false, false) : zzgjz.zzj(zzstVarZza);
    }

    private final int zzbe(zzst zzstVar, zzu zzuVar) {
        if ("OMX.google.raw.decoder".equals(zzstVar.zza) && Build.VERSION.SDK_INT == 23 && !zzeo.zzN(this.zzb)) {
            return -1;
        }
        return zzuVar.zzp;
    }

    private final void zzbf() {
        long jZzg = this.zzd.zzg(zzY());
        if (jZzg != Long.MIN_VALUE) {
            if (!this.zzl) {
                jZzg = Math.max(this.zzk, jZzg);
            }
            this.zzk = jZzg;
            this.zzl = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    public final void zzA(long j, boolean z4) throws zzhz {
        super.zzA(j, z4);
        this.zzd.zzz();
        this.zzk = j;
        this.zzq = androidx.media3.common.C.TIME_UNSET;
        this.zzn = false;
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final void zzB() {
        this.zzd.zzi();
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final void zzC() {
        zzbf();
        this.zzp = false;
        this.zzd.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    public final void zzD() {
        this.zzm = true;
        this.zzi = null;
        this.zzq = androidx.media3.common.C.TIME_UNSET;
        try {
            this.zzd.zzz();
            super.zzD();
        } catch (Throwable th2) {
            super.zzD();
            throw th2;
        } finally {
            this.zzc.zzg(((zzsz) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    public final void zzE() {
        this.zzn = false;
        this.zzq = androidx.media3.common.C.TIME_UNSET;
        try {
            super.zzE();
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzA();
            }
        } catch (Throwable th2) {
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzA();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final void zzF() {
        zzsm zzsmVar;
        this.zzd.zzB();
        if (Build.VERSION.SDK_INT < 35 || (zzsmVar = this.zze) == null) {
            return;
        }
        zzsmVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzll, com.google.android.gms.internal.ads.zzln
    public final String zzS() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzll
    public final boolean zzX() {
        return this.zzd.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzll
    public final boolean zzY() {
        return super.zzY() && this.zzd.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final int zzab(zztb zztbVar, zzu zzuVar) throws zztd {
        int i;
        boolean z4;
        String str = zzuVar.zzo;
        if (!zzar.zza(str)) {
            return 128;
        }
        int i4 = zzuVar.zzN;
        boolean zZzbb = zzsz.zzbb(zzuVar);
        int i6 = 1;
        if (!zZzbb || (i4 != 0 && zztl.zza() == null)) {
            i = 0;
        } else {
            zzqc zzqcVar = this.zzd;
            zzpg zzpgVarZzf = zzqcVar.zzf(zzuVar);
            if (zzpgVarZzf.zzb) {
                i = true != zzpgVarZzf.zzc ? 512 : 1536;
                if (zzpgVarZzf.zzd) {
                    i |= 2048;
                }
            } else {
                i = 0;
            }
            if (zzqcVar.zzd(zzuVar)) {
                return i | TsExtractor.TS_STREAM_TYPE_AC4;
            }
        }
        if (!MimeTypes.AUDIO_RAW.equals(str) || this.zzd.zzd(zzuVar)) {
            zzqc zzqcVar2 = this.zzd;
            if (zzqcVar2.zzd(zzeo.zzy(2, zzuVar.zzG, zzuVar.zzH))) {
                List listZzbd = zzbd(zztbVar, zzuVar, false, zzqcVar2);
                if (!listZzbd.isEmpty()) {
                    if (zZzbb) {
                        zzst zzstVar = (zzst) listZzbd.get(0);
                        boolean zZzc = zzstVar.zzc(zzuVar);
                        if (zZzc) {
                            z4 = true;
                        } else {
                            for (int i10 = 1; i10 < listZzbd.size(); i10++) {
                                zzst zzstVar2 = (zzst) listZzbd.get(i10);
                                if (zzstVar2.zzc(zzuVar)) {
                                    z4 = false;
                                    zZzc = true;
                                    zzstVar = zzstVar2;
                                    break;
                                }
                            }
                            z4 = true;
                        }
                        int i11 = true != zZzc ? 3 : 4;
                        int i12 = 8;
                        if (zZzc && zzstVar.zze(zzuVar)) {
                            i12 = 16;
                        }
                        return i11 | i12 | 32 | (true != zzstVar.zzg ? 0 : 64) | (true != z4 ? 0 : 128) | i;
                    }
                    i6 = 2;
                }
            }
        }
        return i6 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final List zzac(zztb zztbVar, zzu zzuVar, boolean z4) throws zztd {
        return zztl.zze(zzbd(zztbVar, zzuVar, false, this.zzd), zzuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final boolean zzad(zzu zzuVar) {
        zzJ();
        return this.zzd.zzd(zzuVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    @Override // com.google.android.gms.internal.ads.zzsz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzsn zzae(com.google.android.gms.internal.ads.zzst r10, com.google.android.gms.internal.ads.zzu r11, @androidx.annotation.Nullable android.media.MediaCrypto r12, float r13) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrg.zzae(com.google.android.gms.internal.ads.zzst, com.google.android.gms.internal.ads.zzu, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzsn");
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final zzhs zzaf(zzst zzstVar, zzu zzuVar, zzu zzuVar2) {
        int i;
        int i4;
        zzhs zzhsVarZzf = zzstVar.zzf(zzuVar, zzuVar2);
        int i6 = zzhsVarZzf.zze;
        if (zzaA(zzuVar2)) {
            i6 |= 32768;
        }
        if (zzbe(zzstVar, zzuVar2) > this.zzf) {
            i6 |= 64;
        }
        String str = zzstVar.zza;
        if (i6 != 0) {
            i4 = 0;
            i = i6;
        } else {
            i = 0;
            i4 = zzhsVarZzf.zzd;
        }
        return new zzhs(str, zzuVar, zzuVar2, i4, i);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final long zzag(long j, long j6, boolean z4) {
        long j7 = this.zzq;
        if (!this.zzp) {
            return (j7 != androidx.media3.common.C.TIME_UNSET || super.zzY()) ? 1000000L : 10000L;
        }
        long jZzv = this.zzd.zzv();
        if (j7 == androidx.media3.common.C.TIME_UNSET || jZzv == androidx.media3.common.C.TIME_UNSET) {
            return 10000L;
        }
        return Math.max(10000L, ((long) ((Math.min(jZzv, this.zzq - j) / (zzj() != null ? zzj().zzb : 1.0f)) / 2.0f)) - (zzeo.zzq(zzL().zzb()) - j6));
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final float zzah(float f, zzu zzuVar, zzu[] zzuVarArr) {
        int iMax = -1;
        for (zzu zzuVar2 : zzuVarArr) {
            int i = zzuVar2.zzH;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzai(String str, zzsn zzsnVar, long j, long j6) {
        this.zzc.zzb(str, j, j6);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzaj(String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzak(Exception exc) {
        zzds.zzf("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    @Nullable
    public final zzhs zzal(zzkh zzkhVar) throws zzhz {
        zzu zzuVar = zzkhVar.zzb;
        zzuVar.getClass();
        this.zzi = zzuVar;
        zzhs zzhsVarZzal = super.zzal(zzkhVar);
        this.zzc.zzc(zzuVar, zzhsVarZzal);
        return zzhsVarZzal;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzam(zzu zzuVar, @Nullable MediaFormat mediaFormat) throws zzhz {
        int i;
        zzu zzuVar2 = this.zzj;
        int[] iArr = null;
        boolean z4 = true;
        if (zzuVar2 != null) {
            zzuVar = zzuVar2;
        } else if (zzaD() != null) {
            mediaFormat.getClass();
            int iZzz = MimeTypes.AUDIO_RAW.equals(zzuVar.zzo) ? zzuVar.zzI : (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? zzeo.zzz(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2 : mediaFormat.getInteger("pcm-encoding");
            zzs zzsVar = new zzs();
            zzsVar.zzm(MimeTypes.AUDIO_RAW);
            zzsVar.zzG(iZzz);
            zzsVar.zzH(zzuVar.zzJ);
            zzsVar.zzI(zzuVar.zzK);
            zzsVar.zzk(zzuVar.zzl);
            zzsVar.zza(zzuVar.zza);
            zzsVar.zzc(zzuVar.zzb);
            zzsVar.zzd(zzuVar.zzc);
            zzsVar.zze(zzuVar.zzd);
            zzsVar.zzf(zzuVar.zze);
            zzsVar.zzg(zzuVar.zzf);
            zzsVar.zzE(mediaFormat.getInteger("channel-count"));
            zzsVar.zzF(mediaFormat.getInteger("sample-rate"));
            zzu zzuVarZzM = zzsVar.zzM();
            if (this.zzg && zzuVarZzM.zzG == 6 && (i = zzuVar.zzG) < 6) {
                iArr = new int[i];
                for (int i4 = 0; i4 < i; i4++) {
                    iArr[i4] = i4;
                }
            } else if (this.zzh) {
                int i6 = zzuVarZzM.zzG;
                if (i6 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i6 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i6 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i6 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i6 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            zzuVar = zzuVarZzM;
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                if (zzaC()) {
                    zzJ();
                }
                if (i10 < 29) {
                    z4 = false;
                }
                zzghc.zzh(z4);
            }
            this.zzd.zzh(zzuVar, 0, iArr);
        } catch (zzpx e) {
            throw zzN(e, e.zza, false, PlaybackException.ERROR_CODE_AUDIO_TRACK_INIT_FAILED);
        }
    }

    @CallSuper
    public final void zzan() {
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzao() {
        this.zzd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final boolean zzap(long j, long j6, @Nullable zzsq zzsqVar, @Nullable ByteBuffer byteBuffer, int i, int i4, int i6, long j7, boolean z4, boolean z5, zzu zzuVar) throws zzhz {
        byteBuffer.getClass();
        this.zzq = androidx.media3.common.C.TIME_UNSET;
        if (this.zzj != null && (i4 & 2) != 0) {
            zzsqVar.getClass();
            zzsqVar.zzc(i, false);
            return true;
        }
        if (z4) {
            if (zzsqVar != null) {
                zzsqVar.zzc(i, false);
            }
            ((zzsz) this).zza.zzf += i6;
            this.zzd.zzj();
            return true;
        }
        try {
            if (!this.zzd.zzk(byteBuffer, j7, i6)) {
                this.zzq = j7;
                return false;
            }
            if (zzsqVar != null) {
                zzsqVar.zzc(i, false);
            }
            ((zzsz) this).zza.zze += i6;
            return true;
        } catch (zzpy e) {
            zzu zzuVar2 = this.zzi;
            if (zzaC()) {
                zzJ();
            }
            throw zzN(e, zzuVar2, e.zzb, PlaybackException.ERROR_CODE_AUDIO_TRACK_INIT_FAILED);
        } catch (zzqb e7) {
            if (zzaC()) {
                zzJ();
            }
            throw zzN(e7, zzuVar, e7.zzb, PlaybackException.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzaq() throws zzhz {
        try {
            this.zzd.zzl();
            if (zzaT() != androidx.media3.common.C.TIME_UNSET) {
                this.zzq = zzaT();
            }
        } catch (zzqb e) {
            throw zzN(e, e.zzc, e.zzb, true != zzaC() ? PlaybackException.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED : PlaybackException.ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzar(zzhg zzhgVar) {
        zzu zzuVar;
        if (Build.VERSION.SDK_INT < 29 || (zzuVar = zzhgVar.zza) == null || !Objects.equals(zzuVar.zzo, MimeTypes.AUDIO_OPUS) || !zzaC()) {
            return;
        }
        ByteBuffer byteBuffer = zzhgVar.zzf;
        byteBuffer.getClass();
        zzu zzuVar2 = zzhgVar.zza;
        zzuVar2.getClass();
        int i = zzuVar2.zzJ;
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzw(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    public final /* synthetic */ zzpu zzav() {
        return this.zzc;
    }

    public final /* synthetic */ zzsm zzaw() {
        return this.zze;
    }

    public final /* synthetic */ void zzax(boolean z4) {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzll
    @Nullable
    public final zzkm zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final long zzg() {
        if (zze() == 2) {
            zzbf();
        }
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final boolean zzh() {
        boolean z4 = this.zzn;
        this.zzn = false;
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzi(zzau zzauVar) {
        this.zzd.zzo(zzauVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final zzau zzj() {
        return this.zzd.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzlg
    public final void zzx(int i, @Nullable Object obj) throws zzhz {
        zzsm zzsmVar;
        if (i == 2) {
            zzqc zzqcVar = this.zzd;
            obj.getClass();
            zzqcVar.zzx(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            zzc zzcVar = (zzc) obj;
            zzqc zzqcVar2 = this.zzd;
            zzcVar.getClass();
            zzqcVar2.zzr(zzcVar);
            return;
        }
        if (i == 6) {
            zzd zzdVar = (zzd) obj;
            zzqc zzqcVar3 = this.zzd;
            zzdVar.getClass();
            zzqcVar3.zzt(zzdVar);
            return;
        }
        if (i == 12) {
            this.zzd.zzu((AudioDeviceInfo) obj);
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.zzo = ((Integer) obj).intValue();
            zzsq zzsqVarZzaD = zzaD();
            if (zzsqVarZzaD == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.zzo));
            zzsqVarZzaD.zzo(bundle);
            return;
        }
        if (i == 9) {
            zzqc zzqcVar4 = this.zzd;
            obj.getClass();
            zzqcVar4.zzq(((Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                super.zzx(i, obj);
                return;
            }
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            this.zzd.zzs(iIntValue);
            if (Build.VERSION.SDK_INT < 35 || (zzsmVar = this.zze) == null) {
                return;
            }
            zzsmVar.zza(iIntValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    public final void zzy(boolean z4, boolean z5) throws zzhz {
        super.zzy(z4, z5);
        this.zzc.zza(((zzsz) this).zza);
        zzJ();
        zzqc zzqcVar = this.zzd;
        zzqcVar.zzb(zzK());
        zzqcVar.zzc(zzL());
    }
}
