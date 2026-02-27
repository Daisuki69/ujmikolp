package com.tencent.could.huiyansdk.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.dynatrace.android.callback.Callback;
import com.tencent.could.huiyansdk.R;
import com.tencent.could.huiyansdk.api.j;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.manager.e;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.fChUQ4;

/* JADX INFO: loaded from: classes4.dex */
public class c extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f15787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Button f15788b;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            Button button = c.this.f15788b;
            if (button == null) {
                return;
            }
            if (z4) {
                button.setEnabled(true);
            } else {
                button.setEnabled(false);
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                e eVar = e.a.f15688a;
                eVar.a(1, "OcrConfirmDialog", "confirmBtn selected!");
                Context context = c.this.getContext();
                if (context != null) {
                    context.getSharedPreferences("txy_comoon_share_data", 0).edit().putBoolean("overseas_pro_confirm", true).apply();
                }
                c.this.dismiss();
                d dVar = c.this.f15787a;
                if (dVar != null) {
                    eVar.a(1, "AuthingFragment", "Have Confirm info!");
                    com.tencent.could.huiyansdk.fragments.b.this.f15648a.l();
                }
                Callback.onClick_exit();
            } catch (Throwable th2) {
                Callback.onClick_exit();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.view.c$c, reason: collision with other inner class name */
    public class ViewOnClickListenerC0087c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f15791a;

        public ViewOnClickListenerC0087c(c cVar, Context context) {
            this.f15791a = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                this.f15791a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.tencentcloud.com/document/product/1061/46725?lang=en")));
            } finally {
                Callback.onClick_exit();
            }
        }
    }

    public interface d {
    }

    public c(Context context, d dVar) {
        super(context);
        this.f15787a = dVar;
        b(context);
    }

    public final boolean a(Context context) {
        if (context == null) {
            return false;
        }
        return context.getSharedPreferences("txy_comoon_share_data", 0).getBoolean("overseas_pro_confirm", false);
    }

    public final void b(Context context) {
        setContentView(LayoutInflater.from(context).inflate(R.layout.txy_huiyan_dialog_huiyan_confirm_layout, (ViewGroup) null));
        setCanceledOnTouchOutside(false);
        Button button = (Button) findViewById(R.id.txy_ocr_dialog_confirm_button);
        this.f15788b = button;
        button.setEnabled(false);
        CheckBox checkBox = (CheckBox) findViewById(R.id.txy_ocr_dialog_confirm_checked_box);
        checkBox.setChecked(false);
        checkBox.setOnCheckedChangeListener(new a());
        this.f15788b.setOnClickListener(new b());
        TextView textView = (TextView) findViewById(R.id.txy_ocr_dialog_confirm_tv);
        HuiYanSdkConfig huiYanSdkConfigB = j.a.f15618a.b();
        if (huiYanSdkConfigB == null || huiYanSdkConfigB.getPolicyDialogResId() == -1) {
            return;
        }
        String string = context.getString(huiYanSdkConfigB.getPolicyDialogResId());
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setText(Html.fromHtml(string, 0));
        } else {
            textView.setText(Html.fromHtml(string));
        }
        textView.setOnClickListener(new ViewOnClickListenerC0087c(this, context));
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
        super.onBackPressed();
        e eVar = e.a.f15688a;
        eVar.a(1, "OcrConfirmDialog", "use cancel!");
        d dVar = this.f15787a;
        if (dVar != null) {
            eVar.a(1, "AuthingFragment", "Confirm user cancel!");
            com.tencent.could.huiyansdk.fragments.b.this.f15648a.a(true);
        }
    }
}
