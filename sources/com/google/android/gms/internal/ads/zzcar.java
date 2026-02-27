package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.internal.Preconditions;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.iY9fr2.dLgao9;
import dOYHB6.lN8Dz0.yf3D09;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import mx_android.support.v7.media.MediaRouteProviderProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcar extends FrameLayout implements zzcai {

    @VisibleForTesting
    final zzcbf zza;
    private final zzcbd zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbcx zze;
    private final long zzf;

    @Nullable
    private final zzcaj zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcar(Context context, zzcbd zzcbdVar, int i, boolean z4, zzbcx zzbcxVar, zzcbc zzcbcVar, @Nullable zzdsm zzdsmVar) {
        zzcaj zzcahVar;
        zzbcx zzbcxVar2;
        zzcaj zzcdzVar;
        super(context);
        this.zzb = zzcbdVar;
        this.zze = zzbcxVar;
        yf3D09 yf3d09 = new yf3D09(context);
        this.zzc = yf3d09;
        addView(yf3d09, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzcbdVar.zzk());
        zzcak zzcakVar = zzcbdVar.zzk().zza;
        zzcbe zzcbeVar = new zzcbe(context, zzcbdVar.zzs(), zzcbdVar.zzm(), zzbcxVar, zzcbdVar.zzi());
        if (i == 3) {
            zzcdzVar = new zzcdz(context, zzcbeVar);
            zzbcxVar2 = zzbcxVar;
        } else {
            if (i == 2) {
                zzcahVar = new zzcbv(context, zzcbeVar, zzcbdVar, z4, zzcak.zza(zzcbdVar), zzcbcVar, zzdsmVar);
                zzbcxVar2 = zzbcxVar;
            } else {
                zzbcxVar2 = zzbcxVar;
                zzcahVar = new zzcah(context, zzcbdVar, z4, zzcak.zza(zzcbdVar), zzcbcVar, new zzcbe(context, zzcbdVar.zzs(), zzcbdVar.zzm(), zzbcxVar, zzcbdVar.zzi()), zzdsmVar);
            }
            zzcdzVar = zzcahVar;
        }
        this.zzg = zzcdzVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        yf3d09.addView(zzcdzVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzY)).booleanValue()) {
            yf3d09.addView(view, new FrameLayout.LayoutParams(-1, -1));
            yf3d09.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzV)).booleanValue()) {
            zzD();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaa)).longValue();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzX)).booleanValue();
        this.zzk = zBooleanValue;
        if (zzbcxVar2 != null) {
            zzbcxVar2.zzd("spinner_used", true != zBooleanValue ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        this.zza = new zzcbf(this);
        zzcdzVar.zzb(this);
    }

    private final boolean zzJ() {
        return this.zzq.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzK, reason: merged with bridge method [inline-methods] */
    public final void zzI(String str, String... strArr) {
        HashMap map = new HashMap();
        Integer numZzl = zzl();
        if (numZzl != null) {
            map.put("playerId", numZzl.toString());
        }
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zze("onVideoEvent", map);
    }

    private final void zzL() {
        zzcbd zzcbdVar = this.zzb;
        if (zzcbdVar.zzj() == null || !this.zzi || this.zzj) {
            return;
        }
        dLgao9.oVike1(zzcbdVar.zzj().getWindow(), 128);
        this.zzi = false;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzcaj zzcajVar = this.zzg;
            if (zzcajVar != null) {
                zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcao
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzcajVar.zzd();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z4) {
        super.onWindowFocusChanged(z4);
        if (z4) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcaq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG(z4);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcai
    public final void onWindowVisibilityChanged(int i) {
        boolean z4;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.zza.zzb();
            z4 = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z4 = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcan(this, z4));
    }

    public final void zzA(int i) {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        zzcajVar.zzB(i);
    }

    public final void zzB(int i) {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        zzcajVar.zzC(i);
    }

    public final void zzC(MotionEvent motionEvent) {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        zzcajVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzD() {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        TextView textView = new TextView(zzcajVar.getContext());
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        textView.setText(String.valueOf(resourcesZzf == null ? "AdMob - " : resourcesZzf.getString(R.string.watermark_label_prefix)).concat(zzcajVar.zza()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout frameLayout = this.zzc;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.bringChildToFront(textView);
    }

    public final void zzE() {
        this.zza.zza();
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar != null) {
            zzcajVar.zzd();
        }
        zzL();
    }

    public final void zzF() {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        long jZzh = zzcajVar.zzh();
        if (this.zzl == jZzh || jZzh <= 0) {
            return;
        }
        float f = jZzh / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcd)).booleanValue()) {
            zzI("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(zzcajVar.zzo()), "qoeCachedBytes", String.valueOf(zzcajVar.zzn()), "qoeLoadedBytes", String.valueOf(zzcajVar.zzm()), "droppedFrames", String.valueOf(zzcajVar.zzp()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
        } else {
            zzI("timeupdate", "time", String.valueOf(f));
        }
        this.zzl = jZzh;
    }

    public final /* synthetic */ void zzG(boolean z4) {
        zzI("windowFocusChanged", "hasWindowFocus", String.valueOf(z4));
    }

    public final /* synthetic */ void zzH() {
        zzI("firstFrameRendered", new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zza() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcal(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzb() {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar != null && this.zzm == 0) {
            zzI("canplaythrough", "duration", String.valueOf(zzcajVar.zzg() / 1000.0f), "videoWidth", String.valueOf(zzcajVar.zzk()), "videoHeight", String.valueOf(zzcajVar.zzl()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcf)).booleanValue()) {
            this.zza.zzb();
        }
        zzcbd zzcbdVar = this.zzb;
        if (zzcbdVar.zzj() != null && !this.zzi) {
            boolean z4 = (zzcbdVar.zzj().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z4;
            if (!z4) {
                zzcbdVar.zzj().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzd() {
        zzI("pause", new String[0]);
        zzL();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcf)).booleanValue()) {
            this.zza.zza();
        }
        zzI("ended", new String[0]);
        zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzf(String str, @Nullable String str2) {
        zzI(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzg(String str, @Nullable String str2) {
        zzI(Constants.EXCEPTION, "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzh() {
        if (this.zzr && this.zzp != null && !zzJ()) {
            ImageView imageView = this.zzq;
            imageView.setImageBitmap(this.zzp);
            imageView.invalidate();
            FrameLayout frameLayout = this.zzc;
            frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(imageView);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcam(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzi() {
        if (this.zzh && zzJ()) {
            this.zzc.removeView(this.zzq);
        }
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null || this.zzp == null) {
            return;
        }
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        if (zzcajVar.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 26);
            sb2.append("Spinner frame grab took ");
            sb2.append(jElapsedRealtime2);
            sb2.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        }
        if (jElapsedRealtime2 > this.zzf) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbcx zzbcxVar = this.zze;
            if (zzbcxVar != null) {
                zzbcxVar.zzd("spinner_jank", Long.toString(jElapsedRealtime2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzj(int i, int i4) {
        if (this.zzk) {
            zzbbz zzbbzVar = zzbci.zzZ;
            int iMax = Math.max(i / ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).intValue(), 1);
            int iMax2 = Math.max(i4 / ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == iMax && this.zzp.getHeight() == iMax2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzk() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcap
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzH();
            }
        });
    }

    @Nullable
    public final Integer zzl() {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar != null) {
            return zzcajVar.zzw();
        }
        return null;
    }

    public final void zzm(int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzY)).booleanValue()) {
            this.zzc.setBackgroundColor(i);
            this.zzd.setBackgroundColor(i);
        }
    }

    public final void zzn(int i, int i4, int i6, int i10) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            int length = String.valueOf(i).length();
            StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(i4).length() + 3 + String.valueOf(i6).length() + 3 + String.valueOf(i10).length());
            androidx.media3.datasource.cache.c.y(sb2, "Set video bounds to x:", i, ";y:", i4);
            sb2.append(";w:");
            sb2.append(i6);
            sb2.append(";h:");
            sb2.append(i10);
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        }
        if (i6 == 0 || i10 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i10);
        layoutParams.setMargins(i, i4, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzo(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzp(float f, float f3) {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar != null) {
            zzcajVar.zzj(f, f3);
        }
    }

    public final void zzq(Integer num) {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzI("no_src", new String[0]);
        } else {
            zzcajVar.zzx(this.zzn, this.zzo, num);
        }
    }

    public final void zzr() {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        zzcajVar.zzf();
    }

    public final void zzs() {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        zzcajVar.zze();
    }

    public final void zzt(int i) {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        zzcajVar.zzi(i);
    }

    public final void zzu() {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        zzcajVar.zzb.zza(true);
        zzcajVar.zzq();
    }

    public final void zzv() {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        zzcajVar.zzb.zza(false);
        zzcajVar.zzq();
    }

    public final void zzw(float f) {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        zzcajVar.zzb.zzb(f);
        zzcajVar.zzq();
    }

    public final void zzx(int i) {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        zzcajVar.zzy(i);
    }

    public final void zzy(int i) {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        zzcajVar.zzz(i);
    }

    public final void zzz(int i) {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        zzcajVar.zzA(i);
    }
}
