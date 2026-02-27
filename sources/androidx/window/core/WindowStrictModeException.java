package androidx.window.core;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class WindowStrictModeException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowStrictModeException(String message) {
        super(message);
        j.g(message, "message");
    }
}
