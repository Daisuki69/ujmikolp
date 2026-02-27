package com.clevertap.android.sdk.inapp.fragment;

import G5.x;
import S.a;
import android.content.Context;
import android.graphics.Color;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CTInAppBasePartialNativeFragment extends CTInAppBasePartialFragment implements View.OnTouchListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public GestureDetector f9529U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public View f9530V;

    public static void v1(Button button, Button button2) {
        button2.setVisibility(8);
        button.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 2.0f));
        button2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.0f));
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        j.g(context, "context");
        super.onAttach(context);
        this.f9529U = new GestureDetector(context, new x(this, 2));
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent event) {
        j.g(event, "event");
        GestureDetector gestureDetector = this.f9529U;
        if (gestureDetector != null) {
            return gestureDetector.onTouchEvent(event) || event.getAction() == 2;
        }
        j.n("gd");
        throw null;
    }

    public final void w1(Button inAppButton, CTInAppNotificationButton cTInAppNotificationButton, int i) {
        j.g(inAppButton, "inAppButton");
        if (cTInAppNotificationButton == null) {
            inAppButton.setVisibility(8);
            return;
        }
        inAppButton.setTag(Integer.valueOf(i));
        inAppButton.setVisibility(0);
        inAppButton.setText(cTInAppNotificationButton.f9509a);
        inAppButton.setTextColor(Color.parseColor(cTInAppNotificationButton.e));
        inAppButton.setBackgroundColor(Color.parseColor(cTInAppNotificationButton.f9510b));
        inAppButton.setOnClickListener(new a(this, 0));
    }
}
