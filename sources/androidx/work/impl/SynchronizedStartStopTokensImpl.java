package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
final class SynchronizedStartStopTokensImpl implements StartStopTokens {
    private final StartStopTokens delegate;
    private final Object lock;

    public SynchronizedStartStopTokensImpl(StartStopTokens delegate) {
        j.g(delegate, "delegate");
        this.delegate = delegate;
        this.lock = new Object();
    }

    @Override // androidx.work.impl.StartStopTokens
    public boolean contains(WorkGenerationalId id) {
        boolean zContains;
        j.g(id, "id");
        synchronized (this.lock) {
            zContains = this.delegate.contains(id);
        }
        return zContains;
    }

    @Override // androidx.work.impl.StartStopTokens
    public final /* synthetic */ StartStopToken remove(WorkSpec workSpec) {
        return d.a(this, workSpec);
    }

    @Override // androidx.work.impl.StartStopTokens
    public final /* synthetic */ StartStopToken tokenFor(WorkSpec workSpec) {
        return d.b(this, workSpec);
    }

    @Override // androidx.work.impl.StartStopTokens
    public StartStopToken remove(WorkGenerationalId id) {
        StartStopToken startStopTokenRemove;
        j.g(id, "id");
        synchronized (this.lock) {
            startStopTokenRemove = this.delegate.remove(id);
        }
        return startStopTokenRemove;
    }

    @Override // androidx.work.impl.StartStopTokens
    public StartStopToken tokenFor(WorkGenerationalId id) {
        StartStopToken startStopToken;
        j.g(id, "id");
        synchronized (this.lock) {
            startStopToken = this.delegate.tokenFor(id);
        }
        return startStopToken;
    }

    @Override // androidx.work.impl.StartStopTokens
    public List<StartStopToken> remove(String workSpecId) {
        List<StartStopToken> listRemove;
        j.g(workSpecId, "workSpecId");
        synchronized (this.lock) {
            listRemove = this.delegate.remove(workSpecId);
        }
        return listRemove;
    }
}
