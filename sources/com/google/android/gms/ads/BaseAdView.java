package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzen;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbtt;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseAdView extends ViewGroup {
    protected final zzen zza;

    public BaseAdView(@NonNull Context context, int i) {
        super(context);
        this.zza = new zzen(this, i);
    }

    public void destroy() {
        zzbci.zza(getContext());
        if (((Boolean) zzbeg.zze.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzd(zzbci.zzlU)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzg
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.zza.zza();
                        } catch (IllegalStateException e) {
                            zzbtt.zza(baseAdView.getContext()).zzh(e, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zza();
    }

    @NonNull
    public AdListener getAdListener() {
        return this.zza.zzb();
    }

    @Nullable
    public AdSize getAdSize() {
        return this.zza.zzc();
    }

    @NonNull
    public String getAdUnitId() {
        return this.zza.zze();
    }

    @Nullable
    public OnPaidEventListener getOnPaidEventListener() {
        return this.zza.zzx();
    }

    public long getPlacementId() {
        return this.zza.zzv();
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        return this.zza.zzt();
    }

    public boolean isCollapsible() {
        return this.zza.zzr();
    }

    public boolean isLoading() {
        return this.zza.zzs();
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(@NonNull final AdRequest adRequest) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbci.zza(getContext());
        if (((Boolean) zzbeg.zzf.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzd(zzbci.zzlX)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzd
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AdRequest adRequest2 = adRequest;
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.zza.zzg(adRequest2.zza);
                        } catch (IllegalStateException e) {
                            zzbtt.zza(baseAdView.getContext()).zzh(e, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzg(adRequest.zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i, int i4, int i6, int i10) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i11 = ((i6 - i) - measuredWidth) / 2;
        int i12 = ((i10 - i4) - measuredHeight) / 2;
        childAt.layout(i11, i12, measuredWidth + i11, measuredHeight + i12);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i4) {
        AdSize adSize;
        int heightInPixels;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                zzo.zzg("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                heightInPixels = adSize.getHeightInPixels(context);
                measuredWidth = widthInPixels;
            } else {
                heightInPixels = 0;
            }
        } else {
            measureChild(childAt, i, i4);
            measuredWidth = childAt.getMeasuredWidth();
            heightInPixels = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(heightInPixels, getSuggestedMinimumHeight()), i4));
    }

    public void pause() {
        zzbci.zza(getContext());
        if (((Boolean) zzbeg.zzg.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzd(zzbci.zzlV)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zze
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.zza.zzh();
                        } catch (IllegalStateException e) {
                            zzbtt.zza(baseAdView.getContext()).zzh(e, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzh();
    }

    public void resume() {
        zzbci.zza(getContext());
        if (((Boolean) zzbeg.zzh.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzd(zzbci.zzlT)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.zza.zzj();
                        } catch (IllegalStateException e) {
                            zzbtt.zza(baseAdView.getContext()).zzh(e, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzj();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(@NonNull AdListener adListener) {
        zzen zzenVar = this.zza;
        zzenVar.zzk(adListener);
        if (adListener == 0) {
            zzenVar.zzl(null);
            return;
        }
        if (adListener instanceof com.google.android.gms.ads.internal.client.zza) {
            zzenVar.zzl((com.google.android.gms.ads.internal.client.zza) adListener);
        }
        if (adListener instanceof AppEventListener) {
            zzenVar.zzp((AppEventListener) adListener);
        }
    }

    public void setAdSize(@NonNull AdSize adSize) {
        this.zza.zzm(adSize);
    }

    public void setAdUnitId(@NonNull String str) {
        this.zza.zzo(str);
    }

    public void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener) {
        this.zza.zzu(onPaidEventListener);
    }

    public void setPlacementId(long j) {
        this.zza.zzw(j);
    }

    public BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.zza = new zzen(this, attributeSet, false, i);
    }

    public BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i);
        this.zza = new zzen(this, attributeSet, false, i4);
    }

    public BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i4, boolean z4) {
        super(context, attributeSet, i);
        this.zza = new zzen(this, attributeSet, z4, i4);
    }

    public BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, boolean z4) {
        super(context, attributeSet);
        this.zza = new zzen(this, attributeSet, z4);
    }
}
