package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class zzena implements zzeup {
    private final zzeup zza;
    private final zzfdc zzb;
    private final Context zzc;
    private final zzbyv zzd;

    public zzena(zzepd zzepdVar, zzfdc zzfdcVar, Context context, zzbyv zzbyvVar) {
        this.zza = zzepdVar;
        this.zzb = zzfdcVar;
        this.zzc = context;
        this.zzd = zzbyvVar;
    }

    private final Insets zzd(float f) {
        Window window;
        View decorView;
        WindowInsetsCompat rootWindowInsets;
        if (f == 0.0f) {
            return Insets.NONE;
        }
        Insets insets = Insets.NONE;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowManager windowManager = (WindowManager) this.zzc.getSystemService("window");
            if (windowManager != null) {
                insets = Insets.toCompatInsets(windowManager.getCurrentWindowMetrics().getWindowInsets().getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.navigationBars() | WindowInsets.Type.captionBar()));
            }
        } else {
            Activity activityZzd = com.google.android.gms.ads.internal.zzt.zzg().zzd();
            if (activityZzd != null && (window = activityZzd.getWindow()) != null && (decorView = window.getDecorView()) != null && (rootWindowInsets = ViewCompat.getRootWindowInsets(decorView)) != null) {
                insets = rootWindowInsets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
            }
        }
        return Insets.of((int) Math.ceil(insets.left / f), (int) Math.ceil(insets.top / f), (int) Math.ceil(insets.right / f), (int) Math.ceil(insets.bottom / f));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        return zzgot.zzk(this.zza.zza(), new zzggr() { // from class: com.google.android.gms.internal.ads.zzemz
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((zzeuy) obj);
            }
        }, zzbzh.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 7;
    }

    public final /* synthetic */ zzenb zzc(zzeuy zzeuyVar) {
        String str;
        boolean z4;
        int i;
        String strZzu;
        float f;
        int i4;
        int i6;
        int i10;
        WindowManager windowManager;
        int iWidth;
        int iHeight;
        DisplayMetrics displayMetrics;
        zzfdc zzfdcVar = this.zzb;
        com.google.android.gms.ads.internal.client.zzr zzrVar = zzfdcVar.zzf;
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.zzg;
        if (zzrVarArr != null) {
            str = null;
            z4 = false;
            boolean z5 = false;
            boolean z8 = false;
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                boolean z9 = zzrVar2.zzi;
                if (!z9 && !z5) {
                    str = zzrVar2.zza;
                    z5 = true;
                }
                if (z9) {
                    if (!z8) {
                        z4 = true;
                    }
                    z8 = true;
                }
                if (z5 && z8) {
                    break;
                }
            }
        } else {
            str = zzrVar.zza;
            z4 = zzrVar.zzi;
        }
        Context context = this.zzc;
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            i = 0;
            strZzu = null;
            f = 0.0f;
            i4 = 0;
        } else {
            zzbyv zzbyvVar = this.zzd;
            f = displayMetrics.density;
            i4 = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
            strZzu = zzbyvVar.zzo().zzu();
        }
        Insets insetsZzd = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoe)).booleanValue() || Build.VERSION.SDK_INT < 35) ? null : zzd(f);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzof)).booleanValue() && (i10 = Build.VERSION.SDK_INT) <= 34 && i10 >= 28 && (windowManager = (WindowManager) context.getSystemService("window")) != null) {
            if (i10 >= 30) {
                WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                iWidth = currentWindowMetrics.getBounds().width();
                iHeight = currentWindowMetrics.getBounds().height();
            } else {
                Point point = new Point();
                windowManager.getDefaultDisplay().getRealSize(point);
                iWidth = point.x;
                iHeight = point.y;
            }
            i = iHeight;
            i4 = iWidth;
            insetsZzd = zzd(f);
        }
        int i11 = i;
        StringBuilder sb2 = new StringBuilder();
        if (zzrVarArr != null) {
            boolean z10 = false;
            for (com.google.android.gms.ads.internal.client.zzr zzrVar3 : zzrVarArr) {
                if (zzrVar3.zzi) {
                    z10 = true;
                } else {
                    if (sb2.length() != 0) {
                        sb2.append("|");
                    }
                    int i12 = zzrVar3.zze;
                    if (i12 == -1) {
                        i12 = f != 0.0f ? (int) (zzrVar3.zzf / f) : -1;
                    }
                    sb2.append(i12);
                    sb2.append("x");
                    int i13 = zzrVar3.zzb;
                    if (i13 == -2) {
                        i13 = f != 0.0f ? (int) (zzrVar3.zzc / f) : -2;
                    }
                    sb2.append(i13);
                }
            }
            if (z10) {
                if (sb2.length() != 0) {
                    i6 = 0;
                    sb2.insert(0, "|");
                } else {
                    i6 = 0;
                }
                sb2.insert(i6, "320x50");
            }
        }
        return new zzenb(zzrVar, str, z4, sb2.toString(), f, i4, i11, strZzu, zzfdcVar.zzr, insetsZzd);
    }
}
