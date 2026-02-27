package androidx.room;

import Bj.InterfaceC0156n0;
import android.os.CancellationSignal;
import androidx.sqlite.db.SupportSQLiteCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class CoroutinesRoom$Companion$execute$4$1 extends k implements Function1<Throwable, Unit> {
    final /* synthetic */ CancellationSignal $cancellationSignal;
    final /* synthetic */ InterfaceC0156n0 $job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$4$1(CancellationSignal cancellationSignal, InterfaceC0156n0 interfaceC0156n0) {
        super(1);
        this.$cancellationSignal = cancellationSignal;
        this.$job = interfaceC0156n0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.f18162a;
    }

    public final void invoke(Throwable th2) {
        CancellationSignal cancellationSignal = this.$cancellationSignal;
        if (cancellationSignal != null) {
            SupportSQLiteCompat.Api16Impl.cancel(cancellationSignal);
        }
        this.$job.b(null);
    }
}
