package io.flutter.plugins.googlemobileads.nativetemplates;

import Y0.a;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.ads.nativetemplates.TemplateView;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class FlutterNativeTemplateStyle {

    @Nullable
    final FlutterNativeTemplateTextStyle callToActionStyle;

    @Nullable
    final ColorDrawable mainBackgroundColor;

    @Nullable
    final FlutterNativeTemplateTextStyle primaryTextStyle;

    @Nullable
    final FlutterNativeTemplateTextStyle secondaryTextStyle;

    @NonNull
    final FlutterNativeTemplateType templateType;

    @Nullable
    final FlutterNativeTemplateTextStyle tertiaryTextStyle;

    public FlutterNativeTemplateStyle(@NonNull FlutterNativeTemplateType flutterNativeTemplateType, @Nullable ColorDrawable colorDrawable, @Nullable FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle, @Nullable FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle2, @Nullable FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle3, @Nullable FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle4) {
        this.templateType = flutterNativeTemplateType;
        this.mainBackgroundColor = colorDrawable;
        this.callToActionStyle = flutterNativeTemplateTextStyle;
        this.primaryTextStyle = flutterNativeTemplateTextStyle2;
        this.secondaryTextStyle = flutterNativeTemplateTextStyle3;
        this.tertiaryTextStyle = flutterNativeTemplateTextStyle4;
    }

    public a asNativeTemplateStyle() {
        a aVar = new a();
        ColorDrawable colorDrawable = this.mainBackgroundColor;
        if (colorDrawable != null) {
            aVar.f6721q = colorDrawable;
        }
        FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle = this.callToActionStyle;
        if (flutterNativeTemplateTextStyle != null) {
            if (flutterNativeTemplateTextStyle.getBackgroundColor() != null) {
                aVar.f6714d = this.callToActionStyle.getBackgroundColor();
            }
            if (this.callToActionStyle.getTextColor() != null) {
                aVar.c = Integer.valueOf(this.callToActionStyle.getTextColor().getColor());
            }
            if (this.callToActionStyle.getFontStyle() != null) {
                aVar.f6712a = this.callToActionStyle.getFontStyle().getTypeface();
            }
            if (this.callToActionStyle.getSize() != null) {
                aVar.f6713b = this.callToActionStyle.getSize().floatValue();
            }
        }
        FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle2 = this.primaryTextStyle;
        if (flutterNativeTemplateTextStyle2 != null) {
            if (flutterNativeTemplateTextStyle2.getBackgroundColor() != null) {
                aVar.h = this.primaryTextStyle.getBackgroundColor();
            }
            if (this.primaryTextStyle.getTextColor() != null) {
                aVar.f6715g = Integer.valueOf(this.primaryTextStyle.getTextColor().getColor());
            }
            if (this.primaryTextStyle.getFontStyle() != null) {
                aVar.e = this.primaryTextStyle.getFontStyle().getTypeface();
            }
            if (this.primaryTextStyle.getSize() != null) {
                aVar.f = this.primaryTextStyle.getSize().floatValue();
            }
        }
        FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle3 = this.secondaryTextStyle;
        if (flutterNativeTemplateTextStyle3 != null) {
            if (flutterNativeTemplateTextStyle3.getBackgroundColor() != null) {
                aVar.f6717l = this.secondaryTextStyle.getBackgroundColor();
            }
            if (this.secondaryTextStyle.getTextColor() != null) {
                aVar.f6716k = Integer.valueOf(this.secondaryTextStyle.getTextColor().getColor());
            }
            if (this.secondaryTextStyle.getFontStyle() != null) {
                aVar.i = this.secondaryTextStyle.getFontStyle().getTypeface();
            }
            if (this.secondaryTextStyle.getSize() != null) {
                aVar.j = this.secondaryTextStyle.getSize().floatValue();
            }
        }
        FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle4 = this.tertiaryTextStyle;
        if (flutterNativeTemplateTextStyle4 != null) {
            if (flutterNativeTemplateTextStyle4.getBackgroundColor() != null) {
                aVar.f6720p = this.tertiaryTextStyle.getBackgroundColor();
            }
            if (this.tertiaryTextStyle.getTextColor() != null) {
                aVar.f6719o = Integer.valueOf(this.tertiaryTextStyle.getTextColor().getColor());
            }
            if (this.tertiaryTextStyle.getFontStyle() != null) {
                aVar.m = this.tertiaryTextStyle.getFontStyle().getTypeface();
            }
            if (this.tertiaryTextStyle.getSize() != null) {
                aVar.f6718n = this.tertiaryTextStyle.getSize().floatValue();
            }
        }
        return aVar;
    }

    public TemplateView asTemplateView(Context context) {
        TemplateView templateView = (TemplateView) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.templateType.resourceId(), (ViewGroup) null);
        templateView.setStyles(asNativeTemplateStyle());
        return templateView;
    }

    public boolean equals(Object obj) {
        ColorDrawable colorDrawable;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterNativeTemplateStyle)) {
            return false;
        }
        FlutterNativeTemplateStyle flutterNativeTemplateStyle = (FlutterNativeTemplateStyle) obj;
        return this.templateType == flutterNativeTemplateStyle.templateType && (((colorDrawable = this.mainBackgroundColor) == null && flutterNativeTemplateStyle.mainBackgroundColor == null) || colorDrawable.getColor() == flutterNativeTemplateStyle.mainBackgroundColor.getColor()) && Objects.equals(this.callToActionStyle, flutterNativeTemplateStyle.callToActionStyle) && Objects.equals(this.primaryTextStyle, flutterNativeTemplateStyle.primaryTextStyle) && Objects.equals(this.secondaryTextStyle, flutterNativeTemplateStyle.secondaryTextStyle) && Objects.equals(this.tertiaryTextStyle, flutterNativeTemplateStyle.tertiaryTextStyle);
    }

    @Nullable
    public FlutterNativeTemplateTextStyle getCallToActionStyle() {
        return this.callToActionStyle;
    }

    @Nullable
    public ColorDrawable getMainBackgroundColor() {
        return this.mainBackgroundColor;
    }

    @Nullable
    public FlutterNativeTemplateTextStyle getPrimaryTextStyle() {
        return this.primaryTextStyle;
    }

    @Nullable
    public FlutterNativeTemplateTextStyle getSecondaryTextStyle() {
        return this.secondaryTextStyle;
    }

    @NonNull
    public FlutterNativeTemplateType getTemplateType() {
        return this.templateType;
    }

    @Nullable
    public FlutterNativeTemplateTextStyle getTertiaryTextStyle() {
        return this.tertiaryTextStyle;
    }

    public int hashCode() {
        ColorDrawable colorDrawable = this.mainBackgroundColor;
        return Objects.hash(colorDrawable == null ? null : Integer.valueOf(colorDrawable.getColor()), this.callToActionStyle, this.primaryTextStyle, this.secondaryTextStyle, this.tertiaryTextStyle);
    }
}
