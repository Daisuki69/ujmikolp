package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.dynatrace.android.agent.Global;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbv extends zzcaj implements TextureView.SurfaceTextureListener, zzcat {
    private final zzcbd zzc;
    private final zzcbe zzd;
    private final zzcbc zze;

    @Nullable
    private final zzdsm zzf;
    private zzcai zzg;
    private Surface zzh;
    private zzcau zzi;
    private String zzj;
    private String[] zzk;
    private boolean zzl;
    private int zzm;
    private zzcbb zzn;
    private final boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private float zzt;

    public zzcbv(Context context, zzcbe zzcbeVar, zzcbd zzcbdVar, boolean z4, boolean z5, zzcbc zzcbcVar, @Nullable zzdsm zzdsmVar) {
        super(context);
        this.zzm = 1;
        this.zzc = zzcbdVar;
        this.zzd = zzcbeVar;
        this.zzo = z4;
        this.zze = zzcbcVar;
        zzcbeVar.zza(this);
        this.zzf = zzdsmVar;
    }

    private final boolean zzT() {
        zzcau zzcauVar = this.zzi;
        return (zzcauVar == null || !zzcauVar.zzB() || this.zzl) ? false : true;
    }

    private final boolean zzU() {
        return zzT() && this.zzm != 1;
    }

    private final void zzV(boolean z4, @Nullable Integer num) {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null && !z4) {
            zzcauVar.zzn(num);
            return;
        }
        if (this.zzj == null || this.zzh == null) {
            return;
        }
        if (z4) {
            if (!zzT()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzcauVar.zzw();
                zzW();
            }
        }
        if (this.zzj.startsWith("cache:")) {
            zzccq zzccqVarZzr = this.zzc.zzr(this.zzj);
            if (zzccqVarZzr instanceof zzccz) {
                zzcau zzcauVarZza = ((zzccz) zzccqVarZzr).zza();
                this.zzi = zzcauVarZza;
                zzcauVarZza.zzn(num);
                if (!this.zzi.zzB()) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzccqVarZzr instanceof zzccw)) {
                    String strValueOf = String.valueOf(this.zzj);
                    int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Stream cache miss: ".concat(strValueOf));
                    return;
                }
                zzccw zzccwVar = (zzccw) zzccqVarZzr;
                String strZzF = zzF();
                ByteBuffer byteBufferZzu = zzccwVar.zzu();
                boolean zZzt = zzccwVar.zzt();
                String strZzs = zzccwVar.zzs();
                if (strZzs == null) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Stream cache URL is null.");
                    return;
                } else {
                    zzcau zzcauVarZzE = zzE(num);
                    this.zzi = zzcauVarZzE;
                    zzcauVarZzE.zzr(new Uri[]{Uri.parse(strZzs)}, strZzF, byteBufferZzu, zZzt);
                }
            }
        } else {
            this.zzi = zzE(num);
            String strZzF2 = zzF();
            Uri[] uriArr = new Uri[this.zzk.length];
            int i11 = 0;
            while (true) {
                String[] strArr = this.zzk;
                if (i11 >= strArr.length) {
                    break;
                }
                uriArr[i11] = Uri.parse(strArr[i11]);
                i11++;
            }
            this.zzi.zzq(uriArr, strZzF2);
        }
        this.zzi.zzs(this);
        zzX(this.zzh, false);
        if (this.zzi.zzB()) {
            int iZzC = this.zzi.zzC();
            this.zzm = iZzC;
            if (iZzC == 3) {
                zzY();
            }
        }
    }

    private final void zzW() {
        if (this.zzi != null) {
            zzX(null, true);
            zzcau zzcauVar = this.zzi;
            if (zzcauVar != null) {
                zzcauVar.zzs(null);
                this.zzi.zzt();
                this.zzi = null;
            }
            this.zzm = 1;
            this.zzl = false;
            this.zzp = false;
            this.zzq = false;
        }
    }

    private final void zzX(Surface surface, boolean z4) {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzcauVar.zzu(surface, z4);
        } catch (IOException e) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e);
        }
    }

    private final void zzY() {
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzH();
            }
        });
        zzq();
        this.zzd.zzb();
        if (this.zzq) {
            zze();
        }
    }

    private static String zzZ(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        androidx.media3.datasource.cache.c.A(sb2, str, "/", canonicalName, Global.COLON);
        sb2.append(message);
        return sb2.toString();
    }

    private final void zzaa() {
        zzab(this.zzr, this.zzs);
    }

    private final void zzab(int i, int i4) {
        float f = i4 > 0 ? i / i4 : 1.0f;
        if (this.zzt != f) {
            this.zzt = f;
            requestLayout();
        }
    }

    private final void zzac() {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            zzcauVar.zzM(true);
        }
    }

    private final void zzad() {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            zzcauVar.zzM(false);
        }
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.zzt;
        if (f != 0.0f && this.zzn == null) {
            float f3 = measuredWidth;
            float f7 = f3 / measuredHeight;
            if (f > f7) {
                measuredHeight = (int) (f3 / f);
            }
            if (f < f7) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcbb zzcbbVar = this.zzn;
        if (zzcbbVar != null) {
            zzcbbVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i4) {
        zzdsm zzdsmVar;
        if (this.zzo) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoc)).booleanValue() && (zzdsmVar = this.zzf) != null) {
                zzdsl zzdslVarZza = zzdsmVar.zza();
                zzdslVarZza.zzc("action", "svp_aepv");
                zzdslVarZza.zzd();
            }
            zzcbb zzcbbVar = new zzcbb(getContext());
            this.zzn = zzcbbVar;
            zzcbbVar.zzb(surfaceTexture, i, i4);
            zzcbb zzcbbVar2 = this.zzn;
            zzcbbVar2.start();
            SurfaceTexture surfaceTextureZze = zzcbbVar2.zze();
            if (surfaceTextureZze != null) {
                surfaceTexture = surfaceTextureZze;
            } else {
                this.zzn.zzd();
                this.zzn = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzh = surface;
        if (this.zzi == null) {
            zzV(false, null);
        } else {
            zzX(surface, true);
            if (!this.zze.zza) {
                zzac();
            }
        }
        if (this.zzr == 0 || this.zzs == 0) {
            zzab(i, i4);
        } else {
            zzaa();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzf();
        zzcbb zzcbbVar = this.zzn;
        if (zzcbbVar != null) {
            zzcbbVar.zzd();
            this.zzn = null;
        }
        if (this.zzi != null) {
            zzad();
            Surface surface = this.zzh;
            if (surface != null) {
                surface.release();
            }
            this.zzh = null;
            zzX(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzO();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i4) {
        zzcbb zzcbbVar = this.zzn;
        if (zzcbbVar != null) {
            zzcbbVar.zzc(i, i4);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzN(i, i4);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzd(this);
        this.zza.zzb(surfaceTexture, this.zzg);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 46);
        sb2.append("AdExoPlayerView3 window visibility changed to ");
        sb2.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzP(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzA(int i) {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            zzcauVar.zzy(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzB(int i) {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            zzcauVar.zzz(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzC(int i) {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            zzcauVar.zzA(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzD() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzS();
            }
        });
    }

    public final zzcau zzE(@Nullable Integer num) {
        zzcbc zzcbcVar = this.zze;
        zzcbd zzcbdVar = this.zzc;
        zzcds zzcdsVar = new zzcds(zzcbdVar.getContext(), zzcbcVar, zzcbdVar, num);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        return zzcdsVar;
    }

    public final String zzF() {
        zzcbd zzcbdVar = this.zzc;
        return com.google.android.gms.ads.internal.zzt.zzc().zze(zzcbdVar.getContext(), zzcbdVar.zzs().afmaVersion);
    }

    public final /* synthetic */ void zzG() {
        float fZzc = this.zzb.zzc();
        zzcau zzcauVar = this.zzi;
        if (zzcauVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzcauVar.zzv(fZzc, false);
        } catch (IOException e) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e);
        }
    }

    public final /* synthetic */ void zzH() {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zzb();
        }
    }

    public final /* synthetic */ void zzI() {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zze();
        }
    }

    public final /* synthetic */ void zzJ(String str) {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zzf("ExoPlayerAdapter error", str);
        }
    }

    public final /* synthetic */ void zzK() {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zzc();
        }
    }

    public final /* synthetic */ void zzL() {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zzd();
        }
    }

    public final /* synthetic */ void zzM() {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zza();
        }
    }

    public final /* synthetic */ void zzN(int i, int i4) {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zzj(i, i4);
        }
    }

    public final /* synthetic */ void zzO() {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zzh();
        }
    }

    public final /* synthetic */ void zzP(int i) {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.onWindowVisibilityChanged(i);
        }
    }

    public final /* synthetic */ void zzQ(boolean z4, long j) {
        this.zzc.zzu(z4, j);
    }

    public final /* synthetic */ void zzR(String str) {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zzg("ExoPlayerAdapter exception", str);
        }
    }

    public final /* synthetic */ void zzS() {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final String zza() {
        return "ExoPlayer/2".concat(true != this.zzo ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzb(zzcai zzcaiVar) {
        this.zzg = zzcaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzc(@Nullable String str) {
        if (str != null) {
            zzx(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzd() {
        if (zzT()) {
            this.zzi.zzw();
            zzW();
        }
        zzcbe zzcbeVar = this.zzd;
        zzcbeVar.zzf();
        this.zzb.zze();
        zzcbeVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zze() {
        if (!zzU()) {
            this.zzq = true;
            return;
        }
        if (this.zze.zza) {
            zzac();
        }
        this.zzi.zzE(true);
        this.zzd.zze();
        this.zzb.zzd();
        this.zza.zza();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzK();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzf() {
        if (zzU()) {
            if (this.zze.zza) {
                zzad();
            }
            this.zzi.zzE(false);
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzL();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzg() {
        if (zzU()) {
            return (int) this.zzi.zzH();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzh() {
        if (zzU()) {
            return (int) this.zzi.zzD();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzi(int i) {
        if (zzU()) {
            this.zzi.zzx(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzj(float f, float f3) {
        zzcbb zzcbbVar = this.zzn;
        if (zzcbbVar != null) {
            zzcbbVar.zzf(f, f3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzk() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzl() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final long zzm() {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            return zzcauVar.zzI();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final long zzn() {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            return zzcauVar.zzJ();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final long zzo() {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            return zzcauVar.zzK();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzp() {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            return zzcauVar.zzL();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj, com.google.android.gms.internal.ads.zzcbg
    public final void zzq() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzr(final boolean z4, final long j) {
        if (this.zzc != null) {
            zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzQ(z4, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzs(int i) {
        if (this.zzm != i) {
            this.zzm = i;
            if (i == 3) {
                zzY();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.zze.zza) {
                zzad();
            }
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzI();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzt(int i, int i4) {
        this.zzr = i;
        this.zzs = i4;
        zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzu(String str, Exception exc) {
        final String strZzZ = zzZ(str, exc);
        String strConcat = "ExoPlayerAdapter error: ".concat(strZzZ);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        this.zzl = true;
        if (this.zze.zza) {
            zzad();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzJ(strZzZ);
            }
        });
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzv(String str, Exception exc) {
        final String strZzZ = zzZ("onLoadException", exc);
        String strConcat = "ExoPlayerAdapter exception: ".concat(strZzZ);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzR(strZzZ);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    @Nullable
    public final Integer zzw() {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            return zzcauVar.zzj();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzx(@Nullable String str, @Nullable String[] strArr, @Nullable Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzk = new String[]{str};
        } else {
            this.zzk = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzj;
        boolean z4 = false;
        if (this.zze.zzk && str2 != null && !str.equals(str2) && this.zzm == 4) {
            z4 = true;
        }
        this.zzj = str;
        zzV(z4, num);
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzy(int i) {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            zzcauVar.zzF(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzz(int i) {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            zzcauVar.zzG(i);
        }
    }
}
