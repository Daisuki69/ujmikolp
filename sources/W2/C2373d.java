package w2;

import java.util.Date;
import java.util.HashMap;
import u2.InterfaceC2295c;
import u2.InterfaceC2297e;
import u2.InterfaceC2298f;
import v2.InterfaceC2337b;

/* JADX INFO: renamed from: w2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2373d implements InterfaceC2337b {
    public static final C2371b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2371b f20678g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f20679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f20680b;
    public final C2370a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20681d;
    public static final C2370a e = new C2370a(0);
    public static final C2372c h = new C2372c();

    /* JADX WARN: Type inference failed for: r0v1, types: [w2.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [w2.b] */
    static {
        final int i = 0;
        f = new InterfaceC2297e() { // from class: w2.b
            @Override // u2.InterfaceC2293a
            public final void encode(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((InterfaceC2298f) obj2).add((String) obj);
                        break;
                    default:
                        ((InterfaceC2298f) obj2).add(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i4 = 1;
        f20678g = new InterfaceC2297e() { // from class: w2.b
            @Override // u2.InterfaceC2293a
            public final void encode(Object obj, Object obj2) {
                switch (i4) {
                    case 0:
                        ((InterfaceC2298f) obj2).add((String) obj);
                        break;
                    default:
                        ((InterfaceC2298f) obj2).add(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public C2373d() {
        HashMap map = new HashMap();
        this.f20679a = map;
        HashMap map2 = new HashMap();
        this.f20680b = map2;
        this.c = e;
        this.f20681d = false;
        map2.put(String.class, f);
        map.remove(String.class);
        map2.put(Boolean.class, f20678g);
        map.remove(Boolean.class);
        map2.put(Date.class, h);
        map.remove(Date.class);
    }

    @Override // v2.InterfaceC2337b
    public final InterfaceC2337b registerEncoder(Class cls, InterfaceC2295c interfaceC2295c) {
        this.f20679a.put(cls, interfaceC2295c);
        this.f20680b.remove(cls);
        return this;
    }
}
