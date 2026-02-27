package androidx.datastore.core;

import Bj.InterfaceC0159q;
import gj.InterfaceC1526a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class Message<T> {

    public static final class Read<T> extends Message<T> {
        private final State<T> lastState;

        public Read(State<T> state) {
            super(null);
            this.lastState = state;
        }

        @Override // androidx.datastore.core.Message
        public State<T> getLastState() {
            return this.lastState;
        }
    }

    public static final class Update<T> extends Message<T> {
        private final InterfaceC0159q ack;
        private final CoroutineContext callerContext;
        private final State<T> lastState;
        private final Function2<T, InterfaceC1526a<? super T>, Object> transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Update(Function2<? super T, ? super InterfaceC1526a<? super T>, ? extends Object> transform, InterfaceC0159q ack, State<T> state, CoroutineContext callerContext) {
            super(null);
            j.g(transform, "transform");
            j.g(ack, "ack");
            j.g(callerContext, "callerContext");
            this.transform = transform;
            this.ack = ack;
            this.lastState = state;
            this.callerContext = callerContext;
        }

        public final InterfaceC0159q getAck() {
            return this.ack;
        }

        public final CoroutineContext getCallerContext() {
            return this.callerContext;
        }

        @Override // androidx.datastore.core.Message
        public State<T> getLastState() {
            return this.lastState;
        }

        public final Function2<T, InterfaceC1526a<? super T>, Object> getTransform() {
            return this.transform;
        }
    }

    public /* synthetic */ Message(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract State<T> getLastState();

    private Message() {
    }
}
