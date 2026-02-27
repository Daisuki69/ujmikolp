package zc;

import com.paymaya.domain.model.UpdateProfileSelectionItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import zj.o;

/* JADX INFO: renamed from: zc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2556a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21369b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C2556a(int i, Object obj, Object obj2) {
        this.f21368a = i;
        this.f21369b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj = this.c;
        Object obj2 = this.f21369b;
        switch (this.f21368a) {
            case 0:
                ((b) obj2).f21371b.invoke((UpdateProfileSelectionItem) obj);
                return Unit.f18162a;
            default:
                o.a aVar = o.f21491b;
                return ((o) obj2).b((String) obj);
        }
    }
}
