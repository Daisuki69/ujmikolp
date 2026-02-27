package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzvt implements zzun, zzacx, zzyz, zzze, zzwd {
    private static final Map zzb;
    private static final zzu zzc;
    private zzadv zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private int zzH;
    private boolean zzI;
    private long zzJ;
    private boolean zzL;
    private int zzM;
    private boolean zzN;
    private boolean zzO;
    private final zzyv zzP;
    private final Uri zzd;
    private final zzga zze;
    private final zzru zzf;
    private final zzuz zzg;
    private final zzrp zzh;
    private final zzvl zzi;
    private final long zzj;
    private final long zzk;
    private final zzvi zzm;

    @Nullable
    private zzum zzr;

    @Nullable
    private zzafw zzs;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private zzvs zzz;
    private final zzzh zzl = new zzzh("ProgressiveMediaPeriod");
    private final zzde zzn = new zzde(zzdb.zza);
    private final Runnable zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzvp
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.zza.zzD();
        }
    };
    private final Runnable zzp = new Runnable() { // from class: com.google.android.gms.internal.ads.zzvm
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.zza.zzE();
        }
    };
    private final Handler zzq = zzeo.zzc(null);
    private zzvr[] zzu = new zzvr[0];
    private zzwe[] zzt = new zzwe[0];
    private long zzK = androidx.media3.common.C.TIME_UNSET;
    private int zzD = 1;

    static {
        HashMap map = new HashMap();
        map.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        zzb = Collections.unmodifiableMap(map);
        zzs zzsVar = new zzs();
        zzsVar.zza("icy");
        zzsVar.zzm(MimeTypes.APPLICATION_ICY);
        zzc = zzsVar.zzM();
    }

    public zzvt(Uri uri, zzga zzgaVar, zzvi zzviVar, zzru zzruVar, zzrp zzrpVar, zzyy zzyyVar, zzuz zzuzVar, zzvl zzvlVar, zzyv zzyvVar, @Nullable String str, int i, int i4, @Nullable zzu zzuVar, long j, @Nullable zzzn zzznVar) {
        this.zzd = uri;
        this.zze = zzgaVar;
        this.zzf = zzruVar;
        this.zzh = zzrpVar;
        this.zzg = zzuzVar;
        this.zzi = zzvlVar;
        this.zzP = zzyvVar;
        this.zzj = i;
        this.zzm = zzviVar;
        this.zzk = j;
    }

    private final void zzR(int i) {
        zzaa();
        zzvs zzvsVar = this.zzz;
        boolean[] zArr = zzvsVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzu zzuVarZza = zzvsVar.zza.zza(i).zza(0);
        this.zzg.zzh(new zzul(1, zzar.zzg(zzuVarZza.zzo), zzuVarZza, 0, null, zzeo.zzp(this.zzJ), androidx.media3.common.C.TIME_UNSET));
        zArr[i] = true;
    }

    private final void zzS(int i) {
        zzaa();
        if (this.zzL) {
            if ((!this.zzx || this.zzz.zzb[i]) && !this.zzt[i].zzl(false)) {
                this.zzK = 0L;
                this.zzL = false;
                this.zzF = true;
                this.zzJ = 0L;
                this.zzM = 0;
                for (zzwe zzweVar : this.zzt) {
                    zzweVar.zzb(false);
                }
                zzum zzumVar = this.zzr;
                zzumVar.getClass();
                zzumVar.zzs(this);
            }
        }
    }

    private final boolean zzT() {
        return this.zzF || zzZ();
    }

    private final zzaeb zzU(zzvr zzvrVar) {
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            if (zzvrVar.equals(this.zzu[i])) {
                return this.zzt[i];
            }
        }
        if (this.zzv) {
            int i4 = zzvrVar.zza;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 55);
            sb2.append("Extractor added new track (id=");
            sb2.append(i4);
            sb2.append(") after finishing tracks.");
            zzds.zzc("ProgressiveMediaPeriod", sb2.toString());
            return new zzacr();
        }
        zzwe zzweVar = new zzwe(this.zzP, this.zzf, this.zzh);
        zzweVar.zzt(this);
        int i6 = length + 1;
        zzvr[] zzvrVarArr = (zzvr[]) Arrays.copyOf(this.zzu, i6);
        zzvrVarArr[length] = zzvrVar;
        String str = zzeo.zza;
        this.zzu = zzvrVarArr;
        zzwe[] zzweVarArr = (zzwe[]) Arrays.copyOf(this.zzt, i6);
        zzweVarArr[length] = zzweVar;
        this.zzt = zzweVarArr;
        return zzweVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
    public final void zzD() {
        int i;
        if (this.zzO || this.zzw || !this.zzv || this.zzA == null) {
            return;
        }
        for (zzwe zzweVar : this.zzt) {
            if (zzweVar.zzi() == null) {
                return;
            }
        }
        this.zzn.zzb();
        int length = this.zzt.length;
        zzbf[] zzbfVarArr = new zzbf[length];
        boolean[] zArr = new boolean[length];
        for (int i4 = 0; i4 < length; i4++) {
            zzu zzuVarZzi = this.zzt[i4].zzi();
            zzuVarZzi.getClass();
            String str = zzuVarZzi.zzo;
            boolean zZza = zzar.zza(str);
            boolean z4 = zZza || zzar.zzb(str);
            zArr[i4] = z4;
            this.zzx = z4 | this.zzx;
            this.zzy = this.zzk != androidx.media3.common.C.TIME_UNSET && length == 1 && zzar.zzc(str);
            zzafw zzafwVar = this.zzs;
            if (zzafwVar != null) {
                if (zZza || this.zzu[i4].zzb) {
                    zzao zzaoVar = zzuVarZzi.zzl;
                    zzao zzaoVar2 = zzaoVar == null ? new zzao(androidx.media3.common.C.TIME_UNSET, zzafwVar) : zzaoVar.zzd(zzafwVar);
                    zzs zzsVarZza = zzuVarZzi.zza();
                    zzsVarZza.zzk(zzaoVar2);
                    zzuVarZzi = zzsVarZza.zzM();
                }
                if (zZza && zzuVarZzi.zzh == -1 && zzuVarZzi.zzi == -1 && (i = zzafwVar.zza) != -1) {
                    zzs zzsVarZza2 = zzuVarZzi.zza();
                    zzsVarZza2.zzh(i);
                    zzuVarZzi = zzsVarZza2.zzM();
                }
            }
            zzu zzuVarZzb = zzuVarZzi.zzb(this.zzf.zzb(zzuVarZzi));
            zzbfVarArr[i4] = new zzbf(Integer.toString(i4), zzuVarZzb);
            this.zzG = zzuVarZzb.zzu | this.zzG;
        }
        this.zzz = new zzvs(new zzwq(zzbfVarArr), zArr);
        if (this.zzy && this.zzB == androidx.media3.common.C.TIME_UNSET) {
            this.zzB = this.zzk;
            this.zzA = new zzvj(this, this.zzA);
        }
        this.zzi.zzb(this.zzB, this.zzA, this.zzC);
        this.zzw = true;
        zzum zzumVar = this.zzr;
        zzumVar.getClass();
        zzumVar.zzp(this);
    }

    private final void zzW() {
        zzvk zzvkVar = new zzvk(this, this.zzd, this.zze, this.zzm, this, this.zzn);
        if (this.zzw) {
            zzghc.zzh(zzZ());
            long j = this.zzB;
            if (j != androidx.media3.common.C.TIME_UNSET && this.zzK > j) {
                this.zzN = true;
                this.zzK = androidx.media3.common.C.TIME_UNSET;
                return;
            }
            zzadv zzadvVar = this.zzA;
            zzadvVar.getClass();
            zzvkVar.zzd(zzadvVar.zzc(this.zzK).zza.zzc, this.zzK);
            for (zzwe zzweVar : this.zzt) {
                zzweVar.zzc(this.zzK);
            }
            this.zzK = androidx.media3.common.C.TIME_UNSET;
        }
        this.zzM = zzX();
        this.zzl.zzd(zzvkVar, this, zzyy.zza(this.zzD));
    }

    private final int zzX() {
        int iZzd = 0;
        for (zzwe zzweVar : this.zzt) {
            iZzd += zzweVar.zzd();
        }
        return iZzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long zzY(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = -9223372036854775808
        L3:
            com.google.android.gms.internal.ads.zzwe[] r3 = r5.zzt
            int r4 = r3.length
            if (r0 >= r4) goto L22
            if (r6 != 0) goto L15
            com.google.android.gms.internal.ads.zzvs r4 = r5.zzz
            r4.getClass()
            boolean[] r4 = r4.zzc
            boolean r4 = r4[r0]
            if (r4 == 0) goto L1f
        L15:
            r3 = r3[r0]
            long r3 = r3.zzj()
            long r1 = java.lang.Math.max(r1, r3)
        L1f:
            int r0 = r0 + 1
            goto L3
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvt.zzY(boolean):long");
    }

    private final boolean zzZ() {
        return this.zzK != androidx.media3.common.C.TIME_UNSET;
    }

    private final void zzaa() {
        zzghc.zzh(this.zzw);
        this.zzz.getClass();
        this.zzA.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final /* bridge */ /* synthetic */ void zzA(zzzd zzzdVar, long j, long j6, boolean z4) {
        zzvk zzvkVar = (zzvk) zzzdVar;
        zzgx zzgxVarZzf = zzvkVar.zzf();
        zzug zzugVar = new zzug(zzvkVar.zze(), zzvkVar.zzh(), zzgxVarZzf.zzg(), zzgxVarZzf.zzh(), j, j6, zzgxVarZzf.zzf());
        zzvkVar.zze();
        this.zzg.zzf(zzugVar, new zzul(1, -1, null, 0, null, zzeo.zzp(zzvkVar.zzg()), zzeo.zzp(this.zzB)));
        if (z4) {
            return;
        }
        for (zzwe zzweVar : this.zzt) {
            zzweVar.zzb(false);
        }
        if (this.zzH > 0) {
            zzum zzumVar = this.zzr;
            zzumVar.getClass();
            zzumVar.zzs(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final /* bridge */ /* synthetic */ void zzB(zzzd zzzdVar, long j, long j6) {
        zzvk zzvkVar = (zzvk) zzzdVar;
        if (this.zzB == androidx.media3.common.C.TIME_UNSET && this.zzA != null) {
            long jZzY = zzY(true);
            long j7 = jZzY == Long.MIN_VALUE ? 0L : jZzY + 10000;
            this.zzB = j7;
            this.zzi.zzb(j7, this.zzA, this.zzC);
        }
        zzgx zzgxVarZzf = zzvkVar.zzf();
        zzug zzugVar = new zzug(zzvkVar.zze(), zzvkVar.zzh(), zzgxVarZzf.zzg(), zzgxVarZzf.zzh(), j, j6, zzgxVarZzf.zzf());
        zzvkVar.zze();
        this.zzg.zze(zzugVar, new zzul(1, -1, null, 0, null, zzeo.zzp(zzvkVar.zzg()), zzeo.zzp(this.zzB)));
        this.zzN = true;
        zzum zzumVar = this.zzr;
        zzumVar.getClass();
        zzumVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final /* bridge */ /* synthetic */ void zzC(zzzd zzzdVar, long j, long j6, int i) {
        zzvk zzvkVar = (zzvk) zzzdVar;
        zzgx zzgxVarZzf = zzvkVar.zzf();
        this.zzg.zzd(i == 0 ? new zzug(zzvkVar.zze(), zzvkVar.zzh(), j) : new zzug(zzvkVar.zze(), zzvkVar.zzh(), zzgxVarZzf.zzg(), zzgxVarZzf.zzh(), j, j6, zzgxVarZzf.zzf()), new zzul(1, -1, null, 0, null, zzeo.zzp(zzvkVar.zzg()), zzeo.zzp(this.zzB)), i);
    }

    public final /* synthetic */ void zzE() {
        if (this.zzO) {
            return;
        }
        zzum zzumVar = this.zzr;
        zzumVar.getClass();
        zzumVar.zzs(this);
    }

    public final /* synthetic */ void zzF(zzadv zzadvVar) {
        this.zzA = this.zzs == null ? zzadvVar : new zzadu(androidx.media3.common.C.TIME_UNSET, 0L);
        this.zzB = zzadvVar.zza();
        boolean z4 = false;
        if (!this.zzI && zzadvVar.zza() == androidx.media3.common.C.TIME_UNSET) {
            z4 = true;
        }
        this.zzC = z4;
        this.zzD = true == z4 ? 7 : 1;
        if (this.zzw) {
            this.zzi.zzb(this.zzB, zzadvVar, z4);
        } else {
            zzD();
        }
    }

    public final /* synthetic */ void zzG() {
        this.zzI = true;
    }

    public final /* synthetic */ void zzH() {
        this.zzq.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG();
            }
        });
    }

    public final /* synthetic */ long zzI(boolean z4) {
        return zzY(true);
    }

    public final /* synthetic */ long zzL() {
        return this.zzj;
    }

    public final /* synthetic */ Runnable zzM() {
        return this.zzp;
    }

    public final /* synthetic */ Handler zzN() {
        return this.zzq;
    }

    public final /* synthetic */ zzafw zzO() {
        return this.zzs;
    }

    public final /* synthetic */ void zzP(zzafw zzafwVar) {
        this.zzs = zzafwVar;
    }

    public final /* synthetic */ long zzQ() {
        return this.zzB;
    }

    public final void zza() {
        if (this.zzw) {
            for (zzwe zzweVar : this.zzt) {
                zzweVar.zze();
            }
        }
        this.zzl.zzg(this);
        this.zzq.removeCallbacksAndMessages(null);
        this.zzr = null;
        this.zzO = true;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzb(zzum zzumVar, long j) {
        this.zzr = zzumVar;
        this.zzn.zza();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzc() throws IOException {
        zzr();
        if (this.zzN && !this.zzw) {
            throw zzas.zzb("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final zzwq zzd() {
        zzaa();
        return this.zzz.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zze(zzyf[] zzyfVarArr, boolean[] zArr, zzwf[] zzwfVarArr, boolean[] zArr2, long j) {
        zzyf zzyfVar;
        zzaa();
        zzvs zzvsVar = this.zzz;
        zzwq zzwqVar = zzvsVar.zza;
        boolean[] zArr3 = zzvsVar.zzc;
        int i = this.zzH;
        int i4 = 0;
        for (int i6 = 0; i6 < zzyfVarArr.length; i6++) {
            zzwf zzwfVar = zzwfVarArr[i6];
            if (zzwfVar != null && (zzyfVarArr[i6] == null || !zArr[i6])) {
                int iZza = ((zzvq) zzwfVar).zza();
                zzghc.zzh(zArr3[iZza]);
                this.zzH--;
                zArr3[iZza] = false;
                zzwfVarArr[i6] = null;
            }
        }
        boolean z4 = !this.zzE ? j == 0 || this.zzy : i != 0;
        for (int i10 = 0; i10 < zzyfVarArr.length; i10++) {
            if (zzwfVarArr[i10] == null && (zzyfVar = zzyfVarArr[i10]) != null) {
                zzghc.zzh(zzyfVar.zze() == 1);
                zzghc.zzh(zzyfVar.zzf(0) == 0);
                int iZzb = zzwqVar.zzb(zzyfVar.zza());
                zzghc.zzh(!zArr3[iZzb]);
                this.zzH++;
                zArr3[iZzb] = true;
                this.zzG = zzyfVar.zzc().zzu | this.zzG;
                zzwfVarArr[i10] = new zzvq(this, iZzb);
                zArr2[i10] = true;
                if (!z4) {
                    zzwe zzweVar = this.zzt[iZzb];
                    z4 = (zzweVar.zzh() == 0 || zzweVar.zzo(j, true)) ? false : true;
                }
            }
        }
        if (this.zzH == 0) {
            this.zzL = false;
            this.zzF = false;
            this.zzG = false;
            zzzh zzzhVar = this.zzl;
            if (zzzhVar.zze()) {
                zzwe[] zzweVarArr = this.zzt;
                int length = zzweVarArr.length;
                while (i4 < length) {
                    zzweVarArr[i4].zzs();
                    i4++;
                }
                zzzhVar.zzf();
            } else {
                this.zzN = false;
                for (zzwe zzweVar2 : this.zzt) {
                    zzweVar2.zzb(false);
                }
            }
        } else if (z4) {
            j = zzj(j);
            while (i4 < zzwfVarArr.length) {
                if (zzwfVarArr[i4] != null) {
                    zArr2[i4] = true;
                }
                i4++;
            }
        }
        this.zzE = true;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzf(long j, boolean z4) {
        if (this.zzy) {
            return;
        }
        zzaa();
        if (zzZ()) {
            return;
        }
        boolean[] zArr = this.zzz.zzc;
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            this.zzt[i].zzr(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final void zzg(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzh() {
        if (this.zzG) {
            this.zzG = false;
        } else {
            if (!this.zzF) {
                return androidx.media3.common.C.TIME_UNSET;
            }
            if (!this.zzN && zzX() <= this.zzM) {
                return androidx.media3.common.C.TIME_UNSET;
            }
            this.zzF = false;
        }
        return this.zzJ;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzi() {
        long jZzY;
        zzaa();
        if (this.zzN || this.zzH == 0) {
            return Long.MIN_VALUE;
        }
        if (zzZ()) {
            return this.zzK;
        }
        if (this.zzx) {
            int length = this.zzt.length;
            jZzY = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zzvs zzvsVar = this.zzz;
                if (zzvsVar.zzb[i] && zzvsVar.zzc[i] && !this.zzt[i].zzk()) {
                    jZzY = Math.min(jZzY, this.zzt[i].zzj());
                }
            }
        } else {
            jZzY = Long.MAX_VALUE;
        }
        if (jZzY == Long.MAX_VALUE) {
            jZzY = zzY(false);
        }
        return jZzY == Long.MIN_VALUE ? this.zzJ : jZzY;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    @Override // com.google.android.gms.internal.ads.zzun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzj(long r9) {
        /*
            r8 = this;
            r8.zzaa()
            com.google.android.gms.internal.ads.zzvs r0 = r8.zzz
            boolean[] r0 = r0.zzb
            com.google.android.gms.internal.ads.zzadv r1 = r8.zzA
            boolean r1 = r1.zzb()
            r2 = 1
            if (r2 == r1) goto L12
            r9 = 0
        L12:
            r1 = 0
            r8.zzF = r1
            long r2 = r8.zzJ
            r8.zzJ = r9
            boolean r4 = r8.zzZ()
            if (r4 == 0) goto L22
            r8.zzK = r9
            return r9
        L22:
            int r4 = r8.zzD
            r5 = 7
            if (r4 == r5) goto L69
            boolean r4 = r8.zzN
            if (r4 != 0) goto L33
            com.google.android.gms.internal.ads.zzzh r4 = r8.zzl
            boolean r4 = r4.zze()
            if (r4 == 0) goto L69
        L33:
            com.google.android.gms.internal.ads.zzwe[] r4 = r8.zzt
            int r4 = r4.length
            r5 = r1
        L37:
            if (r5 >= r4) goto L9b
            com.google.android.gms.internal.ads.zzwe[] r6 = r8.zzt
            r6 = r6[r5]
            int r7 = r6.zzh()
            if (r7 != 0) goto L48
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 != 0) goto L48
            goto L66
        L48:
            boolean r7 = r8.zzy
            if (r7 == 0) goto L55
            int r7 = r6.zzg()
            boolean r6 = r6.zzn(r7)
            goto L5b
        L55:
            boolean r7 = r8.zzN
            boolean r6 = r6.zzo(r9, r7)
        L5b:
            if (r6 != 0) goto L66
            boolean r6 = r0[r5]
            if (r6 != 0) goto L69
            boolean r6 = r8.zzx
            if (r6 != 0) goto L66
            goto L69
        L66:
            int r5 = r5 + 1
            goto L37
        L69:
            r8.zzL = r1
            r8.zzK = r9
            r8.zzN = r1
            r8.zzG = r1
            com.google.android.gms.internal.ads.zzzh r0 = r8.zzl
            boolean r2 = r0.zze()
            if (r2 == 0) goto L8a
            com.google.android.gms.internal.ads.zzwe[] r2 = r8.zzt
            int r3 = r2.length
        L7c:
            if (r1 >= r3) goto L86
            r4 = r2[r1]
            r4.zzs()
            int r1 = r1 + 1
            goto L7c
        L86:
            r0.zzf()
            return r9
        L8a:
            r0.zzc()
            com.google.android.gms.internal.ads.zzwe[] r0 = r8.zzt
            int r2 = r0.length
            r3 = r1
        L91:
            if (r3 >= r2) goto L9b
            r4 = r0[r3]
            r4.zzb(r1)
            int r3 = r3 + 1
            goto L91
        L9b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvt.zzj(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0084 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzk(long r23, com.google.android.gms.internal.ads.zzlt r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r3 = r25
            r0.zzaa()
            com.google.android.gms.internal.ads.zzadv r4 = r0.zzA
            boolean r4 = r4.zzb()
            r5 = 0
            if (r4 != 0) goto L14
            return r5
        L14:
            com.google.android.gms.internal.ads.zzadv r4 = r0.zzA
            com.google.android.gms.internal.ads.zzadt r4 = r4.zzc(r1)
            com.google.android.gms.internal.ads.zzadw r7 = r4.zza
            com.google.android.gms.internal.ads.zzadw r4 = r4.zzb
            long r8 = r3.zzc
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 != 0) goto L2c
            long r8 = r3.zzd
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 != 0) goto L2b
            return r1
        L2b:
            r8 = r5
        L2c:
            long r10 = r7.zzb
            java.lang.String r7 = com.google.android.gms.internal.ads.zzeo.zza
            long r12 = r1 - r8
            long r8 = r8 ^ r1
            long r14 = r1 ^ r12
            r16 = r5
            long r5 = r3.zzd
            long r18 = r1 + r5
            long r20 = r1 ^ r18
            long r5 = r5 ^ r18
            long r8 = r8 & r14
            int r3 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r3 >= 0) goto L46
            r12 = -9223372036854775808
        L46:
            long r5 = r20 & r5
            int r3 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r3 >= 0) goto L51
            r18 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L51:
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r3 > 0) goto L5d
            int r3 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r3 > 0) goto L5d
            r3 = r5
            goto L5e
        L5d:
            r3 = r6
        L5e:
            long r7 = r4.zzb
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 > 0) goto L69
            int r4 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r4 > 0) goto L69
            goto L6a
        L69:
            r5 = r6
        L6a:
            if (r3 == 0) goto L7f
            if (r5 == 0) goto L7f
            long r3 = r10 - r1
            long r1 = r7 - r1
            long r3 = java.lang.Math.abs(r3)
            long r1 = java.lang.Math.abs(r1)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L84
            goto L81
        L7f:
            if (r3 == 0) goto L82
        L81:
            return r10
        L82:
            if (r5 == 0) goto L85
        L84:
            return r7
        L85:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvt.zzk(long, com.google.android.gms.internal.ads.zzlt):long");
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzl() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzm(zzkl zzklVar) {
        if (this.zzN) {
            return false;
        }
        zzzh zzzhVar = this.zzl;
        if (zzzhVar.zzb() || this.zzL) {
            return false;
        }
        if (this.zzw && this.zzH == 0) {
            return false;
        }
        boolean zZza = this.zzn.zza();
        if (zzzhVar.zze()) {
            return zZza;
        }
        zzW();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzn() {
        return this.zzl.zze() && this.zzn.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final void zzo() {
        for (zzwe zzweVar : this.zzt) {
            zzweVar.zza();
        }
        this.zzm.zzb();
    }

    public final boolean zzp(int i) {
        return !zzT() && this.zzt[i].zzl(this.zzN);
    }

    public final void zzq(int i) throws IOException {
        this.zzt[i].zzf();
        zzr();
    }

    public final void zzr() throws IOException {
        this.zzl.zzh(zzyy.zza(this.zzD));
    }

    public final int zzs(int i, zzkh zzkhVar, zzhg zzhgVar, int i4) {
        if (zzT()) {
            return -3;
        }
        zzR(i);
        int iZzm = this.zzt[i].zzm(zzkhVar, zzhgVar, i4, this.zzN);
        if (iZzm == -3) {
            zzS(i);
        }
        return iZzm;
    }

    public final int zzt(int i, long j) {
        if (zzT()) {
            return 0;
        }
        zzR(i);
        zzwe zzweVar = this.zzt[i];
        int iZzp = zzweVar.zzp(j, this.zzN);
        zzweVar.zzq(iZzp);
        if (iZzp != 0) {
            return iZzp;
        }
        zzS(i);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final zzaeb zzu(int i, int i4) {
        return zzU(new zzvr(i, false));
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final void zzv() {
        this.zzv = true;
        this.zzq.post(this.zzo);
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final void zzw(final zzadv zzadvVar) {
        this.zzq.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzF(zzadvVar);
            }
        });
    }

    public final zzaeb zzx() {
        return zzU(new zzvr(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzwd
    public final void zzy(zzu zzuVar) {
        this.zzq.post(this.zzo);
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final /* bridge */ /* synthetic */ zzzb zzz(zzzd zzzdVar, long j, long j6, IOException iOException, int i) {
        long jMin;
        zzzb zzzbVarZza;
        zzadv zzadvVar;
        zzvk zzvkVar = (zzvk) zzzdVar;
        zzgx zzgxVarZzf = zzvkVar.zzf();
        zzug zzugVar = new zzug(zzvkVar.zze(), zzvkVar.zzh(), zzgxVarZzf.zzg(), zzgxVarZzf.zzh(), j, j6, zzgxVarZzf.zzf());
        zzvkVar.zzg();
        String str = zzeo.zza;
        if ((iOException instanceof zzas) || (iOException instanceof FileNotFoundException) || (iOException instanceof zzgo) || (iOException instanceof zzzg)) {
            jMin = -9223372036854775807L;
            break;
        }
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof zzgb) && ((zzgb) cause).zza == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS);
        if (jMin == androidx.media3.common.C.TIME_UNSET) {
            zzzbVarZza = zzzh.zzb;
        } else {
            int iZzX = zzX();
            boolean z4 = iZzX > this.zzM;
            if (this.zzI || !((zzadvVar = this.zzA) == null || zzadvVar.zza() == androidx.media3.common.C.TIME_UNSET)) {
                this.zzM = iZzX;
            } else {
                boolean z5 = this.zzw;
                if (!z5 || zzT()) {
                    this.zzF = z5;
                    this.zzJ = 0L;
                    this.zzM = 0;
                    for (zzwe zzweVar : this.zzt) {
                        zzweVar.zzb(false);
                    }
                    zzvkVar.zzd(0L, 0L);
                } else {
                    this.zzL = true;
                    zzzbVarZza = zzzh.zza;
                }
            }
            zzzbVarZza = zzzh.zza(z4, jMin);
        }
        boolean zZza = zzzbVarZza.zza();
        this.zzg.zzg(zzugVar, new zzul(1, -1, null, 0, null, zzeo.zzp(zzvkVar.zzg()), zzeo.zzp(this.zzB)), iOException, true ^ zZza);
        if (!zZza) {
            zzvkVar.zze();
        }
        return zzzbVarZza;
    }
}
