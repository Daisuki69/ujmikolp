package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdjt {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzfdc zzc;
    private final zzdiz zzd;
    private final zzdiu zze;

    @Nullable
    private final zzdkh zzf;

    @Nullable
    private final zzdkp zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbfl zzj;
    private final zzdir zzk;

    public zzdjt(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfdc zzfdcVar, zzdiz zzdizVar, zzdiu zzdiuVar, @Nullable zzdkh zzdkhVar, @Nullable zzdkp zzdkpVar, Executor executor, Executor executor2, zzdir zzdirVar) {
        this.zzb = zzgVar;
        this.zzc = zzfdcVar;
        this.zzj = zzfdcVar.zzj;
        this.zzd = zzdizVar;
        this.zze = zzdiuVar;
        this.zzf = zzdkhVar;
        this.zzg = zzdkpVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdirVar;
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean zzi(@NonNull ViewGroup viewGroup, boolean z4) {
        View viewZzJ = z4 ? this.zze.zzJ() : this.zze.zzK();
        if (viewZzJ == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewZzJ.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewZzJ.getParent()).removeView(viewZzJ);
        }
        viewGroup.addView(viewZzJ, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzen)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final void zza(final zzdkr zzdkrVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf(zzdkrVar);
            }
        });
    }

    public final void zzb(@Nullable zzdkr zzdkrVar) {
        zzdkh zzdkhVar;
        if (zzdkrVar == null || (zzdkhVar = this.zzf) == null || zzdkrVar.zzdF() == null || !this.zzd.zzb()) {
            return;
        }
        try {
            zzdkrVar.zzdF().addView(zzdkhVar.zza());
        } catch (zzcez e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzc(@Nullable zzdkr zzdkrVar) {
        if (zzdkrVar == null) {
            return;
        }
        Context context = zzdkrVar.zzdJ().getContext();
        if (com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Activity context is needed for policy validator.");
                return;
            }
            zzdkp zzdkpVar = this.zzg;
            if (zzdkpVar == null || zzdkrVar.zzdF() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(zzdkpVar.zza(zzdkrVar.zzdF(), windowManager), com.google.android.gms.ads.internal.util.zzbs.zzk());
            } catch (zzcez e) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final boolean zzd(@NonNull ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }

    public final boolean zze(@NonNull ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzdkr r11) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdjt.zzf(com.google.android.gms.internal.ads.zzdkr):void");
    }

    public final /* synthetic */ void zzg(ViewGroup viewGroup) {
        zzdiu zzdiuVar = this.zze;
        if (zzdiuVar.zzJ() != null) {
            boolean z4 = viewGroup != null;
            if (zzdiuVar.zzx() == 2 || zzdiuVar.zzx() == 1) {
                this.zzb.zzr(this.zzc.zzg, String.valueOf(zzdiuVar.zzx()), z4);
            } else if (zzdiuVar.zzx() == 6) {
                com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
                String str = this.zzc.zzg;
                zzgVar.zzr(str, ExifInterface.GPS_MEASUREMENT_2D, z4);
                zzgVar.zzr(str, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, z4);
            }
        }
    }
}
