package bj;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: bj.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1036g extends Error {
    /* JADX WARN: Multi-variable type inference failed */
    public C1036g() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1036g(String message) {
        super(message);
        kotlin.jvm.internal.j.g(message, "message");
    }

    public /* synthetic */ C1036g(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "An operation is not implemented." : str);
    }
}
