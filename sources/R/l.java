package R;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f5425b = new l(1, 0);
    public static final l c = new l(1, 1);
    public static final l e = new l(1, 2);
    public static final l f = new l(1, 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f5426g = new l(1, 4);
    public static final l h = new l(1, 5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5427a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, int i4) {
        super(i);
        this.f5427a = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f5427a) {
        }
        return Boolean.valueOf(obj instanceof String);
    }
}
