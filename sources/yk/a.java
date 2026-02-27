package yk;

import java.util.ArrayList;
import ph.C2070f1;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile C2070f1[] f21330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2070f1 f21331b;

    static {
        new ArrayList();
        f21330a = new C2070f1[0];
        f21331b = new C2070f1();
    }

    public static void a() {
        f21331b.getClass();
        C2070f1.b();
    }

    public static void b() {
        f21331b.getClass();
        C2070f1.d();
    }

    public static void c() {
        f21331b.getClass();
        C2070f1.e();
    }

    public static void d() {
        f21331b.getClass();
        C2070f1.f();
    }

    public static void e() {
        f21331b.getClass();
        C2070f1.g();
    }

    public static void f() {
        f21331b.getClass();
        C2070f1.h();
    }

    public static C2070f1 g(String str) {
        for (C2070f1 c2070f1 : f21330a) {
            ((ThreadLocal) c2070f1.f19463b).set(str);
        }
        return f21331b;
    }

    public static void h() {
        f21331b.getClass();
        C2070f1.k();
    }
}
