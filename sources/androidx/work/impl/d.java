package androidx.work.impl;

import androidx.work.impl.StartStopTokens;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class d {
    static {
        StartStopTokens.Companion companion = StartStopTokens.Companion;
    }

    public static StartStopToken a(StartStopTokens startStopTokens, WorkSpec spec) {
        j.g(spec, "spec");
        return startStopTokens.remove(WorkSpecKt.generationalId(spec));
    }

    public static StartStopToken b(StartStopTokens startStopTokens, WorkSpec spec) {
        j.g(spec, "spec");
        return startStopTokens.tokenFor(WorkSpecKt.generationalId(spec));
    }

    public static StartStopTokens c() {
        return StartStopTokens.Companion.create();
    }

    public static StartStopTokens d(boolean z4) {
        return StartStopTokens.Companion.create(z4);
    }
}
