package Ng;

import M8.T2;
import cj.C1112C;
import cj.C1114E;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import zj.C2581c;

/* JADX INFO: loaded from: classes4.dex */
public final class A {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final E f4402k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f4403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4404b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C f4405d;
    public String e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f4406g;
    public List h;
    public y i;
    public G6.w j;

    static {
        A a8 = new A();
        B.b(a8, "http://localhost");
        f4402k = a8.b();
    }

    public A() throws CharacterCodingException {
        C1112C<String> pathSegments = C1112C.f9377a;
        w.f4448b.getClass();
        kotlin.jvm.internal.j.g(pathSegments, "pathSegments");
        this.f4403a = "";
        this.f4404b = false;
        this.c = 0;
        this.f4405d = null;
        this.e = null;
        this.f = null;
        Set set = AbstractC0493a.f4419a;
        Charset charset = C2581c.f21468b;
        kotlin.jvm.internal.j.g(charset, "charset");
        StringBuilder sb2 = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        kotlin.jvm.internal.j.f(charsetEncoderNewEncoder, "newEncoder(...)");
        Mj.a aVar = new Mj.a();
        T2.o(charsetEncoderNewEncoder, aVar, "", 0, 0);
        AbstractC0493a.f(aVar, new N9.f(sb2, 4));
        String string = sb2.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        this.f4406g = string;
        ArrayList arrayList = new ArrayList(cj.t.l(pathSegments, 10));
        for (String str : pathSegments) {
            kotlin.jvm.internal.j.g(str, "<this>");
            StringBuilder sb3 = new StringBuilder();
            Charset charset2 = C2581c.f21468b;
            int i = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                if (!AbstractC0493a.f4420b.contains(Character.valueOf(cCharAt))) {
                    if (!AbstractC0493a.f4421d.contains(Character.valueOf(cCharAt))) {
                        int i4 = (55296 > cCharAt || cCharAt >= 57344) ? 1 : 2;
                        CharsetEncoder charsetEncoderNewEncoder2 = charset2.newEncoder();
                        kotlin.jvm.internal.j.f(charsetEncoderNewEncoder2, "newEncoder(...)");
                        int i6 = i4 + i;
                        Mj.a aVar2 = new Mj.a();
                        T2.o(charsetEncoderNewEncoder2, aVar2, str, i, i6);
                        while (!aVar2.exhausted()) {
                            while (!aVar2.exhausted()) {
                                sb3.append(AbstractC0493a.g(aVar2.readByte()));
                                Unit unit = Unit.f18162a;
                            }
                        }
                        i = i6;
                    }
                }
                sb3.append(cCharAt);
                i++;
            }
            String string2 = sb3.toString();
            kotlin.jvm.internal.j.f(string2, "toString(...)");
            arrayList.add(string2);
        }
        this.h = arrayList;
        y yVar = new y(0);
        for (String name : C1114E.f9379a) {
            kotlin.jvm.internal.j.g(name, "name");
            C1112C<String> c1112c = C1112C.f9377a;
            String strE = AbstractC0493a.e(name, false);
            ArrayList arrayList2 = new ArrayList(cj.t.l(c1112c, 10));
            for (String str2 : c1112c) {
                kotlin.jvm.internal.j.g(str2, "<this>");
                arrayList2.add(AbstractC0493a.e(str2, true));
            }
            yVar.e(arrayList2, strE);
        }
        this.i = yVar;
        this.j = new G6.w(yVar);
    }

    public final void a() {
        if (this.f4403a.length() <= 0 && !kotlin.jvm.internal.j.b(c().f4409a, Constants.FILE)) {
            E e = f4402k;
            this.f4403a = e.f4413a;
            if (this.f4405d == null) {
                this.f4405d = e.f4416g;
            }
            if (this.c == 0) {
                e(e.f4414b);
            }
        }
    }

    public final E b() {
        a();
        C c = this.f4405d;
        String str = this.f4403a;
        int i = this.c;
        List list = this.h;
        ArrayList arrayList = new ArrayList(cj.t.l(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0493a.c((String) it.next()));
        }
        w wVarG = jk.b.g((y) this.j.f1822b);
        String strD = AbstractC0493a.d(0, 0, 15, this.f4406g);
        String str2 = this.e;
        String strC = str2 != null ? AbstractC0493a.c(str2) : null;
        String str3 = this.f;
        String strC2 = str3 != null ? AbstractC0493a.c(str3) : null;
        boolean z4 = this.f4404b;
        a();
        StringBuilder sb2 = new StringBuilder(256);
        Xh.i.c(this, sb2);
        String string = sb2.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        return new E(c, str, i, arrayList, wVarG, strD, strC, strC2, z4, string);
    }

    public final C c() {
        C c = this.f4405d;
        if (c != null) {
            return c;
        }
        C c10 = C.c;
        return C.c;
    }

    public final void d(List list) {
        kotlin.jvm.internal.j.g(list, "<set-?>");
        this.h = list;
    }

    public final void e(int i) {
        if (i < 0 || i >= 65536) {
            throw new IllegalArgumentException(We.s.f(i, "Port must be between 0 and 65535, or 0 if not set. Provided: ").toString());
        }
        this.c = i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(256);
        Xh.i.c(this, sb2);
        String string = sb2.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        return string;
    }
}
