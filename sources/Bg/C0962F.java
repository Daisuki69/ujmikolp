package bg;

import ag.AbstractC0693c;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.net.wifi.WifiInfo;
import android.os.Environment;
import android.os.StatFs;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1112C;
import cj.C1128n;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import yj.C2536a;
import zj.C2576A;
import zj.C2581c;

/* JADX INFO: renamed from: bg.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0962F extends AbstractC0693c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0960E f8731A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public static final C0960E f8732A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C0960E f8733B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public static final C0960E f8734B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C0960E f8735C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public static final C0960E f8736C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final C0960E f8737D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public static final C0960E f8738D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final C0960E f8739E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public static final C0960E f8740E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final C0960E f8741F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public static final C0960E f8742F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final C0960E f8743G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public static final C0960E f8744G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final C0960E f8745H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public static final C0960E f8746H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final C0960E f8747I;
    public static final C0960E I0;
    public static final C0960E J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public static final C0960E f8748J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final C0960E f8749K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public static final C0960E f8750K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final C0960E f8751L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final C0960E f8752M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final C0960E f8753N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final C0960E f8754O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final C0960E f8755P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final C0960E f8756Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final C0960E f8757R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final C0960E f8758S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final C0960E f8759T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final C0960E f8760U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final C0960E f8761V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final C0960E f8762W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final C0960E f8763X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final C0960E f8764Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final C0960E f8765Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final C0960E f8766a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final C0960E f8767b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final C0960E f8768c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final C0960E f8769d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final C0960E f8770e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final C0960E f8771f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final C0960E f8772g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final C0960E f8773h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final C0960E f8774i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final C0960E f8775j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final C0960E f8776k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final C0960E f8777l0;
    public static final C0960E m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final C0960E f8778n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final C0960E f8779o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final C0960E f8780p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final C0960E f8781q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final C0960E f8782r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final C0960E f8783s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0960E f8784t;
    public static final C0960E t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0960E f8785u;
    public static final C0960E u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0960E f8786v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final C0960E f8787v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0960E f8788w;
    public static final C0960E w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0960E f8789x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final C0960E f8790x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0960E f8791y;
    public static final C0960E y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0960E f8792z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final C0960E f8793z0;
    public final InterfaceC1033d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1033d f8794d;
    public final InterfaceC1033d e;
    public final InterfaceC1033d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1033d f8795g;
    public final InterfaceC1033d h;
    public final InterfaceC1033d i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f8796k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final File[] f8797l;
    public final InterfaceC1033d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC1033d f8798n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC1033d f8799o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f8800p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f8801q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n0 f8802r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0965G0 f8803s;

    static {
        List empty = Collections.EMPTY_LIST;
        cj.r.c("android.permission.CAMERA");
        List listC = cj.r.c("android.permission.ACCESS_WIFI_STATE");
        cj.r.c("android.permission.BLUETOOTH");
        List listC2 = cj.r.c("android.permission.USE_FINGERPRINT");
        kotlin.jvm.internal.j.c(empty, "empty");
        f8784t = new C0960E(1, empty, null, 0, 0, 124);
        f8785u = new C0960E(2, empty, null, 0, 0, 124);
        f8786v = new C0960E(3, empty, null, 0, 0, 124);
        f8788w = new C0960E(4, empty, null, 0, 0, 124);
        f8789x = new C0960E(5, empty, null, 0, 0, 124);
        f8791y = new C0960E(6, empty, null, 0, 0, 124);
        f8792z = new C0960E(7, empty, null, 0, 0, 124);
        f8731A = new C0960E(8, empty, null, 0, 0, 124);
        f8733B = new C0960E(9, empty, null, 0, 0, 124);
        f8735C = new C0960E(10, empty, null, 0, 0, 124);
        C1112C permissions = C1112C.f9377a;
        kotlin.jvm.internal.j.h(permissions, "permissions");
        kotlin.jvm.internal.j.h(permissions, "permissions");
        kotlin.jvm.internal.j.h(permissions, "permissions");
        kotlin.jvm.internal.j.h(permissions, "permissions");
        kotlin.jvm.internal.j.h(permissions, "permissions");
        kotlin.jvm.internal.j.h(permissions, "permissions");
        kotlin.jvm.internal.j.h(permissions, "permissions");
        f8737D = new C0960E(18, empty, null, 0, 0, 124);
        f8739E = new C0960E(19, empty, null, 0, 0, 124);
        kotlin.jvm.internal.j.h(permissions, "permissions");
        f8741F = new C0960E(21, empty, null, 0, 0, 124);
        f8743G = new C0960E(22, empty, null, 0, 0, 124);
        f8745H = new C0960E(23, empty, null, 0, 0, 124);
        f8747I = new C0960E(24, empty, null, 0, 0, 124);
        J = new C0960E(25, empty, null, 0, 0, 124);
        kotlin.jvm.internal.j.h(permissions, "permissions");
        f8749K = new C0960E(27, empty, null, 0, 0, 124);
        f8751L = new C0960E(28, empty, null, 0, 0, 124);
        f8752M = new C0960E(29, empty, null, 0, 0, 124);
        kotlin.jvm.internal.j.h(permissions, "permissions");
        f8753N = new C0960E(31, empty, null, 0, 0, 124);
        kotlin.jvm.internal.j.h(permissions, "permissions");
        kotlin.jvm.internal.j.h(permissions, "permissions");
        f8754O = new C0960E(39, empty, null, 0, 0, 124);
        f8755P = new C0960E(40, empty, listC, 0, 0, 120);
        f8756Q = new C0960E(47, empty, null, 0, 0, 124);
        f8757R = new C0960E(48, empty, listC, 0, 0, 120);
        f8758S = new C0960E(52, empty, listC, 0, 0, 120);
        f8759T = new C0960E(54, empty, listC, 0, 0, 120);
        f8760U = new C0960E(59, empty, listC, 0, 0, 120);
        f8761V = new C0960E(73, empty, empty, 0, 0, 120);
        f8762W = new C0960E(74, empty, null, 0, 0, 124);
        f8763X = new C0960E(75, empty, listC2, 23, 0, 112);
        f8764Y = new C0960E(76, empty, null, 0, 0, 124);
        f8765Z = new C0960E(77, empty, null, 0, 0, 124);
        f8766a0 = new C0960E(78, empty, null, 0, 0, 124);
        f8767b0 = new C0960E(79, empty, null, 0, 0, 124);
        f8768c0 = new C0960E(80, empty, null, 0, 0, 124);
        f8769d0 = new C0960E(81, empty, null, 0, 0, 124);
        f8770e0 = new C0960E(82, empty, null, 0, 0, 124);
        f8771f0 = new C0960E(83, empty, null, 0, 0, 124);
        f8772g0 = new C0960E(84, empty, null, 0, 0, 124);
        f8773h0 = new C0960E(85, empty, null, 0, 0, 124);
        f8774i0 = new C0960E(86, empty, null, 0, 0, 124);
        f8775j0 = new C0960E(87, empty, null, 0, 0, 124);
        f8776k0 = new C0960E(88, empty, null, 0, 0, 124);
        f8777l0 = new C0960E(89, empty, null, 0, 0, 124);
        m0 = new C0960E(90, empty, null, 0, 0, 124);
        f8778n0 = new C0960E(91, empty, null, 0, 0, 124);
        f8779o0 = new C0960E(92, empty, null, 0, 0, 124);
        f8780p0 = new C0960E(93, empty, null, 0, 0, 124);
        f8781q0 = new C0960E(98, empty, null, 0, 0, 124);
        f8782r0 = new C0960E(99, empty, null, 0, 0, 124);
        f8783s0 = new C0960E(100, empty, null, 0, 0, 124);
        t0 = new C0960E(101, empty, null, 0, 0, 124);
        u0 = new C0960E(102, empty, null, 0, 0, 124);
        f8787v0 = new C0960E(103, empty, null, 0, 0, 124);
        w0 = new C0960E(104, empty, null, 0, 0, 124);
        f8790x0 = new C0960E(105, empty, null, 0, 0, 124);
        y0 = new C0960E(106, empty, null, 0, 0, 124);
        f8793z0 = new C0960E(107, empty, null, 0, 0, 124);
        f8732A0 = new C0960E(108, empty, null, 0, 0, 124);
        f8734B0 = new C0960E(109, empty, null, 0, 0, 124);
        f8736C0 = new C0960E(110, empty, null, 0, 0, 124);
        f8738D0 = new C0960E(111, empty, null, 0, 0, 124);
        f8740E0 = new C0960E(112, empty, null, 31, 0, 116);
        f8742F0 = new C0960E(113, empty, null, 31, 0, 116);
        f8744G0 = new C0960E(114, empty, null, 31, 0, 116);
        f8746H0 = new C0960E(115, empty, null, 31, 0, 116);
        I0 = new C0960E(116, empty, null, 0, 0, 124);
        f8748J0 = new C0960E(117, empty, null, 0, 0, 124);
        f8750K0 = new C0960E(118, empty, null, 0, 0, 124);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0962F(Context context, n0 n0Var, C0965G0 c0965g0) {
        String externalStorageState;
        File[] externalFilesDirs;
        super(context, 1);
        String str = "";
        this.f8802r = n0Var;
        this.f8803s = c0965g0;
        this.c = C1034e.b(new C1007k(context, 2));
        C1034e.b(C1019w.i);
        this.f8794d = C1034e.b(new C1007k(context, 10));
        this.e = C1034e.b(new C1007k(context, 9));
        this.f = C1034e.b(new C1007k(context, 3));
        this.f8795g = C1034e.b(new C1007k(context, 6));
        this.h = C1034e.b(new C1005j(2, this, context));
        this.i = C1034e.b(new C1007k(context, 7));
        try {
            externalStorageState = Environment.getExternalStorageState();
            kotlin.jvm.internal.j.c(externalStorageState, "Environment.getExternalStorageState()");
        } catch (Exception unused) {
            externalStorageState = "";
        }
        this.j = externalStorageState;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            kotlin.jvm.internal.j.c(externalStorageDirectory, "Environment.getExternalStorageDirectory()");
            String absolutePath = externalStorageDirectory.getAbsolutePath();
            kotlin.jvm.internal.j.c(absolutePath, "Environment.getExternalS…eDirectory().absolutePath");
            str = absolutePath;
        } catch (Exception unused2) {
        }
        this.f8796k = str;
        try {
            externalFilesDirs = context.getExternalFilesDirs(null);
        } catch (Exception unused3) {
            externalFilesDirs = new File[0];
        }
        this.f8797l = externalFilesDirs;
        C1034e.b(new C1007k(context, 4));
        this.m = C1034e.b(new C1007k(context, 11));
        this.f8798n = C1034e.b(new C1007k(context, 8));
        this.f8799o = C1034e.b(new C1007k(context, 5));
        this.f8800p = -1;
        this.f8801q = "SECONDARY_STORAGE";
    }

    public static final Intent h(C0962F c0962f) {
        return (Intent) c0962f.m.getValue();
    }

    public static final String i(C0962F c0962f, String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            StatFs statFs = new StatFs(str);
            return str2.equals("Free") ? String.valueOf(((statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1024.0f) / 1024.0f) : String.valueOf(((statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 1024.0f) / 1024.0f);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final ArrayList j(C0962F c0962f, String str) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        for (int i = 0; i < iAvailableProcessors; i++) {
            File file = new File("/sys/devices/system/cpu/cpu" + i + "/cpufreq/" + str);
            if (file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), C2581c.f21468b), 8192);
                try {
                    for (String str2 : new C2536a(new C1128n(bufferedReader, 2))) {
                        if (str2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                        arrayList.add(Integer.valueOf(Integer.parseInt(C2576A.b0(str2).toString())));
                    }
                    Unit unit = Unit.f18162a;
                    bufferedReader.close();
                } finally {
                }
            }
        }
        return arrayList;
    }

    public static final String[] k(C0962F c0962f, Context context) {
        String str = System.getenv("SECONDARY_STORAGE");
        ArrayList arrayList = new ArrayList();
        for (File file : context.getExternalFilesDirs(null)) {
            if (file != null) {
                String path = file.getPath();
                kotlin.jvm.internal.j.c(path, "file.path");
                Object[] array = C2576A.T(path, new String[]{"/Android"}, 6).toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String str2 = ((String[]) array)[0];
                if (Environment.isExternalStorageRemovable(file) || (str != null && C2576A.z(str, str2, false, 2))) {
                    arrayList.add(str2);
                }
            }
        }
        Object[] array2 = arrayList.toArray(new String[0]);
        if (array2 != null) {
            return (String[]) array2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final AudioManager l(C0962F c0962f) {
        return (AudioManager) c0962f.f.getValue();
    }

    public static final WifiInfo m(C0962F c0962f) {
        return (WifiInfo) c0962f.f8798n.getValue();
    }

    @Override // ag.AbstractC0693c
    public final Xf.a g() {
        return new C0993d(this.f8802r, this.f7197a, this.f8803s, 0);
    }
}
