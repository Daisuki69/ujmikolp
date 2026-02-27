package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.android.gms.common.Scopes;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaae extends zzsz implements zzaat {
    private static final int[] zzb = {1920, 1600, DateTimeConstants.MINUTES_PER_DAY, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private int zzB;
    private int zzC;

    @Nullable
    private zzls zzD;
    private boolean zzE;
    private long zzF;
    private int zzG;
    private long zzH;
    private zzbu zzI;

    @Nullable
    private zzbu zzJ;
    private int zzK;
    private int zzL;

    @Nullable
    private zzaar zzM;
    private long zzN;
    private long zzO;
    private boolean zzP;
    private final Context zze;
    private final boolean zzf;
    private final zzabl zzg;
    private final boolean zzh;
    private final zzaau zzi;
    private final zzaas zzj;
    private final long zzk;
    private final PriorityQueue zzl;
    private zzaad zzm;
    private boolean zzn;
    private boolean zzo;
    private zzabr zzp;
    private boolean zzq;
    private int zzr;
    private List zzs;

    @Nullable
    private Surface zzt;

    @Nullable
    private zzaag zzu;
    private zzeg zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private long zzz;

    public zzaae(zzaac zzaacVar) {
        super(2, zzaacVar.zzg(), zzaacVar.zzf(), false, 30.0f);
        Context applicationContext = zzaacVar.zze().getApplicationContext();
        this.zze = applicationContext;
        this.zzp = null;
        this.zzg = new zzabl(zzaacVar.zzh(), zzaacVar.zzi());
        this.zzf = this.zzp == null;
        this.zzi = new zzaau(applicationContext, this, 0L);
        this.zzj = new zzaas();
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzv = zzeg.zza;
        this.zzx = 1;
        this.zzy = 0;
        this.zzI = zzbu.zza;
        this.zzL = 0;
        this.zzJ = null;
        this.zzK = -1000;
        this.zzN = androidx.media3.common.C.TIME_UNSET;
        this.zzO = androidx.media3.common.C.TIME_UNSET;
        this.zzl = new PriorityQueue();
        this.zzk = androidx.media3.common.C.TIME_UNSET;
        this.zzD = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzas(com.google.android.gms.internal.ads.zzst r11, com.google.android.gms.internal.ads.zzu r12) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaae.zzas(com.google.android.gms.internal.ads.zzst, com.google.android.gms.internal.ads.zzu):int");
    }

    public static int zzbe(zzst zzstVar, zzu zzuVar) {
        int i = zzuVar.zzp;
        if (i == -1) {
            return zzas(zzstVar, zzuVar);
        }
        List list = zzuVar.zzr;
        int size = list.size();
        int length = 0;
        for (int i4 = 0; i4 < size; i4++) {
            length += ((byte[]) list.get(i4)).length;
        }
        return i + length;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean zzbi(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 2924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaae.zzbi(java.lang.String):boolean");
    }

    public static final boolean zzbj(zzst zzstVar) {
        return Build.VERSION.SDK_INT >= 35 && zzstVar.zzh;
    }

    private static List zzbk(Context context, zztb zztbVar, zzu zzuVar, boolean z4, boolean z5) throws zztd {
        String str = zzuVar.zzo;
        if (str == null) {
            return zzgjz.zzi();
        }
        if (Build.VERSION.SDK_INT >= 26 && MimeTypes.VIDEO_DOLBY_VISION.equals(str) && !zzaab.zza(context)) {
            List listZzd = zztl.zzd(zztbVar, zzuVar, z4, z5);
            if (!listZzd.isEmpty()) {
                return listZzd;
            }
        }
        return zztl.zzc(zztbVar, zzuVar, z4, z5);
    }

    private final void zzbl(@Nullable Object obj) throws zzhz {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzt == surface) {
            if (surface != null) {
                zzbt();
                Surface surface2 = this.zzt;
                if (surface2 == null || !this.zzw) {
                    return;
                }
                this.zzg.zzg(surface2);
                return;
            }
            return;
        }
        this.zzt = surface;
        if (this.zzp == null) {
            this.zzi.zzd(surface);
        }
        this.zzw = false;
        int iZze = zze();
        zzsq zzsqVarZzaD = zzaD();
        if (zzsqVarZzaD != null && this.zzp == null) {
            zzst zzstVarZzaG = zzaG();
            zzstVarZzaG.getClass();
            if (!zzbp(zzstVarZzaG) || this.zzn) {
                zzaH();
                zzaz();
            } else {
                Surface surfaceZzbq = zzbq(zzstVarZzaG);
                if (surfaceZzbq != null) {
                    zzsqVarZzaD.zzm(surfaceZzbq);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zzsqVarZzaD.zzn();
                }
            }
        }
        if (surface != null) {
            zzbt();
        } else {
            this.zzJ = null;
            zzabr zzabrVar = this.zzp;
            if (zzabrVar != null) {
                zzabrVar.zzq();
            }
        }
        if (iZze == 2) {
            zzabr zzabrVar2 = this.zzp;
            if (zzabrVar2 != null) {
                zzabrVar2.zzw(true);
            } else {
                this.zzi.zzj(true);
            }
        }
    }

    private final boolean zzbm(zzhg zzhgVar) {
        if (zzdb() || zzhgVar.zzd() || this.zzO == androidx.media3.common.C.TIME_UNSET) {
            return true;
        }
        return this.zzO - (zzhgVar.zze - zzaZ()) <= SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    private final boolean zzbn(zzhg zzhgVar) {
        return zzhgVar.zze < zzG();
    }

    private final void zzbo(long j, long j6, zzu zzuVar) {
        zzaar zzaarVar = this.zzM;
        if (zzaarVar != null) {
            zzaarVar.zzcS(j, j6, zzuVar, zzaF());
        }
    }

    private final boolean zzbp(zzst zzstVar) {
        if (this.zzp != null) {
            return true;
        }
        Surface surface = this.zzt;
        return (surface != null && surface.isValid()) || zzbj(zzstVar) || zzbd(zzstVar);
    }

    @Nullable
    private final Surface zzbq(zzst zzstVar) {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            return zzabrVar.zzk();
        }
        Surface surface = this.zzt;
        if (surface != null) {
            return surface;
        }
        if (zzbj(zzstVar)) {
            return null;
        }
        zzghc.zzh(zzbd(zzstVar));
        zzaag zzaagVar = this.zzu;
        if (zzaagVar != null) {
            if (zzaagVar.zza != zzstVar.zzf) {
                zzbr();
            }
        }
        if (this.zzu == null) {
            this.zzu = zzaag.zzb(this.zze, zzstVar.zzf);
        }
        return this.zzu;
    }

    private final void zzbr() {
        zzaag zzaagVar = this.zzu;
        if (zzaagVar != null) {
            zzaagVar.release();
            this.zzu = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzbs, reason: merged with bridge method [inline-methods] */
    public final void zzbg() {
        this.zzg.zzg(this.zzt);
        this.zzw = true;
    }

    private final void zzbt() {
        zzbu zzbuVar = this.zzJ;
        if (zzbuVar != null) {
            this.zzg.zzf(zzbuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    public final void zzA(long j, boolean z4) throws zzhz {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null && !z4) {
            zzabrVar.zzg(true);
        }
        super.zzA(j, z4);
        if (this.zzp == null) {
            this.zzi.zzl();
        }
        if (z4) {
            zzabr zzabrVar2 = this.zzp;
            if (zzabrVar2 != null) {
                zzabrVar2.zzw(false);
            } else {
                this.zzi.zzj(false);
            }
        }
        this.zzB = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final void zzB() {
        this.zzA = 0;
        this.zzz = zzL().zzb();
        this.zzF = 0L;
        this.zzG = 0;
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            zzabrVar.zza();
        } else {
            this.zzi.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final void zzC() {
        if (this.zzA > 0) {
            long jZzb = zzL().zzb();
            this.zzg.zzd(this.zzA, jZzb - this.zzz);
            this.zzA = 0;
            this.zzz = jZzb;
        }
        int i = this.zzG;
        if (i != 0) {
            this.zzg.zze(this.zzF, i);
            this.zzF = 0L;
            this.zzG = 0;
        }
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            zzabrVar.zzb();
        } else {
            this.zzi.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    public final void zzD() {
        this.zzJ = null;
        this.zzO = androidx.media3.common.C.TIME_UNSET;
        this.zzw = false;
        this.zzE = true;
        try {
            super.zzD();
        } finally {
            zzabl zzablVar = this.zzg;
            zzablVar.zzi(((zzsz) this).zza);
            zzablVar.zzf(zzbu.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    public final void zzE() {
        try {
            super.zzE();
        } finally {
            this.zzq = false;
            this.zzN = androidx.media3.common.C.TIME_UNSET;
            zzbr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final void zzF() {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar == null || !this.zzf) {
            return;
        }
        zzabrVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzll, com.google.android.gms.internal.ads.zzln
    public final String zzS() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzll
    public final void zzU(float f, float f3) throws zzhz {
        super.zzU(f, f3);
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            zzabrVar.zzm(f);
        } else {
            this.zzi.zzn(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzll
    public final void zzV() {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar == null) {
            this.zzi.zzh();
            return;
        }
        int i = this.zzr;
        if (i == 0 || i == 1) {
            this.zzr = 0;
        } else {
            zzabrVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzll
    @CallSuper
    public final void zzW(long j, long j6) throws Throwable {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            try {
                zzabrVar.zzv(j, j6);
            } catch (zzabq e) {
                throw zzN(e, e.zza, false, PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED);
            }
        }
        super.zzW(j, j6);
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzll
    public final boolean zzX() {
        boolean zZzaV = zzaV();
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            return zzabrVar.zzh(zZzaV);
        }
        if (zZzaV && zzaD() == null) {
            return true;
        }
        return this.zzi.zzi(zZzaV);
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzll
    public final boolean zzY() {
        if (!super.zzY()) {
            return false;
        }
        zzabr zzabrVar = this.zzp;
        return zzabrVar == null || zzabrVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final boolean zzaB(zzst zzstVar) {
        return zzbp(zzstVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final boolean zzaJ() {
        zzst zzstVarZzaG = zzaG();
        if (this.zzp != null && zzstVarZzaG != null) {
            String str = zzstVarZzaG.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.zzaJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a  */
    @Override // com.google.android.gms.internal.ads.zzsz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzaK() {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.zzu r0 = r12.zzaE()
            long r1 = r12.zzO
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L2a
            r8 = 1
            long r1 = r1 + r8
            long r8 = r12.zzaZ()
            long r10 = r12.zzO
            long r8 = r8 + r10
            long r10 = r12.zzaL()
            long r10 = r10 + r1
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r1 = r1 - r8
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 <= 0) goto L2c
        L2a:
            r1 = r7
            goto L2d
        L2c:
            r1 = r6
        L2d:
            com.google.android.gms.internal.ads.zzls r2 = r12.zzD
            if (r2 != 0) goto L32
            goto L47
        L32:
            boolean r2 = r12.zzE
            if (r2 != 0) goto L47
            if (r0 == 0) goto L3c
            int r0 = r0.zzq
            if (r0 > 0) goto L47
        L3c:
            if (r1 != 0) goto L47
            long r0 = r12.zzaT()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L47
            return r6
        L47:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaae.zzaK():boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    @CallSuper
    public final void zzaM() {
        super.zzaM();
        this.zzl.clear();
        this.zzC = 0;
        this.zzE = false;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final zzss zzaO(Throwable th2, @Nullable zzst zzstVar) {
        return new zzzy(th2, zzstVar, this.zzt);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    @CallSuper
    public final boolean zzaP(zzu zzuVar) throws zzhz {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar == null || zzabrVar.zze()) {
            return true;
        }
        try {
            zzabrVar.zzd(zzuVar);
            return true;
        } catch (zzabq e) {
            throw zzN(e, zzuVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    @CallSuper
    public final void zzaQ(zzhg zzhgVar) throws zzhz {
        int iZzaR = zzaR(zzhgVar);
        if (Build.VERSION.SDK_INT < 34 || (iZzaR & 32) == 0) {
            this.zzC++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final int zzaR(zzhg zzhgVar) {
        return (Build.VERSION.SDK_INT < 34 || this.zzD == null || !zzbn(zzhgVar) || zzbm(zzhgVar)) ? 0 : 32;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final boolean zzaS(zzhg zzhgVar) {
        boolean z4 = false;
        if (zzbm(zzhgVar)) {
            return false;
        }
        if (zzbn(zzhgVar)) {
            if (zzhgVar.zze()) {
                return false;
            }
            if (zzhgVar.zzf()) {
                zzhgVar.zza();
                z4 = true;
            }
            if (z4) {
                ((zzsz) this).zza.zzd++;
            }
        }
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    @CallSuper
    public final void zzaU(long j) {
        super.zzaU(j);
        this.zzC--;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final int zzab(zztb zztbVar, zzu zzuVar) throws zztd {
        boolean z4;
        String str = zzuVar.zzo;
        if (!zzar.zzb(str)) {
            return 128;
        }
        Context context = this.zze;
        int i = 0;
        boolean z5 = zzuVar.zzs != null;
        List listZzbk = zzbk(context, zztbVar, zzuVar, z5, false);
        if (z5 && listZzbk.isEmpty()) {
            listZzbk = zzbk(context, zztbVar, zzuVar, false, false);
        }
        if (listZzbk.isEmpty()) {
            return TsExtractor.TS_STREAM_TYPE_AC3;
        }
        if (!zzsz.zzbb(zzuVar)) {
            return 130;
        }
        zzst zzstVar = (zzst) listZzbk.get(0);
        boolean zZzc = zzstVar.zzc(zzuVar);
        if (zZzc) {
            z4 = true;
        } else {
            for (int i4 = 1; i4 < listZzbk.size(); i4++) {
                zzst zzstVar2 = (zzst) listZzbk.get(i4);
                if (zzstVar2.zzc(zzuVar)) {
                    zZzc = true;
                    z4 = false;
                    zzstVar = zzstVar2;
                    break;
                }
            }
            z4 = true;
        }
        int i6 = true != zZzc ? 3 : 4;
        int i10 = true != zzstVar.zze(zzuVar) ? 8 : 16;
        int i11 = true != zzstVar.zzg ? 0 : 64;
        int i12 = true != z4 ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && MimeTypes.VIDEO_DOLBY_VISION.equals(str) && !zzaab.zza(context)) {
            i12 = 256;
        }
        if (zZzc) {
            List listZzbk2 = zzbk(context, zztbVar, zzuVar, z5, true);
            if (!listZzbk2.isEmpty()) {
                zzst zzstVar3 = (zzst) zztl.zze(listZzbk2, zzuVar).get(0);
                if (zzstVar3.zzc(zzuVar) && zzstVar3.zze(zzuVar)) {
                    i = 32;
                }
            }
        }
        return i6 | i10 | i | i11 | i12;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final List zzac(zztb zztbVar, zzu zzuVar, boolean z4) throws zztd {
        return zztl.zze(zzbk(this.zze, zztbVar, zzuVar, false, false), zzuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final zzsn zzae(zzst zzstVar, zzu zzuVar, @Nullable MediaCrypto mediaCrypto, float f) {
        zzaad zzaadVar;
        Point pointZzi;
        int i;
        int i4;
        int i6;
        boolean z4;
        zzu[] zzuVarArr;
        byte b8;
        boolean z5;
        int iZzas;
        zzu[] zzuVarArrZzI = zzI();
        int length = zzuVarArrZzI.length;
        int iZzbe = zzbe(zzstVar, zzuVar);
        int i10 = zzuVar.zzw;
        int i11 = zzuVar.zzv;
        boolean z8 = true;
        if (length == 1) {
            if (iZzbe != -1 && (iZzas = zzas(zzstVar, zzuVar)) != -1) {
                iZzbe = Math.min((int) (iZzbe * 1.5f), iZzas);
            }
            zzaadVar = new zzaad(i11, i10, iZzbe);
        } else {
            int iMax = i10;
            int iMax2 = i11;
            int i12 = 0;
            boolean z9 = false;
            while (i12 < length) {
                zzu zzuVarZzM = zzuVarArrZzI[i12];
                boolean z10 = z8;
                zzh zzhVar = zzuVar.zzE;
                if (zzhVar != null && zzuVarZzM.zzE == null) {
                    zzs zzsVarZza = zzuVarZzM.zza();
                    zzsVarZza.zzC(zzhVar);
                    zzuVarZzM = zzsVarZza.zzM();
                }
                if (zzstVar.zzf(zzuVar, zzuVarZzM).zzd != 0) {
                    int i13 = zzuVarZzM.zzv;
                    b8 = -1;
                    if (i13 != -1) {
                        zzuVarArr = zzuVarArrZzI;
                        if (zzuVarZzM.zzw != -1) {
                            z5 = false;
                        }
                        z9 |= z5;
                        iMax2 = Math.max(iMax2, i13);
                        iMax = Math.max(iMax, zzuVarZzM.zzw);
                        iZzbe = Math.max(iZzbe, zzbe(zzstVar, zzuVarZzM));
                    } else {
                        zzuVarArr = zzuVarArrZzI;
                    }
                    z5 = z10;
                    z9 |= z5;
                    iMax2 = Math.max(iMax2, i13);
                    iMax = Math.max(iMax, zzuVarZzM.zzw);
                    iZzbe = Math.max(iZzbe, zzbe(zzstVar, zzuVarZzM));
                } else {
                    zzuVarArr = zzuVarArrZzI;
                    b8 = -1;
                }
                i12++;
                z8 = z10;
                zzuVarArrZzI = zzuVarArr;
            }
            boolean z11 = z8;
            if (z9) {
                zzds.zzc("MediaCodecVideoRenderer", androidx.media3.datasource.cache.c.n(new StringBuilder(String.valueOf(iMax2).length() + 44 + String.valueOf(iMax).length()), "Resolutions unknown. Codec max resolution: ", iMax2, "x", iMax));
                boolean z12 = i10 > i11 ? z11 : false;
                int i14 = z12 ? i10 : i11;
                int i15 = z11 != z12 ? i10 : i11;
                int[] iArr = zzb;
                int i16 = 0;
                while (i16 < 9) {
                    float f3 = i15;
                    float f7 = i14;
                    int i17 = iArr[i16];
                    int i18 = i16;
                    float f10 = i17;
                    if (i17 <= i14 || (i = (int) (f10 * (f3 / f7))) <= i15) {
                        break;
                    }
                    int i19 = i15;
                    if (true != z12) {
                        i4 = i14;
                        i6 = i17;
                    } else {
                        i4 = i14;
                        i6 = i;
                    }
                    if (true != z12) {
                        i17 = i;
                    }
                    pointZzi = zzstVar.zzi(i6, i17);
                    float f11 = zzuVar.zzz;
                    if (pointZzi != null) {
                        z4 = z12;
                        if (zzstVar.zzg(pointZzi.x, pointZzi.y, f11)) {
                            break;
                        }
                    } else {
                        z4 = z12;
                    }
                    i16 = i18 + 1;
                    i15 = i19;
                    i14 = i4;
                    z12 = z4;
                }
                pointZzi = null;
                if (pointZzi != null) {
                    iMax2 = Math.max(iMax2, pointZzi.x);
                    iMax = Math.max(iMax, pointZzi.y);
                    zzs zzsVarZza2 = zzuVar.zza();
                    zzsVarZza2.zzt(iMax2);
                    zzsVarZza2.zzu(iMax);
                    iZzbe = Math.max(iZzbe, zzas(zzstVar, zzsVarZza2.zzM()));
                    zzds.zzc("MediaCodecVideoRenderer", androidx.media3.datasource.cache.c.n(new StringBuilder(androidx.media3.datasource.cache.c.a(iMax2, 35) + String.valueOf(iMax).length()), "Codec max resolution adjusted to: ", iMax2, "x", iMax));
                }
            }
            zzaadVar = new zzaad(iMax2, iMax, iZzbe);
        }
        String str = zzstVar.zzc;
        this.zzm = zzaadVar;
        boolean z13 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i11);
        mediaFormat.setInteger("height", i10);
        zzdv.zza(mediaFormat, zzuVar.zzr);
        float f12 = zzuVar.zzz;
        if (f12 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f12);
        }
        zzdv.zzb(mediaFormat, "rotation-degrees", zzuVar.zzA);
        zzh zzhVar2 = zzuVar.zzE;
        if (zzhVar2 != null) {
            zzdv.zzb(mediaFormat, "color-transfer", zzhVar2.zzd);
            zzdv.zzb(mediaFormat, "color-standard", zzhVar2.zzb);
            zzdv.zzb(mediaFormat, "color-range", zzhVar2.zzc);
            byte[] bArr = zzhVar2.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(zzuVar.zzo)) {
            int i20 = zztl.zza;
            Pair pairZze = zzdc.zze(zzuVar);
            if (pairZze != null) {
                zzdv.zzb(mediaFormat, Scopes.PROFILE, ((Integer) pairZze.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", zzaadVar.zza);
        mediaFormat.setInteger("max-height", zzaadVar.zzb);
        zzdv.zzb(mediaFormat, "max-input-size", zzaadVar.zzc);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (z13) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzK));
        }
        Surface surfaceZzbq = zzbq(zzstVar);
        if (this.zzp != null && !zzeo.zzS(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzsn.zzb(zzstVar, mediaFormat, zzuVar, surfaceZzbq, null);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final zzhs zzaf(zzst zzstVar, zzu zzuVar, zzu zzuVar2) {
        int i;
        int i4;
        zzhs zzhsVarZzf = zzstVar.zzf(zzuVar, zzuVar2);
        int i6 = zzhsVarZzf.zze;
        zzaad zzaadVar = this.zzm;
        zzaadVar.getClass();
        if (zzuVar2.zzv > zzaadVar.zza || zzuVar2.zzw > zzaadVar.zzb) {
            i6 |= 256;
        }
        if (zzbe(zzstVar, zzuVar2) > zzaadVar.zzc) {
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
    public final float zzah(float f, zzu zzuVar, zzu[] zzuVarArr) {
        zzst zzstVarZzaG;
        float fMax = -1.0f;
        for (zzu zzuVar2 : zzuVarArr) {
            float f3 = zzuVar2.zzz;
            if (f3 != -1.0f) {
                fMax = Math.max(fMax, f3);
            }
        }
        float f7 = fMax == -1.0f ? -1.0f : fMax * f;
        if (this.zzD == null || (zzstVarZzaG = zzaG()) == null) {
            return f7;
        }
        float fZzh = zzstVarZzaG.zzh(zzuVar.zzv, zzuVar.zzw);
        return f7 != -1.0f ? Math.max(f7, fZzh) : fZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzai(String str, zzsn zzsnVar, long j, long j6) {
        this.zzg.zzb(str, j, j6);
        this.zzn = zzbi(str);
        zzst zzstVarZzaG = zzaG();
        zzstVarZzaG.getClass();
        boolean z4 = false;
        if (Build.VERSION.SDK_INT >= 29 && MimeTypes.VIDEO_VP9.equals(zzstVarZzaG.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzb = zzstVarZzaG.zzb();
            int length = codecProfileLevelArrZzb.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArrZzb[i].profile == 16384) {
                    z4 = true;
                    break;
                }
                i++;
            }
        }
        this.zzo = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzaj(String str) {
        this.zzg.zzh(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzak(Exception exc) {
        zzds.zzf("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    @Nullable
    public final zzhs zzal(zzkh zzkhVar) throws zzhz {
        zzhs zzhsVarZzal = super.zzal(zzkhVar);
        zzu zzuVar = zzkhVar.zzb;
        zzuVar.getClass();
        this.zzg.zzc(zzuVar, zzhsVarZzal);
        return zzhsVarZzal;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzam(zzu zzuVar, @Nullable MediaFormat mediaFormat) {
        zzsq zzsqVarZzaD = zzaD();
        if (zzsqVarZzaD != null) {
            zzsqVarZzaD.zzp(this.zzx);
        }
        mediaFormat.getClass();
        boolean z4 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z4 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z4 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = zzuVar.zzB;
        int i = zzuVar.zzA;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i4 = integer2;
            integer2 = integer;
            integer = i4;
        }
        this.zzI = new zzbu(integer, integer2, f);
        zzabr zzabrVar = this.zzp;
        if (zzabrVar == null || !this.zzP) {
            this.zzi.zze(zzuVar.zzz);
        } else {
            zzs zzsVarZza = zzuVar.zza();
            zzsVarZza.zzt(integer);
            zzsVarZza.zzu(integer2);
            zzsVarZza.zzz(f);
            zzu zzuVarZzM = zzsVarZza.zzM();
            int i6 = this.zzr;
            List listZzi = this.zzs;
            if (listZzi == null) {
                listZzi = zzgjz.zzi();
            }
            zzabrVar.zzs(1, zzuVarZzM, zzba(), i6, listZzi);
            this.zzr = 2;
        }
        this.zzP = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    public final boolean zzan(long j, long j6, long j7, boolean z4, boolean z5) throws zzhz {
        int iZzP;
        if (this.zzp != null && this.zzf) {
            j6 -= -this.zzN;
        }
        if (j >= -500000 || z4 || (iZzP = zzP(j6)) == 0) {
            return false;
        }
        if (z5) {
            zzhr zzhrVar = ((zzsz) this).zza;
            int i = zzhrVar.zzd + iZzP;
            zzhrVar.zzd = i;
            zzhrVar.zzf += this.zzC;
            zzhrVar.zzd = this.zzl.size() + i;
        } else {
            ((zzsz) this).zza.zzj++;
            zzav(this.zzl.size() + iZzP, this.zzC);
        }
        zzaI();
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            zzabrVar.zzg(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzao() {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            zzabrVar.zzi();
            long jZzba = this.zzN;
            if (jZzba == androidx.media3.common.C.TIME_UNSET) {
                jZzba = zzba();
                this.zzN = jZzba;
            }
            this.zzp.zzo(-jZzba);
        } else {
            this.zzi.zza(2);
        }
        this.zzP = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final boolean zzap(long j, long j6, @Nullable zzsq zzsqVar, @Nullable ByteBuffer byteBuffer, int i, int i4, int i6, long j7, boolean z4, boolean z5, zzu zzuVar) throws zzhz {
        zzaae zzaaeVar;
        long j9;
        zzsqVar.getClass();
        long jZzaZ = j7 - zzaZ();
        int i10 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.zzl;
            Long l6 = (Long) priorityQueue.peek();
            if (l6 == null || l6.longValue() >= j7) {
                break;
            }
            priorityQueue.poll();
            i10++;
        }
        zzav(i10, 0);
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            if (!z4 || z5) {
                return zzabrVar.zzu(j7, new zzaaa(this, zzsqVar, i, jZzaZ));
            }
            zzat(zzsqVar, i, jZzaZ);
            return true;
        }
        zzaau zzaauVar = this.zzi;
        long jZzba = zzba();
        zzaas zzaasVar = this.zzj;
        int iZzk = zzaauVar.zzk(j7, j, j6, jZzba, z4, z5, zzaasVar);
        if (iZzk == 0) {
            long jZzc = zzL().zzc();
            zzbo(jZzaZ, jZzc, zzuVar);
            zzax(zzsqVar, i, jZzaZ, jZzc);
            zzaw(zzaasVar.zza());
            return true;
        }
        if (iZzk != 1) {
            if (iZzk == 2) {
                zzau(zzsqVar, i, jZzaZ);
                zzaw(zzaasVar.zza());
                return true;
            }
            if (iZzk != 3) {
                return false;
            }
            zzat(zzsqVar, i, jZzaZ);
            zzaw(zzaasVar.zza());
            return true;
        }
        long jZzb = zzaasVar.zzb();
        long jZza = zzaasVar.zza();
        if (jZzb == this.zzH) {
            zzat(zzsqVar, i, jZzaZ);
            j9 = jZzb;
            zzaaeVar = this;
        } else {
            zzbo(jZzaZ, jZzb, zzuVar);
            zzax(zzsqVar, i, jZzaZ, jZzb);
            zzaaeVar = this;
            j9 = jZzb;
        }
        zzaaeVar.zzaw(jZza);
        zzaaeVar.zzH = j9;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzaq() {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            zzabrVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    @TargetApi(29)
    public final void zzar(zzhg zzhgVar) throws zzhz {
        if (this.zzo) {
            ByteBuffer byteBuffer = zzhgVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b8 = byteBuffer.get();
                short s9 = byteBuffer.getShort();
                short s10 = byteBuffer.getShort();
                byte b10 = byteBuffer.get();
                byte b11 = byteBuffer.get();
                byteBuffer.position(0);
                if (b8 == -75 && s9 == 60 && s10 == 1 && b10 == 4) {
                    if (b11 == 0 || b11 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzsq zzsqVarZzaD = zzaD();
                        zzsqVarZzaD.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzsqVarZzaD.zzo(bundle);
                    }
                }
            }
        }
    }

    public final void zzat(zzsq zzsqVar, int i, long j) {
        Trace.beginSection("skipVideoBuffer");
        zzsqVar.zzc(i, false);
        Trace.endSection();
        ((zzsz) this).zza.zzf++;
    }

    public final void zzau(zzsq zzsqVar, int i, long j) {
        Trace.beginSection("dropVideoBuffer");
        zzsqVar.zzc(i, false);
        Trace.endSection();
        zzav(0, 1);
    }

    public final void zzav(int i, int i4) {
        zzhr zzhrVar = ((zzsz) this).zza;
        zzhrVar.zzh += i;
        int i6 = i + i4;
        zzhrVar.zzg += i6;
        this.zzA += i6;
        int i10 = this.zzB + i6;
        this.zzB = i10;
        zzhrVar.zzi = Math.max(i10, zzhrVar.zzi);
    }

    public final void zzaw(long j) {
        zzhr zzhrVar = ((zzsz) this).zza;
        zzhrVar.zzk += j;
        zzhrVar.zzl++;
        this.zzF += j;
        this.zzG++;
    }

    public final void zzax(zzsq zzsqVar, int i, long j, long j6) {
        Trace.beginSection("releaseOutputBuffer");
        zzsqVar.zzd(i, j6);
        Trace.endSection();
        ((zzsz) this).zza.zze++;
        this.zzB = 0;
        if (this.zzp == null) {
            zzbu zzbuVar = this.zzI;
            if (!zzbuVar.equals(zzbu.zza) && !zzbuVar.equals(this.zzJ)) {
                this.zzJ = zzbuVar;
                this.zzg.zzf(zzbuVar);
            }
            if (!this.zzi.zzf() || this.zzt == null) {
                return;
            }
            zzbg();
        }
    }

    public final boolean zzbd(zzst zzstVar) {
        if (zzbi(zzstVar.zza)) {
            return false;
        }
        return !zzstVar.zzf || zzaag.zza(this.zze);
    }

    public final /* synthetic */ Surface zzbh() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzlg
    public final void zzx(int i, @Nullable Object obj) throws zzhz {
        if (i == 1) {
            zzbl(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            zzaar zzaarVar = (zzaar) obj;
            this.zzM = zzaarVar;
            zzabr zzabrVar = this.zzp;
            if (zzabrVar != null) {
                zzabrVar.zzl(zzaarVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.zzL != iIntValue) {
                this.zzL = iIntValue;
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.zzx = iIntValue2;
            zzsq zzsqVarZzaD = zzaD();
            if (zzsqVarZzaD != null) {
                zzsqVarZzaD.zzp(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.zzy = iIntValue3;
            zzabr zzabrVar2 = this.zzp;
            if (zzabrVar2 != null) {
                zzabrVar2.zzr(iIntValue3);
                return;
            } else {
                this.zzi.zzm(iIntValue3);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbq.zza)) {
                zzabr zzabrVar3 = this.zzp;
                if (zzabrVar3 == null || !zzabrVar3.zze()) {
                    return;
                }
                zzabrVar3.zzf();
                return;
            }
            this.zzs = list;
            zzabr zzabrVar4 = this.zzp;
            if (zzabrVar4 != null) {
                zzabrVar4.zzn(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            zzeg zzegVar = (zzeg) obj;
            if (zzegVar.zza() == 0 || zzegVar.zzb() == 0) {
                return;
            }
            this.zzv = zzegVar;
            zzabr zzabrVar5 = this.zzp;
            if (zzabrVar5 != null) {
                Surface surface = this.zzt;
                surface.getClass();
                zzabrVar5.zzp(surface, zzegVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.zzK = ((Integer) obj).intValue();
                zzsq zzsqVarZzaD2 = zzaD();
                if (zzsqVarZzaD2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.zzK));
                    zzsqVarZzaD2.zzo(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.zzt;
                zzbl(null);
                obj.getClass();
                ((zzaae) obj).zzx(1, surface2);
                break;
            case 18:
                boolean z4 = this.zzD != null;
                zzls zzlsVar = (zzls) obj;
                this.zzD = zzlsVar;
                if (z4 != (zzlsVar != null)) {
                    zzaY();
                }
                break;
            default:
                super.zzx(i, obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    public final void zzy(boolean z4, boolean z5) throws zzhz {
        super.zzy(z4, z5);
        zzJ();
        this.zzg.zza(((zzsz) this).zza);
        if (!this.zzq) {
            if (this.zzs != null && this.zzp == null) {
                zzaai zzaaiVar = new zzaai(this.zze, this.zzi);
                zzaaiVar.zza(true);
                long j = this.zzk;
                long j6 = androidx.media3.common.C.TIME_UNSET;
                if (j != androidx.media3.common.C.TIME_UNSET) {
                    j6 = -j;
                }
                zzaaiVar.zzc(j6);
                zzaaiVar.zzb(zzL());
                zzaaq zzaaqVarZzd = zzaaiVar.zzd();
                zzaaqVarZzd.zza(1);
                this.zzp = zzaaqVarZzd.zzb(0);
            }
            this.zzq = true;
        }
        int i = !z5 ? 1 : 0;
        zzabr zzabrVar = this.zzp;
        if (zzabrVar == null) {
            zzaau zzaauVar = this.zzi;
            zzaauVar.zzg(zzL());
            zzaauVar.zza(i);
            return;
        }
        zzabrVar.zzc(new zzzz(this), zzgpk.zza());
        zzaar zzaarVar = this.zzM;
        if (zzaarVar != null) {
            this.zzp.zzl(zzaarVar);
        }
        if (this.zzt != null && !this.zzv.equals(zzeg.zza)) {
            this.zzp.zzp(this.zzt, this.zzv);
        }
        this.zzp.zzr(this.zzy);
        this.zzp.zzm(zzaW());
        List list = this.zzs;
        if (list != null) {
            this.zzp.zzn(list);
        }
        this.zzr = i;
        zzay();
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    public final void zzz(zzu[] zzuVarArr, long j, long j6, zzup zzupVar) throws zzhz {
        super.zzz(zzuVarArr, j, j6, zzupVar);
        zzbe zzbeVarZzM = zzM();
        if (zzbeVarZzM.zzg()) {
            this.zzO = androidx.media3.common.C.TIME_UNSET;
        } else {
            this.zzO = zzbeVarZzM.zzo(zzupVar.zza, new zzbc()).zzd;
        }
    }
}
