package K3;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2603b;
    public final float c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2604d;
    public final float e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f2605g;
    public final float h;
    public final float i;

    public f(float f, float f3, float f7, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f2602a = f;
        this.f2603b = f10;
        this.c = f13;
        this.f2604d = f3;
        this.e = f11;
        this.f = f14;
        this.f2605g = f7;
        this.h = f12;
        this.i = f15;
    }

    public static f a(float f, float f3, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22) {
        f fVarB = b(f, f3, f7, f10, f11, f12, f13, f14);
        float f23 = fVarB.e;
        float f24 = fVarB.i;
        float f25 = fVarB.f;
        float f26 = fVarB.h;
        float f27 = (f23 * f24) - (f25 * f26);
        float f28 = fVarB.f2605g;
        float f29 = fVarB.f2604d;
        float f30 = (f25 * f28) - (f29 * f24);
        float f31 = (f29 * f26) - (f23 * f28);
        float f32 = fVarB.c;
        float f33 = fVarB.f2603b;
        float f34 = (f32 * f26) - (f33 * f24);
        float f35 = fVarB.f2602a;
        float f36 = (f24 * f35) - (f32 * f28);
        float f37 = (f28 * f33) - (f26 * f35);
        float f38 = (f33 * f25) - (f32 * f23);
        float f39 = (f32 * f29) - (f25 * f35);
        float f40 = (f35 * f23) - (f33 * f29);
        f fVarB2 = b(f15, f16, f17, f18, f19, f20, f21, f22);
        float f41 = fVarB2.f2602a;
        float f42 = fVarB2.f2604d;
        float f43 = fVarB2.f2605g;
        float f44 = (f43 * f38) + (f42 * f34) + (f41 * f27);
        float f45 = (f43 * f39) + (f42 * f36) + (f41 * f30);
        float f46 = f43 * f40;
        float f47 = f46 + (f42 * f37) + (f41 * f31);
        float f48 = fVarB2.f2603b;
        float f49 = fVarB2.e;
        float f50 = fVarB2.h;
        float f51 = (f50 * f38) + (f49 * f34) + (f48 * f27);
        float f52 = (f50 * f39) + (f49 * f36) + (f48 * f30);
        float f53 = f50 * f40;
        float f54 = f53 + (f49 * f37) + (f48 * f31);
        float f55 = fVarB2.c;
        float f56 = fVarB2.f;
        float f57 = f34 * f56;
        float f58 = fVarB2.i;
        return new f(f44, f45, f47, f51, f52, f54, (f38 * f58) + f57 + (f27 * f55), (f39 * f58) + (f36 * f56) + (f30 * f55), (f58 * f40) + (f56 * f37) + (f55 * f31));
    }

    public static f b(float f, float f3, float f7, float f10, float f11, float f12, float f13, float f14) {
        float f15 = ((f - f7) + f11) - f13;
        float f16 = ((f3 - f10) + f12) - f14;
        if (f15 == 0.0f && f16 == 0.0f) {
            return new f(f7 - f, f11 - f7, f, f10 - f3, f12 - f10, f3, 0.0f, 0.0f, 1.0f);
        }
        float f17 = f7 - f11;
        float f18 = f13 - f11;
        float f19 = f10 - f12;
        float f20 = f14 - f12;
        float f21 = (f17 * f20) - (f18 * f19);
        float f22 = ((f20 * f15) - (f18 * f16)) / f21;
        float f23 = ((f17 * f16) - (f15 * f19)) / f21;
        return new f((f22 * f7) + (f7 - f), (f23 * f13) + (f13 - f), f, (f22 * f10) + (f10 - f3), (f23 * f14) + (f14 - f3), f3, f22, f23, 1.0f);
    }
}
