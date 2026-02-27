package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface StartStopTokens {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ StartStopTokens create$default(Companion companion, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                z4 = true;
            }
            return companion.create(z4);
        }

        public final StartStopTokens create() {
            return create$default(this, false, 1, null);
        }

        public final StartStopTokens create(boolean z4) {
            StartStopTokensImpl startStopTokensImpl = new StartStopTokensImpl();
            return z4 ? new SynchronizedStartStopTokensImpl(startStopTokensImpl) : startStopTokensImpl;
        }
    }

    boolean contains(WorkGenerationalId workGenerationalId);

    StartStopToken remove(WorkGenerationalId workGenerationalId);

    StartStopToken remove(WorkSpec workSpec);

    List<StartStopToken> remove(String str);

    StartStopToken tokenFor(WorkGenerationalId workGenerationalId);

    StartStopToken tokenFor(WorkSpec workSpec);
}
