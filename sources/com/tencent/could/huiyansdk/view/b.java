package com.tencent.could.huiyansdk.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.dynatrace.android.callback.Callback;
import com.tencent.could.huiyansdk.R;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.fChUQ4;
import qf.d;

/* JADX INFO: loaded from: classes4.dex */
public class b extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f15785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15786b;
    public String c;

    public b(@NonNull Context context, int i) {
        super(context, i);
        a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$a$-Landroid-content-Context--V, reason: not valid java name */
    public static /* synthetic */ void m194instrumented$0$a$LandroidcontentContextV(b bVar, View view) {
        Callback.onClick_enter(view);
        try {
            bVar.a(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            fChUQ4.onUserInteraction();
        }
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
    }

    public final void a(Context context) {
        if (context == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.txy_huiyan_dialog_error_info, (ViewGroup) null);
        setContentView(viewInflate);
        this.f15785a = (TextView) viewInflate.findViewById(R.id.txy_error_msg_text);
        findViewById(R.id.txy_auth_dialog_ok_btn).setOnClickListener(new d(this, 11));
        setCanceledOnTouchOutside(false);
    }

    private /* synthetic */ void a(View view) {
        dismiss();
        CommonUtils.sendErrorAndExitAuth(this.f15786b, this.c);
    }
}
