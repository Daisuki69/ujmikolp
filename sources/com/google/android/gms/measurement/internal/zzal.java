package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzal extends zzje {
    private Boolean zza;
    private String zzb;
    private zzak zzc;
    private Boolean zzd;

    public zzal(zzic zzicVar) {
        super(zzicVar);
        this.zzc = zzaj.zza;
    }

    public static final long zzF() {
        return ((Long) zzfy.zzd.zzb(null)).longValue();
    }

    public static final int zzG() {
        return Math.max(0, ((Integer) zzfy.zzi.zzb(null)).intValue());
    }

    public static final long zzH() {
        return ((Integer) zzfy.zzk.zzb(null)).intValue();
    }

    public static final long zzI() {
        return ((Long) zzfy.zzR.zzb(null)).longValue();
    }

    public static final long zzJ() {
        return ((Long) zzfy.zzM.zzb(null)).longValue();
    }

    private final String zzK(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            this.zzu.zzaV().zzb().zzb("Could not find SystemProperties class", e);
            return "";
        } catch (IllegalAccessException e7) {
            this.zzu.zzaV().zzb().zzb("Could not access SystemProperties.get()", e7);
            return "";
        } catch (NoSuchMethodException e10) {
            this.zzu.zzaV().zzb().zzb("Could not find SystemProperties.get() method", e10);
            return "";
        } catch (InvocationTargetException e11) {
            this.zzu.zzaV().zzb().zzb("SystemProperties.get() threw an exception", e11);
            return "";
        }
    }

    public final String zzA() {
        return zzK("debug.firebase.analytics.app", "");
    }

    public final String zzB() {
        return zzK("debug.deferred.deeplink", "");
    }

    public final boolean zzC(String str) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(this.zzc.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzD(String str) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(this.zzc.zza(str, "measurement.event_sampling_enabled"));
    }

    @WorkerThread
    public final boolean zzE() {
        if (this.zza == null) {
            Boolean boolZzr = zzr("app_measurement_lite");
            this.zza = boolZzr;
            if (boolZzr == null) {
                this.zza = Boolean.FALSE;
            }
        }
        return this.zza.booleanValue() || !this.zzu.zzp();
    }

    public final void zza(zzak zzakVar) {
        this.zzc = zzakVar;
    }

    public final String zzb() {
        this.zzu.zzaU();
        return "FA";
    }

    public final int zzc() {
        return this.zzu.zzk().zzag(201500000, true) ? 100 : 25;
    }

    public final int zzd(@Size(min = 1) String str) {
        return zzn(str, zzfy.zzX, 25, 100);
    }

    public final int zze(String str, boolean z4) {
        if (z4) {
            return zzn(str, zzfy.zzah, 100, 500);
        }
        return 500;
    }

    public final int zzf(String str, boolean z4) {
        return Math.max(zze(str, z4), 256);
    }

    public final int zzh(@Size(min = 1) String str) {
        return zzn(str, zzfy.zzW, 500, 2000);
    }

    public final long zzi() {
        this.zzu.zzaU();
        return 133005L;
    }

    public final boolean zzj() {
        if (this.zzd == null) {
            synchronized (this) {
                try {
                    if (this.zzd == null) {
                        zzic zzicVar = this.zzu;
                        ApplicationInfo applicationInfo = zzicVar.zzaY().getApplicationInfo();
                        String myProcessName = ProcessUtils.getMyProcessName();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z4 = false;
                            if (str != null && str.equals(myProcessName)) {
                                z4 = true;
                            }
                            this.zzd = Boolean.valueOf(z4);
                        }
                        if (this.zzd == null) {
                            this.zzd = Boolean.TRUE;
                            zzicVar.zzaV().zzb().zza("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.zzd.booleanValue();
    }

    @WorkerThread
    public final String zzk(String str, zzfx zzfxVar) {
        return TextUtils.isEmpty(str) ? (String) zzfxVar.zzb(null) : (String) zzfxVar.zzb(this.zzc.zza(str, zzfxVar.zza()));
    }

    @WorkerThread
    public final long zzl(String str, zzfx zzfxVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) zzfxVar.zzb(null)).longValue();
        }
        String strZza = this.zzc.zza(str, zzfxVar.zza());
        if (TextUtils.isEmpty(strZza)) {
            return ((Long) zzfxVar.zzb(null)).longValue();
        }
        try {
            return ((Long) zzfxVar.zzb(Long.valueOf(Long.parseLong(strZza)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzfxVar.zzb(null)).longValue();
        }
    }

    @WorkerThread
    public final int zzm(String str, zzfx zzfxVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) zzfxVar.zzb(null)).intValue();
        }
        String strZza = this.zzc.zza(str, zzfxVar.zza());
        if (TextUtils.isEmpty(strZza)) {
            return ((Integer) zzfxVar.zzb(null)).intValue();
        }
        try {
            return ((Integer) zzfxVar.zzb(Integer.valueOf(Integer.parseInt(strZza)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzfxVar.zzb(null)).intValue();
        }
    }

    @WorkerThread
    public final int zzn(String str, zzfx zzfxVar, int i, int i4) {
        return Math.max(Math.min(zzm(str, zzfxVar), i4), i);
    }

    @WorkerThread
    public final double zzo(String str, zzfx zzfxVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) zzfxVar.zzb(null)).doubleValue();
        }
        String strZza = this.zzc.zza(str, zzfxVar.zza());
        if (TextUtils.isEmpty(strZza)) {
            return ((Double) zzfxVar.zzb(null)).doubleValue();
        }
        try {
            return ((Double) zzfxVar.zzb(Double.valueOf(Double.parseDouble(strZza)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzfxVar.zzb(null)).doubleValue();
        }
    }

    @WorkerThread
    public final boolean zzp(String str, zzfx zzfxVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) zzfxVar.zzb(null)).booleanValue();
        }
        String strZza = this.zzc.zza(str, zzfxVar.zza());
        return TextUtils.isEmpty(strZza) ? ((Boolean) zzfxVar.zzb(null)).booleanValue() : ((Boolean) zzfxVar.zzb(Boolean.valueOf(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(strZza)))).booleanValue();
    }

    @VisibleForTesting
    public final Bundle zzq() {
        try {
            zzic zzicVar = this.zzu;
            if (zzicVar.zzaY().getPackageManager() == null) {
                zzicVar.zzaV().zzb().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(zzicVar.zzaY()).getApplicationInfo(zzicVar.zzaY().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            zzicVar.zzaV().zzb().zza("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.zzu.zzaV().zzb().zzb("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    public final Boolean zzr(@Size(min = 1) String str) {
        Preconditions.checkNotEmpty(str);
        Bundle bundleZzq = zzq();
        if (bundleZzq == null) {
            AbstractC1173g.v(this.zzu, "Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleZzq.containsKey(str)) {
            return Boolean.valueOf(bundleZzq.getBoolean(str));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzs(@androidx.annotation.Size(min = 1) java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            android.os.Bundle r0 = r3.zzq()
            r1 = 0
            if (r0 != 0) goto L15
            com.google.android.gms.measurement.internal.zzic r4 = r3.zzu
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            com.google.android.gms.internal.ads.AbstractC1173g.v(r4, r0)
        L13:
            r4 = r1
            goto L24
        L15:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L1c
            goto L13
        L1c:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L24:
            if (r4 == 0) goto L50
            com.google.android.gms.measurement.internal.zzic r0 = r3.zzu     // Catch: android.content.res.Resources.NotFoundException -> L40
            android.content.Context r0 = r0.zzaY()     // Catch: android.content.res.Resources.NotFoundException -> L40
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L40
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L40
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L40
            if (r4 != 0) goto L3b
            return r1
        L3b:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L40
            return r4
        L40:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzic r0 = r3.zzu
            com.google.android.gms.measurement.internal.zzgu r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgs r0 = r0.zzb()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.zzb(r2, r4)
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzs(java.lang.String):java.util.List");
    }

    public final boolean zzt() {
        this.zzu.zzaU();
        Boolean boolZzr = zzr("firebase_analytics_collection_deactivated");
        return boolZzr != null && boolZzr.booleanValue();
    }

    public final boolean zzu() {
        Boolean boolZzr = zzr("google_analytics_adid_collection_enabled");
        return boolZzr == null || boolZzr.booleanValue();
    }

    public final boolean zzv() {
        Boolean boolZzr = zzr("google_analytics_automatic_screen_reporting_enabled");
        return boolZzr == null || boolZzr.booleanValue();
    }

    public final zzji zzw(String str, boolean z4) {
        Object obj;
        Preconditions.checkNotEmpty(str);
        zzic zzicVar = this.zzu;
        Bundle bundleZzq = zzq();
        if (bundleZzq == null) {
            AbstractC1173g.v(zzicVar, "Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleZzq.get(str);
        }
        if (obj == null) {
            return zzji.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return zzji.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return zzji.DENIED;
        }
        if (z4 && "eu_consent_policy".equals(obj)) {
            return zzji.POLICY;
        }
        zzicVar.zzaV().zze().zzb("Invalid manifest metadata for", str);
        return zzji.UNINITIALIZED;
    }

    public final boolean zzx() {
        Boolean boolZzr = zzr("google_analytics_sgtm_upload_enabled");
        if (boolZzr == null) {
            return false;
        }
        return boolZzr.booleanValue();
    }

    public final void zzy(String str) {
        this.zzb = str;
    }

    public final String zzz() {
        return this.zzb;
    }
}
