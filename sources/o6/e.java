package o6;

import Ah.p;
import com.paymaya.domain.model.AccountBalance;
import java.util.List;
import kotlin.Unit;
import v5.C2342a;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Ch.f, Ch.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f18790b = new e(0);
    public static final e c = new e(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18791a;

    public /* synthetic */ e(int i) {
        this.f18791a = i;
    }

    @Override // Ch.b
    public Object a(Object obj, Object obj2) {
        kotlin.jvm.internal.j.g((C2342a) obj, "<unused var>");
        kotlin.jvm.internal.j.g((C2342a) obj2, "<unused var>");
        return Unit.f18162a;
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        switch (this.f18791a) {
            case 0:
                return p.c(new C2342a((AccountBalance) obj));
            default:
                List it = (List) obj;
                kotlin.jvm.internal.j.g(it, "it");
                return p.c(new C2342a(it));
        }
    }

    public e(n nVar) {
        this.f18791a = 2;
    }
}
