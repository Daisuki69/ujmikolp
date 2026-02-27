package com.dynatrace.android.window;

import android.view.Window;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class WindowCallbackInstrumentation {
    private final List<WindowListenerFactory> factories;

    public WindowCallbackInstrumentation(List<WindowListenerFactory> list) {
        this.factories = list;
    }

    public void interceptWindowCallback(Window window) {
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new DefaultWindowCallback();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (WindowListenerFactory windowListenerFactory : this.factories) {
            OnTouchEventListener onTouchEventListenerGenerateOnTouchEventListener = windowListenerFactory.generateOnTouchEventListener(window);
            if (onTouchEventListenerGenerateOnTouchEventListener != null) {
                arrayList.add(onTouchEventListenerGenerateOnTouchEventListener);
            }
            OnKeyEventListener onKeyEventListenerGenerateOnKeyEventListener = windowListenerFactory.generateOnKeyEventListener();
            if (onKeyEventListenerGenerateOnKeyEventListener != null) {
                arrayList2.add(onKeyEventListenerGenerateOnKeyEventListener);
            }
        }
        window.setCallback(new WindowCallbackWrapper(callback, new WindowEventSegmentation(arrayList, arrayList2)));
    }
}
