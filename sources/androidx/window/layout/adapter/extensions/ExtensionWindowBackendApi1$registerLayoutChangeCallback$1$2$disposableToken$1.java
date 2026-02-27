package androidx.window.layout.adapter.extensions;

import androidx.window.extensions.layout.WindowLayoutInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class ExtensionWindowBackendApi1$registerLayoutChangeCallback$1$2$disposableToken$1 extends i implements Function1<WindowLayoutInfo, Unit> {
    public ExtensionWindowBackendApi1$registerLayoutChangeCallback$1$2$disposableToken$1(Object obj) {
        super(obj, "accept", 1, "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0, MulticastConsumer.class);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((WindowLayoutInfo) obj);
        return Unit.f18162a;
    }

    public final void invoke(WindowLayoutInfo p02) {
        j.g(p02, "p0");
        ((MulticastConsumer) this.receiver).accept(p02);
    }
}
