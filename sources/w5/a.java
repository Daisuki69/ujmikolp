package W5;

import bi.AbstractC1029g;
import bi.EnumC1028f;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AbstractC1029g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f6306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EnumC1028f f6307b;
    public final /* synthetic */ Function0 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f6308d;

    public a(b bVar, EnumC1028f enumC1028f, Function0 function0, Function0 function02) {
        this.f6306a = bVar;
        this.f6307b = enumC1028f;
        this.c = function0;
        this.f6308d = function02;
    }

    @Override // bi.AbstractC1029g
    public final void a() {
        String str = this.f6306a.f6310b;
        this.f6307b.toString();
        yk.a.a();
        this.c.invoke();
    }

    @Override // bi.AbstractC1029g
    public final void b() {
        Function0 function0 = this.f6308d;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
