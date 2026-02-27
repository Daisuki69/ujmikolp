package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfnr implements zzfms {
    private static final zzfnr zza = new zzfnr();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzk = new zzfnn();
    private static final Runnable zzl = new zzfno();
    private int zze;
    private long zzj;
    private final List zzd = new ArrayList();
    private final List zzf = new ArrayList();
    private final zzfnk zzh = new zzfnk();
    private final zzfmu zzg = new zzfmu();
    private final zzfnl zzi = new zzfnl(new zzfnu());

    public static zzfnr zzb() {
        return zza;
    }

    private final void zzk(View view, zzfmt zzfmtVar, JSONObject jSONObject, int i, boolean z4) {
        zzfmtVar.zzb(view, jSONObject, this, i == 1, z4);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zzl);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfms
    public final void zza(View view, zzfmt zzfmtVar, JSONObject jSONObject, boolean z4) {
        zzfnk zzfnkVar;
        int iZzl;
        boolean z5;
        zzfnr zzfnrVar;
        View view2;
        zzfmt zzfmtVar2;
        boolean z8;
        if (zzfni.zza(view) != null || (iZzl = (zzfnkVar = this.zzh).zzl(view)) == 3) {
            return;
        }
        JSONObject jSONObjectZza = zzfmtVar.zza(view);
        zzfnd.zze(jSONObject, jSONObjectZza);
        String strZzg = zzfnkVar.zzg(view);
        if (strZzg != null) {
            zzfnd.zzd(jSONObjectZza, strZzg);
            try {
                jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(this.zzh.zzj(view)));
            } catch (JSONException e) {
                zzfne.zza("Error with setting has window focus", e);
            }
            boolean zZzk = this.zzh.zzk(strZzg);
            Boolean boolValueOf = Boolean.valueOf(zZzk);
            if (zZzk) {
                try {
                    jSONObjectZza.put("isPipActive", boolValueOf);
                } catch (JSONException e7) {
                    zzfne.zza("Error with setting is picture-in-picture active", e7);
                }
            }
            this.zzh.zzf();
            zzfnrVar = this;
        } else {
            zzfnj zzfnjVarZzi = zzfnkVar.zzi(view);
            if (zzfnjVarZzi != null) {
                zzfmk zzfmkVarZzb = zzfnjVarZzi.zzb();
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListZzc = zzfnjVarZzi.zzc();
                int size = arrayListZzc.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put((String) arrayListZzc.get(i));
                }
                try {
                    jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectZza.put("friendlyObstructionClass", zzfmkVarZzb.zzb());
                    jSONObjectZza.put("friendlyObstructionPurpose", zzfmkVarZzb.zzc());
                    jSONObjectZza.put("friendlyObstructionReason", zzfmkVarZzb.zzd());
                } catch (JSONException e10) {
                    zzfne.zza("Error with setting friendly obstruction", e10);
                }
                z5 = true;
            } else {
                z5 = false;
            }
            if (z4 || z5) {
                zzfnrVar = this;
                view2 = view;
                zzfmtVar2 = zzfmtVar;
                z8 = true;
            } else {
                view2 = view;
                zzfmtVar2 = zzfmtVar;
                z8 = false;
                zzfnrVar = this;
            }
            zzfnrVar.zzk(view2, zzfmtVar2, jSONObjectZza, iZzl, z8);
        }
        zzfnrVar.zze++;
    }

    public final void zzc() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzk);
            zzc.postDelayed(zzl, 200L);
        }
    }

    public final void zzd() {
        zzl();
        this.zzd.clear();
        zzb.post(new zzfnm(this));
    }

    public final void zze() {
        zzl();
    }

    public final /* synthetic */ void zzf() {
        zzfnr zzfnrVar;
        this.zze = 0;
        this.zzf.clear();
        for (zzfln zzflnVar : zzfmh.zza().zzf()) {
        }
        this.zzj = System.nanoTime();
        zzfnk zzfnkVar = this.zzh;
        zzfnkVar.zzd();
        zzfmu zzfmuVar = this.zzg;
        long jNanoTime = System.nanoTime();
        zzfmt zzfmtVarZza = zzfmuVar.zza();
        if (zzfnkVar.zzb().size() > 0) {
            for (String str : zzfnkVar.zzb()) {
                JSONObject jSONObjectZza = zzfmtVarZza.zza(null);
                View viewZzh = zzfnkVar.zzh(str);
                zzfmt zzfmtVarZzb = zzfmuVar.zzb();
                String strZzc = zzfnkVar.zzc(str);
                if (strZzc != null) {
                    JSONObject jSONObjectZza2 = zzfmtVarZzb.zza(viewZzh);
                    zzfnd.zzd(jSONObjectZza2, str);
                    try {
                        jSONObjectZza2.put("notVisibleReason", strZzc);
                    } catch (JSONException e) {
                        zzfne.zza("Error with setting not visible reason", e);
                    }
                    zzfnd.zze(jSONObjectZza, jSONObjectZza2);
                }
                zzfnd.zzf(jSONObjectZza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.zzi.zzb(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        zzfnk zzfnkVar2 = this.zzh;
        if (zzfnkVar2.zza().size() > 0) {
            JSONObject jSONObjectZza3 = zzfmtVarZza.zza(null);
            zzfnrVar = this;
            zzfnrVar.zzk(null, zzfmtVarZza, jSONObjectZza3, 1, false);
            zzfnd.zzf(jSONObjectZza3);
            zzfnrVar.zzi.zza(jSONObjectZza3, zzfnkVar2.zza(), jNanoTime);
        } else {
            zzfnrVar = this;
            zzfnrVar.zzi.zzc();
        }
        zzfnkVar2.zze();
        long jNanoTime2 = System.nanoTime() - zzfnrVar.zzj;
        List<zzfnq> list = zzfnrVar.zzd;
        if (list.size() > 0) {
            for (zzfnq zzfnqVar : list) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                zzfnqVar.zzb();
                if (zzfnqVar instanceof zzfnp) {
                    ((zzfnp) zzfnqVar).zza();
                }
            }
        }
        zzfmr.zza().zzc();
    }

    public final /* synthetic */ zzfnl zzh() {
        return this.zzi;
    }
}
