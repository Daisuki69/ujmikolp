package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdpl extends FrameLayout {
    private final com.google.android.gms.ads.internal.util.zzat zza;

    public zzdpl(Context context, @NonNull View view, @NonNull com.google.android.gms.ads.internal.util.zzat zzatVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.zza = zzatVar;
    }

    public boolean __replaced_14533_6_onInterceptTouchEvent(MotionEvent motionEvent) {
        this.zza.zza(motionEvent);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return __replaced_14533_6_onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof zzcek) {
                arrayList.add((zzcek) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((zzcek) arrayList.get(i4)).destroy();
        }
    }
}
