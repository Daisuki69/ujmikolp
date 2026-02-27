package com.shield.android;

import Bj.E;
import Bj.H;
import Bj.InterfaceC0160s;
import Bj.U;
import Bj.u0;
import bj.AbstractC1039j;
import com.paymaya.common.utility.AbstractC1213b;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.net.ConnectException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f15055n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static boolean f15056o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static boolean f15057p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static boolean f15058q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15054d = {852092707, 25358922, 712553414, 217615036, 1880486213, 317403318, 1361720649, 1145159497};
    public static final c m = new c();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final InterfaceC0160s f15059r = H.d(((int) f15054d[2]) ^ 712553415);

    public static final class a extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15060d = {84235175, 1675484183, 549653249, 1302262981, 237097295, 1046498965};

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ com.shield.android.d.g f15061s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.shield.android.d.g gVar, InterfaceC1526a<? super a> interfaceC1526a) {
            super(((int) f15060d[0]) ^ 84235173, interfaceC1526a);
            this.f15061s = gVar;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return new a(this.f15061s, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((a) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            AbstractC1039j.b(obj);
            c cVar = c.m;
            c.b(c.a(cVar));
            if (c.h()) {
                this.f15061s.N();
            }
            c.c(c.b(cVar));
            if (c.i()) {
                this.f15061s.M();
            }
            c.d(c.c(cVar));
            if (c.j()) {
                this.f15061s.O();
            }
            c.e(c.d(cVar));
            if (c.k()) {
                this.f15061s.P();
            }
            return Unit.f18162a;
        }
    }

    private c() {
    }

    public static final /* synthetic */ boolean a(c cVar) {
        return l();
    }

    public static final /* synthetic */ boolean b(c cVar) {
        return m();
    }

    public static final /* synthetic */ boolean c(c cVar) {
        return n();
    }

    public static String d(String str) {
        int i = ((int) f15054d[6]) ^ 1361765300;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15054d[0]) ^ 852092707;
        while (i4 < str.length()) {
            long[] jArr = f15054d;
            int i6 = (((i >> (((int) jArr[0]) ^ 852092707)) ^ (i >> (((int) jArr[1]) ^ 25358920))) ^ (i >> (((int) jArr[5]) ^ 317403317))) ^ (i >> 5);
            long j = jArr[2];
            i = (char) ((i >> (((int) j) ^ 712553415)) | (((char) (i6 & (((int) j) ^ 712553415))) << (((int) jArr[7]) ^ 1145159494)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f15054d[2];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 712553415, i11, i10, (((int) j6) ^ 712553415) + i10 + i11));
            long j7 = f15054d[2];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 712553415) + (((int) j7) ^ 712553415) + ((~(((int) j7) ^ 712553415)) | i12) + (((((int) j7) ^ 712553415) + i4) - ((((((int) j7) ^ 712553415) + i4) + (((int) j7) ^ 712553415)) + ((~(((int) j7) ^ 712553415)) | i12)));
        }
        return sb2.toString();
    }

    public static void e(boolean z4) {
        f15058q = z4;
    }

    public static boolean h() {
        return f15055n;
    }

    public static boolean i() {
        return f15056o;
    }

    public static boolean j() {
        return f15057p;
    }

    public static boolean k() {
        return f15058q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean l() {
        try {
            new DatagramSocket(5647).close();
        } catch (Exception e) {
            String string = e.toString();
            com.shield.android.k.a.dL().a(e);
            String strD = d("欻뗾媛괫囥ꬒ嗣⪃锸쫰");
            long[] jArr = f15054d;
            if (C2576A.z(string, strD, ((int) jArr[0]) ^ 852092707, ((int) jArr[1]) ^ 25358920)) {
                com.shield.android.k.a.dL().a(d("欟뗈媺괝囖ꬢ喍⪦锄쫇\ue52e\uf28d礲볎\ude21潏㟶ᮾ趀욖\ue359"), new Object[852092707 ^ ((int) f15054d[0])]);
                return ((int) f15054d[2]) ^ 712553415;
            }
        }
        return 852092707 ^ ((int) f15054d[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean m() {
        int i = ((int) f15054d[0]) ^ 852092707;
        int i4 = 8888;
        while (i4 <= 8892) {
            if (i4 == 8892) {
                i4 = 8765;
            }
            try {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress(InetAddress.getLocalHost(), i4));
                long j = f15054d[2];
                int i6 = ~i;
                i = i + (((int) j) ^ 712553415) + (((int) j) ^ 712553415) + ((~(((int) j) ^ 712553415)) | i6) + (((((int) j) ^ 712553415) + i) - ((((((int) j) ^ 712553415) + i) + (((int) j) ^ 712553415)) + ((~(((int) j) ^ 712553415)) | i6)));
                socket.close();
            } catch (ConnectException e) {
                com.shield.android.k.a.dL().a(e);
            } catch (Exception e7) {
                com.shield.android.k.a.dL().a(e7);
            }
            if (i4 == 8765) {
                break;
            }
            long j6 = f15054d[2];
            int i10 = ~i4;
            i4 = i4 + (((int) j6) ^ 712553415) + (((int) j6) ^ 712553415) + ((~(((int) j6) ^ 712553415)) | i10) + (((((int) j6) ^ 712553415) + i4) - ((((((int) j6) ^ 712553415) + i4) + (((int) j6) ^ 712553415)) + ((~(((int) j6) ^ 712553415)) | i10)));
        }
        return i == 5 ? ((int) f15054d[2]) ^ 712553415 : ((int) f15054d[0]) ^ 852092707;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean n() {
        long[] jArr;
        long[] jArr2 = f15054d;
        int i = ((int) jArr2[0]) ^ 852092707;
        int i4 = ((int) jArr2[3]) ^ 217602992;
        while (true) {
            jArr = f15054d;
            if (i4 >= (((int) jArr[4]) ^ 1880432725)) {
                break;
            }
            try {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress(InetAddress.getLocalHost(), i4));
                long j = f15054d[2];
                int i6 = ~i;
                i = i + (((int) j) ^ 712553415) + (((int) j) ^ 712553415) + ((~(((int) j) ^ 712553415)) | i6) + (((((int) j) ^ 712553415) + i) - ((((((int) j) ^ 712553415) + i) + (((int) j) ^ 712553415)) + ((~(((int) j) ^ 712553415)) | i6)));
                socket.close();
            } catch (ConnectException e) {
                com.shield.android.k.a.dL().a(e);
            } catch (Exception e7) {
                com.shield.android.k.a.dL().a(e7);
            }
            long j6 = f15054d[2];
            int i10 = ~i4;
            i4 = i4 + (((int) j6) ^ 712553415) + (((int) j6) ^ 712553415) + ((~(((int) j6) ^ 712553415)) | i10) + (((((int) j6) ^ 712553415) + i4) - ((((((int) j6) ^ 712553415) + i4) + (((int) j6) ^ 712553415)) + ((~(((int) j6) ^ 712553415)) | i10)));
        }
        return i >= (((int) jArr[5]) ^ 317403317) ? ((int) jArr[2]) ^ 712553415 : ((int) jArr[0]) ^ 852092707;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean o() {
        int i = ((int) f15054d[0]) ^ 852092707;
        int i4 = 20200;
        while (i4 < 20203) {
            try {
                new DatagramSocket(i4).close();
            } catch (Exception e) {
                String string = e.toString();
                com.shield.android.k.a.dL().a(e);
                String strD = d("欻뗾媛괫囥ꬒ嗣⪃锸쫰");
                long[] jArr = f15054d;
                if (C2576A.z(string, strD, ((int) jArr[0]) ^ 852092707, 25358920 ^ ((int) jArr[1]))) {
                    int i6 = ((int) f15054d[2]) ^ 712553415;
                    int i10 = i + i6;
                    int i11 = i10 + i6 + ((~i) | (~i6));
                    i = (i10 - i11) + i11;
                }
            }
            int i12 = ((int) f15054d[2]) ^ 712553415;
            int i13 = i4 + i12;
            int i14 = i13 + i12 + ((~i4) | (~i12));
            i4 = (i13 - i14) + i14;
        }
        long[] jArr2 = f15054d;
        return i >= (((int) jArr2[1]) ^ 25358920) ? ((int) jArr2[2]) ^ 712553415 : ((int) jArr2[0]) ^ 852092707;
    }

    public static final void a(com.shield.android.d.g gVar) {
        kotlin.jvm.internal.j.g(gVar, d("欒뗖媬괛囒ꬵ嗈⪤"));
        CoroutineContext.Element element = f15059r;
        Ij.e eVar = U.f603a;
        Ij.d dVar = Ij.d.f2362a;
        u0 u0Var = (u0) element;
        u0Var.getClass();
        H.w(H.c(kotlin.coroutines.e.d(u0Var, dVar)), null, null, new a(gVar, null), ((int) f15054d[5]) ^ 317403317);
    }

    public static void b(boolean z4) {
        f15055n = z4;
    }

    public static void c(boolean z4) {
        f15056o = z4;
    }

    public static final /* synthetic */ boolean d(c cVar) {
        return o();
    }

    public static void d(boolean z4) {
        f15057p = z4;
    }
}
