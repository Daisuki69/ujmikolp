package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityResultCallerKt {
    public static final <I, O> ActivityResultLauncher<Unit> registerForActivityResult(ActivityResultCaller activityResultCaller, ActivityResultContract<I, O> contract, I i, ActivityResultRegistry registry, Function1<O, Unit> callback) {
        j.g(activityResultCaller, "<this>");
        j.g(contract, "contract");
        j.g(registry, "registry");
        j.g(callback, "callback");
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(contract, registry, new a(0, callback)), contract, i);
    }

    public static final <I, O> ActivityResultLauncher<Unit> registerForActivityResult(ActivityResultCaller activityResultCaller, ActivityResultContract<I, O> contract, I i, Function1<O, Unit> callback) {
        j.g(activityResultCaller, "<this>");
        j.g(contract, "contract");
        j.g(callback, "callback");
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(contract, new a(1, callback)), contract, i);
    }
}
