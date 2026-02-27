package com.google.android.material.color;

import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorRoles {
    private final int accent;
    private final int accentContainer;
    private final int onAccent;
    private final int onAccentContainer;

    public ColorRoles(@ColorInt int i, @ColorInt int i4, @ColorInt int i6, @ColorInt int i10) {
        this.accent = i;
        this.onAccent = i4;
        this.accentContainer = i6;
        this.onAccentContainer = i10;
    }

    @ColorInt
    public int getAccent() {
        return this.accent;
    }

    @ColorInt
    public int getAccentContainer() {
        return this.accentContainer;
    }

    @ColorInt
    public int getOnAccent() {
        return this.onAccent;
    }

    @ColorInt
    public int getOnAccentContainer() {
        return this.onAccentContainer;
    }
}
