package com.shield.android.a;

import Bj.E;
import Bj.H;
import Bj.I0;
import Bj.U;
import Ij.e;
import android.content.Context;
import androidx.ads.identifier.AdvertisingIdClient;
import androidx.ads.identifier.AdvertisingIdInfo;
import bj.AbstractC1039j;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.internal.i;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import mx_android.support.v7.media.MediaRouteProviderProtocol;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15019d = {1394769296, 570223270, 1879524082, 108963734};
    private final Context bD;

    /* JADX INFO: renamed from: com.shield.android.a.a$a, reason: collision with other inner class name */
    public static final class C0041a extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super String>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15020d = {1892557853, 107149143, 1262396354};
        private int bE;

        /* JADX INFO: renamed from: com.shield.android.a.a$a$1, reason: invalid class name */
        public static final class AnonymousClass1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super String>, Object> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long[] f15021d = {1098987936, 1343539166, 1904072993, 1820676713};
            private /* synthetic */ a bF;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(a aVar, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
                super(((int) f15021d[0]) ^ 1098987938, interfaceC1526a);
                this.bF = aVar;
            }

            @Override // ij.AbstractC1607a
            public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                return new AnonymousClass1(this.bF, interfaceC1526a);
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
            }

            @Override // ij.AbstractC1607a
            public final Object invokeSuspend(Object obj) {
                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                AbstractC1039j.b(obj);
                try {
                    if (i.N(this.bF.Y())) {
                        String strD = com.shield.android.a.a(this.bF.Y()).d();
                        return (strD.length() == 0 ? ((int) f15021d[1]) ^ 1343539167 : 1904072993 ^ ((int) f15021d[2])) != 0 ? MediaRouteProviderProtocol.SERVICE_DATA_ERROR : strD;
                    }
                    if (i.bT() && AdvertisingIdClient.isAdvertisingIdProviderAvailable(this.bF.Y())) {
                        String id = ((AdvertisingIdInfo) AdvertisingIdClient.getAdvertisingIdInfo(this.bF.Y()).get(f15021d[3] ^ 1820678609, TimeUnit.MILLISECONDS)).getId();
                        return (id.length() == 0 ? ((int) f15021d[1]) ^ 1343539167 : 1904072993 ^ ((int) f15021d[2])) != 0 ? MediaRouteProviderProtocol.SERVICE_DATA_ERROR : id;
                    }
                    try {
                        return com.shield.android.a.a(this.bF.Y()).d();
                    } catch (Exception unused) {
                        return "disabled";
                    }
                } catch (Exception e) {
                    com.shield.android.k.a.dL().a(e);
                    return MediaRouteProviderProtocol.SERVICE_DATA_ERROR;
                }
            }
        }

        public C0041a(InterfaceC1526a<? super C0041a> interfaceC1526a) {
            super(((int) f15020d[0]) ^ 1892557855, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return a.this.new C0041a(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((C0041a) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.bE;
            try {
                if (i == 0) {
                    AbstractC1039j.b(obj);
                    long j = f15020d[1] ^ 107150575;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(a.this, null);
                    this.bE = ((int) f15020d[2]) ^ 1262396355;
                    obj = I0.b(j, anonymousClass1, this);
                    if (obj == enumC1578a) {
                        return enumC1578a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1039j.b(obj);
                }
                return (String) obj;
            } catch (Exception unused) {
                return MediaRouteProviderProtocol.SERVICE_DATA_ERROR;
            }
        }
    }

    public a(Context context) {
        j.g(context, f("茵茸茺茡茷茫茤"));
        this.bD = context;
    }

    public static String f(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15019d[0]) ^ 1394769296;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15019d;
            long j = jArr[1];
            long j6 = jArr[2];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 570190320) + cCharAt;
            sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 570190320)) + (((int) j6) ^ 1879524083), (~(((int) j) ^ 570190320)) | i4, i6, (((((int) j) ^ 570190320) + cCharAt) + (((int) j6) ^ 1879524083)) + ((~(((int) j) ^ 570190320)) | i4)) ^ (i % (((int) jArr[3]) ^ 108943465))));
            long j7 = f15019d[2];
            int i10 = ~i;
            i = i + (((int) j7) ^ 1879524083) + (((int) j7) ^ 1879524083) + ((~(((int) j7) ^ 1879524083)) | i10) + (((((int) j7) ^ 1879524083) + i) - ((((((int) j7) ^ 1879524083) + i) + (((int) j7) ^ 1879524083)) + ((~(((int) j7) ^ 1879524083)) | i10)));
        }
        return sb2.toString();
    }

    public final Context Y() {
        return this.bD;
    }

    public final Object a(InterfaceC1526a<? super String> interfaceC1526a) {
        e eVar = U.f603a;
        return H.C(new C0041a(null), Ij.d.f2362a, interfaceC1526a);
    }
}
