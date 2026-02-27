package androidx.camera.core.impl;

import androidx.camera.core.DynamicRange;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class n {
    public static DynamicRange a(ImageInputConfig imageInputConfig) {
        return (DynamicRange) Preconditions.checkNotNull((DynamicRange) imageInputConfig.retrieveOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, DynamicRange.UNSPECIFIED));
    }

    public static int b(ImageInputConfig imageInputConfig) {
        return ((Integer) imageInputConfig.retrieveOption(ImageInputConfig.OPTION_INPUT_FORMAT)).intValue();
    }

    public static boolean c(ImageInputConfig imageInputConfig) {
        return imageInputConfig.containsOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE);
    }
}
