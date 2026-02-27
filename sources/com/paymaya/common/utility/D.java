package com.paymaya.common.utility;

import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import cj.C1110A;
import cj.C1132s;
import com.paymaya.domain.model.KycDocument;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.domain.model.MfaTencentErrorResult;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f10410a = cj.M.h(new Pair("0", "CONSUMER_KYC1"), new Pair(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, "CONSUMER_REKYC"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f10411b = C1132s.g(new Pair(0, "Non-HTTP Error"), new Pair(40200, "Presubmission ID Not Found"), new Pair(30100, "Session Timeout"), new Pair(1001, "Tencent Upload Error"), new Pair(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_LOCAL_REF_FAILED), "HY_LOCAL_REF_FAILED_ERROR"), new Pair(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_USER_STOPS), "HY_USER_CANCEL_ERROR"), new Pair(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_INNER_ERROR_CODE), "HY_INNER_ERROR_CODE"), new Pair(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_APP_SWITCH), "HY_DO_NOT_CHANGE_ERROR"), new Pair(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_CAMERA_PERMISSION), "HY_OPEN_CAMERA_ERROR"), new Pair(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_INIT_SDK), "HY_INIT_SDK_ERROR"), new Pair(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_FACE_DETECTION_TIMED_OUT), "HY_VERIFY_LOCAL_ERROR"), new Pair(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_PERMISSION_CHECK), "HY_PERMISSION_CHECK_ERROR"), new Pair(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_APP_STOP), "HY_APP_STOP_ERROR"), new Pair(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_LIVE_DATA), "HY_CHECK_LIVE_DATA_ERROR"), new Pair(221, "HY_INITIALIZATION_PARAMETER_EXCEPTION"), new Pair(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_LOCAL_TIME_OUT), "HY_VERIFY_LOCAL_TIME_OUT"), new Pair(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_PREPARE_TIME_OUT), "HY_PREPARE_TIME_OUT"), new Pair(224, "HY_CHECK_PERMISSION_ERROR"), new Pair(288, "HY_ILLEGAL_TOKEN"), new Pair(new IntRange(10000, 19999, 1), "Invalid Request"), new Pair(new IntRange(MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND, 49999, 1), "Resource not found"), new Pair(new IntRange(50000, 59999, 1), "Internal Server Error"));

    public static void b(EnumC1216e enumC1216e, int i, Map map, String str, String str2, Function0 function0, Function1 function1) {
        C1219h c1219hE;
        if (str != null) {
            c1219hE = C1219h.e(str);
            HashMap map2 = ((C1219h) function0.invoke()).j;
            kotlin.jvm.internal.j.f(map2, "getAttributes(...)");
            for (Map.Entry entry : map2.entrySet()) {
                c1219hE.g((String) entry.getKey(), (String) entry.getValue());
            }
        } else if (str2 != null) {
            c1219hE = (C1219h) function0.invoke();
            c1219hE.n(i);
            c1219hE.s(str2);
        } else {
            C1219h c1219h = (C1219h) function0.invoke();
            c1219h.n(i);
            c1219h.r(enumC1216e);
            c1219hE = c1219h;
        }
        for (Map.Entry entry2 : map.entrySet()) {
            c1219hE.f((EnumC1212a) entry2.getKey(), (String) entry2.getValue());
        }
        function1.invoke(c1219hE);
    }

    public static /* synthetic */ void c(D d10, EnumC1216e enumC1216e, int i, Map map, String str, Function0 function0, Function1 function1, int i4) {
        if ((i4 & 8) != 0) {
            str = null;
        }
        d10.getClass();
        b(enumC1216e, i, map, str, null, function0, function1);
    }

    public static String d(int i) {
        for (Pair pair : f10411b) {
            Object obj = pair.f18160a;
            String str = (String) pair.f18161b;
            if (obj instanceof Integer) {
                if (kotlin.jvm.internal.j.b(obj, Integer.valueOf(i))) {
                    return str;
                }
            } else if ((obj instanceof IntRange) && ((IntRange) obj).a(i)) {
                return str;
            }
        }
        return "";
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    public static void e(C1219h c1219h, com.paymaya.data.preference.a aVar, List selectedDocuments) {
        KycDocument document;
        KycDocument document2;
        kotlin.jvm.internal.j.g(selectedDocuments, "selectedDocuments");
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("partner", aVar.p());
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("branch", aVar.q());
        EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("kyc_status", aVar.l());
        EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
        String strK = aVar.k();
        kotlin.jvm.internal.j.f(strK, "getKYCLevel(...)");
        Object obj = f10410a.get(strK);
        if (obj == null) {
            obj = "";
        }
        c1219h.j.put("kyc_action", (String) obj);
        EnumC1212a enumC1212a5 = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("kycpresubmission_id", aVar.m());
        EnumC1212a enumC1212a6 = EnumC1212a.ACCOUNT_NUMBER;
        MayaEKYCSelectedDocument mayaEKYCSelectedDocument = (MayaEKYCSelectedDocument) C1110A.C(0, selectedDocuments);
        String key = null;
        String key2 = (mayaEKYCSelectedDocument == null || (document2 = mayaEKYCSelectedDocument.getDocument()) == null) ? null : document2.getKey();
        if (key2 == null) {
            key2 = "";
        }
        c1219h.j.put("idtype1", key2);
        EnumC1212a enumC1212a7 = EnumC1212a.ACCOUNT_NUMBER;
        MayaEKYCSelectedDocument mayaEKYCSelectedDocument2 = (MayaEKYCSelectedDocument) C1110A.C(1, selectedDocuments);
        if (mayaEKYCSelectedDocument2 != null && (document = mayaEKYCSelectedDocument2.getDocument()) != null) {
            key = document.getKey();
        }
        c1219h.j.put("idtype2", key != null ? key : "");
        c1219h.i();
    }

    public final void a(EnumC1216e enumC1216e, String source, boolean z4, Function0 function0, Function1 function1) {
        kotlin.jvm.internal.j.g(source, "source");
        Map mapC = cj.L.c(new Pair(EnumC1212a.SOURCE, source));
        Boolean boolValueOf = Boolean.valueOf(z4);
        if (!z4) {
            boolValueOf = null;
        }
        c(this, enumC1216e, 2, mapC, boolValueOf != null ? We.s.i(enumC1216e.name(), "_APPEAR") : null, function0, function1, 16);
    }
}
