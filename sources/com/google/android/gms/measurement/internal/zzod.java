package com.google.android.gms.measurement.internal;

import O1.S;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzod {
    private final Map zza;

    public zzod(Map map) {
        HashMap map2 = new HashMap();
        this.zza = map2;
        map2.putAll(map);
    }

    private final Bundle zzf() {
        int iZzg;
        Map map = this.zza;
        if (IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("GoogleConsent")) && (iZzg = zzg()) >= 0) {
            String str = (String) map.get("PurposeConsents");
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                String str2 = "denied";
                if (str.length() > 0) {
                    bundle.putString(zzjk.AD_STORAGE.zze, str.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str.length() > 3) {
                    bundle.putString(zzjk.AD_PERSONALIZATION.zze, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str.length() > 6 && iZzg >= 4) {
                    String str3 = zzjk.AD_USER_DATA.zze;
                    if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                        str2 = "granted";
                    }
                    bundle.putString(str3, str2);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    private final int zzg() {
        try {
            String str = (String) this.zza.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzod) {
            return zza().equalsIgnoreCase(((zzod) obj).zza());
        }
        return false;
    }

    public final int hashCode() {
        return zza().hashCode();
    }

    public final String toString() {
        return zza();
    }

    public final String zza() {
        StringBuilder sb2 = new StringBuilder();
        S s9 = zzof.zza;
        int size = s9.size();
        for (int i = 0; i < size; i++) {
            String str = (String) s9.get(i);
            Map map = this.zza;
            if (map.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(Global.SEMICOLON);
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append((String) map.get(str));
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle zzb() {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzod.zzb():android.os.Bundle");
    }

    public final String zzc() {
        String str = (String) this.zza.get("PurposeDiagnostics");
        return TextUtils.isEmpty(str) ? "200000" : str;
    }

    public final String zzd(zzod zzodVar) {
        Map map = zzodVar.zza;
        String str = (map.isEmpty() || ((String) map.get("Version")) != null) ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        Bundle bundleZzb = zzb();
        Bundle bundleZzb2 = zzodVar.zzb();
        return str.concat((bundleZzb.size() == bundleZzb2.size() && Objects.equals(bundleZzb.getString("ad_storage"), bundleZzb2.getString("ad_storage")) && Objects.equals(bundleZzb.getString("ad_personalization"), bundleZzb2.getString("ad_personalization")) && Objects.equals(bundleZzb.getString("ad_user_data"), bundleZzb2.getString("ad_user_data"))) ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
    }

    public final String zze() {
        StringBuilder sb2 = new StringBuilder(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        int i = -1;
        try {
            String str = (String) this.zza.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i < 0 || i > 4095) {
            sb2.append("00");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i >> 6));
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i & 63));
        }
        int iZzg = zzg();
        if (iZzg < 0 || iZzg > 63) {
            sb2.append("0");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iZzg));
        }
        Preconditions.checkArgument(true);
        Map map = this.zza;
        int i4 = true != IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("gdprApplies")) ? 0 : 2;
        boolean zEquals = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("EnableAdvertiserConsentMode"));
        int i6 = i4 | 4;
        if (zEquals) {
            i6 = i4 | 12;
        }
        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i6));
        return sb2.toString();
    }
}
