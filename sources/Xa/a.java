package Xa;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Ch.c, Ch.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f6542b = new a(0);
    public static final a c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f6543d = new a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6544a;

    public /* synthetic */ a(int i) {
        this.f6544a = i;
    }

    @Override // Ch.b
    public Object a(Object obj, Object obj2) {
        List consents = (List) obj;
        List provisions = (List) obj2;
        j.g(consents, "consents");
        j.g(provisions, "provisions");
        return new Pair(consents, provisions);
    }

    @Override // Ch.c
    public void accept(Object obj) {
        switch (this.f6544a) {
            case 0:
                Throwable it = (Throwable) obj;
                j.g(it, "it");
                break;
            default:
                Throwable it2 = (Throwable) obj;
                j.g(it2, "it");
                break;
        }
    }
}
