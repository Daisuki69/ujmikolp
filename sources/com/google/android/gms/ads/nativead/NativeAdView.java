package com.google.android.gms.ads.nativead;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzbfk;
import com.google.android.gms.internal.ads.zzbga;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.lN8Dz0.yf3D09;

/* JADX INFO: loaded from: classes2.dex */
public final class NativeAdView extends FrameLayout {
    private final FrameLayout zza;

    @Nullable
    private final zzbga zzb;

    public NativeAdView(@NonNull Context context) {
        super(context);
        this.zza = zze(context);
        this.zzb = zzf();
    }

    private final void zzd(String str, @Nullable View view) {
        zzbga zzbgaVar = this.zzb;
        if (zzbgaVar == null) {
            return;
        }
        try {
            zzbgaVar.zzb(str, ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzo.zzg("Unable to call setAssetView on delegate", e);
        }
    }

    private final FrameLayout zze(Context context) {
        yf3D09 yf3d09 = new yf3D09(context);
        yf3d09.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(yf3d09);
        return yf3d09;
    }

    @Nullable
    private final zzbga zzf() {
        if (isInEditMode()) {
            return null;
        }
        FrameLayout frameLayout = this.zza;
        return zzbb.zzb().zze(frameLayout.getContext(), this, frameLayout);
    }

    @Override // android.view.ViewGroup
    public final void addView(@NonNull View view, int i, @NonNull ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(@NonNull View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zza;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public void destroy() {
        zzbga zzbgaVar = this.zzb;
        if (zzbgaVar == null) {
            return;
        }
        try {
            zzbgaVar.zze();
        } catch (RemoteException e) {
            zzo.zzg("Unable to destroy native ad view", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        zzbga zzbgaVar = this.zzb;
        if (zzbgaVar != null) {
            if (((Boolean) zzbd.zzc().zzd(zzbci.zzmp)).booleanValue()) {
                try {
                    zzbgaVar.zzdH(ObjectWrapper.wrap(motionEvent));
                } catch (RemoteException e) {
                    zzo.zzg("Unable to call handleTouchEvent on delegate", e);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public AdChoicesView getAdChoicesView() {
        View viewZza = zza("3011");
        if (viewZza instanceof AdChoicesView) {
            return (AdChoicesView) viewZza;
        }
        return null;
    }

    @Nullable
    public final View getAdvertiserView() {
        return zza("3005");
    }

    @Nullable
    public final View getBodyView() {
        return zza("3004");
    }

    @Nullable
    public final View getCallToActionView() {
        return zza("3002");
    }

    @Nullable
    public final View getHeadlineView() {
        return zza("3001");
    }

    @Nullable
    public final View getIconView() {
        return zza("3003");
    }

    @Nullable
    public final View getImageView() {
        return zza("3008");
    }

    @Nullable
    public final MediaView getMediaView() {
        View viewZza = zza("3010");
        if (viewZza instanceof MediaView) {
            return (MediaView) viewZza;
        }
        if (viewZza == null) {
            return null;
        }
        zzo.zzd("View is not an instance of MediaView");
        return null;
    }

    @Nullable
    public final View getPriceView() {
        return zza("3007");
    }

    @Nullable
    public final View getStarRatingView() {
        return zza("3009");
    }

    @Nullable
    public final View getStoreView() {
        return zza("3006");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        zzbga zzbgaVar = this.zzb;
        if (zzbgaVar == null) {
            return;
        }
        try {
            zzbgaVar.zzf(ObjectWrapper.wrap(view), i);
        } catch (RemoteException e) {
            zzo.zzg("Unable to call onVisibilityChanged on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(@NonNull View view) {
        if (this.zza == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(@Nullable AdChoicesView adChoicesView) {
        zzd("3011", adChoicesView);
    }

    public final void setAdvertiserView(@Nullable View view) {
        zzd("3005", view);
    }

    public final void setBodyView(@Nullable View view) {
        zzd("3004", view);
    }

    public final void setCallToActionView(@Nullable View view) {
        zzd("3002", view);
    }

    public final void setClickConfirmingView(@Nullable View view) {
        zzbga zzbgaVar = this.zzb;
        if (zzbgaVar == null) {
            return;
        }
        try {
            zzbgaVar.zzg(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzo.zzg("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setHeadlineView(@Nullable View view) {
        zzd("3001", view);
    }

    public final void setIconView(@Nullable View view) {
        zzd("3003", view);
    }

    public final void setImageView(@Nullable View view) {
        zzd("3008", view);
    }

    public final void setMediaView(@Nullable MediaView mediaView) {
        zzd("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.zza(new zzbfi() { // from class: com.google.android.gms.ads.nativead.zzb
            @Override // com.google.android.gms.internal.ads.zzbfi
            public final /* synthetic */ void zza(MediaContent mediaContent) {
                this.zza.zzb(mediaContent);
            }
        });
        mediaView.zzb(new zzbfk() { // from class: com.google.android.gms.ads.nativead.zza
            @Override // com.google.android.gms.internal.ads.zzbfk
            public final /* synthetic */ void zza(ImageView.ScaleType scaleType) {
                this.zza.zzc(scaleType);
            }
        });
    }

    public void setNativeAd(@NonNull NativeAd nativeAd) {
        zzbga zzbgaVar = this.zzb;
        if (zzbgaVar == null) {
            return;
        }
        try {
            zzbgaVar.zzd((IObjectWrapper) nativeAd.zza());
        } catch (RemoteException e) {
            zzo.zzg("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void setPriceView(@Nullable View view) {
        zzd("3007", view);
    }

    public final void setStarRatingView(@Nullable View view) {
        zzd("3009", view);
    }

    public final void setStoreView(@Nullable View view) {
        zzd("3006", view);
    }

    @Nullable
    public final View zza(@NonNull String str) {
        zzbga zzbgaVar = this.zzb;
        if (zzbgaVar != null) {
            try {
                IObjectWrapper iObjectWrapperZzc = zzbgaVar.zzc(str);
                if (iObjectWrapperZzc != null) {
                    return (View) ObjectWrapper.unwrap(iObjectWrapperZzc);
                }
            } catch (RemoteException e) {
                zzo.zzg("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    public final /* synthetic */ void zzb(MediaContent mediaContent) {
        zzbga zzbgaVar = this.zzb;
        if (zzbgaVar == null) {
            return;
        }
        try {
            if (mediaContent instanceof zzfe) {
                zzbgaVar.zzdI(((zzfe) mediaContent).zzc());
            } else if (mediaContent == null) {
                zzbgaVar.zzdI(null);
            } else {
                zzo.zzd("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e) {
            zzo.zzg("Unable to call setMediaContent on delegate", e);
        }
    }

    public final /* synthetic */ void zzc(ImageView.ScaleType scaleType) {
        zzbga zzbgaVar = this.zzb;
        if (zzbgaVar == null || scaleType == null) {
            return;
        }
        try {
            zzbgaVar.zzdG(ObjectWrapper.wrap(scaleType));
        } catch (RemoteException e) {
            zzo.zzg("Unable to call setMediaViewImageScaleType on delegate", e);
        }
    }

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = zze(context);
        this.zzb = zzf();
    }

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zza = zze(context);
        this.zzb = zzf();
    }

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
        this.zza = zze(context);
        this.zzb = zzf();
    }
}
