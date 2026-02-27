package io.flutter.plugins.googlemobileads.nativetemplates;

import android.graphics.drawable.ColorDrawable;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class FlutterNativeTemplateTextStyle {

    @Nullable
    private final ColorDrawable backgroundColor;

    @Nullable
    private final FlutterNativeTemplateFontStyle fontStyle;

    @Nullable
    private final Double size;

    @Nullable
    private final ColorDrawable textColor;

    public FlutterNativeTemplateTextStyle(@Nullable ColorDrawable colorDrawable, @Nullable ColorDrawable colorDrawable2, @Nullable FlutterNativeTemplateFontStyle flutterNativeTemplateFontStyle, @Nullable Double d10) {
        this.textColor = colorDrawable;
        this.backgroundColor = colorDrawable2;
        this.fontStyle = flutterNativeTemplateFontStyle;
        this.size = d10;
    }

    public boolean equals(Object obj) {
        ColorDrawable colorDrawable;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterNativeTemplateTextStyle)) {
            return false;
        }
        FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle = (FlutterNativeTemplateTextStyle) obj;
        ColorDrawable colorDrawable2 = this.textColor;
        return ((colorDrawable2 == null && flutterNativeTemplateTextStyle.textColor == null) || colorDrawable2.getColor() == flutterNativeTemplateTextStyle.textColor.getColor()) && (((colorDrawable = this.backgroundColor) == null && flutterNativeTemplateTextStyle.backgroundColor == null) || colorDrawable.getColor() == flutterNativeTemplateTextStyle.backgroundColor.getColor()) && Objects.equals(this.size, flutterNativeTemplateTextStyle.size) && Objects.equals(this.fontStyle, flutterNativeTemplateTextStyle.fontStyle);
    }

    @Nullable
    public ColorDrawable getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public FlutterNativeTemplateFontStyle getFontStyle() {
        return this.fontStyle;
    }

    @Nullable
    public Float getSize() {
        Double d10 = this.size;
        if (d10 == null) {
            return null;
        }
        return Float.valueOf(d10.floatValue());
    }

    @Nullable
    public ColorDrawable getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        ColorDrawable colorDrawable = this.textColor;
        Integer numValueOf = colorDrawable == null ? null : Integer.valueOf(colorDrawable.getColor());
        ColorDrawable colorDrawable2 = this.backgroundColor;
        return Objects.hash(numValueOf, colorDrawable2 != null ? Integer.valueOf(colorDrawable2.getColor()) : null, this.size, this.fontStyle);
    }
}
