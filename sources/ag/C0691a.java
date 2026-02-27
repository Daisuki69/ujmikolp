package ag;

import android.content.pm.FeatureInfo;
import android.hardware.Sensor;
import android.os.Build;
import bg.C1014r;
import bg.m0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ag.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0691a extends kotlin.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0691a f7178b = new C0691a(1, 0);
    public static final C0691a c = new C0691a(1, 1);
    public static final C0691a e = new C0691a(1, 2);
    public static final C0691a f = new C0691a(1, 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0691a f7179g = new C0691a(1, 4);
    public static final C0691a h = new C0691a(1, 5);
    public static final C0691a i = new C0691a(1, 6);
    public static final C0691a j = new C0691a(1, 7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0691a f7180k = new C0691a(1, 8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0691a f7181l = new C0691a(1, 9);
    public static final C0691a m = new C0691a(1, 10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0691a f7182n = new C0691a(1, 11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0691a f7183o = new C0691a(1, 12);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0691a f7184p = new C0691a(1, 13);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0691a f7185q = new C0691a(1, 14);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0691a f7186r = new C0691a(1, 15);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0691a f7187s = new C0691a(1, 16);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0691a f7188t = new C0691a(1, 17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0691a f7189u = new C0691a(1, 18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0691a f7190v = new C0691a(1, 19);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0691a f7191w = new C0691a(1, 20);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0691a f7192x = new C0691a(1, 21);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0691a f7193y = new C0691a(1, 22);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C0691a f7171B = new C0691a(1, 23);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final C0691a f7172K = new C0691a(1, 24);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final C0691a f7173P = new C0691a(1, 25);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final C0691a f7174Q = new C0691a(1, 26);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final C0691a f7175R = new C0691a(1, 27);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final C0691a f7176S = new C0691a(1, 28);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final C0691a f7177T = new C0691a(1, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0691a(int i4, int i6) {
        super(i4);
        this.f7194a = i6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        m0 m0Var;
        String name;
        switch (this.f7194a) {
            case 0:
                C0699i c0699i = (C0699i) obj;
                if (c0699i == null) {
                    kotlin.jvm.internal.j.l();
                }
                return String.valueOf(c0699i.f7208b.firstInstallTime);
            case 1:
                C0699i c0699i2 = (C0699i) obj;
                if (c0699i2 == null) {
                    kotlin.jvm.internal.j.l();
                }
                return String.valueOf(c0699i2.f7207a.flags);
            case 2:
                C0699i c0699i3 = (C0699i) obj;
                if (c0699i3 == null) {
                    kotlin.jvm.internal.j.l();
                }
                return String.valueOf(c0699i3.f7208b.lastUpdateTime);
            case 3:
                C0699i c0699i4 = (C0699i) obj;
                if (c0699i4 == null) {
                    kotlin.jvm.internal.j.l();
                }
                return c0699i4.f7208b.packageName;
            case 4:
                C0699i c0699i5 = (C0699i) obj;
                if (c0699i5 == null) {
                    kotlin.jvm.internal.j.l();
                }
                return c0699i5.f7208b.sharedUserId;
            case 5:
                C0700j c0700j = (C0700j) obj;
                if (c0700j == null) {
                    kotlin.jvm.internal.j.l();
                }
                return c0700j.f7210b;
            case 6:
                C0699i c0699i6 = (C0699i) obj;
                if (c0699i6 == null) {
                    kotlin.jvm.internal.j.l();
                }
                return String.valueOf(c0699i6.f7208b.versionCode);
            case 7:
                C0700j c0700j2 = (C0700j) obj;
                if (c0700j2 == null) {
                    kotlin.jvm.internal.j.l();
                }
                return c0700j2.f7209a;
            case 8:
                C0699i c0699i7 = (C0699i) obj;
                if (c0699i7 == null) {
                    kotlin.jvm.internal.j.l();
                }
                return c0699i7.f7208b.versionName;
            case 9:
                C0701k c0701k = (C0701k) obj;
                if (c0701k == null) {
                    kotlin.jvm.internal.j.l();
                }
                FeatureInfo[] featureInfoArr = c0701k.f7211a.reqFeatures;
                int i4 = c0701k.f7212b;
                if (featureInfoArr == null || i4 >= featureInfoArr.length) {
                    return null;
                }
                return featureInfoArr[i4].name;
            case 10:
                C0701k c0701k2 = (C0701k) obj;
                if (c0701k2 == null) {
                    kotlin.jvm.internal.j.l();
                }
                return c0701k2.f7211a.packageName;
            case 11:
                C0701k c0701k3 = (C0701k) obj;
                if (c0701k3 == null) {
                    kotlin.jvm.internal.j.l();
                }
                return c0701k3.f7211a.packageName;
            case 12:
                C0701k c0701k4 = (C0701k) obj;
                if (c0701k4 == null) {
                    kotlin.jvm.internal.j.l();
                }
                int[] iArr = c0701k4.f7211a.requestedPermissionsFlags;
                int i6 = c0701k4.f7212b;
                if (iArr == null || i6 >= iArr.length) {
                    return null;
                }
                return String.valueOf(iArr[i6]);
            case 13:
                C0701k c0701k5 = (C0701k) obj;
                if (c0701k5 == null) {
                    kotlin.jvm.internal.j.l();
                }
                String[] strArr = c0701k5.f7211a.requestedPermissions;
                int i10 = c0701k5.f7212b;
                if (strArr == null || i10 >= strArr.length) {
                    return null;
                }
                return strArr[i10];
            case 14:
                if (Build.VERSION.SDK_INT >= 31) {
                    return Build.SOC_MANUFACTURER;
                }
                return null;
            case 15:
                C1014r c1014r = (C1014r) obj;
                return String.valueOf((c1014r == null || (m0Var = c1014r.f9113b) == null) ? null : Integer.valueOf(m0Var.f9097a));
            case 16:
                Sensor sensor = (Sensor) obj;
                if (sensor != null) {
                    return String.valueOf(sensor.getFifoMaxEventCount());
                }
                return null;
            case 17:
                Sensor sensor2 = (Sensor) obj;
                if (sensor2 != null) {
                    return String.valueOf(sensor2.getFifoReservedEventCount());
                }
                return null;
            case 18:
                Sensor sensor3 = (Sensor) obj;
                if (sensor3 != null) {
                    return String.valueOf(sensor3.getHighestDirectReportRateLevel());
                }
                return null;
            case 19:
                Sensor sensor4 = (Sensor) obj;
                if (sensor4 != null) {
                    return String.valueOf(sensor4.getId());
                }
                return null;
            case 20:
                Sensor sensor5 = (Sensor) obj;
                Boolean boolValueOf = sensor5 != null ? Boolean.valueOf(sensor5.isAdditionalInfoSupported()) : null;
                return String.valueOf(boolValueOf != null ? Integer.valueOf(boolValueOf.booleanValue() ? 1 : 0) : null);
            case 21:
                Sensor sensor6 = (Sensor) obj;
                Boolean boolValueOf2 = sensor6 != null ? Boolean.valueOf(sensor6.isDynamicSensor()) : null;
                return String.valueOf(boolValueOf2 != null ? Integer.valueOf(boolValueOf2.booleanValue() ? 1 : 0) : null);
            case 22:
                Sensor sensor7 = (Sensor) obj;
                Boolean boolValueOf3 = sensor7 != null ? Boolean.valueOf(sensor7.isWakeUpSensor()) : null;
                return String.valueOf(boolValueOf3 != null ? Integer.valueOf(boolValueOf3.booleanValue() ? 1 : 0) : null);
            case 23:
                Sensor sensor8 = (Sensor) obj;
                if (sensor8 != null) {
                    return String.valueOf(sensor8.getMaxDelay());
                }
                return null;
            case 24:
                Sensor sensor9 = (Sensor) obj;
                if (sensor9 != null) {
                    return String.valueOf(sensor9.getMaximumRange());
                }
                return null;
            case 25:
                Sensor sensor10 = (Sensor) obj;
                if (sensor10 != null) {
                    return String.valueOf(sensor10.getMinDelay());
                }
                return null;
            case 26:
                Sensor sensor11 = (Sensor) obj;
                if (sensor11 == null || (name = sensor11.getName()) == null) {
                    return null;
                }
                return name;
            case 27:
                Sensor sensor12 = (Sensor) obj;
                if (sensor12 != null) {
                    return String.valueOf(sensor12.getPower());
                }
                return null;
            case 28:
                Sensor sensor13 = (Sensor) obj;
                if (sensor13 != null) {
                    return String.valueOf(sensor13.getReportingMode());
                }
                return null;
            default:
                Sensor sensor14 = (Sensor) obj;
                if (sensor14 != null) {
                    return String.valueOf(sensor14.getResolution());
                }
                return null;
        }
    }
}
