package com.tencent.could.huiyansdk.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.could.huiyansdk.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;

/* JADX INFO: loaded from: classes4.dex */
public class HudView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f15775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15776b;
    public int c;

    public HudView(Context context) {
        this(context, null);
    }

    public final void a(Context context) {
        this.f15775a = (TextView) LayoutInflater.from(context).inflate(R.layout.txy_huiyan_hud_view, this).findViewById(R.id.txy_fps_txt_view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public HudView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HudView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15776b = System.currentTimeMillis();
        this.c = 0;
        a(context);
    }
}
