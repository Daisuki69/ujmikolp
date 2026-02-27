package io.ktor.client.engine.okhttp;

import Bj.InterfaceC0164w;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class UnsupportedFrameTypeException extends IllegalArgumentException implements InterfaceC0164w {
    @Override // Bj.InterfaceC0164w
    public final Throwable a() {
        j.g(null, TypedValues.AttributesType.S_FRAME);
        new UnsupportedFrameTypeException("Unsupported frame type: " + ((Object) null));
        throw null;
    }
}
