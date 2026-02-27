package com.tencent.could.aicamare.util;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static float a(MotionEvent motionEvent) {
        float x6 = motionEvent.getX(0) - motionEvent.getX(1);
        float y7 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y7 * y7) + (x6 * x6));
    }
}
