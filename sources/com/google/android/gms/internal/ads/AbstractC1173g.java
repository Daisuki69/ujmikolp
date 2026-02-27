package com.google.android.gms.internal.ads;

import com.paymaya.domain.model.ConfidenceThreshold;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import pg.C2038a;
import u2.C2294b;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1173g {
    public static C2294b A(int i, C2038a c2038a) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar.zza(i);
        c2038a.l(zzfaVar.zzb());
        return c2038a.f();
    }

    public static void B(com.google.android.gms.measurement.internal.zzic zzicVar, String str) {
        zzicVar.zzaV().zze().zza(str);
    }

    public static int C(int i, int i4, int i6) {
        return com.google.android.gms.internal.measurement.zzlm.zzz(i) + i4 + i6;
    }

    public static C2294b D(int i, C2038a c2038a) {
        com.google.android.gms.internal.mlkit_vision_face_bundled.zzbi zzbiVar = new com.google.android.gms.internal.mlkit_vision_face_bundled.zzbi();
        zzbiVar.zza(i);
        c2038a.l(zzbiVar.zzb());
        return c2038a.f();
    }

    public static int E(int i, int i4, int i6) {
        return com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn.zzA(i) + i4 + i6;
    }

    public static int F(int i, int i4, int i6) {
        return com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc.zzz(i) + i4 + i6;
    }

    public static /* synthetic */ String G(int i) {
        switch (i) {
            case 1:
                return "ALLOWED";
            case 2:
                return "APPEAR";
            case 3:
                return "EXPANDED";
            case 4:
                return "VIEWED";
            case 5:
                return "CONFIRMATION";
            case 6:
                return "DENIED";
            case 7:
                return "DURATION";
            case 8:
                return "DURATION_SHEET";
            case 9:
                return "EXIT";
            case 10:
                return "EXIT_SCREEN";
            case 11:
                return "ERROR";
            case 12:
                return "FAILURE";
            case 13:
                return "SLIDE";
            case 14:
                return "SUCCESS";
            case 15:
                return "SWIPE";
            case 16:
                return "OPENED";
            case 17:
                return "TAP";
            case 18:
                return "TAPPED";
            case 19:
                return "SELECTED";
            case 20:
                return "SHEET";
            case 21:
                return "SCREEN";
            case 22:
                return "DATA_PRIVACY_SHEET";
            case 23:
                return "START";
            case 24:
                return "COMPLETED";
            case 25:
                return "INTERRUPTED";
            case 26:
                return "UPDATE_REQUIRED";
            case 27:
                return ConfidenceThreshold.DECISION_FAILED;
            case 28:
                return "CONTINUE";
            case 29:
                return "PASS";
            case 30:
                return "FAIL";
            case 31:
                return "TAKE_PHOTO";
            case 32:
                return "APPLY";
            case 33:
                return "VIEW";
            case 34:
                return "ACCEPT";
            case 35:
                return "INVALID";
            case 36:
                return "BACK_TAPPED";
            case 37:
                return "ERROR_APPEARED";
            case 38:
                return "RESULT";
            case 39:
                return "DEFAULT";
            case 40:
                return "INPUT";
            case 41:
                return "LAUNCH";
            case 42:
                return "REQUESTED";
            case 43:
                return "REALTIME_IMAGE_FEEDBACK";
            default:
                return "null";
        }
    }

    public static final String a(int i) {
        return d(i).concat("_TAPPED");
    }

    public static final String b(int i) {
        return d(i).concat("_VIEWED");
    }

    public static /* synthetic */ String c(int i) {
        switch (i) {
            case 1:
                return "ALLOWED";
            case 2:
                return "APPEAR";
            case 3:
                return "EXPANDED";
            case 4:
                return "VIEWED";
            case 5:
                return "CONFIRMATION";
            case 6:
                return "DENIED";
            case 7:
                return "SCREEN";
            case 8:
                return "SHEET";
            case 9:
                return "EXIT";
            case 10:
                return "EXIT_SCREEN";
            case 11:
                return "ERROR";
            case 12:
                return "FAILURE";
            case 13:
                return "SLIDE";
            case 14:
                return "SUCCESS";
            case 15:
                return "SWIPE";
            case 16:
                return "OPENED";
            case 17:
                return "TAP";
            case 18:
                return "TAPPED";
            case 19:
                return "SELECTED";
            case 20:
                return "SHEET";
            case 21:
                return "SCREEN";
            case 22:
                return "DATA_PRIVACY_SHEET";
            case 23:
                return "START";
            case 24:
                return "COMPLETED";
            case 25:
                return "INTERRUPTED";
            case 26:
                return "UPDATEREQUIRED";
            case 27:
                return ConfidenceThreshold.DECISION_FAILED;
            case 28:
                return "CONTINUE";
            case 29:
                return "PASS";
            case 30:
                return "FAIL";
            case 31:
                return "TAKE_PHOTO";
            case 32:
                return "APPLY";
            case 33:
                return "VIEW";
            case 34:
                return "ACCEPT";
            case 35:
                return "INVALID";
            case 36:
                return "BACK_TAPPED";
            case 37:
                return "ERROR_APPEARED";
            case 38:
                return "RESULT";
            case 39:
                return "ACTION";
            case 40:
                return "INPUT";
            case 41:
                return "LAUNCH";
            case 42:
                return "REQUESTED";
            case 43:
                return "REALTIME_IMAGE_FEEDBACK";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String d(int i) {
        switch (i) {
            case 1:
                return "BILLS_AD";
            case 2:
                return "BILLS_BILLER";
            case 3:
                return "BILLS_CATEGORY";
            case 4:
                return "BILLS_CATEGORY_PAGE";
            case 5:
                return "BILLS_PAY_ERROR_SCREEN";
            case 6:
                return "BILLS_FAVORITES";
            case 7:
                return "BILLS_PAYMENT_FIELD_ERROR";
            case 8:
                return "BILLS_PAGE";
            case 9:
                return "BILLS_PAGE_CTA";
            case 10:
                return "BILLS_PAYMENT_FAVORITES";
            case 11:
                return "BILLS_PAYMENT_PAGE";
            case 12:
                return "BILLS_RECEIPT_PAGE";
            case 13:
                return "BILLS_SEARCH";
            case 14:
                return "BILLS_SEARCH_CTA";
            case 15:
                return "BILLS_SEARCH_LOAD_PAGE";
            case 16:
                return "BILLS_SEARCH_RESULT";
            default:
                throw null;
        }
    }

    public static int e(int i, int i4, int i6) {
        return zzhhm.zzA(i) + i4 + i6;
    }

    public static int f(int i, int i4, int i6, int i10) {
        return com.google.android.gms.internal.clearcut.zzbn.zzt(i) + i4 + i6 + i10;
    }

    public static com.google.android.gms.internal.mlkit_common.zzbc g(int i) {
        com.google.android.gms.internal.mlkit_common.zzay zzayVar = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar.zza(i);
        return zzayVar.zzb();
    }

    public static com.google.android.gms.internal.mlkit_common.zzbc h(com.google.android.gms.internal.mlkit_common.zzbc zzbcVar, HashMap map, com.google.android.gms.internal.mlkit_common.zzbc zzbcVar2, HashMap map2, int i) {
        map.put(zzbcVar.annotationType(), zzbcVar2);
        Collections.unmodifiableMap(new HashMap(map2));
        com.google.android.gms.internal.mlkit_common.zzay zzayVar = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar.zza(i);
        return zzayVar.zzb();
    }

    public static com.google.android.gms.internal.mlkit_vision_barcode.zzfe i(int i) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar.zza(i);
        return zzfaVar.zzb();
    }

    public static com.google.android.gms.internal.mlkit_vision_barcode.zzfe j(com.google.android.gms.internal.mlkit_vision_barcode.zzfe zzfeVar, HashMap map, com.google.android.gms.internal.mlkit_vision_barcode.zzfe zzfeVar2, HashMap map2, int i) {
        map.put(zzfeVar.annotationType(), zzfeVar2);
        Collections.unmodifiableMap(new HashMap(map2));
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar.zza(i);
        return zzfaVar.zzb();
    }

    public static com.google.android.gms.internal.mlkit_vision_common.zzai k(int i) {
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar.zza(i);
        return zzaeVar.zzb();
    }

    public static com.google.android.gms.internal.mlkit_vision_face.zzcu l(int i) {
        com.google.android.gms.internal.mlkit_vision_face.zzcq zzcqVar = new com.google.android.gms.internal.mlkit_vision_face.zzcq();
        zzcqVar.zza(i);
        return zzcqVar.zzb();
    }

    public static com.google.android.gms.internal.mlkit_vision_face_bundled.zzbm m(int i) {
        com.google.android.gms.internal.mlkit_vision_face_bundled.zzbi zzbiVar = new com.google.android.gms.internal.mlkit_vision_face_bundled.zzbi();
        zzbiVar.zza(i);
        return zzbiVar.zzb();
    }

    public static com.google.android.gms.internal.mlkit_vision_face_bundled.zzbm n(com.google.android.gms.internal.mlkit_vision_face_bundled.zzbm zzbmVar, HashMap map, com.google.android.gms.internal.mlkit_vision_face_bundled.zzbm zzbmVar2, HashMap map2, int i) {
        map.put(zzbmVar.annotationType(), zzbmVar2);
        Collections.unmodifiableMap(new HashMap(map2));
        com.google.android.gms.internal.mlkit_vision_face_bundled.zzbi zzbiVar = new com.google.android.gms.internal.mlkit_vision_face_bundled.zzbi();
        zzbiVar.zza(i);
        return zzbiVar.zzb();
    }

    public static Object o(com.google.android.gms.internal.measurement.zzbk zzbkVar, int i, List list, int i4) {
        com.google.android.gms.internal.measurement.zzh.zza(zzbkVar.name(), i, list);
        return list.get(i4);
    }

    public static String p(int i, int i4, int i6, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(i);
        sb2.append(str);
        sb2.append(i4);
        sb2.append(str2);
        sb2.append(i6);
        return sb2.toString();
    }

    public static String q(int i, int i4, String str) {
        StringBuilder sb2 = new StringBuilder(i);
        sb2.append(str);
        sb2.append(i4);
        return sb2.toString();
    }

    public static C2294b r(int i, C2038a c2038a) {
        com.google.android.gms.internal.mlkit_common.zzay zzayVar = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar.zza(i);
        c2038a.l(zzayVar.zzb());
        return c2038a.f();
    }

    public static void s(com.google.android.gms.internal.mlkit_common.zzbc zzbcVar, HashMap map, com.google.android.gms.internal.mlkit_common.zzbc zzbcVar2, HashMap map2) {
        map.put(zzbcVar.annotationType(), zzbcVar2);
        Collections.unmodifiableMap(new HashMap(map2));
    }

    public static void t(com.google.android.gms.internal.mlkit_vision_barcode.zzfe zzfeVar, HashMap map, com.google.android.gms.internal.mlkit_vision_barcode.zzfe zzfeVar2, HashMap map2) {
        map.put(zzfeVar.annotationType(), zzfeVar2);
        Collections.unmodifiableMap(new HashMap(map2));
    }

    public static void u(com.google.android.gms.internal.mlkit_vision_face_bundled.zzbm zzbmVar, HashMap map, com.google.android.gms.internal.mlkit_vision_face_bundled.zzbm zzbmVar2, HashMap map2) {
        map.put(zzbmVar.annotationType(), zzbmVar2);
        Collections.unmodifiableMap(new HashMap(map2));
    }

    public static void v(com.google.android.gms.measurement.internal.zzic zzicVar, String str) {
        zzicVar.zzaV().zzb().zza(str);
    }

    public static /* synthetic */ void w(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void x(String str, String str2, String str3) {
        zzds.zzc(str3, str2.concat(String.valueOf(str)));
    }

    public static int y(int i, int i4, int i6) {
        int i10 = i / i4;
        return i10 + i10 + i6;
    }

    public static int z(int i, int i4, int i6, int i10) {
        return com.google.android.gms.internal.vision.zzii.zzg(i) + i4 + i6 + i10;
    }
}
