package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbsa extends zzbsb implements zzbjl {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcek zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbbp zzk;
    private float zzl;
    private int zzm;

    public zzbsa(zzcek zzcekVar, Context context, zzbbp zzbbpVar) {
        super(zzcekVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcekVar;
        this.zzi = context;
        this.zzk = zzbbpVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectPut;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzbb.zza();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics2, displayMetrics2.heightPixels);
        zzcek zzcekVar = this.zzh;
        Activity activityZzj = zzcekVar.zzj();
        if (activityZzj == null || activityZzj.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            com.google.android.gms.ads.internal.zzt.zzc();
            int[] iArrZzV = com.google.android.gms.ads.internal.util.zzs.zzV(activityZzj);
            com.google.android.gms.ads.internal.client.zzbb.zza();
            this.zzd = com.google.android.gms.ads.internal.util.client.zzf.zzA(this.zza, iArrZzV[0]);
            com.google.android.gms.ads.internal.client.zzbb.zza();
            this.zze = com.google.android.gms.ads.internal.util.client.zzf.zzA(this.zza, iArrZzV[1]);
        }
        if (zzcekVar.zzN().zzg()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            zzcekVar.measure(0, 0);
        }
        zzl(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbrz zzbrzVar = new zzbrz();
        zzbbp zzbbpVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbrzVar.zzb(zzbbpVar.zzc(intent));
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbrzVar.zza(zzbbpVar.zzc(intent2));
        zzbrzVar.zzc(zzbbpVar.zzb());
        zzbrzVar.zzd(zzbbpVar.zza());
        zzbrzVar.zze(true);
        boolean zZzf = zzbrzVar.zzf();
        boolean zZzg = zzbrzVar.zzg();
        boolean zZzh = zzbrzVar.zzh();
        boolean zZzi = zzbrzVar.zzi();
        try {
            jSONObjectPut = new JSONObject().put("sms", zZzf).put("tel", zZzg).put("calendar", zZzh).put("storePicture", zZzi).put("inlineVideo", zzbrzVar.zzj());
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObjectPut = null;
        }
        zzcekVar.zzd("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        zzcekVar.getLocationOnScreen(iArr);
        Context context = this.zzi;
        zzb(com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArr[0]), com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArr[1]));
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(2)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Dispatching Ready Event.");
        }
        zzh(zzcekVar.zzs().afmaVersion);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[PHI: r4
  0x0060: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:11:0x003f, B:17:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(int r9, int r10) {
        /*
            r8 = this;
            android.content.Context r0 = r8.zzi
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L14
            com.google.android.gms.ads.internal.zzt.zzc()
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            int[] r1 = com.google.android.gms.ads.internal.util.zzs.zzW(r1)
            r1 = r1[r2]
            goto L15
        L14:
            r1 = r2
        L15:
            com.google.android.gms.internal.ads.zzcek r3 = r8.zzh
            com.google.android.gms.internal.ads.zzcgt r4 = r3.zzN()
            if (r4 == 0) goto L27
            com.google.android.gms.internal.ads.zzcgt r4 = r3.zzN()
            boolean r4 = r4.zzg()
            if (r4 != 0) goto L75
        L27:
            int r4 = r3.getWidth()
            int r5 = r3.getHeight()
            com.google.android.gms.internal.ads.zzbbz r6 = com.google.android.gms.internal.ads.zzbci.zzaj
            com.google.android.gms.internal.ads.zzbcg r7 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r6 = r7.zzd(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L60
            if (r4 != 0) goto L51
            com.google.android.gms.internal.ads.zzcgt r4 = r3.zzN()
            if (r4 == 0) goto L50
            com.google.android.gms.internal.ads.zzcgt r4 = r3.zzN()
            int r4 = r4.zzb
            goto L51
        L50:
            r4 = r2
        L51:
            if (r5 != 0) goto L60
            com.google.android.gms.internal.ads.zzcgt r5 = r3.zzN()
            if (r5 == 0) goto L61
            com.google.android.gms.internal.ads.zzcgt r2 = r3.zzN()
            int r2 = r2.zza
            goto L61
        L60:
            r2 = r5
        L61:
            com.google.android.gms.ads.internal.util.client.zzf r5 = com.google.android.gms.ads.internal.client.zzbb.zza()
            int r4 = r5.zza(r0, r4)
            r8.zzf = r4
            com.google.android.gms.ads.internal.util.client.zzf r4 = com.google.android.gms.ads.internal.client.zzbb.zza()
            int r0 = r4.zza(r0, r2)
            r8.zzg = r0
        L75:
            int r0 = r10 - r1
            int r1 = r8.zzf
            int r2 = r8.zzg
            r8.zzj(r9, r0, r1, r2)
            com.google.android.gms.internal.ads.zzcgi r0 = r3.zzP()
            r0.zzN(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsa.zzb(int, int):void");
    }
}
