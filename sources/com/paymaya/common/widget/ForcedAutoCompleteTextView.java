package com.paymaya.common.widget;

import E8.l;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class ForcedAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f11269a;

    public ForcedAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11269a = new AtomicBoolean(false);
    }

    public final void a() {
        this.f11269a.set(true);
        super.performFiltering("", 0);
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        AtomicBoolean atomicBoolean = this.f11269a;
        if (atomicBoolean == null || !atomicBoolean.get()) {
            return super.enoughToFilter();
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.Filter.FilterListener
    public final void onFilterComplete(int i) {
        super.onFilterComplete(i);
        if (this.f11269a.compareAndSet(true, false)) {
            post(new l(this, 1));
        }
    }
}
