package bg;

import M8.C0376l;
import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: bg.H0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0967H0 extends AbstractC0971J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8810b;

    public C0967H0(EnumC0973L actualValue) {
        this.f8809a = 3;
        kotlin.jvm.internal.j.h(actualValue, "actualValue");
        this.f8810b = actualValue;
    }

    @Override // bg.AbstractC0971J0
    public final float a() {
        switch (this.f8809a) {
            case 0:
                return 0.75f;
            case 1:
                return 2.0f;
            case 2:
                return 1.0f;
            default:
                return 0.5f;
        }
    }

    @Override // bg.AbstractC0971J0
    public final void b(Context context, C1005j c1005j, O4.k kVar, StringBuilder sb2) {
        switch (this.f8809a) {
            case 0:
                EnumC0973L.h.getClass();
                for (String str : EnumC0973L.f8820g.values()) {
                    if (str != null) {
                        Iterator it = ((List) this.f8810b).iterator();
                        while (it.hasNext()) {
                            AbstractC0971J0.c(c1005j, kVar, new C1005j(3, (String) it.next(), str));
                        }
                    }
                }
                break;
            case 1:
                Iterator it2 = ((List) this.f8810b).iterator();
                while (it2.hasNext()) {
                    AbstractC0971J0.c(c1005j, kVar, new C0376l((String) it2.next(), 22));
                }
                break;
            case 2:
                Iterator it3 = ((List) this.f8810b).iterator();
                while (it3.hasNext()) {
                    AbstractC0971J0.c(c1005j, kVar, new C1005j(4, (String) it3.next(), context));
                }
                break;
            default:
                AbstractC0971J0.c(c1005j, kVar, new C0376l(this, 23));
                break;
        }
    }

    public C0967H0(List expectedFiles, int i) {
        this.f8809a = i;
        switch (i) {
            case 1:
                kotlin.jvm.internal.j.h(expectedFiles, "expectedFiles");
                this.f8810b = expectedFiles;
                break;
            case 2:
                kotlin.jvm.internal.j.h(expectedFiles, "expectedPackages");
                this.f8810b = expectedFiles;
                break;
            default:
                kotlin.jvm.internal.j.h(expectedFiles, "expectedValues");
                this.f8810b = expectedFiles;
                break;
        }
    }
}
