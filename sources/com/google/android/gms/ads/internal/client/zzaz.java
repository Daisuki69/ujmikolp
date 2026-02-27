package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbtv;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzbwm;
import com.google.android.gms.internal.ads.zzbye;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaz {
    private final zzk zza;
    private final zzi zzb;
    private final zzff zzc;
    private final zzbhs zzd;
    private final zzbst zze;
    private final zzbht zzf;
    private zzbtv zzg;
    private final zzl zzh;

    public zzaz(zzk zzkVar, zzi zziVar, zzff zzffVar, zzbhs zzbhsVar, zzbwm zzbwmVar, zzbst zzbstVar, zzbht zzbhtVar, zzl zzlVar) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzffVar;
        this.zzd = zzbhsVar;
        this.zze = zzbstVar;
        this.zzf = zzbhtVar;
        this.zzh = zzlVar;
    }

    public final zzbx zza(Context context, zzr zzrVar, String str, zzbox zzboxVar) {
        return (zzbx) new zzam(this, context, zzrVar, str, zzboxVar).zzd(context, false);
    }

    public final zzbx zzb(Context context, zzr zzrVar, String str, zzbox zzboxVar) {
        return (zzbx) new zzao(this, context, zzrVar, str, zzboxVar).zzd(context, false);
    }

    public final zzbt zzc(Context context, String str, zzbox zzboxVar) {
        return (zzbt) new zzaq(this, context, str, zzboxVar).zzd(context, false);
    }

    public final zzck zzd(Context context, zzbox zzboxVar) {
        return (zzck) new zzas(this, context, zzboxVar).zzd(context, false);
    }

    public final zzbga zze(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbga) new zzaw(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzbgg zzf(View view, HashMap map, HashMap map2) {
        return (zzbgg) new zzay(this, view, map, map2).zzd(view.getContext(), false);
    }

    public final zzbwa zzg(Context context, String str, zzbox zzboxVar) {
        return (zzbwa) new zzaa(this, context, str, zzboxVar).zzd(context, false);
    }

    @Nullable
    public final zzbsw zzh(Activity activity) {
        zzac zzacVar = new zzac(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("useClientJar flag not found in activity intent extras.");
        }
        return (zzbsw) zzacVar.zzd(activity, booleanExtra);
    }

    @Nullable
    public final zzdw zzi(Context context, zzbox zzboxVar) {
        return (zzdw) new zzae(this, context, zzboxVar).zzd(context, false);
    }

    @Nullable
    public final zzbye zzj(Context context, zzbox zzboxVar) {
        return (zzbye) new zzag(this, context, zzboxVar).zzd(context, false);
    }

    @Nullable
    public final zzbsp zzk(Context context, zzbox zzboxVar) {
        return (zzbsp) new zzai(this, context, zzboxVar).zzd(context, false);
    }

    public final zzbko zzl(Context context, zzbox zzboxVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbko) new zzak(this, context, zzboxVar, onH5AdsEventListener).zzd(context, false);
    }

    public final /* synthetic */ zzk zzn() {
        return this.zza;
    }

    public final /* synthetic */ zzi zzo() {
        return this.zzb;
    }

    public final /* synthetic */ zzff zzp() {
        return this.zzc;
    }

    public final /* synthetic */ zzbhs zzq() {
        return this.zzd;
    }

    public final /* synthetic */ zzbst zzr() {
        return this.zze;
    }

    public final /* synthetic */ zzbht zzs() {
        return this.zzf;
    }

    public final /* synthetic */ zzbtv zzt() {
        return this.zzg;
    }

    public final /* synthetic */ void zzu(zzbtv zzbtvVar) {
        this.zzg = zzbtvVar;
    }

    public final /* synthetic */ zzl zzv() {
        return this.zzh;
    }
}
