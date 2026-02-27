package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdip extends zzcqs {
    public static final zzgjz zzc = zzgjz.zzn("3010", "3008", "1005", "1009", "2011", "2007");
    private final List zzA;
    private final Executor zzd;
    private final zzdiu zze;
    private final zzdjc zzf;
    private final zzdjt zzg;
    private final zzdiz zzh;
    private final zzdje zzi;
    private final zzhpr zzj;
    private final zzhpr zzk;
    private final zzhpr zzl;
    private final zzhpr zzm;
    private final zzhpr zzn;

    @Nullable
    private zzdkr zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private final zzbxo zzt;
    private final zzauu zzu;
    private final VersionInfoParcel zzv;
    private final Context zzw;
    private final zzdir zzx;
    private final zzell zzy;
    private final Map zzz;

    public zzdip(zzcqr zzcqrVar, Executor executor, zzdiu zzdiuVar, zzdjc zzdjcVar, zzdjt zzdjtVar, zzdiz zzdizVar, zzdje zzdjeVar, zzhpr zzhprVar, zzhpr zzhprVar2, zzhpr zzhprVar3, zzhpr zzhprVar4, zzhpr zzhprVar5, zzbxo zzbxoVar, zzauu zzauuVar, VersionInfoParcel versionInfoParcel, Context context, zzdir zzdirVar, zzell zzellVar, zzayl zzaylVar) {
        super(zzcqrVar);
        this.zzd = executor;
        this.zze = zzdiuVar;
        this.zzf = zzdjcVar;
        this.zzg = zzdjtVar;
        this.zzh = zzdizVar;
        this.zzi = zzdjeVar;
        this.zzj = zzhprVar;
        this.zzk = zzhprVar2;
        this.zzl = zzhprVar3;
        this.zzm = zzhprVar4;
        this.zzn = zzhprVar5;
        this.zzt = zzbxoVar;
        this.zzu = zzauuVar;
        this.zzv = versionInfoParcel;
        this.zzw = context;
        this.zzx = zzdirVar;
        this.zzy = zzellVar;
        this.zzz = new HashMap();
        this.zzA = new ArrayList();
    }

    public static boolean zzI(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlt)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        long jZzA = com.google.android.gms.ads.internal.util.zzs.zzA(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            if (jZzA >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlu)).intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzac, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzU(zzdkr zzdkrVar) {
        Iterator<String> itKeys;
        View view;
        zzaup zzaupVarZzb;
        try {
            if (!this.zzp) {
                this.zzo = zzdkrVar;
                this.zzg.zza(zzdkrVar);
                this.zzf.zza(zzdkrVar.zzdJ(), zzdkrVar.zzk(), zzdkrVar.zzl(), zzdkrVar, zzdkrVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcV)).booleanValue() && (zzaupVarZzb = this.zzu.zzb()) != null) {
                    zzaupVarZzb.zzh(zzdkrVar.zzdJ());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbX)).booleanValue()) {
                    zzfcj zzfcjVar = this.zzb;
                    if (zzfcjVar.zzak && (itKeys = zzfcjVar.zzaj.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            zzdkr zzdkrVar2 = this.zzo;
                            WeakReference weakReference = zzdkrVar2 == null ? null : (WeakReference) zzdkrVar2.zzj().get(next);
                            this.zzz.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                zzayk zzaykVar = new zzayk(this.zzw, view);
                                this.zzA.add(zzaykVar);
                                zzaykVar.zza(new zzdie(this, next));
                            }
                        }
                    }
                }
                if (zzdkrVar.zzh() != null) {
                    zzdkrVar.zzh().zza(this.zzt);
                }
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzad, reason: merged with bridge method [inline-methods] */
    public final void zzV(zzdkr zzdkrVar) {
        this.zzf.zzb(zzdkrVar.zzdJ(), zzdkrVar.zzj());
        if (zzdkrVar.zzdF() != null) {
            zzdkrVar.zzdF().setClickable(false);
            zzdkrVar.zzdF().removeAllViews();
        }
        if (zzdkrVar.zzh() != null) {
            zzdkrVar.zzh().zzb(this.zzt);
        }
        this.zzo = null;
    }

    private final synchronized void zzae(View view, Map map, Map map2) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzw(view, map, map2, zzah());
        this.zzq = true;
    }

    private final synchronized void zzaf(View view, Map map, Map map2) {
        View viewZzag;
        if (!this.zzr && (viewZzag = zzag(map)) != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzon)).booleanValue()) {
                Rect rect = new Rect();
                if (viewZzag.getGlobalVisibleRect(rect, new Point()) && viewZzag.getHeight() == rect.height() && viewZzag.getWidth() == rect.width()) {
                    this.zzf.zzx(view, map, map2, zzah());
                    this.zzr = true;
                }
            } else if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoo)).booleanValue()) {
                zzbbz zzbbzVar = zzbci.zzop;
                if (((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).floatValue() > AudioStats.AUDIO_AMPLITUDE_NONE) {
                    double dFloatValue = ((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).floatValue();
                    if (viewZzag.getGlobalVisibleRect(new Rect(), new Point())) {
                        if (r1.height() * r1.width() >= ((double) (viewZzag.getHeight() * viewZzag.getWidth())) * (dFloatValue / 100.0d)) {
                            this.zzf.zzx(view, map, map2, zzah());
                            this.zzr = true;
                        }
                    }
                }
            } else if (zzI(viewZzag)) {
                this.zzf.zzx(view, map, map2, zzah());
                this.zzr = true;
            }
        }
    }

    @Nullable
    private final synchronized View zzag(Map map) {
        if (map != null) {
            zzgjz zzgjzVar = zzc;
            int size = zzgjzVar.size();
            int i = 0;
            while (i < size) {
                WeakReference weakReference = (WeakReference) map.get((String) zzgjzVar.get(i));
                i++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    @Nullable
    private final synchronized ImageView.ScaleType zzah() {
        zzdkr zzdkrVar = this.zzo;
        if (zzdkrVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper iObjectWrapperZzo = zzdkrVar.zzo();
        if (iObjectWrapperZzo != null) {
            return (ImageView.ScaleType) ObjectWrapper.unwrap(iObjectWrapperZzo);
        }
        return zzdjt.zza;
    }

    private final void zzai(String str, boolean z4) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfQ)).booleanValue()) {
            zzL("Google", true);
            return;
        }
        S1.y yVarZzX = this.zze.zzX();
        if (yVarZzX == null) {
            return;
        }
        zzgot.zzq(yVarZzX, new zzdif(this, "Google", true), this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaj, reason: merged with bridge method [inline-methods] */
    public final void zzY(View view, @Nullable zzedu zzeduVar) {
        zzcek zzcekVarZzW = this.zze.zzW();
        if (!this.zzh.zzd() || zzeduVar == null || zzcekVarZzW == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzh(zzeduVar.zza(), view);
    }

    public final synchronized void zzA(@Nullable com.google.android.gms.ads.internal.client.zzdj zzdjVar) {
        this.zzf.zzr(zzdjVar);
    }

    public final synchronized void zzB(com.google.android.gms.ads.internal.client.zzdf zzdfVar) {
        this.zzf.zzs(zzdfVar);
    }

    public final synchronized void zzC() {
        this.zzf.zzg();
    }

    public final synchronized void zzD() {
        zzdkr zzdkrVar = this.zzo;
        if (zzdkrVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z4 = zzdkrVar instanceof zzdjn;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdik
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzW(z4);
                }
            });
        }
    }

    public final synchronized void zzE(@Nullable final View view, final int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmp)).booleanValue()) {
            zzdkr zzdkrVar = this.zzo;
            if (zzdkrVar == null) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z4 = zzdkrVar instanceof zzdjn;
                this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdil
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzX(view, z4, i);
                    }
                });
            }
        }
    }

    public final synchronized boolean zzF() {
        return this.zzf.zzh();
    }

    public final synchronized int zzG() {
        return this.zzf.zzu();
    }

    public final synchronized boolean zzH() {
        return this.zzf.zzv();
    }

    public final boolean zzJ() {
        return this.zzh.zzc();
    }

    public final String zzK() {
        return this.zzh.zzf();
    }

    @Nullable
    public final zzedu zzL(String str, boolean z4) {
        boolean z5;
        String str2;
        zzedq zzedqVar;
        zzedr zzedrVar;
        zzdiz zzdizVar = this.zzh;
        if (zzdizVar.zzd() && !TextUtils.isEmpty(str)) {
            zzdiu zzdiuVar = this.zze;
            zzcek zzcekVarZzW = zzdiuVar.zzW();
            zzcek zzcekVarZzT = zzdiuVar.zzT();
            if (zzcekVarZzW == null && zzcekVarZzT == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            zzdizVar.zzg();
            int iZzc = zzdizVar.zzg().zzc();
            int i4 = iZzc - 1;
            boolean z8 = false;
            if (i4 != 0) {
                if (i4 != 1) {
                    String str3 = iZzc != 1 ? iZzc != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO";
                    String strQ = We.s.q(new StringBuilder(str3.length() + 49), "Unknown omid media type: ", str3, ". Not initializing Omid.");
                    int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(strQ);
                    return null;
                }
                if (zzcekVarZzW == null) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid media type was display but there was no display webview.");
                    return null;
                }
                z5 = false;
                z8 = true;
            } else if (zzcekVarZzT != null) {
                z5 = true;
            } else {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid media type was video but there was no video webview.");
            }
            if (z8) {
                str2 = null;
            } else {
                str2 = "javascript";
                zzcekVarZzW = zzcekVarZzT;
            }
            if (zzcekVarZzW == null) {
                int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Webview is null in InternalNativeAd");
                return null;
            }
            if (!com.google.android.gms.ads.internal.zzt.zzu().zza(this.zzw)) {
                int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            VersionInfoParcel versionInfoParcel = this.zzv;
            int i14 = versionInfoParcel.buddyApkVersion;
            int i15 = versionInfoParcel.clientJarVersion;
            StringBuilder sb2 = new StringBuilder(androidx.media3.datasource.cache.c.a(i14, 1) + String.valueOf(i15).length());
            sb2.append(i14);
            sb2.append(".");
            sb2.append(i15);
            String string = sb2.toString();
            if (z5) {
                zzedqVar = zzedq.VIDEO;
                zzedrVar = zzedr.DEFINED_BY_JAVASCRIPT;
            } else {
                zzedqVar = zzedq.NATIVE_DISPLAY;
                zzedrVar = zzdiuVar.zzx() == 3 ? zzedr.UNSPECIFIED : zzedr.ONE_PIXEL;
            }
            zzedu zzeduVarZzd = com.google.android.gms.ads.internal.zzt.zzu().zzd(string, zzcekVarZzW.zzD(), "", "javascript", str2, str, zzedrVar, zzedqVar, this.zzb.zzal);
            if (zzeduVarZzd == null) {
                int i16 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to create omid session in InternalNativeAd");
                return null;
            }
            zzdiuVar.zzq(zzeduVarZzd);
            zzcekVarZzW.zzak(zzeduVarZzd);
            if (z5) {
                zzflj zzfljVarZza = zzeduVarZzd.zza();
                if (zzcekVarZzT != null) {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(zzfljVarZza, zzcekVarZzT.zzE());
                }
                this.zzs = true;
            }
            if (z4) {
                com.google.android.gms.ads.internal.zzt.zzu().zze(zzeduVarZzd.zza());
                zzcekVarZzW.zze("onSdkLoaded", new ArrayMap());
            }
            return zzeduVarZzd;
        }
        return null;
    }

    public final boolean zzM() {
        return this.zzh.zzd();
    }

    public final void zzN(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfQ)).booleanValue()) {
            zzdiu zzdiuVar = this.zze;
            if (zzdiuVar.zzx() != 3) {
                zzbzm zzbzmVarZzY = zzdiuVar.zzY();
                if (zzbzmVarZzY == null) {
                    return;
                }
                zzgot.zzq(zzbzmVarZzY, new zzdig(this, view), this.zzd);
                return;
            }
        }
        zzY(view, this.zze.zzZ());
    }

    public final void zzO(View view) {
        zzedu zzeduVarZzZ = this.zze.zzZ();
        if (!this.zzh.zzd() || zzeduVarZzZ == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzg(zzeduVarZzZ.zza(), view);
    }

    public final zzdir zzP() {
        return this.zzx;
    }

    public final synchronized void zzQ(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        this.zzy.zza(zzdtVar);
    }

    public final void zzR(Bundle bundle) {
        final zzcek zzcekVarZzT = this.zze.zzT();
        if (zzcekVarZzT == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Video webview is null");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdim
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgjz zzgjzVar = zzdip.zzc;
                    zzcekVarZzT.zzd("onVideoEvent", jSONObject);
                }
            });
        } catch (JSONException e) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error reading event signals", e);
        }
    }

    public final /* synthetic */ void zzS() {
        try {
            zzdiu zzdiuVar = this.zze;
            int iZzx = zzdiuVar.zzx();
            if (iZzx == 1) {
                zzbgx zzbgxVarZza = this.zzi.zza();
                if (zzbgxVarZza != null) {
                    zzai("Google", true);
                    zzbgxVarZza.zze((zzbgn) this.zzj.zzb());
                    return;
                }
                return;
            }
            if (iZzx == 2) {
                zzbgu zzbguVarZzb = this.zzi.zzb();
                if (zzbguVarZzb != null) {
                    zzai("Google", true);
                    zzbguVarZzb.zze((zzbgl) this.zzk.zzb());
                    return;
                }
                return;
            }
            if (iZzx == 3) {
                zzbhd zzbhdVarZzf = this.zzi.zzf(zzdiuVar.zzS());
                if (zzbhdVarZzf != null) {
                    if (zzdiuVar.zzT() != null) {
                        zzL("Google", true);
                    }
                    zzbhdVarZzf.zze((zzbgq) this.zzn.zzb());
                    return;
                }
                return;
            }
            if (iZzx == 6) {
                zzbhk zzbhkVarZzc = this.zzi.zzc();
                if (zzbhkVarZzc != null) {
                    zzai("Google", true);
                    zzbhkVarZzc.zze((zzbhq) this.zzl.zzb());
                    return;
                }
                return;
            }
            if (iZzx != 7) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Wrong native template id!");
            } else {
                zzbmf zzbmfVarZze = this.zzi.zze();
                if (zzbmfVarZze != null) {
                    zzbmfVarZze.zze((zzblz) this.zzm.zzb());
                }
            }
        } catch (RemoteException e) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException when notifyAdLoad is called", e);
        }
    }

    public final /* synthetic */ void zzT() {
        this.zzf.zzA();
        this.zze.zzae();
    }

    public final /* synthetic */ void zzW(boolean z4) {
        zzdkr zzdkrVar = this.zzo;
        if (zzdkrVar != null) {
            this.zzf.zzf(null, zzdkrVar.zzdJ(), this.zzo.zzj(), this.zzo.zzk(), z4, zzah(), 0);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        }
    }

    public final /* synthetic */ void zzX(View view, boolean z4, int i) {
        zzdkr zzdkrVar = this.zzo;
        if (zzdkrVar != null) {
            this.zzf.zzf(view, zzdkrVar.zzdJ(), this.zzo.zzj(), this.zzo.zzk(), z4, zzah(), i);
        } else {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        }
    }

    public final /* synthetic */ zzdiu zzZ() {
        return this.zze;
    }

    public final synchronized void zza(String str) {
        this.zzf.zzd(str);
    }

    public final /* synthetic */ zzdkr zzaa() {
        return this.zzo;
    }

    public final /* synthetic */ Map zzab() {
        return this.zzz;
    }

    public final synchronized void zzb() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzn();
    }

    public final synchronized void zzc(Bundle bundle) {
        this.zzf.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcqs
    public final synchronized void zzd() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdih
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzT();
            }
        });
        super.zzd();
    }

    public final synchronized boolean zze(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zZzz = this.zzf.zzz(bundle);
        this.zzq = zZzz;
        return zZzz;
    }

    public final synchronized void zzf(Bundle bundle) {
        this.zzf.zzk(bundle);
    }

    public final synchronized void zzg(final zzdkr zzdkrVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbV)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdii
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzU(zzdkrVar);
                }
            });
        } else {
            zzU(zzdkrVar);
        }
    }

    public final synchronized void zzh(final zzdkr zzdkrVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbV)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdij
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzV(zzdkrVar);
                }
            });
        } else {
            zzV(zzdkrVar);
        }
    }

    public final synchronized void zzi(View view, View view2, Map map, Map map2, boolean z4) {
        zzcek zzcekVarZzT;
        this.zzg.zzb(this.zzo);
        this.zzf.zzc(view, view2, map, map2, z4, zzah());
        if (this.zzs) {
            zzdiu zzdiuVar = this.zze;
            if (zzdiuVar.zzT() != null && (zzcekVarZzT = zzdiuVar.zzT()) != null) {
                zzcekVarZzT.zze("onSdkAdUserInteractionClick", new ArrayMap());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcqs
    @AnyThread
    public final void zzj() {
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzdin
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzS();
            }
        };
        Executor executor = this.zzd;
        executor.execute(runnable);
        if (this.zze.zzx() != 7) {
            final zzdjc zzdjcVar = this.zzf;
            Objects.requireNonNull(zzdjcVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdio
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdjcVar.zzy();
                }
            });
        }
        super.zzj();
    }

    public final synchronized void zzk(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzj(view, motionEvent, view2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[Catch: all -> 0x000a, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d A[Catch: all -> 0x000a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzu(android.view.View r4, java.util.Map r5, java.util.Map r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzq     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Ld
            r3.zzaf(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        La:
            r4 = move-exception
            goto L95
        Ld:
            com.google.android.gms.internal.ads.zzbbz r0 = com.google.android.gms.internal.ads.zzbci.zzbX     // Catch: java.lang.Throwable -> La
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r1.zzd(r0)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> La
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L48
            com.google.android.gms.internal.ads.zzfcj r0 = r3.zzb     // Catch: java.lang.Throwable -> La
            boolean r0 = r0.zzak     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L48
            java.util.Map r0 = r3.zzz     // Catch: java.lang.Throwable -> La
            java.util.Set r1 = r0.keySet()     // Catch: java.lang.Throwable -> La
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La
        L2f:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> La
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> La
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> La
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r2 != 0) goto L2f
            goto L8b
        L48:
            if (r7 != 0) goto L8d
            com.google.android.gms.internal.ads.zzbbz r7 = com.google.android.gms.internal.ads.zzbci.zzep     // Catch: java.lang.Throwable -> La
            com.google.android.gms.internal.ads.zzbcg r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> La
            java.lang.Object r7 = r0.zzd(r7)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> La
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r7 == 0) goto L8b
            if (r5 == 0) goto L8b
            java.util.Set r7 = r5.entrySet()     // Catch: java.lang.Throwable -> La
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> La
        L66:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> La
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> La
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> La
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L66
            boolean r0 = zzI(r0)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L66
            r3.zzae(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        L8b:
            monitor-exit(r3)
            return
        L8d:
            r3.zzae(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            r3.zzaf(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        L95:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdip.zzu(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized JSONObject zzv(View view, Map map, Map map2) {
        return this.zzf.zzl(view, map, map2, zzah());
    }

    public final synchronized JSONObject zzw(View view, Map map, Map map2) {
        return this.zzf.zzm(view, map, map2, zzah());
    }

    public final synchronized void zzx(View view) {
        this.zzf.zzo(view);
    }

    public final synchronized void zzy(zzbhn zzbhnVar) {
        this.zzf.zzp(zzbhnVar);
    }

    public final synchronized void zzz() {
        this.zzf.zzq();
    }
}
