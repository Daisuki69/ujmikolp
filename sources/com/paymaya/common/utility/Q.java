package com.paymaya.common.utility;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.paymaya.common.widget.HtmlTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class Q extends BitmapDrawable implements We.K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f10430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f10431b;
    public final /* synthetic */ S c;

    public Q(S s9, Context context) {
        this.c = s9;
        this.f10431b = context;
    }

    @Override // We.K
    public final void a(Bitmap bitmap) {
        d(new BitmapDrawable(this.f10431b.getResources(), bitmap));
    }

    @Override // We.K
    public final void b(Exception exc, Drawable drawable) {
        d(drawable);
    }

    @Override // We.K
    public final void c(Drawable drawable) {
    }

    public final void d(Drawable drawable) {
        this.f10430a = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        HtmlTextView htmlTextView = this.c.f10432a;
        if (htmlTextView != null) {
            htmlTextView.setText(htmlTextView.getText());
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f10430a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }
}
