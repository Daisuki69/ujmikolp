package bg;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bg.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0989b extends kotlin.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1016t f8921b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0989b(C1016t c1016t, int i) {
        super(1);
        this.f8920a = i;
        this.f8921b = c1016t;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8920a) {
            case 0:
                return String.valueOf(this.f8921b.e);
            case 1:
                return this.f8921b.c;
            case 2:
                return this.f8921b.f9125g;
            case 3:
                return String.valueOf(this.f8921b.f);
            default:
                return this.f8921b.f9124d;
        }
    }
}
