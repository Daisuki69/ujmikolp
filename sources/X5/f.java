package X5;

import A3.i;
import Ah.o;
import Bj.H;
import Ih.A;
import Ih.n;
import K8.InterfaceC0282g;
import Kh.C0310o;
import M8.U;
import Ng.l;
import Ng.w;
import Ng.y;
import S1.s;
import Xh.h;
import a.AbstractC0617a;
import android.hardware.Camera;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.common.util.g;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import cj.C1112C;
import cj.M;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment;
import d2.C1328c;
import e2.C1421c;
import h2.q;
import io.flutter.plugins.firebase.crashlytics.FlutterError;
import io.split.android.client.dtos.Partition;
import io.split.android.client.dtos.Split;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InterfaceC1789d;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.u;
import w.C2360b;
import xj.InterfaceC2488d;
import zj.C2576A;
import zj.C2579a;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Oh.c f6539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Oh.c f6540b;
    public static Uh.b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Uh.b f6541d;
    public static volatile WeakReference e;

    public static void A(AtomicLong atomicLong, long j) {
        long j6;
        long j7;
        do {
            j6 = atomicLong.get();
            if (j6 == Long.MAX_VALUE) {
                return;
            }
            j7 = j6 - j;
            if (j7 < 0) {
                s.r(new IllegalStateException(androidx.camera.core.impl.a.f(j7, "More produced than requested: ")));
                j7 = 0;
            }
        } while (!atomicLong.compareAndSet(j6, j7));
    }

    public static void B(FlutterError flutterError) {
        C1328c c1328cA = C1328c.a();
        StringBuilder sb2 = new StringBuilder("Recorded on-demand fatal events: ");
        q qVar = c1328cA.f16255a;
        C1421c c1421c = qVar.c;
        sb2.append(((AtomicInteger) c1421c.f16555b).get());
        String string = sb2.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
        String str = "Dropped on-demand fatal events: " + ((AtomicInteger) c1421c.c).get();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        qVar.f16905p.f17092a.a(new g(25, qVar, flutterError));
    }

    public static final void C(V5.c cVar, W5.b bVar, W5.e eVar) {
        Map mapE;
        h hVar;
        if (eVar == W5.e.f6314b) {
            bVar.b(cVar.i);
            cVar.i.clear();
            cVar.e = bVar;
            return;
        }
        W5.b bVar2 = cVar.e;
        if (bVar2 == null || (hVar = bVar2.c) == null || (mapE = hVar.c()) == null) {
            mapE = M.e();
        }
        bVar.b(mapE);
        cVar.f = bVar;
    }

    public static final int D(int i, int i4, String str) {
        while (i4 > i && C2579a.b(str.charAt(i4 - 1))) {
            i4--;
        }
        return i4;
    }

    public static final int E(int i, int i4, String str) {
        while (i < i4 && C2579a.b(str.charAt(i))) {
            i++;
        }
        return i;
    }

    public static float a(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float b(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static final String c(Exception exc) {
        return String.format("EXTRACTING ERROR : %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
    }

    public static void e(AtomicLong atomicLong, long j) {
        long j6;
        long j7;
        do {
            j6 = atomicLong.get();
            if (j6 == Long.MAX_VALUE) {
                return;
            } else {
                j7 = j6 + j;
            }
        } while (!atomicLong.compareAndSet(j6, j7 >= 0 ? j7 : Long.MAX_VALUE));
    }

    public static void f(Split split, Map map) {
        Set<String> set = split.sets;
        if (set == null) {
            return;
        }
        for (String str : set) {
            Set hashSet = (Set) map.get(str);
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(str, hashSet);
            }
            hashSet.add(split.name);
        }
        k(split, map);
    }

    public static final void g(y yVar, String str, int i, int i4, int i6) {
        if (i4 == -1) {
            int iE = E(i, i6, str);
            int iD = D(iE, i6, str);
            if (iD > iE) {
                String strSubstring = str.substring(iE, iD);
                j.f(strSubstring, "substring(...)");
                yVar.e(C1112C.f9377a, strSubstring);
                return;
            }
            return;
        }
        int iE2 = E(i, i4, str);
        int iD2 = D(iE2, i4, str);
        if (iD2 > iE2) {
            String strSubstring2 = str.substring(iE2, iD2);
            j.f(strSubstring2, "substring(...)");
            int iE3 = E(i4 + 1, i6, str);
            String strSubstring3 = str.substring(iE3, D(iE3, i6, str));
            j.f(strSubstring3, "substring(...)");
            yVar.j(strSubstring2, strSubstring3);
        }
    }

    public static int h(int i, int i4) {
        long j = ((long) i) + ((long) i4);
        int i6 = (int) j;
        if (j == ((long) i6)) {
            return i6;
        }
        throw new ArithmeticException(androidx.camera.core.impl.a.h("overflow: checkedAdd(", i, ", ", i4, ")"));
    }

    public static int i(int i, int i4) {
        int i6 = i - i4;
        if (i6 <= i4) {
            i6 = i4;
            i4 = i6;
        }
        int i10 = 1;
        int i11 = 1;
        while (i > i6) {
            i10 *= i;
            if (i11 <= i4) {
                i10 /= i11;
                i11++;
            }
            i--;
        }
        while (i11 <= i4) {
            i10 /= i11;
            i11++;
        }
        return i10;
    }

    public static void j(String str, Map map) {
        if (str == null) {
            return;
        }
        String lowerCase = str.toLowerCase();
        Integer num = (Integer) map.get(lowerCase);
        int iIntValue = num != null ? num.intValue() : 0;
        if (iIntValue > 1) {
            map.put(lowerCase, Integer.valueOf(iIntValue - 1));
        } else {
            map.remove(lowerCase);
        }
    }

    public static void k(Split split, Map map) {
        Set set;
        if (split.sets == null) {
            return;
        }
        for (String str : map.keySet()) {
            if (!split.sets.contains(str) && (set = (Set) map.get(str)) != null) {
                set.remove(split.name);
            }
        }
    }

    public static int l(float f, int i, int i4) {
        if (i == i4) {
            return i;
        }
        float f3 = ((i >> 24) & 255) / 255.0f;
        float f7 = ((i4 >> 24) & 255) / 255.0f;
        float fA = a(((i >> 16) & 255) / 255.0f);
        float fA2 = a(((i >> 8) & 255) / 255.0f);
        float fA3 = a((i & 255) / 255.0f);
        float fA4 = a(((i4 >> 16) & 255) / 255.0f);
        float fA5 = a(((i4 >> 8) & 255) / 255.0f);
        float fA6 = a((i4 & 255) / 255.0f);
        float fA7 = We.s.a(f7, f3, f, f3);
        float fA8 = We.s.a(fA4, fA, f, fA);
        float fA9 = We.s.a(fA5, fA2, f, fA2);
        float fA10 = We.s.a(fA6, fA3, f, fA3);
        float fB = b(fA8) * 255.0f;
        float fB2 = b(fA9) * 255.0f;
        return Math.round(b(fA10) * 255.0f) | (Math.round(fB) << 16) | (Math.round(fA7 * 255.0f) << 24) | (Math.round(fB2) << 8);
    }

    public static int m(int i) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w("X5.f", "No cameras!");
            return -1;
        }
        boolean z4 = i >= 0;
        if (!z4) {
            i = 0;
            while (i < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i++;
            }
        }
        return i < numberOfCameras ? i : z4 ? -1 : 0;
    }

    public static final Class n(InterfaceC2488d interfaceC2488d) {
        j.g(interfaceC2488d, "<this>");
        Class clsA = ((InterfaceC1789d) interfaceC2488d).a();
        j.e(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class o(InterfaceC2488d interfaceC2488d) {
        j.g(interfaceC2488d, "<this>");
        Class clsA = ((InterfaceC1789d) interfaceC2488d).a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals(TypedValues.Custom.S_FLOAT)) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static int p(int[] iArr, int i, boolean z4) {
        boolean z5;
        int[] iArr2 = iArr;
        int i4 = 0;
        for (int i6 : iArr2) {
            i4 += i6;
        }
        int length = iArr2.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = length - 1;
            if (i10 >= i13) {
                return i11;
            }
            int i14 = 1 << i10;
            i12 |= i14;
            int i15 = 1;
            while (i15 < iArr2[i10]) {
                int i16 = i4 - i15;
                int i17 = length - i10;
                int i18 = i17 - 2;
                int i19 = i(i16 - 1, i18);
                if (z4 && i12 == 0) {
                    int i20 = i17 - 1;
                    if (i16 - i20 >= i20) {
                        i19 -= i(i16 - i17, i18);
                    }
                }
                boolean z8 = true;
                if (i17 - 1 > 1) {
                    int i21 = i16 - i18;
                    int i22 = 0;
                    while (i21 > i) {
                        i22 += i((i16 - i21) - 1, i17 - 3);
                        i21--;
                        z8 = z8;
                    }
                    z5 = z8;
                    i19 -= (i13 - i10) * i22;
                } else {
                    z5 = true;
                    if (i16 > i) {
                        i19--;
                    }
                }
                i11 += i19;
                i15++;
                i12 &= ~i14;
                iArr2 = iArr;
            }
            i4 -= i15;
            i10++;
            iArr2 = iArr;
        }
    }

    public static String q(String str, String str2) {
        return We.s.k("https://console.firebase.google.com/project/", str, "/performance/app/android:", str2);
    }

    public static String r(String str, int i, List list, int i4, com.paymaya.domain.store.M m) {
        if (list.isEmpty()) {
            m.k(str, null);
            return SessionDescription.ATTR_CONTROL;
        }
        int i6 = 0;
        if (list.size() == 1 && ((Partition) list.get(0)).size == 100) {
            return ((Partition) list.get(0)).treatment;
        }
        m.k(str, null);
        int iAbs = (int) (Math.abs(s(i, i4, str) % 100) + 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Partition partition = (Partition) it.next();
            i6 += partition.size;
            if (i6 >= iAbs) {
                return partition.treatment;
            }
        }
        return SessionDescription.ATTR_CONTROL;
    }

    public static long s(int i, int i4, String str) {
        if (i4 == 2) {
            return AbstractC0617a.G(str.length(), i, str);
        }
        int iCharAt = 0;
        for (int i6 = 0; i6 < str.length(); i6++) {
            iCharAt = (iCharAt * 31) + str.charAt(i6);
        }
        return i ^ iCharAt;
    }

    public static boolean t(String plainText) {
        j.g(plainText, "plainText");
        if (z.w(plainText, 2, "[", false) && z.n(plainText, 2, "]", false)) {
            return true;
        }
        return z.w(plainText, 2, "<ct<", false) && z.n(plainText, 2, ">ct>", false);
    }

    public static void u(InterfaceC0282g interfaceC0282g, Function0 function0) {
        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) interfaceC0282g;
        mayaKycCompletePersonalInformationFragment.getClass();
        u uVar = new u();
        uVar.f18191a = true;
        H.w(LifecycleOwnerKt.getLifecycleScope(mayaKycCompletePersonalInformationFragment), null, null, new U(uVar, mayaKycCompletePersonalInformationFragment, function0, null), 3);
    }

    public static int v(int i) {
        int i4 = i % 65536;
        return i4 >= 0 ? i4 : i4 + 65536;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(Og.f r7, io.ktor.utils.io.k r8, ij.AbstractC1609c r9) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X5.f.w(Og.f, io.ktor.utils.io.k, ij.c):java.lang.Object");
    }

    public static w x(String query) {
        int i;
        int i4 = 0;
        j.g(query, "query");
        if (C2576A.B(query) < 0) {
            w.f4448b.getClass();
            return Ng.g.c;
        }
        l lVar = w.f4448b;
        y yVar = new y(0);
        int iB = C2576A.B(query);
        int i6 = -1;
        if (iB >= 0) {
            int i10 = 0;
            i = 0;
            int i11 = -1;
            while (i4 != 1000) {
                char cCharAt = query.charAt(i10);
                if (cCharAt == '&') {
                    g(yVar, query, i, i11, i10);
                    i = i10 + 1;
                    i4++;
                    i11 = -1;
                } else if (cCharAt == '=' && i11 == -1) {
                    i11 = i10;
                }
                if (i10 != iB) {
                    i10++;
                } else {
                    i6 = i11;
                }
            }
            Map values = (Map) yVar.f5552b;
            j.g(values, "values");
            return new Ng.z(values);
        }
        i = 0;
        if (i4 != 1000) {
            g(yVar, query, i, i6, query.length());
        }
        Map values2 = (Map) yVar.f5552b;
        j.g(values2, "values");
        return new Ng.z(values2);
    }

    public static final Uh.b y(Function0 function0, Function0 function02, Function0 function03) {
        Uh.b bVar = new Uh.b(U5.a.f5943b);
        U8.c cVar = new U8.c(3, function0, function02, function03);
        new C0310o(bVar, new C2360b(cVar, 21), new A5.l(cVar, 18), new V2.c(cVar, 21)).f();
        return bVar;
    }

    public static final n z(i iVar, String str, W5.e eVar, Function0 function0, Function1 function1) {
        X2.h hVar = new X2.h(iVar, str, eVar, function1, function0);
        int i = Ah.d.f312a;
        Ih.f fVar = new Ih.f(hVar);
        Nh.j jVar = Th.e.c;
        Objects.requireNonNull(jVar, "scheduler is null");
        A a8 = new A(fVar, jVar, false);
        o oVarA = zh.b.a();
        int i4 = Ah.d.f312a;
        Eh.d.a(i4, "bufferSize");
        return new n(a8, oVarA, i4, 1);
    }

    public abstract List d(String str, List list);
}
