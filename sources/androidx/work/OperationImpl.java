package androidx.work;

import S1.y;
import androidx.lifecycle.LiveData;
import androidx.work.Operation;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
final class OperationImpl implements Operation {
    private final y future;
    private final LiveData<Operation.State> state;

    public OperationImpl(LiveData<Operation.State> state, y future) {
        j.g(state, "state");
        j.g(future, "future");
        this.state = state;
        this.future = future;
    }

    @Override // androidx.work.Operation
    public y getResult() {
        return this.future;
    }

    @Override // androidx.work.Operation
    public LiveData<Operation.State> getState() {
        return this.state;
    }
}
