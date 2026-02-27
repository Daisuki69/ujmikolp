package D;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.datasource.DataSourceBitmapLoader;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import dOYHB6.tiZVw8.numX49;
import defpackage.AbstractC1414e;
import java.io.FileOutputStream;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.Unit;
import o0.C1954a;
import org.json.JSONObject;

/* JADX INFO: renamed from: D.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC0170c implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f899b;
    public final /* synthetic */ Object c;

    public /* synthetic */ CallableC0170c(int i, Object obj, Object obj2) {
        this.f898a = i;
        this.f899b = obj;
        this.c = obj2;
    }

    private final Object a() {
        X2.d dVar = (X2.d) this.f899b;
        X2.f fVar = (X2.f) this.c;
        X2.p pVar = dVar.f6479b;
        synchronized (pVar) {
            FileOutputStream fileOutputStreamOpenFileOutput = pVar.f6521a.openFileOutput(pVar.f6522b, 0);
            try {
                fileOutputStreamOpenFileOutput.write(fVar.f6483a.toString().getBytes("UTF-8"));
            } finally {
                fileOutputStreamOpenFileOutput.close();
            }
        }
        return null;
    }

    private final Object b() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i;
        ComponentName componentNameStartService;
        Context context = (Context) this.f899b;
        Intent intent = (Intent) this.c;
        com.google.firebase.messaging.r rVarR = com.google.firebase.messaging.r.r();
        rVarR.getClass();
        if (Log.isLoggable(numX49.tnTj78("PerR"), 3)) {
            Log.d(numX49.tnTj78("Perp"), numX49.tnTj78("Per0"));
        }
        ((ArrayDeque) rVarR.e).offer(intent);
        Intent intent2 = new Intent(numX49.tnTj78("Perg"));
        intent2.setPackage(context.getPackageName());
        String strTnTj78 = numX49.tnTj78("Perf");
        synchronized (rVarR) {
            try {
                str = (String) rVarR.f9803b;
                if (str == null) {
                    ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                    if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                    } else {
                        if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                            if (str2.startsWith(".")) {
                                rVarR.f9803b = context.getPackageName() + serviceInfo.name;
                            } else {
                                rVarR.f9803b = serviceInfo.name;
                            }
                            str = (String) rVarR.f9803b;
                        }
                        Log.e("FirebaseMessaging", strTnTj78 + serviceInfo.packageName + "/" + serviceInfo.name);
                    }
                    str = null;
                }
            } finally {
            }
        }
        if (str != null) {
            if (Log.isLoggable(numX49.tnTj78("Per1"), 3)) {
                Log.d(numX49.tnTj78("Pern"), numX49.tnTj78("Perx").concat(str));
            }
            intent2.setClassName(context.getPackageName(), str);
        }
        try {
            if (rVarR.C(context)) {
                componentNameStartService = com.google.firebase.messaging.A.c(context, intent2);
            } else {
                componentNameStartService = context.startService(intent2);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                i = 404;
            } else {
                i = -1;
            }
        } catch (IllegalStateException e) {
            Log.e(numX49.tnTj78("Pers"), numX49.tnTj78("Per5") + e);
            i = TypedValues.CycleType.TYPE_VISIBILITY;
        } catch (SecurityException e7) {
            Log.e(numX49.tnTj78("PerJ"), numX49.tnTj78("PerI"), e7);
            i = TypedValues.CycleType.TYPE_CURVE_FIT;
        }
        return Integer.valueOf(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, java.lang.String] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        switch (this.f898a) {
            case 0:
                InstallReferrerClient installReferrerClient = (InstallReferrerClient) this.c;
                A7.f fVar = (A7.f) this.f899b;
                try {
                    return installReferrerClient.getInstallReferrer();
                } catch (RemoteException e) {
                    C0171d c0171d = (C0171d) fVar.c;
                    S sC = c0171d.c.c();
                    String str2 = c0171d.c.f9439a;
                    String str3 = numX49.tnTj78("PeZV") + e.getMessage();
                    sC.getClass();
                    S.g(str2, str3);
                    installReferrerClient.endConnection();
                    c0171d.e.f804k = false;
                    return null;
                }
            case 1:
                String strTnTj78 = numX49.tnTj78("PeZZ");
                String strTnTj782 = numX49.tnTj78("PeZk");
                C0176i c0176i = (C0176i) this.f899b;
                CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) c0176i.f917g;
                String str4 = (String) this.c;
                try {
                    ((o0.d) c0176i.m).getClass();
                    C1954a c1954aC = o0.d.c(str4);
                    String string = c1954aC.c.toString();
                    boolean zIsEmpty = string.isEmpty();
                    o0.c cVar = (o0.c) c0176i.f919l;
                    if (zIsEmpty) {
                        C1954a c1954aA = o0.b.a(new String[0], 512, 6);
                        cVar.b(c1954aA);
                        S sC2 = cleverTapInstanceConfig.c();
                        String str5 = cleverTapInstanceConfig.f9439a;
                        String str6 = c1954aA.f18752b;
                        sC2.getClass();
                        S.g(str5, str6);
                        return null;
                    }
                    if (c1954aC.f18751a != 0) {
                        cVar.b(c1954aC);
                    }
                    boolean zContains = string.toLowerCase().contains("identity");
                    String strTnTj783 = numX49.tnTj78("PeZB");
                    if (zContains) {
                        S sC3 = cleverTapInstanceConfig.c();
                        sC3.getClass();
                        S.s(cleverTapInstanceConfig.f9439a, strTnTj782 + string + strTnTj783);
                        return null;
                    }
                    ((C0176i) c0176i.e).p(new JSONObject().put(string, new JSONObject().put("$delete", true)), true);
                    S sC4 = cleverTapInstanceConfig.c();
                    sC4.getClass();
                    S.s(cleverTapInstanceConfig.f9439a, strTnTj78 + string + strTnTj783);
                    return null;
                } catch (Throwable th2) {
                    S sC5 = cleverTapInstanceConfig.c();
                    String strH = AbstractC1414e.h(numX49.tnTj78("PeZu"), str4);
                    String str7 = cleverTapInstanceConfig.f9439a;
                    sC5.getClass();
                    S.t(str7, strH, th2);
                    return null;
                }
            case 2:
                C0176i c0176i2 = (C0176i) this.f899b;
                o0.d dVar = (o0.d) c0176i2.m;
                CleverTapInstanceConfig cleverTapInstanceConfig2 = (CleverTapInstanceConfig) c0176i2.f917g;
                HashMap map = (HashMap) this.c;
                if (map == null || map.isEmpty()) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (String str8 : map.keySet()) {
                        Object obj = map.get(str8);
                        dVar.getClass();
                        C1954a c1954aC2 = o0.d.c(str8);
                        String string2 = c1954aC2.c.toString();
                        int i = c1954aC2.f18751a;
                        o0.c cVar2 = (o0.c) c0176i2.f919l;
                        if (i != 0) {
                            cVar2.b(c1954aC2);
                        }
                        if (string2.isEmpty()) {
                            C1954a c1954aA2 = o0.b.a(new String[0], 512, 2);
                            cVar2.b(c1954aA2);
                            S sC6 = cleverTapInstanceConfig2.c();
                            String str9 = cleverTapInstanceConfig2.f9439a;
                            String str10 = c1954aA2.f18752b;
                            sC6.getClass();
                            S.g(str9, str10);
                        } else {
                            try {
                                C1954a c1954aD = o0.d.d(1, obj);
                                Object string3 = c1954aD.c;
                                if (c1954aD.f18751a != 0) {
                                    cVar2.b(c1954aD);
                                }
                                if (string2.equalsIgnoreCase("Phone")) {
                                    try {
                                        string3 = string3.toString();
                                        String str11 = ((H) c0176i2.f918k).e().f830d;
                                        if (str11 == null || str11.isEmpty()) {
                                            if (!string3.startsWith("+")) {
                                                C1954a c1954aA3 = o0.b.a(new String[]{string3}, 512, 4);
                                                cVar2.b(c1954aA3);
                                                S sC7 = cleverTapInstanceConfig2.c();
                                                String str12 = cleverTapInstanceConfig2.f9439a;
                                                String str13 = c1954aA3.f18752b;
                                                sC7.getClass();
                                                S.g(str12, str13);
                                            }
                                        }
                                        S sC8 = cleverTapInstanceConfig2.c();
                                        String str14 = cleverTapInstanceConfig2.f9439a;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Profile phone is: ");
                                        sb2.append((Object) string3);
                                        sb2.append(" device country code is: ");
                                        if (str11 == null) {
                                            str11 = "null";
                                        }
                                        sb2.append(str11);
                                        String string4 = sb2.toString();
                                        sC8.getClass();
                                        S.s(str14, string4);
                                    } catch (Exception e7) {
                                        cVar2.b(o0.b.a(new String[0], 512, 5));
                                        S sC9 = cleverTapInstanceConfig2.c();
                                        String str15 = cleverTapInstanceConfig2.f9439a;
                                        String str16 = "Invalid phone number: " + e7.getLocalizedMessage();
                                        sC9.getClass();
                                        S.g(str15, str16);
                                    }
                                }
                                jSONObject.put(string2, string3);
                            } catch (Throwable unused) {
                                C1954a c1954aA4 = o0.b.a(new String[]{obj != null ? obj.toString() : "", string2}, 512, 3);
                                cVar2.b(c1954aA4);
                                S sC10 = cleverTapInstanceConfig2.c();
                                String str17 = cleverTapInstanceConfig2.f9439a;
                                String str18 = c1954aA4.f18752b;
                                sC10.getClass();
                                S.g(str17, str18);
                            }
                        }
                    }
                    S sC11 = cleverTapInstanceConfig2.c();
                    sC11.getClass();
                    S.s(cleverTapInstanceConfig2.f9439a, "Constructed custom profile: " + jSONObject);
                    ((C0176i) c0176i2.e).p(jSONObject, false);
                    return null;
                } catch (Throwable th3) {
                    S sC12 = cleverTapInstanceConfig2.c();
                    String str19 = cleverTapInstanceConfig2.f9439a;
                    sC12.getClass();
                    S.t(str19, numX49.tnTj78("PeZr"), th3);
                    return null;
                }
            case 3:
                C0187u c0187u = (C0187u) this.f899b;
                StringBuilder sb3 = new StringBuilder(numX49.tnTj78("PeZ2"));
                CTInboxMessage cTInboxMessage = (CTInboxMessage) this.c;
                sb3.append(cTInboxMessage.f9561l);
                sb3.append(numX49.tnTj78("PeZL"));
                S.b(sb3.toString());
                if (!c0187u.g(cTInboxMessage.f9561l).f9560k) {
                    c0187u.k(cTInboxMessage);
                    ((C0176i) c0187u.f949b.f).s(false, cTInboxMessage, null);
                }
                return null;
            case 4:
                String strTnTj784 = numX49.tnTj78("PeZb");
                CleverTapInstanceConfig cleverTapInstanceConfig3 = (CleverTapInstanceConfig) this.c;
                kotlin.jvm.internal.j.g(cleverTapInstanceConfig3, strTnTj784);
                T.b.f.h((Context) this.f899b, cleverTapInstanceConfig3.c());
                return Unit.f18162a;
            case 5:
                ((K) this.f899b).f((String) this.c);
                return null;
            case 6:
                J5.a this$0 = (J5.a) this.f899b;
                kotlin.jvm.internal.j.g(this$0, "this$0");
                return ((E.h) this$0.f2414b).b((E.a) this.c);
            case 7:
                Context context = (Context) this.f899b;
                kotlin.jvm.internal.j.g(context, numX49.tnTj78("Perl"));
                N.k this$02 = (N.k) this.c;
                kotlin.jvm.internal.j.g(this$02, "this$0");
                try {
                    context.getSharedPreferences(numX49.tnTj78("PerW"), 0).edit().putInt(numX49.tnTj78("PeZ9"), this$02.f3477g.e().f836p).commit();
                    break;
                } catch (Throwable th4) {
                    S.o(numX49.tnTj78("PeZP"), th4);
                }
                return Unit.f18162a;
            case 8:
                CTInAppNotification cTInAppNotification = (CTInAppNotification) this.c;
                N.k kVar = ((N.j) this.f899b).f3471a;
                kVar.getClass();
                String str20 = cTInAppNotification.f9475K;
                String str21 = kVar.f3481o;
                S s9 = kVar.f3480n;
                if (str20 != null) {
                    String str22 = numX49.tnTj78("Perq") + cTInAppNotification.f9475K;
                    s9.getClass();
                    S.g(str21, str22);
                } else {
                    CustomTemplateInAppData customTemplateInAppData = cTInAppNotification.f9503t;
                    O.b bVar = (customTemplateInAppData == null || (str = customTemplateInAppData.f9515a) == null) ? null : (O.b) kVar.j.f4524b.get(str);
                    String str23 = numX49.tnTj78("Perz") + AbstractC0184q.b(cTInAppNotification.f);
                    s9.getClass();
                    S.g(str21, str23);
                    if (bVar == null || bVar.c) {
                        kVar.e(cTInAppNotification);
                    } else {
                        kVar.j(cTInAppNotification);
                    }
                }
                return Unit.f18162a;
            case 9:
                W2.e eVar = (W2.e) this.f899b;
                W2.f fVar2 = (W2.f) this.c;
                X2.o oVar = eVar.h;
                synchronized (oVar.f6519b) {
                    oVar.f6518a.edit().putLong("fetch_timeout_in_seconds", fVar2.f6220a).putLong("minimum_fetch_interval_in_seconds", fVar2.f6221b).commit();
                    break;
                }
                return null;
            case 10:
                return a();
            case 11:
                return ((DataSourceBitmapLoader) this.f899b).lambda$decodeBitmap$1((byte[]) this.c);
            case 12:
                return ((DataSourceBitmapLoader) this.f899b).lambda$loadBitmap$2((Uri) this.c);
            case 13:
                return b();
            case 14:
                String str24 = (String) this.c;
                int iH = com.paymaya.common.utility.Z.h((Context) this.f899b);
                try {
                    K3.b bVarE = new z2.d(20).e(str24, C3.a.f694l, iH, iH, null);
                    int i4 = bVarE.f2589a;
                    int i6 = bVarE.f2590b;
                    int[] iArr = new int[i4 * i6];
                    for (int i10 = 0; i10 < i6; i10++) {
                        int i11 = i10 * i4;
                        for (int i12 = 0; i12 < i4; i12++) {
                            iArr[i11 + i12] = bVarE.b(i12, i10) ? -16777216 : -1;
                        }
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i4, i6, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.setPixels(iArr, 0, i4, 0, 0, i4, i6);
                    return bitmapCreateBitmap;
                } catch (Exception unused2) {
                    yk.a.e();
                    return Bitmap.createBitmap(iH, iH, Bitmap.Config.ARGB_8888);
                }
            default:
                io.split.android.client.storage.splits.d dVar2 = (io.split.android.client.storage.splits.d) this.f899b;
                ((com.google.firebase.messaging.r) dVar2.f17623a).N((io.split.android.client.storage.splits.b) this.c, dVar2.f17626g, dVar2.c);
                return Boolean.TRUE;
        }
    }
}
