package androidx.window;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
final class EmptyDecoratorWindowSdk implements WindowSdkExtensionsDecorator {
    public static final EmptyDecoratorWindowSdk INSTANCE = new EmptyDecoratorWindowSdk();

    private EmptyDecoratorWindowSdk() {
    }

    @Override // androidx.window.WindowSdkExtensionsDecorator
    public WindowSdkExtensions decorate(WindowSdkExtensions windowSdkExtensions) {
        j.g(windowSdkExtensions, "windowSdkExtensions");
        return windowSdkExtensions;
    }
}
