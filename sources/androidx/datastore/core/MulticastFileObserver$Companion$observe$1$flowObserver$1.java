package androidx.datastore.core;

import Bj.H;
import Dj.l;
import Dj.n;
import Dj.r;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes.dex */
public final class MulticastFileObserver$Companion$observe$1$flowObserver$1 extends k implements Function1<String, Unit> {
    final /* synthetic */ r $$this$channelFlow;
    final /* synthetic */ File $file;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MulticastFileObserver$Companion$observe$1$flowObserver$1(File file, r rVar) {
        super(1);
        this.$file = file;
        this.$$this$channelFlow = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.f18162a;
    }

    public final void invoke(String str) {
        if (j.b(str, this.$file.getName())) {
            r rVar = this.$$this$channelFlow;
            Unit unit = Unit.f18162a;
            Object objJ = rVar.j(unit);
            if (objJ instanceof Dj.k) {
                Object obj = ((l) H.x(g.f18170a, new n(rVar, unit, null))).f1194a;
            } else {
                Unit unit2 = Unit.f18162a;
            }
        }
    }
}
