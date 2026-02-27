package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdho implements zzdjc {
    private com.google.android.gms.ads.internal.client.zzdf zzC;
    private final zzcyh zzD;
    private final zzdjv zzE;

    @Nullable
    private final com.google.android.gms.ads.internal.zzb zzF;
    private final zzcum zzG;
    private final Context zza;
    private final zzdje zzb;
    private final JSONObject zzc;
    private final zzdnx zzd;
    private final zzdiu zze;
    private final zzauu zzf;
    private final zzcwk zzg;
    private final zzcvq zzh;
    private final zzddx zzi;
    private final zzfcj zzj;
    private final VersionInfoParcel zzk;
    private final zzfdc zzl;
    private final zzcnf zzm;
    private final zzdjz zzn;
    private final Clock zzo;
    private final zzddt zzp;
    private final zzfjv zzq;
    private final zzdpn zzr;
    private final zzfib zzs;
    private final zzecy zzt;
    private boolean zzv;
    private boolean zzu = false;
    private boolean zzw = false;
    private boolean zzx = false;
    private Point zzy = new Point();
    private Point zzz = new Point();
    private long zzA = 0;
    private long zzB = 0;

    public zzdho(Context context, zzdje zzdjeVar, JSONObject jSONObject, zzdnx zzdnxVar, zzdiu zzdiuVar, zzauu zzauuVar, zzcwk zzcwkVar, zzcvq zzcvqVar, zzddx zzddxVar, zzfcj zzfcjVar, VersionInfoParcel versionInfoParcel, zzfdc zzfdcVar, zzcnf zzcnfVar, zzdjz zzdjzVar, Clock clock, zzddt zzddtVar, zzfjv zzfjvVar, zzfib zzfibVar, zzecy zzecyVar, zzdpn zzdpnVar, zzdjv zzdjvVar, zzcyh zzcyhVar, @Nullable com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzbxf zzbxfVar, zzcum zzcumVar) {
        this.zza = context;
        this.zzb = zzdjeVar;
        this.zzc = jSONObject;
        this.zzd = zzdnxVar;
        this.zze = zzdiuVar;
        this.zzf = zzauuVar;
        this.zzg = zzcwkVar;
        this.zzh = zzcvqVar;
        this.zzi = zzddxVar;
        this.zzj = zzfcjVar;
        this.zzk = versionInfoParcel;
        this.zzl = zzfdcVar;
        this.zzm = zzcnfVar;
        this.zzn = zzdjzVar;
        this.zzo = clock;
        this.zzp = zzddtVar;
        this.zzq = zzfjvVar;
        this.zzs = zzfibVar;
        this.zzt = zzecyVar;
        this.zzr = zzdpnVar;
        this.zzE = zzdjvVar;
        this.zzD = zzcyhVar;
        this.zzF = zzbVar;
        this.zzG = zzcumVar;
    }

    private final boolean zzG(String str) {
        JSONObject jSONObjectOptJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    @Nullable
    private final String zzH(@Nullable View view, @Nullable Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iZzx = this.zze.zzx();
        if (iZzx == 1) {
            return "1099";
        }
        if (iZzx == 2) {
            return "2099";
        }
        if (iZzx != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean zzI() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final void zzJ() {
        com.google.android.gms.ads.internal.zzb zzbVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoq)).booleanValue() || (zzbVar = this.zzF) == null) {
            return;
        }
        zzbVar.zza();
    }

    private final boolean zzK(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4, @Nullable String str, @Nullable JSONObject jSONObject5, boolean z4, @Nullable View view) {
        JSONException jSONException;
        zzcum zzcumVar;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdW)).booleanValue()) {
                try {
                    jSONObject6.put("view_signals", str);
                } catch (JSONException e) {
                    jSONException = e;
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create impression JSON.", jSONException);
                    return false;
                }
            }
            jSONObject6.put("policy_validator_enabled", z4);
            jSONObject6.put("screen", com.google.android.gms.ads.internal.util.zzbs.zzj(this.zza));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzos)).booleanValue() && (zzcumVar = this.zzG) != null && zzcumVar.zza() > 0) {
                jSONObject6.put("placement_id", zzcumVar.zza());
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjr)).booleanValue()) {
                this.zzd.zzd("/clickRecorded", new zzdhl(this, null));
            } else {
                this.zzd.zzd("/logScionEvent", new zzdhk(this, null));
            }
            zzdnx zzdnxVar = this.zzd;
            zzdnxVar.zzd("/nativeImpression", new zzdhm(this, view, null));
            try {
                zzdnxVar.zzd("/nativeImpressionFlowControl", new zzdhn(this, this.zzq, this.zzj.zzax, this.zzs, null));
                zzbzk.zza(zzdnxVar.zzc("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
                if (this.zzu) {
                    return true;
                }
                this.zzu = com.google.android.gms.ads.internal.zzt.zzo().zzg(this.zza, this.zzk.afmaVersion, this.zzj.zzC.toString(), this.zzl.zzg);
                return true;
            } catch (JSONException e7) {
                e = e7;
                jSONException = e;
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create impression JSON.", jSONException);
                return false;
            }
        } catch (JSONException e10) {
            e = e10;
        }
    }

    @Nullable
    private final String zzL(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdW)).booleanValue()) {
            return null;
        }
        try {
            return this.zzf.zzb().zzj(this.zza, view, null);
        } catch (Exception unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Exception getting data.");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzA() {
        this.zzd.zzb();
    }

    public final /* synthetic */ void zzB(View view) {
        this.zzE.zza(view, this.zzj);
    }

    public final /* synthetic */ zzcwk zzC() {
        return this.zzg;
    }

    public final /* synthetic */ zzcvq zzD() {
        return this.zzh;
    }

    public final /* synthetic */ zzddx zzE() {
        return this.zzi;
    }

    public final /* synthetic */ zzcyh zzF() {
        return this.zzD;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zza(View view, @Nullable Map map, @Nullable Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (!this.zzv) {
            this.zzp.zza(view);
            this.zzv = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzo(this);
        boolean zZza = com.google.android.gms.ads.internal.util.zzbs.zza(this.zzk.clientJarVersion);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zZza) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zZza) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzb(@Nullable View view, @Nullable Map map) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzv = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzc(View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z4, @Nullable ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view2, scaleType);
        JSONObject jSONObjectZzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view2);
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view2);
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view2);
        String strZzH = zzH(view, map);
        zzi(true == ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzed)).booleanValue() ? view2 : view, jSONObjectZzb, jSONObjectZze, jSONObjectZzc, jSONObjectZzd, strZzH, com.google.android.gms.ads.internal.util.zzbs.zzf(strZzH, context, this.zzz, this.zzy), null, z4, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzd(String str) {
        zzi(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zze(@Nullable Bundle bundle) {
        if (bundle == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Click data is null. No click is reported.");
        } else if (zzG("click_reporting")) {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zzi(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, com.google.android.gms.ads.internal.client.zzbb.zza().zzl(bundle, null), false, false);
        } else {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzf(@Nullable View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z4, @Nullable ImageView.ScaleType scaleType, int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.zzc;
        boolean z5 = false;
        if (jSONObject2.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmp)).booleanValue()) {
                z5 = true;
            }
        }
        if (!z5) {
            if (!this.zzx) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzI()) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        Context context = this.zza;
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view2, scaleType);
        JSONObject jSONObjectZzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view2);
        boolean z8 = z5;
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view2);
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view2);
        String strZzH = zzH(view, map);
        JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbs.zzf(strZzH, context, this.zzz, this.zzy);
        if (z8) {
            try {
                Point point = this.zzz;
                Point point2 = this.zzy;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i);
                    } catch (Exception e) {
                        e = e;
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while grabbing custom click gesture signals.", e);
                    }
                } catch (Exception e7) {
                    e = e7;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e10) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while adding CustomClickGestureSignals to adJson.", e10);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzi(view2, jSONObjectZzb, jSONObjectZze, jSONObjectZzc, jSONObjectZzd, strZzH, jSONObjectZzf, null, z4, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzg() {
        this.zzx = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final boolean zzh() {
        return zzI();
    }

    @VisibleForTesting
    public final void zzi(@Nullable View view, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4, @Nullable String str, @Nullable JSONObject jSONObject5, @Nullable JSONObject jSONObject6, boolean z4, boolean z5) {
        String strZzg;
        try {
            zzJ();
            JSONObject jSONObject7 = new JSONObject();
            JSONObject jSONObject8 = this.zzc;
            jSONObject7.put("ad", jSONObject8);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            zzdje zzdjeVar = this.zzb;
            zzdiu zzdiuVar = this.zze;
            jSONObject7.put("has_custom_click_handler", zzdjeVar.zzg(zzdiuVar.zzS()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", zzdiuVar.zzx());
            jSONObject9.put("view_aware_api_used", z4);
            zzbfl zzbflVar = this.zzl.zzj;
            jSONObject9.put("custom_mute_requested", zzbflVar != null && zzbflVar.zzg);
            jSONObject9.put("custom_mute_enabled", (zzdiuVar.zzE().isEmpty() || zzdiuVar.zzF() == null) ? false : true);
            if (this.zzn.zzb() != null && jSONObject8.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject9.put("timestamp", this.zzo.currentTimeMillis());
            if (this.zzx && zzI()) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z5) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            jSONObject9.put("has_custom_click_handler", zzdjeVar.zzg(zzdiuVar.zzS()) != null);
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject8.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strZzg = this.zzf.zzb().zzg(this.zza, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception obtaining click signals", e);
                strZzg = null;
            }
            jSONObject9.put("click_signals", strZzg);
            jSONObject9.put("open_chrome_custom_tab", true);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjv)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjw)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            long jCurrentTimeMillis = this.zzo.currentTimeMillis();
            jSONObject10.put("time_from_last_touch_down", jCurrentTimeMillis - this.zzA);
            jSONObject10.put("time_from_last_touch", jCurrentTimeMillis - this.zzB);
            jSONObject7.put("touch_signal", jSONObject10);
            if (this.zzj.zzb()) {
                JSONObject jSONObject11 = (JSONObject) this.zzc.get("tracking_urls_and_actions");
                String string = jSONObject11 != null ? jSONObject11.getString("gws_query_id") : null;
                if (string != null) {
                    this.zzt.zzc(string, this.zze);
                }
            }
            zzbzk.zza(this.zzd.zzc("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e7) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create click JSON.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzj(@Nullable View view, MotionEvent motionEvent, @Nullable View view2) {
        this.zzy = com.google.android.gms.ads.internal.util.zzbs.zzh(motionEvent, view2);
        long jCurrentTimeMillis = this.zzo.currentTimeMillis();
        this.zzB = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzr.zza(motionEvent);
            this.zzA = jCurrentTimeMillis;
            this.zzz = this.zzy;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzy;
        motionEventObtain.setLocation(point.x, point.y);
        this.zzf.zzc(motionEventObtain);
        motionEventObtain.recycle();
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzk(@Nullable Bundle bundle) {
        if (bundle == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Touch event data is null. No touch event is reported.");
        } else {
            if (!zzG("touch_reporting")) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
                return;
            }
            this.zzf.zzb().zze((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
            zzJ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    @Nullable
    public final JSONObject zzl(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view, scaleType);
        JSONObject jSONObjectZzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view);
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view);
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectZze);
            jSONObject.put("ad_view_signal", jSONObjectZzb);
            jSONObject.put("scroll_view_signal", jSONObjectZzc);
            jSONObject.put("lock_screen_signal", jSONObjectZzd);
            return jSONObject;
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    @Nullable
    public final JSONObject zzm(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        JSONObject jSONObjectZzl = zzl(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzx && zzI()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectZzl != null) {
                jSONObject.put("nas", jSONObjectZzl);
                return jSONObject;
            }
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzn() {
        zzK(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzo(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdjz zzdjzVar = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdjzVar);
        view.setClickable(true);
        zzdjzVar.zzc = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzp(zzbhn zzbhnVar) {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zza(zzbhnVar);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzq() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzr(@Nullable com.google.android.gms.ads.internal.client.zzdj zzdjVar) {
        try {
            if (this.zzw) {
                return;
            }
            if (zzdjVar == null) {
                zzdiu zzdiuVar = this.zze;
                if (zzdiuVar.zzF() != null) {
                    this.zzw = true;
                    this.zzq.zzb(zzdiuVar.zzF().zzf(), this.zzj.zzax, this.zzs, null);
                    zzt();
                    return;
                }
            }
            this.zzw = true;
            this.zzq.zzb(zzdjVar.zzf(), this.zzj.zzax, this.zzs, null);
            zzt();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzs(com.google.android.gms.ads.internal.client.zzdf zzdfVar) {
        this.zzC = zzdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzt() {
        try {
            com.google.android.gms.ads.internal.client.zzdf zzdfVar = this.zzC;
            if (zzdfVar != null) {
                zzdfVar.zze();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final int zzu() {
        zzbfl zzbflVar = this.zzl.zzj;
        if (zzbflVar == null) {
            return 0;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmp)).booleanValue()) {
            return zzbflVar.zzi;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final boolean zzv() {
        if (zzu() == 0) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmp)).booleanValue()) {
            return this.zzl.zzj.zzj;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzw(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        Context context = this.zza;
        zzK(com.google.android.gms.ads.internal.util.zzbs.zzb(context, view), com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view, scaleType), com.google.android.gms.ads.internal.util.zzbs.zzc(view), com.google.android.gms.ads.internal.util.zzbs.zzd(context, view), zzL(view), null, com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.zzj), view);
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzx(View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view, scaleType);
        JSONObject jSONObjectZzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view);
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view);
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view);
        boolean zZzi = com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.zzj);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            jSONObject.put("asset_view_signal", jSONObjectZze);
            jSONObject.put("ad_view_signal", jSONObjectZzb);
            jSONObject.put("scroll_view_signal", jSONObjectZzc);
            jSONObject.put("lock_screen_signal", jSONObjectZzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdW)).booleanValue()) {
                jSONObject.put("view_signals", zzL(view));
            }
            jSONObject.put("policy_validator_enabled", zZzi);
            jSONObject.put("screen", com.google.android.gms.ads.internal.util.zzbs.zzj(context));
            zzbzk.zza(this.zzd.zzc("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging");
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create native ad signals logging JSON.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzy() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzbzk.zza(this.zzd.zzc("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final boolean zzz(Bundle bundle) {
        if (zzG("impression_reporting")) {
            return zzK(null, null, null, null, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzml)).booleanValue() ? zzL(null) : null, com.google.android.gms.ads.internal.client.zzbb.zza().zzl(bundle, null), false, null);
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }
}
