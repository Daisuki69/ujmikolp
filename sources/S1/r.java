package S1;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.os.health.HealthStats;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import bg.C1008l;
import bj.C1034e;
import bj.EnumC1035f;
import bj.InterfaceC1033d;
import cj.C1112C;
import cj.C1132s;
import cj.M;
import com.dynatrace.android.agent.Global;
import com.paymaya.domain.model.ImageUrl;
import com.paymaya.domain.model.KycFileContent;
import com.paymaya.domain.model.KycPart;
import com.paymaya.domain.model.UpdateProfileFieldType;
import com.paymaya.domain.model.UpdateProfileValidationResult;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileUpdateFragment;
import hh.InterfaceC1568a;
import hh.InterfaceC1573f;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import java.io.File;
import java.io.FileOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lh.C1834e;
import lh.C1840k;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;
import sc.AbstractC2250a;
import zj.C2576A;
import zj.C2578C;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SharedPreferences f5623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f5624b;

    public static final Map A(Le.e eVar) {
        kotlin.jvm.internal.j.g(eVar, "<this>");
        if (eVar instanceof Le.d) {
            Le.d dVar = (Le.d) eVar;
            return M.h(new Pair("code", dVar.f2967a), new Pair("dataReferenceId", dVar.f2968b), new Pair("hasPermissions", dVar.c));
        }
        if (!(eVar instanceof Le.c)) {
            throw new NoWhenBranchMatchedException();
        }
        Le.c cVar = (Le.c) eVar;
        return M.h(new Pair("code", cVar.f2965a), new Pair("hasPermissions", cVar.f2966b));
    }

    public static int B(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
            default:
                return 0;
            case 16:
                return 17;
        }
    }

    public static String a(C1008l c1008l, C1008l c1008l2, int i) {
        HealthStats _healthStats = androidx.webkit.internal.a.j(c1008l.f9092d.getValue());
        kotlin.jvm.internal.j.c(_healthStats, "_healthStats");
        return C1008l.i(c1008l2, _healthStats, i);
    }

    public static final void b(A7.f fVar, String str, String str2, String str3) throws NoSuchAlgorithmException, InvalidKeyException {
        String strA = F5.b.a(str, "corrs_".concat(str3), str2);
        LinkedHashMap linkedHashMap = (LinkedHashMap) fVar.f210b;
        linkedHashMap.put("x-banner-correlation", strA);
        linkedHashMap.put(MPDbAdapter.KEY_TOKEN, str3);
    }

    public static final void c(A7.f fVar, String str, String str2, String str3) throws NoSuchAlgorithmException, InvalidKeyException {
        if (str3 == null) {
            str3 = "";
        }
        StringBuilder sbX = We.s.x("corrt_", C2578C.f0(6, str3), Global.UNDERSCORE, Ke.d.c(), Global.UNDERSCORE);
        sbX.append((String) fVar.c);
        ((LinkedHashMap) fVar.f210b).put("x-banner-correlation", F5.b.a(str, sbX.toString(), str2));
    }

    public static FlutterEngine d(Context context, String engineId) {
        kotlin.jvm.internal.j.g(engineId, "engineId");
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        kotlin.jvm.internal.j.f(flutterEngineCache, "getInstance(...)");
        FlutterEngine flutterEngine = flutterEngineCache.get(engineId);
        if (flutterEngine != null) {
            return flutterEngine;
        }
        FlutterEngine flutterEngine2 = new FlutterEngine(context);
        flutterEngineCache.put(engineId, flutterEngine2);
        return flutterEngine2;
    }

    public static void e(File file, String str) {
        File[] fileArrListFiles;
        try {
            File file2 = new File(file, "kycids");
            if (file2.exists() && (fileArrListFiles = file2.listFiles()) != null) {
                for (File file3 : fileArrListFiles) {
                    String name = file3.getName();
                    kotlin.jvm.internal.j.f(name, "getName(...)");
                    if (zj.z.w(name, 2, str, false)) {
                        String name2 = file3.getName();
                        kotlin.jvm.internal.j.f(name2, "getName(...)");
                        if (zj.z.n(name2, 2, ".jpg", false)) {
                            file3.delete();
                            yk.a.f();
                        }
                    }
                }
            }
        } catch (Exception unused) {
            "Failed to cleanup session: ".concat(str);
            yk.a.d();
        }
    }

    public static void f(String str) {
        if (f5624b) {
            Log.d("Glimpse", str, null);
        }
    }

    public static void g(final MayaDropDown mayaDropDown, final UpdateProfileFieldType fieldType, final Function1 function1, final Function2 function2) {
        kotlin.jvm.internal.j.g(fieldType, "fieldType");
        mayaDropDown.setTag(fieldType);
        mayaDropDown.getDisplayText().setOnFocusChangeListener(new View.OnFocusChangeListener(function2, fieldType) { // from class: yc.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.i f21137b;
            public final /* synthetic */ UpdateProfileFieldType c;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f21137b = (kotlin.jvm.internal.i) function2;
                this.c = fieldType;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.i] */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z4) {
                if (z4) {
                    view.callOnClick();
                } else {
                    if (z4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List list = MayaUserProfileUpdateFragment.f14261f0;
                    MayaDropDown mayaDropDown2 = this.f21136a;
                    AbstractC2250a.d(mayaDropDown2, (UpdateProfileValidationResult) this.f21137b.invoke(this.c, mayaDropDown2.getSelectedData()));
                }
            }
        });
        final int i = 0;
        Ke.b.b(mayaDropDown.getDisplayText(), new Function0(function1, mayaDropDown, i) { // from class: yc.x

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f21138a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.i f21139b;
            public final /* synthetic */ MayaDropDown c;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f21138a = i;
                this.f21139b = (kotlin.jvm.internal.i) function1;
                this.c = mayaDropDown;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ?? r02 = this.f21139b;
                MayaDropDown mayaDropDown2 = this.c;
                switch (this.f21138a) {
                    case 0:
                        List list = MayaUserProfileUpdateFragment.f14261f0;
                        r02.invoke(mayaDropDown2.getSelectedData());
                        mayaDropDown2.requestFocus();
                        break;
                    default:
                        List list2 = MayaUserProfileUpdateFragment.f14261f0;
                        r02.invoke(mayaDropDown2.getSelectedData());
                        mayaDropDown2.requestFocus();
                        break;
                }
                return Unit.f18162a;
            }
        });
        final int i4 = 1;
        Ke.b.b(mayaDropDown.getLayoutContainer(), new Function0(function1, mayaDropDown, i4) { // from class: yc.x

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f21138a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.i f21139b;
            public final /* synthetic */ MayaDropDown c;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f21138a = i4;
                this.f21139b = (kotlin.jvm.internal.i) function1;
                this.c = mayaDropDown;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ?? r02 = this.f21139b;
                MayaDropDown mayaDropDown2 = this.c;
                switch (this.f21138a) {
                    case 0:
                        List list = MayaUserProfileUpdateFragment.f14261f0;
                        r02.invoke(mayaDropDown2.getSelectedData());
                        mayaDropDown2.requestFocus();
                        break;
                    default:
                        List list2 = MayaUserProfileUpdateFragment.f14261f0;
                        r02.invoke(mayaDropDown2.getSelectedData());
                        mayaDropDown2.requestFocus();
                        break;
                }
                return Unit.f18162a;
            }
        });
    }

    public static final Object h(io.ktor.utils.io.w wVar, AbstractC1609c abstractC1609c) throws Throwable {
        kotlin.jvm.internal.j.g(wVar, "<this>");
        Throwable thB = wVar.b();
        if (thB != null) {
            throw thB;
        }
        io.ktor.utils.io.k kVar = wVar instanceof io.ktor.utils.io.k ? (io.ktor.utils.io.k) wVar : null;
        if (kVar == null || !kVar.f17534b) {
            Mj.a aVarE = wVar.e();
            kotlin.jvm.internal.j.g(aVarE, "<this>");
            if (((int) aVarE.c) < 1048576) {
                return Unit.f18162a;
            }
        }
        Object objC = wVar.c(abstractC1609c);
        return objC == EnumC1578a.f17050a ? objC : Unit.f18162a;
    }

    public static String i(MayaProfileInputLayout mayaProfileInputLayout) {
        kotlin.jvm.internal.j.g(mayaProfileInputLayout, "<this>");
        return String.valueOf(mayaProfileInputLayout.getInputEditText().getText());
    }

    public static E8.z j(File file, String str) {
        File[] fileArrListFiles;
        try {
            File file2 = new File(file, "kycids");
            if (file2.exists() && (fileArrListFiles = file2.listFiles()) != null) {
                ArrayList<File> arrayList = new ArrayList();
                for (File file3 : fileArrListFiles) {
                    String name = file3.getName();
                    kotlin.jvm.internal.j.f(name, "getName(...)");
                    if (zj.z.w(name, 2, str, false)) {
                        String name2 = file3.getName();
                        kotlin.jvm.internal.j.f(name2, "getName(...)");
                        if (zj.z.n(name2, 2, ".jpg", false)) {
                            arrayList.add(file3);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(cj.t.l(arrayList, 10));
                for (File file4 : arrayList) {
                    kotlin.jvm.internal.j.d(file4);
                    String name3 = file4.getName();
                    kotlin.jvm.internal.j.f(name3, "getName(...)");
                    arrayList2.add(C2576A.a0(name3, "."));
                }
                if (!arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (C2576A.z((String) obj, "_primary_", false, 2)) {
                            arrayList3.add(obj);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : arrayList2) {
                        if (C2576A.z((String) obj2, "_secondary_", false, 2)) {
                            arrayList4.add(obj2);
                        }
                    }
                    return new E8.z(arrayList3, arrayList4, str);
                }
            }
            return null;
        } catch (Exception unused) {
            "Failed to retrieve stored session: ".concat(str);
            yk.a.d();
            return null;
        }
    }

    public static File k(File file, String str) {
        File file2 = new File(file, "kycids");
        if (!file2.exists() && !file2.mkdirs()) {
            yk.a.c();
            return null;
        }
        File file3 = new File(androidx.media3.datasource.cache.c.l(file2.getPath(), File.separator, str, ".jpg"));
        if (!file3.exists() || file3.delete()) {
            return file3;
        }
        file3.getName();
        yk.a.c();
        return null;
    }

    public static boolean l(Camera camera) {
        List<String> supportedFlashModes;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters.getFlashMode() != null && (supportedFlashModes = parameters.getSupportedFlashModes()) != null && !supportedFlashModes.isEmpty() && (supportedFlashModes.size() != 1 || !supportedFlashModes.get(0).equals(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.m))) {
                return true;
            }
        }
        return false;
    }

    public static Boolean m(com.google.gson.q qVar, String str) {
        if (!qVar.f10034a.containsKey(str)) {
            return null;
        }
        com.google.gson.o oVarM = qVar.m(str);
        oVarM.getClass();
        if (!(oVarM instanceof com.google.gson.r)) {
            return null;
        }
        com.google.gson.o oVarM2 = qVar.m(str);
        oVarM2.getClass();
        if (oVarM2 instanceof com.google.gson.p) {
            return null;
        }
        return Boolean.valueOf(qVar.m(str).c());
    }

    public static String n(com.google.gson.q qVar, String str) {
        if (!qVar.f10034a.containsKey(str)) {
            return null;
        }
        com.google.gson.o oVarM = qVar.m(str);
        oVarM.getClass();
        if (oVarM instanceof com.google.gson.r) {
            return oVarM.j();
        }
        if (!(oVarM instanceof com.google.gson.q)) {
            return null;
        }
        return com.paymaya.common.utility.C.O((ImageUrl) com.paymaya.common.utility.A.f10366a.e(oVarM.g().m("android").toString(), ImageUrl.class));
    }

    public static Integer o(com.google.gson.q qVar) {
        if (!qVar.f10034a.containsKey("priority")) {
            return null;
        }
        com.google.gson.o oVarM = qVar.m("priority");
        oVarM.getClass();
        if (!(oVarM instanceof com.google.gson.r)) {
            return null;
        }
        com.google.gson.o oVarM2 = qVar.m("priority");
        oVarM2.getClass();
        if (oVarM2 instanceof com.google.gson.p) {
            return null;
        }
        return Integer.valueOf(qVar.m("priority").e());
    }

    public static String p(com.google.gson.q qVar, String str) {
        if (!qVar.f10034a.containsKey(str)) {
            return null;
        }
        com.google.gson.o oVarM = qVar.m(str);
        oVarM.getClass();
        if (!(oVarM instanceof com.google.gson.r)) {
            return null;
        }
        com.google.gson.o oVarM2 = qVar.m(str);
        oVarM2.getClass();
        if (oVarM2 instanceof com.google.gson.p) {
            return null;
        }
        return qVar.m(str).j();
    }

    public static boolean q(char c) {
        if (c == 160 || c == 5760) {
            return true;
        }
        return (8192 <= c && c <= 8203) || c == 8239 || c == 8287 || c == 12288;
    }

    public static final List r(String str) {
        int i;
        Pair pair;
        Pair pair2;
        if (str == null) {
            return C1112C.f9377a;
        }
        InterfaceC1033d interfaceC1033dA = C1034e.a(EnumC1035f.c, new A5.j(14));
        for (int i4 = 0; i4 <= C2576A.B(str); i4 = i) {
            InterfaceC1033d interfaceC1033dA2 = C1034e.a(EnumC1035f.c, new A5.j(15));
            Integer numValueOf = null;
            i = i4;
            while (true) {
                if (i <= C2576A.B(str)) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == ',') {
                        ((ArrayList) interfaceC1033dA.getValue()).add(new Ng.h(y(i4, numValueOf != null ? numValueOf.intValue() : i, str), interfaceC1033dA2.isInitialized() ? (List) interfaceC1033dA2.getValue() : C1112C.f9377a));
                        i++;
                    } else if (cCharAt != ';') {
                        i++;
                    } else {
                        if (numValueOf == null) {
                            numValueOf = Integer.valueOf(i);
                        }
                        int i6 = i + 1;
                        int i10 = i6;
                        while (i10 <= C2576A.B(str)) {
                            char cCharAt2 = str.charAt(i10);
                            if (cCharAt2 == ',' || cCharAt2 == ';') {
                                s(interfaceC1033dA2, str, i6, i10, "");
                                break;
                            }
                            if (cCharAt2 != '=') {
                                i10++;
                            } else {
                                int i11 = i10 + 1;
                                if (str.length() == i11) {
                                    pair2 = new Pair(Integer.valueOf(i11), "");
                                } else {
                                    if (str.charAt(i11) == '\"') {
                                        int i12 = i10 + 2;
                                        StringBuilder sb2 = new StringBuilder();
                                        while (i12 <= C2576A.B(str)) {
                                            char cCharAt3 = str.charAt(i12);
                                            if (cCharAt3 == '\"') {
                                                int i13 = i12 + 1;
                                                int i14 = i13;
                                                while (i14 < str.length() && str.charAt(i14) == ' ') {
                                                    i14++;
                                                }
                                                if (i14 == str.length() || str.charAt(i14) == ';') {
                                                    pair = new Pair(Integer.valueOf(i13), sb2.toString());
                                                    break;
                                                }
                                            }
                                            if (cCharAt3 != '\\' || i12 >= C2576A.B(str) - 2) {
                                                sb2.append(cCharAt3);
                                                i12++;
                                            } else {
                                                sb2.append(str.charAt(i12 + 1));
                                                i12 += 2;
                                            }
                                        }
                                        Integer numValueOf2 = Integer.valueOf(i12);
                                        String string = sb2.toString();
                                        kotlin.jvm.internal.j.f(string, "toString(...)");
                                        pair = new Pair(numValueOf2, "\"".concat(string));
                                    } else {
                                        int i15 = i11;
                                        while (i15 <= C2576A.B(str)) {
                                            char cCharAt4 = str.charAt(i15);
                                            if (cCharAt4 == ',' || cCharAt4 == ';') {
                                                pair = new Pair(Integer.valueOf(i15), y(i11, i15, str));
                                                break;
                                            }
                                            i15++;
                                        }
                                        pair = new Pair(Integer.valueOf(i15), y(i11, i15, str));
                                    }
                                    pair2 = pair;
                                }
                                int iIntValue = ((Number) pair2.f18160a).intValue();
                                s(interfaceC1033dA2, str, i6, i10, (String) pair2.f18161b);
                                i = iIntValue;
                            }
                        }
                        s(interfaceC1033dA2, str, i6, i10, "");
                        i = i10;
                    }
                } else {
                    ((ArrayList) interfaceC1033dA.getValue()).add(new Ng.h(y(i4, numValueOf != null ? numValueOf.intValue() : i, str), interfaceC1033dA2.isInitialized() ? (List) interfaceC1033dA2.getValue() : C1112C.f9377a));
                }
            }
        }
        return interfaceC1033dA.isInitialized() ? (List) interfaceC1033dA.getValue() : C1112C.f9377a;
    }

    public static final void s(InterfaceC1033d interfaceC1033d, String str, int i, int i4, String str2) {
        String strY = y(i, i4, str);
        if (strY.length() == 0) {
            return;
        }
        ((ArrayList) interfaceC1033d.getValue()).add(new Ng.i(strY, str2));
    }

    public static final int t(Object obj) {
        if (obj instanceof Bitmap) {
            return ((Bitmap) obj).getByteCount() / 1024;
        }
        if (obj instanceof byte[]) {
            return ((byte[]) obj).length / 1024;
        }
        return 1;
    }

    public static boolean u(String str, String str2, File file) {
        byte[] bArrDecode;
        File fileK;
        try {
            bArrDecode = Base64.decode(str2, 0);
            fileK = k(file, str);
        } catch (Exception unused) {
            yk.a.d();
        }
        if (fileK == null) {
            return false;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(fileK);
        try {
            fileOutputStream.write(bArrDecode);
            Unit unit = Unit.f18162a;
            fileOutputStream.close();
            return true;
        } finally {
        }
    }

    public static E8.z v(File file, List list, List list2) {
        String base64;
        String base642;
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        try {
            try {
                File file2 = new File(file, "kycids");
                if (file2.exists()) {
                    nj.l.f(file2);
                    yk.a.f();
                }
            } catch (Exception unused) {
                yk.a.d();
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            if (list != null) {
                int i4 = 0;
                for (Object obj : list) {
                    int i6 = i4 + 1;
                    if (i4 < 0) {
                        C1132s.k();
                        throw null;
                    }
                    KycFileContent file3 = ((KycPart) obj).getFile();
                    if (file3 != null && (base642 = file3.getBase64()) != null) {
                        String str = string + "_primary_" + i4;
                        if (u(str, base642, file)) {
                            arrayList.add(str);
                        }
                    }
                    i4 = i6;
                }
            }
            if (list2 != null) {
                for (Object obj2 : list2) {
                    int i10 = i + 1;
                    if (i < 0) {
                        C1132s.k();
                        throw null;
                    }
                    KycFileContent file4 = ((KycPart) obj2).getFile();
                    if (file4 != null && (base64 = file4.getBase64()) != null) {
                        String str2 = string + "_secondary_" + i;
                        if (u(str2, base64, file)) {
                            arrayList2.add(str2);
                        }
                    }
                    i = i10;
                }
            }
            return new E8.z(arrayList, arrayList2, string);
        } catch (Exception unused2) {
            "Failed to store ID images for session: ".concat(string);
            yk.a.d();
            e(file, string);
            return null;
        }
    }

    public static void w(ch.l lVar, ch.r rVar) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        C1834e c1834e = new C1834e(linkedBlockingQueue);
        rVar.onSubscribe(c1834e);
        lVar.subscribe(c1834e);
        while (!c1834e.a()) {
            Object objPoll = linkedBlockingQueue.poll();
            if (objPoll == null) {
                try {
                    objPoll = linkedBlockingQueue.take();
                } catch (InterruptedException e) {
                    c1834e.dispose();
                    rVar.onError(e);
                    return;
                }
            }
            if (c1834e.a() || objPoll == C1834e.f18302b || vh.h.a(rVar, objPoll)) {
                return;
            }
        }
    }

    public static void x(ch.l lVar, InterfaceC1573f interfaceC1573f, InterfaceC1573f interfaceC1573f2, InterfaceC1568a interfaceC1568a) {
        jh.e.b(interfaceC1573f, "onNext is null");
        jh.e.b(interfaceC1573f2, "onError is null");
        jh.e.b(interfaceC1568a, "onComplete is null");
        w(lVar, new C1840k(interfaceC1573f, interfaceC1573f2, interfaceC1568a, jh.e.f17817d));
    }

    public static final String y(int i, int i4, String str) {
        String strSubstring = str.substring(i, i4);
        kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
        return C2576A.b0(strSubstring).toString();
    }

    public static final char[] z(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = str.charAt(i);
        }
        return cArr;
    }
}
