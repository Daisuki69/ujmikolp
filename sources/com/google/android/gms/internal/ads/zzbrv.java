package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.common.util.CollectionUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbrv extends zzbsb {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcek zzj;
    private final Activity zzk;
    private zzcgt zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbsc zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        CollectionUtils.setOf("top-left", "top-right", "top-center", TtmlNode.CENTER, "bottom-left", "bottom-right", "bottom-center");
    }

    public zzbrv(zzcek zzcekVar, zzbsc zzbscVar) {
        super(zzcekVar, "resize");
        this.zza = "top-right";
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcekVar;
        this.zzk = zzcekVar.zzj();
        this.zzo = zzbscVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzf(boolean z4) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlF)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlG)).booleanValue()) {
            View view = (View) this.zzj;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlH)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.zzr;
                    zzcek zzcekVar = this.zzj;
                    viewGroup2.addView((View) zzcekVar);
                    zzcekVar.zzaf(this.zzl);
                } catch (IllegalStateException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to add webview back to view hierarchy.", e);
                }
            } else {
                ViewGroup viewGroup3 = this.zzr;
                zzcek zzcekVar2 = this.zzj;
                viewGroup3.addView((View) zzcekVar2);
                zzcekVar2.zzaf(this.zzl);
            }
        }
        if (z4) {
            zzk("default");
            zzbsc zzbscVar = this.zzo;
            if (zzbscVar != null) {
                zzbscVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019b A[PHI: r18
  0x019b: PHI (r18v12 int) = (r18v5 int), (r18v6 int), (r18v7 int), (r18v8 int), (r18v9 int), (r18v10 int), (r18v13 int) binds: [B:85:0x0197, B:82:0x018a, B:79:0x017e, B:76:0x0172, B:73:0x0166, B:70:0x015a, B:68:0x014f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(java.util.Map r20) {
        /*
            Method dump skipped, instruction units count: 1216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbrv.zza(java.util.Map):void");
    }

    public final void zzb(final boolean z4) {
        synchronized (this.zzi) {
            try {
                if (this.zzp != null) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlE)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        zzf(z4);
                    } else {
                        zzbzh.zzf.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbru
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzf(z4);
                            }
                        });
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzc(int i, int i4, boolean z4) {
        synchronized (this.zzi) {
            this.zzc = i;
            this.zzd = i4;
        }
    }

    public final boolean zzd() {
        boolean z4;
        synchronized (this.zzi) {
            z4 = this.zzp != null;
        }
        return z4;
    }

    public final void zze(int i, int i4) {
        this.zzc = i;
        this.zzd = i4;
    }
}
