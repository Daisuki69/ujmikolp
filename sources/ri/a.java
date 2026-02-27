package Ri;

import S1.r;
import Vj.b;
import android.util.Log;
import com.google.firebase.messaging.p;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import n3.C1916a;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f5556d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5558b;
    public Object c;

    public /* synthetic */ a(int i, byte b8) {
        this.f5557a = i;
    }

    public static void d(String str) {
        l().m(3, str, null);
    }

    public static void e(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        d(str);
    }

    public static void f(Exception exc) {
        l().m(6, "", exc);
    }

    public static void g(String str) {
        l().m(6, str, null);
    }

    public static void h(String str, Throwable th2) {
        l().m(6, str, th2);
    }

    public static void i(Throwable th2, String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        h(str, th2);
    }

    public static void k(String str) {
        l().m(4, str, null);
    }

    public static synchronized a l() {
        try {
            if (f5556d == null) {
                synchronized (a.class) {
                    try {
                        if (f5556d == null) {
                            a aVar = new a(0, (byte) 0);
                            aVar.f5558b = -100;
                            aVar.c = new C1916a(14);
                            f5556d = aVar;
                        }
                    } finally {
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f5556d;
    }

    public static void p(String str) {
        l().m(2, str, null);
    }

    public static void q(String str) {
        l().m(5, str, null);
    }

    public int a() {
        if ((this.f5558b & 128) != 0) {
            return ((int[]) this.c)[7];
        }
        return 65535;
    }

    public void b(int i, int i4) {
        if (i >= 0) {
            int[] iArr = (int[]) this.c;
            if (i >= iArr.length) {
                return;
            }
            this.f5558b = (1 << i) | this.f5558b;
            iArr[i] = i4;
        }
    }

    public boolean c(String key, Pair pair) {
        j.g(key, "key");
        if (r.t(pair) > this.f5558b) {
            o(key);
            return false;
        }
        p pVar = (p) this.c;
        pVar.getClass();
        ((We.p) pVar.f9799b).put(key, pair);
        return true;
    }

    public void j(int i, int i4) {
        int i6 = i4 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i6) {
            int i10 = i * 2;
            if (i6 < i10) {
                i6 = i10;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i6);
            j.f(cArrCopyOf, "copyOf(...)");
            this.c = cArrCopyOf;
        }
    }

    public void m(int i, String str, Throwable th2) {
        int i4 = this.f5558b;
        if (i4 == -100 || i < 2 || i4 > i) {
            return;
        }
        C1916a c1916a = (C1916a) this.c;
        switch (i) {
            case 2:
                c1916a.getClass();
                Log.v("SplitSDK", str);
                break;
            case 3:
                c1916a.getClass();
                Log.d("SplitSDK", str, th2);
                break;
            case 4:
                c1916a.getClass();
                Log.i("SplitSDK", str, th2);
                break;
            case 5:
                c1916a.getClass();
                Log.w("SplitSDK", str, th2);
                break;
            case 6:
                c1916a.getClass();
                Log.e("SplitSDK", str, th2);
                break;
            case 7:
                c1916a.getClass();
                Log.wtf("SplitSDK", str, th2);
                break;
        }
    }

    public void n() {
        b bVar = b.c;
        char[] array = (char[]) this.c;
        bVar.getClass();
        j.g(array, "array");
        synchronized (bVar) {
            try {
                int i = bVar.f6136b;
                if (array.length + i < Vj.a.f6134a) {
                    bVar.f6136b = i + array.length;
                    bVar.f6135a.addLast(array);
                }
                Unit unit = Unit.f18162a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Object o(String key) {
        j.g(key, "key");
        p pVar = (p) this.c;
        pVar.getClass();
        return ((We.p) pVar.f9799b).remove(key);
    }

    public void r(String text) {
        j.g(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        j(this.f5558b, length);
        text.getChars(0, text.length(), (char[]) this.c, this.f5558b);
        this.f5558b += length;
    }

    public String toString() {
        switch (this.f5557a) {
            case 3:
                return new String((char[]) this.c, 0, this.f5558b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(int i, int i4, Object obj) {
        this.f5557a = i4;
        this.f5558b = i;
        this.c = obj;
    }

    public a() {
        this.f5557a = 5;
        this.c = new int[10];
    }

    public a(int i) {
        this.f5557a = 8;
        p pVar = new p(i);
        this.f5558b = i;
        this.c = pVar;
    }

    public a(List list, int i) {
        this.f5557a = 2;
        this.c = list;
        this.f5558b = i;
    }

    public a(int i, F3.a aVar) {
        this.f5557a = 1;
        this.f5558b = i;
        this.c = new F3.a[]{aVar};
    }

    public a(F3.a aVar, F3.a aVar2) {
        this.f5557a = 1;
        this.f5558b = 62;
        this.c = new F3.a[]{aVar, aVar2};
    }
}
