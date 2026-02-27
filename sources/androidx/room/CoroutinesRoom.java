package androidx.room;

import Bj.C0144h0;
import Bj.C0151l;
import Bj.H;
import Ej.C0233k;
import Ej.InterfaceC0230h;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import hj.h;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class CoroutinesRoom {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <R> InterfaceC0230h createFlow(RoomDatabase roomDatabase, boolean z4, String[] strArr, Callable<R> callable) {
            return new C0233k((Function2) new CoroutinesRoom$Companion$createFlow$1(z4, roomDatabase, strArr, callable, null));
        }

        public final <R> Object execute(RoomDatabase roomDatabase, boolean z4, Callable<R> callable, InterfaceC1526a<? super R> interfaceC1526a) {
            kotlin.coroutines.d transactionDispatcher;
            if (roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) interfaceC1526a.getContext().get(TransactionElement.Key);
            if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                transactionDispatcher = z4 ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            return H.C(new CoroutinesRoom$Companion$execute$2(callable, null), transactionDispatcher, interfaceC1526a);
        }

        private Companion() {
        }

        public final <R> Object execute(RoomDatabase roomDatabase, boolean z4, CancellationSignal cancellationSignal, Callable<R> callable, InterfaceC1526a<? super R> interfaceC1526a) {
            kotlin.coroutines.d transactionDispatcher;
            if (roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) interfaceC1526a.getContext().get(TransactionElement.Key);
            if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                transactionDispatcher = z4 ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            C0151l c0151l = new C0151l(1, h.b(interfaceC1526a));
            c0151l.r();
            c0151l.t(new CoroutinesRoom$Companion$execute$4$1(cancellationSignal, H.w(C0144h0.f623a, transactionDispatcher, null, new CoroutinesRoom$Companion$execute$4$job$1(callable, c0151l, null), 2)));
            Object objQ = c0151l.q();
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            return objQ;
        }
    }

    private CoroutinesRoom() {
    }

    public static final <R> InterfaceC0230h createFlow(RoomDatabase roomDatabase, boolean z4, String[] strArr, Callable<R> callable) {
        return Companion.createFlow(roomDatabase, z4, strArr, callable);
    }

    public static final <R> Object execute(RoomDatabase roomDatabase, boolean z4, CancellationSignal cancellationSignal, Callable<R> callable, InterfaceC1526a<? super R> interfaceC1526a) {
        return Companion.execute(roomDatabase, z4, cancellationSignal, callable, interfaceC1526a);
    }

    public static final <R> Object execute(RoomDatabase roomDatabase, boolean z4, Callable<R> callable, InterfaceC1526a<? super R> interfaceC1526a) {
        return Companion.execute(roomDatabase, z4, callable, interfaceC1526a);
    }
}
