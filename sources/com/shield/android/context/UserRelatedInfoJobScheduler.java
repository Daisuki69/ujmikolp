package com.shield.android.context;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import cj.C1132s;
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
public final class UserRelatedInfoJobScheduler extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15076d = {1852211732, 489195527, 274539966, 2037590826, 1586660803, 1298770644, 1854261771, 838401024, 56861952, 1984695006, 97876858, 122085568};
    public static final a Companion = new a((((int) 1298770644) ^ 1298770644) == true ? 1 : 0);
    private static final String fu = "UserRelatedInfoJobScheduler";

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b8) {
            this();
        }
    }

    public static final class b extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15077d = {122354872};

        public b(InterfaceC1526a<? super b> interfaceC1526a) {
            super(((int) f15077d[0]) ^ 122354873, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return UserRelatedInfoJobScheduler.this.new b(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((b) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            UserRelatedInfoJobScheduler userRelatedInfoJobScheduler = UserRelatedInfoJobScheduler.this;
            concurrentHashMapR.put("APPS_INSTALL_TIME_KEY", UserRelatedInfoJobScheduler.access$appsInstallTime(userRelatedInfoJobScheduler, userRelatedInfoJobScheduler.getContext()));
            return concurrentHashMapR;
        }
    }

    public static final class c extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15078d = {679791994};

        public c(InterfaceC1526a<? super c> interfaceC1526a) {
            super(((int) f15078d[0]) ^ 679791995, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return UserRelatedInfoJobScheduler.this.new c(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((c) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            UserRelatedInfoJobScheduler userRelatedInfoJobScheduler = UserRelatedInfoJobScheduler.this;
            concurrentHashMapR.put("BINDING_DEVICES_COUNT", UserRelatedInfoJobScheduler.access$getBindingDevices(userRelatedInfoJobScheduler, userRelatedInfoJobScheduler.getContext()));
            return concurrentHashMapR;
        }
    }

    public static final class d extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15079d = {273915044};

        public d(InterfaceC1526a<? super d> interfaceC1526a) {
            super(((int) f15079d[0]) ^ 273915045, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return UserRelatedInfoJobScheduler.this.new d(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((d) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            UserRelatedInfoJobScheduler userRelatedInfoJobScheduler = UserRelatedInfoJobScheduler.this;
            String strAccess$getPairedBluetoothDevices = UserRelatedInfoJobScheduler.access$getPairedBluetoothDevices(userRelatedInfoJobScheduler, userRelatedInfoJobScheduler.getContext());
            if (strAccess$getPairedBluetoothDevices != null) {
                concurrentHashMapR.put("BLUETOOTH_PAIRED_DEVICES", strAccess$getPairedBluetoothDevices);
            }
            return concurrentHashMapR;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRelatedInfoJobScheduler(Context context, NativeUtils nativeUtils) {
        super(context, nativeUtils);
        kotlin.jvm.internal.j.g(context, d("뮛嶓꺐휋毚㖧骛"));
        kotlin.jvm.internal.j.g(nativeUtils, d("뮖嶝꺊휖毉㖺骺䴃ꛒ팱\ue9dd"));
    }

    @SuppressLint({"MissingPermission"})
    private static String G(Context context) {
        try {
            if (!com.shield.android.internal.i.b(context, d("뮙嶒꺚휍毐㖶骋䵙ꛋ팸\ue9dc\uf4ba稂뵆\udee9\uef24\uf7c9箽뷇\udeb6漶㟨ᮛරڸ茴쇩悖〰ᡴ豔䙃ꍈ퇆\ue882\uf434"))) {
                return d("뮜嶕꺍휞毝㖳骊䴓");
            }
            try {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                return defaultAdapter.getBondedDevices() != null ? String.valueOf(defaultAdapter.getBondedDevices().size()) : d("믈");
            } catch (Exception unused) {
                return d("뮝嶎꺌휐母");
            }
        } catch (Exception unused2) {
            return d("뮝嶎꺌휐母");
        }
    }

    @SuppressLint({"MissingPermission"})
    private static String H(Context context) {
        StringBuilder sb2 = new StringBuilder();
        try {
            if (!com.shield.android.internal.i.b(context, d("뮙嶒꺚휍毐㖶骋䵙ꛋ팸\ue9dc\uf4ba稂뵆\udee9\uef24\uf7c9箽뷇\udeb6漶㟨ᮛරڸ茴쇩悖〰ᡴ豔䙃ꍈ퇆\ue882\uf434"))) {
                return d("뮜嶕꺍휞毝㖳骊䴓");
            }
            try {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter.getBondedDevices() == null) {
                    return null;
                }
                for (BluetoothDevice bluetoothDevice : defaultAdapter.getBondedDevices()) {
                    sb2.append(bluetoothDevice.getAddress());
                    sb2.append(d("뮸"));
                    sb2.append(bluetoothDevice.getName());
                    sb2.append(d("믔"));
                }
                sb2.setLength(sb2.length() - (((int) f15076d[6]) ^ 1854261770));
                return sb2.toString();
            } catch (Exception unused) {
                return d("뮝嶎꺌휐母");
            }
        } catch (Exception unused2) {
            return d("뮝嶎꺌휐母");
        }
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    private static String I(Context context) {
        PackageManager packageManager = context.getPackageManager();
        List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(128);
        StringBuilder sb2 = new StringBuilder();
        for (ApplicationInfo applicationInfo : installedApplications) {
            try {
                if (((1854261770 ^ ((int) f15076d[6])) & applicationInfo.flags) == 0) {
                    String str = applicationInfo.packageName;
                    sb2.append(str);
                    sb2.append((((int) f15076d[8]) ^ 56862010) == true ? (char) 1 : (char) 0);
                    sb2.append(packageManager.getPackageInfo(str, 1298770644 ^ ((int) f15076d[5])).firstInstallTime);
                    sb2.append((((int) f15076d[9]) ^ 1984695026) == true ? (char) 1 : (char) 0);
                }
            } catch (PackageManager.NameNotFoundException e) {
                com.shield.android.k.a.dL().a(e);
            }
        }
        if ((sb2.length() > 0 ? ((int) f15076d[6]) ^ 1854261770 : ((int) f15076d[5]) ^ 1298770644) != 0) {
            sb2.setLength(sb2.length() - (((int) f15076d[6]) ^ 1854261770));
        }
        return sb2.toString();
    }

    public static final /* synthetic */ String access$appsInstallTime(UserRelatedInfoJobScheduler userRelatedInfoJobScheduler, Context context) {
        return I(context);
    }

    public static final /* synthetic */ String access$getBindingDevices(UserRelatedInfoJobScheduler userRelatedInfoJobScheduler, Context context) {
        return G(context);
    }

    public static final /* synthetic */ String access$getPairedBluetoothDevices(UserRelatedInfoJobScheduler userRelatedInfoJobScheduler, Context context) {
        return H(context);
    }

    public static String d(String str) {
        int i = ((int) f15076d[10]) ^ 97848458;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15076d[5]) ^ 1298770644;
        while (i4 < str.length()) {
            long[] jArr = f15076d;
            int i6 = (((i >> (((int) jArr[5]) ^ 1298770644)) ^ (i >> (((int) jArr[7]) ^ 838401026))) ^ (i >> (((int) jArr[4]) ^ 1586660800))) ^ (i >> 5);
            long j = jArr[6];
            i = (char) ((i >> (((int) j) ^ 1854261770)) | (((char) (i6 & (((int) j) ^ 1854261770))) << (((int) jArr[11]) ^ 122085583)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f15076d[6];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 1854261770, i11, i10, (((int) j6) ^ 1854261770) + i10 + i11));
            long j7 = f15076d[6];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 1854261770) + (((int) j7) ^ 1854261770) + ((~(((int) j7) ^ 1854261770)) | i12) + (((((int) j7) ^ 1854261770) + i4) - ((((((int) j7) ^ 1854261770) + i4) + (((int) j7) ^ 1854261770)) + ((~(((int) j7) ^ 1854261770)) | i12)));
        }
        return sb2.toString();
    }

    @Override // com.shield.android.context.f
    public final List<g> scheduleJobs() {
        if (!com.shield.android.internal.f.bI()) {
            return super.scheduleJobs();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.scheduleJobs());
        StringBuilder sb2 = new StringBuilder();
        String str = fu;
        sb2.append(str);
        sb2.append((((int) f15076d[0]) ^ 1852211749) == true ? (char) 1 : (char) 0);
        g gVar = new g(sb2.toString(), 0L, null, new d(null), ((int) f15076d[1]) ^ 489195521);
        StringBuilder sbW = androidx.camera.core.impl.a.w(str);
        sbW.append((((int) f15076d[2]) ^ 274539916) == true ? (char) 1 : (char) 0);
        g gVar2 = new g(sbW.toString(), 0L, null, new c(null), ((int) f15076d[1]) ^ 489195521);
        StringBuilder sbW2 = androidx.camera.core.impl.a.w(str);
        sbW2.append((((int) f15076d[3]) ^ 2037590809) == true ? (char) 1 : (char) 0);
        g gVar3 = new g(sbW2.toString(), 0L, null, new b(null), ((int) f15076d[1]) ^ 489195521);
        long[] jArr = f15076d;
        g[] gVarArr = new g[((int) jArr[4]) ^ 1586660800];
        gVarArr[((int) jArr[5]) ^ 1298770644] = gVar;
        gVarArr[((int) jArr[6]) ^ 1854261770] = gVar2;
        gVarArr[((int) jArr[7]) ^ 838401026] = gVar3;
        arrayList.addAll(C1132s.g(gVarArr));
        return arrayList;
    }
}
