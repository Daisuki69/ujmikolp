package com.dynatrace.android.window;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class WindowEventSegmentation {
    private final List<OnKeyEventListener> keyEventListeners;
    private final List<OnTouchEventListener> touchEventListeners;

    public WindowEventSegmentation(List<OnTouchEventListener> list, List<OnKeyEventListener> list2) {
        this.touchEventListeners = Collections.unmodifiableList(list);
        this.keyEventListeners = Collections.unmodifiableList(list2);
    }

    public List<OnKeyEventListener> getKeyEventListeners() {
        return this.keyEventListeners;
    }

    public List<OnTouchEventListener> getTouchEventListeners() {
        return this.touchEventListeners;
    }
}
