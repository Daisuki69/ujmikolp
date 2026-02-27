package com.shield.android.context;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import bj.AbstractC1039j;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.internal.NativeUtils;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15069d = {1456070224, 2029970633, 2062916514, 665470606, 1440553045, 2081018073, 401669211};
    private static final String fn;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b8) {
            this();
        }
    }

    public static final class b extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15070d = {889758037};

        public b(InterfaceC1526a<? super b> interfaceC1526a) {
            super(((int) f15070d[0]) ^ 889758036, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return A.this.new b(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((b) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            AbstractC1039j.b(obj);
            A a8 = A.this;
            return A.a(a8, a8.al());
        }
    }

    static {
        new a((((int) 2062916514) ^ 2062916514) == true ? (byte) 1 : (byte) 0);
        fn = ExifInterface.GPS_MEASUREMENT_IN_PROGRESS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Context context, r rVar, String str, NativeUtils nativeUtils) {
        super(context, rVar, str, nativeUtils);
        kotlin.jvm.internal.j.g(context, f("룙룔룖룍룛룇룈"));
        kotlin.jvm.internal.j.g(rVar, f("룖룔룛룘룊룖룓룓룱룜룞룅룓룏룀"));
        kotlin.jvm.internal.j.g(str, f("룘룂룈룘룍료룿룒룖룖"));
        kotlin.jvm.internal.j.g(nativeUtils, f("룔룚료룐룈룚룩룉룛룟룃"));
    }

    public static String f(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15069d[2]) ^ 2062916514;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15069d;
            long j = jArr[5];
            long j6 = jArr[3];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 2080991331) + cCharAt;
            sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 2080991331)) + (((int) j6) ^ 665470607), (~(((int) j) ^ 2080991331)) | i4, i6, (((((int) j) ^ 2080991331) + cCharAt) + (((int) j6) ^ 665470607)) + ((~(((int) j) ^ 2080991331)) | i4)) ^ (i % (((int) jArr[6]) ^ 401605540))));
            long j7 = f15069d[3];
            int i10 = ~i;
            i = i + (((int) j7) ^ 665470607) + (((int) j7) ^ 665470607) + ((~(((int) j7) ^ 665470607)) | i10) + (((((int) j7) ^ 665470607) + i) - ((((((int) j7) ^ 665470607) + i) + (((int) j7) ^ 665470607)) + ((~(((int) j7) ^ 665470607)) | i10)));
        }
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.shield.android.context.e
    public final boolean a(Context context, String str, String str2) {
        kotlin.jvm.internal.j.g(context, f("룙룔룖룍룛룇룈"));
        kotlin.jvm.internal.j.g(str, f("룛룋룈"));
        kotlin.jvm.internal.j.g(str2, f("룊룞룊룔룗료룏룔룝룝"));
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(str, 4096).requestedPermissions;
            if (strArr != null) {
                int i = ((int) f15069d[2]) ^ 2062916514;
                int length = strArr.length;
                while (i < length) {
                    if (str2.equals(strArr[i])) {
                        return ((int) f15069d[3]) ^ 665470607;
                    }
                    long j = f15069d[3];
                    int i4 = ~i;
                    i = i + (((int) j) ^ 665470607) + (((int) j) ^ 665470607) + ((~(((int) j) ^ 665470607)) | i4) + (((((int) j) ^ 665470607) + i) - ((((((int) j) ^ 665470607) + i) + (((int) j) ^ 665470607)) + ((~(((int) j) ^ 665470607)) | i4)));
                }
            }
        } catch (Exception e) {
            com.shield.android.k.a.K(ao()).a(e);
        }
        return ((int) f15069d[2]) ^ 2062916514;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.shield.android.context.e
    public final boolean b(Context context, String str, String str2) {
        kotlin.jvm.internal.j.g(context, f("룙룔룖룍룛룇룈"));
        kotlin.jvm.internal.j.g(str, f("룛룋룈"));
        kotlin.jvm.internal.j.g(str2, f("룊룞룊룔룗료룏룔룝룝"));
        try {
            ServiceInfo[] serviceInfoArr = context.getPackageManager().getPackageInfo(str, 4).services;
            if (serviceInfoArr != null) {
                int i = ((int) f15069d[2]) ^ 2062916514;
                int length = serviceInfoArr.length;
                while (i < length) {
                    if (str2.equals(serviceInfoArr[i].permission)) {
                        return ((int) f15069d[3]) ^ 665470607;
                    }
                    long j = f15069d[3];
                    int i4 = ~i;
                    i = i + (((int) j) ^ 665470607) + (((int) j) ^ 665470607) + ((~(((int) j) ^ 665470607)) | i4) + (((((int) j) ^ 665470607) + i) - ((((((int) j) ^ 665470607) + i) + (((int) j) ^ 665470607)) + ((~(((int) j) ^ 665470607)) | i4)));
                }
            }
        } catch (Exception e) {
            com.shield.android.k.a.K(ao()).a(e);
        }
        return ((int) f15069d[2]) ^ 2062916514;
    }

    @Override // com.shield.android.context.e
    public final List<g> scheduleJobs() {
        if (!com.shield.android.internal.f.bI()) {
            return super.scheduleJobs();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.scheduleJobs());
        if (an()) {
            arrayList.add(new g(fn + ((((int) f15069d[0]) ^ 1456070241) == true ? (char) 1 : (char) 0), 0L, null, new b(null), ((int) f15069d[1]) ^ 2029970639));
        }
        return arrayList;
    }

    @Override // com.shield.android.context.e
    public final String a(Context context, String str) {
        kotlin.jvm.internal.j.g(context, f("룙룔룖룍룛룇룈"));
        kotlin.jvm.internal.j.g(str, f("룊룚룛룒룟룘룙룳룓룞룕"));
        String strF = f("");
        String strF2 = f("");
        try {
            PackageManager packageManager = context.getPackageManager();
            strF = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString();
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null && launchIntentForPackage.getComponent() != null) {
                ComponentName component = launchIntentForPackage.getComponent();
                kotlin.jvm.internal.j.d(component);
                strF2 = component.getShortClassName();
            }
        } catch (Exception unused) {
        }
        if (com.shield.android.internal.i.a(strF)) {
            return str;
        }
        StringBuilder sbW = androidx.camera.core.impl.a.w(strF);
        sbW.append((((int) f15069d[4]) ^ 1440553071) == true ? (char) 1 : (char) 0);
        sbW.append(str);
        sbW.append((((int) f15069d[4]) ^ 1440553071) == true ? (char) 1 : (char) 0);
        sbW.append(strF2);
        return sbW.toString();
    }

    public static final /* synthetic */ ConcurrentHashMap a(A a8, Context context) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<ApplicationInfo> installedApplications = context.getPackageManager().getInstalledApplications(128);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (ApplicationInfo applicationInfo : installedApplications) {
            int i = applicationInfo.flags;
            long[] jArr = f15069d;
            long j = jArr[3];
            int i4 = (i & (((int) j) ^ 665470607)) != 0 ? ((int) j) ^ 665470607 : ((int) jArr[2]) ^ 2062916514;
            if (i4 != 0) {
                if ((sb3.length() > 0 ? ((int) f15069d[3]) ^ 665470607 : ((int) f15069d[2]) ^ 2062916514) != 0) {
                    sb3.append(f("뢖"));
                }
                sb3.append(applicationInfo.packageName);
            } else {
                if ((sb2.length() > 0 ? ((int) f15069d[3]) ^ 665470607 : ((int) f15069d[2]) ^ 2062916514) != 0) {
                    sb2.append(f("뢖"));
                }
                sb2.append(applicationInfo.packageName);
            }
            if (i4 == 0 && a8.b(context, applicationInfo.packageName, f("룛룕룜룋룑룖룘뢓룂룖룂룜룟룄룇룜룅룅뢆룫룧룡루룲룴룳룮룾룵룢룶룳룓룘룝"))) {
                arrayList.add(a8.a(context, applicationInfo.packageName));
            }
            if (i4 == 0 && a8.a(context, applicationInfo.packageName, f("룛룕룜룋룑룖룘뢓룂룖룂룜룟룄룇룜룅룅뢆루룭룬룩룾룱룼룭룮룥룬룻룩룕룘룙룍룗룐룒"))) {
                arrayList2.add(a8.a(context, applicationInfo.packageName));
            }
        }
        concurrentHashMap.put(a8.am().getKeyValue(f("룞룍")), sb2.toString());
        concurrentHashMap.put(a8.am().getKeyValue(f("룞룎")), sb3.toString());
        concurrentHashMap.put(a8.am().getKeyValue(f("룞료")), TextUtils.join(f("뢖"), arrayList));
        concurrentHashMap.put(a8.am().getKeyValue(f("룞룃")), TextUtils.join(f("뢖"), arrayList2));
        return concurrentHashMap;
    }
}
