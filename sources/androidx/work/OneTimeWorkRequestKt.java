package androidx.work;

import X5.f;
import androidx.annotation.NonNull;
import androidx.work.OneTimeWorkRequest;
import kotlin.jvm.internal.j;
import xj.InterfaceC2488d;

/* JADX INFO: loaded from: classes2.dex */
public final class OneTimeWorkRequestKt {
    public static final <W extends ListenableWorker> OneTimeWorkRequest.Builder OneTimeWorkRequestBuilder() {
        j.m();
        throw null;
    }

    public static final OneTimeWorkRequest.Builder setInputMerger(OneTimeWorkRequest.Builder builder, @NonNull InterfaceC2488d inputMerger) {
        j.g(builder, "<this>");
        j.g(inputMerger, "inputMerger");
        return builder.setInputMerger(f.n(inputMerger));
    }
}
