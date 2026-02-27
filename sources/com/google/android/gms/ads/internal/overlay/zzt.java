package com.google.android.gms.ads.internal.overlay;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbci;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;

/* JADX INFO: loaded from: classes2.dex */
public final class zzt extends FrameLayout implements View.OnClickListener {
    private final ImageButton zza;
    private final zzag zzb;

    public zzt(Context context, zzs zzsVar, @Nullable zzag zzagVar) {
        super(context);
        this.zzb = zzagVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zza = imageButton;
        zzc();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzbb.zza();
        int iZzC = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, zzsVar.zza);
        zzbb.zza();
        int iZzC2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, 0);
        zzbb.zza();
        int iZzC3 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, zzsVar.zzb);
        zzbb.zza();
        imageButton.setPadding(iZzC, iZzC2, iZzC3, com.google.android.gms.ads.internal.util.client.zzf.zzC(context, zzsVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzbb.zza();
        int iZzC4 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, zzsVar.zzd + zzsVar.zza + zzsVar.zzb);
        zzbb.zza();
        addView(imageButton, new FrameLayout.LayoutParams(iZzC4, com.google.android.gms.ads.internal.util.client.zzf.zzC(context, zzsVar.zzd + zzsVar.zzc), 17));
        long jLongValue = ((Long) zzbd.zzc().zzd(zzbci.zzbq)).longValue();
        if (jLongValue <= 0) {
            return;
        }
        zzr zzrVar = ((Boolean) zzbd.zzc().zzd(zzbci.zzbr)).booleanValue() ? new zzr(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(jLongValue).setListener(zzrVar);
    }

    private final void zzc() {
        String str = (String) zzbd.zzc().zzd(zzbci.zzbp);
        if (!PlatformVersion.isAtLeastLollipop() || TextUtils.isEmpty(str) || "default".equals(str)) {
            this.zza.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        if (resourcesZzf == null) {
            this.zza.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Drawable drawable = null;
        try {
            if ("white".equals(str)) {
                drawable = resourcesZzf.getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_white_circle_black_cross);
            } else if ("black".equals(str)) {
                drawable = resourcesZzf.getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_black_circle_white_cross);
            }
        } catch (Resources.NotFoundException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Close button resource not found, falling back to default.");
        }
        if (drawable == null) {
            this.zza.setImageResource(R.drawable.btn_dialog);
            return;
        }
        ImageButton imageButton = this.zza;
        imageButton.setImageDrawable(drawable);
        imageButton.setScaleType(ImageView.ScaleType.CENTER);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Callback.onClick_enter(view);
        try {
            zzag zzagVar = this.zzb;
            if (zzagVar != null) {
                zzagVar.zzd();
            }
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void zza(boolean z4) {
        if (!z4) {
            this.zza.setVisibility(0);
            return;
        }
        ImageButton imageButton = this.zza;
        imageButton.setVisibility(8);
        if (((Long) zzbd.zzc().zzd(zzbci.zzbq)).longValue() > 0) {
            imageButton.animate().cancel();
            imageButton.clearAnimation();
        }
    }

    public final /* synthetic */ ImageButton zzb() {
        return this.zza;
    }
}
