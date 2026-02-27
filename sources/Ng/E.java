package Ng;

import M8.C0332a;
import bj.C1034e;
import bj.InterfaceC1033d;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4414b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4415d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C f4416g;
    public final C h;
    public final InterfaceC1033d i;
    public final InterfaceC1033d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC1033d f4417k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC1033d f4418l;
    public final InterfaceC1033d m;

    public E(C c, String host, int i, ArrayList arrayList, w parameters, String fragment, String str, String str2, boolean z4, String str3) {
        kotlin.jvm.internal.j.g(host, "host");
        kotlin.jvm.internal.j.g(parameters, "parameters");
        kotlin.jvm.internal.j.g(fragment, "fragment");
        this.f4413a = host;
        this.f4414b = i;
        this.c = str;
        this.f4415d = str2;
        this.e = z4;
        this.f = str3;
        if (i < 0 || i >= 65536) {
            throw new IllegalArgumentException(We.s.f(i, "Port must be between 0 and 65535, or 0 if not set. Provided: ").toString());
        }
        C1034e.b(new C0332a(arrayList, 19));
        this.f4416g = c;
        this.h = c == null ? C.c : c;
        this.i = C1034e.b(new Ag.l(14, arrayList, this));
        final int i4 = 0;
        this.j = C1034e.b(new Function0(this) { // from class: Ng.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E f4412b;

            {
                this.f4412b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                E e = this.f4412b;
                switch (i4) {
                    case 0:
                        int iE = C2576A.E(e.f, '?', 0, 6) + 1;
                        if (iE == 0) {
                            return "";
                        }
                        String str4 = e.f;
                        int iE2 = C2576A.E(str4, '#', iE, 4);
                        if (iE2 == -1) {
                            String strSubstring = str4.substring(iE);
                            kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
                            return strSubstring;
                        }
                        String strSubstring2 = str4.substring(iE, iE2);
                        kotlin.jvm.internal.j.f(strSubstring2, "substring(...)");
                        return strSubstring2;
                    case 1:
                        int iE3 = C2576A.E(e.f, '/', e.h.f4409a.length() + 3, 4);
                        if (iE3 == -1) {
                            return "";
                        }
                        String str5 = e.f;
                        int iE4 = C2576A.E(str5, '#', iE3, 4);
                        if (iE4 == -1) {
                            String strSubstring3 = str5.substring(iE3);
                            kotlin.jvm.internal.j.f(strSubstring3, "substring(...)");
                            return strSubstring3;
                        }
                        String strSubstring4 = str5.substring(iE3, iE4);
                        kotlin.jvm.internal.j.f(strSubstring4, "substring(...)");
                        return strSubstring4;
                    case 2:
                        String str6 = e.c;
                        if (str6 == null) {
                            return null;
                        }
                        if (str6.length() == 0) {
                            return "";
                        }
                        int length = e.h.f4409a.length() + 3;
                        String str7 = e.f;
                        String strSubstring5 = str7.substring(length, C2576A.G(str7, new char[]{':', '@'}, length, false));
                        kotlin.jvm.internal.j.f(strSubstring5, "substring(...)");
                        return strSubstring5;
                    case 3:
                        String str8 = e.f4415d;
                        if (str8 == null) {
                            return null;
                        }
                        if (str8.length() == 0) {
                            return "";
                        }
                        int length2 = e.h.f4409a.length() + 3;
                        String str9 = e.f;
                        String strSubstring6 = str9.substring(C2576A.E(str9, ':', length2, 4) + 1, C2576A.E(str9, '@', 0, 6));
                        kotlin.jvm.internal.j.f(strSubstring6, "substring(...)");
                        return strSubstring6;
                    default:
                        int iE5 = C2576A.E(e.f, '#', 0, 6) + 1;
                        if (iE5 == 0) {
                            return "";
                        }
                        String strSubstring7 = e.f.substring(iE5);
                        kotlin.jvm.internal.j.f(strSubstring7, "substring(...)");
                        return strSubstring7;
                }
            }
        });
        final int i6 = 1;
        C1034e.b(new Function0(this) { // from class: Ng.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E f4412b;

            {
                this.f4412b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                E e = this.f4412b;
                switch (i6) {
                    case 0:
                        int iE = C2576A.E(e.f, '?', 0, 6) + 1;
                        if (iE == 0) {
                            return "";
                        }
                        String str4 = e.f;
                        int iE2 = C2576A.E(str4, '#', iE, 4);
                        if (iE2 == -1) {
                            String strSubstring = str4.substring(iE);
                            kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
                            return strSubstring;
                        }
                        String strSubstring2 = str4.substring(iE, iE2);
                        kotlin.jvm.internal.j.f(strSubstring2, "substring(...)");
                        return strSubstring2;
                    case 1:
                        int iE3 = C2576A.E(e.f, '/', e.h.f4409a.length() + 3, 4);
                        if (iE3 == -1) {
                            return "";
                        }
                        String str5 = e.f;
                        int iE4 = C2576A.E(str5, '#', iE3, 4);
                        if (iE4 == -1) {
                            String strSubstring3 = str5.substring(iE3);
                            kotlin.jvm.internal.j.f(strSubstring3, "substring(...)");
                            return strSubstring3;
                        }
                        String strSubstring4 = str5.substring(iE3, iE4);
                        kotlin.jvm.internal.j.f(strSubstring4, "substring(...)");
                        return strSubstring4;
                    case 2:
                        String str6 = e.c;
                        if (str6 == null) {
                            return null;
                        }
                        if (str6.length() == 0) {
                            return "";
                        }
                        int length = e.h.f4409a.length() + 3;
                        String str7 = e.f;
                        String strSubstring5 = str7.substring(length, C2576A.G(str7, new char[]{':', '@'}, length, false));
                        kotlin.jvm.internal.j.f(strSubstring5, "substring(...)");
                        return strSubstring5;
                    case 3:
                        String str8 = e.f4415d;
                        if (str8 == null) {
                            return null;
                        }
                        if (str8.length() == 0) {
                            return "";
                        }
                        int length2 = e.h.f4409a.length() + 3;
                        String str9 = e.f;
                        String strSubstring6 = str9.substring(C2576A.E(str9, ':', length2, 4) + 1, C2576A.E(str9, '@', 0, 6));
                        kotlin.jvm.internal.j.f(strSubstring6, "substring(...)");
                        return strSubstring6;
                    default:
                        int iE5 = C2576A.E(e.f, '#', 0, 6) + 1;
                        if (iE5 == 0) {
                            return "";
                        }
                        String strSubstring7 = e.f.substring(iE5);
                        kotlin.jvm.internal.j.f(strSubstring7, "substring(...)");
                        return strSubstring7;
                }
            }
        });
        final int i10 = 2;
        this.f4417k = C1034e.b(new Function0(this) { // from class: Ng.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E f4412b;

            {
                this.f4412b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                E e = this.f4412b;
                switch (i10) {
                    case 0:
                        int iE = C2576A.E(e.f, '?', 0, 6) + 1;
                        if (iE == 0) {
                            return "";
                        }
                        String str4 = e.f;
                        int iE2 = C2576A.E(str4, '#', iE, 4);
                        if (iE2 == -1) {
                            String strSubstring = str4.substring(iE);
                            kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
                            return strSubstring;
                        }
                        String strSubstring2 = str4.substring(iE, iE2);
                        kotlin.jvm.internal.j.f(strSubstring2, "substring(...)");
                        return strSubstring2;
                    case 1:
                        int iE3 = C2576A.E(e.f, '/', e.h.f4409a.length() + 3, 4);
                        if (iE3 == -1) {
                            return "";
                        }
                        String str5 = e.f;
                        int iE4 = C2576A.E(str5, '#', iE3, 4);
                        if (iE4 == -1) {
                            String strSubstring3 = str5.substring(iE3);
                            kotlin.jvm.internal.j.f(strSubstring3, "substring(...)");
                            return strSubstring3;
                        }
                        String strSubstring4 = str5.substring(iE3, iE4);
                        kotlin.jvm.internal.j.f(strSubstring4, "substring(...)");
                        return strSubstring4;
                    case 2:
                        String str6 = e.c;
                        if (str6 == null) {
                            return null;
                        }
                        if (str6.length() == 0) {
                            return "";
                        }
                        int length = e.h.f4409a.length() + 3;
                        String str7 = e.f;
                        String strSubstring5 = str7.substring(length, C2576A.G(str7, new char[]{':', '@'}, length, false));
                        kotlin.jvm.internal.j.f(strSubstring5, "substring(...)");
                        return strSubstring5;
                    case 3:
                        String str8 = e.f4415d;
                        if (str8 == null) {
                            return null;
                        }
                        if (str8.length() == 0) {
                            return "";
                        }
                        int length2 = e.h.f4409a.length() + 3;
                        String str9 = e.f;
                        String strSubstring6 = str9.substring(C2576A.E(str9, ':', length2, 4) + 1, C2576A.E(str9, '@', 0, 6));
                        kotlin.jvm.internal.j.f(strSubstring6, "substring(...)");
                        return strSubstring6;
                    default:
                        int iE5 = C2576A.E(e.f, '#', 0, 6) + 1;
                        if (iE5 == 0) {
                            return "";
                        }
                        String strSubstring7 = e.f.substring(iE5);
                        kotlin.jvm.internal.j.f(strSubstring7, "substring(...)");
                        return strSubstring7;
                }
            }
        });
        final int i11 = 3;
        this.f4418l = C1034e.b(new Function0(this) { // from class: Ng.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E f4412b;

            {
                this.f4412b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                E e = this.f4412b;
                switch (i11) {
                    case 0:
                        int iE = C2576A.E(e.f, '?', 0, 6) + 1;
                        if (iE == 0) {
                            return "";
                        }
                        String str4 = e.f;
                        int iE2 = C2576A.E(str4, '#', iE, 4);
                        if (iE2 == -1) {
                            String strSubstring = str4.substring(iE);
                            kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
                            return strSubstring;
                        }
                        String strSubstring2 = str4.substring(iE, iE2);
                        kotlin.jvm.internal.j.f(strSubstring2, "substring(...)");
                        return strSubstring2;
                    case 1:
                        int iE3 = C2576A.E(e.f, '/', e.h.f4409a.length() + 3, 4);
                        if (iE3 == -1) {
                            return "";
                        }
                        String str5 = e.f;
                        int iE4 = C2576A.E(str5, '#', iE3, 4);
                        if (iE4 == -1) {
                            String strSubstring3 = str5.substring(iE3);
                            kotlin.jvm.internal.j.f(strSubstring3, "substring(...)");
                            return strSubstring3;
                        }
                        String strSubstring4 = str5.substring(iE3, iE4);
                        kotlin.jvm.internal.j.f(strSubstring4, "substring(...)");
                        return strSubstring4;
                    case 2:
                        String str6 = e.c;
                        if (str6 == null) {
                            return null;
                        }
                        if (str6.length() == 0) {
                            return "";
                        }
                        int length = e.h.f4409a.length() + 3;
                        String str7 = e.f;
                        String strSubstring5 = str7.substring(length, C2576A.G(str7, new char[]{':', '@'}, length, false));
                        kotlin.jvm.internal.j.f(strSubstring5, "substring(...)");
                        return strSubstring5;
                    case 3:
                        String str8 = e.f4415d;
                        if (str8 == null) {
                            return null;
                        }
                        if (str8.length() == 0) {
                            return "";
                        }
                        int length2 = e.h.f4409a.length() + 3;
                        String str9 = e.f;
                        String strSubstring6 = str9.substring(C2576A.E(str9, ':', length2, 4) + 1, C2576A.E(str9, '@', 0, 6));
                        kotlin.jvm.internal.j.f(strSubstring6, "substring(...)");
                        return strSubstring6;
                    default:
                        int iE5 = C2576A.E(e.f, '#', 0, 6) + 1;
                        if (iE5 == 0) {
                            return "";
                        }
                        String strSubstring7 = e.f.substring(iE5);
                        kotlin.jvm.internal.j.f(strSubstring7, "substring(...)");
                        return strSubstring7;
                }
            }
        });
        final int i12 = 4;
        this.m = C1034e.b(new Function0(this) { // from class: Ng.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E f4412b;

            {
                this.f4412b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                E e = this.f4412b;
                switch (i12) {
                    case 0:
                        int iE = C2576A.E(e.f, '?', 0, 6) + 1;
                        if (iE == 0) {
                            return "";
                        }
                        String str4 = e.f;
                        int iE2 = C2576A.E(str4, '#', iE, 4);
                        if (iE2 == -1) {
                            String strSubstring = str4.substring(iE);
                            kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
                            return strSubstring;
                        }
                        String strSubstring2 = str4.substring(iE, iE2);
                        kotlin.jvm.internal.j.f(strSubstring2, "substring(...)");
                        return strSubstring2;
                    case 1:
                        int iE3 = C2576A.E(e.f, '/', e.h.f4409a.length() + 3, 4);
                        if (iE3 == -1) {
                            return "";
                        }
                        String str5 = e.f;
                        int iE4 = C2576A.E(str5, '#', iE3, 4);
                        if (iE4 == -1) {
                            String strSubstring3 = str5.substring(iE3);
                            kotlin.jvm.internal.j.f(strSubstring3, "substring(...)");
                            return strSubstring3;
                        }
                        String strSubstring4 = str5.substring(iE3, iE4);
                        kotlin.jvm.internal.j.f(strSubstring4, "substring(...)");
                        return strSubstring4;
                    case 2:
                        String str6 = e.c;
                        if (str6 == null) {
                            return null;
                        }
                        if (str6.length() == 0) {
                            return "";
                        }
                        int length = e.h.f4409a.length() + 3;
                        String str7 = e.f;
                        String strSubstring5 = str7.substring(length, C2576A.G(str7, new char[]{':', '@'}, length, false));
                        kotlin.jvm.internal.j.f(strSubstring5, "substring(...)");
                        return strSubstring5;
                    case 3:
                        String str8 = e.f4415d;
                        if (str8 == null) {
                            return null;
                        }
                        if (str8.length() == 0) {
                            return "";
                        }
                        int length2 = e.h.f4409a.length() + 3;
                        String str9 = e.f;
                        String strSubstring6 = str9.substring(C2576A.E(str9, ':', length2, 4) + 1, C2576A.E(str9, '@', 0, 6));
                        kotlin.jvm.internal.j.f(strSubstring6, "substring(...)");
                        return strSubstring6;
                    default:
                        int iE5 = C2576A.E(e.f, '#', 0, 6) + 1;
                        if (iE5 == 0) {
                            return "";
                        }
                        String strSubstring7 = e.f.substring(iE5);
                        kotlin.jvm.internal.j.f(strSubstring7, "substring(...)");
                        return strSubstring7;
                }
            }
        });
    }

    public final int a() {
        int i = this.f4414b;
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : this.h.f4410b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E.class != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.j.b(this.f, ((E) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return this.f;
    }
}
