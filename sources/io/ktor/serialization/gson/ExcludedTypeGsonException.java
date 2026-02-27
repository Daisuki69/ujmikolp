package io.ktor.serialization.gson;

import Bj.InterfaceC0164w;
import X5.f;
import kotlin.jvm.internal.C1790e;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ExcludedTypeGsonException extends Exception implements InterfaceC0164w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1790e f17513a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExcludedTypeGsonException(C1790e type) {
        super("Type " + f.n(type).getName() + " is excluded so couldn't be used in receive");
        j.g(type, "type");
        this.f17513a = type;
    }

    @Override // Bj.InterfaceC0164w
    public final Throwable a() {
        ExcludedTypeGsonException excludedTypeGsonException = new ExcludedTypeGsonException(this.f17513a);
        excludedTypeGsonException.initCause(this);
        return excludedTypeGsonException;
    }
}
