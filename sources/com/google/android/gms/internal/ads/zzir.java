package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzir implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzabm, zzpv, zzwt, zztn, zzhk, zzlx {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzjs zza;

    public /* synthetic */ zzir(zzjs zzjsVar, byte[] bArr) {
        Objects.requireNonNull(zzjsVar);
        this.zza = zzjsVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i4) {
        zzjs zzjsVar = this.zza;
        zzjsVar.zzO(surfaceTexture);
        zzjsVar.zzQ(i, i4);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzjs zzjsVar = this.zza;
        zzjsVar.zzP(null);
        zzjsVar.zzQ(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i4) {
        this.zza.zzQ(i, i4);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i4, int i6) {
        this.zza.zzQ(i4, i6);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzQ(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zza(zzhr zzhrVar) {
        this.zza.zzS().zzN(zzhrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzb(String str, long j, long j6) {
        this.zza.zzS().zzO(str, j, j6);
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzc(zzu zzuVar, @Nullable zzhs zzhsVar) {
        this.zza.zzS().zzP(zzuVar, zzhsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzd(int i, long j) {
        this.zza.zzS().zzQ(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zze(final zzbu zzbuVar) {
        zzdm zzdmVar = new zzdm() { // from class: com.google.android.gms.internal.ads.zzip
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                ((zzay) obj).zzt(zzbuVar);
            }
        };
        zzdr zzdrVarZzR = this.zza.zzR();
        zzdrVarZzR.zzd(25, zzdmVar);
        zzdrVarZzR.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzf(Object obj, long j) {
        zzjs zzjsVar = this.zza;
        zzjsVar.zzS().zzT(obj, j);
        if (zzjsVar.zzU() == obj) {
            zzdr zzdrVarZzR = zzjsVar.zzR();
            zzdrVarZzR.zzd(26, zziq.zza);
            zzdrVarZzR.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzg(String str) {
        this.zza.zzS().zzR(str);
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzh(zzhr zzhrVar) {
        this.zza.zzS().zzS(zzhrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzi(long j, int i) {
        this.zza.zzS().zzU(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final void zzj(Exception exc) {
        this.zza.zzS().zzV(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzk(zzhr zzhrVar) {
        this.zza.zzS().zzC(zzhrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzl(String str, long j, long j6) {
        this.zza.zzS().zzD(str, j, j6);
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzm(zzu zzuVar, @Nullable zzhs zzhsVar) {
        this.zza.zzS().zzE(zzuVar, zzhsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzn(long j) {
        this.zza.zzS().zzF(j);
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzo(int i, long j, long j6) {
        this.zza.zzS().zzG(i, j, j6);
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzp(String str) {
        this.zza.zzS().zzH(str);
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzq(zzhr zzhrVar) {
        this.zza.zzS().zzI(zzhrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzr(final boolean z4) {
        zzjs zzjsVar = this.zza;
        if (zzjsVar.zzV() == z4) {
            return;
        }
        zzjsVar.zzW(z4);
        zzdr zzdrVarZzR = zzjsVar.zzR();
        zzdrVarZzR.zzd(23, new zzdm() { // from class: com.google.android.gms.internal.ads.zzim
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                ((zzay) obj).zzs(z4);
            }
        });
        zzdrVarZzR.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzs(Exception exc) {
        this.zza.zzS().zzJ(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzt(Exception exc) {
        this.zza.zzS().zzK(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzu(zzpw zzpwVar) {
        this.zza.zzS().zzL(zzpwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzv(zzpw zzpwVar) {
        this.zza.zzS().zzM(zzpwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzw(final int i) {
        this.zza.zzT().zza(new zzggr() { // from class: com.google.android.gms.internal.ads.zzin
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                return Integer.valueOf(i);
            }
        }, new zzggr() { // from class: com.google.android.gms.internal.ads.zzio
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                return Integer.valueOf(i);
            }
        });
    }
}
