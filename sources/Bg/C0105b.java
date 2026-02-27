package Bg;

import bj.InterfaceC1031b;
import cj.C1132s;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o1.AbstractC1955a;

/* JADX INFO: renamed from: Bg.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0105b implements Cg.a, E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0105b f513b = new C0105b(0);
    public static final C0105b c = new C0105b(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0105b f514d = new C0105b(2);
    public static final C0105b e = new C0105b(3);
    public static final C0105b f = new C0105b(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0105b f515g = new C0105b(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f516a;

    public /* synthetic */ C0105b(int i) {
        this.f516a = i;
    }

    @Override // Cg.a
    public void a(wg.c client, InterfaceC1031b interfaceC1031b) throws Qh.d {
        AbstractC1955a abstractC1955a;
        M5.d dVar;
        switch (this.f516a) {
            case 0:
                kotlin.jvm.internal.j.g(client, "client");
                client.h.f(Kg.b.i, new C0104a((Function2) interfaceC1031b, null, 0));
                return;
            case 1:
                qj.n nVar = (qj.n) interfaceC1031b;
                kotlin.jvm.internal.j.g(client, "client");
                M5.d dVar2 = new M5.d("ObservableContent", 2);
                Jg.f fVar = client.e;
                fVar.getClass();
                M5.d reference = Jg.f.j;
                kotlin.jvm.internal.j.g(reference, "reference");
                if (!fVar.e(dVar2)) {
                    int iC = fVar.c(reference);
                    if (iC == -1) {
                        throw new Qh.d("Phase " + reference + " was not registered for this pipeline");
                    }
                    int i = iC + 1;
                    ArrayList arrayList = fVar.f6110a;
                    int iF = C1132s.f(arrayList);
                    if (i <= iF) {
                        while (true) {
                            Object obj = arrayList.get(i);
                            Vg.c cVar = obj instanceof Vg.c ? (Vg.c) obj : null;
                            if (cVar != null && (abstractC1955a = cVar.f6108b) != null) {
                                Vg.g gVar = abstractC1955a instanceof Vg.g ? (Vg.g) abstractC1955a : null;
                                if (gVar != null && (dVar = gVar.c) != null && dVar.equals(reference)) {
                                    iC = i;
                                }
                                if (i != iF) {
                                    i++;
                                }
                            }
                        }
                    }
                    arrayList.add(iC + 1, new Vg.c(dVar2, new Vg.g(reference)));
                }
                fVar.f(dVar2, new C0106c(nVar, null, 0));
                return;
            case 2:
                qj.n nVar2 = (qj.n) interfaceC1031b;
                kotlin.jvm.internal.j.g(client, "client");
                M5.d dVar3 = new M5.d("BeforeReceive", 2);
                Kg.b bVar = client.f;
                bVar.getClass();
                M5.d reference2 = Kg.b.j;
                kotlin.jvm.internal.j.g(reference2, "reference");
                if (!bVar.e(dVar3)) {
                    int iC2 = bVar.c(reference2);
                    if (iC2 == -1) {
                        throw new Qh.d("Phase " + reference2 + " was not registered for this pipeline");
                    }
                    bVar.f6110a.add(iC2, new Vg.c(dVar3, new Vg.h(10)));
                }
                bVar.f(dVar3, new c0(nVar2, null, 0));
                return;
            case 3:
                kotlin.jvm.internal.j.g(client, "client");
                client.e.f(Jg.f.j, new C0106c((qj.n) interfaceC1031b, null, 1));
                return;
            case 4:
                kotlin.jvm.internal.j.g(client, "client");
                client.e.f(Jg.f.f2528g, new c0((qj.n) interfaceC1031b, null, 1));
                return;
            default:
                kotlin.jvm.internal.j.g(client, "client");
                client.e.f(Jg.f.f2528g, new c0((qj.n) interfaceC1031b, null, 2));
                return;
        }
    }

    @Override // Bg.E
    public void b(Object obj, wg.c scope) {
        switch (this.f516a) {
            case 6:
                C0112i plugin = (C0112i) obj;
                kotlin.jvm.internal.j.g(plugin, "plugin");
                kotlin.jvm.internal.j.g(scope, "scope");
                scope.e.f(Jg.f.f2528g, new C0111h(plugin, null));
                break;
            default:
                W plugin2 = (W) obj;
                kotlin.jvm.internal.j.g(plugin2, "plugin");
                kotlin.jvm.internal.j.g(scope, "scope");
                scope.e.f(Jg.f.f2529k, new V(plugin2, scope, null, 0));
                break;
        }
    }

    @Override // Bg.E
    public Object c(Function1 function1) {
        switch (this.f516a) {
            case 6:
                return new C0112i(function1);
            default:
                function1.invoke(new C0105b(7));
                return new W();
        }
    }

    @Override // Bg.E
    public Rg.a getKey() {
        switch (this.f516a) {
            case 6:
                return C0112i.c;
            default:
                return W.c;
        }
    }
}
