package A5;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f169b;

    public /* synthetic */ i(m mVar, int i) {
        this.f168a = i;
        this.f169b = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f168a) {
            case 0:
                this.f169b.f = true;
                break;
            default:
                this.f169b.h = true;
                break;
        }
        return Unit.f18162a;
    }
}
