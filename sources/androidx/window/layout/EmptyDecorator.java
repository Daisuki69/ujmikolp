package androidx.window.layout;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
final class EmptyDecorator implements WindowInfoTrackerDecorator {
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    private EmptyDecorator() {
    }

    @Override // androidx.window.layout.WindowInfoTrackerDecorator
    public WindowInfoTracker decorate(WindowInfoTracker tracker) {
        j.g(tracker, "tracker");
        return tracker;
    }
}
