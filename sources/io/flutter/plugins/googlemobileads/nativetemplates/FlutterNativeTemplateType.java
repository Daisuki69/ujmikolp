package io.flutter.plugins.googlemobileads.nativetemplates;

import android.util.Log;
import io.flutter.plugins.googlemobileads.R;

/* JADX INFO: loaded from: classes4.dex */
public enum FlutterNativeTemplateType {
    SMALL(R.layout.small_template_view_layout),
    MEDIUM(R.layout.medium_template_view_layout);

    private final int resourceId;

    FlutterNativeTemplateType(int i) {
        this.resourceId = i;
    }

    public static FlutterNativeTemplateType fromIntValue(int i) {
        if (i >= 0 && i < values().length) {
            return values()[i];
        }
        Log.w("NativeTemplateType", "Invalid template type index: " + i);
        return MEDIUM;
    }

    public int resourceId() {
        return this.resourceId;
    }
}
