package com.google.android.gms.measurement.internal;

import O1.AbstractC0505d0;
import O1.AbstractC0529x;
import O1.S;
import O1.W;
import O1.X;
import O1.y0;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import dOYHB6.yFtIp6.svM7M6;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzof {
    static final S zza = S.t("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");
    public static final /* synthetic */ int zzb = 0;

    public static String zza(SharedPreferences sharedPreferences, String str) {
        try {
            return svM7M6.getString(sharedPreferences, str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static int zzb(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    @VisibleForTesting
    public static final boolean zzc(com.google.android.gms.internal.measurement.zzkp zzkpVar, X x6, X x8, AbstractC0505d0 abstractC0505d0, char[] cArr, int i, int i4, int i6, int i10, int i11, String str, String str2, String str3, boolean z4, boolean z5, boolean z8) {
        int i12;
        int i13;
        AbstractC0505d0 abstractC0505d02;
        String str4;
        zzoe zzoeVar;
        char c;
        int iZze = zze(zzkpVar, x6, x8, abstractC0505d0, cArr, i, i4, i6, i10, i11, str, str2, str3, z4, z5, true);
        if (iZze > 0) {
            i13 = i6;
            if (i13 == 1) {
                i12 = i4;
                if (i12 != 1) {
                    i13 = 1;
                } else {
                    i12 = 1;
                    i13 = 1;
                }
            } else {
                i12 = i4;
            }
            cArr[iZze] = '2';
        } else {
            i12 = i4;
            i13 = i6;
        }
        if (zzi(zzkpVar, x6, x8, abstractC0505d0, cArr, i, i12, i13, i10, i11, str, str2, str3, z4, z5, true) == com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            int i14 = i11;
            if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                abstractC0505d02 = abstractC0505d0;
                str4 = str;
                if (i14 == 1) {
                    if (abstractC0505d02.contains(str4)) {
                        if (iZze > 0 && cArr[iZze] != '2') {
                            cArr[iZze] = '1';
                        }
                        return true;
                    }
                    i14 = 1;
                }
            } else {
                abstractC0505d02 = abstractC0505d0;
                str4 = str;
            }
            if (x6.containsKey(zzkpVar) && (zzoeVar = (zzoe) x6.get(zzkpVar)) != null) {
                int iOrdinal = zzoeVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return zzi(zzkpVar, x6, x8, abstractC0505d0, cArr, i, i12, i13, i10, i14, str, str2, str3, z4, z5, true) == com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? zzh(zzkpVar, x6, x8, abstractC0505d0, cArr, i, i12, i13, i10, i14, str, str2, str3, z4, z5, true) : zzg(zzkpVar, x6, x8, abstractC0505d0, cArr, i, i12, i13, i10, i14, str, str2, str3, z4, z5, true);
                        }
                        if (iOrdinal == 3) {
                            return zzi(zzkpVar, x6, x8, abstractC0505d02, cArr, i, i12, i13, i10, i14, str4, str2, str3, z4, z5, true) == com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? zzg(zzkpVar, x6, x8, abstractC0505d0, cArr, i, i12, i13, i10, i14, str, str2, str3, z4, z5, true) : zzh(zzkpVar, x6, x8, abstractC0505d0, cArr, i, i12, i13, i10, i14, str, str2, str3, z4, z5, true);
                        }
                        c = '0';
                    } else if (zzi(zzkpVar, x6, x8, abstractC0505d0, cArr, i, i12, i13, i10, i14, str, str2, str3, z4, z5, true) != com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return zzh(zzkpVar, x6, x8, abstractC0505d0, cArr, i, i12, i13, i10, i14, str, str2, str3, z4, z5, true);
                    }
                } else if (zzi(zzkpVar, x6, x8, abstractC0505d0, cArr, i, i12, i13, i10, i14, str, str2, str3, z4, z5, true) != com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return zzg(zzkpVar, x6, x8, abstractC0505d0, cArr, i, i12, i13, i10, i14, str, str2, str3, z4, z5, true);
                }
                c = '8';
            } else {
                c = '0';
            }
        }
        if (iZze <= 0 || cArr[iZze] == '2') {
            return false;
        }
        cArr[iZze] = c;
        return false;
    }

    public static final Map zzd(X x6, X x8, AbstractC0505d0 abstractC0505d0, char[] cArr, int i, int i4, int i6, int i10, int i11, String str, String str2, String str3, boolean z4, boolean z5, boolean z8) {
        String str4;
        String str5;
        if (!z8) {
            return y0.f4618g;
        }
        com.google.android.gms.internal.measurement.zzkp zzkpVar = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        com.google.android.gms.internal.measurement.zzkq zzkqVar = (com.google.android.gms.internal.measurement.zzkq) x8.get(zzkpVar);
        com.google.android.gms.internal.measurement.zzkp zzkpVar2 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        com.google.android.gms.internal.measurement.zzkq zzkqVar2 = (com.google.android.gms.internal.measurement.zzkq) x8.get(zzkpVar2);
        com.google.android.gms.internal.measurement.zzkp zzkpVar3 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        com.google.android.gms.internal.measurement.zzkq zzkqVar3 = (com.google.android.gms.internal.measurement.zzkq) x8.get(zzkpVar3);
        com.google.android.gms.internal.measurement.zzkp zzkpVar4 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        com.google.android.gms.internal.measurement.zzkq zzkqVar4 = (com.google.android.gms.internal.measurement.zzkq) x8.get(zzkpVar4);
        W w6 = new W(4);
        w6.b("Version", ExifInterface.GPS_MEASUREMENT_2D);
        w6.b("VendorConsent", true != z4 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        w6.b("VendorLegitimateInterest", true != z5 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        if (i6 != 1) {
            str5 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            str4 = "0";
        } else {
            str4 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            str5 = str4;
        }
        w6.b("gdprApplies", str4);
        w6.b("EnableAdvertiserConsentMode", i4 != 1 ? "0" : str5);
        w6.b("PolicyVersion", String.valueOf(i10));
        w6.b("CmpSdkID", String.valueOf(i));
        w6.b("PurposeOneTreatment", i11 != 1 ? "0" : str5);
        w6.b("PublisherCC", str);
        w6.b("PublisherRestrictions1", String.valueOf(zzkqVar != null ? zzkqVar.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza()));
        w6.b("PublisherRestrictions3", String.valueOf(zzkqVar2 != null ? zzkqVar2.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza()));
        w6.b("PublisherRestrictions4", String.valueOf(zzkqVar3 != null ? zzkqVar3.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza()));
        w6.b("PublisherRestrictions7", String.valueOf(zzkqVar4 != null ? zzkqVar4.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza()));
        String strZzf = zzf(zzkpVar, x6, x8, abstractC0505d0, cArr, i, i4, i6, i10, i11, str, str2, str3, z4, z5, true);
        String strZzf2 = zzf(zzkpVar2, x6, x8, abstractC0505d0, cArr, i, i4, i6, i10, i11, str, str2, str3, z4, z5, true);
        String strZzf3 = zzf(zzkpVar3, x6, x8, abstractC0505d0, cArr, i, i4, i6, i10, i11, str, str2, str3, z4, z5, true);
        String strZzf4 = zzf(zzkpVar4, x6, x8, abstractC0505d0, cArr, i, i4, i6, i10, i11, str, str2, str3, z4, z5, true);
        AbstractC0529x.c("Purpose1", strZzf);
        AbstractC0529x.c("Purpose3", strZzf2);
        AbstractC0529x.c("Purpose4", strZzf3);
        AbstractC0529x.c("Purpose7", strZzf4);
        w6.c(y0.e(4, new Object[]{"Purpose1", strZzf, "Purpose3", strZzf2, "Purpose4", strZzf3, "Purpose7", strZzf4}, null).entrySet());
        w6.c(y0.e(5, new Object[]{"AuthorizePurpose1", true != zzc(zzkpVar, x6, x8, abstractC0505d0, cArr, i, i4, i6, i10, i11, str, str2, str3, z4, z5, true) ? "0" : str5, "AuthorizePurpose3", true != zzc(zzkpVar2, x6, x8, abstractC0505d0, cArr, i, i4, i6, i10, i11, str, str2, str3, z4, z5, true) ? "0" : str5, "AuthorizePurpose4", true != zzc(zzkpVar3, x6, x8, abstractC0505d0, cArr, i, i4, i6, i10, i11, str, str2, str3, z4, z5, true) ? "0" : str5, "AuthorizePurpose7", true == zzc(zzkpVar4, x6, x8, abstractC0505d0, cArr, i, i4, i6, i10, i11, str, str2, str3, z4, z5, true) ? str5 : "0", "PurposeDiagnostics", new String(cArr)}, null).entrySet());
        return w6.a();
    }

    private static final int zze(com.google.android.gms.internal.measurement.zzkp zzkpVar, X x6, X x8, AbstractC0505d0 abstractC0505d0, char[] cArr, int i, int i4, int i6, int i10, int i11, String str, String str2, String str3, boolean z4, boolean z5, boolean z8) {
        if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    private static final String zzf(com.google.android.gms.internal.measurement.zzkp zzkpVar, X x6, X x8, AbstractC0505d0 abstractC0505d0, char[] cArr, int i, int i4, int i6, int i10, int i11, String str, String str2, String str3, boolean z4, boolean z5, boolean z8) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str2) || str2.length() < zzkpVar.zza()) ? "0" : String.valueOf(str2.charAt(zzkpVar.zza() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= zzkpVar.zza()) {
            strValueOf = String.valueOf(str3.charAt(zzkpVar.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    private static final boolean zzg(com.google.android.gms.internal.measurement.zzkp zzkpVar, X x6, X x8, AbstractC0505d0 abstractC0505d0, char[] cArr, int i, int i4, int i6, int i10, int i11, String str, String str2, String str3, boolean z4, boolean z5, boolean z8) {
        char c;
        int iZze = zze(zzkpVar, x6, x8, abstractC0505d0, cArr, i, i4, i6, i10, i11, str, str2, str3, z4, z5, true);
        if (!z4) {
            c = '4';
        } else {
            if (str2.length() >= zzkpVar.zza()) {
                char cCharAt = str2.charAt(zzkpVar.zza() - 1);
                boolean z9 = cCharAt == '1';
                if (iZze > 0 && cArr[iZze] != '2') {
                    cArr[iZze] = cCharAt != '1' ? '6' : '1';
                }
                return z9;
            }
            c = '0';
        }
        if (iZze > 0 && cArr[iZze] != '2') {
            cArr[iZze] = c;
        }
        return false;
    }

    private static final boolean zzh(com.google.android.gms.internal.measurement.zzkp zzkpVar, X x6, X x8, AbstractC0505d0 abstractC0505d0, char[] cArr, int i, int i4, int i6, int i10, int i11, String str, String str2, String str3, boolean z4, boolean z5, boolean z8) {
        char c;
        int iZze = zze(zzkpVar, x6, x8, abstractC0505d0, cArr, i, i4, i6, i10, i11, str, str2, str3, z4, z5, true);
        if (!z5) {
            c = '5';
        } else {
            if (str3.length() >= zzkpVar.zza()) {
                char cCharAt = str3.charAt(zzkpVar.zza() - 1);
                boolean z9 = cCharAt == '1';
                if (iZze > 0 && cArr[iZze] != '2') {
                    cArr[iZze] = cCharAt != '1' ? '7' : '1';
                }
                return z9;
            }
            c = '0';
        }
        if (iZze > 0 && cArr[iZze] != '2') {
            cArr[iZze] = c;
        }
        return false;
    }

    private static final com.google.android.gms.internal.measurement.zzkq zzi(com.google.android.gms.internal.measurement.zzkp zzkpVar, X x6, X x8, AbstractC0505d0 abstractC0505d0, char[] cArr, int i, int i4, int i6, int i10, int i11, String str, String str2, String str3, boolean z4, boolean z5, boolean z8) {
        Object obj = com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED;
        Object obj2 = x8.get(zzkpVar);
        if (obj2 != null) {
            obj = obj2;
        }
        return (com.google.android.gms.internal.measurement.zzkq) obj;
    }
}
