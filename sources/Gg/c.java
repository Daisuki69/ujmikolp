package Gg;

import Ng.m;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends xg.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(wg.c client, Function0 function0, xg.b originCall, m responseHeaders) {
        super(client);
        kotlin.jvm.internal.j.g(client, "client");
        kotlin.jvm.internal.j.g(originCall, "originCall");
        kotlin.jvm.internal.j.g(responseHeaders, "responseHeaders");
        this.f20991b = new d(this, originCall.c());
        this.c = new e(this, function0, originCall.d(), responseHeaders);
    }
}
