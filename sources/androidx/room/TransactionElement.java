package androidx.room;

import androidx.annotation.RestrictTo;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class TransactionElement implements CoroutineContext.Element {
    public static final Key Key = new Key(null);
    private final AtomicInteger referenceCount = new AtomicInteger(0);
    private final kotlin.coroutines.d transactionDispatcher;

    public static final class Key implements kotlin.coroutines.f {
        public /* synthetic */ Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Key() {
        }
    }

    public TransactionElement(kotlin.coroutines.d dVar) {
        this.transactionDispatcher = dVar;
    }

    public final void acquire() {
        this.referenceCount.incrementAndGet();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r9, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) kotlin.coroutines.e.a(this, r9, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(kotlin.coroutines.f fVar) {
        return (E) kotlin.coroutines.e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public kotlin.coroutines.f getKey() {
        return Key;
    }

    public final kotlin.coroutines.d getTransactionDispatcher$room_ktx_release() {
        return this.transactionDispatcher;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.c(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.d(this, coroutineContext);
    }

    public final void release() {
        if (this.referenceCount.decrementAndGet() < 0) {
            throw new IllegalStateException("Transaction was never started or was already released.");
        }
    }
}
