package E4;

import Bj.H;
import com.paymaya.domain.store.G;
import defpackage.Location;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Gj.c f1254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f1255b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Gj.c cVar, G g8) {
        super(2);
        this.f1254a = cVar;
        this.f1255b = g8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        H.w(this.f1254a, null, null, new a(this.f1255b, (Location) obj, (R4.a) obj2, null), 3);
        return Unit.f18162a;
    }
}
