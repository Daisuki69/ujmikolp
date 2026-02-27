package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import dOYHB6.yFtIp6.svM7M6;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbcg implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;

    @VisibleForTesting
    volatile boolean zza = false;

    @Nullable
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzh = new JSONObject((String) zzbck.zza(new zzght() { // from class: com.google.android.gms.internal.ads.zzbcd
                    @Override // com.google.android.gms.internal.ads.zzght
                    public final /* synthetic */ Object zza() {
                        return svM7M6.getString(sharedPreferences, "flag_configuration", WeJson.EMPTY_MAP);
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9 A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0137, B:72:0x0145, B:73:0x014e, B:75:0x015c, B:77:0x0160, B:78:0x0163, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:88:0x0046, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00de A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0137, B:72:0x0145, B:73:0x014e, B:75:0x015c, B:77:0x0160, B:78:0x0163, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:88:0x0046, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121 A[Catch: all -> 0x000f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:13:0x0012, B:15:0x0017, B:16:0x0019, B:18:0x002b, B:19:0x002f, B:20:0x0031, B:42:0x009f, B:43:0x00a6, B:52:0x00d6, B:66:0x0121, B:79:0x016a, B:80:0x0171, B:82:0x0173, B:83:0x017a, B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0137, B:72:0x0145, B:73:0x014e, B:75:0x015c, B:77:0x0160, B:78:0x0163, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:93:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012a A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0137, B:72:0x0145, B:73:0x014e, B:75:0x015c, B:77:0x0160, B:78:0x0163, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:88:0x0046, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(android.content.Context r11) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbcg.zza(android.content.Context):void");
    }

    public final boolean zzb() {
        return this.zzi;
    }

    public final boolean zzc() {
        return this.zzj;
    }

    public final Object zzd(final zzbbz zzbbzVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                try {
                    if (!this.zza) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbbzVar.zzf();
            }
        }
        if (zzbbzVar.zzm() != 2) {
            return (zzbbzVar.zzm() == 1 && this.zzh.has(zzbbzVar.zze())) ? zzbbzVar.zzc(this.zzh) : zzbck.zza(new zzght() { // from class: com.google.android.gms.internal.ads.zzbcf
                @Override // com.google.android.gms.internal.ads.zzght
                public final /* synthetic */ Object zza() {
                    return this.zza.zzf(zzbbzVar);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbbzVar.zzf() : zzbbzVar.zza(bundle);
    }

    public final Object zze(zzbbz zzbbzVar) {
        return (this.zzd || this.zza) ? zzd(zzbbzVar) : zzbbzVar.zzf();
    }

    public final /* synthetic */ Object zzf(zzbbz zzbbzVar) {
        return zzbbzVar.zzd(this.zze);
    }
}
