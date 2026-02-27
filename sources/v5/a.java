package V5;

import W5.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f6076b;

    public /* synthetic */ a(c cVar, int i) {
        this.f6075a = i;
        this.f6076b = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6075a) {
            case 0:
                return new W5.c(this.f6076b.f6079b);
            case 1:
                this.f6076b.a(e.c);
                return Unit.f18162a;
            case 2:
                this.f6076b.a(e.f6314b);
                return Unit.f18162a;
            case 3:
                yk.a.h();
                Uh.b bVar = this.f6076b.f6081g;
                Unit unit = Unit.f18162a;
                bVar.onNext(unit);
                return unit;
            default:
                yk.a.h();
                c cVar = this.f6076b;
                Unit unit2 = Unit.f18162a;
                cVar.h.onNext(unit2);
                return unit2;
        }
    }
}
