package b3;

import android.content.Context;
import android.os.Process;
import bj.C1034e;
import bj.InterfaceC1033d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: b3.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0864D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1033d f8382b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1033d f8383d;
    public final InterfaceC1033d e;
    public boolean f;

    public C0864D(Context appContext, k0 uuidGenerator) {
        kotlin.jvm.internal.j.g(appContext, "appContext");
        kotlin.jvm.internal.j.g(uuidGenerator, "uuidGenerator");
        this.f8381a = appContext;
        final int i = 0;
        this.f8382b = C1034e.b(new Function0(this) { // from class: b3.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0864D f8380b;

            {
                this.f8380b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((C0865E) this.f8380b.e.getValue()).f8384a;
                    default:
                        return AbstractC0900u.b(this.f8380b.f8381a);
                }
            }
        });
        this.c = Process.myPid();
        this.f8383d = C1034e.b(new W4.b(uuidGenerator, 7));
        final int i4 = 1;
        this.e = C1034e.b(new Function0(this) { // from class: b3.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0864D f8380b;

            {
                this.f8380b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return ((C0865E) this.f8380b.e.getValue()).f8384a;
                    default:
                        return AbstractC0900u.b(this.f8380b.f8381a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.f8382b.getValue();
    }

    public final Map b(Map map) {
        InterfaceC1033d interfaceC1033d = this.f8383d;
        if (map == null) {
            return cj.L.c(new Pair(a(), new C0862B(Process.myPid(), (String) interfaceC1033d.getValue())));
        }
        LinkedHashMap linkedHashMapO = cj.M.o(map);
        linkedHashMapO.put(a(), new C0862B(Process.myPid(), (String) interfaceC1033d.getValue()));
        return cj.M.m(linkedHashMapO);
    }
}
