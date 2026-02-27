package R4;

import Bj.H;
import Bj.U;
import M8.A0;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import androidx.core.content.ContextCompat;
import bj.AbstractC1039j;
import bj.C1030a;
import bj.C1037h;
import bj.C1038i;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import com.paymaya.PayMayaApplication;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.z;
import zj.C2581c;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f5471a = new j();

    public static byte[] a(String str) throws IOException {
        byte[] bytes;
        byte[] byteArray = null;
        if (str != null) {
            bytes = str.getBytes(C2581c.f21468b);
            kotlin.jvm.internal.j.f(bytes, "getBytes(...)");
        } else {
            bytes = null;
        }
        if (bytes != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.flush();
                Unit unit = Unit.f18162a;
                gZIPOutputStream.close();
                byteArray = byteArrayOutputStream.toByteArray();
            } finally {
            }
        }
        return byteArray == null ? new byte[0] : byteArray;
    }

    public static boolean d(PayMayaApplication context) throws Exception {
        kotlin.jvm.internal.j.g(context, "context");
        try {
            Object systemService = context.getSystemService("location");
            kotlin.jvm.internal.j.e(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            LocationManager locationManager = (LocationManager) systemService;
            return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network") || (Build.VERSION.SDK_INT >= 31 ? locationManager.isProviderEnabled("fused") : false);
        } catch (Exception e) {
            String strB = C1030a.b(e);
            String strC = z.a(j.class).c();
            if (strC == null) {
                strC = "LocationUtility";
            }
            A0.w(2, strB, strC);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(com.paymaya.PayMayaApplication r10, int r11, kotlin.jvm.functions.Function2 r12, ij.AbstractC1609c r13) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r13 instanceof R4.b
            if (r0 == 0) goto L13
            r0 = r13
            R4.b r0 = (R4.b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            R4.b r0 = new R4.b
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.f5457b
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.jvm.functions.Function2 r12 = r0.f5456a
            bj.AbstractC1039j.b(r13)     // Catch: java.lang.Exception -> L97 kotlinx.coroutines.TimeoutCancellationException -> L9d
            goto L84
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            bj.AbstractC1039j.b(r13)
            r13 = 30
            r2 = 2
            if (r11 > r13) goto L3c
            if (r11 >= r2) goto L3e
        L3c:
            r11 = 10
        L3e:
            java.lang.String r13 = "Timeout in Use: "
            java.lang.String r13 = We.s.f(r11, r13)
            java.lang.Class<R4.j> r5 = R4.j.class
            kotlin.jvm.internal.e r6 = kotlin.jvm.internal.z.a(r5)
            java.lang.String r6 = r6.c()
            java.lang.String r7 = "LocationUtility"
            if (r6 != 0) goto L53
            r6 = r7
        L53:
            M8.A0.w(r2, r13, r6)
            kotlin.jvm.internal.e r13 = kotlin.jvm.internal.z.a(r5)
            java.lang.String r13 = r13.c()
            if (r13 != 0) goto L61
            goto L62
        L61:
            r7 = r13
        L62:
            java.lang.String r13 = "getting current location"
            M8.A0.w(r2, r13, r7)
            com.google.android.gms.location.FusedLocationProviderClient r10 = com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(r10)     // Catch: java.lang.Exception -> L97 kotlinx.coroutines.TimeoutCancellationException -> L9d
            java.lang.String r13 = "getFusedLocationProviderClient(context)"
            kotlin.jvm.internal.j.f(r10, r13)     // Catch: java.lang.Exception -> L97 kotlinx.coroutines.TimeoutCancellationException -> L9d
            long r5 = (long) r11     // Catch: java.lang.Exception -> L97 kotlinx.coroutines.TimeoutCancellationException -> L9d
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            R4.d r11 = new R4.d     // Catch: java.lang.Exception -> L97 kotlinx.coroutines.TimeoutCancellationException -> L9d
            r11.<init>(r10, r4)     // Catch: java.lang.Exception -> L97 kotlinx.coroutines.TimeoutCancellationException -> L9d
            r0.f5456a = r12     // Catch: java.lang.Exception -> L97 kotlinx.coroutines.TimeoutCancellationException -> L9d
            r0.e = r3     // Catch: java.lang.Exception -> L97 kotlinx.coroutines.TimeoutCancellationException -> L9d
            java.lang.Object r13 = Bj.I0.b(r5, r11, r0)     // Catch: java.lang.Exception -> L97 kotlinx.coroutines.TimeoutCancellationException -> L9d
            if (r13 != r1) goto L84
            return r1
        L84:
            Location r13 = (defpackage.Location) r13     // Catch: java.lang.Exception -> L97 kotlinx.coroutines.TimeoutCancellationException -> L9d
            if (r13 == 0) goto L8e
            r12.invoke(r13, r4)     // Catch: java.lang.Exception -> L97 kotlinx.coroutines.TimeoutCancellationException -> L9d
            kotlin.Unit r10 = kotlin.Unit.f18162a     // Catch: java.lang.Exception -> L97 kotlinx.coroutines.TimeoutCancellationException -> L9d
            goto L8f
        L8e:
            r10 = r4
        L8f:
            if (r10 != 0) goto La2
            R4.a r10 = R4.a.LOCATION_NOT_FOUND     // Catch: java.lang.Exception -> L97 kotlinx.coroutines.TimeoutCancellationException -> L9d
            r12.invoke(r4, r10)     // Catch: java.lang.Exception -> L97 kotlinx.coroutines.TimeoutCancellationException -> L9d
            goto La2
        L97:
            R4.a r10 = R4.a.UNKNOWN_ERROR
            r12.invoke(r4, r10)
            goto La2
        L9d:
            R4.a r10 = R4.a.TIME_OUT
            r12.invoke(r4, r10)
        La2:
            kotlin.Unit r10 = kotlin.Unit.f18162a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.j.b(com.paymaya.PayMayaApplication, int, kotlin.jvm.functions.Function2, ij.c):java.lang.Object");
    }

    public void c(PayMayaApplication context, Function2 function2) throws Exception {
        Object objA;
        kotlin.jvm.internal.j.g(context, "context");
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") != 0 && ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            function2.invoke(null, a.PERMISSION_DENIED);
            return;
        }
        String strC = z.a(j.class).c();
        if (strC == null) {
            strC = "LocationUtility";
        }
        A0.w(2, "input validity: 300, input timeout: 10", strC);
        try {
            C1037h.a aVar = C1037h.f9166b;
            objA = Boolean.valueOf(d(context));
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        Object obj = Boolean.FALSE;
        if (objA instanceof C1038i) {
            objA = obj;
        }
        if (!((Boolean) objA).booleanValue()) {
            function2.invoke(null, a.LOCATION_SERVICE_DISABLED);
            return;
        }
        try {
            Task<Location> lastLocation = LocationServices.getFusedLocationProviderClient(context).getLastLocation();
            kotlin.jvm.internal.j.f(lastLocation, "try {\n                Lo…    throw e\n            }");
            Ij.e eVar = U.f603a;
            Gj.c cVarC = H.c(Ij.d.f2362a.plus(H.d(1)));
            String strF = androidx.camera.core.impl.a.f(300L, "validity in Use: ");
            String strC2 = z.a(j.class).c();
            A0.w(2, strF, strC2 != null ? strC2 : "LocationUtility");
            lastLocation.addOnSuccessListener(new Na.d(new g(this, cVarC, function2, context), 11)).addOnFailureListener(new Bb.c(cVarC, context, function2));
        } catch (Exception e) {
            String strB = C1030a.b(e);
            String strC3 = z.a(j.class).c();
            A0.w(2, strB, strC3 != null ? strC3 : "LocationUtility");
            throw e;
        }
    }
}
