package androidx.window.area;

import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
final class EmptyDecorator implements WindowAreaControllerDecorator {
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    private EmptyDecorator() {
    }

    @Override // androidx.window.area.WindowAreaControllerDecorator
    public WindowAreaController decorate(WindowAreaController controller) {
        j.g(controller, "controller");
        return controller;
    }
}
