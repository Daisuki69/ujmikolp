package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.PlatformVersion;
import dOYHB6.lN8Dz0.yf3D09;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdpm {

    @Nullable
    private Context zza;

    @Nullable
    private PopupWindow zzb;

    public final void zza(Context context, View view) {
        PopupWindow popupWindow;
        if (!PlatformVersion.isAtLeastKitKat() || PlatformVersion.isAtLeastLollipop()) {
            return;
        }
        Window window = context instanceof Activity ? ((Activity) context).getWindow() : null;
        if (window == null || window.getDecorView() == null || ((Activity) context).isDestroyed()) {
            popupWindow = null;
        } else {
            yf3D09 yf3d09 = new yf3D09(context);
            yf3d09.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            yf3d09.addView(view, -1, -1);
            popupWindow = new PopupWindow((View) yf3d09, 1, 1, false);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setClippingEnabled(false);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Displaying the 1x1 popup off the screen.");
            try {
                popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
            } catch (Exception unused) {
                popupWindow = null;
            }
        }
        this.zzb = popupWindow;
        if (popupWindow == null) {
            context = null;
        }
        this.zza = context;
    }

    public final void zzb() {
        PopupWindow popupWindow;
        Context context = this.zza;
        if (context == null || this.zzb == null) {
            return;
        }
        if ((!(context instanceof Activity) || !((Activity) context).isDestroyed()) && (popupWindow = this.zzb) != null && popupWindow.isShowing()) {
            this.zzb.dismiss();
        }
        this.zza = null;
        this.zzb = null;
    }
}
