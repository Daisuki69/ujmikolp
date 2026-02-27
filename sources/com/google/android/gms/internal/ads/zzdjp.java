package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import dOYHB6.lN8Dz0.yf3D09;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdjp extends zzbfz implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdkr {
    public static final zzgjz zza = zzgjz.zzl("2011", "1009", "3010");
    private final String zzb;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzgpd zzf;
    private View zzg;
    private zzdip zzi;
    private zzayk zzj;
    private zzbft zzl;
    private boolean zzm;
    private GestureDetector zzo;
    private Map zzc = new HashMap();
    private IObjectWrapper zzk = null;
    private boolean zzn = false;
    private final int zzh = ModuleDescriptor.MODULE_VERSION;

    public zzdjp(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        String str;
        this.zzd = frameLayout;
        this.zze = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzb = str;
        com.google.android.gms.ads.internal.zzt.zzC();
        zzbzu.zza(frameLayout, this);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzbzu.zzb(frameLayout, this);
        this.zzf = zzbzh.zzf;
        this.zzj = new zzayk(this.zzd.getContext(), this.zzd);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void zzt() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmp)).booleanValue() || this.zzi.zzG() == 0) {
            return;
        }
        this.zzo = new GestureDetector(this.zzd.getContext(), new zzdjx(this.zzi, this));
    }

    private final synchronized void zzu() {
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzs();
            }
        });
    }

    private final synchronized void zzv(String str) {
        DisplayMetrics displayMetrics;
        try {
            View yf3d09 = new yf3D09(this.zze.getContext());
            yf3d09.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.zze.getContext();
            yf3d09.setClickable(false);
            yf3d09.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        yf3d09.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Encountered invalid base64 watermark.", e);
                    }
                }
            }
            this.zze.addView(yf3d09);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        Callback.onClick_enter(view);
        try {
            zzdip zzdipVar = this.zzi;
            if (zzdipVar == null || !zzdipVar.zzH()) {
                Callback.onClick_exit();
                return;
            }
            this.zzi.zzz();
            this.zzi.zzi(view, this.zzd, zzj(), zzk(), false);
            Callback.onClick_exit();
        } catch (Throwable th2) {
            Callback.onClick_exit();
            throw th2;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdip zzdipVar = this.zzi;
        if (zzdipVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdipVar.zzu(frameLayout, zzj(), zzk(), zzdip.zzI(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdip zzdipVar = this.zzi;
        if (zzdipVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdipVar.zzu(frameLayout, zzj(), zzk(), zzdip.zzI(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdip zzdipVar = this.zzi;
        if (zzdipVar != null) {
            zzdipVar.zzk(view, motionEvent, this.zzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmp)).booleanValue() && this.zzo != null && this.zzi.zzG() != 0) {
                this.zzo.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final synchronized void zzb(String str, IObjectWrapper iObjectWrapper) {
        zzi(str, (View) ObjectWrapper.unwrap(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final synchronized IObjectWrapper zzc(String str) {
        return ObjectWrapper.wrap(zzm(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final synchronized void zzd(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof zzdip)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdip zzdipVar = this.zzi;
        if (zzdipVar != null) {
            zzdipVar.zzh(this);
        }
        zzu();
        zzdip zzdipVar2 = (zzdip) objUnwrap;
        this.zzi = zzdipVar2;
        zzdipVar2.zzg(this);
        this.zzi.zzN(this.zzd);
        this.zzi.zzO(this.zze);
        if (this.zzm) {
            this.zzi.zzP().zzb(this.zzl);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeq)).booleanValue() && !TextUtils.isEmpty(this.zzi.zzK())) {
            zzv(this.zzi.zzK());
        }
        zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzdkr
    public final FrameLayout zzdF() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final synchronized void zzdG(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        this.zzk = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzdH(IObjectWrapper iObjectWrapper) {
        onTouch(this.zzd, (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final synchronized void zzdI(zzbft zzbftVar) {
        if (!this.zzn) {
            this.zzm = true;
            this.zzl = zzbftVar;
            zzdip zzdipVar = this.zzi;
            if (zzdipVar != null) {
                zzdipVar.zzP().zzb(zzbftVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkr
    public final /* synthetic */ View zzdJ() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final synchronized void zze() {
        try {
            if (this.zzn) {
                return;
            }
            zzdip zzdipVar = this.zzi;
            if (zzdipVar != null) {
                zzdipVar.zzh(this);
                this.zzi = null;
            }
            this.zzc.clear();
            this.zzd.removeAllViews();
            this.zze.removeAllViews();
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzg = null;
            this.zzj = null;
            this.zzn = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final synchronized void zzf(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final synchronized void zzg(IObjectWrapper iObjectWrapper) {
        this.zzi.zzx((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzdkr
    public final zzayk zzh() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzdkr
    public final synchronized void zzi(String str, View view, boolean z4) {
        if (!this.zzn) {
            if (view == null) {
                this.zzc.remove(str);
                return;
            }
            this.zzc.put(str, new WeakReference(view));
            if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                if (com.google.android.gms.ads.internal.util.zzbs.zza(this.zzh)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkr
    public final synchronized Map zzj() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdkr
    public final synchronized Map zzk() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdkr
    @Nullable
    public final synchronized Map zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkr
    @Nullable
    public final synchronized View zzm(String str) {
        WeakReference weakReference;
        if (!this.zzn && (weakReference = (WeakReference) this.zzc.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkr
    public final synchronized String zzn() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdkr
    @Nullable
    public final IObjectWrapper zzo() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzdkr
    @Nullable
    public final synchronized JSONObject zzp() {
        zzdip zzdipVar = this.zzi;
        if (zzdipVar == null) {
            return null;
        }
        return zzdipVar.zzv(this.zzd, zzj(), zzk());
    }

    @Override // com.google.android.gms.internal.ads.zzdkr
    @Nullable
    public final synchronized JSONObject zzq() {
        zzdip zzdipVar = this.zzi;
        if (zzdipVar == null) {
            return null;
        }
        return zzdipVar.zzw(this.zzd, zzj(), zzk());
    }

    public final FrameLayout zzr() {
        return this.zzd;
    }

    public final /* synthetic */ void zzs() {
        if (this.zzg == null) {
            View view = new View(this.zzd.getContext());
            this.zzg = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzd != this.zzg.getParent()) {
            this.zzd.addView(this.zzg);
        }
    }
}
