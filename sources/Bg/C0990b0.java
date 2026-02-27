package bg;

import ag.AbstractC0693c;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1112C;
import java.util.HashMap;

/* JADX INFO: renamed from: bg.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0990b0 extends AbstractC0693c {
    public static final C0960E e;
    public static final C0960E f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0960E f8922g;
    public static final C0960E h;
    public static final C0960E i;
    public static final C0960E j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0960E f8923k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0960E f8924l;
    public static final C0960E m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0960E f8925n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0960E f8926o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0960E f8927p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0960E f8928q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0960E f8929r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0960E f8930s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0960E f8931t;
    public final InterfaceC1033d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0965G0 f8932d;

    static {
        C1112C c1112c = C1112C.f9377a;
        e = new C0960E(1, c1112c, c1112c, 0, 0, 120);
        f = new C0960E(2, c1112c, c1112c, 0, 0, 120);
        f8922g = new C0960E(3, c1112c, c1112c, 0, 0, 120);
        h = new C0960E(4, c1112c, c1112c, 0, 0, 120);
        i = new C0960E(5, c1112c, c1112c, 0, 0, 120);
        j = new C0960E(8, c1112c, c1112c, 0, 0, 120);
        f8923k = new C0960E(9, c1112c, c1112c, 0, 0, 120);
        f8924l = new C0960E(10, c1112c, c1112c, 0, 0, 120);
        m = new C0960E(11, c1112c, c1112c, 0, 0, 120);
        f8925n = new C0960E(12, c1112c, c1112c, 0, 0, 120);
        f8926o = new C0960E(13, c1112c, c1112c, 0, 0, 120);
        f8927p = new C0960E(14, c1112c, c1112c, 0, 0, 120);
        f8928q = new C0960E(15, c1112c, c1112c, 0, 0, 120);
        f8929r = new C0960E(16, c1112c, c1112c, 0, 0, 120);
        f8930s = new C0960E(17, c1112c, c1112c, 0, 0, 120);
        f8931t = new C0960E(18, c1112c, c1112c, 0, 0, 120);
    }

    public C0990b0(Context context, C0965G0 c0965g0) {
        super(context, 1);
        this.f8932d = c0965g0;
        this.c = C1034e.b(new C1007k(context, 13));
        new HashMap();
    }

    public static final CameraCharacteristics h(C0990b0 c0990b0, String str) {
        c0990b0.getClass();
        try {
            CameraManager cameraManager = (CameraManager) c0990b0.c.getValue();
            if (cameraManager == null) {
                return null;
            }
            if (str == null) {
                kotlin.jvm.internal.j.l();
            }
            return cameraManager.getCameraCharacteristics(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // ag.AbstractC0693c
    public final Xf.a g() {
        return new C1009m(this.f7198b, this.f7197a, this.f8932d, 1);
    }
}
