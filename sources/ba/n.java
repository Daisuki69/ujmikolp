package ba;

import com.paymaya.domain.model.BillerDetails;
import com.paymaya.domain.model.FavoriteDetails;
import dOYHB6.tiZVw8.numX49;
import java.util.List;
import kotlin.Pair;
import v5.C2342a;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements Ch.c, Ch.b, Ch.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f8594a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f8595b = new n();
    public static final n c = new n();

    @Override // Ch.b
    public Object a(Object obj, Object obj2) {
        BillerDetails billerDetails = (BillerDetails) obj;
        List list = (List) obj2;
        kotlin.jvm.internal.j.g(billerDetails, numX49.tnTj78("buc2"));
        kotlin.jvm.internal.j.g(list, numX49.tnTj78("bucL"));
        return new Pair(billerDetails, list);
    }

    @Override // Ch.c
    public void accept(Object obj) {
        kotlin.jvm.internal.j.g((Throwable) obj, numX49.tnTj78("bucr"));
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        return new C2342a((FavoriteDetails) obj);
    }
}
