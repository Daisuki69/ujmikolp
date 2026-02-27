package com.shield.android.context;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import androidx.media3.exoplayer.upstream.CmcdData;
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
public final class i extends AbstractC1300c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15123d = {77777550, 1280437826, 1569313007, 356214038, 215222904};

    /* JADX INFO: renamed from: dg, reason: collision with root package name */
    private static a f15124dg = new a((((int) 356214038) ^ 356214038) == true ? 1 : 0);

    /* JADX INFO: renamed from: dh, reason: collision with root package name */
    private static final String f15125dh = CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b8) {
            this();
        }
    }

    public static final class b extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15126d = {1161872873};

        public b(InterfaceC1526a<? super b> interfaceC1526a) {
            super(((int) f15126d[0]) ^ 1161872872, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return i.this.new b(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((b) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            AbstractC1039j.b(obj);
            i iVar = i.this;
            return iVar.x(iVar.af());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, String str, NativeUtils nativeUtils, z zVar) {
        super(context, str, nativeUtils, zVar);
        kotlin.jvm.internal.j.g(context, g("䢯䢣䢢䢸䢩䢴䢸"));
        kotlin.jvm.internal.j.g(nativeUtils, g("䢢䢭䢸䢥䢺䢩䢙䢸䢥䢠䢿"));
        kotlin.jvm.internal.j.g(zVar, g("䢦䢣䢮䢝䢹䢩䢹䢩"));
    }

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15123d[3]) ^ 356214038;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15123d;
            long j = jArr[4];
            long j6 = jArr[2];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 215237300) + cCharAt;
            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 215237300) + (((int) j6) ^ 1569313006), i4 | (~(((int) j) ^ 215237300)), i6, (((int) j) ^ 215237300) + cCharAt + (((int) j6) ^ 1569313006) + ((~(((int) j) ^ 215237300)) | i4)));
            long j7 = f15123d[2];
            int i10 = ~i;
            i = i + (((int) j7) ^ 1569313006) + (((int) j7) ^ 1569313006) + ((~(((int) j7) ^ 1569313006)) | i10) + (((((int) j7) ^ 1569313006) + i) - ((((((int) j7) ^ 1569313006) + i) + (((int) j7) ^ 1569313006)) + ((~(((int) j7) ^ 1569313006)) | i10)));
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConcurrentHashMap<String, Object> x(Context context) {
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        try {
            PackageManager packageManager = context.getPackageManager();
            List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(128);
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            for (ApplicationInfo applicationInfo : installedApplications) {
                if ((sb2.length() > 0 ? ((int) f15123d[2]) ^ 1569313006 : ((int) f15123d[3]) ^ 356214038) != 0) {
                    sb2.append(g("䣠"));
                }
                sb2.append(applicationInfo.packageName);
                if ((sb3.length() > 0 ? ((int) f15123d[2]) ^ 1569313006 : ((int) f15123d[3]) ^ 356214038) != 0) {
                    sb3.append(g("䣠"));
                }
                sb3.append(a(context, applicationInfo));
                if ((sb4.length() > 0 ? 1569313006 ^ ((int) f15123d[2]) : ((int) f15123d[3]) ^ 356214038) != 0) {
                    sb4.append(g("䣠"));
                }
                sb4.append(packageManager.getPackageInfo(applicationInfo.packageName, ((int) f15123d[3]) ^ 356214038).firstInstallTime);
            }
            concurrentHashMap.put(g("䢍䢜䢜䢟"), sb2.toString());
            concurrentHashMap.put(g("䢍䢜䢜䢟䢓䢂䢍䢁䢉"), sb3.toString());
            concurrentHashMap.put(g("䢍䢜䢜䢟䢓䢅䢂䢟䢘䢍䢀䢀䢓䢘䢅䢁䢉"), sb4.toString());
        } catch (Exception unused) {
        }
        return concurrentHashMap;
    }

    @Override // com.shield.android.context.AbstractC1300c
    public final List<g> scheduleJobs() {
        if (!com.shield.android.internal.f.bI()) {
            return super.scheduleJobs();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.scheduleJobs());
        arrayList.add(new g(f15125dh + ((((int) f15123d[0]) ^ 77777599) == true ? (char) 1 : (char) 0), 0L, null, new b(null), ((int) f15123d[1]) ^ 1280437828));
        return arrayList;
    }

    private static String a(Context context, ApplicationInfo applicationInfo) {
        try {
            CharSequence applicationLabel = applicationInfo != null ? context.getPackageManager().getApplicationLabel(applicationInfo) : g("䢙䢢䢧䢢䢣䢻䢢");
            kotlin.jvm.internal.j.e(applicationLabel, g("䢢䢹䢠䢠䣬䢯䢭䢢䢢䢣䢸䣬䢮䢩䣬䢯䢭䢿䢸䣬䢸䢣䣬䢢䢣䢢䣡䢢䢹䢠䢠䣬䢸䢵䢼䢩䣬䢧䢣䢸䢠䢥䢢䣢䢟䢸䢾䢥䢢䢫"));
            return (String) applicationLabel;
        } catch (Exception unused) {
            return g("䢙䢢䢧䢢䢣䢻䢢");
        }
    }

    public static final i a(Context context, String str, NativeUtils nativeUtils, z zVar) {
        kotlin.jvm.internal.j.g(context, g("䢯䢣䢢䢸䢩䢴䢸"));
        kotlin.jvm.internal.j.g(nativeUtils, g("䢢䢭䢸䢥䢺䢩䢙䢸䢥䢠䢿"));
        kotlin.jvm.internal.j.g(zVar, g("䢦䢣䢮䢝䢹䢩䢹䢩"));
        return new i(context, str, nativeUtils, zVar);
    }
}
