package com.dynatrace.agent.userinteraction.util;

import androidx.compose.ui.semantics.SemanticsModifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class UserInteractionUtilKt$getRole$$inlined$filterIsInstance$1 extends k implements Function1<Object, Boolean> {
    public static final UserInteractionUtilKt$getRole$$inlined$filterIsInstance$1 INSTANCE = new UserInteractionUtilKt$getRole$$inlined$filterIsInstance$1();

    public UserInteractionUtilKt$getRole$$inlined$filterIsInstance$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(obj instanceof SemanticsModifier);
    }
}
