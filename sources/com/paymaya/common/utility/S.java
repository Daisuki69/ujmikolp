package com.paymaya.common.utility;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import com.paymaya.common.widget.HtmlTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class S implements Html.ImageGetter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HtmlTextView f10432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f10433b;
    public final We.A c = We.A.d();

    public S(Context context, HtmlTextView htmlTextView) {
        this.f10433b = context;
        this.f10432a = htmlTextView;
    }

    @Override // android.text.Html.ImageGetter
    public final Drawable getDrawable(String str) {
        Q q9 = new Q(this, this.f10433b);
        this.c.h(str).d(q9);
        return q9;
    }
}
