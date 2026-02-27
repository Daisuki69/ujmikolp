package com.dynatrace.android.compose;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.Role;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
@VisibleForTesting(otherwise = 2)
public final class CallbackInteractorForTests {
    public static final int $stable = 0;
    public static final CallbackInteractorForTests INSTANCE = new CallbackInteractorForTests();

    private CallbackInteractorForTests() {
    }

    /* JADX INFO: renamed from: invokeToggleableComposeCallback-5-VjrpA, reason: not valid java name */
    public final void m171invokeToggleableComposeCallback5VjrpA(Function1<? super Boolean, Unit> onValueChanged, Role role, boolean z4) {
        j.g(onValueChanged, "onValueChanged");
        new ToggleableComposeCallback_1_7(onValueChanged, role, null).invoke(z4);
    }
}
