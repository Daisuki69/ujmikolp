package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
final class zzlz implements Handler.Callback, zzay {
    private final zzba zza;
    private final zzlx zzb;
    private final zzbc zzc = new zzbc();
    private final zzdl zzd;
    private final zzly zze;

    public zzlz(zzba zzbaVar, zzlx zzlxVar, zzdb zzdbVar, int i) {
        this.zza = zzbaVar;
        this.zzb = zzlxVar;
        this.zzd = zzdbVar.zzd(zzbaVar.zzc(), this);
        this.zze = new zzly(this, i);
        zzbaVar.zzd(this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        this.zze.zza();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zza(zzba zzbaVar, zzax zzaxVar) {
        this.zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final /* synthetic */ void zzb(zzbe zzbeVar, int i) {
        AbstractC1175i.b(this, zzbeVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final /* synthetic */ void zzc(zzaj zzajVar, int i) {
        AbstractC1175i.c(this, zzajVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final /* synthetic */ void zzd(zzbm zzbmVar) {
        AbstractC1175i.d(this, zzbmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final /* synthetic */ void zze(zzam zzamVar) {
        AbstractC1175i.e(this, zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final /* synthetic */ void zzf(boolean z4) {
        AbstractC1175i.f(this, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final /* synthetic */ void zzg(zzaw zzawVar) {
        AbstractC1175i.g(this, zzawVar);
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final /* synthetic */ void zzh(boolean z4, int i) {
        AbstractC1175i.h(this, z4, i);
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final /* synthetic */ void zzi(int i) {
        AbstractC1175i.i(this, i);
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final /* synthetic */ void zzj(boolean z4, int i) {
        AbstractC1175i.j(this, z4, i);
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final /* synthetic */ void zzk(int i) {
        AbstractC1175i.k(this, i);
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final /* synthetic */ void zzl(boolean z4) {
        AbstractC1175i.l(this, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final /* synthetic */ void zzm(zzat zzatVar) {
        AbstractC1175i.m(this, zzatVar);
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final /* synthetic */ void zzn(zzat zzatVar) {
        AbstractC1175i.n(this, zzatVar);
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final /* synthetic */ void zzo(zzaz zzazVar, zzaz zzazVar2, int i) {
        AbstractC1175i.o(this, zzazVar, zzazVar2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final /* synthetic */ void zzp(zzau zzauVar) {
        AbstractC1175i.p(this, zzauVar);
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final /* synthetic */ void zzq(int i) {
        AbstractC1175i.q(this, i);
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final /* synthetic */ void zzr(float f) {
        AbstractC1175i.r(this, f);
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final /* synthetic */ void zzs(boolean z4) {
        AbstractC1175i.s(this, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final /* synthetic */ void zzt(zzbu zzbuVar) {
        AbstractC1175i.t(this, zzbuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final /* synthetic */ void zzu(int i, int i4) {
        AbstractC1175i.u(this, i, i4);
    }

    public final void zzv() {
        this.zzd.zzl(null);
        this.zza.zze(this);
    }

    public final /* synthetic */ zzba zzw() {
        return this.zza;
    }

    public final /* synthetic */ zzlx zzx() {
        return this.zzb;
    }

    public final /* synthetic */ zzbc zzy() {
        return this.zzc;
    }

    public final /* synthetic */ zzdl zzz() {
        return this.zzd;
    }
}
