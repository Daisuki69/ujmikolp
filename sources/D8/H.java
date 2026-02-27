package D8;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class H implements Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f1015b;

    public /* synthetic */ H(int i, Function0 function0) {
        this.f1014a = i;
        this.f1015b = function0;
    }

    @Override // Ch.a
    public final void run() {
        switch (this.f1014a) {
            case 0:
                this.f1015b.invoke();
                break;
            default:
                this.f1015b.invoke();
                break;
        }
    }
}
