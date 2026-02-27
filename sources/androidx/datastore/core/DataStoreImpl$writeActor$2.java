package androidx.datastore.core;

import Bj.InterfaceC0159q;
import Bj.r;
import androidx.datastore.core.Message;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
public final class DataStoreImpl$writeActor$2<T> extends k implements Function2<Message.Update<T>, Throwable, Unit> {
    public static final DataStoreImpl$writeActor$2 INSTANCE = new DataStoreImpl$writeActor$2();

    public DataStoreImpl$writeActor$2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Message.Update) obj, (Throwable) obj2);
        return Unit.f18162a;
    }

    public final void invoke(Message.Update<T> msg, Throwable th2) {
        j.g(msg, "msg");
        InterfaceC0159q ack = msg.getAck();
        if (th2 == null) {
            th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        ((r) ack).h0(th2);
    }
}
