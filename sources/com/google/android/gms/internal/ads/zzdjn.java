package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdjn extends zzbgf implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdkr {
    private final WeakReference zza;
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzdip zze;
    private zzayk zzf;

    public zzdjn(View view, HashMap map, HashMap map2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzbzu.zza(view, this);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzbzu.zzb(view, this);
        this.zza = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.zzb.put(str, new WeakReference(view2));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.zzd.putAll(this.zzb);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.zzc.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.zzd.putAll(this.zzc);
        this.zzf = new zzayk(view.getContext(), view);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        Callback.onClick_enter(view);
        try {
            zzdip zzdipVar = this.zze;
            if (zzdipVar == null) {
                Callback.onClick_exit();
            } else {
                zzdipVar.zzi(view, zzdJ(), zzj(), zzk(), true);
                Callback.onClick_exit();
            }
        } catch (Throwable th2) {
            Callback.onClick_exit();
            throw th2;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdip zzdipVar = this.zze;
        if (zzdipVar != null) {
            zzdipVar.zzu(zzdJ(), zzj(), zzk(), zzdip.zzI(zzdJ()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdip zzdipVar = this.zze;
        if (zzdipVar != null) {
            zzdipVar.zzu(zzdJ(), zzj(), zzk(), zzdip.zzI(zzdJ()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdip zzdipVar = this.zze;
        if (zzdipVar != null) {
            zzdipVar.zzk(view, motionEvent, zzdJ());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final synchronized void zzb(IObjectWrapper iObjectWrapper) {
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof zzdip)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        zzdip zzdipVar = this.zze;
        if (zzdipVar != null) {
            zzdipVar.zzh(this);
        }
        zzdip zzdipVar2 = (zzdip) objUnwrap;
        if (!zzdipVar2.zzJ()) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
        } else {
            this.zze = zzdipVar2;
            zzdipVar2.zzg(this);
            this.zze.zzN(zzdJ());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final synchronized void zzc() {
        zzdip zzdipVar = this.zze;
        if (zzdipVar != null) {
            zzdipVar.zzh(this);
            this.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final synchronized void zzd(IObjectWrapper iObjectWrapper) {
        try {
            if (this.zze != null) {
                Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (!(objUnwrap instanceof View)) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                this.zze.zzx((View) objUnwrap);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkr
    @Nullable
    public final FrameLayout zzdF() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkr
    @Nullable
    public final View zzdJ() {
        return (View) this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdkr
    public final zzayk zzh() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzdkr
    public final synchronized void zzi(String str, View view, boolean z4) {
        this.zzd.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            this.zzb.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkr
    public final synchronized Map zzj() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdkr
    public final synchronized Map zzk() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdkr
    @Nullable
    public final synchronized Map zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdkr
    @Nullable
    public final synchronized View zzm(String str) {
        WeakReference weakReference = (WeakReference) this.zzd.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.zzdkr
    public final synchronized String zzn() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.zzdkr
    @Nullable
    public final synchronized IObjectWrapper zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkr
    @Nullable
    public final synchronized JSONObject zzp() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkr
    @Nullable
    public final synchronized JSONObject zzq() {
        zzdip zzdipVar = this.zze;
        if (zzdipVar == null) {
            return null;
        }
        return zzdipVar.zzw(zzdJ(), zzj(), zzk());
    }
}
