package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbxg implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private String zzd = "-1";
    private int zze = -1;

    public zzbxg(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = zzgVar;
        this.zza = context;
    }

    private final void zzb(String str, int i) {
        Context context;
        boolean z4 = true;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaO)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z4 = false;
        }
        this.zzc.zzw(z4);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgF)).booleanValue() && z4 && (context = this.zza) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    private final void zzc() {
        this.zzc.zzw(true);
        com.google.android.gms.ads.internal.util.zzac.zza(this.zza);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "IABTCF_PurposeConsents"
            com.google.android.gms.internal.ads.zzbbz r1 = com.google.android.gms.internal.ads.zzbci.zzaQ     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "-1"
            r3 = -1
            java.lang.String r4 = "gad_has_consent_for_cookies"
            if (r1 == 0) goto L55
            boolean r0 = java.util.Objects.equals(r10, r4)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L36
            int r9 = r9.getInt(r4, r3)     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.ads.internal.util.zzg r10 = r8.zzc     // Catch: java.lang.Throwable -> L2f
            int r0 = r10.zzD()     // Catch: java.lang.Throwable -> L2f
            if (r9 == r0) goto L32
            r8.zzc()     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r9 = move-exception
            goto Lb9
        L32:
            r10.zzC(r9)     // Catch: java.lang.Throwable -> L2f
            return
        L36:
            java.lang.String r0 = "IABTCF_TCString"
            boolean r0 = java.util.Objects.equals(r10, r0)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto Lb8
            java.lang.String r9 = dOYHB6.yFtIp6.svM7M6.getString(r9, r10, r2)     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.ads.internal.util.zzg r10 = r8.zzc     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = r10.zzB()     // Catch: java.lang.Throwable -> L2f
            boolean r0 = java.util.Objects.equals(r9, r0)     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L51
            r8.zzc()     // Catch: java.lang.Throwable -> L2f
        L51:
            r10.zzA(r9)     // Catch: java.lang.Throwable -> L2f
            return
        L55:
            java.lang.String r1 = dOYHB6.yFtIp6.svM7M6.getString(r9, r0, r2)     // Catch: java.lang.Throwable -> L2f
            int r9 = r9.getInt(r4, r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L2f
            int r5 = r10.hashCode()     // Catch: java.lang.Throwable -> L2f
            r6 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r7 = 1
            if (r5 == r6) goto L79
            r0 = -527267622(0xffffffffe09288da, float:-8.447143E19)
            if (r5 == r0) goto L71
            goto L81
        L71:
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L81
            r10 = r7
            goto L82
        L79:
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L81
            r10 = 0
            goto L82
        L81:
            r10 = r3
        L82:
            if (r10 == 0) goto La5
            if (r10 == r7) goto L87
            goto Lb8
        L87:
            com.google.android.gms.internal.ads.zzbbz r10 = com.google.android.gms.internal.ads.zzbci.zzaO     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.internal.ads.zzbcg r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r10 = r0.zzd(r10)     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L2f
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L2f
            if (r10 == 0) goto Lb8
            if (r9 == r3) goto Lb8
            int r10 = r8.zze     // Catch: java.lang.Throwable -> L2f
            if (r10 == r9) goto Lb8
            r8.zze = r9     // Catch: java.lang.Throwable -> L2f
            r8.zzb(r1, r9)     // Catch: java.lang.Throwable -> L2f
            return
        La5:
            boolean r10 = r1.equals(r2)     // Catch: java.lang.Throwable -> L2f
            if (r10 != 0) goto Lb8
            java.lang.String r10 = r8.zzd     // Catch: java.lang.Throwable -> L2f
            boolean r10 = r10.equals(r1)     // Catch: java.lang.Throwable -> L2f
            if (r10 != 0) goto Lb8
            r8.zzd = r1     // Catch: java.lang.Throwable -> L2f
            r8.zzb(r1, r9)     // Catch: java.lang.Throwable -> L2f
        Lb8:
            return
        Lb9:
            java.lang.String r10 = "AdMobPlusIdlessListener.onSharedPreferenceChanged"
            com.google.android.gms.internal.ads.zzbyv r0 = com.google.android.gms.ads.internal.zzt.zzh()
            r0.zzg(r9, r10)
            java.lang.String r10 = "onSharedPreferenceChanged, errorMessage = "
            com.google.android.gms.ads.internal.util.zze.zzb(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxg.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }

    public final void zza() {
        SharedPreferences sharedPreferences = this.zzb;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaQ)).booleanValue()) {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
        } else {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
        }
    }
}
